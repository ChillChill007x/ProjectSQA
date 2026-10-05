package org.jfree.data.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = 2;
    Object v3 = ((org.jfree.data.time.TimeSeries)v1).getValue((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    ((org.jfree.data.general.Series)v1).fireSeriesChanged();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = 4;
    Object v3 = -7;
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).createCopy((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = 3;
    Object v3 = 33;
    Object v4 = true;
    ((org.jfree.data.time.TimeSeries)v1).delete((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Day();
    Object v3 = ((org.jfree.data.time.TimeSeries)v1).getDataItem(((org.jfree.data.time.RegularTimePeriod)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = false;
    ((org.jfree.data.general.Series)v1).setNotify((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Day();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Day();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(-1116549243), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.Day();
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v5).clone();
    Object v7 = ((java.lang.Comparable)v3).compareTo(((java.lang.Object)v6));
    ((org.jfree.data.time.TimeSeries)v2).delete(((org.jfree.data.time.RegularTimePeriod)v3));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Day();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = new org.jfree.data.time.Day();
    Object v6 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v5));
    Object v7 = new org.jfree.data.time.Day();
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v6).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v8));
    Object v10 = ((org.jfree.data.time.TimeSeries)v9).hashCode();
    Object v11 = ((org.jfree.data.time.TimeSeries)v4).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = 18.454455821901522D;
    Object v5 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)v3),((java.lang.Number)v4));
    Object v6 = false;
    ((org.jfree.data.time.TimeSeries)v2).add(((org.jfree.data.time.TimeSeriesDataItem)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = new org.jfree.data.time.Day();
    Object v9 = ((org.jfree.data.time.TimeSeries)v2).getDataItem(((org.jfree.data.time.RegularTimePeriod)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = ((org.jfree.data.general.Series)v2).getDescription();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.Day();
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy(((org.jfree.data.time.RegularTimePeriod)v3),((org.jfree.data.time.RegularTimePeriod)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.chart.panel.CrosshairOverlay();
    ((org.jfree.data.general.Series)v2).addPropertyChangeListener(((java.beans.PropertyChangeListener)v3));
    Object v4 = null;
    Object v5 = new org.jfree.data.time.Day();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).getRawDataItem(((org.jfree.data.time.RegularTimePeriod)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = "Tahoma";
    ((org.jfree.data.general.Series)v2).setDescription(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).getTimePeriods();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Day();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v3).clone();
    Object v5 = ((org.jfree.data.time.TimeSeries)v1).getTimePeriodsUniqueToOtherSeries(((org.jfree.data.time.TimeSeries)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.Day();
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy(((org.jfree.data.time.RegularTimePeriod)v3),((org.jfree.data.time.RegularTimePeriod)v4));
    Object v6 = ((org.jfree.data.general.Series)v5).isEmpty();
    Object v7 = ((org.jfree.data.general.Series)v5).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = true;
    ((org.jfree.data.time.TimeSeries)v2).delete((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Day();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    ((org.jfree.data.general.Series)v4).removeChangeListener(((org.jfree.data.event.SeriesChangeListener)v5));
    Object v6 = null;
    Object v7 = new org.jfree.data.time.Day();
    Object v8 = ((org.jfree.data.time.TimeSeries)v4).getValue(((org.jfree.data.time.RegularTimePeriod)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Day();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).getTimePeriods();
    Object v6 = 0L;
    ((org.jfree.data.time.TimeSeries)v4).setMaximumItemAge((((java.lang.Long)v6).longValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = 11;
    ((org.jfree.data.time.TimeSeries)v2).setMaximumItemCount((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = 18.454455821901522D;
    Object v5 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)v3),((java.lang.Number)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addOrUpdate(((org.jfree.data.time.TimeSeriesDataItem)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = ((org.jfree.data.time.TimeSeries)v2).getValue(((org.jfree.data.time.RegularTimePeriod)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.Day();
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy(((org.jfree.data.time.RegularTimePeriod)v3),((org.jfree.data.time.RegularTimePeriod)v4));
    Object v6 = 1L;
    ((org.jfree.data.time.TimeSeries)v5).setMaximumItemAge((((java.lang.Long)v6).longValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Day();
    Object v3 = ((org.jfree.data.time.TimeSeries)v1).getIndex(((org.jfree.data.time.RegularTimePeriod)v2));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = "ValUue";
    ((org.jfree.data.general.Series)v2).setDescription(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = new org.jfree.data.time.Day();
    Object v6 = 0;
    ((org.jfree.data.time.TimeSeries)v2).update(((org.jfree.data.time.RegularTimePeriod)v5),((java.lang.Number)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.Day();
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy(((org.jfree.data.time.RegularTimePeriod)v3),((org.jfree.data.time.RegularTimePeriod)v4));
    Object v6 = 0;
    ((org.jfree.data.time.TimeSeries)v5).setMaximumItemCount((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = -3.9583522085770673D;
    Object v5 = true;
    ((org.jfree.data.time.TimeSeries)v2).add(((org.jfree.data.time.RegularTimePeriod)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = 54.74662791846254D;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).addOrUpdate(((org.jfree.data.time.RegularTimePeriod)v3),((java.lang.Number)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).getTimePeriodClass();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = ((org.jfree.data.general.Series)v2).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = 30;
    Object v4 = ((org.jfree.data.time.TimeSeries)v2).getDataItem((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).getNextTimePeriod();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Day();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = new org.jfree.data.time.Day();
    Object v6 = 18.454455821901522D;
    Object v7 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)v5),((java.lang.Number)v6));
    ((org.jfree.data.time.TimeSeries)v4).add(((org.jfree.data.time.TimeSeriesDataItem)v7));
    Object v8 = null;
    Object v9 = 2L;
    Object v10 = true;
    ((org.jfree.data.time.TimeSeries)v4).removeAgedItems((((java.lang.Long)v9).longValue()),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.Day();
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy(((org.jfree.data.time.RegularTimePeriod)v3),((org.jfree.data.time.RegularTimePeriod)v4));
    Object v6 = 1;
    Object v7 = 0;
    ((org.jfree.data.time.TimeSeries)v5).update((((java.lang.Integer)v6).intValue()),((java.lang.Number)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = ((org.jfree.data.time.TimeSeries)v2).getIndex(((org.jfree.data.time.RegularTimePeriod)v3));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Day();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).getItemCount();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Day();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = new org.jfree.data.time.Day();
    Object v6 = 18.454455821901522D;
    Object v7 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)v5),((java.lang.Number)v6));
    Object v8 = ((org.jfree.data.time.TimeSeries)v4).equals(((java.lang.Object)v7));
    Object v9 = new org.jfree.data.time.Day();
    Object v10 = ((org.jfree.data.time.TimeSeries)v4).getRawDataItem(((org.jfree.data.time.RegularTimePeriod)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = 21.899428594142545D;
    Object v5 = false;
    ((org.jfree.data.time.TimeSeries)v2).add(((org.jfree.data.time.RegularTimePeriod)v3),((java.lang.Number)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = false;
    ((org.jfree.data.time.TimeSeries)v2).removeAgedItems((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.Day();
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy(((org.jfree.data.time.RegularTimePeriod)v3),((org.jfree.data.time.RegularTimePeriod)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(-435314153), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.Day();
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy(((org.jfree.data.time.RegularTimePeriod)v3),((org.jfree.data.time.RegularTimePeriod)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v5).getTimePeriods();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    ((org.jfree.data.general.Series)v2).removeChangeListener(((org.jfree.data.event.SeriesChangeListener)v3));
    Object v4 = null;
    Object v5 = new org.jfree.data.time.Day();
    Object v6 = 18.454455821901522D;
    Object v7 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)v5),((java.lang.Number)v6));
    Object v8 = false;
    ((org.jfree.data.time.TimeSeriesDataItem)v7).setSelected((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = false;
    ((org.jfree.data.time.TimeSeries)v2).add(((org.jfree.data.time.TimeSeriesDataItem)v7),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = 30;
    Object v4 = 0;
    Object v5 = true;
    ((org.jfree.data.time.TimeSeries)v2).delete((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Day();
    Object v3 = 18.454455821901522D;
    Object v4 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)v2),((java.lang.Number)v3));
    Object v5 = true;
    ((org.jfree.data.time.TimeSeries)v1).add(((org.jfree.data.time.TimeSeriesDataItem)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = 18.454455821901522D;
    Object v5 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)v3),((java.lang.Number)v4));
    ((org.jfree.data.general.Series)v2).setKey(((java.lang.Comparable)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = "N~ull 'paint' argument.";
    ((org.jfree.data.time.TimeSeries)v2).setDomainDescription(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Day();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = 25;
    Object v6 = -9.961132949603941D;
    ((org.jfree.data.time.TimeSeries)v4).update((((java.lang.Integer)v5).intValue()),((java.lang.Number)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = false;
    ((org.jfree.data.general.Series)v2).setNotify((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    ((org.jfree.data.time.TimeSeries)v6).clear();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.Day();
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy(((org.jfree.data.time.RegularTimePeriod)v3),((org.jfree.data.time.RegularTimePeriod)v4));
    Object v6 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    ((org.jfree.data.general.Series)v5).removeChangeListener(((org.jfree.data.event.SeriesChangeListener)v6));
    Object v7 = null;
    Object v8 = true;
    ((org.jfree.data.time.TimeSeries)v5).removeAgedItems((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = new org.jfree.data.time.Day();
    Object v8 = 0;
    ((org.jfree.data.time.TimeSeries)v6).add(((org.jfree.data.time.RegularTimePeriod)v7),((java.lang.Number)v8));
    Object v9 = null;
    ((org.jfree.data.time.TimeSeries)v6).clear();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = 0;
    Object v8 = -41;
    Object v9 = false;
    ((org.jfree.data.time.TimeSeries)v6).delete((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v6).getTimePeriods();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = new org.jfree.data.time.Day();
    Object v8 = ((org.jfree.data.time.TimeSeries)v6).getValue(((org.jfree.data.time.RegularTimePeriod)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = 18.454455821901522D;
    Object v5 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)v3),((java.lang.Number)v4));
    ((org.jfree.data.time.TimeSeries)v2).add(((org.jfree.data.time.TimeSeriesDataItem)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = -4L;
    Object v8 = true;
    ((org.jfree.data.time.TimeSeries)v6).removeAgedItems((((java.lang.Long)v7).longValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.general.Series)v6).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v6).getMinY();
    org.junit.Assert.assertEquals((Object)(Double.NaN), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = new org.jfree.data.time.Day();
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v8).clone();
    Object v10 = new org.jfree.data.time.Day();
    Object v11 = ((org.jfree.data.time.TimeSeries)v9).getIndex(((org.jfree.data.time.RegularTimePeriod)v10));
    ((org.jfree.data.general.Series)v6).setKey(((java.lang.Comparable)v11));
    Object v12 = null;
    Object v13 = 1;
    Object v14 = 0;
    ((org.jfree.data.time.TimeSeries)v6).delete((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = 49;
    Object v8 = 0;
    ((org.jfree.data.time.TimeSeries)v6).update((((java.lang.Integer)v7).intValue()),((java.lang.Number)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = ((org.jfree.data.time.RegularTimePeriod)v3).getMiddleMillisecond();
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).getIndex(((org.jfree.data.time.RegularTimePeriod)v3));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.Day();
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy(((org.jfree.data.time.RegularTimePeriod)v3),((org.jfree.data.time.RegularTimePeriod)v4));
    Object v6 = 1L;
    Object v7 = false;
    ((org.jfree.data.time.TimeSeries)v5).removeAgedItems((((java.lang.Long)v6).longValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = new org.jfree.data.time.Day();
    Object v10 = 23.91977994216284D;
    Object v11 = false;
    ((org.jfree.data.time.TimeSeries)v5).add(((org.jfree.data.time.RegularTimePeriod)v9),((java.lang.Number)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = new org.jfree.data.time.Day();
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v8).clone();
    Object v10 = new org.jfree.data.time.Day();
    Object v11 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v10));
    Object v12 = ((org.jfree.data.time.TimeSeries)v11).clone();
    Object v13 = ((org.jfree.data.time.TimeSeries)v9).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v12));
    Object v14 = ((org.jfree.data.time.TimeSeries)v6).getTimePeriodsUniqueToOtherSeries(((org.jfree.data.time.TimeSeries)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Day();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = new org.jfree.data.time.Day();
    Object v6 = 0;
    ((org.jfree.data.time.TimeSeries)v4).update(((org.jfree.data.time.RegularTimePeriod)v5),((java.lang.Number)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = 1;
    Object v8 = 39;
    Object v9 = ((org.jfree.data.time.TimeSeries)v6).createCopy((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = 1;
    Object v8 = 39;
    Object v9 = ((org.jfree.data.time.TimeSeries)v6).createCopy((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.jfree.data.time.TimeSeries)v9).getTimePeriods();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = true;
    ((org.jfree.data.time.TimeSeries)v2).removeAgedItems((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = 1;
    Object v8 = 39;
    Object v9 = ((org.jfree.data.time.TimeSeries)v6).createCopy((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new org.jfree.data.time.Day();
    Object v11 = -0.7719825904715144D;
    ((org.jfree.data.time.TimeSeries)v9).add(((org.jfree.data.time.RegularTimePeriod)v10),(((java.lang.Double)v11).doubleValue()));
    Object v12 = null;
    Object v13 = true;
    ((org.jfree.data.time.TimeSeries)v9).removeAgedItems((((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = "Nwull 'paint' argument.";
    ((org.jfree.data.time.TimeSeries)v4).setRangeDescription(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = ((org.jfree.data.time.TimeSeries)v2).getTimePeriodsUniqueToOtherSeries(((org.jfree.data.time.TimeSeries)v4));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    ((org.jfree.data.general.Series)v2).fireSeriesChanged();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = new org.jfree.data.time.Day();
    Object v8 = 0;
    ((org.jfree.data.time.TimeSeries)v6).add(((org.jfree.data.time.RegularTimePeriod)v7),((java.lang.Number)v8));
    Object v9 = null;
    Object v10 = new org.jfree.data.time.Day();
    Object v11 = ((org.jfree.data.time.TimeSeries)v6).getRawDataItem(((org.jfree.data.time.RegularTimePeriod)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Day();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = new org.jfree.data.time.Day();
    Object v6 = ((org.jfree.data.time.TimeSeries)v4).getValue(((org.jfree.data.time.RegularTimePeriod)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    ((org.jfree.data.time.TimeSeries)v2).delete(((org.jfree.data.time.RegularTimePeriod)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = true;
    ((org.jfree.data.general.Series)v2).setNotify((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    ((org.jfree.data.general.Series)v2).addChangeListener(((org.jfree.data.event.SeriesChangeListener)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = new org.jfree.data.time.Day();
    Object v8 = 18.454455821901522D;
    Object v9 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)v7),((java.lang.Number)v8));
    Object v10 = ((org.jfree.data.time.TimeSeries)v6).addOrUpdate(((org.jfree.data.time.TimeSeriesDataItem)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.Day();
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy(((org.jfree.data.time.RegularTimePeriod)v3),((org.jfree.data.time.RegularTimePeriod)v4));
    Object v6 = new org.jfree.data.time.Day();
    Object v7 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v6));
    Object v8 = ((org.jfree.data.time.TimeSeries)v7).clone();
    Object v9 = new org.jfree.data.time.Day();
    Object v10 = 18.454455821901522D;
    Object v11 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)v9),((java.lang.Number)v10));
    Object v12 = false;
    ((org.jfree.data.time.TimeSeries)v8).add(((org.jfree.data.time.TimeSeriesDataItem)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    Object v14 = new org.jfree.data.time.Day();
    Object v15 = ((org.jfree.data.time.TimeSeries)v8).getDataItem(((org.jfree.data.time.RegularTimePeriod)v14));
    Object v16 = ((org.jfree.data.time.TimeSeries)v5).addOrUpdate(((org.jfree.data.time.TimeSeriesDataItem)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = 1;
    Object v8 = 39;
    Object v9 = ((org.jfree.data.time.TimeSeries)v6).createCopy((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.jfree.data.time.TimeSeries)v9).hashCode();
    org.junit.Assert.assertEquals((Object)(-1116549243), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = ((org.jfree.data.time.TimeSeries)v2).getItemCount();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Day();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = new org.jfree.data.time.Day();
    Object v6 = 18.454455821901522D;
    Object v7 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)v5),((java.lang.Number)v6));
    Object v8 = true;
    ((org.jfree.data.time.TimeSeries)v4).add(((org.jfree.data.time.TimeSeriesDataItem)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = new org.jfree.data.time.Day();
    Object v6 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v5));
    Object v7 = ((org.jfree.data.time.TimeSeries)v4).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v6));
    Object v8 = ((org.jfree.data.time.TimeSeries)v7).getItemCount();
    ((org.jfree.data.general.Series)v2).setKey(((java.lang.Comparable)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = "Null 'paint' ar7ument.";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "Valu";
    Object v7 = "Null 'paint' ar0gument.";
    Object v8 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.util.Calendar.getInstance(((java.util.TimeZone)v5),((java.util.Locale)v8));
    Object v10 = ((org.jfree.data.time.RegularTimePeriod)v3).getFirstMillisecond(((java.util.Calendar)v9));
    Object v11 = 0.0D;
    Object v12 = true;
    ((org.jfree.data.time.TimeSeries)v2).add(((org.jfree.data.time.RegularTimePeriod)v3),(((java.lang.Double)v11).doubleValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = new org.jfree.data.time.Day();
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v8).clone();
    Object v10 = new org.jfree.data.time.Day();
    Object v11 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v10));
    Object v12 = ((org.jfree.data.time.TimeSeries)v11).clone();
    Object v13 = ((org.jfree.data.time.TimeSeries)v9).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v12));
    Object v14 = new org.jfree.data.time.Day();
    Object v15 = 0;
    ((org.jfree.data.time.TimeSeries)v13).add(((org.jfree.data.time.RegularTimePeriod)v14),((java.lang.Number)v15));
    Object v16 = null;
    Object v17 = new org.jfree.data.time.Day();
    Object v18 = ((org.jfree.data.time.TimeSeries)v13).getRawDataItem(((org.jfree.data.time.RegularTimePeriod)v17));
    Object v19 = ((org.jfree.data.time.TimeSeries)v6).addOrUpdate(((org.jfree.data.time.TimeSeriesDataItem)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = 54.405170497659306D;
    ((org.jfree.data.time.TimeSeries)v2).add(((org.jfree.data.time.RegularTimePeriod)v3),((java.lang.Number)v4));
    Object v5 = null;
    Object v6 = new org.jfree.data.time.Day();
    Object v7 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v6));
    Object v8 = ((org.jfree.data.time.TimeSeries)v7).clone();
    Object v9 = new org.jfree.data.time.Day();
    Object v10 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v9));
    Object v11 = ((org.jfree.data.time.TimeSeries)v10).clone();
    Object v12 = ((org.jfree.data.time.TimeSeries)v8).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v11));
    Object v13 = new org.jfree.data.time.Day();
    Object v14 = 0;
    ((org.jfree.data.time.TimeSeries)v12).add(((org.jfree.data.time.RegularTimePeriod)v13),((java.lang.Number)v14));
    Object v15 = null;
    Object v16 = new org.jfree.data.time.Day();
    Object v17 = ((org.jfree.data.time.TimeSeries)v12).getRawDataItem(((org.jfree.data.time.RegularTimePeriod)v16));
    Object v18 = false;
    ((org.jfree.data.time.TimeSeries)v2).add(((org.jfree.data.time.TimeSeriesDataItem)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v19 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = new org.jfree.data.time.Day();
    Object v7 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v6));
    Object v8 = ((org.jfree.data.time.TimeSeries)v7).clone();
    Object v9 = ((org.jfree.data.time.TimeSeries)v5).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v8));
    Object v10 = ((org.jfree.data.general.Series)v9).isEmpty();
    Object v11 = ((org.jfree.data.time.TimeSeries)v2).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = new org.jfree.data.time.Day();
    Object v8 = 83.24586130446158D;
    Object v9 = ((org.jfree.data.time.TimeSeries)v6).addOrUpdate(((org.jfree.data.time.RegularTimePeriod)v7),((java.lang.Number)v8));
    Object v10 = 5;
    Object v11 = ((org.jfree.data.time.TimeSeries)v6).getValue((((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = "Null 'paint' ar7ument.";
    Object v4 = java.util.TimeZone.getTimeZone(((java.lang.String)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.Day();
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy(((org.jfree.data.time.RegularTimePeriod)v3),((org.jfree.data.time.RegularTimePeriod)v4));
    Object v6 = ((org.jfree.data.general.Series)v5).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = "Null 'paint' argument.";
    ((org.jfree.data.general.Series)v2).setDescription(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = ((org.jfree.data.general.Series)v2).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Day();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    Object v5 = -1L;
    Object v6 = true;
    ((org.jfree.data.time.TimeSeries)v4).removeAgedItems((((java.lang.Long)v5).longValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.Day();
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy(((org.jfree.data.time.RegularTimePeriod)v3),((org.jfree.data.time.RegularTimePeriod)v4));
    Object v6 = new org.jfree.data.time.Day();
    Object v7 = new org.jfree.data.time.Day();
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy(((org.jfree.data.time.RegularTimePeriod)v6),((org.jfree.data.time.RegularTimePeriod)v7));
    Object v9 = new org.jfree.data.time.Day();
    Object v10 = ((org.jfree.data.time.TimeSeries)v5).getDataItem(((org.jfree.data.time.RegularTimePeriod)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = 19;
    Object v4 = ((org.jfree.data.time.TimeSeries)v2).getTimePeriod((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = -3L;
    ((org.jfree.data.time.TimeSeries)v6).setMaximumItemAge((((java.lang.Long)v7).longValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = new org.jfree.data.time.Day();
    Object v8 = 1;
    ((org.jfree.data.time.TimeSeries)v6).update(((org.jfree.data.time.RegularTimePeriod)v7),((java.lang.Number)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = 1;
    Object v8 = 39;
    Object v9 = ((org.jfree.data.time.TimeSeries)v6).createCopy((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.jfree.data.time.TimeSeries)v9).getDomainDescription();
    org.junit.Assert.assertEquals((Object)("Time"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = true;
    ((org.jfree.data.general.Series)v2).setNotify((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = new org.jfree.data.time.Day();
    Object v3 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v2));
    Object v4 = ((org.jfree.data.time.TimeSeries)v1).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v3));
    ((org.jfree.data.time.TimeSeries)v4).clear();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = 1;
    Object v8 = 39;
    Object v9 = ((org.jfree.data.time.TimeSeries)v6).createCopy((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -6;
    Object v11 = -11;
    Object v12 = true;
    ((org.jfree.data.time.TimeSeries)v9).delete((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = -30;
    Object v8 = -19;
    Object v9 = ((org.jfree.data.time.TimeSeries)v6).createCopy((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.jfree.data.time.Day();
    Object v1 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v0));
    Object v2 = ((org.jfree.data.time.TimeSeries)v1).clone();
    Object v3 = new org.jfree.data.time.Day();
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = ((org.jfree.data.time.TimeSeries)v4).clone();
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v5));
    Object v7 = 1;
    Object v8 = 39;
    Object v9 = ((org.jfree.data.time.TimeSeries)v6).createCopy((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0L;
    ((org.jfree.data.time.TimeSeries)v9).setMaximumItemAge((((java.lang.Long)v10).longValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }
}
