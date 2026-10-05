package org.jfree.data.xy;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jfree.data.xy.XYSeries)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(594178382), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -57;
    Object v6 = new org.jfree.data.time.Hour();
    Object v7 = new org.jfree.data.time.Minute((((java.lang.Integer)v5).intValue()),((org.jfree.data.time.Hour)v6));
    Object v8 = ((org.jfree.data.xy.XYSeries)v4).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jfree.data.xy.XYSeries)v4).getItems();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 2.4601187753365497D;
    Object v6 = -28.25539374946274D;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).addOrUpdate(((java.lang.Number)v5),((java.lang.Number)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1.0D;
    Object v6 = -9.264000634045106D;
    Object v7 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = false;
    ((org.jfree.data.xy.XYSeries)v4).add(((org.jfree.data.xy.XYDataItem)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1;
    Object v6 = ((org.jfree.data.xy.XYSeries)v4).indexOf(((java.lang.Number)v5));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((org.jfree.data.general.Series)v4).fireSeriesChanged();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -57;
    Object v6 = new org.jfree.data.time.Hour();
    Object v7 = new org.jfree.data.time.Minute((((java.lang.Integer)v5).intValue()),((org.jfree.data.time.Hour)v6));
    ((org.jfree.data.general.Series)v4).setKey(((java.lang.Comparable)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    ((org.jfree.data.xy.XYSeries)v4).delete((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jfree.data.xy.XYSeries)v4).getItems();
    ((org.jfree.data.xy.XYSeries)v4).clear();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    ((org.jfree.data.general.Series)v4).setNotify((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = new org.jfree.data.xy.VectorSeriesCollection();
    Object v8 = new org.jfree.data.xy.VectorSeriesCollection();
    Object v9 = new org.jfree.data.general.SeriesChangeEvent(((java.lang.Object)v8));
    ((org.jfree.data.general.SeriesChangeListener)v7).seriesChanged(((org.jfree.data.general.SeriesChangeEvent)v9));
    Object v10 = null;
    ((org.jfree.data.general.Series)v4).addChangeListener(((org.jfree.data.general.SeriesChangeListener)v7));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 28.4961285836148D;
    Object v6 = 0;
    Object v7 = true;
    ((org.jfree.data.xy.XYSeries)v4).add((((java.lang.Double)v5).doubleValue()),((java.lang.Number)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = 27.267571871745716D;
    Object v10 = -18.143087638776308D;
    ((org.jfree.data.xy.XYSeries)v4).update(((java.lang.Number)v9),((java.lang.Number)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.jfree.data.xy.XYSeries)v7).toArray();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 1.0D;
    Object v9 = -9.264000634045106D;
    Object v10 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.jfree.data.xy.XYDataItem)v10).getXValue();
    Object v12 = true;
    ((org.jfree.data.xy.XYSeries)v7).add(((org.jfree.data.xy.XYDataItem)v10),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.jfree.data.general.Series)v7).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = 27;
    ((org.jfree.data.xy.XYSeries)v7).delete((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    ((org.jfree.data.xy.XYSeries)v7).setMaximumItemCount((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    ((org.jfree.data.xy.XYSeries)v7).clear();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = 33.46552339506196D;
    Object v10 = ((org.jfree.data.xy.XYSeries)v7).addOrUpdate(((java.lang.Number)v8),((java.lang.Number)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    ((org.jfree.data.general.Series)v7).fireSeriesChanged();
    Object v8 = null;
    Object v9 = -15.651515055373448D;
    Object v10 = 50.73240190827342D;
    Object v11 = ((org.jfree.data.xy.XYSeries)v7).addOrUpdate(((java.lang.Number)v9),((java.lang.Number)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -30;
    Object v6 = ((org.jfree.data.xy.XYSeries)v4).getX((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = 1;
    ((org.jfree.data.xy.XYSeries)v7).update(((java.lang.Number)v8),((java.lang.Number)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.jfree.data.general.Series)v7).getNotify();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -57;
    Object v9 = new org.jfree.data.time.Hour();
    Object v10 = new org.jfree.data.time.Minute((((java.lang.Integer)v8).intValue()),((org.jfree.data.time.Hour)v9));
    ((org.jfree.data.general.Series)v7).setKey(((java.lang.Comparable)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -8.093765184651431D;
    Object v9 = -6.030244018691427D;
    Object v10 = true;
    ((org.jfree.data.xy.XYSeries)v7).add(((java.lang.Number)v8),((java.lang.Number)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 26;
    Object v9 = ((org.jfree.data.xy.XYSeries)v7).getY((((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0.0D;
    Object v9 = -36.505034035587414D;
    Object v10 = false;
    ((org.jfree.data.xy.XYSeries)v7).add((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = -6.072770309847693D;
    Object v13 = 26.909692710346388D;
    ((org.jfree.data.xy.XYSeries)v7).add((((java.lang.Double)v12).doubleValue()),((java.lang.Number)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 1.0D;
    Object v9 = -9.264000634045106D;
    Object v10 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    ((org.jfree.data.xy.XYSeries)v7).add(((org.jfree.data.xy.XYDataItem)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.jfree.data.xy.XYSeries)v7).clone();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.jfree.data.general.Series)v7).clone();
    Object v9 = -57;
    Object v10 = new org.jfree.data.time.Hour();
    Object v11 = new org.jfree.data.time.Minute((((java.lang.Integer)v9).intValue()),((org.jfree.data.time.Hour)v10));
    ((org.jfree.data.general.Series)v7).setKey(((java.lang.Comparable)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    ((org.jfree.data.general.Series)v7).setNotify((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.data.xy.VectorSeriesCollection();
    Object v9 = ((org.jfree.data.xy.XYSeries)v7).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.data.xy.VectorSeriesCollection();
    ((org.jfree.data.general.Series)v7).addChangeListener(((org.jfree.data.general.SeriesChangeListener)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.jfree.data.xy.XYSeries)v7).clone();
    Object v9 = false;
    ((org.jfree.data.general.Series)v8).setNotify((((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 5;
    Object v9 = -17;
    Object v10 = ((org.jfree.data.xy.XYSeries)v7).createCopy((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 1.0D;
    Object v9 = 1.0D;
    Object v10 = ((org.jfree.data.xy.XYSeries)v7).addOrUpdate((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 5;
    Object v9 = -17;
    Object v10 = ((org.jfree.data.xy.XYSeries)v7).createCopy((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 1.0D;
    Object v12 = -9.264000634045106D;
    Object v13 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()));
    ((org.jfree.data.xy.XYSeries)v10).add(((org.jfree.data.xy.XYDataItem)v13));
    Object v14 = null;
    Object v15 = new org.jfree.data.xy.VectorSeriesCollection();
    Object v16 = new org.jfree.data.general.SeriesChangeEvent(((java.lang.Object)v15));
    Object v17 = ((org.jfree.data.xy.XYSeries)v10).equals(((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 5;
    Object v9 = -17;
    Object v10 = ((org.jfree.data.xy.XYSeries)v7).createCopy((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 1.0D;
    Object v12 = -9.264000634045106D;
    Object v13 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()));
    Object v14 = ((org.jfree.data.xy.XYDataItem)v13).hashCode();
    Object v15 = true;
    ((org.jfree.data.xy.XYSeries)v10).add(((org.jfree.data.xy.XYDataItem)v13),(((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.jfree.data.xy.XYSeries)v7).clone();
    ((org.jfree.data.general.Series)v8).fireSeriesChanged();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 5;
    Object v9 = -17;
    Object v10 = ((org.jfree.data.xy.XYSeries)v7).createCopy((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((org.jfree.data.general.Series)v10).fireSeriesChanged();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.jfree.data.xy.XYSeries)v7).clone();
    Object v9 = ((org.jfree.data.xy.XYSeries)v8).getItemCount();
    Object v10 = ((org.jfree.data.xy.XYSeries)v8).toArray();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 1.0D;
    Object v9 = -9.264000634045106D;
    Object v10 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    ((org.jfree.data.general.Series)v7).setKey(((java.lang.Comparable)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.jfree.data.xy.XYSeries)v7).clone();
    Object v9 = 0;
    ((org.jfree.data.xy.XYSeries)v8).setMaximumItemCount((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = new org.jfree.data.xy.VectorSeriesCollection();
    Object v4 = new org.jfree.data.general.SeriesChangeEvent(((java.lang.Object)v3));
    Object v5 = ((java.lang.Comparable)v2).compareTo(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 5;
    Object v9 = -17;
    Object v10 = ((org.jfree.data.xy.XYSeries)v7).createCopy((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((org.jfree.data.general.Series)v10).fireSeriesChanged();
    Object v11 = null;
    Object v12 = 33;
    Object v13 = 0;
    Object v14 = ((org.jfree.data.xy.XYSeries)v10).createCopy((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 5;
    Object v9 = -17;
    Object v10 = ((org.jfree.data.xy.XYSeries)v7).createCopy((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((org.jfree.data.general.Series)v10).fireSeriesChanged();
    Object v11 = null;
    Object v12 = 33;
    Object v13 = 0;
    Object v14 = ((org.jfree.data.xy.XYSeries)v10).createCopy((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    ((org.jfree.data.xy.XYSeries)v14).clear();
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = new org.jfree.data.xy.VectorSeriesCollection();
    Object v4 = new org.jfree.data.general.SeriesChangeEvent(((java.lang.Object)v3));
    Object v5 = ((java.lang.Comparable)v2).compareTo(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = -36.8080229568046D;
    Object v9 = ((org.jfree.data.xy.XYSeries)v7).indexOf(((java.lang.Number)v8));
    org.junit.Assert.assertEquals((Object)(-1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 22;
    ((org.jfree.data.xy.XYSeries)v7).setMaximumItemCount((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = new org.jfree.data.time.Hour();
    Object v11 = ((org.jfree.data.xy.XYSeries)v7).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 5;
    Object v9 = -17;
    Object v10 = ((org.jfree.data.xy.XYSeries)v7).createCopy((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((org.jfree.data.general.Series)v10).fireSeriesChanged();
    Object v11 = null;
    Object v12 = 33;
    Object v13 = 0;
    Object v14 = ((org.jfree.data.xy.XYSeries)v10).createCopy((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = 23;
    Object v16 = 32;
    Object v17 = ((org.jfree.data.xy.XYSeries)v14).createCopy((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.jfree.data.xy.XYSeries)v7).clone();
    Object v9 = ((org.jfree.data.xy.XYSeries)v8).clone();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 5;
    Object v9 = -17;
    Object v10 = ((org.jfree.data.xy.XYSeries)v7).createCopy((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((org.jfree.data.general.Series)v10).fireSeriesChanged();
    Object v11 = null;
    Object v12 = 33;
    Object v13 = 0;
    Object v14 = ((org.jfree.data.xy.XYSeries)v10).createCopy((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = 23;
    Object v16 = 32;
    Object v17 = ((org.jfree.data.xy.XYSeries)v14).createCopy((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = 0;
    Object v19 = 1;
    Object v20 = ((org.jfree.data.xy.XYSeries)v17).addOrUpdate(((java.lang.Number)v18),((java.lang.Number)v19));
    Object v21 = new org.jfree.data.xy.VectorSeriesCollection();
    Object v22 = ((org.jfree.data.xy.XYSeries)v17).equals(((java.lang.Object)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0.11382324131596004D;
    Object v9 = 17.561625539387936D;
    ((org.jfree.data.xy.XYSeries)v7).add((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 5;
    Object v9 = -17;
    Object v10 = ((org.jfree.data.xy.XYSeries)v7).createCopy((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((org.jfree.data.general.Series)v10).fireSeriesChanged();
    Object v11 = null;
    Object v12 = 33;
    Object v13 = 0;
    Object v14 = ((org.jfree.data.xy.XYSeries)v10).createCopy((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = 23;
    Object v16 = 32;
    Object v17 = ((org.jfree.data.xy.XYSeries)v14).createCopy((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = 0;
    ((org.jfree.data.xy.XYSeries)v17).setMaximumItemCount((((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 5;
    Object v9 = -17;
    Object v10 = ((org.jfree.data.xy.XYSeries)v7).createCopy((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((org.jfree.data.general.Series)v10).fireSeriesChanged();
    Object v11 = null;
    Object v12 = 33;
    Object v13 = 0;
    Object v14 = ((org.jfree.data.xy.XYSeries)v10).createCopy((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = 0;
    Object v16 = 0;
    ((org.jfree.data.xy.XYSeries)v14).update(((java.lang.Number)v15),((java.lang.Number)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 5;
    Object v9 = -17;
    Object v10 = ((org.jfree.data.xy.XYSeries)v7).createCopy((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 1.0D;
    Object v12 = -9.264000634045106D;
    Object v13 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()));
    Object v14 = true;
    ((org.jfree.data.xy.XYSeries)v10).add(((org.jfree.data.xy.XYDataItem)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -57;
    Object v6 = new org.jfree.data.time.Hour();
    Object v7 = new org.jfree.data.time.Minute((((java.lang.Integer)v5).intValue()),((org.jfree.data.time.Hour)v6));
    Object v8 = true;
    Object v9 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = ((org.jfree.data.xy.XYSeries)v9).createCopy((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.jfree.data.general.Series)v12).getNotify();
    ((org.jfree.data.general.Series)v4).setKey(((java.lang.Comparable)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 5;
    Object v9 = -17;
    Object v10 = ((org.jfree.data.xy.XYSeries)v7).createCopy((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((org.jfree.data.general.Series)v10).fireSeriesChanged();
    Object v11 = null;
    Object v12 = 33;
    Object v13 = 0;
    Object v14 = ((org.jfree.data.xy.XYSeries)v10).createCopy((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = 23;
    Object v16 = 32;
    Object v17 = ((org.jfree.data.xy.XYSeries)v14).createCopy((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((org.jfree.data.general.Series)v17).getKey();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((org.jfree.data.general.Series)v4).fireSeriesChanged();
    Object v5 = null;
    Object v6 = -9;
    Object v7 = 42;
    Object v8 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jfree.data.xy.XYSeries)v4).getItems();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((org.jfree.data.general.Series)v4).fireSeriesChanged();
    Object v5 = null;
    Object v6 = -9;
    Object v7 = 42;
    Object v8 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = 2.9907198213289514D;
    Object v11 = true;
    ((org.jfree.data.xy.XYSeries)v8).add(((java.lang.Number)v9),((java.lang.Number)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    ((org.jfree.data.xy.XYSeries)v8).clear();
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.jfree.data.general.Series)v7).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -5.242455880548554D;
    Object v9 = ((org.jfree.data.xy.XYSeries)v7).indexOf(((java.lang.Number)v8));
    org.junit.Assert.assertEquals((Object)(-1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.jfree.data.xy.VectorSeriesCollection();
    ((org.jfree.data.general.Series)v4).addChangeListener(((org.jfree.data.general.SeriesChangeListener)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((org.jfree.data.general.Series)v4).fireSeriesChanged();
    Object v5 = null;
    Object v6 = -9;
    Object v7 = 42;
    Object v8 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = ((org.jfree.data.xy.XYSeries)v8).remove(((java.lang.Number)v9));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = false;
    ((org.jfree.data.general.Series)v4).setNotify((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = true;
    ((org.jfree.data.general.Series)v4).setNotify((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -26;
    Object v6 = 1;
    ((org.jfree.data.xy.XYSeries)v4).updateByIndex((((java.lang.Integer)v5).intValue()),((java.lang.Number)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0.0D;
    Object v6 = 0.0D;
    Object v7 = false;
    ((org.jfree.data.xy.XYSeries)v4).add((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.jfree.data.xy.XYSeries)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(-1276964646), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jfree.data.xy.XYSeries)v4).toArray();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jfree.data.general.Series)v4).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jfree.data.xy.XYSeries)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(-1276964646), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jfree.data.general.Series)v4).clone();
    Object v6 = new org.jfree.data.xy.VectorSeriesCollection();
    ((org.jfree.data.general.Series)v4).removeChangeListener(((org.jfree.data.general.SeriesChangeListener)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 1.0D;
    Object v9 = -9.264000634045106D;
    Object v10 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = false;
    Object v12 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((org.jfree.data.xy.XYSeries)v12).toArray();
    Object v14 = ((org.jfree.data.xy.XYSeries)v7).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.jfree.data.general.Series)v7).isEmpty();
    Object v9 = ((org.jfree.data.xy.XYSeries)v7).toArray();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((org.jfree.data.general.Series)v4).fireSeriesChanged();
    Object v5 = null;
    Object v6 = -9;
    Object v7 = 42;
    Object v8 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 13;
    Object v10 = -7;
    ((org.jfree.data.xy.XYSeries)v8).delete((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((org.jfree.data.general.Series)v4).fireSeriesChanged();
    Object v5 = null;
    Object v6 = -9;
    Object v7 = 42;
    Object v8 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1.0D;
    Object v10 = -9.264000634045106D;
    Object v11 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = false;
    Object v13 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.jfree.data.general.Series)v13).isEmpty();
    ((org.jfree.data.general.Series)v8).setKey(((java.lang.Comparable)v14));
    Object v15 = null;
    Object v16 = false;
    ((org.jfree.data.general.Series)v8).setNotify((((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 1;
    Object v7 = false;
    ((org.jfree.data.xy.XYSeries)v4).add(((java.lang.Number)v5),((java.lang.Number)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jfree.data.general.Series)v4).isEmpty();
    ((org.jfree.data.general.Series)v4).fireSeriesChanged();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.jfree.data.xy.XYSeries)v7).clone();
    Object v9 = ((org.jfree.data.general.Series)v8).clone();
    Object v10 = ((org.jfree.data.general.Series)v8).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.jfree.data.xy.XYSeries)v7).getAllowDuplicateXValues();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 61;
    ((org.jfree.data.xy.XYSeries)v4).setMaximumItemCount((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.jfree.data.xy.XYSeries)v5).toArray();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "Null Z'paint' argument.";
    ((org.jfree.data.general.Series)v4).setDescription(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    ((org.jfree.data.general.Series)v7).fireSeriesChanged();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((org.jfree.data.general.Series)v4).fireSeriesChanged();
    Object v5 = null;
    Object v6 = -9;
    Object v7 = 42;
    Object v8 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    ((org.jfree.data.general.Series)v8).fireSeriesChanged();
    Object v9 = null;
    Object v10 = ((org.jfree.data.general.Series)v8).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((org.jfree.data.general.Series)v4).fireSeriesChanged();
    Object v5 = null;
    Object v6 = -9;
    Object v7 = 42;
    Object v8 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.jfree.data.general.Series)v8).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((org.jfree.data.general.Series)v4).fireSeriesChanged();
    Object v5 = null;
    Object v6 = -9;
    Object v7 = 42;
    Object v8 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1.0D;
    Object v10 = -9.264000634045106D;
    Object v11 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = false;
    ((org.jfree.data.xy.XYSeries)v8).add(((org.jfree.data.xy.XYDataItem)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    Object v14 = 43.980568473501116D;
    Object v15 = 0;
    ((org.jfree.data.xy.XYSeries)v8).add((((java.lang.Double)v14).doubleValue()),((java.lang.Number)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((org.jfree.data.general.Series)v4).fireSeriesChanged();
    Object v5 = null;
    Object v6 = -9;
    Object v7 = 42;
    Object v8 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 2.787856371327284D;
    Object v10 = ((org.jfree.data.xy.XYSeries)v8).indexOf(((java.lang.Number)v9));
    ((org.jfree.data.xy.XYSeries)v8).clear();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.jfree.data.xy.XYSeries)v7).getItems();
    Object v9 = 1.0D;
    Object v10 = -9.264000634045106D;
    Object v11 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = false;
    ((org.jfree.data.xy.XYSeries)v7).add(((org.jfree.data.xy.XYDataItem)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = ((org.jfree.data.xy.XYSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.jfree.data.xy.XYSeries)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(-1276964647), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = 0;
    ((org.jfree.data.xy.XYSeries)v7).update(((java.lang.Number)v8),((java.lang.Number)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jfree.data.general.Series)v4).getKey();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = -57;
    Object v1 = new org.jfree.data.time.Hour();
    Object v2 = new org.jfree.data.time.Minute((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Hour)v1));
    Object v3 = true;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 5;
    Object v9 = -17;
    Object v10 = ((org.jfree.data.xy.XYSeries)v7).createCopy((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    ((org.jfree.data.general.Series)v10).fireSeriesChanged();
    Object v11 = null;
    Object v12 = 33;
    Object v13 = 0;
    Object v14 = ((org.jfree.data.xy.XYSeries)v10).createCopy((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = -48;
    Object v16 = 1;
    ((org.jfree.data.xy.XYSeries)v14).delete((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((org.jfree.data.general.Series)v4).fireSeriesChanged();
    Object v5 = null;
    Object v6 = -9;
    Object v7 = 42;
    Object v8 = ((org.jfree.data.xy.XYSeries)v4).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = 0;
    ((org.jfree.data.xy.XYSeries)v8).update(((java.lang.Number)v9),((java.lang.Number)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 55.76574508718038D;
    Object v6 = 20.733004980887035D;
    ((org.jfree.data.xy.XYSeries)v4).add((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = false;
    Object v5 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = false;
    ((org.jfree.data.general.Series)v5).setNotify((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    ((org.jfree.data.general.Series)v5).fireSeriesChanged();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 1.0D;
    Object v1 = -9.264000634045106D;
    Object v2 = new org.jfree.data.xy.XYDataItem((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = false;
    Object v4 = new org.jfree.data.xy.XYSeries(((java.lang.Comparable)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((org.jfree.data.xy.XYSeries)v4).clear();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }
}
