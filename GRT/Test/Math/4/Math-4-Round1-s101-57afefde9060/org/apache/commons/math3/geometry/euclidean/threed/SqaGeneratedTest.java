package org.apache.commons.math3.geometry.euclidean.threed;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = null;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.Segment(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5),((org.apache.commons.math3.geometry.euclidean.threed.Line)v6));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Segment)v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).getNorm();
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = ((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v0).getSegments();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).distance(((org.apache.commons.math3.geometry.Vector)v8));
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    Object v3 = null;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v3),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v4));
    Object v6 = true;
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v2).intersection(((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v5),(((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    Object v3 = null;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v3),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v4));
    Object v6 = false;
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v2).intersection(((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v5),(((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v2).getSegments();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.text.NumberFormat.getInstance();
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).toString(((java.text.NumberFormat)v6));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).distanceInf(((org.apache.commons.math3.geometry.Vector)v5));
    Object v7 = 0.0D;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v9));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).hashCode();
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).subtract((((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.geometry.Vector)v6));
    Object v8 = 0.0D;
    Object v9 = 0.0D;
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v10));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).distance1(((org.apache.commons.math3.geometry.Vector)v8));
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).negate();
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).add(((org.apache.commons.math3.geometry.Vector)v5));
    Object v7 = 0.0D;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v9));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 249.45891396821352D;
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).subtract((((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.geometry.Vector)v6));
    Object v8 = 0.0D;
    Object v9 = 0.0D;
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v10));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).scalarMultiply((((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).toArray();
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = java.text.NumberFormat.getInstance();
    Object v8 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6).toString(((java.text.NumberFormat)v7));
    Object v9 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).toArray();
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 42.08126157531947D;
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).add((((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.geometry.Vector)v6));
    Object v8 = 0.0D;
    Object v9 = 0.0D;
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v10).toArray();
    Object v12 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v10));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).getAlpha();
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).getDelta();
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).getAlpha();
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -31.626826209450883D;
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).subtract((((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.geometry.Vector)v6));
    Object v8 = 0.0D;
    Object v9 = 0.0D;
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v10));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).negate();
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).distance(((org.apache.commons.math3.geometry.Vector)v5));
    Object v7 = 0.0D;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v9));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = 0.0D;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).add((((java.lang.Double)v6).doubleValue()),((org.apache.commons.math3.geometry.Vector)v9));
    Object v11 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).hashCode();
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).orthogonal();
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 2.0D;
    Object v7 = 0.0D;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).subtract((((java.lang.Double)v6).doubleValue()),((org.apache.commons.math3.geometry.Vector)v9));
    Object v11 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).distanceInf(((org.apache.commons.math3.geometry.Vector)v8));
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).add(((org.apache.commons.math3.geometry.Vector)v8));
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).orthogonal();
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -8.698875531556176D;
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).add((((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.geometry.Vector)v6));
    Object v8 = 0.0D;
    Object v9 = 0.0D;
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v10));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).toString();
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = 0.0D;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).add((((java.lang.Double)v6).doubleValue()),((org.apache.commons.math3.geometry.Vector)v9));
    Object v11 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).getNorm1();
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).negate();
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6).toArray();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = 0.0D;
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v7).distance1(((org.apache.commons.math3.geometry.Vector)v10));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).orthogonal();
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6).toString();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).distance(((org.apache.commons.math3.geometry.Vector)v5));
    Object v7 = 0.0D;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v9).toArray();
    Object v11 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v9));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).getNormInf();
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).normalize();
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).getNorm();
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).toArray();
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).toArray();
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = 0.0D;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6).distanceInf(((org.apache.commons.math3.geometry.Vector)v9));
    Object v11 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).distance1(((org.apache.commons.math3.geometry.Vector)v5));
    Object v7 = 0.0D;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v9));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.868451672955457D;
    Object v7 = 0.0D;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).add((((java.lang.Double)v6).doubleValue()),((org.apache.commons.math3.geometry.Vector)v9));
    Object v11 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).add((((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.geometry.Vector)v6));
    Object v8 = 0.0D;
    Object v9 = 0.0D;
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v10));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -3.40884349177945D;
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).subtract((((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.geometry.Vector)v6));
    Object v8 = 0.0D;
    Object v9 = 0.0D;
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v10));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = -41.77449193701679D;
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).scalarMultiply((((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).distance1(((org.apache.commons.math3.geometry.Vector)v5));
    Object v7 = 0.0D;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 0.0D;
    Object v11 = 0.0D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v9).distanceInf(((org.apache.commons.math3.geometry.Vector)v12));
    Object v14 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v9));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 15.278084649784752D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 17.417012951082015D;
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).subtract((((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.geometry.Vector)v6));
    Object v8 = 0.0D;
    Object v9 = 0.0D;
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v10));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).add((((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.geometry.Vector)v6));
    Object v8 = 0.0D;
    Object v9 = 0.0D;
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v10));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).normalize();
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6).getAlpha();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).hashCode();
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = 0.0D;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6).subtract(((org.apache.commons.math3.geometry.Vector)v9));
    Object v11 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).subtract(((org.apache.commons.math3.geometry.Vector)v5));
    Object v7 = 0.0D;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v9).getNorm();
    Object v11 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v9));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).getNormInf();
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).toString();
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).crossProduct(((org.apache.commons.math3.geometry.Vector)v8));
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -41.59062298364943D;
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).add((((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.geometry.Vector)v6));
    Object v8 = 0.0D;
    Object v9 = 0.0D;
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v10).toArray();
    Object v12 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v10));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = -26.288337330774443D;
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).scalarMultiply((((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = 0.0D;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).subtract((((java.lang.Double)v6).doubleValue()),((org.apache.commons.math3.geometry.Vector)v9));
    Object v11 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = -22.841111713077357D;
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).subtract((((java.lang.Double)v3).doubleValue()),((org.apache.commons.math3.geometry.Vector)v6));
    Object v8 = 0.0D;
    Object v9 = 0.0D;
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v10));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).getDelta();
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6).orthogonal();
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 1.0D;
    Object v7 = 0.0D;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).subtract((((java.lang.Double)v6).doubleValue()),((org.apache.commons.math3.geometry.Vector)v9));
    Object v11 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).subtract(((org.apache.commons.math3.geometry.Vector)v5));
    Object v7 = 0.0D;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = java.text.NumberFormat.getInstance();
    Object v11 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v9).toString(((java.text.NumberFormat)v10));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v9));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 0.0D;
    Object v7 = 0.0D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).subtract(((org.apache.commons.math3.geometry.Vector)v8));
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getBarycenter();
    Object v3 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getBarycenter();
    Object v3 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v3).getSegments();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getBarycenter();
    Object v3 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    Object v4 = null;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v6 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v5).getBarycenter();
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v4),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v5));
    Object v8 = true;
    Object v9 = ((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v3).intersection(((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v7),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getBarycenter();
    Object v3 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    Object v4 = null;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v4),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v5));
    Object v7 = false;
    Object v8 = ((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v3).intersection(((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v6),(((java.lang.Boolean)v7).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getBarycenter();
    Object v3 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    Object v4 = null;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v6 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v5).getBarycenter();
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v4),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v5));
    Object v8 = false;
    Object v9 = ((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v3).intersection(((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v7),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getBarycenter();
    Object v3 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    Object v4 = null;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v4),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v5));
    Object v7 = true;
    Object v8 = ((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v3).intersection(((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v6),(((java.lang.Boolean)v7).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    Object v3 = null;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).getBarycenter();
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v3),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v4));
    Object v7 = false;
    Object v8 = ((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v2).intersection(((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v6),(((java.lang.Boolean)v7).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    Object v3 = null;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).getBarycenter();
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v3),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v4));
    Object v7 = true;
    Object v8 = ((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v2).intersection(((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v6),(((java.lang.Boolean)v7).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getBoundarySize();
    Object v3 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getBoundarySize();
    Object v3 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    Object v4 = null;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v6 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v5).getBarycenter();
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v4),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v5));
    Object v8 = false;
    Object v9 = ((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v3).intersection(((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v7),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getBoundarySize();
    Object v3 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    Object v4 = null;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v6 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v5).getBoundarySize();
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v4),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v5));
    Object v8 = false;
    Object v9 = ((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v3).intersection(((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v7),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getBoundarySize();
    Object v3 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v3).getSegments();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = -21.485575410490625D;
    Object v7 = 0.0D;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).add((((java.lang.Double)v6).doubleValue()),((org.apache.commons.math3.geometry.Vector)v9));
    Object v11 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getBoundarySize();
    Object v3 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    Object v4 = null;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v6 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v5).getBarycenter();
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v4),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v5));
    Object v8 = true;
    Object v9 = ((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v3).intersection(((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v7),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getBarycenter();
    Object v3 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    Object v4 = null;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v6 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v5).getBoundarySize();
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v4),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v5));
    Object v8 = true;
    Object v9 = ((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v3).intersection(((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v7),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getBoundarySize();
    Object v3 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    Object v4 = null;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v6 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v5).getBoundarySize();
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v4),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v5));
    Object v8 = true;
    Object v9 = ((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v3).intersection(((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v7),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getBarycenter();
    Object v3 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    Object v4 = null;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v6 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v5).getBoundarySize();
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v4),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v5));
    Object v8 = false;
    Object v9 = ((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v3).intersection(((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v7),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getBoundarySize();
    Object v3 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    Object v4 = null;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v4),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v5));
    Object v7 = false;
    Object v8 = ((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v3).intersection(((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v6),(((java.lang.Boolean)v7).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    Object v3 = null;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).getBoundarySize();
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v3),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v4));
    Object v7 = true;
    Object v8 = ((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v2).intersection(((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v6),(((java.lang.Boolean)v7).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    Object v3 = null;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).getBoundarySize();
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v3),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v4));
    Object v7 = false;
    Object v8 = ((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v2).intersection(((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v6),(((java.lang.Boolean)v7).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getBoundarySize();
    Object v3 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    Object v4 = null;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v4),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v5));
    Object v7 = true;
    Object v8 = ((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v3).intersection(((org.apache.commons.math3.geometry.euclidean.threed.SubLine)v6),(((java.lang.Boolean)v7).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).crossProduct(((org.apache.commons.math3.geometry.Vector)v5));
    Object v7 = 0.0D;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v9));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).getNorm1();
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).scalarMultiply((((java.lang.Double)v3).doubleValue()));
    Object v5 = 0.0D;
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v7).getNorm1();
    Object v9 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).toString();
    Object v4 = 0.0D;
    Object v5 = 0.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = 0.0D;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6).distance1(((org.apache.commons.math3.geometry.Vector)v9));
    Object v11 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v6));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).normalize();
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = java.text.NumberFormat.getInstance();
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).toString(((java.text.NumberFormat)v3));
    Object v5 = 0.0D;
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v7));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = 2.0D;
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5).scalarMultiply((((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v5));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = 0.0D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2).subtract(((org.apache.commons.math3.geometry.Vector)v5));
    Object v7 = 0.0D;
    Object v8 = 0.0D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v2),((org.apache.commons.math3.geometry.euclidean.threed.Vector3D)v9));
      org.junit.Assert.fail("Expected org.apache.commons.math3.exception.MathIllegalArgumentException");
    } catch (org.apache.commons.math3.exception.MathIllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = null;
    Object v1 = new org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet();
    Object v2 = 5.0D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 5.0D;
    Object v6 = 0.0D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v4),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v7));
    Object v9 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v8));
    Object v10 = new org.apache.commons.math3.geometry.euclidean.threed.SubLine(((org.apache.commons.math3.geometry.euclidean.threed.Line)v0),((org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet)v1));
    org.junit.Assert.assertNotNull(v10);
  }
}
