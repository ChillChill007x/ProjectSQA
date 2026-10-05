package org.joda.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 36;
    Object v8 = org.joda.time.Hours.hours((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.LocalDate)v6).plus(((org.joda.time.ReadablePeriod)v8));
    Object v10 = org.joda.time.DurationFieldType.centuries();
    Object v11 = 0;
    Object v12 = ((org.joda.time.LocalDate)v6).withFieldAdded(((org.joda.time.DurationFieldType)v10),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = ((org.joda.time.base.AbstractPartial)v6).getFieldTypes();
    Object v8 = org.joda.time.DateTimeFieldType.monthOfYear();
    Object v9 = ((org.joda.time.LocalDate)v6).get(((org.joda.time.DateTimeFieldType)v8));
    org.junit.Assert.assertEquals((Object)(1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = org.joda.time.DateTimeFieldType.monthOfYear();
    Object v8 = ((org.joda.time.base.AbstractPartial)v6).indexOf(((org.joda.time.DateTimeFieldType)v7));
    org.junit.Assert.assertEquals((Object)(1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = -4;
    Object v8 = ((org.joda.time.LocalDate)v6).plusMonths((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = "Invalid min days ";
    Object v8 = "The DateTimeFieldType must not be null";
    Object v9 = 41;
    Object v10 = 1;
    Object v11 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.joda.time.LocalDate)v6).toDateTimeAtStartOfDay(((org.joda.time.DateTimeZone)v11));
    Object v13 = 0;
    Object v14 = ((org.joda.time.LocalDate)v6).plusYears((((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = -7;
    Object v8 = ((org.joda.time.LocalDate)v6).minusDays((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 20L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = ((java.util.Date)v1).getMinutes();
    Object v3 = org.joda.time.LocalDate.fromDateFields(((java.util.Date)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 20L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = ((java.util.Date)v1).getMinutes();
    Object v3 = org.joda.time.LocalDate.fromDateFields(((java.util.Date)v1));
    Object v4 = org.joda.time.DurationFieldType.centuries();
    Object v5 = ((org.joda.time.LocalDate)v3).isSupported(((org.joda.time.DurationFieldType)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 1L;
    Object v8 = ((org.joda.time.LocalDate)v6).withLocalMillis((((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = ((org.joda.time.LocalDate)v6).getWeekOfWeekyear();
    org.junit.Assert.assertEquals((Object)(1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 22;
    Object v8 = ((org.joda.time.LocalDate)v6).plusDays((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = "Invalid min days ";
    Object v8 = "The DateTimeFieldType must not be null";
    Object v9 = 41;
    Object v10 = 1;
    Object v11 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.joda.time.LocalDate)v6).toDateTimeAtStartOfDay(((org.joda.time.DateTimeZone)v11));
    Object v13 = 0;
    Object v14 = ((org.joda.time.LocalDate)v6).plusYears((((java.lang.Integer)v13).intValue()));
    Object v15 = 0;
    Object v16 = 0;
    Object v17 = 1;
    Object v18 = 1;
    Object v19 = new org.joda.time.LocalTime((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((org.joda.time.LocalDate)v14).toLocalDateTime(((org.joda.time.LocalTime)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = ((org.joda.time.base.AbstractPartial)v6).getFieldTypes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 48;
    Object v8 = ((org.joda.time.LocalDate)v6).minusDays((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.util.Locale.getDefault();
    Object v1 = java.util.Calendar.getInstance(((java.util.Locale)v0));
    Object v2 = org.joda.time.LocalDate.fromCalendarFields(((java.util.Calendar)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = "Invalid min days ";
    Object v8 = "The DateTimeFieldType must not be null";
    Object v9 = 41;
    Object v10 = 1;
    Object v11 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.joda.time.LocalDate)v6).toDateTimeAtStartOfDay(((org.joda.time.DateTimeZone)v11));
    Object v13 = 0;
    Object v14 = ((org.joda.time.LocalDate)v6).plusYears((((java.lang.Integer)v13).intValue()));
    Object v15 = org.joda.time.DurationFieldType.centuries();
    Object v16 = ((org.joda.time.LocalDate)v14).isSupported(((org.joda.time.DurationFieldType)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)v0));
    Object v2 = 1;
    Object v3 = ((org.joda.time.LocalDate)v1).plusYears((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)v0));
    Object v2 = 1;
    Object v3 = ((org.joda.time.LocalDate)v1).plusYears((((java.lang.Integer)v2).intValue()));
    Object v4 = 38L;
    Object v5 = "Invalid min days ";
    Object v6 = "The DateTimeFieldType must not be null";
    Object v7 = 41;
    Object v8 = 1;
    Object v9 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new org.joda.time.LocalDate((((java.lang.Long)v4).longValue()),((org.joda.time.DateTimeZone)v9));
    Object v11 = 22;
    Object v12 = ((org.joda.time.LocalDate)v10).plusDays((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.joda.time.base.AbstractPartial)v3).isEqual(((org.joda.time.ReadablePartial)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = ((org.joda.time.LocalDate)v6).weekyear();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 36;
    Object v8 = org.joda.time.Hours.hours((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.LocalDate)v6).plus(((org.joda.time.ReadablePeriod)v8));
    Object v10 = org.joda.time.DurationFieldType.centuries();
    Object v11 = 0;
    Object v12 = ((org.joda.time.LocalDate)v6).withFieldAdded(((org.joda.time.DurationFieldType)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = 19;
    Object v14 = ((org.joda.time.LocalDate)v12).minusMonths((((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = java.util.Locale.getDefault();
    Object v1 = java.util.Calendar.getInstance(((java.util.Locale)v0));
    Object v2 = org.joda.time.LocalDate.fromCalendarFields(((java.util.Calendar)v1));
    Object v3 = "Invalid min days ";
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = 41;
    Object v6 = 1;
    Object v7 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.DateTime.now(((org.joda.time.DateTimeZone)v7));
    Object v9 = ((org.joda.time.LocalDate)v2).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 48;
    Object v8 = ((org.joda.time.LocalDate)v6).minusDays((((java.lang.Integer)v7).intValue()));
    Object v9 = 38L;
    Object v10 = "Invalid min days ";
    Object v11 = "The DateTimeFieldType must not be null";
    Object v12 = 41;
    Object v13 = 1;
    Object v14 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new org.joda.time.LocalDate((((java.lang.Long)v9).longValue()),((org.joda.time.DateTimeZone)v14));
    Object v16 = 36;
    Object v17 = org.joda.time.Hours.hours((((java.lang.Integer)v16).intValue()));
    Object v18 = ((org.joda.time.LocalDate)v15).plus(((org.joda.time.ReadablePeriod)v17));
    Object v19 = org.joda.time.DurationFieldType.centuries();
    Object v20 = 0;
    Object v21 = ((org.joda.time.LocalDate)v15).withFieldAdded(((org.joda.time.DurationFieldType)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.joda.time.LocalDate)v8).equals(((java.lang.Object)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 0L;
    Object v1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v2 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 0L;
    Object v1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v2 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1));
    Object v3 = 1;
    Object v4 = ((org.joda.time.LocalDate)v2).withYear((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = ((org.joda.time.LocalDate)v2).plusWeeks((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = "Invalid min days ";
    Object v8 = "The DateTimeFieldType must not be null";
    Object v9 = 41;
    Object v10 = 1;
    Object v11 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.joda.time.LocalDate)v6).toDateTimeAtStartOfDay(((org.joda.time.DateTimeZone)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = java.util.Locale.getDefault();
    Object v1 = java.util.Calendar.getInstance(((java.util.Locale)v0));
    Object v2 = org.joda.time.LocalDate.fromCalendarFields(((java.util.Calendar)v1));
    Object v3 = 38L;
    Object v4 = "Invalid min days ";
    Object v5 = "The DateTimeFieldType must not be null";
    Object v6 = 41;
    Object v7 = 1;
    Object v8 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.LocalDate)v2).equals(((java.lang.Object)v9));
    Object v11 = "Year";
    Object v12 = java.util.Locale.getDefault();
    Object v13 = ((org.joda.time.LocalDate)v2).toString(((java.lang.String)v11),((java.util.Locale)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
    Object v8 = ((org.joda.time.base.AbstractPartial)v6).toString(((org.joda.time.format.DateTimeFormatter)v7));
    org.junit.Assert.assertEquals((Object)("1970-001T\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.000"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = ((org.joda.time.base.AbstractPartial)v6).hashCode();
    Object v8 = ((org.joda.time.base.AbstractPartial)v6).getValues();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 38L;
    Object v8 = "Invalid min days ";
    Object v9 = "The DateTimeFieldType must not be null";
    Object v10 = 41;
    Object v11 = 1;
    Object v12 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new org.joda.time.LocalDate((((java.lang.Long)v7).longValue()),((org.joda.time.DateTimeZone)v12));
    Object v14 = ((org.joda.time.base.AbstractPartial)v6).isAfter(((org.joda.time.ReadablePartial)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)v0));
    Object v2 = 1;
    Object v3 = ((org.joda.time.LocalDate)v1).plusYears((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.joda.time.LocalDate)v3).getYearOfEra();
    org.junit.Assert.assertEquals((Object)(2027), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)v0));
    Object v2 = 1;
    Object v3 = ((org.joda.time.LocalDate)v1).plusYears((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = 1;
    Object v7 = 1;
    Object v8 = new org.joda.time.LocalTime((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "Invalid min days ";
    Object v10 = "The DateTimeFieldType must not be null";
    Object v11 = 41;
    Object v12 = 1;
    Object v13 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.LocalDate)v3).toDateTime(((org.joda.time.LocalTime)v8),((org.joda.time.DateTimeZone)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 20L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = org.joda.time.LocalDate.fromDateFields(((java.util.Date)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = org.joda.time.DurationFieldType.centuries();
    Object v8 = ((org.joda.time.LocalDate)v6).isSupported(((org.joda.time.DurationFieldType)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)v0));
    Object v2 = 36;
    Object v3 = org.joda.time.Hours.hours((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.joda.time.ReadablePeriod)v3).toPeriod();
    Object v5 = 0;
    Object v6 = ((org.joda.time.LocalDate)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v3),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 48;
    Object v8 = ((org.joda.time.LocalDate)v6).minusDays((((java.lang.Integer)v7).intValue()));
    Object v9 = 38L;
    Object v10 = "Invalid min days ";
    Object v11 = "The DateTimeFieldType must not be null";
    Object v12 = 41;
    Object v13 = 1;
    Object v14 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new org.joda.time.LocalDate((((java.lang.Long)v9).longValue()),((org.joda.time.DateTimeZone)v14));
    Object v16 = ((org.joda.time.LocalDate)v8).withFields(((org.joda.time.ReadablePartial)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 48;
    Object v8 = ((org.joda.time.LocalDate)v6).minusDays((((java.lang.Integer)v7).intValue()));
    Object v9 = 38L;
    Object v10 = "Invalid min days ";
    Object v11 = "The DateTimeFieldType must not be null";
    Object v12 = 41;
    Object v13 = 1;
    Object v14 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new org.joda.time.LocalDate((((java.lang.Long)v9).longValue()),((org.joda.time.DateTimeZone)v14));
    Object v16 = ((org.joda.time.LocalDate)v8).withFields(((org.joda.time.ReadablePartial)v15));
    Object v17 = ((org.joda.time.LocalDate)v16).getMonthOfYear();
    Object v18 = 55;
    Object v19 = ((org.joda.time.LocalDate)v16).minusYears((((java.lang.Integer)v18).intValue()));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 20L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 20L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = ((java.util.Date)v1).after(((java.util.Date)v3));
    Object v5 = org.joda.time.LocalDate.fromDateFields(((java.util.Date)v1));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 59;
    Object v8 = ((org.joda.time.LocalDate)v6).plusDays((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "Invalid min days ";
    Object v1 = "The DateTimeFieldType must not be null";
    Object v2 = 41;
    Object v3 = 1;
    Object v4 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 36;
    Object v8 = org.joda.time.Hours.hours((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.LocalDate)v6).plus(((org.joda.time.ReadablePeriod)v8));
    Object v10 = org.joda.time.DurationFieldType.centuries();
    Object v11 = 0;
    Object v12 = ((org.joda.time.LocalDate)v6).withFieldAdded(((org.joda.time.DurationFieldType)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = ((org.joda.time.LocalDate)v12).plusWeeks((((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 36;
    Object v8 = org.joda.time.Hours.hours((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.LocalDate)v6).plus(((org.joda.time.ReadablePeriod)v8));
    Object v10 = org.joda.time.DurationFieldType.centuries();
    Object v11 = 0;
    Object v12 = ((org.joda.time.LocalDate)v6).withFieldAdded(((org.joda.time.DurationFieldType)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = ((org.joda.time.LocalDate)v12).plusWeeks((((java.lang.Integer)v13).intValue()));
    Object v15 = 0;
    Object v16 = ((org.joda.time.LocalDate)v14).minusMonths((((java.lang.Integer)v15).intValue()));
    Object v17 = "GMr";
    Object v18 = java.util.Locale.getDefault();
    Object v19 = ((org.joda.time.LocalDate)v14).toString(((java.lang.String)v17),((java.util.Locale)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "Invalid min days ";
    Object v1 = "The DateTimeFieldType must not be null";
    Object v2 = 41;
    Object v3 = 1;
    Object v4 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)v4));
    Object v6 = org.joda.time.DateTimeFieldType.monthOfYear();
    Object v7 = ((org.joda.time.LocalDate)v5).property(((org.joda.time.DateTimeFieldType)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)v0));
    Object v2 = 36;
    Object v3 = org.joda.time.Hours.hours((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.joda.time.ReadablePeriod)v3).toPeriod();
    Object v5 = 0;
    Object v6 = ((org.joda.time.LocalDate)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = ((org.joda.time.LocalDate)v6).minusWeeks((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 20L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = org.joda.time.LocalDate.fromDateFields(((java.util.Date)v1));
    Object v3 = ((org.joda.time.LocalDate)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(1565110380), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "Invalid min days ";
    Object v1 = "The DateTimeFieldType must not be null";
    Object v2 = 41;
    Object v3 = 1;
    Object v4 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0L;
    Object v6 = java.util.Locale.getDefault();
    Object v7 = ((org.joda.time.DateTimeZone)v4).getName((((java.lang.Long)v5).longValue()),((java.util.Locale)v6));
    Object v8 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)v4));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)v0));
    Object v2 = 1;
    Object v3 = ((org.joda.time.LocalDate)v1).plusYears((((java.lang.Integer)v2).intValue()));
    Object v4 = -53;
    Object v5 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.Chronology)v5).millisOfDay();
    Object v7 = ((org.joda.time.LocalDate)v3).getField((((java.lang.Integer)v4).intValue()),((org.joda.time.Chronology)v5));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 20L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = org.joda.time.LocalDate.fromDateFields(((java.util.Date)v1));
    Object v3 = 1;
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.LocalDate)v2).getField((((java.lang.Integer)v3).intValue()),((org.joda.time.Chronology)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = 20L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = org.joda.time.LocalDate.fromDateFields(((java.util.Date)v1));
    Object v3 = "Invalif index: ";
    Object v4 = ((org.joda.time.LocalDate)v2).toString(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 48;
    Object v8 = ((org.joda.time.LocalDate)v6).minusDays((((java.lang.Integer)v7).intValue()));
    Object v9 = 38L;
    Object v10 = "Invalid min days ";
    Object v11 = "The DateTimeFieldType must not be null";
    Object v12 = 41;
    Object v13 = 1;
    Object v14 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new org.joda.time.LocalDate((((java.lang.Long)v9).longValue()),((org.joda.time.DateTimeZone)v14));
    Object v16 = ((org.joda.time.LocalDate)v8).withFields(((org.joda.time.ReadablePartial)v15));
    Object v17 = ((org.joda.time.LocalDate)v16).getMonthOfYear();
    Object v18 = 55;
    Object v19 = ((org.joda.time.LocalDate)v16).minusYears((((java.lang.Integer)v18).intValue()));
    Object v20 = ((org.joda.time.LocalDate)v19).toDate();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = java.util.Locale.getDefault();
    Object v1 = java.util.Calendar.getInstance(((java.util.Locale)v0));
    Object v2 = org.joda.time.LocalDate.fromCalendarFields(((java.util.Calendar)v1));
    Object v3 = 0L;
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.Chronology)v4));
    Object v6 = ((org.joda.time.base.AbstractPartial)v2).isAfter(((org.joda.time.ReadablePartial)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)v0));
    Object v2 = 36;
    Object v3 = org.joda.time.Hours.hours((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.joda.time.ReadablePeriod)v3).toPeriod();
    Object v5 = 0;
    Object v6 = ((org.joda.time.LocalDate)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
    Object v8 = ((org.joda.time.base.AbstractPartial)v6).toString(((org.joda.time.format.DateTimeFormatter)v7));
    org.junit.Assert.assertEquals((Object)("2026-278T\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.000"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)v0));
    Object v2 = 36;
    Object v3 = org.joda.time.Hours.hours((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.joda.time.ReadablePeriod)v3).toPeriod();
    Object v5 = 0;
    Object v6 = ((org.joda.time.LocalDate)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.DateTimeFieldType.monthOfYear();
    Object v8 = ((org.joda.time.LocalDate)v6).get(((org.joda.time.DateTimeFieldType)v7));
    org.junit.Assert.assertEquals((Object)(10), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 22;
    Object v8 = ((org.joda.time.LocalDate)v6).plusDays((((java.lang.Integer)v7).intValue()));
    Object v9 = 36;
    Object v10 = org.joda.time.Hours.hours((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.joda.time.LocalDate)v8).plus(((org.joda.time.ReadablePeriod)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 20L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = org.joda.time.LocalDate.fromDateFields(((java.util.Date)v1));
    Object v3 = ((org.joda.time.LocalDate)v2).toDate();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)v0));
    Object v2 = 1;
    Object v3 = ((org.joda.time.LocalDate)v1).plusYears((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDate)v3).minusMonths((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)v0));
    Object v2 = 36;
    Object v3 = org.joda.time.Hours.hours((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.joda.time.ReadablePeriod)v3).toPeriod();
    Object v5 = 0;
    Object v6 = ((org.joda.time.LocalDate)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = ((org.joda.time.LocalDate)v6).minusWeeks((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.LocalDate)v8).getDayOfWeek();
    Object v10 = ((org.joda.time.LocalDate)v8).getDayOfWeek();
    org.junit.Assert.assertEquals((Object)(1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 20L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = org.joda.time.LocalDate.fromDateFields(((java.util.Date)v1));
    Object v3 = org.joda.time.DateTimeFieldType.monthOfYear();
    Object v4 = ((org.joda.time.LocalDate)v2).property(((org.joda.time.DateTimeFieldType)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = 20L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = org.joda.time.LocalDate.fromDateFields(((java.util.Date)v1));
    Object v3 = 38L;
    Object v4 = "Invalid min days ";
    Object v5 = "The DateTimeFieldType must not be null";
    Object v6 = 41;
    Object v7 = 1;
    Object v8 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v8));
    Object v10 = "Invalid min days ";
    Object v11 = "The DateTimeFieldType must not be null";
    Object v12 = 41;
    Object v13 = 1;
    Object v14 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.joda.time.LocalDate)v9).toDateTimeAtStartOfDay(((org.joda.time.DateTimeZone)v14));
    Object v16 = 0;
    Object v17 = ((org.joda.time.LocalDate)v9).plusYears((((java.lang.Integer)v16).intValue()));
    Object v18 = 0;
    Object v19 = 0;
    Object v20 = 1;
    Object v21 = 1;
    Object v22 = new org.joda.time.LocalTime((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((org.joda.time.LocalDate)v17).toLocalDateTime(((org.joda.time.LocalTime)v22));
    Object v24 = ((org.joda.time.LocalDate)v2).compareTo(((org.joda.time.ReadablePartial)v23));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 22;
    Object v8 = ((org.joda.time.LocalDate)v6).plusDays((((java.lang.Integer)v7).intValue()));
    Object v9 = 36;
    Object v10 = org.joda.time.Hours.hours((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.joda.time.LocalDate)v8).plus(((org.joda.time.ReadablePeriod)v10));
    Object v12 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
    Object v13 = new java.io.StringWriter();
    Object v14 = "Invalid min days ";
    Object v15 = "The DateTimeFieldType must not be null";
    Object v16 = 41;
    Object v17 = 1;
    Object v18 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v14),((java.lang.String)v15),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = org.joda.time.DateTime.now(((org.joda.time.DateTimeZone)v18));
    ((org.joda.time.format.DateTimeFormatter)v12).printTo(((java.lang.Appendable)v13),((org.joda.time.ReadableInstant)v19));
    Object v20 = null;
    Object v21 = ((org.joda.time.base.AbstractPartial)v11).toString(((org.joda.time.format.DateTimeFormatter)v12));
    org.junit.Assert.assertEquals((Object)("1970-023T\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.000"), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "Invalid min days ";
    Object v1 = "The DateTimeFieldType must not be null";
    Object v2 = 41;
    Object v3 = 1;
    Object v4 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = ((org.joda.time.LocalDate)v5).minusDays((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "Invalid min days ";
    Object v1 = "The DateTimeFieldType must not be null";
    Object v2 = 41;
    Object v3 = 1;
    Object v4 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)v4));
    Object v6 = -30;
    Object v7 = ((org.joda.time.LocalDate)v5).minusMonths((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "Invalid min days ";
    Object v1 = "The DateTimeFieldType must not be null";
    Object v2 = 41;
    Object v3 = 1;
    Object v4 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)v4));
    Object v6 = ((org.joda.time.LocalDate)v5).yearOfEra();
    Object v7 = ((org.joda.time.LocalDate)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(1931956999), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "Invalid min days ";
    Object v1 = "The DateTimeFieldType must not be null";
    Object v2 = 41;
    Object v3 = 1;
    Object v4 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = ((org.joda.time.LocalDate)v5).minusDays((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.LocalDate)v7).dayOfMonth();
    Object v9 = ((org.joda.time.LocalDate)v7).toDateMidnight();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 20L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 20L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = ((java.util.Date)v1).after(((java.util.Date)v3));
    Object v5 = org.joda.time.LocalDate.fromDateFields(((java.util.Date)v1));
    Object v6 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).withOffsetParsed();
    Object v8 = ((org.joda.time.base.AbstractPartial)v5).toString(((org.joda.time.format.DateTimeFormatter)v6));
    org.junit.Assert.assertEquals((Object)("1969-365T\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.000"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)v0));
    Object v2 = 36;
    Object v3 = org.joda.time.Hours.hours((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.joda.time.ReadablePeriod)v3).toPeriod();
    Object v5 = 0;
    Object v6 = ((org.joda.time.LocalDate)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = ((org.joda.time.LocalDate)v6).minusWeeks((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.LocalDate)v8).toDate();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = org.joda.time.DateTimeFieldType.monthOfYear();
    Object v8 = ((org.joda.time.base.AbstractPartial)v6).indexOf(((org.joda.time.DateTimeFieldType)v7));
    Object v9 = 38L;
    Object v10 = "Invalid min days ";
    Object v11 = "The DateTimeFieldType must not be null";
    Object v12 = 41;
    Object v13 = 1;
    Object v14 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new org.joda.time.LocalDate((((java.lang.Long)v9).longValue()),((org.joda.time.DateTimeZone)v14));
    Object v16 = 36;
    Object v17 = org.joda.time.Hours.hours((((java.lang.Integer)v16).intValue()));
    Object v18 = ((org.joda.time.LocalDate)v15).plus(((org.joda.time.ReadablePeriod)v17));
    Object v19 = org.joda.time.DurationFieldType.centuries();
    Object v20 = 0;
    Object v21 = ((org.joda.time.LocalDate)v15).withFieldAdded(((org.joda.time.DurationFieldType)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = java.util.Locale.getDefault();
    Object v23 = ((org.joda.time.ReadablePartial)v21).equals(((java.lang.Object)v22));
    Object v24 = ((org.joda.time.base.AbstractPartial)v6).isBefore(((org.joda.time.ReadablePartial)v21));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 48;
    Object v8 = ((org.joda.time.LocalDate)v6).minusDays((((java.lang.Integer)v7).intValue()));
    Object v9 = 38L;
    Object v10 = "Invalid min days ";
    Object v11 = "The DateTimeFieldType must not be null";
    Object v12 = 41;
    Object v13 = 1;
    Object v14 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new org.joda.time.LocalDate((((java.lang.Long)v9).longValue()),((org.joda.time.DateTimeZone)v14));
    Object v16 = ((org.joda.time.LocalDate)v8).withFields(((org.joda.time.ReadablePartial)v15));
    Object v17 = ((org.joda.time.LocalDate)v16).getMonthOfYear();
    Object v18 = 55;
    Object v19 = ((org.joda.time.LocalDate)v16).minusYears((((java.lang.Integer)v18).intValue()));
    Object v20 = ((org.joda.time.LocalDate)v19).hashCode();
    org.junit.Assert.assertEquals((Object)(1217413331), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 36;
    Object v8 = org.joda.time.Hours.hours((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.LocalDate)v6).plus(((org.joda.time.ReadablePeriod)v8));
    Object v10 = org.joda.time.DurationFieldType.centuries();
    Object v11 = 0;
    Object v12 = ((org.joda.time.LocalDate)v6).withFieldAdded(((org.joda.time.DurationFieldType)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = 19;
    Object v14 = ((org.joda.time.LocalDate)v12).minusMonths((((java.lang.Integer)v13).intValue()));
    Object v15 = -14;
    Object v16 = ((org.joda.time.LocalDate)v14).getValue((((java.lang.Integer)v15).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "Invalid min days ";
    Object v1 = "The DateTimeFieldType must not be null";
    Object v2 = 41;
    Object v3 = 1;
    Object v4 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)v4));
    Object v6 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
    Object v7 = ((org.joda.time.base.AbstractPartial)v5).toString(((org.joda.time.format.DateTimeFormatter)v6));
    org.junit.Assert.assertEquals((Object)("2026-278T\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd.000"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "Invalid min days ";
    Object v1 = "The DateTimeFieldType must not be null";
    Object v2 = 41;
    Object v3 = 1;
    Object v4 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = ((org.joda.time.LocalDate)v5).minusDays((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.ReadablePartial)v7).getChronology();
    Object v9 = ((org.joda.time.base.AbstractPartial)v7).getValues();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)v0));
    Object v2 = 1;
    Object v3 = ((org.joda.time.LocalDate)v1).plusYears((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = 1;
    Object v7 = 1;
    Object v8 = new org.joda.time.LocalTime((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = ((org.joda.time.LocalTime)v8).minusMinutes((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.joda.time.LocalDate)v3).toLocalDateTime(((org.joda.time.LocalTime)v8));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 1;
    Object v8 = ((org.joda.time.LocalDate)v6).withMonthOfYear((((java.lang.Integer)v7).intValue()));
    Object v9 = 38L;
    Object v10 = "Invalid min days ";
    Object v11 = "The DateTimeFieldType must not be null";
    Object v12 = 41;
    Object v13 = 1;
    Object v14 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new org.joda.time.LocalDate((((java.lang.Long)v9).longValue()),((org.joda.time.DateTimeZone)v14));
    Object v16 = 48;
    Object v17 = ((org.joda.time.LocalDate)v15).minusDays((((java.lang.Integer)v16).intValue()));
    Object v18 = ((org.joda.time.LocalDate)v6).compareTo(((org.joda.time.ReadablePartial)v17));
    org.junit.Assert.assertEquals((Object)(1), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 30;
    Object v8 = ((org.joda.time.LocalDate)v6).minusYears((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)v0));
    Object v2 = 1;
    Object v3 = ((org.joda.time.LocalDate)v1).plusYears((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDate)v3).minusMonths((((java.lang.Integer)v4).intValue()));
    Object v6 = "Invalid min days ";
    Object v7 = "The DateTimeFieldType must not be null";
    Object v8 = 41;
    Object v9 = 1;
    Object v10 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 17L;
    Object v12 = true;
    Object v13 = ((org.joda.time.DateTimeZone)v10).convertLocalToUTC((((java.lang.Long)v11).longValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.joda.time.LocalDate)v5).toDateMidnight(((org.joda.time.DateTimeZone)v10));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -27;
    Object v2 = 1;
    Object v3 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v4 = new org.joda.time.LocalDate((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((org.joda.time.Chronology)v3));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 31;
    Object v8 = ((org.joda.time.LocalDate)v6).minusMonths((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "Invalid min days ";
    Object v1 = "The DateTimeFieldType must not be null";
    Object v2 = 41;
    Object v3 = 1;
    Object v4 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)v4));
    Object v6 = ((org.joda.time.LocalDate)v5).monthOfYear();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 22;
    Object v8 = ((org.joda.time.LocalDate)v6).plusDays((((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.DateTimeFieldType.monthOfYear();
    Object v10 = ((org.joda.time.LocalDate)v8).get(((org.joda.time.DateTimeFieldType)v9));
    Object v11 = ((org.joda.time.LocalDate)v8).size();
    org.junit.Assert.assertEquals((Object)(3), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "Invalid min days ";
    Object v1 = "The DateTimeFieldType must not be null";
    Object v2 = 41;
    Object v3 = 1;
    Object v4 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)v4));
    Object v6 = 36;
    Object v7 = org.joda.time.Hours.hours((((java.lang.Integer)v6).intValue()));
    Object v8 = 38L;
    Object v9 = "Invalid min days ";
    Object v10 = "The DateTimeFieldType must not be null";
    Object v11 = 41;
    Object v12 = 1;
    Object v13 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new org.joda.time.LocalDate((((java.lang.Long)v8).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 30;
    Object v16 = ((org.joda.time.LocalDate)v14).minusYears((((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.joda.time.ReadablePeriod)v7).equals(((java.lang.Object)v16));
    Object v18 = 1;
    Object v19 = ((org.joda.time.LocalDate)v5).withPeriodAdded(((org.joda.time.ReadablePeriod)v7),(((java.lang.Integer)v18).intValue()));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = ((org.joda.time.base.AbstractPartial)v6).getFields();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 30;
    Object v8 = ((org.joda.time.LocalDate)v6).minusYears((((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.DurationFieldType.centuries();
    Object v10 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v11 = ((org.joda.time.DurationFieldType)v9).getField(((org.joda.time.Chronology)v10));
    Object v12 = -36;
    Object v13 = ((org.joda.time.LocalDate)v8).withFieldAdded(((org.joda.time.DurationFieldType)v9),(((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = 0L;
    Object v1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v2 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1));
    Object v3 = ((org.joda.time.LocalDate)v2).getDayOfWeek();
    Object v4 = "Minutes";
    Object v5 = ((org.joda.time.LocalDate)v2).toString(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 48;
    Object v8 = ((org.joda.time.LocalDate)v6).minusDays((((java.lang.Integer)v7).intValue()));
    Object v9 = 38L;
    Object v10 = "Invalid min days ";
    Object v11 = "The DateTimeFieldType must not be null";
    Object v12 = 41;
    Object v13 = 1;
    Object v14 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new org.joda.time.LocalDate((((java.lang.Long)v9).longValue()),((org.joda.time.DateTimeZone)v14));
    Object v16 = ((org.joda.time.LocalDate)v8).withFields(((org.joda.time.ReadablePartial)v15));
    Object v17 = ((org.joda.time.LocalDate)v16).toDate();
    Object v18 = ((org.joda.time.LocalDate)v16).weekOfWeekyear();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 48L;
    Object v1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v2 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 48;
    Object v8 = ((org.joda.time.LocalDate)v6).minusDays((((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = ((org.joda.time.LocalDate)v8).minusMonths((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 59;
    Object v8 = ((org.joda.time.LocalDate)v6).plusDays((((java.lang.Integer)v7).intValue()));
    Object v9 = 38L;
    Object v10 = "Invalid min days ";
    Object v11 = "The DateTimeFieldType must not be null";
    Object v12 = 41;
    Object v13 = 1;
    Object v14 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new org.joda.time.LocalDate((((java.lang.Long)v9).longValue()),((org.joda.time.DateTimeZone)v14));
    Object v16 = 48;
    Object v17 = ((org.joda.time.LocalDate)v15).minusDays((((java.lang.Integer)v16).intValue()));
    Object v18 = ((org.joda.time.LocalDate)v8).compareTo(((org.joda.time.ReadablePartial)v17));
    org.junit.Assert.assertEquals((Object)(1), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "Invalid min days ";
    Object v1 = "The DateTimeFieldType must not be null";
    Object v2 = 41;
    Object v3 = 1;
    Object v4 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)v4));
    Object v6 = -30;
    Object v7 = ((org.joda.time.LocalDate)v5).minusMonths((((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.DateTimeFieldType.monthOfYear();
    Object v9 = ((org.joda.time.LocalDate)v7).get(((org.joda.time.DateTimeFieldType)v8));
    org.junit.Assert.assertEquals((Object)(4), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)v0));
    Object v2 = 36;
    Object v3 = org.joda.time.Hours.hours((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.joda.time.ReadablePeriod)v3).toPeriod();
    Object v5 = 0;
    Object v6 = ((org.joda.time.LocalDate)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = ((org.joda.time.LocalDate)v6).minusWeeks((((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = ((org.joda.time.LocalDate)v8).minusYears((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 20L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 20L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = ((java.util.Date)v1).after(((java.util.Date)v3));
    Object v5 = org.joda.time.LocalDate.fromDateFields(((java.util.Date)v1));
    Object v6 = 2;
    Object v7 = ((org.joda.time.LocalDate)v5).getValue((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(31), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = java.util.Locale.getDefault();
    Object v1 = java.util.Calendar.getInstance(((java.util.Locale)v0));
    Object v2 = org.joda.time.LocalDate.fromCalendarFields(((java.util.Calendar)v1));
    Object v3 = 3;
    Object v4 = ((org.joda.time.LocalDate)v2).plusDays((((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.DateTimeFieldType.monthOfYear();
    Object v6 = ((org.joda.time.LocalDate)v2).property(((org.joda.time.DateTimeFieldType)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 0L;
    Object v1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v2 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1));
    Object v3 = "Invalid min days ";
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = 41;
    Object v6 = 1;
    Object v7 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v3),((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)v7));
    Object v9 = -30;
    Object v10 = ((org.joda.time.LocalDate)v8).minusMonths((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.joda.time.ReadablePartial)v10).size();
    Object v12 = ((org.joda.time.base.AbstractPartial)v2).isEqual(((org.joda.time.ReadablePartial)v10));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 30;
    Object v8 = ((org.joda.time.LocalDate)v6).minusYears((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.base.AbstractPartial)v8).getValues();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 22;
    Object v8 = ((org.joda.time.LocalDate)v6).plusDays((((java.lang.Integer)v7).intValue()));
    Object v9 = 38L;
    Object v10 = "Invalid min days ";
    Object v11 = "The DateTimeFieldType must not be null";
    Object v12 = 41;
    Object v13 = 1;
    Object v14 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new org.joda.time.LocalDate((((java.lang.Long)v9).longValue()),((org.joda.time.DateTimeZone)v14));
    Object v16 = ((org.joda.time.base.AbstractPartial)v8).isEqual(((org.joda.time.ReadablePartial)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = "Invalid min days ";
    Object v8 = "The DateTimeFieldType must not be null";
    Object v9 = 41;
    Object v10 = 1;
    Object v11 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.joda.time.LocalDate)v6).toDateTimeAtStartOfDay(((org.joda.time.DateTimeZone)v11));
    Object v13 = 0;
    Object v14 = ((org.joda.time.LocalDate)v6).plusYears((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.joda.time.base.AbstractPartial)v14).getFields();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "Invalid min days ";
    Object v1 = "The DateTimeFieldType must not be null";
    Object v2 = 41;
    Object v3 = 1;
    Object v4 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)v4));
    Object v6 = ((org.joda.time.base.AbstractPartial)v5).getFieldTypes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 59;
    Object v8 = ((org.joda.time.LocalDate)v6).plusDays((((java.lang.Integer)v7).intValue()));
    Object v9 = 20L;
    Object v10 = new java.util.Date((((java.lang.Long)v9).longValue()));
    Object v11 = org.joda.time.LocalDate.fromDateFields(((java.util.Date)v10));
    Object v12 = ((org.joda.time.LocalDate)v8).withFields(((org.joda.time.ReadablePartial)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "Invalid min days ";
    Object v1 = "The DateTimeFieldType must not be null";
    Object v2 = 41;
    Object v3 = 1;
    Object v4 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.LocalDate.now(((org.joda.time.DateTimeZone)v4));
    Object v6 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
    Object v7 = ((org.joda.time.base.AbstractPartial)v5).toString(((org.joda.time.format.DateTimeFormatter)v6));
    Object v8 = "Invalid min days ";
    Object v9 = "The DateTimeFieldType must not be null";
    Object v10 = 41;
    Object v11 = 1;
    Object v12 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new org.joda.time.LocalDate(((java.lang.Object)v7),((org.joda.time.DateTimeZone)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = org.joda.time.LocalDate.now(((org.joda.time.Chronology)v0));
    Object v2 = 36;
    Object v3 = org.joda.time.Hours.hours((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.joda.time.ReadablePeriod)v3).toPeriod();
    Object v5 = 0;
    Object v6 = ((org.joda.time.LocalDate)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.DurationFieldType.centuries();
    Object v8 = ((org.joda.time.LocalDate)v6).isSupported(((org.joda.time.DurationFieldType)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 38L;
    Object v1 = "Invalid min days ";
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = 41;
    Object v4 = 1;
    Object v5 = new org.joda.time.tz.FixedDateTimeZone(((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 22;
    Object v8 = ((org.joda.time.LocalDate)v6).plusDays((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.base.AbstractPartial)v8).getValues();
    org.junit.Assert.assertNotNull(v9);
  }
}
