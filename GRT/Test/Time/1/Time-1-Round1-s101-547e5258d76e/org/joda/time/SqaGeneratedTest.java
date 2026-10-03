package org.joda.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 0L;
    Object v1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v2 = org.joda.time.LocalTime.fromMillisOfDay((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1));
    Object v3 = ((org.joda.time.base.AbstractPartial)v2).getFields();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = "Z";
    Object v2 = java.util.Locale.getDefault();
    Object v3 = ((org.joda.time.Partial)v0).toString(((java.lang.String)v1),((java.util.Locale)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v5 = 1;
    Object v6 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v7 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v4),(((java.lang.Integer)v5).intValue()),((org.joda.time.Chronology)v6));
    Object v8 = ((org.joda.time.base.AbstractPartial)v3).isBefore(((org.joda.time.ReadablePartial)v7));
    Object v9 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v10 = 0;
    Object v11 = ((org.joda.time.Partial)v3).withField(((org.joda.time.DateTimeFieldType)v9),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v5 = ((org.joda.time.Partial)v3).without(((org.joda.time.DateTimeFieldType)v4));
    Object v6 = ((org.joda.time.Partial)v3).getFormatter();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.DurationFieldType.halfdays();
    Object v5 = 0;
    Object v6 = ((org.joda.time.Partial)v3).withFieldAdded(((org.joda.time.DurationFieldType)v4),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.joda.time.DateTimeFieldType[]{null,null};
    Object v1 = new int[]{0};
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType[])v0),((int[])v1),((org.joda.time.Chronology)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.Partial)v3).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.Partial)v3).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v9 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v6),(((java.lang.Integer)v7).intValue()),((org.joda.time.Chronology)v8));
    Object v10 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v11 = ((org.joda.time.Partial)v9).withChronologyRetainFields(((org.joda.time.Chronology)v10));
    Object v12 = ((org.joda.time.Partial)v5).isMatch(((org.joda.time.ReadablePartial)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = ((org.joda.time.base.AbstractPartial)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(1033823), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.Partial)v3).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = org.joda.time.DurationFieldType.halfdays();
    Object v7 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.DurationFieldType)v6).getField(((org.joda.time.Chronology)v7));
    Object v9 = -42;
    Object v10 = ((org.joda.time.Partial)v5).withFieldAddWrapped(((org.joda.time.DurationFieldType)v6),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v5 = 1;
    Object v6 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v7 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v4),(((java.lang.Integer)v5).intValue()),((org.joda.time.Chronology)v6));
    Object v8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v9 = ((org.joda.time.Partial)v7).withChronologyRetainFields(((org.joda.time.Chronology)v8));
    Object v10 = ((org.joda.time.base.AbstractPartial)v3).isAfter(((org.joda.time.ReadablePartial)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v5 = ((org.joda.time.base.AbstractPartial)v3).indexOf(((org.joda.time.DateTimeFieldType)v4));
    Object v6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v9 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v6),(((java.lang.Integer)v7).intValue()),((org.joda.time.Chronology)v8));
    Object v10 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v11 = ((org.joda.time.Partial)v9).withChronologyRetainFields(((org.joda.time.Chronology)v10));
    Object v12 = ((org.joda.time.base.AbstractPartial)v3).compareTo(((org.joda.time.ReadablePartial)v11));
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.Partial)v3).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = "The DateTimeFieldType must ";
    Object v7 = ((org.joda.time.Partial)v5).toString(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = 1L;
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()));
    Object v6 = 1L;
    Object v7 = new org.joda.time.DateTime((((java.lang.Long)v6).longValue()));
    Object v8 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableInstant)v5),((org.joda.time.ReadableInstant)v7));
    Object v9 = ((org.joda.time.ReadablePeriod)v8).toMutablePeriod();
    Object v10 = 0;
    Object v11 = ((org.joda.time.Partial)v3).withPeriodAdded(((org.joda.time.ReadablePeriod)v8),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v5 = 1;
    Object v6 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v7 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v4),(((java.lang.Integer)v5).intValue()),((org.joda.time.Chronology)v6));
    Object v8 = ((org.joda.time.base.AbstractPartial)v3).isEqual(((org.joda.time.ReadablePartial)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.Partial)v3).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v9 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v6),(((java.lang.Integer)v7).intValue()),((org.joda.time.Chronology)v8));
    Object v10 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v11 = ((org.joda.time.Partial)v9).withChronologyRetainFields(((org.joda.time.Chronology)v10));
    Object v12 = ((org.joda.time.base.AbstractPartial)v5).compareTo(((org.joda.time.ReadablePartial)v11));
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.Partial)v3).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = ((org.joda.time.Partial)v5).toString();
    org.junit.Assert.assertEquals((Object)("[clockhourOfDay=1]"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = 1L;
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()));
    Object v6 = 1L;
    Object v7 = new org.joda.time.DateTime((((java.lang.Long)v6).longValue()));
    Object v8 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableInstant)v5),((org.joda.time.ReadableInstant)v7));
    Object v9 = 0;
    Object v10 = ((org.joda.time.Partial)v3).withPeriodAdded(((org.joda.time.ReadablePeriod)v8),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = 1L;
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()));
    Object v6 = 1L;
    Object v7 = new org.joda.time.DateTime((((java.lang.Long)v6).longValue()));
    Object v8 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableInstant)v5),((org.joda.time.ReadableInstant)v7));
    Object v9 = 0;
    Object v10 = ((org.joda.time.Partial)v3).withPeriodAdded(((org.joda.time.ReadablePeriod)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v12 = ((org.joda.time.base.AbstractPartial)v10).isSupported(((org.joda.time.DateTimeFieldType)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = "{";
    Object v5 = ((org.joda.time.Partial)v3).toString(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)("{"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = 1L;
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()));
    Object v6 = 1L;
    Object v7 = new org.joda.time.DateTime((((java.lang.Long)v6).longValue()));
    Object v8 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableInstant)v5),((org.joda.time.ReadableInstant)v7));
    Object v9 = 0;
    Object v10 = ((org.joda.time.Partial)v3).withPeriodAdded(((org.joda.time.ReadablePeriod)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = 1L;
    Object v12 = new org.joda.time.DateTime((((java.lang.Long)v11).longValue()));
    Object v13 = ((org.joda.time.Partial)v10).isMatch(((org.joda.time.ReadableInstant)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v2 = ((org.joda.time.DateTimeFieldType)v1).getDurationType();
    Object v3 = 10;
    Object v4 = ((org.joda.time.Partial)v0).with(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v5 = 0;
    Object v6 = ((org.joda.time.Partial)v3).with(((org.joda.time.DateTimeFieldType)v4),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v2 = ((org.joda.time.DateTimeFieldType)v1).getDurationType();
    Object v3 = 10;
    Object v4 = ((org.joda.time.Partial)v0).with(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v6 = 1;
    Object v7 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v8 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v5),(((java.lang.Integer)v6).intValue()),((org.joda.time.Chronology)v7));
    Object v9 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v10 = ((org.joda.time.Partial)v8).withChronologyRetainFields(((org.joda.time.Chronology)v9));
    Object v11 = ((org.joda.time.base.AbstractPartial)v4).isBefore(((org.joda.time.ReadablePartial)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v5 = 1;
    Object v6 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v7 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v4),(((java.lang.Integer)v5).intValue()),((org.joda.time.Chronology)v6));
    Object v8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v9 = ((org.joda.time.Partial)v7).withChronologyRetainFields(((org.joda.time.Chronology)v8));
    Object v10 = ((org.joda.time.base.AbstractPartial)v3).isEqual(((org.joda.time.ReadablePartial)v9));
    Object v11 = ((org.joda.time.Partial)v3).getFormatter();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v2 = ((org.joda.time.DateTimeFieldType)v1).getDurationType();
    Object v3 = 10;
    Object v4 = ((org.joda.time.Partial)v0).with(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.joda.time.Partial();
    Object v6 = ((org.joda.time.base.AbstractPartial)v4).isEqual(((org.joda.time.ReadablePartial)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.Partial)v3).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = 1L;
    Object v7 = new org.joda.time.DateTime((((java.lang.Long)v6).longValue()));
    Object v8 = ((org.joda.time.Partial)v5).isMatch(((org.joda.time.ReadableInstant)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 38;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = 38L;
    Object v4 = -5L;
    Object v5 = -31;
    Object v6 = ((org.joda.time.Chronology)v2).add((((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.Partial)v3).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = org.joda.time.format.ISODateTimeFormat.timeElementParser();
    Object v7 = ((org.joda.time.base.AbstractPartial)v5).toString(((org.joda.time.format.DateTimeFormatter)v6));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.Partial)v3).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = ((org.joda.time.Partial)v5).toStringList();
    org.junit.Assert.assertEquals((Object)("[clockhourOfDay=1]"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = 1L;
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()));
    Object v6 = 1L;
    Object v7 = new org.joda.time.DateTime((((java.lang.Long)v6).longValue()));
    Object v8 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableInstant)v5),((org.joda.time.ReadableInstant)v7));
    Object v9 = 0;
    Object v10 = ((org.joda.time.Partial)v3).withPeriodAdded(((org.joda.time.ReadablePeriod)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v12 = 1;
    Object v13 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v14 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v11),(((java.lang.Integer)v12).intValue()),((org.joda.time.Chronology)v13));
    Object v15 = 1L;
    Object v16 = new org.joda.time.DateTime((((java.lang.Long)v15).longValue()));
    Object v17 = 1L;
    Object v18 = new org.joda.time.DateTime((((java.lang.Long)v17).longValue()));
    Object v19 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableInstant)v16),((org.joda.time.ReadableInstant)v18));
    Object v20 = 0;
    Object v21 = ((org.joda.time.Partial)v14).withPeriodAdded(((org.joda.time.ReadablePeriod)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.joda.time.base.AbstractPartial)v10).isBefore(((org.joda.time.ReadablePartial)v21));
    Object v23 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v24 = 1;
    Object v25 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v26 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v23),(((java.lang.Integer)v24).intValue()),((org.joda.time.Chronology)v25));
    Object v27 = 1L;
    Object v28 = new org.joda.time.DateTime((((java.lang.Long)v27).longValue()));
    Object v29 = 1L;
    Object v30 = new org.joda.time.DateTime((((java.lang.Long)v29).longValue()));
    Object v31 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableInstant)v28),((org.joda.time.ReadableInstant)v30));
    Object v32 = ((org.joda.time.ReadablePeriod)v31).toMutablePeriod();
    Object v33 = 0;
    Object v34 = ((org.joda.time.Partial)v26).withPeriodAdded(((org.joda.time.ReadablePeriod)v31),(((java.lang.Integer)v33).intValue()));
    Object v35 = ((org.joda.time.ReadablePartial)v34).size();
    Object v36 = ((org.joda.time.base.AbstractPartial)v10).isEqual(((org.joda.time.ReadablePartial)v34));
    org.junit.Assert.assertEquals((Object)(true), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = ((org.joda.time.base.AbstractPartial)v1).getFields();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v3 = 9;
    Object v4 = ((org.joda.time.Partial)v1).with(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.Partial)v3).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v7 = new org.joda.time.Partial(((org.joda.time.Chronology)v6));
    Object v8 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v9 = 9;
    Object v10 = ((org.joda.time.Partial)v7).with(((org.joda.time.DateTimeFieldType)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.joda.time.base.AbstractPartial)v5).isAfter(((org.joda.time.ReadablePartial)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = 1L;
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()));
    Object v6 = 1L;
    Object v7 = new org.joda.time.DateTime((((java.lang.Long)v6).longValue()));
    Object v8 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableInstant)v5),((org.joda.time.ReadableInstant)v7));
    Object v9 = 0;
    Object v10 = ((org.joda.time.Partial)v3).withPeriodAdded(((org.joda.time.ReadablePeriod)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = "Interval must Znot be null";
    Object v12 = java.util.Locale.getDefault();
    Object v13 = ((org.joda.time.Partial)v10).toString(((java.lang.String)v11),((java.util.Locale)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = 1L;
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()));
    Object v6 = 1L;
    Object v7 = new org.joda.time.DateTime((((java.lang.Long)v6).longValue()));
    Object v8 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableInstant)v5),((org.joda.time.ReadableInstant)v7));
    Object v9 = 0;
    Object v10 = ((org.joda.time.Partial)v3).withPeriodAdded(((org.joda.time.ReadablePeriod)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.joda.time.base.AbstractPartial)v10).hashCode();
    org.junit.Assert.assertEquals((Object)(1033823), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = org.joda.time.format.ISODateTimeFormat.timeElementParser();
    Object v3 = ((org.joda.time.base.AbstractPartial)v1).toString(((org.joda.time.format.DateTimeFormatter)v2));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v3 = 9;
    Object v4 = ((org.joda.time.Partial)v1).with(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v6 = ((org.joda.time.base.AbstractPartial)v4).isSupported(((org.joda.time.DateTimeFieldType)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v2 = ((org.joda.time.DateTimeFieldType)v1).getDurationType();
    Object v3 = 10;
    Object v4 = ((org.joda.time.Partial)v0).with(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.Partial)v4).withChronologyRetainFields(((org.joda.time.Chronology)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v3 = 9;
    Object v4 = ((org.joda.time.Partial)v1).with(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v6 = ((org.joda.time.base.AbstractPartial)v4).indexOf(((org.joda.time.DateTimeFieldType)v5));
    Object v7 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.Partial)v4).withChronologyRetainFields(((org.joda.time.Chronology)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.Partial)v3).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v7 = ((org.joda.time.DateTimeFieldType)v6).getRangeDurationType();
    Object v8 = ((org.joda.time.base.AbstractPartial)v5).get(((org.joda.time.DateTimeFieldType)v6));
    org.junit.Assert.assertEquals((Object)(1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v2 = ((org.joda.time.DateTimeFieldType)v1).getDurationType();
    Object v3 = 10;
    Object v4 = ((org.joda.time.Partial)v0).with(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.Partial)v4).withChronologyRetainFields(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v8 = ((org.joda.time.DateTimeFieldType)v7).getRangeDurationType();
    Object v9 = 1;
    Object v10 = ((org.joda.time.Partial)v6).withField(((org.joda.time.DateTimeFieldType)v7),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = "Gield '";
    Object v3 = java.util.Locale.getDefault();
    Object v4 = ((org.joda.time.Partial)v1).toString(((java.lang.String)v2),((java.util.Locale)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = 1L;
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()));
    Object v6 = 1L;
    Object v7 = new org.joda.time.DateTime((((java.lang.Long)v6).longValue()));
    Object v8 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableInstant)v5),((org.joda.time.ReadableInstant)v7));
    Object v9 = ((org.joda.time.ReadablePeriod)v8).toMutablePeriod();
    Object v10 = 0;
    Object v11 = ((org.joda.time.Partial)v3).withPeriodAdded(((org.joda.time.ReadablePeriod)v8),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v13 = new org.joda.time.Partial(((org.joda.time.Chronology)v12));
    Object v14 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v15 = 9;
    Object v16 = ((org.joda.time.Partial)v13).with(((org.joda.time.DateTimeFieldType)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.joda.time.base.AbstractPartial)v11).isEqual(((org.joda.time.ReadablePartial)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v3 = 9;
    Object v4 = ((org.joda.time.Partial)v1).with(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = 29;
    Object v6 = ((org.joda.time.base.AbstractPartial)v4).getField((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.Partial)v3).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = 1L;
    Object v7 = new org.joda.time.DateTime((((java.lang.Long)v6).longValue()));
    Object v8 = 1L;
    Object v9 = new org.joda.time.DateTime((((java.lang.Long)v8).longValue()));
    Object v10 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableInstant)v7),((org.joda.time.ReadableInstant)v9));
    Object v11 = 9;
    Object v12 = ((org.joda.time.Partial)v3).withPeriodAdded(((org.joda.time.ReadablePeriod)v10),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v3 = 9;
    Object v4 = ((org.joda.time.Partial)v1).with(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v3));
    Object v5 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v6 = ((org.joda.time.base.AbstractPartial)v4).isSupported(((org.joda.time.DateTimeFieldType)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.joda.time.DateTimeFieldType[]{null};
    Object v1 = new int[]{1,2,43};
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType[])v0),((int[])v1),((org.joda.time.Chronology)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v2 = ((org.joda.time.DateTimeFieldType)v1).getDurationType();
    Object v3 = 10;
    Object v4 = ((org.joda.time.Partial)v0).with(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v6 = new org.joda.time.Partial(((org.joda.time.Chronology)v5));
    Object v7 = ((org.joda.time.Partial)v4).isMatch(((org.joda.time.ReadablePartial)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.Partial)v3).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = 1L;
    Object v7 = new org.joda.time.DateTime((((java.lang.Long)v6).longValue()));
    Object v8 = 1L;
    Object v9 = new org.joda.time.DateTime((((java.lang.Long)v8).longValue()));
    Object v10 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableInstant)v7),((org.joda.time.ReadableInstant)v9));
    Object v11 = ((org.joda.time.ReadablePeriod)v10).toMutablePeriod();
    Object v12 = -19;
    Object v13 = ((org.joda.time.Partial)v5).withPeriodAdded(((org.joda.time.ReadablePeriod)v10),(((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v3 = 9;
    Object v4 = ((org.joda.time.Partial)v1).with(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.joda.time.Partial)v4).toString();
    org.junit.Assert.assertEquals((Object)("[clockhourOfDay=9]"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.Partial)v3).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = 1L;
    Object v7 = new org.joda.time.DateTime((((java.lang.Long)v6).longValue()));
    Object v8 = 1L;
    Object v9 = new org.joda.time.DateTime((((java.lang.Long)v8).longValue()));
    Object v10 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableInstant)v7),((org.joda.time.ReadableInstant)v9));
    Object v11 = 9;
    Object v12 = ((org.joda.time.Partial)v3).withPeriodAdded(((org.joda.time.ReadablePeriod)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = "UT";
    Object v3 = java.util.Locale.getDefault();
    Object v4 = ((org.joda.time.Partial)v1).toString(((java.lang.String)v2),((java.util.Locale)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v3));
    Object v5 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v6 = ((org.joda.time.base.AbstractPartial)v4).indexOf(((org.joda.time.DateTimeFieldType)v5));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v3 = 1;
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()),((org.joda.time.Chronology)v4));
    Object v6 = ((org.joda.time.Partial)v1).isMatch(((org.joda.time.ReadablePartial)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.Partial)v3).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = ((org.joda.time.Partial)v5).toString();
    Object v7 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v8 = ((org.joda.time.Partial)v5).without(((org.joda.time.DateTimeFieldType)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    Object v3 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v4 = new org.joda.time.Partial(((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.base.AbstractPartial)v2).isEqual(((org.joda.time.ReadablePartial)v4));
    Object v6 = org.joda.time.DurationFieldType.halfdays();
    Object v7 = -37;
    Object v8 = ((org.joda.time.Partial)v2).withFieldAdded(((org.joda.time.DurationFieldType)v6),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.joda.time.DateTimeFieldType[]{null,null};
    Object v1 = new int[]{0,8};
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = ((org.joda.time.Chronology)v2).days();
    Object v4 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType[])v0),((int[])v1),((org.joda.time.Chronology)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = org.joda.time.format.ISODateTimeFormat.timeElementParser();
    Object v3 = 1;
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withDefaultYear((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.joda.time.base.AbstractPartial)v1).toString(((org.joda.time.format.DateTimeFormatter)v2));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v3 = 9;
    Object v4 = ((org.joda.time.Partial)v1).with(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v6 = 1;
    Object v7 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v8 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v5),(((java.lang.Integer)v6).intValue()),((org.joda.time.Chronology)v7));
    Object v9 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v10 = ((org.joda.time.Partial)v8).withChronologyRetainFields(((org.joda.time.Chronology)v9));
    Object v11 = 1L;
    Object v12 = new org.joda.time.DateTime((((java.lang.Long)v11).longValue()));
    Object v13 = 1L;
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v13).longValue()));
    Object v15 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableInstant)v12),((org.joda.time.ReadableInstant)v14));
    Object v16 = ((org.joda.time.ReadablePeriod)v15).toMutablePeriod();
    Object v17 = -19;
    Object v18 = ((org.joda.time.Partial)v10).withPeriodAdded(((org.joda.time.ReadablePeriod)v15),(((java.lang.Integer)v17).intValue()));
    Object v19 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v20 = ((org.joda.time.ReadablePartial)v18).isSupported(((org.joda.time.DateTimeFieldType)v19));
    Object v21 = ((org.joda.time.base.AbstractPartial)v4).compareTo(((org.joda.time.ReadablePartial)v18));
    org.junit.Assert.assertEquals((Object)(1), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v3));
    Object v5 = ((org.joda.time.Partial)v4).getFormatter();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v2 = ((org.joda.time.DateTimeFieldType)v1).getDurationType();
    Object v3 = 10;
    Object v4 = ((org.joda.time.Partial)v0).with(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.Partial)v4).withChronologyRetainFields(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v8 = ((org.joda.time.DateTimeFieldType)v7).getRangeDurationType();
    Object v9 = 1;
    Object v10 = ((org.joda.time.Partial)v6).withField(((org.joda.time.DateTimeFieldType)v7),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.joda.time.base.AbstractPartial)v10).hashCode();
    org.junit.Assert.assertEquals((Object)(1033823), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v3 = 9;
    Object v4 = ((org.joda.time.Partial)v1).with(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v6 = ((org.joda.time.base.AbstractPartial)v4).indexOf(((org.joda.time.DateTimeFieldType)v5));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = 1L;
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()));
    Object v6 = 1L;
    Object v7 = new org.joda.time.DateTime((((java.lang.Long)v6).longValue()));
    Object v8 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableInstant)v5),((org.joda.time.ReadableInstant)v7));
    Object v9 = 0;
    Object v10 = ((org.joda.time.Partial)v3).withPeriodAdded(((org.joda.time.ReadablePeriod)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v12 = ((org.joda.time.Partial)v10).property(((org.joda.time.DateTimeFieldType)v11));
    Object v13 = org.joda.time.DurationFieldType.halfdays();
    Object v14 = 2;
    Object v15 = ((org.joda.time.Partial)v10).withFieldAddWrapped(((org.joda.time.DurationFieldType)v13),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.Partial)v3).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = ((org.joda.time.base.AbstractPartial)v5).hashCode();
    Object v7 = ((org.joda.time.Partial)v5).size();
    org.junit.Assert.assertEquals((Object)(1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.Chronology)v2));
    Object v4 = ((org.joda.time.base.AbstractPartial)v1).isBefore(((org.joda.time.ReadablePartial)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.Partial)v3).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = ((org.joda.time.base.AbstractPartial)v5).hashCode();
    Object v7 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v8 = 1;
    Object v9 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v10 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v7),(((java.lang.Integer)v8).intValue()),((org.joda.time.Chronology)v9));
    Object v11 = ((org.joda.time.base.AbstractPartial)v5).isAfter(((org.joda.time.ReadablePartial)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    Object v3 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v4 = ((org.joda.time.Partial)v2).without(((org.joda.time.DateTimeFieldType)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.Partial)v3).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = 1L;
    Object v7 = new org.joda.time.DateTime((((java.lang.Long)v6).longValue()));
    Object v8 = 1L;
    Object v9 = new org.joda.time.DateTime((((java.lang.Long)v8).longValue()));
    Object v10 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableInstant)v7),((org.joda.time.ReadableInstant)v9));
    Object v11 = 9;
    Object v12 = ((org.joda.time.Partial)v3).withPeriodAdded(((org.joda.time.ReadablePeriod)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v14 = new org.joda.time.Partial();
    Object v15 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v16 = ((org.joda.time.DateTimeFieldType)v15).getDurationType();
    Object v17 = 10;
    Object v18 = ((org.joda.time.Partial)v14).with(((org.joda.time.DateTimeFieldType)v15),(((java.lang.Integer)v17).intValue()));
    Object v19 = 1L;
    Object v20 = ((org.joda.time.Chronology)v13).get(((org.joda.time.ReadablePartial)v18),(((java.lang.Long)v19).longValue()));
    Object v21 = ((org.joda.time.Partial)v12).withChronologyRetainFields(((org.joda.time.Chronology)v13));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = "G";
    Object v5 = java.util.Locale.getDefault();
    Object v6 = ((org.joda.time.Partial)v3).toString(((java.lang.String)v4),((java.util.Locale)v5));
    org.junit.Assert.assertEquals((Object)("\ufffd"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = ((org.joda.time.Partial)v1).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.Chronology)v2));
    Object v4 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v3));
    Object v5 = ((org.joda.time.base.AbstractPartial)v1).isAfter(((org.joda.time.ReadablePartial)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v2 = ((org.joda.time.DateTimeFieldType)v1).getDurationType();
    Object v3 = 10;
    Object v4 = ((org.joda.time.Partial)v0).with(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.Partial)v4).withChronologyRetainFields(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v8 = ((org.joda.time.DateTimeFieldType)v7).getRangeDurationType();
    Object v9 = 1;
    Object v10 = ((org.joda.time.Partial)v6).withField(((org.joda.time.DateTimeFieldType)v7),(((java.lang.Integer)v9).intValue()));
    Object v11 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v12 = 1;
    Object v13 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v14 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v11),(((java.lang.Integer)v12).intValue()),((org.joda.time.Chronology)v13));
    Object v15 = ((org.joda.time.base.AbstractPartial)v10).isAfter(((org.joda.time.ReadablePartial)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = 1L;
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()));
    Object v6 = 1L;
    Object v7 = new org.joda.time.DateTime((((java.lang.Long)v6).longValue()));
    Object v8 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableInstant)v5),((org.joda.time.ReadableInstant)v7));
    Object v9 = ((org.joda.time.ReadablePeriod)v8).toMutablePeriod();
    Object v10 = 0;
    Object v11 = ((org.joda.time.Partial)v3).withPeriodAdded(((org.joda.time.ReadablePeriod)v8),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v13 = 1;
    Object v14 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v15 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v12),(((java.lang.Integer)v13).intValue()),((org.joda.time.Chronology)v14));
    Object v16 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v17 = ((org.joda.time.Partial)v15).withChronologyRetainFields(((org.joda.time.Chronology)v16));
    Object v18 = 1L;
    Object v19 = new org.joda.time.DateTime((((java.lang.Long)v18).longValue()));
    Object v20 = 1L;
    Object v21 = new org.joda.time.DateTime((((java.lang.Long)v20).longValue()));
    Object v22 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableInstant)v19),((org.joda.time.ReadableInstant)v21));
    Object v23 = 9;
    Object v24 = ((org.joda.time.Partial)v15).withPeriodAdded(((org.joda.time.ReadablePeriod)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v24));
    Object v26 = ((org.joda.time.base.AbstractPartial)v11).isBefore(((org.joda.time.ReadablePartial)v25));
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v3 = 9;
    Object v4 = ((org.joda.time.Partial)v1).with(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.DurationFieldType.halfdays();
    Object v6 = 1;
    Object v7 = ((org.joda.time.Partial)v4).withFieldAdded(((org.joda.time.DurationFieldType)v5),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = ((org.joda.time.Partial)v1).toStringList();
    org.junit.Assert.assertEquals((Object)("[]"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    Object v3 = ((org.joda.time.Partial)v2).getFieldTypes();
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.Partial)v2).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v2 = ((org.joda.time.DateTimeFieldType)v1).getDurationType();
    Object v3 = 10;
    Object v4 = ((org.joda.time.Partial)v0).with(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v6 = ((org.joda.time.base.AbstractPartial)v4).indexOf(((org.joda.time.DateTimeFieldType)v5));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v3 = 9;
    Object v4 = ((org.joda.time.Partial)v1).with(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v4));
    Object v6 = org.joda.time.DurationFieldType.halfdays();
    Object v7 = 11;
    Object v8 = ((org.joda.time.Partial)v5).withFieldAddWrapped(((org.joda.time.DurationFieldType)v6),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = org.joda.time.DurationFieldType.halfdays();
    Object v3 = -1;
    Object v4 = ((org.joda.time.Partial)v1).withFieldAddWrapped(((org.joda.time.DurationFieldType)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.Partial)v3).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = 1L;
    Object v7 = new org.joda.time.DateTime((((java.lang.Long)v6).longValue()));
    Object v8 = 1L;
    Object v9 = new org.joda.time.DateTime((((java.lang.Long)v8).longValue()));
    Object v10 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableInstant)v7),((org.joda.time.ReadableInstant)v9));
    Object v11 = ((org.joda.time.ReadablePeriod)v10).toMutablePeriod();
    Object v12 = -19;
    Object v13 = ((org.joda.time.Partial)v5).withPeriodAdded(((org.joda.time.ReadablePeriod)v10),(((java.lang.Integer)v12).intValue()));
    Object v14 = "Interval composed of two durations: ";
    Object v15 = java.util.Locale.getDefault();
    Object v16 = ((org.joda.time.Partial)v13).toString(((java.lang.String)v14),((java.util.Locale)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = 1L;
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()));
    Object v6 = 1L;
    Object v7 = new org.joda.time.DateTime((((java.lang.Long)v6).longValue()));
    Object v8 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableInstant)v5),((org.joda.time.ReadableInstant)v7));
    Object v9 = ((org.joda.time.ReadablePeriod)v8).toMutablePeriod();
    Object v10 = 0;
    Object v11 = ((org.joda.time.Partial)v3).withPeriodAdded(((org.joda.time.ReadablePeriod)v8),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v13 = new org.joda.time.Partial(((org.joda.time.Chronology)v12));
    Object v14 = ((org.joda.time.ReadablePartial)v13).size();
    Object v15 = ((org.joda.time.base.AbstractPartial)v11).compareTo(((org.joda.time.ReadablePartial)v13));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v3 = 9;
    Object v4 = ((org.joda.time.Partial)v1).with(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v4));
    Object v6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v7 = ((org.joda.time.Partial)v5).property(((org.joda.time.DateTimeFieldType)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = ((org.joda.time.Partial)v1).getValues();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = 1L;
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()));
    Object v6 = 1L;
    Object v7 = new org.joda.time.DateTime((((java.lang.Long)v6).longValue()));
    Object v8 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableInstant)v5),((org.joda.time.ReadableInstant)v7));
    Object v9 = ((org.joda.time.ReadablePeriod)v8).toMutablePeriod();
    Object v10 = 0;
    Object v11 = ((org.joda.time.Partial)v3).withPeriodAdded(((org.joda.time.ReadablePeriod)v8),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.joda.time.Partial)v11).toStringList();
    Object v13 = "mmst not be larger than ";
    Object v14 = java.util.Locale.getDefault();
    Object v15 = ((org.joda.time.Partial)v11).toString(((java.lang.String)v13),((java.util.Locale)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v3 = ((org.joda.time.base.AbstractPartial)v1).isSupported(((org.joda.time.DateTimeFieldType)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v3 = 9;
    Object v4 = ((org.joda.time.Partial)v1).with(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v6 = -25;
    Object v7 = ((org.joda.time.Partial)v4).withField(((org.joda.time.DateTimeFieldType)v5),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v1));
    Object v3 = ((org.joda.time.Partial)v2).getFieldTypes();
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.Partial)v2).withChronologyRetainFields(((org.joda.time.Chronology)v4));
    Object v6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v7 = ((org.joda.time.base.AbstractPartial)v5).indexOf(((org.joda.time.DateTimeFieldType)v6));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v2 = ((org.joda.time.DateTimeFieldType)v1).getDurationType();
    Object v3 = 10;
    Object v4 = ((org.joda.time.Partial)v0).with(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.Partial)v4).withChronologyRetainFields(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v8 = ((org.joda.time.DateTimeFieldType)v7).getRangeDurationType();
    Object v9 = 1;
    Object v10 = ((org.joda.time.Partial)v6).withField(((org.joda.time.DateTimeFieldType)v7),(((java.lang.Integer)v9).intValue()));
    Object v11 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v3 = 9;
    Object v4 = ((org.joda.time.Partial)v1).with(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v4));
    Object v6 = org.joda.time.format.ISODateTimeFormat.timeElementParser();
    Object v7 = ((org.joda.time.base.AbstractPartial)v5).toString(((org.joda.time.format.DateTimeFormatter)v6));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v3 = 9;
    Object v4 = ((org.joda.time.Partial)v1).with(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = "_";
    Object v6 = ((org.joda.time.Partial)v4).toString(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)("_"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v1 = new org.joda.time.Partial(((org.joda.time.Chronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v3 = 9;
    Object v4 = ((org.joda.time.Partial)v1).with(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v4));
    Object v6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v7 = ((org.joda.time.base.AbstractPartial)v5).isSupported(((org.joda.time.DateTimeFieldType)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v2 = ((org.joda.time.DateTimeFieldType)v1).getDurationType();
    Object v3 = 10;
    Object v4 = ((org.joda.time.Partial)v0).with(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.Partial)v4).withChronologyRetainFields(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v8 = ((org.joda.time.DateTimeFieldType)v7).getRangeDurationType();
    Object v9 = 1;
    Object v10 = ((org.joda.time.Partial)v6).withField(((org.joda.time.DateTimeFieldType)v7),(((java.lang.Integer)v9).intValue()));
    Object v11 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v10));
    Object v12 = org.joda.time.format.ISODateTimeFormat.timeElementParser();
    Object v13 = ((org.joda.time.base.AbstractPartial)v11).toString(((org.joda.time.format.DateTimeFormatter)v12));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
    Object v1 = 1;
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
    Object v4 = 1L;
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()));
    Object v6 = 1L;
    Object v7 = new org.joda.time.DateTime((((java.lang.Long)v6).longValue()));
    Object v8 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableInstant)v5),((org.joda.time.ReadableInstant)v7));
    Object v9 = 1;
    Object v10 = ((org.joda.time.Partial)v3).withPeriodAdded(((org.joda.time.ReadablePeriod)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = org.joda.time.DurationFieldType.halfdays();
    Object v12 = 21;
    Object v13 = ((org.joda.time.Partial)v3).withFieldAddWrapped(((org.joda.time.DurationFieldType)v11),(((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
