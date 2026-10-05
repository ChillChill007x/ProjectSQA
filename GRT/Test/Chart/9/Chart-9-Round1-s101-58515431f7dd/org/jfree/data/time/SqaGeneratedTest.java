package org.jfree.data.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).getTimePeriodsUniqueToOtherSeries(((org.jfree.data.time.TimeSeries)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = new org.jfree.data.time.Minute();
    Object v6 = 27.794771631418303D;
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addOrUpdate(((org.jfree.data.time.RegularTimePeriod)v5),((java.lang.Number)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Minute();
    Object v3 = ((org.jfree.data.time.TimeSeries)v1).getIndex(((org.jfree.data.time.RegularTimePeriod)v2));
    Object v4 = true;
    ((org.jfree.data.time.TimeSeries)v1).removeAgedItems((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    ((org.jfree.data.general.Series)v1).fireSeriesChanged();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Minute();
    Object v3 = 6.423704490073212D;
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addOrUpdate(((org.jfree.data.time.RegularTimePeriod)v2),((java.lang.Number)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    ((org.jfree.data.time.TimeSeries)v1).clear();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = 0L;
    Object v3 = true;
    ((org.jfree.data.time.TimeSeries)v1).removeAgedItems((((java.lang.Long)v2).longValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new org.jfree.data.time.Minute();
    Object v6 = ((org.jfree.data.time.TimeSeries)v1).getValue(((org.jfree.data.time.RegularTimePeriod)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = true;
    Object v3 = new org.jfree.data.xy.DefaultTableXYDataset((((java.lang.Boolean)v2).booleanValue()));
    ((org.jfree.data.general.Series)v1).addChangeListener(((org.jfree.data.general.SeriesChangeListener)v3));
    Object v4 = null;
    Object v5 = true;
    ((org.jfree.data.general.Series)v1).setNotify((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Minute();
    Object v3 = ((org.jfree.data.time.TimeSeries)v1).getIndex(((org.jfree.data.time.RegularTimePeriod)v2));
    Object v4 = 0;
    Object v5 = 3;
    ((org.jfree.data.time.TimeSeries)v1).delete((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Minute();
    Object v3 = 2.0D;
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addOrUpdate(((org.jfree.data.time.RegularTimePeriod)v2),(((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Minute();
    Object v3 = 54.74662791846254D;
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addOrUpdate(((org.jfree.data.time.RegularTimePeriod)v2),((java.lang.Number)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v1).getTimePeriods();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.general.Series)v1).getNotify();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = ((org.jfree.data.time.TimeSeries)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).getItems();
    Object v3 = 0L;
    ((org.jfree.data.time.TimeSeries)v1).setMaximumItemAge((((java.lang.Long)v3).longValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Minute();
    ((org.jfree.data.time.TimeSeries)v1).delete(((org.jfree.data.time.RegularTimePeriod)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = ((org.jfree.data.general.Series)v4).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = 0;
    Object v6 = 0;
    ((org.jfree.data.time.TimeSeries)v4).update((((java.lang.Integer)v5).intValue()),((java.lang.Number)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    ((org.jfree.data.general.Series)v4).setKey(((java.lang.Comparable)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = new org.jfree.data.time.Minute();
    Object v6 = ((org.jfree.data.time.TimeSeries)v4).getIndex(((org.jfree.data.time.RegularTimePeriod)v5));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = new org.jfree.data.time.Minute();
    Object v6 = java.time.ZoneId.systemDefault();
    Object v7 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v6));
    Object v8 = java.util.Calendar.getInstance(((java.util.TimeZone)v7));
    Object v9 = ((org.jfree.data.time.RegularTimePeriod)v5).getMiddleMillisecond(((java.util.Calendar)v8));
    ((org.jfree.data.time.TimeSeries)v4).delete(((org.jfree.data.time.RegularTimePeriod)v5));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).hashCode();
    Object v6 = 30;
    ((org.jfree.data.time.TimeSeries)v4).setMaximumItemCount((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = "Null 'paint' argument.";
    ((org.jfree.data.general.Series)v4).setDescription(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = false;
    ((org.jfree.data.time.TimeSeries)v4).removeAgedItems((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = 0;
    Object v8 = ((org.jfree.data.time.TimeSeries)v4).getDataItem((((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = true;
    Object v6 = new org.jfree.data.xy.DefaultTableXYDataset((((java.lang.Boolean)v5).booleanValue()));
    ((org.jfree.data.general.Series)v4).addChangeListener(((org.jfree.data.general.SeriesChangeListener)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = java.time.ZoneId.systemDefault();
    Object v6 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v5));
    Object v7 = java.util.Calendar.getInstance(((java.util.TimeZone)v6));
    ((org.jfree.data.general.Series)v4).setKey(((java.lang.Comparable)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = new org.jfree.data.time.Minute();
    Object v6 = java.time.ZoneId.systemDefault();
    Object v7 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v6));
    Object v8 = java.util.Calendar.getInstance(((java.util.TimeZone)v7));
    ((org.jfree.data.time.RegularTimePeriod)v5).peg(((java.util.Calendar)v8));
    Object v9 = null;
    Object v10 = new org.jfree.data.time.Minute();
    Object v11 = ((org.jfree.data.time.TimeSeries)v4).createCopy(((org.jfree.data.time.RegularTimePeriod)v5),((org.jfree.data.time.RegularTimePeriod)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = -49L;
    Object v6 = false;
    ((org.jfree.data.time.TimeSeries)v4).removeAgedItems((((java.lang.Long)v5).longValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = false;
    ((org.jfree.data.time.TimeSeries)v4).removeAgedItems((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    ((org.jfree.data.time.TimeSeries)v4).clear();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = new org.jfree.data.time.Minute();
    Object v9 = 0.0D;
    Object v10 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)v8),(((java.lang.Double)v9).doubleValue()));
    Object v11 = true;
    ((org.jfree.data.time.TimeSeries)v7).add(((org.jfree.data.time.TimeSeriesDataItem)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = ((org.jfree.data.time.TimeSeries)v7).clone();
    Object v9 = ((org.jfree.data.time.TimeSeries)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(-82746597), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = new org.jfree.data.time.Minute();
    Object v6 = -7.7371792278625815D;
    Object v7 = ((org.jfree.data.time.TimeSeries)v4).addOrUpdate(((org.jfree.data.time.RegularTimePeriod)v5),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).getMaximumItemCount();
    org.junit.Assert.assertEquals((Object)(2147483647), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).getTimePeriods();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = true;
    Object v6 = new org.jfree.data.xy.DefaultTableXYDataset((((java.lang.Boolean)v5).booleanValue()));
    ((org.jfree.data.general.Series)v4).removeChangeListener(((org.jfree.data.general.SeriesChangeListener)v6));
    Object v7 = null;
    Object v8 = new org.jfree.data.time.Minute();
    Object v9 = ((org.jfree.data.time.TimeSeries)v4).getIndex(((org.jfree.data.time.RegularTimePeriod)v8));
    org.junit.Assert.assertEquals((Object)(-1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    ((org.jfree.data.general.Series)v7).fireSeriesChanged();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = true;
    Object v6 = new org.jfree.data.xy.DefaultTableXYDataset((((java.lang.Boolean)v5).booleanValue()));
    ((org.jfree.data.general.Series)v4).addChangeListener(((org.jfree.data.general.SeriesChangeListener)v6));
    Object v7 = null;
    Object v8 = true;
    ((org.jfree.data.general.Series)v4).setNotify((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v6 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v5));
    Object v7 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v6).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v8));
    Object v10 = new org.jfree.data.time.Minute();
    Object v11 = java.time.ZoneId.systemDefault();
    Object v12 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v11));
    Object v13 = java.util.Calendar.getInstance(((java.util.TimeZone)v12));
    ((org.jfree.data.time.RegularTimePeriod)v10).peg(((java.util.Calendar)v13));
    Object v14 = null;
    Object v15 = new org.jfree.data.time.Minute();
    Object v16 = ((org.jfree.data.time.TimeSeries)v9).createCopy(((org.jfree.data.time.RegularTimePeriod)v10),((org.jfree.data.time.RegularTimePeriod)v15));
    Object v17 = ((org.jfree.data.time.TimeSeries)v4).getTimePeriodsUniqueToOtherSeries(((org.jfree.data.time.TimeSeries)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v6 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v5));
    Object v7 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v10 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v9));
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v10));
    Object v12 = ((org.jfree.data.time.TimeSeries)v6).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v11));
    Object v13 = ((org.jfree.data.time.TimeSeries)v4).getTimePeriodsUniqueToOtherSeries(((org.jfree.data.time.TimeSeries)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = new org.jfree.data.time.Minute();
    Object v6 = ((org.jfree.data.time.TimeSeries)v4).getValue(((org.jfree.data.time.RegularTimePeriod)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = new org.jfree.data.time.Minute();
    ((org.jfree.data.time.TimeSeries)v7).delete(((org.jfree.data.time.RegularTimePeriod)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = 0;
    Object v9 = 86;
    ((org.jfree.data.time.TimeSeries)v7).delete((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    ((org.jfree.data.general.Series)v7).setKey(((java.lang.Comparable)v8));
    Object v9 = null;
    Object v10 = 0;
    Object v11 = 0;
    ((org.jfree.data.time.TimeSeries)v7).delete((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v6 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v5));
    Object v7 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v6).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v8));
    Object v10 = ((org.jfree.data.time.TimeSeries)v4).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    ((org.jfree.data.general.Series)v4).fireSeriesChanged();
    Object v5 = null;
    Object v6 = new org.jfree.data.time.Minute();
    Object v7 = -13.948040722119883D;
    Object v8 = true;
    ((org.jfree.data.time.TimeSeries)v4).add(((org.jfree.data.time.RegularTimePeriod)v6),((java.lang.Number)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = ((org.jfree.data.general.Series)v7).isEmpty();
    Object v9 = new org.jfree.data.time.Minute();
    Object v10 = 0.0D;
    Object v11 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)v9),(((java.lang.Double)v10).doubleValue()));
    Object v12 = false;
    ((org.jfree.data.time.TimeSeries)v7).add(((org.jfree.data.time.TimeSeriesDataItem)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = new org.jfree.data.time.Minute();
    Object v6 = java.time.ZoneId.systemDefault();
    Object v7 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v6));
    Object v8 = java.util.Calendar.getInstance(((java.util.TimeZone)v7));
    ((org.jfree.data.time.RegularTimePeriod)v5).peg(((java.util.Calendar)v8));
    Object v9 = null;
    Object v10 = new org.jfree.data.time.Minute();
    Object v11 = ((org.jfree.data.time.TimeSeries)v4).createCopy(((org.jfree.data.time.RegularTimePeriod)v5),((org.jfree.data.time.RegularTimePeriod)v10));
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = ((org.jfree.data.time.TimeSeries)v11).createCopy((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = new org.jfree.data.time.Minute();
    Object v6 = 0.0D;
    Object v7 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.time.ZoneId.systemDefault();
    Object v9 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v8));
    Object v10 = java.util.Calendar.getInstance(((java.util.TimeZone)v9));
    Object v11 = ((org.jfree.data.time.TimeSeriesDataItem)v7).compareTo(((java.lang.Object)v10));
    Object v12 = true;
    ((org.jfree.data.time.TimeSeries)v4).add(((org.jfree.data.time.TimeSeriesDataItem)v7),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = ((org.jfree.data.general.Series)v4).isEmpty();
    Object v6 = ((org.jfree.data.general.Series)v4).getDescription();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v10 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v9));
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v10));
    Object v12 = ((org.jfree.data.time.TimeSeries)v6).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v11));
    Object v13 = ((org.jfree.data.time.TimeSeries)v1).getTimePeriodsUniqueToOtherSeries(((org.jfree.data.time.TimeSeries)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Minute();
    Object v3 = ((org.jfree.data.time.TimeSeries)v1).getDataItem(((org.jfree.data.time.RegularTimePeriod)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = new org.jfree.data.time.Minute();
    Object v9 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v10 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v9));
    Object v11 = ((org.jfree.data.general.Series)v10).getNotify();
    Object v12 = ((java.lang.Comparable)v8).compareTo(((java.lang.Object)v11));
    Object v13 = ((org.jfree.data.time.TimeSeries)v7).getDataItem(((org.jfree.data.time.RegularTimePeriod)v8));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = 1L;
    Object v9 = false;
    ((org.jfree.data.time.TimeSeries)v7).removeAgedItems((((java.lang.Long)v8).longValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    ((org.jfree.data.general.Series)v7).setKey(((java.lang.Comparable)v8));
    Object v9 = null;
    Object v10 = ((org.jfree.data.time.TimeSeries)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(-1527018012), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = false;
    ((org.jfree.data.general.Series)v4).setNotify((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = new org.jfree.data.time.Minute();
    Object v6 = new org.jfree.data.time.Minute();
    Object v7 = ((org.jfree.data.time.TimeSeries)v4).createCopy(((org.jfree.data.time.RegularTimePeriod)v5),((org.jfree.data.time.RegularTimePeriod)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = 39;
    Object v9 = 17;
    Object v10 = ((org.jfree.data.time.TimeSeries)v7).createCopy((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = 29;
    ((org.jfree.data.time.TimeSeries)v7).setMaximumItemCount((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).getDomainDescription();
    org.junit.Assert.assertEquals((Object)("Time"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = new org.jfree.data.time.Minute();
    Object v6 = ((org.jfree.data.time.RegularTimePeriod)v5).getMiddleMillisecond();
    Object v7 = 11.828283212769458D;
    Object v8 = true;
    ((org.jfree.data.time.TimeSeries)v4).add(((org.jfree.data.time.RegularTimePeriod)v5),(((java.lang.Double)v7).doubleValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v6 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v5));
    Object v7 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v6).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v8));
    Object v10 = ((org.jfree.data.time.TimeSeries)v4).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v9));
    ((org.jfree.data.time.TimeSeries)v10).clear();
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = false;
    ((org.jfree.data.time.TimeSeries)v7).removeAgedItems((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = "Nul 'paint' argument.";
    ((org.jfree.data.time.TimeSeries)v7).setRangeDescription(((java.lang.String)v8));
    Object v9 = null;
    Object v10 = true;
    Object v11 = new org.jfree.data.xy.DefaultTableXYDataset((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.jfree.data.time.TimeSeries)v7).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = new org.jfree.data.time.Minute();
    Object v6 = ((org.jfree.data.time.TimeSeries)v4).getDataItem(((org.jfree.data.time.RegularTimePeriod)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v6 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v5));
    Object v7 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v6).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v8));
    Object v10 = ((org.jfree.data.time.TimeSeries)v4).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v9));
    Object v11 = ((org.jfree.data.general.Series)v10).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).getNextTimePeriod();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v6 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v5));
    Object v7 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v6).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v8));
    Object v10 = ((org.jfree.data.time.TimeSeries)v4).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v9));
    Object v11 = false;
    ((org.jfree.data.time.TimeSeries)v10).removeAgedItems((((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    Object v13 = 0L;
    Object v14 = true;
    ((org.jfree.data.time.TimeSeries)v10).removeAgedItems((((java.lang.Long)v13).longValue()),(((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = new org.jfree.data.time.Minute();
    Object v9 = ((org.jfree.data.time.TimeSeries)v7).getDataItem(((org.jfree.data.time.RegularTimePeriod)v8));
    Object v10 = -14;
    ((org.jfree.data.time.TimeSeries)v7).setMaximumItemCount((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = ((org.jfree.data.time.TimeSeries)v7).getItems();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).getTimePeriodClass();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(-1527018012), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v6 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v5));
    Object v7 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v6).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v8));
    Object v10 = ((org.jfree.data.time.TimeSeries)v4).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v9));
    Object v11 = new org.jfree.data.time.Minute();
    Object v12 = ((org.jfree.data.time.TimeSeries)v10).getDataItem(((org.jfree.data.time.RegularTimePeriod)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = new org.jfree.data.time.Minute();
    Object v9 = ((org.jfree.data.time.RegularTimePeriod)v8).getMiddleMillisecond();
    ((org.jfree.data.time.TimeSeries)v7).delete(((org.jfree.data.time.RegularTimePeriod)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = "\"-";
    ((org.jfree.data.general.Series)v4).setDescription(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = false;
    ((org.jfree.data.general.Series)v4).setNotify((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v6 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v5));
    Object v7 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v6).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v8));
    Object v10 = ((org.jfree.data.time.TimeSeries)v4).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v9));
    Object v11 = 0L;
    ((org.jfree.data.time.TimeSeries)v10).setMaximumItemAge((((java.lang.Long)v11).longValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = new org.jfree.data.time.Minute();
    Object v9 = ((org.jfree.data.time.TimeSeries)v7).getValue(((org.jfree.data.time.RegularTimePeriod)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = ((org.jfree.data.time.TimeSeries)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(-82746597), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.general.Series)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = new org.jfree.data.time.Minute();
    Object v6 = java.time.ZoneId.systemDefault();
    Object v7 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v6));
    Object v8 = java.util.Calendar.getInstance(((java.util.TimeZone)v7));
    ((org.jfree.data.time.RegularTimePeriod)v5).peg(((java.util.Calendar)v8));
    Object v9 = null;
    Object v10 = new org.jfree.data.time.Minute();
    Object v11 = ((org.jfree.data.time.TimeSeries)v4).createCopy(((org.jfree.data.time.RegularTimePeriod)v5),((org.jfree.data.time.RegularTimePeriod)v10));
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = ((org.jfree.data.time.TimeSeries)v11).createCopy((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new org.jfree.data.time.Minute();
    ((org.jfree.data.time.TimeSeries)v14).delete(((org.jfree.data.time.RegularTimePeriod)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = "Valu";
    Object v2 = ";";
    Object v3 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v6 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v4).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = ((org.jfree.data.time.TimeSeries)v7).getTimePeriodClass();
    Object v9 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.Class)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v6 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v5));
    Object v7 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v6).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v8));
    Object v10 = ((org.jfree.data.time.TimeSeries)v4).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v9));
    Object v11 = 6;
    Object v12 = 0;
    ((org.jfree.data.time.TimeSeries)v10).update((((java.lang.Integer)v11).intValue()),((java.lang.Number)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = true;
    Object v3 = new org.jfree.data.xy.DefaultTableXYDataset((((java.lang.Boolean)v2).booleanValue()));
    ((org.jfree.data.general.Series)v1).removeChangeListener(((org.jfree.data.general.SeriesChangeListener)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = new org.jfree.data.time.Minute();
    Object v6 = java.time.ZoneId.systemDefault();
    Object v7 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v6));
    Object v8 = java.util.Calendar.getInstance(((java.util.TimeZone)v7));
    ((org.jfree.data.time.RegularTimePeriod)v5).peg(((java.util.Calendar)v8));
    Object v9 = null;
    Object v10 = new org.jfree.data.time.Minute();
    Object v11 = ((org.jfree.data.time.TimeSeries)v4).createCopy(((org.jfree.data.time.RegularTimePeriod)v5),((org.jfree.data.time.RegularTimePeriod)v10));
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = ((org.jfree.data.time.TimeSeries)v11).createCopy((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new org.jfree.data.time.Minute();
    Object v16 = 0;
    ((org.jfree.data.time.TimeSeries)v14).update(((org.jfree.data.time.RegularTimePeriod)v15),((java.lang.Number)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = new org.jfree.data.time.Minute();
    Object v9 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v10 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v9));
    Object v11 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v12 = ((org.jfree.data.time.TimeSeries)v10).equals(((java.lang.Object)v11));
    Object v13 = ((java.lang.Comparable)v8).compareTo(((java.lang.Object)v12));
    Object v14 = ((org.jfree.data.time.TimeSeries)v7).getIndex(((org.jfree.data.time.RegularTimePeriod)v8));
    org.junit.Assert.assertEquals((Object)(-1), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = true;
    Object v3 = new org.jfree.data.xy.DefaultTableXYDataset((((java.lang.Boolean)v2).booleanValue()));
    ((org.jfree.data.general.Series)v1).removeChangeListener(((org.jfree.data.general.SeriesChangeListener)v3));
    Object v4 = null;
    Object v5 = ((org.jfree.data.general.Series)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = true;
    Object v6 = new org.jfree.data.xy.DefaultTableXYDataset((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v8 = "Valu";
    Object v9 = ";";
    Object v10 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v11 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v10));
    Object v12 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v13 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v12));
    Object v14 = ((org.jfree.data.time.TimeSeries)v11).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v13));
    Object v15 = ((org.jfree.data.time.TimeSeries)v14).getTimePeriodClass();
    Object v16 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7),((java.lang.String)v8),((java.lang.String)v9),((java.lang.Class)v15));
    Object v17 = new org.jfree.data.general.SeriesChangeEvent(((java.lang.Object)v16));
    ((org.jfree.data.general.SeriesChangeListener)v6).seriesChanged(((org.jfree.data.general.SeriesChangeEvent)v17));
    Object v18 = null;
    ((org.jfree.data.general.Series)v4).addChangeListener(((org.jfree.data.general.SeriesChangeListener)v6));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = new org.jfree.data.time.Minute();
    Object v6 = 0.0D;
    Object v7 = false;
    ((org.jfree.data.time.TimeSeries)v4).add(((org.jfree.data.time.RegularTimePeriod)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = new org.jfree.data.time.Minute();
    Object v6 = new org.jfree.data.time.Minute();
    Object v7 = ((org.jfree.data.time.TimeSeries)v4).createCopy(((org.jfree.data.time.RegularTimePeriod)v5),((org.jfree.data.time.RegularTimePeriod)v6));
    Object v8 = 0;
    Object v9 = 1;
    ((org.jfree.data.time.TimeSeries)v7).delete((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v6 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v5));
    Object v7 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v6).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v8));
    Object v10 = ((org.jfree.data.time.TimeSeries)v4).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v9));
    Object v11 = true;
    Object v12 = new org.jfree.data.xy.DefaultTableXYDataset((((java.lang.Boolean)v11).booleanValue()));
    ((org.jfree.data.general.Series)v10).addChangeListener(((org.jfree.data.general.SeriesChangeListener)v12));
    Object v13 = null;
    Object v14 = new org.jfree.data.time.Minute();
    Object v15 = ((org.jfree.data.time.RegularTimePeriod)v14).getMiddleMillisecond();
    ((org.jfree.data.time.TimeSeries)v10).delete(((org.jfree.data.time.RegularTimePeriod)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = -3;
    Object v9 = 11;
    ((org.jfree.data.time.TimeSeries)v7).delete((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = new org.jfree.data.time.Minute();
    Object v6 = 0;
    ((org.jfree.data.time.TimeSeries)v4).update(((org.jfree.data.time.RegularTimePeriod)v5),((java.lang.Number)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v6 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v5));
    Object v7 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v6).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v8));
    Object v10 = ((org.jfree.data.time.TimeSeries)v4).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v9));
    Object v11 = new org.jfree.data.time.Minute();
    ((org.jfree.data.time.TimeSeries)v10).delete(((org.jfree.data.time.RegularTimePeriod)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v3).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = -5L;
    ((org.jfree.data.time.TimeSeries)v7).setMaximumItemAge((((java.lang.Long)v8).longValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = "Valu";
    Object v2 = ";";
    Object v3 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v6 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v4).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = ((org.jfree.data.time.TimeSeries)v7).getTimePeriodClass();
    Object v9 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.Class)v8));
    Object v10 = ((org.jfree.data.time.TimeSeries)v9).hashCode();
    org.junit.Assert.assertEquals((Object)(709833037), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v6 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v5));
    Object v7 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v6).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v8));
    Object v10 = ((org.jfree.data.time.TimeSeries)v4).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v9));
    Object v11 = ((org.jfree.data.time.TimeSeries)v10).clone();
    Object v12 = ((org.jfree.data.time.TimeSeries)v10).getMaximumItemAge();
    org.junit.Assert.assertEquals((Object)(9223372036854775807L), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = 18L;
    ((org.jfree.data.time.TimeSeries)v4).setMaximumItemAge((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v1 = "Valu";
    Object v2 = ";";
    Object v3 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v6 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v4).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = ((org.jfree.data.time.TimeSeries)v7).getTimePeriodClass();
    Object v9 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.Class)v8));
    Object v10 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v11 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v10));
    Object v12 = org.jfree.chart.util.ObjectUtilities.getClassLoaderSource();
    Object v13 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v12));
    Object v14 = ((org.jfree.data.time.TimeSeries)v11).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v13));
    Object v15 = ((org.jfree.data.time.TimeSeries)v9).getTimePeriodsUniqueToOtherSeries(((org.jfree.data.time.TimeSeries)v14));
    org.junit.Assert.assertNotNull(v15);
  }
}
