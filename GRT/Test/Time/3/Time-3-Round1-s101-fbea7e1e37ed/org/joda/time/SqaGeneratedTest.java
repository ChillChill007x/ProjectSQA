package org.joda.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.DateMidnight.now(((org.joda.time.DateTimeZone)v1));
    Object v3 = "0";
    Object v4 = "The calendar must not be null";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.base.AbstractDateTime)v2).toCalendar(((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = -44;
    ((org.joda.time.MutableDateTime)v4).setMinuteOfHour((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.DateMidnight.now(((org.joda.time.DateTimeZone)v1));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = ((org.joda.time.base.AbstractInstant)v2).isSupported(((org.joda.time.DateTimeFieldType)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = 1L;
    ((org.joda.time.MutableDateTime)v4).setMillis((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = 7;
    ((org.joda.time.MutableDateTime)v4).addMonths((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = org.joda.time.DurationFieldType.eras();
    Object v6 = 0;
    ((org.joda.time.MutableDateTime)v4).add(((org.joda.time.DurationFieldType)v5),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = 0L;
    ((org.joda.time.MutableDateTime)v4).setMillis((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    Object v7 = 5;
    ((org.joda.time.MutableDateTime)v4).addWeeks((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.MutableDateTime.now(((org.joda.time.DateTimeZone)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = 20L;
    Object v6 = new org.joda.time.MutablePeriod((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.joda.time.ReadablePeriod)v6).size();
    Object v8 = 73;
    ((org.joda.time.MutableDateTime)v4).add(((org.joda.time.ReadablePeriod)v6),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = -3;
    ((org.joda.time.MutableDateTime)v4).addMonths((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.DateMidnight.now(((org.joda.time.DateTimeZone)v1));
    Object v3 = 0;
    Object v4 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v3).intValue()));
    Object v5 = 2;
    Object v6 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v6));
    Object v8 = ((org.joda.time.base.AbstractInstant)v2).isAfter(((org.joda.time.ReadableInstant)v7));
    Object v9 = ((org.joda.time.base.AbstractDateTime)v2).getYear();
    org.junit.Assert.assertEquals((Object)(2026), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.MutableDateTime)v4).clone();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.MutableDateTime)v4).clone();
    Object v6 = 1;
    ((org.joda.time.MutableDateTime)v5).addDays((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.MutableDateTime.now(((org.joda.time.DateTimeZone)v1));
    Object v3 = ((org.joda.time.base.AbstractDateTime)v2).toGregorianCalendar();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.MutableDateTime)v4).clone();
    Object v6 = 52;
    ((org.joda.time.MutableDateTime)v5).setMillisOfDay((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = 0;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.DateMidnight.now(((org.joda.time.DateTimeZone)v6));
    Object v8 = ((org.joda.time.base.AbstractInstant)v4).isBefore(((org.joda.time.ReadableInstant)v7));
    Object v9 = ((org.joda.time.base.AbstractInstant)v4).getZone();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.MutableDateTime.now(((org.joda.time.DateTimeZone)v1));
    Object v3 = 0;
    Object v4 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.MutableDateTime.now(((org.joda.time.DateTimeZone)v4));
    Object v6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v7 = ((org.joda.time.ReadableInstant)v5).get(((org.joda.time.DateTimeFieldType)v6));
    ((org.joda.time.MutableDateTime)v2).setDate(((org.joda.time.ReadableInstant)v5));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.MutableDateTime)v4).clone();
    Object v6 = 3;
    ((org.joda.time.MutableDateTime)v5).addYears((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.MutableDateTime.now(((org.joda.time.DateTimeZone)v1));
    Object v3 = 0;
    Object v4 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v3).intValue()));
    Object v5 = 2;
    Object v6 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.joda.time.base.AbstractInstant)v2).toDateTime(((org.joda.time.Chronology)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.base.AbstractDateTime)v4).getSecondOfDay();
    org.junit.Assert.assertEquals((Object)(43836), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = 0;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.MutableDateTime.now(((org.joda.time.DateTimeZone)v6));
    Object v8 = 0;
    Object v9 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v8).intValue()));
    Object v10 = 2;
    Object v11 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.joda.time.base.AbstractInstant)v7).toDateTime(((org.joda.time.Chronology)v11));
    ((org.joda.time.MutableDateTime)v4).setTime(((org.joda.time.ReadableInstant)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.MutableDateTime)v4).clone();
    Object v6 = 0;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.DateMidnight.now(((org.joda.time.DateTimeZone)v7));
    Object v9 = ((org.joda.time.base.AbstractInstant)v5).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = "Field mu";
    Object v6 = ((org.joda.time.base.AbstractDateTime)v4).toString(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = 0;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v5).intValue()));
    Object v7 = 2;
    Object v8 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v8));
    Object v10 = ((org.joda.time.base.AbstractInstant)v4).isEqual(((org.joda.time.ReadableInstant)v9));
    Object v11 = 1L;
    Object v12 = ((org.joda.time.base.AbstractInstant)v4).isAfter((((java.lang.Long)v11).longValue()));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = 1;
    ((org.joda.time.MutableDateTime)v4).addMillis((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = 0;
    ((org.joda.time.MutableDateTime)v4).addMinutes((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = 0;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v5).intValue()));
    Object v7 = 2;
    Object v8 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v8));
    Object v10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v11 = ((org.joda.time.ReadableInstant)v9).get(((org.joda.time.DateTimeFieldType)v10));
    Object v12 = ((org.joda.time.base.AbstractInstant)v4).isBefore(((org.joda.time.ReadableInstant)v9));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.joda.time.MutableDateTime();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.DateMidnight.now(((org.joda.time.DateTimeZone)v1));
    Object v3 = 4L;
    Object v4 = ((org.joda.time.base.AbstractInstant)v2).isBefore((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = -1L;
    Object v6 = ((org.joda.time.base.AbstractInstant)v4).isAfter((((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.MutableDateTime)v4).clone();
    Object v6 = ((org.joda.time.MutableDateTime)v5).millisOfSecond();
    Object v7 = 1;
    ((org.joda.time.MutableDateTime)v5).addHours((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.MutableDateTime.now(((org.joda.time.DateTimeZone)v1));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = ((org.joda.time.base.AbstractInstant)v2).get(((org.joda.time.DateTimeFieldType)v3));
    Object v5 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v6 = 0;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v6).intValue()));
    Object v8 = 2;
    Object v9 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.DateTimeFieldType)v5).isSupported(((org.joda.time.Chronology)v9));
    Object v11 = ((org.joda.time.base.AbstractInstant)v2).isSupported(((org.joda.time.DateTimeFieldType)v5));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.MutableDateTime)v4).clone();
    Object v6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v7 = ((org.joda.time.base.AbstractInstant)v5).isSupported(((org.joda.time.DateTimeFieldType)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.MutableDateTime)v4).clone();
    Object v6 = 1;
    ((org.joda.time.MutableDateTime)v5).setMillisOfDay((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.joda.time.MutableDateTime();
    Object v1 = new org.joda.time.MutableDateTime();
    ((org.joda.time.MutableDateTime)v0).setTime(((org.joda.time.ReadableInstant)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.MutableDateTime)v4).clone();
    Object v6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v7 = org.joda.time.DurationFieldType.eras();
    Object v8 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v7));
    Object v9 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v6),((org.joda.time.DurationField)v8));
    Object v10 = 1;
    ((org.joda.time.MutableDateTime)v5).setRounding(((org.joda.time.DateTimeField)v9),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = 0;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v5).intValue()));
    ((org.joda.time.MutableDateTime)v4).setZone(((org.joda.time.DateTimeZone)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.MutableDateTime.now(((org.joda.time.DateTimeZone)v1));
    Object v3 = 1;
    ((org.joda.time.MutableDateTime)v2).addWeekyears((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = 20L;
    Object v6 = new org.joda.time.MutablePeriod((((java.lang.Long)v5).longValue()));
    Object v7 = -46;
    ((org.joda.time.MutableDateTime)v4).add(((org.joda.time.ReadablePeriod)v6),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.MutableDateTime.now(((org.joda.time.DateTimeZone)v1));
    Object v3 = 0;
    Object v4 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.joda.time.base.AbstractInstant)v2).toDateTime(((org.joda.time.DateTimeZone)v4));
    Object v6 = 1;
    ((org.joda.time.MutableDateTime)v2).addYears((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.MutableDateTime.now(((org.joda.time.DateTimeZone)v1));
    Object v3 = new org.joda.time.MutableDateTime();
    Object v4 = ((org.joda.time.base.AbstractInstant)v2).compareTo(((org.joda.time.ReadableInstant)v3));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.MutableDateTime.now(((org.joda.time.DateTimeZone)v1));
    Object v3 = 1L;
    Object v4 = ((org.joda.time.base.AbstractInstant)v2).isEqual((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 54L;
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.joda.time.Chronology)v4).halfdays();
    Object v6 = new org.joda.time.MutableDateTime((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.joda.time.MutableDateTime();
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v4));
    Object v6 = 54L;
    Object v7 = 0;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v7).intValue()));
    Object v9 = 2;
    Object v10 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.joda.time.Chronology)v10).halfdays();
    Object v12 = new org.joda.time.MutableDateTime((((java.lang.Long)v6).longValue()),((org.joda.time.Chronology)v10));
    Object v13 = ((org.joda.time.ReadableInstant)v5).isAfter(((org.joda.time.ReadableInstant)v12));
    ((org.joda.time.MutableDateTime)v0).setDate(((org.joda.time.ReadableInstant)v5));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = "0";
    Object v6 = "The calendar must not be null";
    Object v7 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.joda.time.base.AbstractDateTime)v4).toCalendar(((java.util.Locale)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.joda.time.MutableDateTime();
    Object v1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v2 = ((org.joda.time.base.AbstractInstant)v0).isSupported(((org.joda.time.DateTimeFieldType)v1));
    Object v3 = "Ty1es array must be in order largest-smallest: ";
    Object v4 = "0";
    Object v5 = "The calendar must not be null";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.joda.time.base.AbstractDateTime)v0).toString(((java.lang.String)v3),((java.util.Locale)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.joda.time.MutableDateTime();
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v4));
    Object v6 = ((org.joda.time.MutableDateTime)v5).clone();
    Object v7 = ((org.joda.time.base.AbstractInstant)v0).isBefore(((org.joda.time.ReadableInstant)v6));
    Object v8 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v9 = ((org.joda.time.DateTimeFieldType)v8).getDurationType();
    Object v10 = 7;
    ((org.joda.time.MutableDateTime)v0).set(((org.joda.time.DateTimeFieldType)v8),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.joda.time.MutableDateTime();
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    ((org.joda.time.MutableDateTime)v0).setZoneRetainFields(((org.joda.time.DateTimeZone)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.joda.time.MutableDateTime();
    Object v1 = 0;
    ((org.joda.time.MutableDateTime)v0).setHourOfDay((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = -14;
    ((org.joda.time.MutableDateTime)v4).setDayOfMonth((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.joda.time.MutableDateTime();
    Object v1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v2 = ((org.joda.time.base.AbstractInstant)v0).isSupported(((org.joda.time.DateTimeFieldType)v1));
    Object v3 = 1;
    ((org.joda.time.MutableDateTime)v0).addWeeks((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.MutableDateTime)v4).secondOfMinute();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 54L;
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.joda.time.Chronology)v4).halfdays();
    Object v6 = new org.joda.time.MutableDateTime((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v4));
    Object v7 = 20L;
    Object v8 = new org.joda.time.MutablePeriod((((java.lang.Long)v7).longValue()));
    ((org.joda.time.MutableDateTime)v6).add(((org.joda.time.ReadablePeriod)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.joda.time.MutableDateTime();
    Object v1 = 1;
    ((org.joda.time.MutableDateTime)v0).addHours((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.joda.time.Chronology)v3).months();
    Object v5 = org.joda.time.MutableDateTime.now(((org.joda.time.Chronology)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 20L;
    Object v5 = new org.joda.time.MutablePeriod((((java.lang.Long)v4).longValue()));
    Object v6 = 1L;
    Object v7 = 0L;
    Object v8 = ((org.joda.time.Chronology)v3).get(((org.joda.time.ReadablePeriod)v5),(((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()));
    Object v9 = org.joda.time.MutableDateTime.now(((org.joda.time.Chronology)v3));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.joda.time.MutableDateTime();
    Object v1 = org.joda.time.format.ISODateTimeFormat.dateHour();
    Object v2 = ((org.joda.time.base.AbstractInstant)v0).toString(((org.joda.time.format.DateTimeFormatter)v1));
    org.junit.Assert.assertEquals((Object)("2026-10-05T05"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.MutableDateTime)v4).clone();
    Object v6 = 0L;
    Object v7 = ((org.joda.time.base.AbstractInstant)v5).isEqual((((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = 39L;
    ((org.joda.time.MutableDateTime)v4).setDate((((java.lang.Long)v5).longValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 54L;
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.joda.time.Chronology)v4).halfdays();
    Object v6 = new org.joda.time.MutableDateTime((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v4));
    Object v7 = 42;
    ((org.joda.time.MutableDateTime)v6).addSeconds((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.joda.time.MutableDateTime();
    Object v1 = ((org.joda.time.MutableDateTime)v0).millisOfDay();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 54L;
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.joda.time.Chronology)v4).halfdays();
    Object v6 = new org.joda.time.MutableDateTime((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v4));
    Object v7 = 0;
    ((org.joda.time.MutableDateTime)v6).addWeeks((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = org.joda.time.DurationFieldType.eras();
    Object v6 = 0;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v6).intValue()));
    Object v8 = 2;
    Object v9 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.DurationFieldType)v5).isSupported(((org.joda.time.Chronology)v9));
    Object v11 = 0;
    ((org.joda.time.MutableDateTime)v4).add(((org.joda.time.DurationFieldType)v5),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v6 = ((org.joda.time.DateTimeFieldType)v5).getRangeDurationType();
    Object v7 = 56;
    ((org.joda.time.MutableDateTime)v4).set(((org.joda.time.DateTimeFieldType)v5),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.joda.time.MutableDateTime();
    Object v1 = ((org.joda.time.base.AbstractDateTime)v0).getHourOfDay();
    org.junit.Assert.assertEquals((Object)(5), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = 0;
    ((org.joda.time.MutableDateTime)v4).addMonths((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = 0;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v5).intValue()));
    Object v7 = 2;
    Object v8 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.base.AbstractInstant)v4).toDateTime(((org.joda.time.Chronology)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.MutableDateTime)v4).clone();
    Object v6 = ((org.joda.time.MutableDateTime)v5).centuryOfEra();
    Object v7 = ((org.joda.time.MutableDateTime)v5).era();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = 49;
    Object v1 = 18;
    Object v2 = 109;
    Object v3 = -1132105748;
    Object v4 = -23;
    Object v5 = 0;
    Object v6 = -13;
    Object v7 = 0;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v7).intValue()));
    Object v9 = new org.joda.time.MutableDateTime((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),((org.joda.time.DateTimeZone)v8));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 54L;
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.joda.time.Chronology)v4).halfdays();
    Object v6 = new org.joda.time.MutableDateTime((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v4));
    Object v7 = 0;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.MutableDateTime.now(((org.joda.time.DateTimeZone)v8));
    Object v10 = 0;
    Object v11 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.base.AbstractInstant)v9).toDateTime(((org.joda.time.Chronology)v13));
    Object v15 = ((org.joda.time.base.AbstractInstant)v6).isAfter(((org.joda.time.ReadableInstant)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "UTC";
    Object v1 = org.joda.time.MutableDateTime.parse(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.DateMidnight.now(((org.joda.time.DateTimeZone)v1));
    Object v3 = 1L;
    Object v4 = ((org.joda.time.base.AbstractInstant)v2).isBefore((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = 0;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v5).intValue()));
    Object v7 = 2;
    Object v8 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.base.AbstractInstant)v4).toDateTime(((org.joda.time.Chronology)v8));
    Object v10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v11 = org.joda.time.DurationFieldType.eras();
    Object v12 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v11));
    Object v13 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v10),((org.joda.time.DurationField)v12));
    Object v14 = ((org.joda.time.base.AbstractInstant)v9).get(((org.joda.time.DateTimeField)v13));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.MutableDateTime.now(((org.joda.time.DateTimeZone)v1));
    Object v3 = 0;
    ((org.joda.time.MutableDateTime)v2).setSecondOfMinute((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = 1;
    ((org.joda.time.MutableDateTime)v2).setWeekyear((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.joda.time.MutableDateTime((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.joda.time.MutableDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v3 = ((org.joda.time.MutableDateTime)v1).property(((org.joda.time.DateTimeFieldType)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.MutableDateTime)v4).clone();
    Object v6 = 0;
    ((org.joda.time.MutableDateTime)v5).addHours((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.joda.time.MutableDateTime();
    Object v1 = ((org.joda.time.MutableDateTime)v0).copy();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.joda.time.MutableDateTime();
    Object v1 = "BST";
    Object v2 = ((org.joda.time.base.AbstractDateTime)v0).toString(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.joda.time.MutableDateTime();
    Object v1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v2 = ((org.joda.time.base.AbstractInstant)v0).isSupported(((org.joda.time.DateTimeFieldType)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.DateMidnight.now(((org.joda.time.DateTimeZone)v1));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = org.joda.time.DurationFieldType.eras();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v6 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v3),((org.joda.time.DurationField)v5));
    Object v7 = ((org.joda.time.base.AbstractInstant)v2).get(((org.joda.time.DateTimeField)v6));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.joda.time.MutableDateTime();
    Object v1 = ((org.joda.time.MutableDateTime)v0).copy();
    Object v2 = 1L;
    Object v3 = new org.joda.time.MutableDateTime((((java.lang.Long)v2).longValue()));
    Object v4 = ((org.joda.time.base.AbstractInstant)v1).compareTo(((org.joda.time.ReadableInstant)v3));
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.joda.time.MutableDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = ((org.joda.time.base.AbstractInstant)v1).isEqualNow();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.MutableDateTime.now(((org.joda.time.DateTimeZone)v1));
    Object v3 = 1;
    ((org.joda.time.MutableDateTime)v2).addWeekyears((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = -20L;
    Object v6 = org.joda.time.Duration.standardDays((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.joda.time.ReadableDuration)v6).toString();
    Object v8 = 71;
    ((org.joda.time.MutableDateTime)v2).add(((org.joda.time.ReadableDuration)v6),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.MutableDateTime.now(((org.joda.time.DateTimeZone)v1));
    Object v3 = 1L;
    Object v4 = ((org.joda.time.base.AbstractInstant)v2).isAfter((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.joda.time.MutableDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v3 = 0;
    Object v4 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v3).intValue()));
    Object v5 = 2;
    Object v6 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.joda.time.DateTimeFieldType)v2).getField(((org.joda.time.Chronology)v6));
    Object v8 = ((org.joda.time.base.AbstractDateTime)v1).get(((org.joda.time.DateTimeFieldType)v2));
    org.junit.Assert.assertEquals((Object)(69), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.joda.time.MutableDateTime();
    Object v1 = ((org.joda.time.MutableDateTime)v0).minuteOfDay();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 54L;
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.joda.time.Chronology)v4).halfdays();
    Object v6 = new org.joda.time.MutableDateTime((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v4));
    Object v7 = 0;
    ((org.joda.time.MutableDateTime)v6).addMillis((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.joda.time.MutableDateTime();
    Object v1 = 2L;
    ((org.joda.time.MutableDateTime)v0).setMillis((((java.lang.Long)v1).longValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.DateMidnight.now(((org.joda.time.DateTimeZone)v1));
    Object v3 = ((org.joda.time.base.AbstractDateTime)v2).getMonthOfYear();
    org.junit.Assert.assertEquals((Object)(10), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 1L;
    Object v1 = new org.joda.time.MutableDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -41;
    ((org.joda.time.MutableDateTime)v1).addMillis((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.MutableDateTime.now(((org.joda.time.DateTimeZone)v1));
    Object v3 = ((org.joda.time.base.AbstractInstant)v2).toDateTime();
    Object v4 = org.joda.time.DurationFieldType.eras();
    Object v5 = 0;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v5).intValue()));
    Object v7 = 2;
    Object v8 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.DurationFieldType)v4).isSupported(((org.joda.time.Chronology)v8));
    Object v10 = 3;
    ((org.joda.time.MutableDateTime)v2).add(((org.joda.time.DurationFieldType)v4),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.MutableDateTime.now(((org.joda.time.DateTimeZone)v1));
    Object v3 = -17;
    ((org.joda.time.MutableDateTime)v2).setMillisOfDay((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.joda.time.MutableDateTime();
    Object v1 = ((org.joda.time.MutableDateTime)v0).copy();
    Object v2 = -47;
    ((org.joda.time.MutableDateTime)v1).addHours((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.MutableDateTime)v4).clone();
    Object v6 = ((org.joda.time.base.AbstractInstant)v5).isEqualNow();
    Object v7 = org.joda.time.format.ISODateTimeFormat.dateHour();
    Object v8 = ((org.joda.time.base.AbstractInstant)v5).toString(((org.joda.time.format.DateTimeFormatter)v7));
    org.junit.Assert.assertEquals((Object)("2019-01-25T12"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = new org.joda.time.MutableDateTime();
    Object v6 = ((org.joda.time.MutableDateTime)v5).copy();
    Object v7 = ((org.joda.time.base.AbstractInstant)v4).compareTo(((org.joda.time.ReadableInstant)v6));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 20L;
    Object v5 = new org.joda.time.MutablePeriod((((java.lang.Long)v4).longValue()));
    Object v6 = 1L;
    Object v7 = 0L;
    Object v8 = ((org.joda.time.Chronology)v3).get(((org.joda.time.ReadablePeriod)v5),(((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()));
    Object v9 = org.joda.time.MutableDateTime.now(((org.joda.time.Chronology)v3));
    Object v10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v11 = ((org.joda.time.base.AbstractDateTime)v9).get(((org.joda.time.DateTimeFieldType)v10));
    Object v12 = 6L;
    ((org.joda.time.MutableDateTime)v9).setMillis((((java.lang.Long)v12).longValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.joda.time.MutableDateTime();
    Object v1 = ((org.joda.time.MutableDateTime)v0).copy();
    Object v2 = ((org.joda.time.MutableDateTime)v1).minuteOfDay();
    Object v3 = 4;
    ((org.joda.time.MutableDateTime)v1).setMillisOfSecond((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 2;
    Object v3 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v3));
    Object v5 = 0;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v5).intValue()));
    Object v7 = 2;
    Object v8 = org.joda.time.chrono.EthiopicChronology.getInstance(((org.joda.time.DateTimeZone)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new org.joda.time.MutableDateTime(((org.joda.time.Chronology)v8));
    Object v10 = ((org.joda.time.base.AbstractInstant)v4).isBefore(((org.joda.time.ReadableInstant)v9));
    Object v11 = 26;
    ((org.joda.time.MutableDateTime)v4).addWeekyears((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }
}
