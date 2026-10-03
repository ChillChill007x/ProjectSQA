package org.joda.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = ((org.joda.time.base.AbstractPartial)v0).getFields();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.MutablePeriod();
    Object v3 = 0;
    Object v4 = ((org.joda.time.Partial)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v3 = ((org.joda.time.Partial)v1).without(((org.joda.time.DateTimeFieldType)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.MutablePeriod();
    Object v3 = 0;
    Object v4 = ((org.joda.time.Partial)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = org.joda.time.DateMidnight.now(((org.joda.time.DateTimeZone)v5));
    Object v7 = ((org.joda.time.base.AbstractPartial)v4).toDateTime(((org.joda.time.ReadableInstant)v6));
    Object v8 = org.joda.time.LocalDate.now();
    Object v9 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v8));
    Object v10 = ((org.joda.time.base.AbstractPartial)v4).compareTo(((org.joda.time.ReadablePartial)v9));
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = org.joda.time.LocalDate.now();
    Object v2 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    Object v3 = ((org.joda.time.base.AbstractPartial)v0).isAfter(((org.joda.time.ReadablePartial)v2));
    Object v4 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecond();
    Object v5 = ((org.joda.time.base.AbstractPartial)v0).toString(((org.joda.time.format.DateTimeFormatter)v4));
    org.junit.Assert.assertEquals((Object)("2026-09-30T\ufffd\ufffd:\ufffd\ufffd:\ufffd\ufffd"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v3 = ((org.joda.time.Partial)v1).without(((org.joda.time.DateTimeFieldType)v2));
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = ((org.joda.time.base.AbstractPartial)v3).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = org.joda.time.DateMidnight.now(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.base.AbstractPartial)v1).toDateTime(((org.joda.time.ReadableInstant)v3));
    Object v5 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v6 = ((org.joda.time.base.AbstractPartial)v1).indexOf(((org.joda.time.DateTimeFieldType)v5));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = ((org.joda.time.Partial)v1).toString();
    Object v3 = ((org.joda.time.Partial)v1).getFormatter();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.LocalDate.now();
    Object v3 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v2));
    Object v4 = ((org.joda.time.Partial)v1).isMatch(((org.joda.time.ReadablePartial)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = ((org.joda.time.Partial)v1).toString();
    org.junit.Assert.assertEquals((Object)("2026-09-30"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.LocalDate.now();
    Object v3 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v2));
    Object v4 = new org.joda.time.MutablePeriod();
    Object v5 = 0;
    Object v6 = ((org.joda.time.Partial)v3).withPeriodAdded(((org.joda.time.ReadablePeriod)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.joda.time.ReadablePartial)v6).size();
    Object v8 = ((org.joda.time.base.AbstractPartial)v1).isBefore(((org.joda.time.ReadablePartial)v6));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = ((org.joda.time.base.AbstractPartial)v1).getFields();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.base.AbstractPartial)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.MutablePeriod();
    Object v3 = 0;
    Object v4 = ((org.joda.time.Partial)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.DurationFieldType.months();
    Object v6 = 1;
    Object v7 = ((org.joda.time.Partial)v4).withFieldAddWrapped(((org.joda.time.DurationFieldType)v5),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.MutablePeriod();
    Object v3 = 0;
    Object v4 = ((org.joda.time.Partial)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.DurationFieldType.months();
    Object v6 = 1;
    Object v7 = ((org.joda.time.Partial)v4).withFieldAddWrapped(((org.joda.time.DurationFieldType)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.DateTimeZone.getDefault();
    Object v9 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v8));
    Object v10 = 1L;
    Object v11 = 1L;
    Object v12 = -1;
    Object v13 = ((org.joda.time.Chronology)v9).add((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.Partial)v7).withChronologyRetainFields(((org.joda.time.Chronology)v9));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.MutablePeriod();
    Object v3 = 0;
    Object v4 = ((org.joda.time.Partial)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = org.joda.time.DateMidnight.now(((org.joda.time.DateTimeZone)v5));
    Object v7 = ((org.joda.time.ReadableInstant)v6).getMillis();
    Object v8 = ((org.joda.time.Partial)v4).isMatch(((org.joda.time.ReadableInstant)v6));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = org.joda.time.DateMidnight.now(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.base.AbstractPartial)v1).toDateTime(((org.joda.time.ReadableInstant)v3));
    Object v5 = org.joda.time.LocalDate.now();
    Object v6 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v5));
    Object v7 = ((org.joda.time.Partial)v6).toString();
    Object v8 = ((org.joda.time.Partial)v6).getFormatter();
    Object v9 = ((org.joda.time.base.AbstractPartial)v1).toString(((org.joda.time.format.DateTimeFormatter)v8));
    org.junit.Assert.assertEquals((Object)("2026-09-30"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.Chronology)v3).centuryOfEra();
    Object v5 = ((org.joda.time.Partial)v1).withChronologyRetainFields(((org.joda.time.Chronology)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = new org.joda.time.MutablePeriod();
    Object v5 = 0L;
    Object v6 = 0;
    Object v7 = ((org.joda.time.Chronology)v3).add(((org.joda.time.ReadablePeriod)v4),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v3));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v3 = ((org.joda.time.Partial)v1).without(((org.joda.time.DateTimeFieldType)v2));
    Object v4 = new org.joda.time.MutablePeriod();
    Object v5 = ((org.joda.time.Partial)v3).plus(((org.joda.time.ReadablePeriod)v4));
    Object v6 = org.joda.time.DurationFieldType.months();
    Object v7 = -12;
    Object v8 = ((org.joda.time.Partial)v3).withFieldAdded(((org.joda.time.DurationFieldType)v6),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v3 = ((org.joda.time.Partial)v1).without(((org.joda.time.DateTimeFieldType)v2));
    Object v4 = "YM";
    Object v5 = "hours";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = ((org.joda.time.Partial)v3).toString(((java.lang.String)v4),((java.util.Locale)v6));
    org.junit.Assert.assertEquals((Object)("\ufffd9"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = org.joda.time.LocalDate.now();
    Object v2 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    Object v3 = new org.joda.time.MutablePeriod();
    Object v4 = 0;
    Object v5 = ((org.joda.time.Partial)v2).withPeriodAdded(((org.joda.time.ReadablePeriod)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.base.AbstractPartial)v0).isEqual(((org.joda.time.ReadablePartial)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = new org.joda.time.MutablePeriod();
    Object v5 = 0L;
    Object v6 = 0;
    Object v7 = ((org.joda.time.Chronology)v3).add(((org.joda.time.ReadablePeriod)v4),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v3));
    Object v9 = ((org.joda.time.Partial)v8).toStringList();
    org.junit.Assert.assertEquals((Object)("[dayOfYear=1]"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v3 = ((org.joda.time.Partial)v1).without(((org.joda.time.DateTimeFieldType)v2));
    Object v4 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v5 = 0;
    Object v6 = ((org.joda.time.Partial)v3).with(((org.joda.time.DateTimeFieldType)v4),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.MutablePeriod();
    Object v3 = 0;
    Object v4 = ((org.joda.time.Partial)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.joda.time.Partial)v4).getValues();
    Object v6 = ((org.joda.time.Partial)v4).getFieldTypes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = new org.joda.time.MutablePeriod();
    Object v5 = 0L;
    Object v6 = 0;
    Object v7 = ((org.joda.time.Chronology)v3).add(((org.joda.time.ReadablePeriod)v4),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v3));
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = org.joda.time.DateMidnight.now(((org.joda.time.DateTimeZone)v9));
    Object v11 = ((org.joda.time.Partial)v8).isMatch(((org.joda.time.ReadableInstant)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.LocalDate.now();
    Object v3 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v2));
    Object v4 = new org.joda.time.MutablePeriod();
    Object v5 = 0;
    Object v6 = ((org.joda.time.Partial)v3).withPeriodAdded(((org.joda.time.ReadablePeriod)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.DurationFieldType.months();
    Object v8 = 1;
    Object v9 = ((org.joda.time.Partial)v6).withFieldAddWrapped(((org.joda.time.DurationFieldType)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.joda.time.DateTimeZone.getDefault();
    Object v11 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v10));
    Object v12 = 1L;
    Object v13 = 1L;
    Object v14 = -1;
    Object v15 = ((org.joda.time.Chronology)v11).add((((java.lang.Long)v12).longValue()),(((java.lang.Long)v13).longValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.joda.time.Partial)v9).withChronologyRetainFields(((org.joda.time.Chronology)v11));
    Object v17 = ((org.joda.time.base.AbstractPartial)v1).isAfter(((org.joda.time.ReadablePartial)v16));
    Object v18 = ((org.joda.time.base.AbstractPartial)v1).getFields();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    Object v3 = new org.joda.time.MutablePeriod();
    Object v4 = ((org.joda.time.Partial)v2).plus(((org.joda.time.ReadablePeriod)v3));
    Object v5 = ((org.joda.time.Partial)v2).toStringList();
    org.junit.Assert.assertEquals((Object)("[year=2026, monthOfYear=9, dayOfMonth=30]"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.MutablePeriod();
    Object v3 = 0;
    Object v4 = ((org.joda.time.Partial)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v6 = ((org.joda.time.Partial)v4).without(((org.joda.time.DateTimeFieldType)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = "DateTimeField[";
    Object v3 = "hours";
    Object v4 = new java.util.Locale(((java.lang.String)v3));
    Object v5 = ((org.joda.time.Partial)v1).toString(((java.lang.String)v2),((java.util.Locale)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.LocalDate.now();
    Object v3 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v2));
    Object v4 = ((org.joda.time.base.AbstractPartial)v1).isBefore(((org.joda.time.ReadablePartial)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = new org.joda.time.MutablePeriod();
    Object v5 = 0L;
    Object v6 = 0;
    Object v7 = ((org.joda.time.Chronology)v3).add(((org.joda.time.ReadablePeriod)v4),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v3));
    Object v9 = org.joda.time.LocalDate.now();
    Object v10 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v9));
    Object v11 = ((org.joda.time.base.AbstractPartial)v8).isEqual(((org.joda.time.ReadablePartial)v10));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    Object v3 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v4 = 20;
    Object v5 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.MutablePeriod();
    Object v3 = 0;
    Object v4 = ((org.joda.time.Partial)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v6 = ((org.joda.time.Partial)v4).without(((org.joda.time.DateTimeFieldType)v5));
    Object v7 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v8 = ((org.joda.time.base.AbstractPartial)v6).isSupported(((org.joda.time.DateTimeFieldType)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = "ReadablePartial objects must h";
    Object v3 = ((org.joda.time.Partial)v1).toString(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v3 = ((org.joda.time.ReadablePartial)v1).isSupported(((org.joda.time.DateTimeFieldType)v2));
    Object v4 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = new org.joda.time.MutablePeriod();
    Object v5 = 0L;
    Object v6 = 0;
    Object v7 = ((org.joda.time.Chronology)v3).add(((org.joda.time.ReadablePeriod)v4),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v3));
    Object v9 = ((org.joda.time.Partial)v8).size();
    org.junit.Assert.assertEquals((Object)(1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v1 = -49;
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v3));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.MutablePeriod();
    Object v3 = 0;
    Object v4 = ((org.joda.time.Partial)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = org.joda.time.DateMidnight.now(((org.joda.time.DateTimeZone)v5));
    Object v7 = ((org.joda.time.base.AbstractPartial)v4).toDateTime(((org.joda.time.ReadableInstant)v6));
    Object v8 = ((org.joda.time.Partial)v4).toString();
    org.junit.Assert.assertEquals((Object)("2026-09-30"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = ((org.joda.time.base.AbstractPartial)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(1931945407), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v3 = ((org.joda.time.ReadablePartial)v1).isSupported(((org.joda.time.DateTimeFieldType)v2));
    Object v4 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    Object v5 = org.joda.time.LocalDate.now();
    Object v6 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v5));
    Object v7 = ((org.joda.time.ReadablePartial)v6).size();
    Object v8 = ((org.joda.time.base.AbstractPartial)v4).isAfter(((org.joda.time.ReadablePartial)v6));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v3 = ((org.joda.time.Partial)v1).without(((org.joda.time.DateTimeFieldType)v2));
    Object v4 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecond();
    Object v5 = ((org.joda.time.base.AbstractPartial)v3).equals(((java.lang.Object)v4));
    Object v6 = org.joda.time.LocalDate.now();
    Object v7 = ((org.joda.time.base.AbstractPartial)v3).compareTo(((org.joda.time.ReadablePartial)v6));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    Object v3 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v4 = 1;
    Object v5 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    Object v3 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v4 = 20;
    Object v5 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v7 = ((org.joda.time.base.AbstractPartial)v5).indexOf(((org.joda.time.DateTimeFieldType)v6));
    Object v8 = "' is not supported";
    Object v9 = ((org.joda.time.Partial)v5).toString(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(" is not supported"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = new org.joda.time.MutablePeriod();
    Object v5 = 0L;
    Object v6 = 0;
    Object v7 = ((org.joda.time.Chronology)v3).add(((org.joda.time.ReadablePeriod)v4),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v3));
    Object v9 = ((org.joda.time.Partial)v8).toString();
    Object v10 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v11 = ((org.joda.time.Partial)v8).without(((org.joda.time.DateTimeFieldType)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = -1;
    Object v3 = ((org.joda.time.base.AbstractPartial)v1).getField((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    Object v3 = ((org.joda.time.base.AbstractPartial)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(1931945407), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v3 = ((org.joda.time.Partial)v1).without(((org.joda.time.DateTimeFieldType)v2));
    Object v4 = ((org.joda.time.Partial)v3).getFormatter();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v1 = 23;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    Object v3 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v4 = 1;
    Object v5 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.base.AbstractPartial)v5).getFields();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v1 = 23;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.base.AbstractPartial)v2).getFields();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = ((org.joda.time.Partial)v1).toStringList();
    org.junit.Assert.assertEquals((Object)("[year=2026, monthOfYear=9, dayOfMonth=30]"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = ((org.joda.time.Partial)v1).toString();
    Object v3 = "Prefx not followed by field";
    Object v4 = "hours";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = ((org.joda.time.Partial)v1).toString(((java.lang.String)v3),((java.util.Locale)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v2 = ((org.joda.time.base.AbstractPartial)v0).isSupported(((org.joda.time.DateTimeFieldType)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v3));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v1 = 33;
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.Chronology)v3).millisOfSecond();
    Object v5 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v3 = ((org.joda.time.DateTimeFieldType)v2).getRangeDurationType();
    Object v4 = 3;
    Object v5 = ((org.joda.time.Partial)v1).withField(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v1 = 23;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = org.joda.time.DateMidnight.now(((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.Partial)v2).isMatch(((org.joda.time.ReadableInstant)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    Object v3 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v4 = 1;
    Object v5 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecond();
    Object v7 = ((org.joda.time.base.AbstractPartial)v5).toString(((org.joda.time.format.DateTimeFormatter)v6));
    Object v8 = org.joda.time.LocalDate.now();
    Object v9 = ((org.joda.time.base.AbstractPartial)v5).isEqual(((org.joda.time.ReadablePartial)v8));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v1 = 23;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.Partial)v2).getFormatter();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = new org.joda.time.MutablePeriod();
    Object v5 = 0L;
    Object v6 = 0;
    Object v7 = ((org.joda.time.Chronology)v3).add(((org.joda.time.ReadablePeriod)v4),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v3));
    Object v9 = ((org.joda.time.Partial)v8).toString();
    Object v10 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v11 = ((org.joda.time.Partial)v8).without(((org.joda.time.DateTimeFieldType)v10));
    Object v12 = org.joda.time.DurationFieldType.months();
    Object v13 = 0;
    Object v14 = ((org.joda.time.Partial)v11).withFieldAdded(((org.joda.time.DurationFieldType)v12),(((java.lang.Integer)v13).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = org.joda.time.DateMidnight.now(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.base.AbstractPartial)v1).toDateTime(((org.joda.time.ReadableInstant)v3));
    Object v5 = ((org.joda.time.base.AbstractPartial)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(1931945407), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    Object v3 = org.joda.time.DurationFieldType.months();
    Object v4 = 1;
    Object v5 = ((org.joda.time.Partial)v2).withFieldAdded(((org.joda.time.DurationFieldType)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.MutablePeriod();
    Object v3 = 0;
    Object v4 = ((org.joda.time.Partial)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.DurationFieldType.months();
    Object v6 = 1;
    Object v7 = ((org.joda.time.Partial)v4).withFieldAddWrapped(((org.joda.time.DurationFieldType)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v9 = ((org.joda.time.base.AbstractPartial)v7).isSupported(((org.joda.time.DateTimeFieldType)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    Object v3 = org.joda.time.LocalDate.now();
    Object v4 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v3));
    Object v5 = new org.joda.time.MutablePeriod();
    Object v6 = 0;
    Object v7 = ((org.joda.time.Partial)v4).withPeriodAdded(((org.joda.time.ReadablePeriod)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v9 = ((org.joda.time.Partial)v7).without(((org.joda.time.DateTimeFieldType)v8));
    Object v10 = ((org.joda.time.base.AbstractPartial)v2).isEqual(((org.joda.time.ReadablePartial)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v3 = ((org.joda.time.Partial)v1).without(((org.joda.time.DateTimeFieldType)v2));
    Object v4 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v5 = 0;
    Object v6 = ((org.joda.time.Partial)v3).withField(((org.joda.time.DateTimeFieldType)v4),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    Object v3 = ((org.joda.time.ReadablePartial)v2).size();
    Object v4 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v5 = 33;
    Object v6 = org.joda.time.DateTimeZone.getDefault();
    Object v7 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v6));
    Object v8 = ((org.joda.time.Chronology)v7).millisOfSecond();
    Object v9 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v4),(((java.lang.Integer)v5).intValue()),((org.joda.time.Chronology)v7));
    Object v10 = ((org.joda.time.base.AbstractPartial)v2).compareTo(((org.joda.time.ReadablePartial)v9));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.joda.time.DateTimeFieldType[]{null,null,null};
    Object v1 = new int[]{4};
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = new org.joda.time.MutablePeriod();
    Object v5 = 0L;
    Object v6 = 2L;
    Object v7 = ((org.joda.time.Chronology)v3).get(((org.joda.time.ReadablePeriod)v4),(((java.lang.Long)v5).longValue()),(((java.lang.Long)v6).longValue()));
    Object v8 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType[])v0),((int[])v1),((org.joda.time.Chronology)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    Object v3 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v4 = 20;
    Object v5 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DurationFieldType.months();
    Object v7 = 1;
    Object v8 = ((org.joda.time.Partial)v5).withFieldAddWrapped(((org.joda.time.DurationFieldType)v6),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    Object v3 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v4 = 1;
    Object v5 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.Partial)v5).toStringList();
    Object v7 = "CT";
    Object v8 = ((org.joda.time.Partial)v5).toString(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.MutablePeriod();
    Object v3 = 0;
    Object v4 = ((org.joda.time.Partial)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v6 = ((org.joda.time.Partial)v4).without(((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.Partial)v6).toStringList();
    org.junit.Assert.assertEquals((Object)("[year=2026, monthOfYear=9, dayOfMonth=30]"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v1 = 23;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.Partial)v2).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.joda.time.DateTimeFieldType[]{null,null,null};
    Object v1 = new int[]{0,0};
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = org.joda.time.LocalDate.now();
    Object v5 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v4));
    Object v6 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v7 = ((org.joda.time.Partial)v5).without(((org.joda.time.DateTimeFieldType)v6));
    Object v8 = 0L;
    Object v9 = ((org.joda.time.Chronology)v3).set(((org.joda.time.ReadablePartial)v7),(((java.lang.Long)v8).longValue()));
    Object v10 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType[])v0),((int[])v1),((org.joda.time.Chronology)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.MutablePeriod();
    Object v3 = 0;
    Object v4 = ((org.joda.time.Partial)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v6 = ((org.joda.time.Partial)v4).without(((org.joda.time.DateTimeFieldType)v5));
    Object v7 = org.joda.time.DateTimeZone.getDefault();
    Object v8 = org.joda.time.DateMidnight.now(((org.joda.time.DateTimeZone)v7));
    Object v9 = ((org.joda.time.base.AbstractPartial)v6).toDateTime(((org.joda.time.ReadableInstant)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v3 = ((org.joda.time.base.AbstractPartial)v1).indexOf(((org.joda.time.DateTimeFieldType)v2));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v1 = 23;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v4 = 1;
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v5));
    Object v7 = new org.joda.time.MutablePeriod();
    Object v8 = 0L;
    Object v9 = 0;
    Object v10 = ((org.joda.time.Chronology)v6).add(((org.joda.time.ReadablePeriod)v7),(((java.lang.Long)v8).longValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()),((org.joda.time.Chronology)v6));
    Object v12 = ((org.joda.time.base.AbstractPartial)v2).compareTo(((org.joda.time.ReadablePartial)v11));
    org.junit.Assert.assertEquals((Object)(1), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = ((org.joda.time.Partial)v0).getChronology();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v1 = 23;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.Partial)v2).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = ((org.joda.time.Partial)v5).toStringList();
    org.junit.Assert.assertEquals((Object)("[dayOfYear=23]"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial();
    Object v2 = ((org.joda.time.base.AbstractPartial)v0).isBefore(((org.joda.time.ReadablePartial)v1));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = new org.joda.time.Partial();
    Object v2 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    Object v3 = ((org.joda.time.base.AbstractPartial)v0).compareTo(((org.joda.time.ReadablePartial)v2));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v3 = ((org.joda.time.base.AbstractPartial)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v1 = 33;
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.Chronology)v3).millisOfSecond();
    Object v5 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v3));
    Object v6 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v7 = ((org.joda.time.Partial)v5).without(((org.joda.time.DateTimeFieldType)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.MutablePeriod();
    Object v3 = 0;
    Object v4 = ((org.joda.time.Partial)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = ((org.joda.time.base.AbstractPartial)v4).getField((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    Object v3 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v4 = 20;
    Object v5 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DurationFieldType.months();
    Object v7 = -29;
    Object v8 = ((org.joda.time.Partial)v5).withFieldAddWrapped(((org.joda.time.DurationFieldType)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.Partial)v5).toString();
    org.junit.Assert.assertEquals((Object)("[year=2026, monthOfYear=9, dayOfYear=20, dayOfMonth=30]"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = ((org.joda.time.Partial)v1).getFormatter();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v1 = 23;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.Partial)v2).getFormatter();
    Object v4 = new org.joda.time.MutablePeriod();
    Object v5 = -44;
    Object v6 = ((org.joda.time.Partial)v2).withPeriodAdded(((org.joda.time.ReadablePeriod)v4),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v3 = 9;
    Object v4 = ((org.joda.time.Partial)v1).withField(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = "UTC";
    Object v2 = ((org.joda.time.Partial)v0).toString(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v1 = 23;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.Partial)v2).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = 0;
    Object v7 = ((org.joda.time.Partial)v5).getValue((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(23), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v3 = ((org.joda.time.ReadablePartial)v1).isSupported(((org.joda.time.DateTimeFieldType)v2));
    Object v4 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    Object v5 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v3 = ((org.joda.time.base.AbstractPartial)v1).get(((org.joda.time.DateTimeFieldType)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = ((org.joda.time.Partial)v0).getChronology();
    Object v2 = new org.joda.time.Partial(((org.joda.time.Chronology)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v3 = 33;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v4));
    Object v6 = ((org.joda.time.Chronology)v5).millisOfSecond();
    Object v7 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()),((org.joda.time.Chronology)v5));
    Object v8 = org.joda.time.DateTimeFieldType.dayOfYear();
    Object v9 = ((org.joda.time.Partial)v7).without(((org.joda.time.DateTimeFieldType)v8));
    Object v10 = ((org.joda.time.Partial)v1).isMatch(((org.joda.time.ReadablePartial)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    Object v3 = org.joda.time.LocalDate.now();
    Object v4 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v3));
    Object v5 = ((org.joda.time.base.AbstractPartial)v2).isAfter(((org.joda.time.ReadablePartial)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = org.joda.time.DateMidnight.now(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.Partial)v1).isMatch(((org.joda.time.ReadableInstant)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = org.joda.time.LocalDate.now();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = new org.joda.time.MutablePeriod();
    Object v3 = 0;
    Object v4 = ((org.joda.time.Partial)v1).withPeriodAdded(((org.joda.time.ReadablePeriod)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.DurationFieldType.months();
    Object v6 = 1;
    Object v7 = ((org.joda.time.Partial)v4).withFieldAddWrapped(((org.joda.time.DurationFieldType)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = ((org.joda.time.base.AbstractPartial)v7).getField((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v0));
    Object v2 = org.joda.time.DurationFieldType.months();
    Object v3 = ((org.joda.time.base.AbstractPartial)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }
}
