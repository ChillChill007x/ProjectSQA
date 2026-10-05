package org.jfree.data.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 82;
    Object v4 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.time.TimeSeries)v2).getTimePeriodsUniqueToOtherSeries(((org.jfree.data.time.TimeSeries)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0L;
    ((org.jfree.data.time.TimeSeries)v2).setMaximumItemAge((((java.lang.Long)v3).longValue()));
    Object v4 = null;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).getTimePeriods();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = -31;
    Object v4 = 0;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = -41;
    Object v4 = -5;
    Object v5 = -13;
    Object v6 = 0;
    Object v7 = -1;
    Object v8 = 0;
    Object v9 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = java.util.TimeZone.getDefault();
    Object v11 = new org.jfree.data.time.Month(((java.util.Date)v9),((java.util.TimeZone)v10));
    Object v12 = java.util.Calendar.getInstance();
    Object v13 = ((org.jfree.data.time.RegularTimePeriod)v11).getFirstMillisecond(((java.util.Calendar)v12));
    Object v14 = -41;
    Object v15 = -5;
    Object v16 = -13;
    Object v17 = 0;
    Object v18 = -1;
    Object v19 = 0;
    Object v20 = new java.util.Date((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = java.util.TimeZone.getDefault();
    Object v22 = new org.jfree.data.time.Month(((java.util.Date)v20),((java.util.TimeZone)v21));
    Object v23 = ((org.jfree.data.time.TimeSeries)v2).createCopy(((org.jfree.data.time.RegularTimePeriod)v11),((org.jfree.data.time.RegularTimePeriod)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = -41;
    Object v4 = -5;
    Object v5 = -13;
    Object v6 = 0;
    Object v7 = -1;
    Object v8 = 0;
    Object v9 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = java.util.TimeZone.getDefault();
    Object v11 = new org.jfree.data.time.Month(((java.util.Date)v9),((java.util.TimeZone)v10));
    Object v12 = java.util.Calendar.getInstance();
    Object v13 = ((org.jfree.data.time.RegularTimePeriod)v11).getFirstMillisecond(((java.util.Calendar)v12));
    Object v14 = -41;
    Object v15 = -5;
    Object v16 = -13;
    Object v17 = 0;
    Object v18 = -1;
    Object v19 = 0;
    Object v20 = new java.util.Date((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = java.util.TimeZone.getDefault();
    Object v22 = new org.jfree.data.time.Month(((java.util.Date)v20),((java.util.TimeZone)v21));
    Object v23 = ((org.jfree.data.time.TimeSeries)v2).createCopy(((org.jfree.data.time.RegularTimePeriod)v11),((org.jfree.data.time.RegularTimePeriod)v22));
    Object v24 = 82;
    Object v25 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v24).intValue()));
    Object v26 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v25));
    Object v27 = ((org.jfree.data.time.TimeSeries)v23).getTimePeriodsUniqueToOtherSeries(((org.jfree.data.time.TimeSeries)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 1L;
    ((org.jfree.data.time.TimeSeries)v2).setMaximumItemAge((((java.lang.Long)v3).longValue()));
    Object v4 = null;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).getTimePeriods();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = -41;
    Object v4 = -5;
    Object v5 = -13;
    Object v6 = 0;
    Object v7 = -1;
    Object v8 = 0;
    Object v9 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = java.util.TimeZone.getDefault();
    Object v11 = new org.jfree.data.time.Month(((java.util.Date)v9),((java.util.TimeZone)v10));
    Object v12 = java.util.Calendar.getInstance();
    Object v13 = ((org.jfree.data.time.RegularTimePeriod)v11).getFirstMillisecond(((java.util.Calendar)v12));
    Object v14 = -41;
    Object v15 = -5;
    Object v16 = -13;
    Object v17 = 0;
    Object v18 = -1;
    Object v19 = 0;
    Object v20 = new java.util.Date((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = java.util.TimeZone.getDefault();
    Object v22 = new org.jfree.data.time.Month(((java.util.Date)v20),((java.util.TimeZone)v21));
    Object v23 = ((org.jfree.data.time.TimeSeries)v2).createCopy(((org.jfree.data.time.RegularTimePeriod)v11),((org.jfree.data.time.RegularTimePeriod)v22));
    Object v24 = -41;
    Object v25 = -5;
    Object v26 = -13;
    Object v27 = 0;
    Object v28 = -1;
    Object v29 = 0;
    Object v30 = new java.util.Date((((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = java.util.TimeZone.getDefault();
    Object v32 = new org.jfree.data.time.Month(((java.util.Date)v30),((java.util.TimeZone)v31));
    ((org.jfree.data.time.TimeSeries)v23).delete(((org.jfree.data.time.RegularTimePeriod)v32));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 3L;
    ((org.jfree.data.time.TimeSeries)v2).setMaximumItemAge((((java.lang.Long)v3).longValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = -41;
    Object v4 = -5;
    Object v5 = -13;
    Object v6 = 0;
    Object v7 = -1;
    Object v8 = 0;
    Object v9 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = java.util.TimeZone.getDefault();
    Object v11 = new org.jfree.data.time.Month(((java.util.Date)v9),((java.util.TimeZone)v10));
    Object v12 = ((org.jfree.data.time.TimeSeries)v2).getValue(((org.jfree.data.time.RegularTimePeriod)v11));
    Object v13 = 82;
    Object v14 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v13).intValue()));
    Object v15 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v14));
    Object v16 = -41;
    Object v17 = -5;
    Object v18 = -13;
    Object v19 = 0;
    Object v20 = -1;
    Object v21 = 0;
    Object v22 = new java.util.Date((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = java.util.TimeZone.getDefault();
    Object v24 = new org.jfree.data.time.Month(((java.util.Date)v22),((java.util.TimeZone)v23));
    Object v25 = java.util.Calendar.getInstance();
    Object v26 = ((org.jfree.data.time.RegularTimePeriod)v24).getFirstMillisecond(((java.util.Calendar)v25));
    Object v27 = -41;
    Object v28 = -5;
    Object v29 = -13;
    Object v30 = 0;
    Object v31 = -1;
    Object v32 = 0;
    Object v33 = new java.util.Date((((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()),(((java.lang.Integer)v32).intValue()));
    Object v34 = java.util.TimeZone.getDefault();
    Object v35 = new org.jfree.data.time.Month(((java.util.Date)v33),((java.util.TimeZone)v34));
    Object v36 = ((org.jfree.data.time.TimeSeries)v15).createCopy(((org.jfree.data.time.RegularTimePeriod)v24),((org.jfree.data.time.RegularTimePeriod)v35));
    Object v37 = true;
    ((org.jfree.data.general.Series)v36).setNotify((((java.lang.Boolean)v37).booleanValue()));
    Object v38 = null;
    Object v39 = ((org.jfree.data.time.TimeSeries)v2).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v36));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = -41;
    Object v4 = -5;
    Object v5 = -13;
    Object v6 = 0;
    Object v7 = -1;
    Object v8 = 0;
    Object v9 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = java.util.TimeZone.getDefault();
    Object v11 = new org.jfree.data.time.Month(((java.util.Date)v9),((java.util.TimeZone)v10));
    Object v12 = 10.716754987984242D;
    Object v13 = ((org.jfree.data.time.TimeSeries)v2).addOrUpdate(((org.jfree.data.time.RegularTimePeriod)v11),((java.lang.Number)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    ((org.jfree.data.general.Series)v2).fireSeriesChanged();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = ((org.jfree.data.time.TimeSeries)v2).getMaximumItemAge();
    org.junit.Assert.assertEquals((Object)(9223372036854775807L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 53L;
    Object v4 = false;
    ((org.jfree.data.time.TimeSeries)v2).removeAgedItems((((java.lang.Long)v3).longValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = -22;
    Object v4 = 18;
    ((org.jfree.data.time.TimeSeries)v2).delete((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = -41;
    Object v4 = -5;
    Object v5 = -13;
    Object v6 = 0;
    Object v7 = -1;
    Object v8 = 0;
    Object v9 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = java.util.TimeZone.getDefault();
    Object v11 = new org.jfree.data.time.Month(((java.util.Date)v9),((java.util.TimeZone)v10));
    Object v12 = java.util.Calendar.getInstance();
    Object v13 = ((org.jfree.data.time.RegularTimePeriod)v11).getFirstMillisecond(((java.util.Calendar)v12));
    Object v14 = -41;
    Object v15 = -5;
    Object v16 = -13;
    Object v17 = 0;
    Object v18 = -1;
    Object v19 = 0;
    Object v20 = new java.util.Date((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = java.util.TimeZone.getDefault();
    Object v22 = new org.jfree.data.time.Month(((java.util.Date)v20),((java.util.TimeZone)v21));
    Object v23 = ((org.jfree.data.time.TimeSeries)v2).createCopy(((org.jfree.data.time.RegularTimePeriod)v11),((org.jfree.data.time.RegularTimePeriod)v22));
    Object v24 = true;
    ((org.jfree.data.time.TimeSeries)v23).removeAgedItems((((java.lang.Boolean)v24).booleanValue()));
    Object v25 = null;
    Object v26 = ((org.jfree.data.time.TimeSeries)v23).hashCode();
    org.junit.Assert.assertEquals((Object)(622061627), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = -41;
    Object v4 = -5;
    Object v5 = -13;
    Object v6 = 0;
    Object v7 = -1;
    Object v8 = 0;
    Object v9 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = java.util.TimeZone.getDefault();
    Object v11 = new org.jfree.data.time.Month(((java.util.Date)v9),((java.util.TimeZone)v10));
    Object v12 = ((org.jfree.data.time.RegularTimePeriod)v11).getLastMillisecond();
    Object v13 = -20.64170195363249D;
    ((org.jfree.data.time.TimeSeries)v2).update(((org.jfree.data.time.RegularTimePeriod)v11),((java.lang.Number)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = -41;
    Object v4 = -5;
    Object v5 = -13;
    Object v6 = 0;
    Object v7 = -1;
    Object v8 = 0;
    Object v9 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = java.util.TimeZone.getDefault();
    Object v11 = new org.jfree.data.time.Month(((java.util.Date)v9),((java.util.TimeZone)v10));
    Object v12 = java.util.Calendar.getInstance();
    Object v13 = ((org.jfree.data.time.RegularTimePeriod)v11).getFirstMillisecond(((java.util.Calendar)v12));
    Object v14 = -41;
    Object v15 = -5;
    Object v16 = -13;
    Object v17 = 0;
    Object v18 = -1;
    Object v19 = 0;
    Object v20 = new java.util.Date((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = java.util.TimeZone.getDefault();
    Object v22 = new org.jfree.data.time.Month(((java.util.Date)v20),((java.util.TimeZone)v21));
    Object v23 = ((org.jfree.data.time.TimeSeries)v2).createCopy(((org.jfree.data.time.RegularTimePeriod)v11),((org.jfree.data.time.RegularTimePeriod)v22));
    Object v24 = -41;
    Object v25 = -5;
    Object v26 = -13;
    Object v27 = 0;
    Object v28 = -1;
    Object v29 = 0;
    Object v30 = new java.util.Date((((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = java.util.TimeZone.getDefault();
    Object v32 = new org.jfree.data.time.Month(((java.util.Date)v30),((java.util.TimeZone)v31));
    Object v33 = -13.962658243522029D;
    ((org.jfree.data.time.TimeSeries)v23).update(((org.jfree.data.time.RegularTimePeriod)v32),((java.lang.Number)v33));
    Object v34 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 20;
    Object v4 = ((org.jfree.data.time.TimeSeries)v2).getValue((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -41;
    Object v7 = -5;
    Object v8 = -13;
    Object v9 = 0;
    Object v10 = -1;
    Object v11 = 0;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = java.util.TimeZone.getDefault();
    Object v14 = new org.jfree.data.time.Month(((java.util.Date)v12),((java.util.TimeZone)v13));
    ((org.jfree.data.time.TimeSeries)v5).delete(((org.jfree.data.time.RegularTimePeriod)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -41;
    Object v7 = -5;
    Object v8 = -13;
    Object v9 = 0;
    Object v10 = -1;
    Object v11 = 0;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = java.util.TimeZone.getDefault();
    Object v14 = new org.jfree.data.time.Month(((java.util.Date)v12),((java.util.TimeZone)v13));
    Object v15 = 86.01704040090596D;
    Object v16 = true;
    ((org.jfree.data.time.TimeSeries)v5).add(((org.jfree.data.time.RegularTimePeriod)v14),(((java.lang.Double)v15).doubleValue()),(((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0L;
    Object v7 = false;
    ((org.jfree.data.time.TimeSeries)v5).removeAgedItems((((java.lang.Long)v6).longValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = -9;
    Object v10 = 1;
    ((org.jfree.data.time.TimeSeries)v5).delete((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = -41;
    Object v4 = -5;
    Object v5 = -13;
    Object v6 = 0;
    Object v7 = -1;
    Object v8 = 0;
    Object v9 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = java.util.TimeZone.getDefault();
    Object v11 = new org.jfree.data.time.Month(((java.util.Date)v9),((java.util.TimeZone)v10));
    Object v12 = java.util.Calendar.getInstance();
    Object v13 = ((org.jfree.data.time.RegularTimePeriod)v11).getFirstMillisecond(((java.util.Calendar)v12));
    Object v14 = -41;
    Object v15 = -5;
    Object v16 = -13;
    Object v17 = 0;
    Object v18 = -1;
    Object v19 = 0;
    Object v20 = new java.util.Date((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = java.util.TimeZone.getDefault();
    Object v22 = new org.jfree.data.time.Month(((java.util.Date)v20),((java.util.TimeZone)v21));
    Object v23 = ((org.jfree.data.time.TimeSeries)v2).createCopy(((org.jfree.data.time.RegularTimePeriod)v11),((org.jfree.data.time.RegularTimePeriod)v22));
    Object v24 = 75;
    Object v25 = ((org.jfree.data.time.TimeSeries)v23).getValue((((java.lang.Integer)v24).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    ((org.jfree.data.general.Series)v5).setNotify((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v5).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -41;
    Object v7 = -5;
    Object v8 = -13;
    Object v9 = 0;
    Object v10 = -1;
    Object v11 = 0;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = java.util.TimeZone.getDefault();
    Object v14 = new org.jfree.data.time.Month(((java.util.Date)v12),((java.util.TimeZone)v13));
    Object v15 = ((org.jfree.data.time.TimeSeries)v5).getIndex(((org.jfree.data.time.RegularTimePeriod)v14));
    org.junit.Assert.assertEquals((Object)(-1), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    ((org.jfree.data.time.TimeSeries)v5).removeAgedItems((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = -41;
    Object v4 = -5;
    Object v5 = -13;
    Object v6 = 0;
    Object v7 = -1;
    Object v8 = 0;
    Object v9 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = java.util.TimeZone.getDefault();
    Object v11 = new org.jfree.data.time.Month(((java.util.Date)v9),((java.util.TimeZone)v10));
    Object v12 = java.util.Calendar.getInstance();
    Object v13 = ((org.jfree.data.time.RegularTimePeriod)v11).getFirstMillisecond(((java.util.Calendar)v12));
    Object v14 = -41;
    Object v15 = -5;
    Object v16 = -13;
    Object v17 = 0;
    Object v18 = -1;
    Object v19 = 0;
    Object v20 = new java.util.Date((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = java.util.TimeZone.getDefault();
    Object v22 = new org.jfree.data.time.Month(((java.util.Date)v20),((java.util.TimeZone)v21));
    Object v23 = ((org.jfree.data.time.TimeSeries)v2).createCopy(((org.jfree.data.time.RegularTimePeriod)v11),((org.jfree.data.time.RegularTimePeriod)v22));
    Object v24 = -41;
    Object v25 = -5;
    Object v26 = -13;
    Object v27 = 0;
    Object v28 = -1;
    Object v29 = 0;
    Object v30 = new java.util.Date((((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = java.util.TimeZone.getDefault();
    Object v32 = new org.jfree.data.time.Month(((java.util.Date)v30),((java.util.TimeZone)v31));
    Object v33 = ((org.jfree.data.time.TimeSeries)v23).getDataItem(((org.jfree.data.time.RegularTimePeriod)v32));
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = 0;
    Object v10 = 38;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = ((org.jfree.data.time.TimeSeries)v11).createCopy((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.jfree.data.time.TimeSeries)v5).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -41;
    Object v7 = -5;
    Object v8 = -13;
    Object v9 = 0;
    Object v10 = -1;
    Object v11 = 0;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = java.util.TimeZone.getDefault();
    Object v14 = new org.jfree.data.time.Month(((java.util.Date)v12),((java.util.TimeZone)v13));
    Object v15 = -67.78933731797912D;
    Object v16 = ((org.jfree.data.time.TimeSeries)v5).addOrUpdate(((org.jfree.data.time.RegularTimePeriod)v14),((java.lang.Number)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -41;
    Object v7 = -5;
    Object v8 = -13;
    Object v9 = 0;
    Object v10 = -1;
    Object v11 = 0;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = java.util.TimeZone.getDefault();
    Object v14 = new org.jfree.data.time.Month(((java.util.Date)v12),((java.util.TimeZone)v13));
    Object v15 = -40.9666390829074D;
    Object v16 = ((org.jfree.data.time.TimeSeries)v5).addOrUpdate(((org.jfree.data.time.RegularTimePeriod)v14),(((java.lang.Double)v15).doubleValue()));
    Object v17 = -41;
    Object v18 = -5;
    Object v19 = -13;
    Object v20 = 0;
    Object v21 = -1;
    Object v22 = 0;
    Object v23 = new java.util.Date((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = java.util.TimeZone.getDefault();
    Object v25 = new org.jfree.data.time.Month(((java.util.Date)v23),((java.util.TimeZone)v24));
    Object v26 = -41;
    Object v27 = -5;
    Object v28 = -13;
    Object v29 = 0;
    Object v30 = -1;
    Object v31 = 0;
    Object v32 = new java.util.Date((((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()),(((java.lang.Integer)v28).intValue()),(((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = java.util.TimeZone.getDefault();
    Object v34 = new org.jfree.data.time.Month(((java.util.Date)v32),((java.util.TimeZone)v33));
    Object v35 = ((org.jfree.data.time.RegularTimePeriod)v34).getMiddleMillisecond();
    Object v36 = ((org.jfree.data.time.TimeSeries)v5).createCopy(((org.jfree.data.time.RegularTimePeriod)v25),((org.jfree.data.time.RegularTimePeriod)v34));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jfree.data.time.TimeSeries)v5).getMaximumItemCount();
    org.junit.Assert.assertEquals((Object)(2147483647), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 1;
    Object v4 = ((org.jfree.data.time.TimeSeries)v2).getValue((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -41;
    Object v7 = -5;
    Object v8 = -13;
    Object v9 = 0;
    Object v10 = -1;
    Object v11 = 0;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = java.util.TimeZone.getDefault();
    Object v14 = new org.jfree.data.time.Month(((java.util.Date)v12),((java.util.TimeZone)v13));
    Object v15 = 30.782677797448514D;
    Object v16 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)v14),(((java.lang.Double)v15).doubleValue()));
    Object v17 = false;
    ((org.jfree.data.time.TimeSeries)v5).add(((org.jfree.data.time.TimeSeriesDataItem)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v18 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -41;
    Object v7 = -5;
    Object v8 = -13;
    Object v9 = 0;
    Object v10 = -1;
    Object v11 = 0;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = java.util.TimeZone.getDefault();
    Object v14 = new org.jfree.data.time.Month(((java.util.Date)v12),((java.util.TimeZone)v13));
    Object v15 = ((org.jfree.data.time.TimeSeries)v5).getValue(((org.jfree.data.time.RegularTimePeriod)v14));
    Object v16 = -41;
    Object v17 = -5;
    Object v18 = -13;
    Object v19 = 0;
    Object v20 = -1;
    Object v21 = 0;
    Object v22 = new java.util.Date((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = java.util.TimeZone.getDefault();
    Object v24 = new org.jfree.data.time.Month(((java.util.Date)v22),((java.util.TimeZone)v23));
    Object v25 = ((org.jfree.data.time.TimeSeries)v5).getValue(((org.jfree.data.time.RegularTimePeriod)v24));
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -41;
    Object v10 = -5;
    Object v11 = -13;
    Object v12 = 0;
    Object v13 = -1;
    Object v14 = 0;
    Object v15 = new java.util.Date((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = java.util.TimeZone.getDefault();
    Object v17 = new org.jfree.data.time.Month(((java.util.Date)v15),((java.util.TimeZone)v16));
    ((org.jfree.data.time.TimeSeries)v8).delete(((org.jfree.data.time.RegularTimePeriod)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -41;
    Object v10 = -5;
    Object v11 = -13;
    Object v12 = 0;
    Object v13 = -1;
    Object v14 = 0;
    Object v15 = new java.util.Date((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = java.util.TimeZone.getDefault();
    Object v17 = new org.jfree.data.time.Month(((java.util.Date)v15),((java.util.TimeZone)v16));
    Object v18 = ((org.jfree.data.time.TimeSeries)v8).getIndex(((org.jfree.data.time.RegularTimePeriod)v17));
    org.junit.Assert.assertEquals((Object)(-1), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -41;
    Object v7 = -5;
    Object v8 = -13;
    Object v9 = 0;
    Object v10 = -1;
    Object v11 = 0;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = java.util.TimeZone.getDefault();
    Object v14 = new org.jfree.data.time.Month(((java.util.Date)v12),((java.util.TimeZone)v13));
    Object v15 = -41;
    Object v16 = -5;
    Object v17 = -13;
    Object v18 = 0;
    Object v19 = -1;
    Object v20 = 0;
    Object v21 = new java.util.Date((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = java.util.TimeZone.getDefault();
    Object v23 = new org.jfree.data.time.Month(((java.util.Date)v21),((java.util.TimeZone)v22));
    Object v24 = ((org.jfree.data.time.TimeSeries)v5).createCopy(((org.jfree.data.time.RegularTimePeriod)v14),((org.jfree.data.time.RegularTimePeriod)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -41;
    Object v10 = -5;
    Object v11 = -13;
    Object v12 = 0;
    Object v13 = -1;
    Object v14 = 0;
    Object v15 = new java.util.Date((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = java.util.TimeZone.getDefault();
    Object v17 = new org.jfree.data.time.Month(((java.util.Date)v15),((java.util.TimeZone)v16));
    ((org.jfree.data.general.Series)v8).setKey(((java.lang.Comparable)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jfree.data.general.Series)v5).getDescription();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    ((org.jfree.data.general.Series)v5).setNotify((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -41;
    Object v7 = -5;
    Object v8 = -13;
    Object v9 = 0;
    Object v10 = -1;
    Object v11 = 0;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = java.util.TimeZone.getDefault();
    Object v14 = new org.jfree.data.time.Month(((java.util.Date)v12),((java.util.TimeZone)v13));
    Object v15 = -41;
    Object v16 = -5;
    Object v17 = -13;
    Object v18 = 0;
    Object v19 = -1;
    Object v20 = 0;
    Object v21 = new java.util.Date((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = java.util.TimeZone.getDefault();
    Object v23 = new org.jfree.data.time.Month(((java.util.Date)v21),((java.util.TimeZone)v22));
    Object v24 = ((org.jfree.data.time.TimeSeries)v5).createCopy(((org.jfree.data.time.RegularTimePeriod)v14),((org.jfree.data.time.RegularTimePeriod)v23));
    Object v25 = ((org.jfree.data.time.TimeSeries)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(622061627), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1L;
    ((org.jfree.data.time.TimeSeries)v8).setMaximumItemAge((((java.lang.Long)v9).longValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v5).equals(((java.lang.Object)v8));
    Object v10 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    ((org.jfree.data.general.Series)v8).fireSeriesChanged();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.jfree.data.xy.VectorSeriesCollection();
    ((org.jfree.data.general.Series)v5).addChangeListener(((org.jfree.data.general.SeriesChangeListener)v6));
    Object v7 = null;
    Object v8 = new org.jfree.data.xy.VectorSeriesCollection();
    ((org.jfree.data.general.Series)v5).removeChangeListener(((org.jfree.data.general.SeriesChangeListener)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    ((org.jfree.data.time.TimeSeries)v8).setMaximumItemCount((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = 0;
    Object v10 = 38;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = ((org.jfree.data.time.TimeSeries)v11).createCopy((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.jfree.data.time.TimeSeries)v5).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v5).equals(((java.lang.Object)v8));
    Object v10 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v9));
    Object v11 = ((org.jfree.data.time.TimeSeries)v10).hashCode();
    org.junit.Assert.assertEquals((Object)(1174257392), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    ((org.jfree.data.general.Series)v5).setNotify((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = 0;
    ((org.jfree.data.time.TimeSeries)v5).setMaximumItemCount((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = 25;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    ((org.jfree.data.time.TimeSeries)v8).clear();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = 0;
    Object v10 = 38;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = ((org.jfree.data.time.TimeSeries)v11).createCopy((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.jfree.data.time.TimeSeries)v5).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v14));
    Object v16 = -41;
    Object v17 = -5;
    Object v18 = -13;
    Object v19 = 0;
    Object v20 = -1;
    Object v21 = 0;
    Object v22 = new java.util.Date((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = java.util.TimeZone.getDefault();
    Object v24 = new org.jfree.data.time.Month(((java.util.Date)v22),((java.util.TimeZone)v23));
    Object v25 = ((org.jfree.data.time.TimeSeries)v15).getValue(((org.jfree.data.time.RegularTimePeriod)v24));
    Object v26 = ((org.jfree.data.time.TimeSeries)v15).hashCode();
    org.junit.Assert.assertEquals((Object)(773771031), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v5).equals(((java.lang.Object)v8));
    Object v10 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v9));
    Object v11 = 1L;
    Object v12 = true;
    ((org.jfree.data.time.TimeSeries)v10).removeAgedItems((((java.lang.Long)v11).longValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -41;
    Object v7 = -5;
    Object v8 = -13;
    Object v9 = 0;
    Object v10 = -1;
    Object v11 = 0;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = java.util.TimeZone.getDefault();
    Object v14 = new org.jfree.data.time.Month(((java.util.Date)v12),((java.util.TimeZone)v13));
    Object v15 = ((org.jfree.data.time.TimeSeries)v5).getDataItem(((org.jfree.data.time.RegularTimePeriod)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -41;
    Object v10 = -5;
    Object v11 = -13;
    Object v12 = 0;
    Object v13 = -1;
    Object v14 = 0;
    Object v15 = new java.util.Date((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = java.util.TimeZone.getDefault();
    Object v17 = new org.jfree.data.time.Month(((java.util.Date)v15),((java.util.TimeZone)v16));
    Object v18 = 30.782677797448514D;
    Object v19 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)v17),(((java.lang.Double)v18).doubleValue()));
    Object v20 = 82;
    Object v21 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.jfree.data.time.TimeSeriesDataItem)v19).compareTo(((java.lang.Object)v21));
    Object v23 = false;
    ((org.jfree.data.time.TimeSeries)v8).add(((org.jfree.data.time.TimeSeriesDataItem)v19),(((java.lang.Boolean)v23).booleanValue()));
    Object v24 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 82;
    Object v10 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v9).intValue()));
    Object v11 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v10));
    Object v12 = 0;
    Object v13 = 38;
    Object v14 = ((org.jfree.data.time.TimeSeries)v11).createCopy((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = 0;
    Object v16 = 1;
    Object v17 = ((org.jfree.data.time.TimeSeries)v14).createCopy((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = -41;
    Object v19 = -5;
    Object v20 = -13;
    Object v21 = 0;
    Object v22 = -1;
    Object v23 = 0;
    Object v24 = new java.util.Date((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = java.util.TimeZone.getDefault();
    Object v26 = new org.jfree.data.time.Month(((java.util.Date)v24),((java.util.TimeZone)v25));
    Object v27 = ((org.jfree.data.time.TimeSeries)v17).getIndex(((org.jfree.data.time.RegularTimePeriod)v26));
    Object v28 = ((org.jfree.data.time.TimeSeries)v8).equals(((java.lang.Object)v27));
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = 0;
    Object v10 = 38;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = ((org.jfree.data.time.TimeSeries)v11).createCopy((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.jfree.data.time.TimeSeries)v5).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v14));
    Object v16 = 0;
    ((org.jfree.data.time.TimeSeries)v15).setMaximumItemCount((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = -41;
    Object v19 = -5;
    Object v20 = -13;
    Object v21 = 0;
    Object v22 = -1;
    Object v23 = 0;
    Object v24 = new java.util.Date((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = java.util.TimeZone.getDefault();
    Object v26 = new org.jfree.data.time.Month(((java.util.Date)v24),((java.util.TimeZone)v25));
    Object v27 = ((org.jfree.data.time.TimeSeries)v15).equals(((java.lang.Object)v26));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = 25;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = -41;
    Object v13 = -5;
    Object v14 = -13;
    Object v15 = 0;
    Object v16 = -1;
    Object v17 = 0;
    Object v18 = new java.util.Date((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = java.util.TimeZone.getDefault();
    Object v20 = new org.jfree.data.time.Month(((java.util.Date)v18),((java.util.TimeZone)v19));
    Object v21 = 30.782677797448514D;
    Object v22 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)v20),(((java.lang.Double)v21).doubleValue()));
    Object v23 = 1;
    ((org.jfree.data.time.TimeSeriesDataItem)v22).setValue(((java.lang.Number)v23));
    Object v24 = null;
    ((org.jfree.data.time.TimeSeries)v11).add(((org.jfree.data.time.TimeSeriesDataItem)v22));
    Object v25 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = 25;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((org.jfree.data.general.Series)v11).fireSeriesChanged();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v5).equals(((java.lang.Object)v8));
    Object v10 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v9));
    Object v11 = -41;
    Object v12 = -5;
    Object v13 = -13;
    Object v14 = 0;
    Object v15 = -1;
    Object v16 = 0;
    Object v17 = new java.util.Date((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = java.util.TimeZone.getDefault();
    Object v19 = new org.jfree.data.time.Month(((java.util.Date)v17),((java.util.TimeZone)v18));
    Object v20 = ((org.jfree.data.time.TimeSeries)v10).getValue(((org.jfree.data.time.RegularTimePeriod)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = 25;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "Null 'paint' argumentY.";
    ((org.jfree.data.general.Series)v11).setDescription(((java.lang.String)v12));
    Object v13 = null;
    ((org.jfree.data.time.TimeSeries)v11).clear();
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = 25;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = -41;
    Object v13 = -5;
    Object v14 = -13;
    Object v15 = 0;
    Object v16 = -1;
    Object v17 = 0;
    Object v18 = new java.util.Date((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = java.util.TimeZone.getDefault();
    Object v20 = new org.jfree.data.time.Month(((java.util.Date)v18),((java.util.TimeZone)v19));
    Object v21 = ((org.jfree.data.time.TimeSeries)v11).getIndex(((org.jfree.data.time.RegularTimePeriod)v20));
    org.junit.Assert.assertEquals((Object)(-1), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 82;
    Object v10 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v9).intValue()));
    Object v11 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v10));
    Object v12 = ((org.jfree.data.time.TimeSeries)v11).getMaximumItemAge();
    ((org.jfree.data.general.Series)v8).setKey(((java.lang.Comparable)v12));
    Object v13 = null;
    ((org.jfree.data.general.Series)v8).fireSeriesChanged();
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    ((org.jfree.data.general.Series)v5).setNotify((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = -41;
    Object v9 = -5;
    Object v10 = -13;
    Object v11 = 0;
    Object v12 = -1;
    Object v13 = 0;
    Object v14 = new java.util.Date((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = java.util.TimeZone.getDefault();
    Object v16 = new org.jfree.data.time.Month(((java.util.Date)v14),((java.util.TimeZone)v15));
    Object v17 = ((org.jfree.data.time.TimeSeries)v5).getDataItem(((org.jfree.data.time.RegularTimePeriod)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = 25;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.jfree.data.general.Series)v11).isEmpty();
    Object v13 = -41;
    Object v14 = -5;
    Object v15 = -13;
    Object v16 = 0;
    Object v17 = -1;
    Object v18 = 0;
    Object v19 = new java.util.Date((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = java.util.TimeZone.getDefault();
    Object v21 = new org.jfree.data.time.Month(((java.util.Date)v19),((java.util.TimeZone)v20));
    Object v22 = -24.03506028188152D;
    ((org.jfree.data.time.TimeSeries)v11).update(((org.jfree.data.time.RegularTimePeriod)v21),((java.lang.Number)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = 0;
    Object v10 = 38;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = ((org.jfree.data.time.TimeSeries)v11).createCopy((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.jfree.data.time.TimeSeries)v5).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v14));
    Object v16 = -41;
    Object v17 = -5;
    Object v18 = -13;
    Object v19 = 0;
    Object v20 = -1;
    Object v21 = 0;
    Object v22 = new java.util.Date((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = java.util.TimeZone.getDefault();
    Object v24 = new org.jfree.data.time.Month(((java.util.Date)v22),((java.util.TimeZone)v23));
    Object v25 = 30.782677797448514D;
    Object v26 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)v24),(((java.lang.Double)v25).doubleValue()));
    Object v27 = true;
    ((org.jfree.data.time.TimeSeries)v15).add(((org.jfree.data.time.TimeSeriesDataItem)v26),(((java.lang.Boolean)v27).booleanValue()));
    Object v28 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = 25;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = -6;
    Object v13 = 0;
    Object v14 = ((org.jfree.data.time.TimeSeries)v11).createCopy((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = 0;
    Object v10 = 38;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = ((org.jfree.data.time.TimeSeries)v11).createCopy((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.jfree.data.time.TimeSeries)v5).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v14));
    Object v16 = -41;
    Object v17 = -5;
    Object v18 = -13;
    Object v19 = 0;
    Object v20 = -1;
    Object v21 = 0;
    Object v22 = new java.util.Date((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = java.util.TimeZone.getDefault();
    Object v24 = new org.jfree.data.time.Month(((java.util.Date)v22),((java.util.TimeZone)v23));
    Object v25 = 0;
    Object v26 = ((org.jfree.data.time.TimeSeries)v15).addOrUpdate(((org.jfree.data.time.RegularTimePeriod)v24),((java.lang.Number)v25));
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -6;
    Object v7 = 23;
    ((org.jfree.data.time.TimeSeries)v5).delete((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = 0;
    Object v10 = 38;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 82;
    Object v13 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v12).intValue()));
    Object v14 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v13));
    Object v15 = 0;
    Object v16 = 38;
    Object v17 = ((org.jfree.data.time.TimeSeries)v14).createCopy((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = 0;
    Object v19 = 1;
    Object v20 = ((org.jfree.data.time.TimeSeries)v17).createCopy((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.jfree.data.time.TimeSeries)v11).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v20));
    Object v22 = ((org.jfree.data.time.TimeSeries)v5).getTimePeriodsUniqueToOtherSeries(((org.jfree.data.time.TimeSeries)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -41;
    Object v7 = -5;
    Object v8 = -13;
    Object v9 = 0;
    Object v10 = -1;
    Object v11 = 0;
    Object v12 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = java.util.TimeZone.getDefault();
    Object v14 = new org.jfree.data.time.Month(((java.util.Date)v12),((java.util.TimeZone)v13));
    Object v15 = 30.848235713522108D;
    ((org.jfree.data.time.TimeSeries)v5).update(((org.jfree.data.time.RegularTimePeriod)v14),((java.lang.Number)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v5).equals(((java.lang.Object)v8));
    Object v10 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v9));
    Object v11 = -37L;
    ((org.jfree.data.time.TimeSeries)v10).setMaximumItemAge((((java.lang.Long)v11).longValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jfree.data.time.TimeSeries)v5).getDomainDescription();
    org.junit.Assert.assertEquals((Object)("Time"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = -41;
    Object v4 = -5;
    Object v5 = -13;
    Object v6 = 0;
    Object v7 = -1;
    Object v8 = 0;
    Object v9 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = java.util.TimeZone.getDefault();
    Object v11 = new org.jfree.data.time.Month(((java.util.Date)v9),((java.util.TimeZone)v10));
    Object v12 = java.util.Calendar.getInstance();
    Object v13 = ((org.jfree.data.time.RegularTimePeriod)v11).getFirstMillisecond(((java.util.Calendar)v12));
    Object v14 = -41;
    Object v15 = -5;
    Object v16 = -13;
    Object v17 = 0;
    Object v18 = -1;
    Object v19 = 0;
    Object v20 = new java.util.Date((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = java.util.TimeZone.getDefault();
    Object v22 = new org.jfree.data.time.Month(((java.util.Date)v20),((java.util.TimeZone)v21));
    Object v23 = ((org.jfree.data.time.TimeSeries)v2).createCopy(((org.jfree.data.time.RegularTimePeriod)v11),((org.jfree.data.time.RegularTimePeriod)v22));
    Object v24 = 0L;
    Object v25 = false;
    ((org.jfree.data.time.TimeSeries)v23).removeAgedItems((((java.lang.Long)v24).longValue()),(((java.lang.Boolean)v25).booleanValue()));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = 25;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.jfree.data.general.Series)v11).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = 25;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = -41;
    Object v13 = -5;
    Object v14 = -13;
    Object v15 = 0;
    Object v16 = -1;
    Object v17 = 0;
    Object v18 = new java.util.Date((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = java.util.TimeZone.getDefault();
    Object v20 = new org.jfree.data.time.Month(((java.util.Date)v18),((java.util.TimeZone)v19));
    Object v21 = 0;
    Object v22 = ((org.jfree.data.time.TimeSeries)v11).addOrUpdate(((org.jfree.data.time.RegularTimePeriod)v20),((java.lang.Number)v21));
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 82;
    Object v10 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v9).intValue()));
    Object v11 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v10));
    Object v12 = 0;
    Object v13 = 38;
    Object v14 = ((org.jfree.data.time.TimeSeries)v11).createCopy((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.jfree.data.time.TimeSeries)v14).getDomainDescription();
    Object v16 = ((org.jfree.data.time.TimeSeries)v8).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v5).equals(((java.lang.Object)v8));
    Object v10 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v9));
    Object v11 = 82;
    Object v12 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v11).intValue()));
    ((org.jfree.data.general.Series)v10).setKey(((java.lang.Comparable)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v5).equals(((java.lang.Object)v8));
    Object v10 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v9));
    Object v11 = -41;
    Object v12 = -5;
    Object v13 = -13;
    Object v14 = 0;
    Object v15 = -1;
    Object v16 = 0;
    Object v17 = new java.util.Date((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = java.util.TimeZone.getDefault();
    Object v19 = new org.jfree.data.time.Month(((java.util.Date)v17),((java.util.TimeZone)v18));
    Object v20 = -41;
    Object v21 = -5;
    Object v22 = -13;
    Object v23 = 0;
    Object v24 = -1;
    Object v25 = 0;
    Object v26 = new java.util.Date((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = java.util.TimeZone.getDefault();
    Object v28 = new org.jfree.data.time.Month(((java.util.Date)v26),((java.util.TimeZone)v27));
    Object v29 = ((org.jfree.data.time.TimeSeries)v10).createCopy(((org.jfree.data.time.RegularTimePeriod)v19),((org.jfree.data.time.RegularTimePeriod)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = 0;
    Object v10 = 38;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = ((org.jfree.data.time.TimeSeries)v11).createCopy((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.jfree.data.time.TimeSeries)v5).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v14));
    Object v16 = -41;
    Object v17 = -5;
    Object v18 = -13;
    Object v19 = 0;
    Object v20 = -1;
    Object v21 = 0;
    Object v22 = new java.util.Date((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = java.util.TimeZone.getDefault();
    Object v24 = new org.jfree.data.time.Month(((java.util.Date)v22),((java.util.TimeZone)v23));
    Object v25 = -28.71544369536583D;
    Object v26 = false;
    ((org.jfree.data.time.TimeSeries)v15).add(((org.jfree.data.time.RegularTimePeriod)v24),(((java.lang.Double)v25).doubleValue()),(((java.lang.Boolean)v26).booleanValue()));
    Object v27 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = 71;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 82;
    Object v10 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v9).intValue()));
    Object v11 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v10));
    Object v12 = 0;
    Object v13 = 38;
    Object v14 = ((org.jfree.data.time.TimeSeries)v11).createCopy((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = 0;
    Object v16 = 1;
    Object v17 = ((org.jfree.data.time.TimeSeries)v14).createCopy((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = 0;
    Object v19 = 25;
    Object v20 = ((org.jfree.data.time.TimeSeries)v17).createCopy((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.jfree.data.time.TimeSeries)v8).equals(((java.lang.Object)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = 0;
    Object v10 = 38;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = ((org.jfree.data.time.TimeSeries)v11).createCopy((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.jfree.data.time.TimeSeries)v5).addAndOrUpdate(((org.jfree.data.time.TimeSeries)v14));
    Object v16 = -41;
    Object v17 = -5;
    Object v18 = -13;
    Object v19 = 0;
    Object v20 = -1;
    Object v21 = 0;
    Object v22 = new java.util.Date((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = java.util.TimeZone.getDefault();
    Object v24 = new org.jfree.data.time.Month(((java.util.Date)v22),((java.util.TimeZone)v23));
    ((org.jfree.data.time.TimeSeries)v15).delete(((org.jfree.data.time.RegularTimePeriod)v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -41;
    Object v10 = -5;
    Object v11 = -13;
    Object v12 = 0;
    Object v13 = -1;
    Object v14 = 0;
    Object v15 = new java.util.Date((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = java.util.TimeZone.getDefault();
    Object v17 = new org.jfree.data.time.Month(((java.util.Date)v15),((java.util.TimeZone)v16));
    Object v18 = -19.786001188064187D;
    Object v19 = ((org.jfree.data.time.TimeSeries)v8).addOrUpdate(((org.jfree.data.time.RegularTimePeriod)v17),(((java.lang.Double)v18).doubleValue()));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.time.TimeSeries)v5).equals(((java.lang.Object)v8));
    Object v10 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v9));
    Object v11 = -41;
    Object v12 = -5;
    Object v13 = -13;
    Object v14 = 0;
    Object v15 = -1;
    Object v16 = 0;
    Object v17 = new java.util.Date((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = java.util.TimeZone.getDefault();
    Object v19 = new org.jfree.data.time.Month(((java.util.Date)v17),((java.util.TimeZone)v18));
    Object v20 = 0.0D;
    Object v21 = ((org.jfree.data.time.TimeSeries)v10).addOrUpdate(((org.jfree.data.time.RegularTimePeriod)v19),(((java.lang.Double)v20).doubleValue()));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = 71;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = -41;
    Object v13 = -5;
    Object v14 = -13;
    Object v15 = 0;
    Object v16 = -1;
    Object v17 = 0;
    Object v18 = new java.util.Date((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = java.util.TimeZone.getDefault();
    Object v20 = new org.jfree.data.time.Month(((java.util.Date)v18),((java.util.TimeZone)v19));
    Object v21 = 30.782677797448514D;
    Object v22 = new org.jfree.data.time.TimeSeriesDataItem(((org.jfree.data.time.RegularTimePeriod)v20),(((java.lang.Double)v21).doubleValue()));
    Object v23 = true;
    ((org.jfree.data.time.TimeSeries)v11).add(((org.jfree.data.time.TimeSeriesDataItem)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v24 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "\"-";
    ((org.jfree.data.general.Series)v8).setDescription(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = 82;
    Object v12 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v11).intValue()));
    ((org.jfree.data.general.Series)v8).setKey(((java.lang.Comparable)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jfree.data.time.TimeSeries)v5).getTimePeriods();
    Object v7 = ((org.jfree.data.time.TimeSeries)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(622061627), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = 25;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.jfree.data.time.TimeSeries)v11).getNextTimePeriod();
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 0;
    Object v1 = 82;
    Object v2 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = org.jfree.data.time.SerialDate.addYears((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.SerialDate)v2));
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 0;
    Object v1 = 82;
    Object v2 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = org.jfree.data.time.SerialDate.addYears((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.SerialDate)v2));
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = false;
    ((org.jfree.data.general.Series)v4).setNotify((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = 25;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = -41;
    Object v13 = -5;
    Object v14 = -13;
    Object v15 = 0;
    Object v16 = -1;
    Object v17 = 0;
    Object v18 = new java.util.Date((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = java.util.TimeZone.getDefault();
    Object v20 = new org.jfree.data.time.Month(((java.util.Date)v18),((java.util.TimeZone)v19));
    Object v21 = 0.0D;
    Object v22 = true;
    ((org.jfree.data.time.TimeSeries)v11).add(((org.jfree.data.time.RegularTimePeriod)v20),(((java.lang.Double)v21).doubleValue()),(((java.lang.Boolean)v22).booleanValue()));
    Object v23 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 82;
    Object v2 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = org.jfree.data.time.SerialDate.addYears((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.SerialDate)v2));
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = -41;
    Object v6 = -5;
    Object v7 = -13;
    Object v8 = 0;
    Object v9 = -1;
    Object v10 = 0;
    Object v11 = new java.util.Date((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = java.util.TimeZone.getDefault();
    Object v13 = new org.jfree.data.time.Month(((java.util.Date)v11),((java.util.TimeZone)v12));
    Object v14 = 4.275206117576477D;
    ((org.jfree.data.time.TimeSeries)v4).add(((org.jfree.data.time.RegularTimePeriod)v13),((java.lang.Number)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected org.jfree.data.general.SeriesException");
    } catch (org.jfree.data.general.SeriesException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 0;
    Object v1 = 82;
    Object v2 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = org.jfree.data.time.SerialDate.addYears((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.SerialDate)v2));
    Object v4 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v3));
    Object v5 = 21;
    ((org.jfree.data.time.TimeSeries)v4).setMaximumItemCount((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = ((org.jfree.data.time.TimeSeries)v5).createCopy((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = 71;
    Object v11 = ((org.jfree.data.time.TimeSeries)v8).createCopy((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = false;
    ((org.jfree.data.time.TimeSeries)v11).removeAgedItems((((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = 82;
    Object v1 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.jfree.data.time.TimeSeries(((java.lang.Comparable)v1));
    Object v3 = 0;
    Object v4 = 38;
    Object v5 = ((org.jfree.data.time.TimeSeries)v2).createCopy((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -31;
    Object v7 = ((org.jfree.data.time.TimeSeries)v5).getTimePeriod((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }
}
