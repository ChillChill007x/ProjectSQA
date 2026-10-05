package org.joda.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 1;
    Object v1 = org.joda.time.Period.weeks((((java.lang.Integer)v0).intValue()));
    Object v2 = 8;
    Object v3 = ((org.joda.time.Period)v1).withMinutes((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 1;
    Object v1 = org.joda.time.Period.weeks((((java.lang.Integer)v0).intValue()));
    Object v2 = 8;
    Object v3 = ((org.joda.time.Period)v1).withMinutes((((java.lang.Integer)v2).intValue()));
    Object v4 = 86400000;
    Object v5 = ((org.joda.time.Period)v3).plusMillis((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 1;
    Object v1 = org.joda.time.Period.weeks((((java.lang.Integer)v0).intValue()));
    Object v2 = 8;
    Object v3 = ((org.joda.time.Period)v1).withMinutes((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.joda.time.Period)v3).getSeconds();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 1;
    Object v1 = org.joda.time.Period.weeks((((java.lang.Integer)v0).intValue()));
    Object v2 = 8;
    Object v3 = ((org.joda.time.Period)v1).withMinutes((((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.format.PeriodFormat.getDefault();
    Object v5 = ((org.joda.time.base.AbstractPeriod)v3).toString(((org.joda.time.format.PeriodFormatter)v4));
    org.junit.Assert.assertEquals((Object)("1 week and 8 minutes"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.joda.time.Period)v1).getWeeks();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 1;
    Object v1 = org.joda.time.Period.weeks((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 1;
    Object v1 = org.joda.time.Period.weeks((((java.lang.Integer)v0).intValue()));
    Object v2 = 8;
    Object v3 = ((org.joda.time.Period)v1).withMinutes((((java.lang.Integer)v2).intValue()));
    Object v4 = 86400000;
    Object v5 = ((org.joda.time.Period)v3).plusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = 4;
    Object v7 = ((org.joda.time.Period)v5).plusYears((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.DurationFieldType.hours();
    Object v3 = ((org.joda.time.base.AbstractPeriod)v1).isSupported(((org.joda.time.DurationFieldType)v2));
    Object v4 = ((org.joda.time.base.AbstractPeriod)v1).toString();
    org.junit.Assert.assertEquals((Object)("P10D"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = ((org.joda.time.Period)v1).plusDays((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = ((org.joda.time.Period)v1).plusDays((((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.DurationFieldType.hours();
    Object v5 = ((org.joda.time.base.AbstractPeriod)v3).get(((org.joda.time.DurationFieldType)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 0L;
    Object v1 = 2L;
    Object v2 = null;
    Object v3 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v2));
    Object v4 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.joda.time.PeriodType)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = org.joda.time.Period.weeks((((java.lang.Integer)v0).intValue()));
    Object v2 = 8;
    Object v3 = ((org.joda.time.Period)v1).withMinutes((((java.lang.Integer)v2).intValue()));
    Object v4 = 86400000;
    Object v5 = ((org.joda.time.Period)v3).plusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = 4;
    Object v7 = ((org.joda.time.Period)v5).plusYears((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.Period)v7).toStandardSeconds();
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 0L;
    Object v1 = 2L;
    Object v2 = null;
    Object v3 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v2));
    Object v4 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.joda.time.PeriodType)v3));
    Object v5 = 1;
    Object v6 = ((org.joda.time.Period)v4).plusDays((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = -21;
    Object v3 = ((org.joda.time.Period)v1).plusMonths((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = -21;
    Object v3 = ((org.joda.time.Period)v1).plusMonths((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.Period)v3).withMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = 1000;
    Object v7 = ((org.joda.time.Period)v3).plusMonths((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = -21;
    Object v3 = ((org.joda.time.Period)v1).plusMonths((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.Period)v3).minusSeconds((((java.lang.Integer)v4).intValue()));
    Object v6 = 10;
    Object v7 = org.joda.time.Period.days((((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = ((org.joda.time.Period)v7).plusDays((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.Period)v3).plus(((org.joda.time.ReadablePeriod)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = -33L;
    Object v1 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()));
    Object v2 = 0L;
    Object v3 = 1;
    Object v4 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v4));
    Object v6 = new org.joda.time.DateTime((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v5));
    Object v7 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v1),((org.joda.time.ReadableInstant)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = org.joda.time.Period.weeks((((java.lang.Integer)v2).intValue()));
    Object v4 = 8;
    Object v5 = ((org.joda.time.Period)v3).withMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = 86400000;
    Object v7 = ((org.joda.time.Period)v5).plusMillis((((java.lang.Integer)v6).intValue()));
    Object v8 = null;
    Object v9 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v8));
    Object v10 = ((org.joda.time.ReadablePeriod)v7).equals(((java.lang.Object)v9));
    Object v11 = ((org.joda.time.Period)v1).withFields(((org.joda.time.ReadablePeriod)v7));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = -21;
    Object v3 = ((org.joda.time.Period)v1).plusMonths((((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.DurationFieldType.hours();
    Object v5 = 1;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v6));
    Object v8 = ((org.joda.time.DurationFieldType)v4).getField(((org.joda.time.Chronology)v7));
    Object v9 = -22;
    Object v10 = ((org.joda.time.Period)v3).withField(((org.joda.time.DurationFieldType)v4),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = 3;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = 0;
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = null;
    Object v9 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v8));
    Object v10 = new org.joda.time.Period((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((org.joda.time.PeriodType)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v0),((java.util.Locale)v1));
    Object v3 = org.joda.time.TimeOfDay.fromCalendarFields(((java.util.Calendar)v2));
    Object v4 = new int[]{0,-12,-39};
    Object v5 = new org.joda.time.TimeOfDay(((org.joda.time.TimeOfDay)v3),((int[])v4));
    Object v6 = java.util.TimeZone.getDefault();
    Object v7 = java.util.Locale.getDefault();
    Object v8 = java.util.Calendar.getInstance(((java.util.TimeZone)v6),((java.util.Locale)v7));
    Object v9 = org.joda.time.TimeOfDay.fromCalendarFields(((java.util.Calendar)v8));
    Object v10 = new int[]{0,-12,-39};
    Object v11 = new org.joda.time.TimeOfDay(((org.joda.time.TimeOfDay)v9),((int[])v10));
    Object v12 = org.joda.time.Period.fieldDifference(((org.joda.time.ReadablePartial)v5),((org.joda.time.ReadablePartial)v11));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 0L;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = -21;
    Object v3 = ((org.joda.time.Period)v1).plusMonths((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.joda.time.base.AbstractPeriod)v3).hashCode();
    Object v5 = org.joda.time.DurationFieldType.hours();
    Object v6 = -6;
    Object v7 = ((org.joda.time.Period)v3).withFieldAdded(((org.joda.time.DurationFieldType)v5),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = null;
    Object v3 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v2));
    Object v4 = ((org.joda.time.Period)v1).withPeriodType(((org.joda.time.PeriodType)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = -21;
    Object v3 = ((org.joda.time.Period)v1).plusMonths((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.Period)v3).minusSeconds((((java.lang.Integer)v4).intValue()));
    Object v6 = 10;
    Object v7 = org.joda.time.Period.days((((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = ((org.joda.time.Period)v7).plusDays((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.Period)v3).plus(((org.joda.time.ReadablePeriod)v9));
    Object v11 = ((org.joda.time.Period)v10).getSeconds();
    Object v12 = 1;
    Object v13 = ((org.joda.time.Period)v10).minusMonths((((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 0L;
    Object v1 = 2L;
    Object v2 = null;
    Object v3 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v2));
    Object v4 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.joda.time.PeriodType)v3));
    Object v5 = org.joda.time.DurationFieldType.hours();
    Object v6 = 1;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v7));
    Object v9 = ((org.joda.time.DurationFieldType)v5).getField(((org.joda.time.Chronology)v8));
    Object v10 = ((org.joda.time.base.AbstractPeriod)v4).get(((org.joda.time.DurationFieldType)v5));
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = -33L;
    Object v1 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()));
    Object v2 = 0L;
    Object v3 = 1;
    Object v4 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v4));
    Object v6 = new org.joda.time.DateTime((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v5));
    Object v7 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v1),((org.joda.time.ReadableInstant)v6));
    Object v8 = 18;
    Object v9 = ((org.joda.time.Period)v7).withSeconds((((java.lang.Integer)v8).intValue()));
    Object v10 = org.joda.time.DurationFieldType.hours();
    Object v11 = 34;
    Object v12 = ((org.joda.time.Period)v7).withFieldAdded(((org.joda.time.DurationFieldType)v10),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = null;
    Object v3 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v2));
    Object v4 = ((org.joda.time.Period)v1).withPeriodType(((org.joda.time.PeriodType)v3));
    Object v5 = org.joda.time.DurationFieldType.hours();
    Object v6 = -50;
    Object v7 = ((org.joda.time.Period)v4).withField(((org.joda.time.DurationFieldType)v5),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 0L;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v3));
    Object v5 = 1;
    Object v6 = org.joda.time.Period.weeks((((java.lang.Integer)v5).intValue()));
    Object v7 = 8;
    Object v8 = ((org.joda.time.Period)v6).withMinutes((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.Period)v4).plus(((org.joda.time.ReadablePeriod)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = -23L;
    Object v1 = 1L;
    Object v2 = 1;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.joda.time.Chronology)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v0),((java.util.Locale)v1));
    Object v3 = org.joda.time.TimeOfDay.fromCalendarFields(((java.util.Calendar)v2));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = java.util.Locale.getDefault();
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v4),((java.util.Locale)v5));
    Object v7 = org.joda.time.TimeOfDay.fromCalendarFields(((java.util.Calendar)v6));
    Object v8 = org.joda.time.DateTimeFieldType.secondOfMinute();
    Object v9 = ((org.joda.time.ReadablePartial)v7).get(((org.joda.time.DateTimeFieldType)v8));
    Object v10 = org.joda.time.Period.fieldDifference(((org.joda.time.ReadablePartial)v3),((org.joda.time.ReadablePartial)v7));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 0L;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.Period)v4).negated();
    Object v6 = 21;
    Object v7 = ((org.joda.time.Period)v4).plusSeconds((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 0L;
    Object v1 = null;
    Object v2 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v1));
    Object v3 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),((org.joda.time.PeriodType)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v0),((java.util.Locale)v1));
    Object v3 = org.joda.time.TimeOfDay.fromCalendarFields(((java.util.Calendar)v2));
    Object v4 = new int[]{0,-12,-39};
    Object v5 = new org.joda.time.TimeOfDay(((org.joda.time.TimeOfDay)v3),((int[])v4));
    Object v6 = java.util.TimeZone.getDefault();
    Object v7 = java.util.Locale.getDefault();
    Object v8 = java.util.Calendar.getInstance(((java.util.TimeZone)v6),((java.util.Locale)v7));
    Object v9 = org.joda.time.TimeOfDay.fromCalendarFields(((java.util.Calendar)v8));
    Object v10 = org.joda.time.Period.fieldDifference(((org.joda.time.ReadablePartial)v5),((org.joda.time.ReadablePartial)v9));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = -21;
    Object v3 = ((org.joda.time.Period)v1).plusMonths((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.joda.time.base.AbstractPeriod)v3).hashCode();
    Object v5 = org.joda.time.DurationFieldType.hours();
    Object v6 = -6;
    Object v7 = ((org.joda.time.Period)v3).withFieldAdded(((org.joda.time.DurationFieldType)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.ReadablePeriod)v7).getPeriodType();
    Object v9 = ((org.joda.time.base.AbstractPeriod)v7).getValues();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = -21;
    Object v3 = ((org.joda.time.Period)v1).plusMonths((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.Period)v3).minusSeconds((((java.lang.Integer)v4).intValue()));
    Object v6 = 10;
    Object v7 = org.joda.time.Period.days((((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = ((org.joda.time.Period)v7).plusDays((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.Period)v3).plus(((org.joda.time.ReadablePeriod)v9));
    Object v11 = ((org.joda.time.Period)v10).getSeconds();
    Object v12 = 1;
    Object v13 = ((org.joda.time.Period)v10).minusMonths((((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    Object v15 = org.joda.time.Period.weeks((((java.lang.Integer)v14).intValue()));
    Object v16 = 8;
    Object v17 = ((org.joda.time.Period)v15).withMinutes((((java.lang.Integer)v16).intValue()));
    Object v18 = ((org.joda.time.Period)v13).withFields(((org.joda.time.ReadablePeriod)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 0L;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.Period)v4).negated();
    Object v6 = 21;
    Object v7 = ((org.joda.time.Period)v4).plusSeconds((((java.lang.Integer)v6).intValue()));
    Object v8 = -32;
    Object v9 = ((org.joda.time.Period)v7).plusSeconds((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = -21;
    Object v3 = ((org.joda.time.Period)v1).plusMonths((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.joda.time.base.AbstractPeriod)v3).hashCode();
    Object v5 = org.joda.time.DurationFieldType.hours();
    Object v6 = -6;
    Object v7 = ((org.joda.time.Period)v3).withFieldAdded(((org.joda.time.DurationFieldType)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.format.PeriodFormat.getDefault();
    Object v9 = ((org.joda.time.base.AbstractPeriod)v7).toString(((org.joda.time.format.PeriodFormatter)v8));
    org.junit.Assert.assertEquals((Object)("-21 months, 10 days and -6 hours"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v0),((java.util.Locale)v1));
    Object v3 = org.joda.time.TimeOfDay.fromCalendarFields(((java.util.Calendar)v2));
    Object v4 = new int[]{0,-12,-39};
    Object v5 = new org.joda.time.TimeOfDay(((org.joda.time.TimeOfDay)v3),((int[])v4));
    Object v6 = java.util.TimeZone.getDefault();
    Object v7 = java.util.Locale.getDefault();
    Object v8 = java.util.Calendar.getInstance(((java.util.TimeZone)v6),((java.util.Locale)v7));
    Object v9 = org.joda.time.TimeOfDay.fromCalendarFields(((java.util.Calendar)v8));
    Object v10 = new int[]{0,-12,-39};
    Object v11 = new org.joda.time.TimeOfDay(((org.joda.time.TimeOfDay)v9),((int[])v10));
    Object v12 = null;
    Object v13 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v12));
    Object v14 = new org.joda.time.Period(((org.joda.time.ReadablePartial)v5),((org.joda.time.ReadablePartial)v11),((org.joda.time.PeriodType)v13));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = -21;
    Object v3 = ((org.joda.time.Period)v1).plusMonths((((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.DurationFieldType.hours();
    Object v5 = 1;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v6));
    Object v8 = ((org.joda.time.DurationFieldType)v4).getField(((org.joda.time.Chronology)v7));
    Object v9 = -22;
    Object v10 = ((org.joda.time.Period)v3).withField(((org.joda.time.DurationFieldType)v4),(((java.lang.Integer)v9).intValue()));
    Object v11 = null;
    Object v12 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v11));
    Object v13 = ((org.joda.time.Period)v10).withPeriodType(((org.joda.time.PeriodType)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = null;
    Object v3 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v2));
    Object v4 = ((org.joda.time.Period)v1).withPeriodType(((org.joda.time.PeriodType)v3));
    Object v5 = ((org.joda.time.Period)v4).toStandardHours();
    Object v6 = 61;
    Object v7 = ((org.joda.time.Period)v4).minusHours((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = ((org.joda.time.Period)v1).plusDays((((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    Object v5 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v4));
    Object v6 = ((org.joda.time.Period)v3).normalizedStandard(((org.joda.time.PeriodType)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 1L;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.Chronology)v3).weeks();
    Object v5 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = -21;
    Object v3 = ((org.joda.time.Period)v1).plusMonths((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.Period)v3).minusSeconds((((java.lang.Integer)v4).intValue()));
    Object v6 = 10;
    Object v7 = org.joda.time.Period.days((((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = ((org.joda.time.Period)v7).plusDays((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.Period)v3).plus(((org.joda.time.ReadablePeriod)v9));
    Object v11 = ((org.joda.time.Period)v10).getSeconds();
    Object v12 = 1;
    Object v13 = ((org.joda.time.Period)v10).minusMonths((((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    Object v15 = ((org.joda.time.Period)v13).withMillis((((java.lang.Integer)v14).intValue()));
    Object v16 = -17;
    Object v17 = ((org.joda.time.Period)v13).plusDays((((java.lang.Integer)v16).intValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = -23L;
    Object v1 = 1L;
    Object v2 = 1;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.joda.time.Chronology)v4));
    Object v6 = 60;
    Object v7 = ((org.joda.time.Period)v5).minusHours((((java.lang.Integer)v6).intValue()));
    Object v8 = 2;
    Object v9 = ((org.joda.time.Period)v5).plusWeeks((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = null;
    Object v3 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v2));
    Object v4 = ((org.joda.time.Period)v1).withPeriodType(((org.joda.time.PeriodType)v3));
    Object v5 = ((org.joda.time.Period)v4).toStandardHours();
    Object v6 = 61;
    Object v7 = ((org.joda.time.Period)v4).minusHours((((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = ((org.joda.time.Period)v7).minusHours((((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    Object v11 = ((org.joda.time.Period)v7).withSeconds((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 0L;
    Object v1 = 2L;
    Object v2 = null;
    Object v3 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v2));
    Object v4 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.joda.time.PeriodType)v3));
    Object v5 = -9;
    Object v6 = ((org.joda.time.Period)v4).minusMillis((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 0L;
    Object v1 = null;
    Object v2 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v1));
    Object v3 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),((org.joda.time.PeriodType)v2));
    Object v4 = 2;
    Object v5 = ((org.joda.time.Period)v3).withDays((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 0L;
    Object v1 = 2L;
    Object v2 = null;
    Object v3 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v2));
    Object v4 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.joda.time.PeriodType)v3));
    Object v5 = -9;
    Object v6 = ((org.joda.time.Period)v4).minusMillis((((java.lang.Integer)v5).intValue()));
    Object v7 = 35;
    Object v8 = ((org.joda.time.Period)v6).plusMinutes((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 0L;
    Object v1 = null;
    Object v2 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v1));
    Object v3 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),((org.joda.time.PeriodType)v2));
    Object v4 = 1;
    Object v5 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v3).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = -21;
    Object v3 = ((org.joda.time.Period)v1).plusMonths((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.joda.time.base.AbstractPeriod)v3).getValues();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 0L;
    Object v1 = null;
    Object v2 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v1));
    Object v3 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),((org.joda.time.PeriodType)v2));
    Object v4 = 2;
    Object v5 = ((org.joda.time.Period)v3).withDays((((java.lang.Integer)v4).intValue()));
    Object v6 = -15;
    Object v7 = ((org.joda.time.Period)v5).multipliedBy((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = null;
    Object v3 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v2));
    Object v4 = ((org.joda.time.Period)v1).withPeriodType(((org.joda.time.PeriodType)v3));
    Object v5 = ((org.joda.time.Period)v4).toStandardHours();
    Object v6 = 61;
    Object v7 = ((org.joda.time.Period)v4).minusHours((((java.lang.Integer)v6).intValue()));
    Object v8 = -21;
    Object v9 = ((org.joda.time.Period)v7).multipliedBy((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 0L;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.Period)v4).negated();
    Object v6 = 21;
    Object v7 = ((org.joda.time.Period)v4).plusSeconds((((java.lang.Integer)v6).intValue()));
    Object v8 = 32;
    Object v9 = ((org.joda.time.Period)v7).plusYears((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 0L;
    Object v1 = null;
    Object v2 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v1));
    Object v3 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),((org.joda.time.PeriodType)v2));
    Object v4 = 0L;
    Object v5 = null;
    Object v6 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v5));
    Object v7 = new org.joda.time.Period((((java.lang.Long)v4).longValue()),((org.joda.time.PeriodType)v6));
    Object v8 = ((org.joda.time.Period)v3).minus(((org.joda.time.ReadablePeriod)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = null;
    Object v3 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v2));
    Object v4 = ((org.joda.time.Period)v1).withPeriodType(((org.joda.time.PeriodType)v3));
    Object v5 = org.joda.time.DurationFieldType.hours();
    Object v6 = -50;
    Object v7 = ((org.joda.time.Period)v4).withField(((org.joda.time.DurationFieldType)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0L;
    Object v9 = 1;
    Object v10 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v9).intValue()));
    Object v11 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v10));
    Object v12 = new org.joda.time.Period((((java.lang.Long)v8).longValue()),((org.joda.time.Chronology)v11));
    Object v13 = ((org.joda.time.Period)v12).negated();
    Object v14 = 21;
    Object v15 = ((org.joda.time.Period)v12).plusSeconds((((java.lang.Integer)v14).intValue()));
    Object v16 = 32;
    Object v17 = ((org.joda.time.Period)v15).plusYears((((java.lang.Integer)v16).intValue()));
    Object v18 = ((org.joda.time.Period)v7).withFields(((org.joda.time.ReadablePeriod)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v0),((java.util.Locale)v1));
    Object v3 = org.joda.time.TimeOfDay.fromCalendarFields(((java.util.Calendar)v2));
    Object v4 = new int[]{0,-12,-39};
    Object v5 = new org.joda.time.TimeOfDay(((org.joda.time.TimeOfDay)v3),((int[])v4));
    Object v6 = java.util.TimeZone.getDefault();
    Object v7 = java.util.Locale.getDefault();
    Object v8 = java.util.Calendar.getInstance(((java.util.TimeZone)v6),((java.util.Locale)v7));
    Object v9 = org.joda.time.TimeOfDay.fromCalendarFields(((java.util.Calendar)v8));
    Object v10 = new int[]{0,-12,-39};
    Object v11 = new org.joda.time.TimeOfDay(((org.joda.time.TimeOfDay)v9),((int[])v10));
    Object v12 = new org.joda.time.Period(((org.joda.time.ReadablePartial)v5),((org.joda.time.ReadablePartial)v11));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 1;
    Object v1 = org.joda.time.Period.weeks((((java.lang.Integer)v0).intValue()));
    Object v2 = 8;
    Object v3 = ((org.joda.time.Period)v1).withMinutes((((java.lang.Integer)v2).intValue()));
    Object v4 = 86400000;
    Object v5 = ((org.joda.time.Period)v3).plusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DurationFieldType.hours();
    Object v7 = 0;
    Object v8 = ((org.joda.time.Period)v5).withField(((org.joda.time.DurationFieldType)v6),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = ((org.joda.time.Period)v1).plusDays((((java.lang.Integer)v2).intValue()));
    Object v4 = 10;
    Object v5 = org.joda.time.Period.days((((java.lang.Integer)v4).intValue()));
    Object v6 = null;
    Object v7 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v6));
    Object v8 = ((org.joda.time.Period)v5).withPeriodType(((org.joda.time.PeriodType)v7));
    Object v9 = ((org.joda.time.Period)v8).toStandardHours();
    Object v10 = 61;
    Object v11 = ((org.joda.time.Period)v8).minusHours((((java.lang.Integer)v10).intValue()));
    Object v12 = -21;
    Object v13 = ((org.joda.time.Period)v11).multipliedBy((((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = ((org.joda.time.ReadablePeriod)v13).getValue((((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.joda.time.Period)v3).minus(((org.joda.time.ReadablePeriod)v13));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 0L;
    Object v1 = 17L;
    Object v2 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = null;
    Object v3 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v2));
    Object v4 = ((org.joda.time.Period)v1).withPeriodType(((org.joda.time.PeriodType)v3));
    Object v5 = ((org.joda.time.Period)v4).toStandardHours();
    Object v6 = 61;
    Object v7 = ((org.joda.time.Period)v4).minusHours((((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = ((org.joda.time.Period)v7).minusHours((((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    Object v11 = ((org.joda.time.Period)v7).withSeconds((((java.lang.Integer)v10).intValue()));
    Object v12 = 10;
    Object v13 = org.joda.time.Period.days((((java.lang.Integer)v12).intValue()));
    Object v14 = -21;
    Object v15 = ((org.joda.time.Period)v13).plusMonths((((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.joda.time.Period)v11).plus(((org.joda.time.ReadablePeriod)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = null;
    Object v3 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v2));
    Object v4 = ((org.joda.time.Period)v1).withPeriodType(((org.joda.time.PeriodType)v3));
    Object v5 = ((org.joda.time.base.AbstractPeriod)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(1167706255), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 0L;
    Object v1 = null;
    Object v2 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v1));
    Object v3 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),((org.joda.time.PeriodType)v2));
    Object v4 = 2;
    Object v5 = ((org.joda.time.Period)v3).withDays((((java.lang.Integer)v4).intValue()));
    Object v6 = -15;
    Object v7 = ((org.joda.time.Period)v5).multipliedBy((((java.lang.Integer)v6).intValue()));
    Object v8 = 0L;
    Object v9 = null;
    Object v10 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v9));
    Object v11 = new org.joda.time.Period((((java.lang.Long)v8).longValue()),((org.joda.time.PeriodType)v10));
    Object v12 = ((org.joda.time.Period)v7).withFields(((org.joda.time.ReadablePeriod)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 2L;
    Object v1 = new org.joda.time.Period((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = -33L;
    Object v1 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()));
    Object v2 = ((org.joda.time.ReadableDuration)v1).hashCode();
    Object v3 = 0L;
    Object v4 = 1;
    Object v5 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v5));
    Object v7 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.Chronology)v6));
    Object v8 = null;
    Object v9 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v8));
    Object v10 = ((org.joda.time.PeriodType)v9).hashCode();
    Object v11 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v1),((org.joda.time.ReadableInstant)v7),((org.joda.time.PeriodType)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 0L;
    Object v1 = 23L;
    Object v2 = 1;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.joda.time.Chronology)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.DurationFieldType.hours();
    Object v3 = 6;
    Object v4 = ((org.joda.time.Period)v1).withFieldAdded(((org.joda.time.DurationFieldType)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.joda.time.Period();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.joda.time.Period)v1).normalizedStandard();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = -1;
    Object v1 = org.joda.time.Period.minutes((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 0L;
    Object v1 = null;
    Object v2 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v1));
    Object v3 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),((org.joda.time.PeriodType)v2));
    Object v4 = 2;
    Object v5 = ((org.joda.time.Period)v3).withDays((((java.lang.Integer)v4).intValue()));
    Object v6 = 0L;
    Object v7 = 1;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v8));
    Object v10 = new org.joda.time.DateTime((((java.lang.Long)v6).longValue()),((org.joda.time.Chronology)v9));
    Object v11 = ((org.joda.time.base.BasePeriod)v5).toDurationFrom(((org.joda.time.ReadableInstant)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.DurationFieldType.hours();
    Object v3 = 6;
    Object v4 = ((org.joda.time.Period)v1).withFieldAdded(((org.joda.time.DurationFieldType)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = -27;
    Object v6 = ((org.joda.time.Period)v4).withYears((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.joda.time.Period();
    Object v1 = -5;
    Object v2 = ((org.joda.time.Period)v0).plusMillis((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 0L;
    Object v1 = null;
    Object v2 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v1));
    Object v3 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),((org.joda.time.PeriodType)v2));
    Object v4 = 2;
    Object v5 = ((org.joda.time.Period)v3).withDays((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).getFieldTypes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 0L;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.Period)v4).negated();
    Object v6 = 21;
    Object v7 = ((org.joda.time.Period)v4).plusSeconds((((java.lang.Integer)v6).intValue()));
    Object v8 = 32;
    Object v9 = ((org.joda.time.Period)v7).plusYears((((java.lang.Integer)v8).intValue()));
    Object v10 = org.joda.time.DurationFieldType.hours();
    Object v11 = 1;
    Object v12 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v11).intValue()));
    Object v13 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v12));
    Object v14 = ((org.joda.time.DurationFieldType)v10).isSupported(((org.joda.time.Chronology)v13));
    Object v15 = -6;
    Object v16 = ((org.joda.time.Period)v9).withFieldAdded(((org.joda.time.DurationFieldType)v10),(((java.lang.Integer)v15).intValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 0L;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v3));
    Object v5 = 0;
    Object v6 = ((org.joda.time.Period)v4).plusMonths((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 0L;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v3));
    Object v5 = 1;
    Object v6 = org.joda.time.Period.weeks((((java.lang.Integer)v5).intValue()));
    Object v7 = 8;
    Object v8 = ((org.joda.time.Period)v6).withMinutes((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.Period)v4).plus(((org.joda.time.ReadablePeriod)v8));
    Object v10 = -36;
    Object v11 = ((org.joda.time.Period)v9).plusWeeks((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = null;
    Object v3 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v2));
    Object v4 = ((org.joda.time.Period)v1).withPeriodType(((org.joda.time.PeriodType)v3));
    Object v5 = ((org.joda.time.Period)v4).toStandardHours();
    Object v6 = 61;
    Object v7 = ((org.joda.time.Period)v4).minusHours((((java.lang.Integer)v6).intValue()));
    Object v8 = 3;
    Object v9 = ((org.joda.time.Period)v7).withHours((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 1;
    Object v1 = org.joda.time.Period.millis((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 0L;
    Object v1 = 23L;
    Object v2 = 1;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.joda.time.Chronology)v4));
    Object v6 = org.joda.time.format.PeriodFormat.getDefault();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).toString(((org.joda.time.format.PeriodFormatter)v6));
    org.junit.Assert.assertEquals((Object)("23 milliseconds"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 1;
    Object v1 = org.joda.time.Period.millis((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.DurationFieldType.hours();
    Object v3 = ((org.joda.time.base.AbstractPeriod)v1).get(((org.joda.time.DurationFieldType)v2));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 0L;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.Period)v4).negated();
    Object v6 = 21;
    Object v7 = ((org.joda.time.Period)v4).plusSeconds((((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = ((org.joda.time.Period)v7).plusYears((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 0L;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.Period)v4).negated();
    Object v6 = 21;
    Object v7 = ((org.joda.time.Period)v4).plusSeconds((((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = ((org.joda.time.Period)v7).plusMinutes((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.DurationFieldType.hours();
    Object v3 = 1;
    Object v4 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v4));
    Object v6 = ((org.joda.time.DurationFieldType)v2).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = ((org.joda.time.base.AbstractPeriod)v1).get(((org.joda.time.DurationFieldType)v2));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 1;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = 0;
    Object v3 = ((org.joda.time.Period)v1).plusDays((((java.lang.Integer)v2).intValue()));
    Object v4 = 0L;
    Object v5 = null;
    Object v6 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v5));
    Object v7 = new org.joda.time.Period((((java.lang.Long)v4).longValue()),((org.joda.time.PeriodType)v6));
    Object v8 = 0L;
    Object v9 = null;
    Object v10 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v9));
    Object v11 = new org.joda.time.Period((((java.lang.Long)v8).longValue()),((org.joda.time.PeriodType)v10));
    Object v12 = ((org.joda.time.Period)v7).minus(((org.joda.time.ReadablePeriod)v11));
    Object v13 = ((org.joda.time.Period)v3).minus(((org.joda.time.ReadablePeriod)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 1;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = 10;
    Object v3 = org.joda.time.Period.days((((java.lang.Integer)v2).intValue()));
    Object v4 = -21;
    Object v5 = ((org.joda.time.Period)v3).plusMonths((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).getValues();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = null;
    Object v3 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v2));
    Object v4 = ((org.joda.time.Period)v1).withPeriodType(((org.joda.time.PeriodType)v3));
    Object v5 = ((org.joda.time.Period)v4).toStandardHours();
    Object v6 = 61;
    Object v7 = ((org.joda.time.Period)v4).minusHours((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.Period)v7).toStandardWeeks();
    Object v9 = 1;
    Object v10 = ((org.joda.time.Period)v7).plusHours((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 67L;
    Object v1 = 1L;
    Object v2 = null;
    Object v3 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v2));
    Object v4 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((org.joda.time.PeriodType)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 0L;
    Object v1 = null;
    Object v2 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v1));
    Object v3 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),((org.joda.time.PeriodType)v2));
    Object v4 = 2;
    Object v5 = ((org.joda.time.Period)v3).withDays((((java.lang.Integer)v4).intValue()));
    Object v6 = 63;
    Object v7 = ((org.joda.time.Period)v5).plusMillis((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 1;
    Object v1 = org.joda.time.Period.millis((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = ((org.joda.time.Period)v1).plusMinutes((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.joda.time.Period)v1).normalizedStandard();
    Object v3 = 10;
    Object v4 = org.joda.time.Period.days((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.joda.time.Period)v4).normalizedStandard();
    Object v6 = ((org.joda.time.Period)v2).plus(((org.joda.time.ReadablePeriod)v5));
    Object v7 = new org.joda.time.Period();
    Object v8 = ((org.joda.time.Period)v2).withFields(((org.joda.time.ReadablePeriod)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.joda.time.Period();
    Object v1 = 27;
    Object v2 = ((org.joda.time.Period)v0).minusMonths((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.Period)v0).toStandardSeconds();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = -21;
    Object v3 = ((org.joda.time.Period)v1).plusMonths((((java.lang.Integer)v2).intValue()));
    Object v4 = 1689274933;
    Object v5 = ((org.joda.time.Period)v3).plusMonths((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = null;
    Object v3 = org.joda.time.DateTimeUtils.getPeriodType(((org.joda.time.PeriodType)v2));
    Object v4 = ((org.joda.time.Period)v1).withPeriodType(((org.joda.time.PeriodType)v3));
    Object v5 = ((org.joda.time.Period)v4).getMillis();
    Object v6 = ((org.joda.time.Period)v4).normalizedStandard();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 0L;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.Period)v4).negated();
    Object v6 = 21;
    Object v7 = ((org.joda.time.Period)v4).plusSeconds((((java.lang.Integer)v6).intValue()));
    Object v8 = 32;
    Object v9 = ((org.joda.time.Period)v7).plusYears((((java.lang.Integer)v8).intValue()));
    Object v10 = 3;
    Object v11 = ((org.joda.time.Period)v9).withMillis((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 0L;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = new org.joda.time.Period((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.Period)v4).negated();
    Object v6 = 21;
    Object v7 = ((org.joda.time.Period)v4).plusSeconds((((java.lang.Integer)v6).intValue()));
    Object v8 = -32;
    Object v9 = ((org.joda.time.Period)v7).plusSeconds((((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = ((org.joda.time.Period)v9).multipliedBy((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 1;
    Object v1 = org.joda.time.Period.millis((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.joda.time.base.AbstractPeriod)v1).size();
    Object v3 = ((org.joda.time.base.AbstractPeriod)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(-1957770404), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 10;
    Object v1 = org.joda.time.Period.days((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.DurationFieldType.hours();
    Object v3 = 6;
    Object v4 = ((org.joda.time.Period)v1).withFieldAdded(((org.joda.time.DurationFieldType)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.DurationFieldType.hours();
    Object v6 = 1;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ISOChronology.getInstance(((org.joda.time.DateTimeZone)v7));
    Object v9 = ((org.joda.time.DurationFieldType)v5).isSupported(((org.joda.time.Chronology)v8));
    Object v10 = ((org.joda.time.base.AbstractPeriod)v4).isSupported(((org.joda.time.DurationFieldType)v5));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }
}
