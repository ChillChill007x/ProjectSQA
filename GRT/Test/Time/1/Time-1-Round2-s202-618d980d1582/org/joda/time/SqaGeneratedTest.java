package org.joda.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.joda.time.TimeOfDay();
    Object v1 = ((org.joda.time.base.AbstractPartial)v0).getFields();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = ((org.joda.time.Partial)v0).getValues();
    Object v2 = 31L;
    Object v3 = org.joda.time.Duration.standardMinutes((((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.DateTime.now();
    Object v5 = org.joda.time.PeriodType.hours();
    Object v6 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v3),((org.joda.time.ReadableInstant)v4),((org.joda.time.PeriodType)v5));
    Object v7 = ((org.joda.time.Partial)v0).plus(((org.joda.time.ReadablePeriod)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.DateTimeFieldType)v1).getField(((org.joda.time.Chronology)v4));
    Object v6 = ((org.joda.time.Partial)v0).without(((org.joda.time.DateTimeFieldType)v1));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTime.now();
    Object v2 = ((org.joda.time.ReadableInstant)v1).hashCode();
    Object v3 = ((org.joda.time.Partial)v0).isMatch(((org.joda.time.ReadableInstant)v1));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.Partial)v0).withChronologyRetainFields(((org.joda.time.Chronology)v3));
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v6));
    Object v8 = ((org.joda.time.Partial)v0).withChronologyRetainFields(((org.joda.time.Chronology)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = 31L;
    Object v2 = org.joda.time.Duration.standardMinutes((((java.lang.Long)v1).longValue()));
    Object v3 = org.joda.time.DateTime.now();
    Object v4 = org.joda.time.PeriodType.hours();
    Object v5 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v3),((org.joda.time.PeriodType)v4));
    Object v6 = ((org.joda.time.ReadablePeriod)v5).toPeriod();
    Object v7 = 1;
    Object v8 = ((org.joda.time.Partial)v0).withPeriodAdded(((org.joda.time.ReadablePeriod)v5),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.DateTimeFieldType)v1).getField(((org.joda.time.Chronology)v4));
    Object v6 = 1;
    Object v7 = ((org.joda.time.Partial)v0).with(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.Partial)v0).withChronologyRetainFields(((org.joda.time.Chronology)v3));
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v6));
    Object v8 = ((org.joda.time.Partial)v0).withChronologyRetainFields(((org.joda.time.Chronology)v7));
    Object v9 = new org.joda.time.Partial();
    Object v10 = ((org.joda.time.base.AbstractPartial)v8).isBefore(((org.joda.time.ReadablePartial)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DurationFieldType.weeks();
    Object v2 = 53;
    Object v3 = ((org.joda.time.Partial)v0).withFieldAddWrapped(((org.joda.time.DurationFieldType)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = ((org.joda.time.Partial)v0).toStringList();
    org.junit.Assert.assertEquals((Object)("[]"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.format.DateTimeFormat.longDateTime();
    Object v2 = ((org.joda.time.base.AbstractPartial)v0).toString(((org.joda.time.format.DateTimeFormatter)v1));
    org.junit.Assert.assertEquals((Object)("\ufffd \ufffd, \ufffd at \ufffd:\ufffd\ufffd:\ufffd\ufffd \ufffd "), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = new org.joda.time.Partial();
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.Partial)v1).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = java.util.TimeZone.getDefault();
    Object v7 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v6));
    Object v8 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v7));
    Object v9 = ((org.joda.time.Partial)v1).withChronologyRetainFields(((org.joda.time.Chronology)v8));
    Object v10 = ((org.joda.time.base.AbstractPartial)v0).compareTo(((org.joda.time.ReadablePartial)v9));
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = new org.joda.time.Partial();
    Object v2 = ((org.joda.time.Partial)v0).isMatch(((org.joda.time.ReadablePartial)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTime.now();
    Object v2 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v3 = ((org.joda.time.ReadableInstant)v1).isSupported(((org.joda.time.DateTimeFieldType)v2));
    Object v4 = ((org.joda.time.Partial)v0).isMatch(((org.joda.time.ReadableInstant)v1));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = ((org.joda.time.base.AbstractPartial)v0).getFields();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = "8";
    Object v2 = ((org.joda.time.Partial)v0).toString(((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("8"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = 31L;
    Object v2 = org.joda.time.Duration.standardMinutes((((java.lang.Long)v1).longValue()));
    Object v3 = org.joda.time.DateTime.now();
    Object v4 = org.joda.time.PeriodType.hours();
    Object v5 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v3),((org.joda.time.PeriodType)v4));
    Object v6 = ((org.joda.time.ReadablePeriod)v5).toPeriod();
    Object v7 = ((org.joda.time.Partial)v0).minus(((org.joda.time.ReadablePeriod)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.DateTimeFieldType)v1).getField(((org.joda.time.Chronology)v4));
    Object v6 = ((org.joda.time.Partial)v0).without(((org.joda.time.DateTimeFieldType)v1));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v7));
    Object v9 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.Partial)v6).withChronologyRetainFields(((org.joda.time.Chronology)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = ((org.joda.time.Partial)v0).getValues();
    Object v2 = 31L;
    Object v3 = org.joda.time.Duration.standardMinutes((((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.DateTime.now();
    Object v5 = org.joda.time.PeriodType.hours();
    Object v6 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v3),((org.joda.time.ReadableInstant)v4),((org.joda.time.PeriodType)v5));
    Object v7 = ((org.joda.time.Partial)v0).plus(((org.joda.time.ReadablePeriod)v6));
    Object v8 = ((org.joda.time.Partial)v7).size();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = -24;
    Object v3 = ((org.joda.time.Partial)v0).withField(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = ((org.joda.time.Partial)v0).without(((org.joda.time.DateTimeFieldType)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = ((org.joda.time.Partial)v0).getValues();
    Object v2 = 31L;
    Object v3 = org.joda.time.Duration.standardMinutes((((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.DateTime.now();
    Object v5 = org.joda.time.PeriodType.hours();
    Object v6 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v3),((org.joda.time.ReadableInstant)v4),((org.joda.time.PeriodType)v5));
    Object v7 = ((org.joda.time.Partial)v0).plus(((org.joda.time.ReadablePeriod)v6));
    Object v8 = ((org.joda.time.Partial)v7).getFormatter();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = ((org.joda.time.Partial)v0).getFieldTypes();
    Object v2 = ((org.joda.time.Partial)v0).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = 31L;
    Object v2 = org.joda.time.Duration.standardMinutes((((java.lang.Long)v1).longValue()));
    Object v3 = org.joda.time.DateTime.now();
    Object v4 = org.joda.time.PeriodType.hours();
    Object v5 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v3),((org.joda.time.PeriodType)v4));
    Object v6 = org.joda.time.DurationFieldType.weeks();
    Object v7 = ((org.joda.time.ReadablePeriod)v5).get(((org.joda.time.DurationFieldType)v6));
    Object v8 = 0;
    Object v9 = ((org.joda.time.Partial)v0).withPeriodAdded(((org.joda.time.ReadablePeriod)v5),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.DateTimeFieldType)v1).getField(((org.joda.time.Chronology)v4));
    Object v6 = ((org.joda.time.Partial)v0).without(((org.joda.time.DateTimeFieldType)v1));
    Object v7 = new org.joda.time.Partial();
    Object v8 = ((org.joda.time.base.AbstractPartial)v6).compareTo(((org.joda.time.ReadablePartial)v7));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = new org.joda.time.Partial();
    Object v2 = ((org.joda.time.base.AbstractPartial)v0).isEqual(((org.joda.time.ReadablePartial)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = 31L;
    Object v2 = org.joda.time.Duration.standardMinutes((((java.lang.Long)v1).longValue()));
    Object v3 = org.joda.time.DateTime.now();
    Object v4 = org.joda.time.PeriodType.hours();
    Object v5 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v3),((org.joda.time.PeriodType)v4));
    Object v6 = ((org.joda.time.ReadablePeriod)v5).toPeriod();
    Object v7 = 1;
    Object v8 = ((org.joda.time.Partial)v0).withPeriodAdded(((org.joda.time.ReadablePeriod)v5),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.Partial)v8).getFieldTypes();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = ((org.joda.time.Partial)v0).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = ((org.joda.time.Partial)v0).getValues();
    Object v2 = 31L;
    Object v3 = org.joda.time.Duration.standardMinutes((((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.DateTime.now();
    Object v5 = org.joda.time.PeriodType.hours();
    Object v6 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v3),((org.joda.time.ReadableInstant)v4),((org.joda.time.PeriodType)v5));
    Object v7 = ((org.joda.time.Partial)v0).plus(((org.joda.time.ReadablePeriod)v6));
    Object v8 = new org.joda.time.Partial();
    Object v9 = ((org.joda.time.base.AbstractPartial)v7).isBefore(((org.joda.time.ReadablePartial)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = 31L;
    Object v2 = org.joda.time.Duration.standardMinutes((((java.lang.Long)v1).longValue()));
    Object v3 = org.joda.time.DateTime.now();
    Object v4 = org.joda.time.PeriodType.hours();
    Object v5 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v3),((org.joda.time.PeriodType)v4));
    Object v6 = ((org.joda.time.Partial)v0).plus(((org.joda.time.ReadablePeriod)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = ((org.joda.time.base.AbstractPartial)v0).isSupported(((org.joda.time.DateTimeFieldType)v1));
    Object v3 = ((org.joda.time.Partial)v0).getFormatter();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v1 = 24;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = 1;
    Object v3 = ((org.joda.time.Partial)v0).with(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = new org.joda.time.Partial();
    Object v2 = ((org.joda.time.Partial)v0).isMatch(((org.joda.time.ReadablePartial)v1));
    Object v3 = "MonthOfYear: ";
    Object v4 = ((org.joda.time.Partial)v0).toString(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.joda.time.DateTimeFieldType[]{};
    Object v1 = new int[]{0};
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.Chronology)v4).hourOfDay();
    Object v6 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType[])v0),((int[])v1),((org.joda.time.Chronology)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.Partial)v0).withChronologyRetainFields(((org.joda.time.Chronology)v3));
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v6));
    Object v8 = ((org.joda.time.Partial)v0).withChronologyRetainFields(((org.joda.time.Chronology)v7));
    Object v9 = ((org.joda.time.base.AbstractPartial)v8).getFields();
    Object v10 = ((org.joda.time.Partial)v8).getFormatter();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = ((org.joda.time.base.AbstractPartial)v0).indexOf(((org.joda.time.DateTimeFieldType)v1));
    Object v3 = ((org.joda.time.Partial)v0).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = ((org.joda.time.Partial)v0).without(((org.joda.time.DateTimeFieldType)v1));
    Object v3 = new org.joda.time.Partial();
    Object v4 = ((org.joda.time.Partial)v3).toStringList();
    Object v5 = ((org.joda.time.base.AbstractPartial)v2).equals(((java.lang.Object)v4));
    Object v6 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v7 = ((org.joda.time.Partial)v2).property(((org.joda.time.DateTimeFieldType)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = 31L;
    Object v2 = org.joda.time.Duration.standardMinutes((((java.lang.Long)v1).longValue()));
    Object v3 = org.joda.time.DateTime.now();
    Object v4 = org.joda.time.PeriodType.hours();
    Object v5 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v3),((org.joda.time.PeriodType)v4));
    Object v6 = 24;
    Object v7 = ((org.joda.time.Partial)v0).withPeriodAdded(((org.joda.time.ReadablePeriod)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.DurationFieldType.weeks();
    Object v9 = 0;
    Object v10 = ((org.joda.time.Partial)v0).withFieldAddWrapped(((org.joda.time.DurationFieldType)v8),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = 6;
    Object v2 = ((org.joda.time.Partial)v0).getFieldType((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v1 = 1;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = 31L;
    Object v2 = org.joda.time.Duration.standardMinutes((((java.lang.Long)v1).longValue()));
    Object v3 = org.joda.time.DateTime.now();
    Object v4 = org.joda.time.PeriodType.hours();
    Object v5 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v3),((org.joda.time.PeriodType)v4));
    Object v6 = ((org.joda.time.Partial)v0).plus(((org.joda.time.ReadablePeriod)v5));
    Object v7 = ((org.joda.time.Partial)v6).toStringList();
    org.junit.Assert.assertEquals((Object)("[]"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.joda.time.DateTimeFieldType[]{null,null};
    Object v1 = new int[]{-20,3,26};
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType[])v0),((int[])v1),((org.joda.time.Chronology)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTime.now();
    Object v2 = ((org.joda.time.Partial)v0).isMatch(((org.joda.time.ReadableInstant)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.joda.time.DateTimeFieldType[]{null,null,null};
    Object v1 = new int[]{-36,1,-16};
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType[])v0),((int[])v1),((org.joda.time.Chronology)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = ((org.joda.time.Partial)v0).getChronology();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = "' is not supportd";
    Object v2 = java.util.Locale.Category.DISPLAY;
    Object v3 = java.util.Locale.getDefault(((java.util.Locale.Category)v2));
    Object v4 = ((org.joda.time.Partial)v0).toString(((java.lang.String)v1),((java.util.Locale)v3));
    org.junit.Assert.assertEquals((Object)(" is not supportd"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = new org.joda.time.Partial();
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.Partial)v1).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = java.util.TimeZone.getDefault();
    Object v7 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v6));
    Object v8 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v7));
    Object v9 = ((org.joda.time.Partial)v1).withChronologyRetainFields(((org.joda.time.Chronology)v8));
    Object v10 = ((org.joda.time.base.AbstractPartial)v0).isAfter(((org.joda.time.ReadablePartial)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v1 = 1;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v4));
    Object v6 = new org.joda.time.Partial();
    Object v7 = ((org.joda.time.Partial)v6).getChronology();
    Object v8 = ((org.joda.time.base.AbstractPartial)v5).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = ((org.joda.time.base.AbstractPartial)v0).indexOf(((org.joda.time.DateTimeFieldType)v1));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = 31L;
    Object v2 = org.joda.time.Duration.standardMinutes((((java.lang.Long)v1).longValue()));
    Object v3 = org.joda.time.DateTime.now();
    Object v4 = org.joda.time.PeriodType.hours();
    Object v5 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v3),((org.joda.time.PeriodType)v4));
    Object v6 = ((org.joda.time.Partial)v0).plus(((org.joda.time.ReadablePeriod)v5));
    Object v7 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v8 = 1;
    Object v9 = ((org.joda.time.Partial)v6).withField(((org.joda.time.DateTimeFieldType)v7),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.DateTimeFieldType)v1).getField(((org.joda.time.Chronology)v4));
    Object v6 = ((org.joda.time.Partial)v0).without(((org.joda.time.DateTimeFieldType)v1));
    Object v7 = ((org.joda.time.base.AbstractPartial)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(885368), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.DateTimeFieldType)v1).getField(((org.joda.time.Chronology)v4));
    Object v6 = ((org.joda.time.Partial)v0).without(((org.joda.time.DateTimeFieldType)v1));
    Object v7 = org.joda.time.DurationFieldType.weeks();
    Object v8 = -44;
    Object v9 = ((org.joda.time.Partial)v6).withFieldAdded(((org.joda.time.DurationFieldType)v7),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = "CDT";
    Object v2 = ((org.joda.time.Partial)v0).toString(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = ((org.joda.time.Partial)v0).without(((org.joda.time.DateTimeFieldType)v1));
    Object v3 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v4 = 1;
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v6));
    Object v8 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()),((org.joda.time.Chronology)v7));
    Object v9 = ((org.joda.time.base.AbstractPartial)v2).isAfter(((org.joda.time.ReadablePartial)v8));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.Partial();
    Object v3 = ((org.joda.time.Partial)v1).isMatch(((org.joda.time.ReadablePartial)v2));
    Object v4 = 31L;
    Object v5 = org.joda.time.Duration.standardMinutes((((java.lang.Long)v4).longValue()));
    Object v6 = org.joda.time.DateTime.now();
    Object v7 = org.joda.time.PeriodType.hours();
    Object v8 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v5),((org.joda.time.ReadableInstant)v6),((org.joda.time.PeriodType)v7));
    Object v9 = -17;
    Object v10 = ((org.joda.time.Partial)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v8),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.DateTimeFieldType)v1).getField(((org.joda.time.Chronology)v4));
    Object v6 = ((org.joda.time.Partial)v0).without(((org.joda.time.DateTimeFieldType)v1));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v7));
    Object v9 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.Partial)v6).withChronologyRetainFields(((org.joda.time.Chronology)v9));
    Object v11 = new org.joda.time.Partial();
    Object v12 = 31L;
    Object v13 = org.joda.time.Duration.standardMinutes((((java.lang.Long)v12).longValue()));
    Object v14 = org.joda.time.DateTime.now();
    Object v15 = org.joda.time.PeriodType.hours();
    Object v16 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v13),((org.joda.time.ReadableInstant)v14),((org.joda.time.PeriodType)v15));
    Object v17 = ((org.joda.time.Partial)v11).plus(((org.joda.time.ReadablePeriod)v16));
    Object v18 = ((org.joda.time.base.AbstractPartial)v10).isEqual(((org.joda.time.ReadablePartial)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTime.now();
    Object v2 = ((org.joda.time.base.AbstractPartial)v0).toDateTime(((org.joda.time.ReadableInstant)v1));
    Object v3 = ((org.joda.time.base.AbstractPartial)v0).hashCode();
    org.junit.Assert.assertEquals((Object)(885368), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = ((org.joda.time.Partial)v0).toStringList();
    Object v2 = org.joda.time.DurationFieldType.weeks();
    Object v3 = 44;
    Object v4 = ((org.joda.time.Partial)v0).withFieldAdded(((org.joda.time.DurationFieldType)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.Partial();
    Object v3 = ((org.joda.time.Partial)v1).isMatch(((org.joda.time.ReadablePartial)v2));
    Object v4 = 31L;
    Object v5 = org.joda.time.Duration.standardMinutes((((java.lang.Long)v4).longValue()));
    Object v6 = org.joda.time.DateTime.now();
    Object v7 = org.joda.time.PeriodType.hours();
    Object v8 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v5),((org.joda.time.ReadableInstant)v6),((org.joda.time.PeriodType)v7));
    Object v9 = -17;
    Object v10 = ((org.joda.time.Partial)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = new org.joda.time.Partial();
    Object v12 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v13 = 1;
    Object v14 = ((org.joda.time.Partial)v11).with(((org.joda.time.DateTimeFieldType)v12),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.joda.time.base.AbstractPartial)v10).isBefore(((org.joda.time.ReadablePartial)v14));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = ((org.joda.time.Partial)v0).without(((org.joda.time.DateTimeFieldType)v1));
    Object v3 = ((org.joda.time.Partial)v2).getFormatter();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = ((org.joda.time.Partial)v0).getValues();
    Object v2 = 31L;
    Object v3 = org.joda.time.Duration.standardMinutes((((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.DateTime.now();
    Object v5 = org.joda.time.PeriodType.hours();
    Object v6 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v3),((org.joda.time.ReadableInstant)v4),((org.joda.time.PeriodType)v5));
    Object v7 = ((org.joda.time.Partial)v0).plus(((org.joda.time.ReadablePeriod)v6));
    Object v8 = ((org.joda.time.base.AbstractPartial)v7).getFieldTypes();
    Object v9 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v10 = 24;
    Object v11 = java.util.TimeZone.getDefault();
    Object v12 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v11));
    Object v13 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v12));
    Object v14 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v9),(((java.lang.Integer)v10).intValue()),((org.joda.time.Chronology)v13));
    Object v15 = ((org.joda.time.base.AbstractPartial)v7).isAfter(((org.joda.time.ReadablePartial)v14));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = ((org.joda.time.base.AbstractPartial)v0).hashCode();
    org.junit.Assert.assertEquals((Object)(885368), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.Partial)v0).withChronologyRetainFields(((org.joda.time.Chronology)v3));
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v6));
    Object v8 = ((org.joda.time.Partial)v0).withChronologyRetainFields(((org.joda.time.Chronology)v7));
    Object v9 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.Partial();
    Object v3 = ((org.joda.time.base.AbstractPartial)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DurationFieldType.weeks();
    Object v2 = 0;
    Object v3 = ((org.joda.time.Partial)v0).withFieldAdded(((org.joda.time.DurationFieldType)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = 1;
    Object v3 = ((org.joda.time.Partial)v0).with(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.joda.time.Partial)v3).getFormatter();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = 31L;
    Object v2 = org.joda.time.Duration.standardMinutes((((java.lang.Long)v1).longValue()));
    Object v3 = org.joda.time.DateTime.now();
    Object v4 = org.joda.time.PeriodType.hours();
    Object v5 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v3),((org.joda.time.PeriodType)v4));
    Object v6 = ((org.joda.time.Partial)v0).plus(((org.joda.time.ReadablePeriod)v5));
    Object v7 = new org.joda.time.Partial();
    Object v8 = ((org.joda.time.base.AbstractPartial)v6).isEqual(((org.joda.time.ReadablePartial)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v1 = 1;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v4));
    Object v6 = "-";
    Object v7 = ((org.joda.time.Partial)v5).toString(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)("-"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v3 = ((org.joda.time.base.AbstractPartial)v1).isSupported(((org.joda.time.DateTimeFieldType)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = ((org.joda.time.Partial)v0).size();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = 31L;
    Object v2 = org.joda.time.Duration.standardMinutes((((java.lang.Long)v1).longValue()));
    Object v3 = org.joda.time.DateTime.now();
    Object v4 = org.joda.time.PeriodType.hours();
    Object v5 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v3),((org.joda.time.PeriodType)v4));
    Object v6 = ((org.joda.time.Partial)v0).minus(((org.joda.time.ReadablePeriod)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.DateTimeFieldType)v1).getField(((org.joda.time.Chronology)v4));
    Object v6 = ((org.joda.time.Partial)v0).without(((org.joda.time.DateTimeFieldType)v1));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v7));
    Object v9 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.Partial)v6).withChronologyRetainFields(((org.joda.time.Chronology)v9));
    Object v11 = 31L;
    Object v12 = org.joda.time.Duration.standardMinutes((((java.lang.Long)v11).longValue()));
    Object v13 = org.joda.time.DateTime.now();
    Object v14 = org.joda.time.PeriodType.hours();
    Object v15 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v12),((org.joda.time.ReadableInstant)v13),((org.joda.time.PeriodType)v14));
    Object v16 = 0;
    Object v17 = ((org.joda.time.Partial)v10).withPeriodAdded(((org.joda.time.ReadablePeriod)v15),(((java.lang.Integer)v16).intValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = ((org.joda.time.Partial)v0).without(((org.joda.time.DateTimeFieldType)v1));
    Object v3 = org.joda.time.format.DateTimeFormat.longDateTime();
    Object v4 = ((org.joda.time.base.AbstractPartial)v2).toString(((org.joda.time.format.DateTimeFormatter)v3));
    org.junit.Assert.assertEquals((Object)("\ufffd \ufffd, \ufffd at \ufffd:\ufffd\ufffd:\ufffd\ufffd \ufffd "), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = new org.joda.time.Partial();
    Object v2 = ((org.joda.time.base.AbstractPartial)v0).isAfter(((org.joda.time.ReadablePartial)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = 31L;
    Object v2 = org.joda.time.Duration.standardMinutes((((java.lang.Long)v1).longValue()));
    Object v3 = org.joda.time.DateTime.now();
    Object v4 = org.joda.time.PeriodType.hours();
    Object v5 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v3),((org.joda.time.PeriodType)v4));
    Object v6 = ((org.joda.time.Partial)v0).plus(((org.joda.time.ReadablePeriod)v5));
    Object v7 = new org.joda.time.Partial();
    Object v8 = ((org.joda.time.Partial)v7).getChronology();
    Object v9 = ((org.joda.time.Partial)v6).withChronologyRetainFields(((org.joda.time.Chronology)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.Partial)v0).withChronologyRetainFields(((org.joda.time.Chronology)v3));
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v6));
    Object v8 = ((org.joda.time.Partial)v0).withChronologyRetainFields(((org.joda.time.Chronology)v7));
    Object v9 = java.util.TimeZone.getDefault();
    Object v10 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v9));
    Object v11 = ((org.joda.time.base.AbstractPartial)v8).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v1 = 1;
    Object v2 = new org.joda.time.Partial();
    Object v3 = ((org.joda.time.Partial)v2).getChronology();
    Object v4 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.Partial();
    Object v3 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v4 = ((org.joda.time.Partial)v2).without(((org.joda.time.DateTimeFieldType)v3));
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = ((org.joda.time.ReadablePartial)v4).equals(((java.lang.Object)v5));
    Object v7 = ((org.joda.time.base.AbstractPartial)v1).compareTo(((org.joda.time.ReadablePartial)v4));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = 1;
    Object v3 = ((org.joda.time.Partial)v0).with(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.joda.time.base.AbstractPartial)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(968543), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = "Adding time zone offset caused overflow";
    Object v2 = java.util.Locale.Category.DISPLAY;
    Object v3 = java.util.Locale.getDefault(((java.util.Locale.Category)v2));
    Object v4 = ((org.joda.time.Partial)v0).toString(((java.lang.String)v1),((java.util.Locale)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = new org.joda.time.Partial();
    Object v2 = ((org.joda.time.Partial)v1).getChronology();
    Object v3 = ((org.joda.time.Partial)v0).withChronologyRetainFields(((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.DateTime.now();
    Object v5 = ((org.joda.time.ReadableInstant)v4).getChronology();
    Object v6 = ((org.joda.time.Partial)v0).isMatch(((org.joda.time.ReadableInstant)v4));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = ((org.joda.time.Partial)v0).without(((org.joda.time.DateTimeFieldType)v1));
    Object v3 = "-";
    Object v4 = ((org.joda.time.Partial)v2).toString(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)("-"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v1 = 24;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v4));
    Object v6 = new org.joda.time.Partial();
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v7));
    Object v9 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.Partial)v6).withChronologyRetainFields(((org.joda.time.Chronology)v9));
    Object v11 = java.util.TimeZone.getDefault();
    Object v12 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v11));
    Object v13 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v12));
    Object v14 = ((org.joda.time.Partial)v6).withChronologyRetainFields(((org.joda.time.Chronology)v13));
    Object v15 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v14));
    Object v16 = ((org.joda.time.base.AbstractPartial)v5).compareTo(((org.joda.time.ReadablePartial)v15));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = 1;
    Object v3 = ((org.joda.time.Partial)v0).with(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.DurationFieldType.weeks();
    Object v5 = 1;
    Object v6 = ((org.joda.time.Partial)v3).withFieldAdded(((org.joda.time.DurationFieldType)v4),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = 31L;
    Object v2 = org.joda.time.Duration.standardMinutes((((java.lang.Long)v1).longValue()));
    Object v3 = org.joda.time.DateTime.now();
    Object v4 = org.joda.time.PeriodType.hours();
    Object v5 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v3),((org.joda.time.PeriodType)v4));
    Object v6 = ((org.joda.time.ReadablePeriod)v5).toPeriod();
    Object v7 = 1;
    Object v8 = ((org.joda.time.Partial)v0).withPeriodAdded(((org.joda.time.ReadablePeriod)v5),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v10 = 1;
    Object v11 = ((org.joda.time.Partial)v8).withField(((org.joda.time.DateTimeFieldType)v9),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DurationFieldType.weeks();
    Object v2 = new org.joda.time.Partial();
    Object v3 = ((org.joda.time.Partial)v2).getChronology();
    Object v4 = ((org.joda.time.DurationFieldType)v1).isSupported(((org.joda.time.Chronology)v3));
    Object v5 = 1;
    Object v6 = ((org.joda.time.Partial)v0).withFieldAdded(((org.joda.time.DurationFieldType)v1),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.Partial();
    Object v3 = ((org.joda.time.Partial)v1).isMatch(((org.joda.time.ReadablePartial)v2));
    Object v4 = 31L;
    Object v5 = org.joda.time.Duration.standardMinutes((((java.lang.Long)v4).longValue()));
    Object v6 = org.joda.time.DateTime.now();
    Object v7 = org.joda.time.PeriodType.hours();
    Object v8 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v5),((org.joda.time.ReadableInstant)v6),((org.joda.time.PeriodType)v7));
    Object v9 = -17;
    Object v10 = ((org.joda.time.Partial)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = new org.joda.time.Partial();
    Object v12 = ((org.joda.time.Partial)v11).getChronology();
    Object v13 = ((org.joda.time.Partial)v10).withChronologyRetainFields(((org.joda.time.Chronology)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = ((org.joda.time.Partial)v0).without(((org.joda.time.DateTimeFieldType)v1));
    Object v3 = new org.joda.time.Partial();
    Object v4 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v5 = 1;
    Object v6 = ((org.joda.time.Partial)v3).with(((org.joda.time.DateTimeFieldType)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.joda.time.ReadablePartial)v6).size();
    Object v8 = ((org.joda.time.base.AbstractPartial)v2).isAfter(((org.joda.time.ReadablePartial)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v2 = -28;
    Object v3 = ((org.joda.time.Partial)v0).withField(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v1 = 24;
    Object v2 = new org.joda.time.Partial();
    Object v3 = ((org.joda.time.Partial)v2).getChronology();
    Object v4 = ((org.joda.time.Chronology)v3).centuryOfEra();
    Object v5 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.Partial)v0).withChronologyRetainFields(((org.joda.time.Chronology)v3));
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v6));
    Object v8 = ((org.joda.time.Partial)v0).withChronologyRetainFields(((org.joda.time.Chronology)v7));
    Object v9 = ((org.joda.time.Partial)v8).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = 31L;
    Object v2 = org.joda.time.Duration.standardMinutes((((java.lang.Long)v1).longValue()));
    Object v3 = org.joda.time.DateTime.now();
    Object v4 = org.joda.time.PeriodType.hours();
    Object v5 = new org.joda.time.Period(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v3),((org.joda.time.PeriodType)v4));
    Object v6 = 20;
    Object v7 = ((org.joda.time.Partial)v0).withPeriodAdded(((org.joda.time.ReadablePeriod)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.DurationFieldType.weeks();
    Object v9 = 1;
    Object v10 = ((org.joda.time.Partial)v0).withFieldAdded(((org.joda.time.DurationFieldType)v8),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v1 = 1;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = org.joda.time.chrono.CopticChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v4));
    Object v6 = org.joda.time.DateTime.now();
    Object v7 = ((org.joda.time.Partial)v5).isMatch(((org.joda.time.ReadableInstant)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v1 = 1;
    Object v2 = new org.joda.time.Partial();
    Object v3 = ((org.joda.time.Partial)v2).getChronology();
    Object v4 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.Partial)v4).getValues();
    Object v6 = ((org.joda.time.Partial)v4).getFormatter();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = new org.joda.time.Partial();
    Object v2 = ((org.joda.time.Partial)v0).isMatch(((org.joda.time.ReadablePartial)v1));
    Object v3 = new org.joda.time.Partial();
    Object v4 = ((org.joda.time.Partial)v3).getChronology();
    Object v5 = ((org.joda.time.Partial)v0).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = new org.joda.time.Partial();
    Object v2 = ((org.joda.time.Partial)v0).isMatch(((org.joda.time.ReadablePartial)v1));
    Object v3 = new org.joda.time.Partial();
    Object v4 = ((org.joda.time.Partial)v3).getChronology();
    Object v5 = ((org.joda.time.Partial)v0).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = ((org.joda.time.base.AbstractPartial)v5).getFields();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v1 = 15;
    Object v2 = new org.joda.time.Partial();
    Object v3 = ((org.joda.time.Partial)v2).getChronology();
    Object v4 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v3));
    org.junit.Assert.assertNotNull(v4);
  }
}
