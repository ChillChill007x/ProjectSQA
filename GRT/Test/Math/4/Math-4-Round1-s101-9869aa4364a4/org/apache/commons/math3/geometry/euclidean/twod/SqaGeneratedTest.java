package org.apache.commons.math3.geometry.euclidean.twod;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = 48.94785017358135D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v8),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5),((org.apache.commons.math3.geometry.euclidean.twod.Line)v12));
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v13));
    Object v15 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v14).getSegments();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = 48.94785017358135D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v8),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5),((org.apache.commons.math3.geometry.euclidean.twod.Line)v12));
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v13));
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = 1.0D;
    Object v19 = 48.94785017358135D;
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v20));
    Object v22 = 1.0D;
    Object v23 = 48.94785017358135D;
    Object v24 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v22).doubleValue()),(((java.lang.Double)v23).doubleValue()));
    Object v25 = 1.0D;
    Object v26 = 48.94785017358135D;
    Object v27 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v25).doubleValue()),(((java.lang.Double)v26).doubleValue()));
    Object v28 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v24),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v27));
    Object v29 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21).sameOrientationAs(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v28));
    Object v30 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v14).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.HYPER), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = 48.94785017358135D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v8),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5),((org.apache.commons.math3.geometry.euclidean.twod.Line)v12));
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v13));
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = 1.0D;
    Object v19 = 48.94785017358135D;
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
    Object v21 = 1.0D;
    Object v22 = 48.94785017358135D;
    Object v23 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v21).doubleValue()),(((java.lang.Double)v22).doubleValue()));
    Object v24 = 1.0D;
    Object v25 = 48.94785017358135D;
    Object v26 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v24).doubleValue()),(((java.lang.Double)v25).doubleValue()));
    Object v27 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v23),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v26));
    Object v28 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v20),((org.apache.commons.math3.geometry.euclidean.twod.Line)v27));
    Object v29 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v28));
    Object v30 = false;
    Object v31 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v14).intersection(((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v29),(((java.lang.Boolean)v30).booleanValue()));
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = 48.94785017358135D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v8),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5),((org.apache.commons.math3.geometry.euclidean.twod.Line)v12));
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v13));
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = 1.0D;
    Object v19 = 48.94785017358135D;
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v20));
    Object v22 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v14).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.HYPER), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = 48.94785017358135D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v8),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5),((org.apache.commons.math3.geometry.euclidean.twod.Line)v12));
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v13));
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = 1.0D;
    Object v19 = 48.94785017358135D;
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v20));
    Object v22 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21).copySelf();
    Object v23 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v24 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v23));
    Object v25 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v26 = ((org.apache.commons.math3.geometry.partitioning.Region)v24).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v25));
    Object v27 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v14).buildNew(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21),((org.apache.commons.math3.geometry.partitioning.Region)v24));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = 48.94785017358135D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v8),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5),((org.apache.commons.math3.geometry.euclidean.twod.Line)v12));
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v13));
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = 1.0D;
    Object v19 = 48.94785017358135D;
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v20));
    Object v22 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21).copySelf();
    Object v23 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v24 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v23));
    Object v25 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v26 = ((org.apache.commons.math3.geometry.partitioning.Region)v24).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v25));
    Object v27 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v14).buildNew(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21),((org.apache.commons.math3.geometry.partitioning.Region)v24));
    Object v28 = 1.0D;
    Object v29 = 48.94785017358135D;
    Object v30 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v28).doubleValue()),(((java.lang.Double)v29).doubleValue()));
    Object v31 = 1.0D;
    Object v32 = 48.94785017358135D;
    Object v33 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v31).doubleValue()),(((java.lang.Double)v32).doubleValue()));
    Object v34 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v30),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v33));
    Object v35 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v27).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v34));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.HYPER), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = 48.94785017358135D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v8),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5),((org.apache.commons.math3.geometry.euclidean.twod.Line)v12));
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v13));
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = 1.0D;
    Object v19 = 48.94785017358135D;
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v20));
    Object v22 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21).copySelf();
    Object v23 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v24 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v23));
    Object v25 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v26 = ((org.apache.commons.math3.geometry.partitioning.Region)v24).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v25));
    Object v27 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v14).buildNew(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21),((org.apache.commons.math3.geometry.partitioning.Region)v24));
    Object v28 = 1.0D;
    Object v29 = 48.94785017358135D;
    Object v30 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v28).doubleValue()),(((java.lang.Double)v29).doubleValue()));
    Object v31 = 1.0D;
    Object v32 = 48.94785017358135D;
    Object v33 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v31).doubleValue()),(((java.lang.Double)v32).doubleValue()));
    Object v34 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v30),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v33));
    Object v35 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v36 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v35));
    Object v37 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v27).buildNew(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v34),((org.apache.commons.math3.geometry.partitioning.Region)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = 48.94785017358135D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v8),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5),((org.apache.commons.math3.geometry.euclidean.twod.Line)v12));
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v13));
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = 1.0D;
    Object v19 = 48.94785017358135D;
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v20));
    Object v22 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21).copySelf();
    Object v23 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v24 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v23));
    Object v25 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v26 = ((org.apache.commons.math3.geometry.partitioning.Region)v24).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v25));
    Object v27 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v14).buildNew(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21),((org.apache.commons.math3.geometry.partitioning.Region)v24));
    Object v28 = 1.0D;
    Object v29 = 48.94785017358135D;
    Object v30 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v28).doubleValue()),(((java.lang.Double)v29).doubleValue()));
    Object v31 = 1.0D;
    Object v32 = 48.94785017358135D;
    Object v33 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v31).doubleValue()),(((java.lang.Double)v32).doubleValue()));
    Object v34 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v30),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v33));
    Object v35 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v36 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v35));
    Object v37 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v27).buildNew(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v34),((org.apache.commons.math3.geometry.partitioning.Region)v36));
    Object v38 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v37).getSize();
    Object v39 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v37).getSegments();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = 48.94785017358135D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v8),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5),((org.apache.commons.math3.geometry.euclidean.twod.Line)v12));
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v13));
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = 1.0D;
    Object v19 = 48.94785017358135D;
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v20));
    Object v22 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21).copySelf();
    Object v23 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v24 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v23));
    Object v25 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v26 = ((org.apache.commons.math3.geometry.partitioning.Region)v24).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v25));
    Object v27 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v14).buildNew(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21),((org.apache.commons.math3.geometry.partitioning.Region)v24));
    Object v28 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v27).getHyperplane();
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = 48.94785017358135D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v8),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5),((org.apache.commons.math3.geometry.euclidean.twod.Line)v12));
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v13));
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = 1.0D;
    Object v19 = 48.94785017358135D;
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v20));
    Object v22 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21).copySelf();
    Object v23 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v24 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v23));
    Object v25 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v26 = ((org.apache.commons.math3.geometry.partitioning.Region)v24).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v25));
    Object v27 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v14).buildNew(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21),((org.apache.commons.math3.geometry.partitioning.Region)v24));
    Object v28 = 1.0D;
    Object v29 = 48.94785017358135D;
    Object v30 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v28).doubleValue()),(((java.lang.Double)v29).doubleValue()));
    Object v31 = 1.0D;
    Object v32 = 48.94785017358135D;
    Object v33 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v31).doubleValue()),(((java.lang.Double)v32).doubleValue()));
    Object v34 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v30),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v33));
    Object v35 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v36 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v35));
    Object v37 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v27).buildNew(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v34),((org.apache.commons.math3.geometry.partitioning.Region)v36));
    Object v38 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v37).getHyperplane();
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = 48.94785017358135D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v8),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5),((org.apache.commons.math3.geometry.euclidean.twod.Line)v12));
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v13));
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = 1.0D;
    Object v19 = 48.94785017358135D;
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v20));
    Object v22 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21).copySelf();
    Object v23 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v24 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v23));
    Object v25 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v26 = ((org.apache.commons.math3.geometry.partitioning.Region)v24).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v25));
    Object v27 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v14).buildNew(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21),((org.apache.commons.math3.geometry.partitioning.Region)v24));
    Object v28 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v27).getSize();
    org.junit.Assert.assertEquals((Object)(0.0D), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = 48.94785017358135D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v8),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5),((org.apache.commons.math3.geometry.euclidean.twod.Line)v12));
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v13));
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = 1.0D;
    Object v19 = 48.94785017358135D;
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v20));
    Object v22 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21).copySelf();
    Object v23 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v24 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v23));
    Object v25 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v26 = ((org.apache.commons.math3.geometry.partitioning.Region)v24).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v25));
    Object v27 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v14).buildNew(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21),((org.apache.commons.math3.geometry.partitioning.Region)v24));
    Object v28 = 1.0D;
    Object v29 = 48.94785017358135D;
    Object v30 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v28).doubleValue()),(((java.lang.Double)v29).doubleValue()));
    Object v31 = 1.0D;
    Object v32 = 48.94785017358135D;
    Object v33 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v31).doubleValue()),(((java.lang.Double)v32).doubleValue()));
    Object v34 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v30),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v33));
    Object v35 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v36 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v35));
    Object v37 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v27).buildNew(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v34),((org.apache.commons.math3.geometry.partitioning.Region)v36));
    Object v38 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v37).getSegments();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = 48.94785017358135D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v8),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5),((org.apache.commons.math3.geometry.euclidean.twod.Line)v12));
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v13));
    Object v15 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v14).getSegments();
    Object v16 = 1.0D;
    Object v17 = 48.94785017358135D;
    Object v18 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v16).doubleValue()),(((java.lang.Double)v17).doubleValue()));
    Object v19 = 1.0D;
    Object v20 = 48.94785017358135D;
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v19).doubleValue()),(((java.lang.Double)v20).doubleValue()));
    Object v22 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v18),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v21));
    Object v23 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v14).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v22));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.HYPER), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = 48.94785017358135D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v8),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5),((org.apache.commons.math3.geometry.euclidean.twod.Line)v12));
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v13));
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = 1.0D;
    Object v19 = 48.94785017358135D;
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v20));
    Object v22 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21).copySelf();
    Object v23 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v24 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v23));
    Object v25 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v26 = ((org.apache.commons.math3.geometry.partitioning.Region)v24).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v25));
    Object v27 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v14).buildNew(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21),((org.apache.commons.math3.geometry.partitioning.Region)v24));
    Object v28 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v27).getHyperplane();
    Object v29 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v28).wholeHyperplane();
    Object v30 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v31 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v30));
    Object v32 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v28),((org.apache.commons.math3.geometry.partitioning.Region)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = 48.94785017358135D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v8),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5),((org.apache.commons.math3.geometry.euclidean.twod.Line)v12));
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v13));
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = 1.0D;
    Object v19 = 48.94785017358135D;
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v20));
    Object v22 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21).copySelf();
    Object v23 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v24 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v23));
    Object v25 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v26 = ((org.apache.commons.math3.geometry.partitioning.Region)v24).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v25));
    Object v27 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v14).buildNew(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21),((org.apache.commons.math3.geometry.partitioning.Region)v24));
    Object v28 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v27).getSegments();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 1.0D;
    Object v8 = 48.94785017358135D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = 1.0D;
    Object v14 = 48.94785017358135D;
    Object v15 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v13).doubleValue()),(((java.lang.Double)v14).doubleValue()));
    Object v16 = 1.0D;
    Object v17 = 48.94785017358135D;
    Object v18 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v16).doubleValue()),(((java.lang.Double)v17).doubleValue()));
    Object v19 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v15),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v18));
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v9),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12),((org.apache.commons.math3.geometry.euclidean.twod.Line)v19));
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v20));
    Object v22 = 1.0D;
    Object v23 = 48.94785017358135D;
    Object v24 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v22).doubleValue()),(((java.lang.Double)v23).doubleValue()));
    Object v25 = 1.0D;
    Object v26 = 48.94785017358135D;
    Object v27 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v25).doubleValue()),(((java.lang.Double)v26).doubleValue()));
    Object v28 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v24),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v27));
    Object v29 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v28).copySelf();
    Object v30 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v31 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v30));
    Object v32 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v33 = ((org.apache.commons.math3.geometry.partitioning.Region)v31).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v32));
    Object v34 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v21).buildNew(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v28),((org.apache.commons.math3.geometry.partitioning.Region)v31));
    Object v35 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v34).getHyperplane();
    Object v36 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v6).split(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).toArray();
    Object v4 = 1.0D;
    Object v5 = 48.94785017358135D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 1.0D;
    Object v8 = 48.94785017358135D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v9),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12));
    Object v14 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v6).split(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).negate();
    Object v4 = 1.0D;
    Object v5 = 48.94785017358135D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = 0.0D;
    Object v8 = 1.0D;
    Object v9 = 48.94785017358135D;
    Object v10 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v6).subtract((((java.lang.Double)v7).doubleValue()),((org.apache.commons.math3.geometry.Vector)v10));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v6));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).getSize();
    org.junit.Assert.assertEquals((Object)(0.0D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = 48.94785017358135D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v8),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5),((org.apache.commons.math3.geometry.euclidean.twod.Line)v12));
    Object v14 = 1.0D;
    Object v15 = 48.94785017358135D;
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = ((org.apache.commons.math3.geometry.euclidean.twod.Segment)v13).distance(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v16));
    Object v18 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v13));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).toArray();
    Object v4 = 1.0D;
    Object v5 = 48.94785017358135D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v6));
    Object v8 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v7).getSegments();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).negate();
    Object v4 = 1.0D;
    Object v5 = 48.94785017358135D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = 0.0D;
    Object v8 = 1.0D;
    Object v9 = 48.94785017358135D;
    Object v10 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v6).subtract((((java.lang.Double)v7).doubleValue()),((org.apache.commons.math3.geometry.Vector)v10));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v6));
    Object v13 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v12).isEmpty();
    Object v14 = 1.0D;
    Object v15 = 48.94785017358135D;
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = 1.0D;
    Object v18 = 48.94785017358135D;
    Object v19 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v17).doubleValue()),(((java.lang.Double)v18).doubleValue()));
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v16),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v19));
    Object v21 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v12).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v20));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.HYPER), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 1.0D;
    Object v8 = 48.94785017358135D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v9),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12));
    Object v14 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).split(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v13));
    Object v15 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).getRemainingRegion();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).toArray();
    Object v4 = 1.0D;
    Object v5 = 48.94785017358135D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v6));
    Object v8 = 1.0D;
    Object v9 = 48.94785017358135D;
    Object v10 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = 1.0D;
    Object v12 = 48.94785017358135D;
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()));
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v10),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v13));
    Object v15 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v7).split(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = 48.94785017358135D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v8),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5),((org.apache.commons.math3.geometry.euclidean.twod.Line)v12));
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v13));
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = 1.0D;
    Object v19 = 48.94785017358135D;
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v20));
    Object v22 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21).copySelf();
    Object v23 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v24 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v23));
    Object v25 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v26 = ((org.apache.commons.math3.geometry.partitioning.Region)v24).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v25));
    Object v27 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v14).buildNew(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21),((org.apache.commons.math3.geometry.partitioning.Region)v24));
    Object v28 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v27).getHyperplane();
    Object v29 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v28).wholeHyperplane();
    Object v30 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v31 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v30));
    Object v32 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v28),((org.apache.commons.math3.geometry.partitioning.Region)v31));
    Object v33 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v32).isEmpty();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 1.0D;
    Object v8 = 48.94785017358135D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v9),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12));
    Object v14 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v6).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v13));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.HYPER), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 0.0D;
    Object v8 = -6.419563301284028D;
    Object v9 = 0.0D;
    Object v10 = -45.555843545506356D;
    Object v11 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v11));
    Object v13 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = 48.94785017358135D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v8),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5),((org.apache.commons.math3.geometry.euclidean.twod.Line)v12));
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v13));
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = 1.0D;
    Object v19 = 48.94785017358135D;
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v20));
    Object v22 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21).copySelf();
    Object v23 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v24 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v23));
    Object v25 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v26 = ((org.apache.commons.math3.geometry.partitioning.Region)v24).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v25));
    Object v27 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v14).buildNew(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v21),((org.apache.commons.math3.geometry.partitioning.Region)v24));
    Object v28 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v27).getHyperplane();
    Object v29 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v28).wholeHyperplane();
    Object v30 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v31 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v30));
    Object v32 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v28),((org.apache.commons.math3.geometry.partitioning.Region)v31));
    Object v33 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v32).getSegments();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 1.0D;
    Object v8 = 48.94785017358135D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v9),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12));
    Object v14 = 0.0D;
    Object v15 = -6.419563301284028D;
    Object v16 = 0.0D;
    Object v17 = -45.555843545506356D;
    Object v18 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()),(((java.lang.Double)v17).doubleValue()));
    Object v19 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v18));
    Object v20 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v13).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v19));
    Object v21 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).reunite(((org.apache.commons.math3.geometry.partitioning.SubHyperplane)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 0.0D;
    Object v8 = -6.419563301284028D;
    Object v9 = 0.0D;
    Object v10 = -45.555843545506356D;
    Object v11 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v11));
    Object v13 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v12));
    Object v14 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v13).isEmpty();
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17).negate();
    Object v19 = 1.0D;
    Object v20 = 48.94785017358135D;
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v19).doubleValue()),(((java.lang.Double)v20).doubleValue()));
    Object v22 = 0.0D;
    Object v23 = 1.0D;
    Object v24 = 48.94785017358135D;
    Object v25 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v23).doubleValue()),(((java.lang.Double)v24).doubleValue()));
    Object v26 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v21).subtract((((java.lang.Double)v22).doubleValue()),((org.apache.commons.math3.geometry.Vector)v25));
    Object v27 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v21));
    Object v28 = true;
    Object v29 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v13).intersection(((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v27),(((java.lang.Boolean)v28).booleanValue()));
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 1.0D;
    Object v8 = 48.94785017358135D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v9),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12));
    Object v14 = 0.0D;
    Object v15 = -6.419563301284028D;
    Object v16 = 0.0D;
    Object v17 = -45.555843545506356D;
    Object v18 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()),(((java.lang.Double)v17).doubleValue()));
    Object v19 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v18));
    Object v20 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v13).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v19));
    Object v21 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).reunite(((org.apache.commons.math3.geometry.partitioning.SubHyperplane)v20));
    Object v22 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v21).copySelf();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 1.0D;
    Object v8 = 48.94785017358135D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v9),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12));
    Object v14 = 0.0D;
    Object v15 = -6.419563301284028D;
    Object v16 = 0.0D;
    Object v17 = -45.555843545506356D;
    Object v18 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()),(((java.lang.Double)v17).doubleValue()));
    Object v19 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v18));
    Object v20 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v13).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v19));
    Object v21 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).reunite(((org.apache.commons.math3.geometry.partitioning.SubHyperplane)v20));
    Object v22 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v21).getSegments();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 1.0D;
    Object v8 = 48.94785017358135D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v9),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12));
    Object v14 = 0.0D;
    Object v15 = -6.419563301284028D;
    Object v16 = 0.0D;
    Object v17 = -45.555843545506356D;
    Object v18 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()),(((java.lang.Double)v17).doubleValue()));
    Object v19 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v18));
    Object v20 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v13).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v19));
    Object v21 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).reunite(((org.apache.commons.math3.geometry.partitioning.SubHyperplane)v20));
    Object v22 = 1.0D;
    Object v23 = 48.94785017358135D;
    Object v24 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v22).doubleValue()),(((java.lang.Double)v23).doubleValue()));
    Object v25 = 1.0D;
    Object v26 = 48.94785017358135D;
    Object v27 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v25).doubleValue()),(((java.lang.Double)v26).doubleValue()));
    Object v28 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v24),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v27));
    Object v29 = 0.0D;
    Object v30 = -6.419563301284028D;
    Object v31 = 0.0D;
    Object v32 = -45.555843545506356D;
    Object v33 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v29).doubleValue()),(((java.lang.Double)v30).doubleValue()),(((java.lang.Double)v31).doubleValue()),(((java.lang.Double)v32).doubleValue()));
    Object v34 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v33));
    Object v35 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v28).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v34));
    Object v36 = true;
    Object v37 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v21).intersection(((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v35),(((java.lang.Boolean)v36).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 1.0D;
    Object v8 = 48.94785017358135D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v9),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12));
    Object v14 = 1.0D;
    Object v15 = 48.94785017358135D;
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = 1.0D;
    Object v18 = 48.94785017358135D;
    Object v19 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v17).doubleValue()),(((java.lang.Double)v18).doubleValue()));
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v16),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v19));
    Object v21 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v13).sameOrientationAs(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v20));
    Object v22 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v6).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v13));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.HYPER), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 0.0D;
    Object v8 = -6.419563301284028D;
    Object v9 = 0.0D;
    Object v10 = -45.555843545506356D;
    Object v11 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v11));
    Object v13 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v12));
    Object v14 = 1.0D;
    Object v15 = 48.94785017358135D;
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = 1.0D;
    Object v18 = 48.94785017358135D;
    Object v19 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v17).doubleValue()),(((java.lang.Double)v18).doubleValue()));
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v16),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v19));
    Object v21 = 0.0D;
    Object v22 = -6.419563301284028D;
    Object v23 = 0.0D;
    Object v24 = -45.555843545506356D;
    Object v25 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v21).doubleValue()),(((java.lang.Double)v22).doubleValue()),(((java.lang.Double)v23).doubleValue()),(((java.lang.Double)v24).doubleValue()));
    Object v26 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v25));
    Object v27 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v20).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v26));
    Object v28 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v27).copySelf();
    Object v29 = true;
    Object v30 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v13).intersection(((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v27),(((java.lang.Boolean)v29).booleanValue()));
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 0.0D;
    Object v8 = -6.419563301284028D;
    Object v9 = 0.0D;
    Object v10 = -45.555843545506356D;
    Object v11 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v11));
    Object v13 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v12));
    Object v14 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v13).copySelf();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).toArray();
    Object v4 = 1.0D;
    Object v5 = 48.94785017358135D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v6));
    Object v8 = 1.0D;
    Object v9 = 48.94785017358135D;
    Object v10 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = 1.0D;
    Object v12 = 48.94785017358135D;
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()));
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v10),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v13));
    Object v15 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v7).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v14));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.HYPER), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5).hashCode();
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = 48.94785017358135D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v8),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5),((org.apache.commons.math3.geometry.euclidean.twod.Line)v12));
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 0.0D;
    Object v8 = -6.419563301284028D;
    Object v9 = 0.0D;
    Object v10 = -45.555843545506356D;
    Object v11 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v11));
    Object v13 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v12));
    Object v14 = 1.0D;
    Object v15 = 48.94785017358135D;
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = 1.0D;
    Object v18 = 48.94785017358135D;
    Object v19 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v17).doubleValue()),(((java.lang.Double)v18).doubleValue()));
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v16),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v19));
    Object v21 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v13).split(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 0.0D;
    Object v8 = -6.419563301284028D;
    Object v9 = 0.0D;
    Object v10 = -45.555843545506356D;
    Object v11 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v11));
    Object v13 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v12));
    Object v14 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v13).copySelf();
    Object v15 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v14).getRemainingRegion();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 0.0D;
    Object v8 = -6.419563301284028D;
    Object v9 = 0.0D;
    Object v10 = -45.555843545506356D;
    Object v11 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v11));
    Object v13 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v12));
    Object v14 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v13).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 0.0D;
    Object v8 = -6.419563301284028D;
    Object v9 = 0.0D;
    Object v10 = -45.555843545506356D;
    Object v11 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v11));
    Object v13 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v12));
    Object v14 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v13).copySelf();
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = 1.0D;
    Object v19 = 48.94785017358135D;
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v20));
    Object v22 = 0.0D;
    Object v23 = -6.419563301284028D;
    Object v24 = 0.0D;
    Object v25 = -45.555843545506356D;
    Object v26 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v22).doubleValue()),(((java.lang.Double)v23).doubleValue()),(((java.lang.Double)v24).doubleValue()),(((java.lang.Double)v25).doubleValue()));
    Object v27 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v26));
    Object v28 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v21).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v27));
    Object v29 = false;
    Object v30 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v14).intersection(((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v28),(((java.lang.Boolean)v29).booleanValue()));
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 48.94785017358135D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 48.94785017358135D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v7));
    Object v9 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v8).getSegments();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v7));
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6),((org.apache.commons.math3.geometry.partitioning.Region)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 48.94785017358135D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v7));
    Object v9 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v8).getSize();
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = 1.0D;
    Object v14 = 48.94785017358135D;
    Object v15 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v13).doubleValue()),(((java.lang.Double)v14).doubleValue()));
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v15));
    Object v17 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v8).split(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v7));
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6),((org.apache.commons.math3.geometry.partitioning.Region)v8));
    Object v10 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v9).getSegments();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 48.94785017358135D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v7));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = 1.0D;
    Object v13 = 48.94785017358135D;
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v14));
    Object v16 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v8).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v15));
    Object v17 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v8).getHyperplane();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v7));
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6),((org.apache.commons.math3.geometry.partitioning.Region)v8));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = 0.0D;
    Object v14 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12).scalarMultiply((((java.lang.Double)v13).doubleValue()));
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17));
    Object v19 = 1.0D;
    Object v20 = 48.94785017358135D;
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v19).doubleValue()),(((java.lang.Double)v20).doubleValue()));
    Object v22 = 1.0D;
    Object v23 = 48.94785017358135D;
    Object v24 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v22).doubleValue()),(((java.lang.Double)v23).doubleValue()));
    Object v25 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v21),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v24));
    Object v26 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v18).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v25));
    Object v27 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v18).getHyperplane();
    Object v28 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v9).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v27));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.HYPER), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v7));
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6),((org.apache.commons.math3.geometry.partitioning.Region)v8));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = 1.0D;
    Object v14 = 48.94785017358135D;
    Object v15 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v13).doubleValue()),(((java.lang.Double)v14).doubleValue()));
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v15));
    Object v17 = 0.0D;
    Object v18 = -6.419563301284028D;
    Object v19 = 0.0D;
    Object v20 = -45.555843545506356D;
    Object v21 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v17).doubleValue()),(((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()),(((java.lang.Double)v20).doubleValue()));
    Object v22 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v21));
    Object v23 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v16).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v22));
    Object v24 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v23).copySelf();
    Object v25 = true;
    Object v26 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v9).intersection(((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v24),(((java.lang.Boolean)v25).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 1.0D;
    Object v8 = 48.94785017358135D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v9),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12));
    Object v14 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v15 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v14));
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v13),((org.apache.commons.math3.geometry.partitioning.Region)v15));
    Object v17 = 0.0D;
    Object v18 = -6.419563301284028D;
    Object v19 = 0.0D;
    Object v20 = -45.555843545506356D;
    Object v21 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v17).doubleValue()),(((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()),(((java.lang.Double)v20).doubleValue()));
    Object v22 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v21));
    Object v23 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v16).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v22));
    Object v24 = true;
    Object v25 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v6).intersection(((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v16),(((java.lang.Boolean)v24).booleanValue()));
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 0.0D;
    Object v8 = -6.419563301284028D;
    Object v9 = 0.0D;
    Object v10 = -45.555843545506356D;
    Object v11 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v11));
    Object v13 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v12));
    Object v14 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v13).getSegments();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 48.94785017358135D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v7));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = 0.0D;
    Object v13 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11).scalarMultiply((((java.lang.Double)v12).doubleValue()));
    Object v14 = 1.0D;
    Object v15 = 48.94785017358135D;
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v16));
    Object v18 = 1.0D;
    Object v19 = 48.94785017358135D;
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
    Object v21 = 1.0D;
    Object v22 = 48.94785017358135D;
    Object v23 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v21).doubleValue()),(((java.lang.Double)v22).doubleValue()));
    Object v24 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v20),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v23));
    Object v25 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v17).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v24));
    Object v26 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v17).getHyperplane();
    Object v27 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v8).split(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v7));
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6),((org.apache.commons.math3.geometry.partitioning.Region)v8));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = 1.0D;
    Object v14 = 48.94785017358135D;
    Object v15 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v13).doubleValue()),(((java.lang.Double)v14).doubleValue()));
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v15));
    Object v17 = 0.0D;
    Object v18 = -6.419563301284028D;
    Object v19 = 0.0D;
    Object v20 = -45.555843545506356D;
    Object v21 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v17).doubleValue()),(((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()),(((java.lang.Double)v20).doubleValue()));
    Object v22 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v21));
    Object v23 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v16).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v22));
    Object v24 = true;
    Object v25 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v9).intersection(((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v16),(((java.lang.Boolean)v24).booleanValue()));
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).isEmpty();
    Object v8 = 1.0D;
    Object v9 = 48.94785017358135D;
    Object v10 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = 0.0D;
    Object v12 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v10).scalarMultiply((((java.lang.Double)v11).doubleValue()));
    Object v13 = 1.0D;
    Object v14 = 48.94785017358135D;
    Object v15 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v13).doubleValue()),(((java.lang.Double)v14).doubleValue()));
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v10),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v15));
    Object v17 = 1.0D;
    Object v18 = 48.94785017358135D;
    Object v19 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v17).doubleValue()),(((java.lang.Double)v18).doubleValue()));
    Object v20 = 1.0D;
    Object v21 = 48.94785017358135D;
    Object v22 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v20).doubleValue()),(((java.lang.Double)v21).doubleValue()));
    Object v23 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v19),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v22));
    Object v24 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v16).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v23));
    Object v25 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v16).getHyperplane();
    Object v26 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v6).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v25));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.HYPER), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 0.0D;
    Object v8 = -6.419563301284028D;
    Object v9 = 0.0D;
    Object v10 = -45.555843545506356D;
    Object v11 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v11));
    Object v13 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v12));
    Object v14 = 1.0D;
    Object v15 = 48.94785017358135D;
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = 1.0D;
    Object v18 = 48.94785017358135D;
    Object v19 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v17).doubleValue()),(((java.lang.Double)v18).doubleValue()));
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v16),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v19));
    Object v21 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v22 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v21));
    Object v23 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v20),((org.apache.commons.math3.geometry.partitioning.Region)v22));
    Object v24 = true;
    Object v25 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v13).intersection(((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v23),(((java.lang.Boolean)v24).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 1.0D;
    Object v8 = 48.94785017358135D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v9),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12));
    Object v14 = 0.0D;
    Object v15 = -6.419563301284028D;
    Object v16 = 0.0D;
    Object v17 = -45.555843545506356D;
    Object v18 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()),(((java.lang.Double)v17).doubleValue()));
    Object v19 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v18));
    Object v20 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v13).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v19));
    Object v21 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).reunite(((org.apache.commons.math3.geometry.partitioning.SubHyperplane)v20));
    Object v22 = 1.0D;
    Object v23 = 48.94785017358135D;
    Object v24 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v22).doubleValue()),(((java.lang.Double)v23).doubleValue()));
    Object v25 = 0.0D;
    Object v26 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v24).scalarMultiply((((java.lang.Double)v25).doubleValue()));
    Object v27 = 1.0D;
    Object v28 = 48.94785017358135D;
    Object v29 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v27).doubleValue()),(((java.lang.Double)v28).doubleValue()));
    Object v30 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v24),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v29));
    Object v31 = true;
    Object v32 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v21).intersection(((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v30),(((java.lang.Boolean)v31).booleanValue()));
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v7));
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6),((org.apache.commons.math3.geometry.partitioning.Region)v8));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = 1.0D;
    Object v14 = 48.94785017358135D;
    Object v15 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v13).doubleValue()),(((java.lang.Double)v14).doubleValue()));
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v15));
    Object v17 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v9).split(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v7));
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6),((org.apache.commons.math3.geometry.partitioning.Region)v8));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = 1.0D;
    Object v14 = 48.94785017358135D;
    Object v15 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v13).doubleValue()),(((java.lang.Double)v14).doubleValue()));
    Object v16 = 1.0D;
    Object v17 = 48.94785017358135D;
    Object v18 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v16).doubleValue()),(((java.lang.Double)v17).doubleValue()));
    Object v19 = 1.0D;
    Object v20 = 48.94785017358135D;
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v19).doubleValue()),(((java.lang.Double)v20).doubleValue()));
    Object v22 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v18),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v21));
    Object v23 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v15),((org.apache.commons.math3.geometry.euclidean.twod.Line)v22));
    Object v24 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v23));
    Object v25 = 1.0D;
    Object v26 = 48.94785017358135D;
    Object v27 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v25).doubleValue()),(((java.lang.Double)v26).doubleValue()));
    Object v28 = 1.0D;
    Object v29 = 48.94785017358135D;
    Object v30 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v28).doubleValue()),(((java.lang.Double)v29).doubleValue()));
    Object v31 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v27),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v30));
    Object v32 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v31).copySelf();
    Object v33 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v34 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v33));
    Object v35 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v36 = ((org.apache.commons.math3.geometry.partitioning.Region)v34).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v35));
    Object v37 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v24).buildNew(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v31),((org.apache.commons.math3.geometry.partitioning.Region)v34));
    Object v38 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v37).getHyperplane();
    Object v39 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v9).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v38));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.HYPER), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 48.94785017358135D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v7));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = 0.0D;
    Object v13 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11).scalarMultiply((((java.lang.Double)v12).doubleValue()));
    Object v14 = 1.0D;
    Object v15 = 48.94785017358135D;
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v16));
    Object v18 = 1.0D;
    Object v19 = 48.94785017358135D;
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
    Object v21 = 1.0D;
    Object v22 = 48.94785017358135D;
    Object v23 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v21).doubleValue()),(((java.lang.Double)v22).doubleValue()));
    Object v24 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v20),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v23));
    Object v25 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v17).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v24));
    Object v26 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v17).getHyperplane();
    Object v27 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v8).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v26));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.HYPER), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 1.0D;
    Object v8 = 48.94785017358135D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v9),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12));
    Object v14 = 0.0D;
    Object v15 = -6.419563301284028D;
    Object v16 = 0.0D;
    Object v17 = -45.555843545506356D;
    Object v18 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()),(((java.lang.Double)v17).doubleValue()));
    Object v19 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v18));
    Object v20 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v13).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v19));
    Object v21 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).reunite(((org.apache.commons.math3.geometry.partitioning.SubHyperplane)v20));
    Object v22 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v21).copySelf();
    Object v23 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v22).getSegments();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5).hashCode();
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v8 = 1.0D;
    Object v9 = 48.94785017358135D;
    Object v10 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = 1.0D;
    Object v12 = 48.94785017358135D;
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()));
    Object v14 = 1.0D;
    Object v15 = 48.94785017358135D;
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = 1.0D;
    Object v18 = 48.94785017358135D;
    Object v19 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v17).doubleValue()),(((java.lang.Double)v18).doubleValue()));
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v16),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v19));
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v10),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v13),((org.apache.commons.math3.geometry.euclidean.twod.Line)v20));
    Object v22 = 1.0D;
    Object v23 = 48.94785017358135D;
    Object v24 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v22).doubleValue()),(((java.lang.Double)v23).doubleValue()));
    Object v25 = ((org.apache.commons.math3.geometry.euclidean.twod.Segment)v21).distance(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v24));
    Object v26 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v21));
    Object v27 = false;
    Object v28 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v7).intersection(((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v26),(((java.lang.Boolean)v27).booleanValue()));
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 48.94785017358135D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v7));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = 1.0D;
    Object v13 = 48.94785017358135D;
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v14));
    Object v16 = 0.0D;
    Object v17 = -6.419563301284028D;
    Object v18 = 0.0D;
    Object v19 = -45.555843545506356D;
    Object v20 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v16).doubleValue()),(((java.lang.Double)v17).doubleValue()),(((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
    Object v21 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v20));
    Object v22 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v15).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v21));
    Object v23 = false;
    Object v24 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v8).intersection(((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v22),(((java.lang.Boolean)v23).booleanValue()));
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 48.94785017358135D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v7));
    Object v9 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v8).getHyperplane();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 0.0D;
    Object v8 = -6.419563301284028D;
    Object v9 = 0.0D;
    Object v10 = -45.555843545506356D;
    Object v11 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v11));
    Object v13 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v12));
    Object v14 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v13).copySelf();
    Object v15 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v14).getSize();
    Object v16 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v14).getSize();
    org.junit.Assert.assertEquals((Object)(0.0D), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 48.94785017358135D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v7));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = 0.0D;
    Object v13 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11).scalarMultiply((((java.lang.Double)v12).doubleValue()));
    Object v14 = 1.0D;
    Object v15 = 48.94785017358135D;
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v16));
    Object v18 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v17).getHyperplane();
    Object v19 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v8).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v18));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.HYPER), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v7));
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6),((org.apache.commons.math3.geometry.partitioning.Region)v8));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = 0.0D;
    Object v14 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12).scalarMultiply((((java.lang.Double)v13).doubleValue()));
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17));
    Object v19 = 1.0D;
    Object v20 = 48.94785017358135D;
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v19).doubleValue()),(((java.lang.Double)v20).doubleValue()));
    Object v22 = 1.0D;
    Object v23 = 48.94785017358135D;
    Object v24 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v22).doubleValue()),(((java.lang.Double)v23).doubleValue()));
    Object v25 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v21),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v24));
    Object v26 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v18).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v25));
    Object v27 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v18).getHyperplane();
    Object v28 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v27).wholeHyperplane();
    Object v29 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v9).split(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v27));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5).toString();
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 0.0D;
    Object v8 = -6.419563301284028D;
    Object v9 = 0.0D;
    Object v10 = -45.555843545506356D;
    Object v11 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v11));
    Object v13 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v12));
    Object v14 = 1.0D;
    Object v15 = 48.94785017358135D;
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = 0.0D;
    Object v18 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v16).scalarMultiply((((java.lang.Double)v17).doubleValue()));
    Object v19 = 1.0D;
    Object v20 = 48.94785017358135D;
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v19).doubleValue()),(((java.lang.Double)v20).doubleValue()));
    Object v22 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v16),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v21));
    Object v23 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v22).getHyperplane();
    Object v24 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v13).split(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 48.94785017358135D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v7));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = 1.0D;
    Object v13 = 48.94785017358135D;
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v14));
    Object v16 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v17 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v16));
    Object v18 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v15),((org.apache.commons.math3.geometry.partitioning.Region)v17));
    Object v19 = true;
    Object v20 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v8).intersection(((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v18),(((java.lang.Boolean)v19).booleanValue()));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 1.0D;
    Object v8 = 48.94785017358135D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v9),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12));
    Object v14 = 0.0D;
    Object v15 = -6.419563301284028D;
    Object v16 = 0.0D;
    Object v17 = -45.555843545506356D;
    Object v18 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()),(((java.lang.Double)v17).doubleValue()));
    Object v19 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v18));
    Object v20 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v13).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v19));
    Object v21 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).reunite(((org.apache.commons.math3.geometry.partitioning.SubHyperplane)v20));
    Object v22 = 1.0D;
    Object v23 = 48.94785017358135D;
    Object v24 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v22).doubleValue()),(((java.lang.Double)v23).doubleValue()));
    Object v25 = 0.0D;
    Object v26 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v24).scalarMultiply((((java.lang.Double)v25).doubleValue()));
    Object v27 = 1.0D;
    Object v28 = 48.94785017358135D;
    Object v29 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v27).doubleValue()),(((java.lang.Double)v28).doubleValue()));
    Object v30 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v24),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v29));
    Object v31 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v30).getHyperplane();
    Object v32 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v21).split(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v7));
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6),((org.apache.commons.math3.geometry.partitioning.Region)v8));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = 0.0D;
    Object v14 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12).scalarMultiply((((java.lang.Double)v13).doubleValue()));
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17));
    Object v19 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v18).getHyperplane();
    Object v20 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v9).split(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 48.94785017358135D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v7));
    Object v9 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v8).getRemainingRegion();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v7));
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6),((org.apache.commons.math3.geometry.partitioning.Region)v8));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = 0.0D;
    Object v14 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12).scalarMultiply((((java.lang.Double)v13).doubleValue()));
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17));
    Object v19 = 1.0D;
    Object v20 = 48.94785017358135D;
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v19).doubleValue()),(((java.lang.Double)v20).doubleValue()));
    Object v22 = 1.0D;
    Object v23 = 48.94785017358135D;
    Object v24 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v22).doubleValue()),(((java.lang.Double)v23).doubleValue()));
    Object v25 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v21),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v24));
    Object v26 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v18).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v25));
    Object v27 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v18).getHyperplane();
    Object v28 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v9).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v27));
    Object v29 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v9).getSegments();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v7));
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6),((org.apache.commons.math3.geometry.partitioning.Region)v8));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = 0.0D;
    Object v14 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12).scalarMultiply((((java.lang.Double)v13).doubleValue()));
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17));
    Object v19 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v18).getHyperplane();
    Object v20 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v9).split(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v19));
    Object v21 = 1.0D;
    Object v22 = 48.94785017358135D;
    Object v23 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v21).doubleValue()),(((java.lang.Double)v22).doubleValue()));
    Object v24 = 0.0D;
    Object v25 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v23).scalarMultiply((((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = 48.94785017358135D;
    Object v28 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v26).doubleValue()),(((java.lang.Double)v27).doubleValue()));
    Object v29 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v23),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v28));
    Object v30 = 1.0D;
    Object v31 = 48.94785017358135D;
    Object v32 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v30).doubleValue()),(((java.lang.Double)v31).doubleValue()));
    Object v33 = 1.0D;
    Object v34 = 48.94785017358135D;
    Object v35 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v33).doubleValue()),(((java.lang.Double)v34).doubleValue()));
    Object v36 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v32),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v35));
    Object v37 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v29).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v36));
    Object v38 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v29).getHyperplane();
    Object v39 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v9).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v38));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.HYPER), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 48.94785017358135D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v7));
    Object v9 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v8).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v7));
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6),((org.apache.commons.math3.geometry.partitioning.Region)v8));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = 0.0D;
    Object v14 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12).scalarMultiply((((java.lang.Double)v13).doubleValue()));
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17));
    Object v19 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v18).getHyperplane();
    Object v20 = 1.0D;
    Object v21 = 48.94785017358135D;
    Object v22 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v20).doubleValue()),(((java.lang.Double)v21).doubleValue()));
    Object v23 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v19).getOffset(((org.apache.commons.math3.geometry.Vector)v22));
    Object v24 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v25 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v24));
    Object v26 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v9).buildNew(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v19),((org.apache.commons.math3.geometry.partitioning.Region)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).toArray();
    Object v4 = 1.0D;
    Object v5 = 48.94785017358135D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v6));
    Object v8 = 1.0D;
    Object v9 = 48.94785017358135D;
    Object v10 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = 0.0D;
    Object v12 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v10).scalarMultiply((((java.lang.Double)v11).doubleValue()));
    Object v13 = 1.0D;
    Object v14 = 48.94785017358135D;
    Object v15 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v13).doubleValue()),(((java.lang.Double)v14).doubleValue()));
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v10),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v15));
    Object v17 = true;
    Object v18 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v7).intersection(((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v16),(((java.lang.Boolean)v17).booleanValue()));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 0.0D;
    Object v8 = -6.419563301284028D;
    Object v9 = 0.0D;
    Object v10 = -45.555843545506356D;
    Object v11 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v11));
    Object v13 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v12));
    Object v14 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v13).isEmpty();
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = 0.0D;
    Object v19 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17).scalarMultiply((((java.lang.Double)v18).doubleValue()));
    Object v20 = 1.0D;
    Object v21 = 48.94785017358135D;
    Object v22 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v20).doubleValue()),(((java.lang.Double)v21).doubleValue()));
    Object v23 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v22));
    Object v24 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v23).getHyperplane();
    Object v25 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v13).split(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 48.94785017358135D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v7));
    Object v9 = 0.0D;
    Object v10 = -6.419563301284028D;
    Object v11 = 0.0D;
    Object v12 = -45.555843545506356D;
    Object v13 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()));
    Object v14 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v13));
    Object v15 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v8).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v14));
    Object v16 = 1.0D;
    Object v17 = 48.94785017358135D;
    Object v18 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v16).doubleValue()),(((java.lang.Double)v17).doubleValue()));
    Object v19 = 0.0D;
    Object v20 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v18).scalarMultiply((((java.lang.Double)v19).doubleValue()));
    Object v21 = 1.0D;
    Object v22 = 48.94785017358135D;
    Object v23 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v21).doubleValue()),(((java.lang.Double)v22).doubleValue()));
    Object v24 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v18),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v23));
    Object v25 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v24).getHyperplane();
    Object v26 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v8).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v25));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.HYPER), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 48.94785017358135D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v7));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = 0.0D;
    Object v13 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11).scalarMultiply((((java.lang.Double)v12).doubleValue()));
    Object v14 = 1.0D;
    Object v15 = 48.94785017358135D;
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v16));
    Object v18 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v17).getHyperplane();
    Object v19 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v18).wholeHyperplane();
    Object v20 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v8).split(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v18));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 48.94785017358135D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v7));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = 0.0D;
    Object v13 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11).scalarMultiply((((java.lang.Double)v12).doubleValue()));
    Object v14 = 1.0D;
    Object v15 = 48.94785017358135D;
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v16));
    Object v18 = true;
    Object v19 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v8).intersection(((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v17),(((java.lang.Boolean)v18).booleanValue()));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v7));
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6),((org.apache.commons.math3.geometry.partitioning.Region)v8));
    Object v10 = 0.0D;
    Object v11 = -6.419563301284028D;
    Object v12 = 0.0D;
    Object v13 = -45.555843545506356D;
    Object v14 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v14));
    Object v16 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v9).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v15));
    Object v17 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v9).getSegments();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v7));
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6),((org.apache.commons.math3.geometry.partitioning.Region)v8));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = 1.0D;
    Object v14 = 48.94785017358135D;
    Object v15 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v13).doubleValue()),(((java.lang.Double)v14).doubleValue()));
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v15));
    Object v17 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v18 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v17));
    Object v19 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v16),((org.apache.commons.math3.geometry.partitioning.Region)v18));
    Object v20 = 1.0D;
    Object v21 = 48.94785017358135D;
    Object v22 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v20).doubleValue()),(((java.lang.Double)v21).doubleValue()));
    Object v23 = 0.0D;
    Object v24 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v22).scalarMultiply((((java.lang.Double)v23).doubleValue()));
    Object v25 = 1.0D;
    Object v26 = 48.94785017358135D;
    Object v27 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v25).doubleValue()),(((java.lang.Double)v26).doubleValue()));
    Object v28 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v22),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v27));
    Object v29 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v28).getHyperplane();
    Object v30 = 1.0D;
    Object v31 = 48.94785017358135D;
    Object v32 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v30).doubleValue()),(((java.lang.Double)v31).doubleValue()));
    Object v33 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v29).getOffset(((org.apache.commons.math3.geometry.Vector)v32));
    Object v34 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v35 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v34));
    Object v36 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v19).buildNew(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v29),((org.apache.commons.math3.geometry.partitioning.Region)v35));
    Object v37 = false;
    Object v38 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v9).intersection(((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v36),(((java.lang.Boolean)v37).booleanValue()));
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v7));
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6),((org.apache.commons.math3.geometry.partitioning.Region)v8));
    Object v10 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v9).copySelf();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 48.94785017358135D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v7));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = 1.0D;
    Object v13 = 48.94785017358135D;
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v14));
    Object v16 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v8).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v15));
    Object v17 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v8).getHyperplane();
    Object v18 = 1.0D;
    Object v19 = 48.94785017358135D;
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
    Object v21 = 0.0D;
    Object v22 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v20).scalarMultiply((((java.lang.Double)v21).doubleValue()));
    Object v23 = 1.0D;
    Object v24 = 48.94785017358135D;
    Object v25 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v23).doubleValue()),(((java.lang.Double)v24).doubleValue()));
    Object v26 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v20),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v25));
    Object v27 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v26).getRemainingRegion();
    Object v28 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v17),((org.apache.commons.math3.geometry.partitioning.Region)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 48.94785017358135D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v7));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = 0.0D;
    Object v13 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11).scalarMultiply((((java.lang.Double)v12).doubleValue()));
    Object v14 = 1.0D;
    Object v15 = 48.94785017358135D;
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v16));
    Object v18 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v17).getHyperplane();
    Object v19 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v20 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v19));
    Object v21 = ((org.apache.commons.math3.geometry.partitioning.Region)v20).getSize();
    Object v22 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v8).buildNew(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v18),((org.apache.commons.math3.geometry.partitioning.Region)v20));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 48.94785017358135D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v7));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = 1.0D;
    Object v13 = 48.94785017358135D;
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v14));
    Object v16 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v8).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v15));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.HYPER), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v7));
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6),((org.apache.commons.math3.geometry.partitioning.Region)v8));
    Object v10 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v9).copySelf();
    Object v11 = 1.0D;
    Object v12 = 48.94785017358135D;
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()));
    Object v14 = 0.0D;
    Object v15 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v13).scalarMultiply((((java.lang.Double)v14).doubleValue()));
    Object v16 = 1.0D;
    Object v17 = 48.94785017358135D;
    Object v18 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v16).doubleValue()),(((java.lang.Double)v17).doubleValue()));
    Object v19 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v13),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v18));
    Object v20 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v19).getHyperplane();
    Object v21 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v10).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v20));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.HYPER), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v7));
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6),((org.apache.commons.math3.geometry.partitioning.Region)v8));
    Object v10 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v9).copySelf();
    Object v11 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v10).getHyperplane();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 48.94785017358135D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v7));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = 0.0D;
    Object v13 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11).scalarMultiply((((java.lang.Double)v12).doubleValue()));
    Object v14 = 1.0D;
    Object v15 = 48.94785017358135D;
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v16));
    Object v18 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v17).getHyperplane();
    Object v19 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v8).split(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 48.94785017358135D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v7));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = 1.0D;
    Object v13 = 48.94785017358135D;
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v14));
    Object v16 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v17 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v16));
    Object v18 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v15),((org.apache.commons.math3.geometry.partitioning.Region)v17));
    Object v19 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v18).copySelf();
    Object v20 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v19).getHyperplane();
    Object v21 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v8).split(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v7));
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6),((org.apache.commons.math3.geometry.partitioning.Region)v8));
    Object v10 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v9).copySelf();
    Object v11 = 1.0D;
    Object v12 = 48.94785017358135D;
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()));
    Object v14 = 1.0D;
    Object v15 = 48.94785017358135D;
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v13),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v16));
    Object v18 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v19 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v18));
    Object v20 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v17),((org.apache.commons.math3.geometry.partitioning.Region)v19));
    Object v21 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v20).copySelf();
    Object v22 = true;
    Object v23 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v10).intersection(((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v21),(((java.lang.Boolean)v22).booleanValue()));
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = 0.0D;
    Object v8 = -6.419563301284028D;
    Object v9 = 0.0D;
    Object v10 = -45.555843545506356D;
    Object v11 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v11));
    Object v13 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v6).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v12));
    Object v14 = 1.0D;
    Object v15 = 48.94785017358135D;
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = 0.0D;
    Object v18 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v16).scalarMultiply((((java.lang.Double)v17).doubleValue()));
    Object v19 = 1.0D;
    Object v20 = 48.94785017358135D;
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v19).doubleValue()),(((java.lang.Double)v20).doubleValue()));
    Object v22 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v16),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v21));
    Object v23 = 1.0D;
    Object v24 = 48.94785017358135D;
    Object v25 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v23).doubleValue()),(((java.lang.Double)v24).doubleValue()));
    Object v26 = 1.0D;
    Object v27 = 48.94785017358135D;
    Object v28 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v26).doubleValue()),(((java.lang.Double)v27).doubleValue()));
    Object v29 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v25),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v28));
    Object v30 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v22).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v29));
    Object v31 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v22).getHyperplane();
    Object v32 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v13).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v31));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.PLUS), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 48.94785017358135D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v7));
    Object v9 = 1.0D;
    Object v10 = 48.94785017358135D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = 0.0D;
    Object v13 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11).scalarMultiply((((java.lang.Double)v12).doubleValue()));
    Object v14 = 1.0D;
    Object v15 = 48.94785017358135D;
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v16));
    Object v18 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v17).getHyperplane();
    Object v19 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v20 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v19));
    Object v21 = ((org.apache.commons.math3.geometry.partitioning.Region)v20).getSize();
    Object v22 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v8).buildNew(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v18),((org.apache.commons.math3.geometry.partitioning.Region)v20));
    Object v23 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v22).getRemainingRegion();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v7));
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6),((org.apache.commons.math3.geometry.partitioning.Region)v8));
    Object v10 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v9).copySelf();
    Object v11 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v10).getSegments();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = 48.94785017358135D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 48.94785017358135D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v2),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v5));
    Object v7 = new org.apache.commons.math3.geometry.partitioning.BSPTree();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v7));
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6),((org.apache.commons.math3.geometry.partitioning.Region)v8));
    Object v10 = 1.0D;
    Object v11 = 48.94785017358135D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = 0.0D;
    Object v14 = ((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12).scalarMultiply((((java.lang.Double)v13).doubleValue()));
    Object v15 = 1.0D;
    Object v16 = 48.94785017358135D;
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v17));
    Object v19 = 1.0D;
    Object v20 = 48.94785017358135D;
    Object v21 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v19).doubleValue()),(((java.lang.Double)v20).doubleValue()));
    Object v22 = 1.0D;
    Object v23 = 48.94785017358135D;
    Object v24 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v22).doubleValue()),(((java.lang.Double)v23).doubleValue()));
    Object v25 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v21),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v24));
    Object v26 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v18).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v25));
    Object v27 = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane)v18).getHyperplane();
    Object v28 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v27).copySelf();
    Object v29 = ((org.apache.commons.math3.geometry.euclidean.twod.SubLine)v9).split(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v27));
    org.junit.Assert.assertNotNull(v29);
  }
}
