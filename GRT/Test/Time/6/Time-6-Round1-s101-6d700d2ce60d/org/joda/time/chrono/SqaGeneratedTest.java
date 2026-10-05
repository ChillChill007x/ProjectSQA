package org.joda.time.chrono;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstance();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstance();
    Object v1 = 1L;
    Object v2 = org.joda.time.Duration.standardHours((((java.lang.Long)v1).longValue()));
    Object v3 = org.joda.time.Instant.now();
    Object v4 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v3));
    Object v5 = ((org.joda.time.ReadablePeriod)v4).hashCode();
    Object v6 = 0L;
    Object v7 = ((org.joda.time.chrono.BaseChronology)v0).get(((org.joda.time.ReadablePeriod)v4),(((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstance();
    Object v1 = ((org.joda.time.chrono.AssembledChronology)v0).days();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstance();
    Object v1 = new org.joda.time.chrono.AssembledChronology.Fields();
    ((org.joda.time.chrono.GJChronology)v0).assemble(((org.joda.time.chrono.AssembledChronology.Fields)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.Instant.now();
    Object v4 = 0;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstance();
    Object v1 = ((org.joda.time.chrono.BaseChronology)v0).years();
    Object v2 = 74L;
    Object v3 = -45L;
    Object v4 = 0;
    Object v5 = ((org.joda.time.chrono.BaseChronology)v0).add((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(74L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstance();
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = org.joda.time.YearMonth.fromCalendarFields(((java.util.Calendar)v2));
    Object v4 = -18L;
    Object v5 = ((org.joda.time.chrono.BaseChronology)v0).set(((org.joda.time.ReadablePartial)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = org.joda.time.Instant.now();
    Object v7 = ((org.joda.time.chrono.GJChronology)v0).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.GJChronology.getInstance();
    Object v1 = 1;
    Object v2 = -12;
    Object v3 = 1;
    Object v4 = 29;
    Object v5 = 0;
    Object v6 = 27;
    Object v7 = 26;
    Object v8 = ((org.joda.time.chrono.GJChronology)v0).getDateTimeMillis((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 1L;
    Object v7 = org.joda.time.Duration.standardHours((((java.lang.Long)v6).longValue()));
    Object v8 = org.joda.time.Instant.now();
    Object v9 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v7),((org.joda.time.ReadableInstant)v8));
    Object v10 = -1L;
    Object v11 = 0;
    Object v12 = ((org.joda.time.chrono.BaseChronology)v5).add(((org.joda.time.ReadablePeriod)v9),(((java.lang.Long)v10).longValue()),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertEquals((Object)(-1L), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 1L;
    Object v7 = org.joda.time.Duration.standardHours((((java.lang.Long)v6).longValue()));
    Object v8 = org.joda.time.Instant.now();
    Object v9 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v7),((org.joda.time.ReadableInstant)v8));
    Object v10 = 25L;
    Object v11 = 0;
    Object v12 = ((org.joda.time.chrono.BaseChronology)v5).add(((org.joda.time.ReadablePeriod)v9),(((java.lang.Long)v10).longValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new org.joda.time.chrono.AssembledChronology.Fields();
    ((org.joda.time.chrono.GJChronology)v5).assemble(((org.joda.time.chrono.AssembledChronology.Fields)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.Instant.now();
    Object v4 = ((org.joda.time.DateTimeZone)v2).getOffset(((org.joda.time.ReadableInstant)v3));
    Object v5 = 1L;
    Object v6 = 0;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -70L;
    Object v7 = ((org.joda.time.chrono.GJChronology)v5).gregorianToJulianByYear((((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertEquals((Object)(1123199930L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.chrono.BaseChronology)v5).minuteOfHour();
    Object v7 = 1L;
    Object v8 = org.joda.time.Duration.standardHours((((java.lang.Long)v7).longValue()));
    Object v9 = org.joda.time.Instant.now();
    Object v10 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v8),((org.joda.time.ReadableInstant)v9));
    Object v11 = 41L;
    Object v12 = ((org.joda.time.chrono.BaseChronology)v5).get(((org.joda.time.ReadablePeriod)v10),(((java.lang.Long)v11).longValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -4;
    Object v7 = -22;
    Object v8 = 3;
    Object v9 = 53;
    Object v10 = 0;
    Object v11 = -21;
    Object v12 = 1;
    Object v13 = ((org.joda.time.chrono.GJChronology)v5).getDateTimeMillis((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 1L;
    Object v7 = 10;
    Object v8 = 3;
    Object v9 = -7;
    Object v10 = 1;
    Object v11 = ((org.joda.time.chrono.AssembledChronology)v5).getDateTimeMillis((((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.chrono.AssembledChronology)v5).years();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.chrono.GJChronology)v5).toString();
    org.junit.Assert.assertEquals((Object)("GJChronology[+03:46,cutover=1970-01-01T00:00:00.001Z,mdfw=1]"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.chrono.AssembledChronology)v5).dayOfWeek();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstance();
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = org.joda.time.YearMonth.fromCalendarFields(((java.util.Calendar)v2));
    Object v4 = -1L;
    Object v5 = ((org.joda.time.chrono.BaseChronology)v0).set(((org.joda.time.ReadablePartial)v3),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(1793487599999L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.chrono.GJChronology)v5).getZone();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.chrono.GJChronology)v5).getZone();
    Object v7 = org.joda.time.Instant.now();
    Object v8 = 4;
    Object v9 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v6),((org.joda.time.ReadableInstant)v7),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 1L;
    Object v7 = org.joda.time.Duration.standardHours((((java.lang.Long)v6).longValue()));
    Object v8 = org.joda.time.Instant.now();
    Object v9 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v7),((org.joda.time.ReadableInstant)v8));
    Object v10 = 1L;
    Object v11 = -43L;
    Object v12 = ((org.joda.time.chrono.BaseChronology)v5).get(((org.joda.time.ReadablePeriod)v9),(((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()));
    Object v13 = 3L;
    Object v14 = ((org.joda.time.chrono.GJChronology)v5).julianToGregorianByYear((((java.lang.Long)v13).longValue()));
    org.junit.Assert.assertEquals((Object)(-1123199997L), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.chrono.GJChronology)v9).toString();
    org.junit.Assert.assertEquals((Object)("GJChronology[+03:46,cutover=1970-01-01T00:00:00.001Z,mdfw=1]"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 1L;
    Object v7 = org.joda.time.Duration.standardHours((((java.lang.Long)v6).longValue()));
    Object v8 = org.joda.time.Instant.now();
    Object v9 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v7),((org.joda.time.ReadableInstant)v8));
    Object v10 = 0L;
    Object v11 = 15L;
    Object v12 = ((org.joda.time.chrono.BaseChronology)v5).get(((org.joda.time.ReadablePeriod)v9),(((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.chrono.GJChronology)v5).getZone();
    Object v7 = org.joda.time.Instant.now();
    Object v8 = 4;
    Object v9 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v6),((org.joda.time.ReadableInstant)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.chrono.AssembledChronology)v9).centuries();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = 1L;
    Object v11 = org.joda.time.Duration.standardHours((((java.lang.Long)v10).longValue()));
    Object v12 = org.joda.time.Instant.now();
    Object v13 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v11),((org.joda.time.ReadableInstant)v12));
    Object v14 = 1L;
    Object v15 = 1;
    Object v16 = ((org.joda.time.chrono.BaseChronology)v9).add(((org.joda.time.ReadablePeriod)v13),(((java.lang.Long)v14).longValue()),(((java.lang.Integer)v15).intValue()));
    org.junit.Assert.assertEquals((Object)(3600001L), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.chrono.BaseChronology)v9).millisOfDay();
    Object v11 = java.util.TimeZone.getDefault();
    Object v12 = java.util.Calendar.getInstance(((java.util.TimeZone)v11));
    Object v13 = org.joda.time.YearMonth.fromCalendarFields(((java.util.Calendar)v12));
    Object v14 = new int[]{0,-25};
    ((org.joda.time.chrono.BaseChronology)v9).validate(((org.joda.time.ReadablePartial)v13),((int[])v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.chrono.AssembledChronology)v9).dayOfYear();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = org.joda.time.Instant.now();
    Object v11 = ((org.joda.time.chrono.GJChronology)v9).equals(((java.lang.Object)v10));
    Object v12 = ((org.joda.time.chrono.GJChronology)v9).getZone();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 80;
    Object v7 = 0;
    Object v8 = -57;
    Object v9 = 0;
    Object v10 = ((org.joda.time.chrono.GJChronology)v5).getDateTimeMillis((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = 0L;
    Object v11 = -49;
    Object v12 = -20;
    Object v13 = -21;
    Object v14 = 1;
    Object v15 = ((org.joda.time.chrono.AssembledChronology)v9).getDateTimeMillis((((java.lang.Long)v10).longValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.chrono.AssembledChronology)v9).minuteOfHour();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.chrono.AssembledChronology)v9).hours();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = 1L;
    Object v11 = org.joda.time.Duration.standardHours((((java.lang.Long)v10).longValue()));
    Object v12 = org.joda.time.Instant.now();
    Object v13 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v11),((org.joda.time.ReadableInstant)v12));
    Object v14 = 49L;
    Object v15 = ((org.joda.time.chrono.BaseChronology)v9).get(((org.joda.time.ReadablePeriod)v13),(((java.lang.Long)v14).longValue()));
    Object v16 = 1L;
    Object v17 = org.joda.time.Duration.standardHours((((java.lang.Long)v16).longValue()));
    Object v18 = org.joda.time.Instant.now();
    Object v19 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v17),((org.joda.time.ReadableInstant)v18));
    Object v20 = 1L;
    Object v21 = ((org.joda.time.chrono.BaseChronology)v9).get(((org.joda.time.ReadablePeriod)v19),(((java.lang.Long)v20).longValue()));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.chrono.GJChronology)v9).getMinimumDaysInFirstWeek();
    org.junit.Assert.assertEquals((Object)(1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.chrono.AssembledChronology)v9).hourOfDay();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.chrono.AssembledChronology)v9).monthOfYear();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.chrono.AssembledChronology.Fields();
    Object v7 = ((org.joda.time.chrono.GJChronology)v5).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = 1L;
    Object v11 = org.joda.time.Duration.standardHours((((java.lang.Long)v10).longValue()));
    Object v12 = org.joda.time.Instant.now();
    Object v13 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v11),((org.joda.time.ReadableInstant)v12));
    Object v14 = 13L;
    Object v15 = ((org.joda.time.chrono.BaseChronology)v9).get(((org.joda.time.ReadablePeriod)v13),(((java.lang.Long)v14).longValue()));
    Object v16 = 1L;
    Object v17 = org.joda.time.Duration.standardHours((((java.lang.Long)v16).longValue()));
    Object v18 = org.joda.time.Instant.now();
    Object v19 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v17),((org.joda.time.ReadableInstant)v18));
    Object v20 = new org.joda.time.chrono.AssembledChronology.Fields();
    Object v21 = ((org.joda.time.ReadablePeriod)v19).equals(((java.lang.Object)v20));
    Object v22 = -10L;
    Object v23 = 17L;
    Object v24 = ((org.joda.time.chrono.BaseChronology)v9).get(((org.joda.time.ReadablePeriod)v19),(((java.lang.Long)v22).longValue()),(((java.lang.Long)v23).longValue()));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = 1L;
    Object v11 = org.joda.time.Duration.standardHours((((java.lang.Long)v10).longValue()));
    Object v12 = org.joda.time.Instant.now();
    Object v13 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v11),((org.joda.time.ReadableInstant)v12));
    Object v14 = -32L;
    Object v15 = 24L;
    Object v16 = ((org.joda.time.chrono.BaseChronology)v9).get(((org.joda.time.ReadablePeriod)v13),(((java.lang.Long)v14).longValue()),(((java.lang.Long)v15).longValue()));
    Object v17 = ((org.joda.time.chrono.GJChronology)v9).getZone();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.chrono.AssembledChronology)v9).clockhourOfHalfday();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1L;
    Object v10 = 1;
    Object v11 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 3;
    Object v13 = 46;
    Object v14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.joda.time.chrono.GJChronology)v11).withZone(((org.joda.time.DateTimeZone)v14));
    Object v16 = org.joda.time.Instant.now();
    Object v17 = ((org.joda.time.chrono.GJChronology)v15).equals(((java.lang.Object)v16));
    Object v18 = ((org.joda.time.chrono.GJChronology)v15).getZone();
    Object v19 = 1L;
    Object v20 = ((org.joda.time.DateTimeZone)v18).getOffset((((java.lang.Long)v19).longValue()));
    Object v21 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v18));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.chrono.GJChronology)v5).getZone();
    Object v7 = -16L;
    Object v8 = 0;
    Object v9 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v6),(((java.lang.Long)v7).longValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = 1L;
    Object v11 = 0;
    Object v12 = -63;
    Object v13 = -5;
    Object v14 = 87;
    Object v15 = ((org.joda.time.chrono.AssembledChronology)v9).getDateTimeMillis((((java.lang.Long)v10).longValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1L;
    Object v10 = 1;
    Object v11 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 3;
    Object v13 = 46;
    Object v14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.joda.time.chrono.GJChronology)v11).withZone(((org.joda.time.DateTimeZone)v14));
    Object v16 = org.joda.time.Instant.now();
    Object v17 = ((org.joda.time.chrono.GJChronology)v15).equals(((java.lang.Object)v16));
    Object v18 = ((org.joda.time.chrono.GJChronology)v15).getZone();
    Object v19 = 1L;
    Object v20 = ((org.joda.time.DateTimeZone)v18).getOffset((((java.lang.Long)v19).longValue()));
    Object v21 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v18));
    Object v22 = ((org.joda.time.chrono.BaseChronology)v21).secondOfDay();
    Object v23 = java.util.TimeZone.getDefault();
    Object v24 = java.util.Calendar.getInstance(((java.util.TimeZone)v23));
    Object v25 = org.joda.time.YearMonth.fromCalendarFields(((java.util.Calendar)v24));
    Object v26 = 0;
    Object v27 = ((org.joda.time.ReadablePartial)v25).getField((((java.lang.Integer)v26).intValue()));
    Object v28 = 20L;
    Object v29 = ((org.joda.time.chrono.BaseChronology)v21).get(((org.joda.time.ReadablePartial)v25),(((java.lang.Long)v28).longValue()));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.chrono.BaseChronology)v5).withUTC();
    Object v7 = ((org.joda.time.chrono.AssembledChronology)v5).eras();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = 9L;
    Object v11 = ((org.joda.time.chrono.GJChronology)v9).julianToGregorianByWeekyear((((java.lang.Long)v10).longValue()));
    org.junit.Assert.assertEquals((Object)(-1209599991L), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1L;
    Object v10 = 1;
    Object v11 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 3;
    Object v13 = 46;
    Object v14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.joda.time.chrono.GJChronology)v11).withZone(((org.joda.time.DateTimeZone)v14));
    Object v16 = org.joda.time.Instant.now();
    Object v17 = ((org.joda.time.chrono.GJChronology)v15).equals(((java.lang.Object)v16));
    Object v18 = ((org.joda.time.chrono.GJChronology)v15).getZone();
    Object v19 = 1L;
    Object v20 = ((org.joda.time.DateTimeZone)v18).getOffset((((java.lang.Long)v19).longValue()));
    Object v21 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v18));
    Object v22 = new org.joda.time.chrono.AssembledChronology.Fields();
    Object v23 = 3;
    Object v24 = 46;
    Object v25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = 1L;
    Object v27 = 1;
    Object v28 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v25),(((java.lang.Long)v26).longValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = 3;
    Object v30 = 46;
    Object v31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v29).intValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((org.joda.time.chrono.GJChronology)v28).withZone(((org.joda.time.DateTimeZone)v31));
    ((org.joda.time.chrono.AssembledChronology.Fields)v22).copyFieldsFrom(((org.joda.time.Chronology)v32));
    Object v33 = null;
    ((org.joda.time.chrono.GJChronology)v21).assemble(((org.joda.time.chrono.AssembledChronology.Fields)v22));
    Object v34 = null;
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1L;
    Object v10 = 1;
    Object v11 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 3;
    Object v13 = 46;
    Object v14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.joda.time.chrono.GJChronology)v11).withZone(((org.joda.time.DateTimeZone)v14));
    Object v16 = org.joda.time.Instant.now();
    Object v17 = ((org.joda.time.chrono.GJChronology)v15).equals(((java.lang.Object)v16));
    Object v18 = ((org.joda.time.chrono.GJChronology)v15).getZone();
    Object v19 = 1L;
    Object v20 = ((org.joda.time.DateTimeZone)v18).getOffset((((java.lang.Long)v19).longValue()));
    Object v21 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v18));
    Object v22 = ((org.joda.time.chrono.AssembledChronology)v21).secondOfDay();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1L;
    Object v10 = 1;
    Object v11 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 3;
    Object v13 = 46;
    Object v14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.joda.time.chrono.GJChronology)v11).withZone(((org.joda.time.DateTimeZone)v14));
    Object v16 = org.joda.time.Instant.now();
    Object v17 = ((org.joda.time.chrono.GJChronology)v15).equals(((java.lang.Object)v16));
    Object v18 = ((org.joda.time.chrono.GJChronology)v15).getZone();
    Object v19 = 1L;
    Object v20 = ((org.joda.time.DateTimeZone)v18).getOffset((((java.lang.Long)v19).longValue()));
    Object v21 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v18));
    Object v22 = 0L;
    Object v23 = 1L;
    Object v24 = 3600000;
    Object v25 = ((org.joda.time.chrono.BaseChronology)v21).add((((java.lang.Long)v22).longValue()),(((java.lang.Long)v23).longValue()),(((java.lang.Integer)v24).intValue()));
    org.junit.Assert.assertEquals((Object)(3600000L), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 5;
    Object v7 = -49;
    Object v8 = 0;
    Object v9 = 1;
    Object v10 = ((org.joda.time.chrono.GJChronology)v5).getDateTimeMillis((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1L;
    Object v10 = 1;
    Object v11 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 3;
    Object v13 = 46;
    Object v14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.joda.time.chrono.GJChronology)v11).withZone(((org.joda.time.DateTimeZone)v14));
    Object v16 = org.joda.time.Instant.now();
    Object v17 = ((org.joda.time.chrono.GJChronology)v15).equals(((java.lang.Object)v16));
    Object v18 = ((org.joda.time.chrono.GJChronology)v15).getZone();
    Object v19 = 1L;
    Object v20 = ((org.joda.time.DateTimeZone)v18).getOffset((((java.lang.Long)v19).longValue()));
    Object v21 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v18));
    Object v22 = ((org.joda.time.chrono.AssembledChronology)v21).hours();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1L;
    Object v10 = 1;
    Object v11 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 3;
    Object v13 = 46;
    Object v14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.joda.time.chrono.GJChronology)v11).withZone(((org.joda.time.DateTimeZone)v14));
    Object v16 = org.joda.time.Instant.now();
    Object v17 = ((org.joda.time.chrono.GJChronology)v15).equals(((java.lang.Object)v16));
    Object v18 = ((org.joda.time.chrono.GJChronology)v15).getZone();
    Object v19 = 1L;
    Object v20 = ((org.joda.time.DateTimeZone)v18).getOffset((((java.lang.Long)v19).longValue()));
    Object v21 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v18));
    Object v22 = 1L;
    Object v23 = org.joda.time.Duration.standardHours((((java.lang.Long)v22).longValue()));
    Object v24 = org.joda.time.Instant.now();
    Object v25 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v23),((org.joda.time.ReadableInstant)v24));
    Object v26 = ((org.joda.time.ReadablePeriod)v25).toMutablePeriod();
    Object v27 = 0L;
    Object v28 = 45L;
    Object v29 = ((org.joda.time.chrono.BaseChronology)v21).get(((org.joda.time.ReadablePeriod)v25),(((java.lang.Long)v27).longValue()),(((java.lang.Long)v28).longValue()));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1L;
    Object v10 = 1;
    Object v11 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 3;
    Object v13 = 46;
    Object v14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.joda.time.chrono.GJChronology)v11).withZone(((org.joda.time.DateTimeZone)v14));
    Object v16 = org.joda.time.Instant.now();
    Object v17 = ((org.joda.time.chrono.GJChronology)v15).equals(((java.lang.Object)v16));
    Object v18 = ((org.joda.time.chrono.GJChronology)v15).getZone();
    Object v19 = 1L;
    Object v20 = ((org.joda.time.DateTimeZone)v18).getOffset((((java.lang.Long)v19).longValue()));
    Object v21 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v18));
    Object v22 = ((org.joda.time.chrono.AssembledChronology)v21).weeks();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1L;
    Object v10 = 1;
    Object v11 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 3;
    Object v13 = 46;
    Object v14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.joda.time.chrono.GJChronology)v11).withZone(((org.joda.time.DateTimeZone)v14));
    Object v16 = org.joda.time.Instant.now();
    Object v17 = ((org.joda.time.chrono.GJChronology)v15).equals(((java.lang.Object)v16));
    Object v18 = ((org.joda.time.chrono.GJChronology)v15).getZone();
    Object v19 = 1L;
    Object v20 = ((org.joda.time.DateTimeZone)v18).getOffset((((java.lang.Long)v19).longValue()));
    Object v21 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v18));
    Object v22 = java.util.TimeZone.getDefault();
    Object v23 = java.util.Calendar.getInstance(((java.util.TimeZone)v22));
    Object v24 = org.joda.time.YearMonth.fromCalendarFields(((java.util.Calendar)v23));
    Object v25 = ((org.joda.time.ReadablePartial)v24).getChronology();
    Object v26 = -3L;
    Object v27 = ((org.joda.time.chrono.BaseChronology)v21).set(((org.joda.time.ReadablePartial)v24),(((java.lang.Long)v26).longValue()));
    org.junit.Assert.assertEquals((Object)(1790812799997L), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = org.joda.time.DateTimeFieldType.millisOfDay();
    Object v11 = ((org.joda.time.chrono.GJChronology)v9).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.chrono.AssembledChronology)v9).halfdayOfDay();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1L;
    Object v10 = 1;
    Object v11 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 3;
    Object v13 = 46;
    Object v14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.joda.time.chrono.GJChronology)v11).withZone(((org.joda.time.DateTimeZone)v14));
    Object v16 = org.joda.time.Instant.now();
    Object v17 = ((org.joda.time.chrono.GJChronology)v15).equals(((java.lang.Object)v16));
    Object v18 = ((org.joda.time.chrono.GJChronology)v15).getZone();
    Object v19 = 1L;
    Object v20 = ((org.joda.time.DateTimeZone)v18).getOffset((((java.lang.Long)v19).longValue()));
    Object v21 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v18));
    Object v22 = ((org.joda.time.chrono.AssembledChronology)v21).weekyear();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.chrono.AssembledChronology)v9).dayOfMonth();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.chrono.AssembledChronology)v9).getZone();
    Object v11 = ((org.joda.time.chrono.AssembledChronology)v9).seconds();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.chrono.GJChronology)v5).getZone();
    Object v7 = org.joda.time.Instant.now();
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v6),((org.joda.time.ReadableInstant)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.chrono.GJChronology)v5).getZone();
    Object v7 = org.joda.time.Instant.now();
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v6),((org.joda.time.ReadableInstant)v7));
    Object v9 = ((org.joda.time.chrono.AssembledChronology)v8).clockhourOfDay();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = 0L;
    Object v11 = 3L;
    Object v12 = 0;
    Object v13 = ((org.joda.time.chrono.BaseChronology)v9).add((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.chrono.AssembledChronology)v9).clockhourOfHalfday();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.chrono.AssembledChronology)v9).clockhourOfDay();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.chrono.AssembledChronology)v9).millisOfDay();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = java.util.TimeZone.getDefault();
    Object v11 = java.util.Calendar.getInstance(((java.util.TimeZone)v10));
    Object v12 = org.joda.time.YearMonth.fromCalendarFields(((java.util.Calendar)v11));
    Object v13 = -5L;
    Object v14 = ((org.joda.time.chrono.BaseChronology)v9).get(((org.joda.time.ReadablePartial)v12),(((java.lang.Long)v13).longValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.chrono.AssembledChronology)v9).minuteOfDay();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.chrono.GJChronology)v5).getZone();
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 1L;
    Object v7 = org.joda.time.Duration.standardHours((((java.lang.Long)v6).longValue()));
    Object v8 = org.joda.time.Instant.now();
    Object v9 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v7),((org.joda.time.ReadableInstant)v8));
    Object v10 = 1L;
    Object v11 = 1;
    Object v12 = ((org.joda.time.chrono.BaseChronology)v5).add(((org.joda.time.ReadablePeriod)v9),(((java.lang.Long)v10).longValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.joda.time.chrono.AssembledChronology)v5).dayOfMonth();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1L;
    Object v10 = 1;
    Object v11 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 3;
    Object v13 = 46;
    Object v14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.joda.time.chrono.GJChronology)v11).withZone(((org.joda.time.DateTimeZone)v14));
    Object v16 = org.joda.time.Instant.now();
    Object v17 = ((org.joda.time.chrono.GJChronology)v15).equals(((java.lang.Object)v16));
    Object v18 = ((org.joda.time.chrono.GJChronology)v15).getZone();
    Object v19 = 1L;
    Object v20 = ((org.joda.time.DateTimeZone)v18).getOffset((((java.lang.Long)v19).longValue()));
    Object v21 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v18));
    Object v22 = java.util.TimeZone.getDefault();
    Object v23 = java.util.Calendar.getInstance(((java.util.TimeZone)v22));
    Object v24 = org.joda.time.YearMonth.fromCalendarFields(((java.util.Calendar)v23));
    Object v25 = 1L;
    Object v26 = ((org.joda.time.chrono.BaseChronology)v21).get(((org.joda.time.ReadablePartial)v24),(((java.lang.Long)v25).longValue()));
    Object v27 = ((org.joda.time.chrono.AssembledChronology)v21).yearOfEra();
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.chrono.GJChronology)v5).getZone();
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v6));
    Object v8 = 1L;
    Object v9 = org.joda.time.Duration.standardHours((((java.lang.Long)v8).longValue()));
    Object v10 = org.joda.time.Instant.now();
    Object v11 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v9),((org.joda.time.ReadableInstant)v10));
    Object v12 = 0L;
    Object v13 = 0L;
    Object v14 = ((org.joda.time.chrono.BaseChronology)v7).get(((org.joda.time.ReadablePeriod)v11),(((java.lang.Long)v12).longValue()),(((java.lang.Long)v13).longValue()));
    Object v15 = 3;
    Object v16 = 46;
    Object v17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = 1L;
    Object v19 = 1;
    Object v20 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v17),(((java.lang.Long)v18).longValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = 3;
    Object v22 = 46;
    Object v23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((org.joda.time.chrono.GJChronology)v20).withZone(((org.joda.time.DateTimeZone)v23));
    Object v25 = ((org.joda.time.chrono.GJChronology)v24).getMinimumDaysInFirstWeek();
    Object v26 = ((org.joda.time.chrono.GJChronology)v7).equals(((java.lang.Object)v25));
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = org.joda.time.Instant.now();
    Object v11 = ((org.joda.time.chrono.GJChronology)v9).equals(((java.lang.Object)v10));
    Object v12 = ((org.joda.time.chrono.GJChronology)v9).getZone();
    Object v13 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.BaseChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.chrono.AssembledChronology)v5).weekOfWeekyear();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = org.joda.time.Instant.now();
    Object v11 = ((org.joda.time.chrono.GJChronology)v9).equals(((java.lang.Object)v10));
    Object v12 = ((org.joda.time.chrono.GJChronology)v9).getZone();
    Object v13 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v12));
    Object v14 = ((org.joda.time.chrono.AssembledChronology)v13).hourOfDay();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = 1L;
    Object v11 = org.joda.time.Duration.standardHours((((java.lang.Long)v10).longValue()));
    Object v12 = org.joda.time.Instant.now();
    Object v13 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v11),((org.joda.time.ReadableInstant)v12));
    Object v14 = -32L;
    Object v15 = 24L;
    Object v16 = ((org.joda.time.chrono.BaseChronology)v9).get(((org.joda.time.ReadablePeriod)v13),(((java.lang.Long)v14).longValue()),(((java.lang.Long)v15).longValue()));
    Object v17 = ((org.joda.time.chrono.GJChronology)v9).getZone();
    Object v18 = -27L;
    Object v19 = ((org.joda.time.DateTimeZone)v17).previousTransition((((java.lang.Long)v18).longValue()));
    Object v20 = 50L;
    Object v21 = 59;
    Object v22 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v17),(((java.lang.Long)v20).longValue()),(((java.lang.Integer)v21).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = java.util.TimeZone.getDefault();
    Object v11 = java.util.Calendar.getInstance(((java.util.TimeZone)v10));
    Object v12 = org.joda.time.YearMonth.fromCalendarFields(((java.util.Calendar)v11));
    Object v13 = new int[]{0};
    ((org.joda.time.chrono.BaseChronology)v9).validate(((org.joda.time.ReadablePartial)v12),((int[])v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.chrono.GJChronology)v5).getZone();
    Object v7 = org.joda.time.Instant.now();
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v6),((org.joda.time.ReadableInstant)v7));
    Object v9 = 1L;
    Object v10 = org.joda.time.Duration.standardHours((((java.lang.Long)v9).longValue()));
    Object v11 = org.joda.time.Instant.now();
    Object v12 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v10),((org.joda.time.ReadableInstant)v11));
    Object v13 = ((org.joda.time.ReadablePeriod)v12).hashCode();
    Object v14 = -41L;
    Object v15 = 0;
    Object v16 = ((org.joda.time.chrono.BaseChronology)v8).add(((org.joda.time.ReadablePeriod)v12),(((java.lang.Long)v14).longValue()),(((java.lang.Integer)v15).intValue()));
    org.junit.Assert.assertEquals((Object)(-41L), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.chrono.GJChronology)v5).getZone();
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v6));
    Object v8 = 3;
    Object v9 = 46;
    Object v10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 1L;
    Object v12 = 1;
    Object v13 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v10),(((java.lang.Long)v11).longValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.chrono.GJChronology)v13).getZone();
    Object v15 = ((org.joda.time.chrono.GJChronology)v7).withZone(((org.joda.time.DateTimeZone)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1L;
    Object v10 = 1;
    Object v11 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 3;
    Object v13 = 46;
    Object v14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.joda.time.chrono.GJChronology)v11).withZone(((org.joda.time.DateTimeZone)v14));
    Object v16 = org.joda.time.Instant.now();
    Object v17 = ((org.joda.time.chrono.GJChronology)v15).equals(((java.lang.Object)v16));
    Object v18 = ((org.joda.time.chrono.GJChronology)v15).getZone();
    Object v19 = 1L;
    Object v20 = ((org.joda.time.DateTimeZone)v18).getOffset((((java.lang.Long)v19).longValue()));
    Object v21 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v18));
    Object v22 = 6L;
    Object v23 = -26L;
    Object v24 = 22;
    Object v25 = ((org.joda.time.chrono.BaseChronology)v21).add((((java.lang.Long)v22).longValue()),(((java.lang.Long)v23).longValue()),(((java.lang.Integer)v24).intValue()));
    org.junit.Assert.assertEquals((Object)(-566L), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.chrono.GJChronology)v5).getZone();
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v6));
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = java.util.Calendar.getInstance(((java.util.TimeZone)v8));
    Object v10 = org.joda.time.YearMonth.fromCalendarFields(((java.util.Calendar)v9));
    Object v11 = new int[]{1,0,0};
    ((org.joda.time.chrono.BaseChronology)v7).validate(((org.joda.time.ReadablePartial)v10),((int[])v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.chrono.GJChronology)v5).getZone();
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v6));
    Object v8 = 3;
    Object v9 = 46;
    Object v10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 1L;
    Object v12 = 1;
    Object v13 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v10),(((java.lang.Long)v11).longValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.chrono.GJChronology)v13).getZone();
    Object v15 = ((org.joda.time.chrono.GJChronology)v7).withZone(((org.joda.time.DateTimeZone)v14));
    Object v16 = 1L;
    Object v17 = org.joda.time.Duration.standardHours((((java.lang.Long)v16).longValue()));
    Object v18 = org.joda.time.Instant.now();
    Object v19 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v17),((org.joda.time.ReadableInstant)v18));
    Object v20 = org.joda.time.DurationFieldType.minutes();
    Object v21 = ((org.joda.time.ReadablePeriod)v19).isSupported(((org.joda.time.DurationFieldType)v20));
    Object v22 = -47L;
    Object v23 = 1;
    Object v24 = ((org.joda.time.chrono.BaseChronology)v15).add(((org.joda.time.ReadablePeriod)v19),(((java.lang.Long)v22).longValue()),(((java.lang.Integer)v23).intValue()));
    org.junit.Assert.assertEquals((Object)(3599953L), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.chrono.GJChronology)v5).getZone();
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v6));
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = java.util.Calendar.getInstance(((java.util.TimeZone)v8));
    Object v10 = org.joda.time.YearMonth.fromCalendarFields(((java.util.Calendar)v9));
    Object v11 = org.joda.time.DateTimeFieldType.millisOfDay();
    Object v12 = ((org.joda.time.ReadablePartial)v10).isSupported(((org.joda.time.DateTimeFieldType)v11));
    Object v13 = 0L;
    Object v14 = ((org.joda.time.chrono.BaseChronology)v7).get(((org.joda.time.ReadablePartial)v10),(((java.lang.Long)v13).longValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.chrono.AssembledChronology)v9).year();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = -5L;
    Object v11 = 29;
    Object v12 = -21;
    Object v13 = 1;
    Object v14 = -32;
    Object v15 = ((org.joda.time.chrono.AssembledChronology)v9).getDateTimeMillis((((java.lang.Long)v10).longValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = java.util.TimeZone.getDefault();
    Object v11 = java.util.Calendar.getInstance(((java.util.TimeZone)v10));
    Object v12 = org.joda.time.YearMonth.fromCalendarFields(((java.util.Calendar)v11));
    Object v13 = 1L;
    Object v14 = ((org.joda.time.chrono.BaseChronology)v9).get(((org.joda.time.ReadablePartial)v12),(((java.lang.Long)v13).longValue()));
    Object v15 = ((org.joda.time.chrono.AssembledChronology)v9).yearOfEra();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.chrono.GJChronology)v5).getZone();
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v6));
    Object v8 = 3;
    Object v9 = 46;
    Object v10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 1L;
    Object v12 = 1;
    Object v13 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v10),(((java.lang.Long)v11).longValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.chrono.GJChronology)v13).getZone();
    Object v15 = ((org.joda.time.chrono.GJChronology)v7).withZone(((org.joda.time.DateTimeZone)v14));
    Object v16 = ((org.joda.time.chrono.AssembledChronology)v15).era();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.chrono.GJChronology)v5).getZone();
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v6));
    Object v8 = ((org.joda.time.chrono.GJChronology)v7).getZone();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.Instant.now();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.chrono.GJChronology)v5).getZone();
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v6));
    Object v8 = 3;
    Object v9 = 46;
    Object v10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 1L;
    Object v12 = 1;
    Object v13 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v10),(((java.lang.Long)v11).longValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.chrono.GJChronology)v13).getZone();
    Object v15 = ((org.joda.time.chrono.GJChronology)v7).withZone(((org.joda.time.DateTimeZone)v14));
    Object v16 = ((org.joda.time.chrono.GJChronology)v15).getMinimumDaysInFirstWeek();
    org.junit.Assert.assertEquals((Object)(4), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = org.joda.time.Instant.now();
    Object v11 = ((org.joda.time.chrono.GJChronology)v9).equals(((java.lang.Object)v10));
    Object v12 = ((org.joda.time.chrono.GJChronology)v9).getZone();
    Object v13 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v12));
    Object v14 = ((org.joda.time.chrono.GJChronology)v13).hashCode();
    org.junit.Assert.assertEquals((Object)(-1984173680), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.Instant.now();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1L;
    Object v10 = 1;
    Object v11 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v8),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.joda.time.chrono.GJChronology)v11).getZone();
    Object v13 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v12));
    Object v14 = ((org.joda.time.chrono.GJChronology)v13).getZone();
    Object v15 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = org.joda.time.Instant.now();
    Object v11 = ((org.joda.time.chrono.GJChronology)v9).equals(((java.lang.Object)v10));
    Object v12 = ((org.joda.time.chrono.GJChronology)v9).getZone();
    Object v13 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v12));
    Object v14 = 1L;
    Object v15 = org.joda.time.Duration.standardHours((((java.lang.Long)v14).longValue()));
    Object v16 = org.joda.time.Instant.now();
    Object v17 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v15),((org.joda.time.ReadableInstant)v16));
    Object v18 = 44L;
    Object v19 = -56L;
    Object v20 = ((org.joda.time.chrono.BaseChronology)v13).get(((org.joda.time.ReadablePeriod)v17),(((java.lang.Long)v18).longValue()),(((java.lang.Long)v19).longValue()));
    Object v21 = ((org.joda.time.chrono.AssembledChronology)v13).eras();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.chrono.GJChronology)v5).getZone();
    Object v7 = org.joda.time.Instant.now();
    Object v8 = 4;
    Object v9 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v6),((org.joda.time.ReadableInstant)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.chrono.AssembledChronology)v9).years();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.chrono.GJChronology)v5).getZone();
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v6));
    Object v8 = 3;
    Object v9 = 46;
    Object v10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = 1L;
    Object v12 = 1;
    Object v13 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v10),(((java.lang.Long)v11).longValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.chrono.GJChronology)v13).getZone();
    Object v15 = ((org.joda.time.chrono.GJChronology)v7).withZone(((org.joda.time.DateTimeZone)v14));
    Object v16 = 1L;
    Object v17 = org.joda.time.Duration.standardHours((((java.lang.Long)v16).longValue()));
    Object v18 = org.joda.time.Instant.now();
    Object v19 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v17),((org.joda.time.ReadableInstant)v18));
    Object v20 = 2L;
    Object v21 = -54L;
    Object v22 = ((org.joda.time.chrono.BaseChronology)v15).get(((org.joda.time.ReadablePeriod)v19),(((java.lang.Long)v20).longValue()),(((java.lang.Long)v21).longValue()));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = org.joda.time.Instant.now();
    Object v11 = ((org.joda.time.chrono.GJChronology)v9).equals(((java.lang.Object)v10));
    Object v12 = ((org.joda.time.chrono.GJChronology)v9).getZone();
    Object v13 = org.joda.time.Instant.now();
    Object v14 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v12),((org.joda.time.ReadableInstant)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstance();
    Object v1 = 3;
    Object v2 = 46;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1L;
    Object v5 = 1;
    Object v6 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v3),(((java.lang.Long)v4).longValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 3;
    Object v8 = 46;
    Object v9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.chrono.GJChronology)v6).withZone(((org.joda.time.DateTimeZone)v9));
    Object v11 = org.joda.time.Instant.now();
    Object v12 = ((org.joda.time.chrono.GJChronology)v10).equals(((java.lang.Object)v11));
    Object v13 = ((org.joda.time.chrono.GJChronology)v10).getZone();
    Object v14 = ((org.joda.time.chrono.BaseChronology)v0).withZone(((org.joda.time.DateTimeZone)v13));
    Object v15 = ((org.joda.time.chrono.AssembledChronology)v0).secondOfMinute();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.Instant.now();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.chrono.AssembledChronology.Fields();
    ((org.joda.time.chrono.GJChronology)v5).assemble(((org.joda.time.chrono.AssembledChronology.Fields)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = 3;
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 3;
    Object v7 = 46;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v5).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = 1L;
    Object v11 = org.joda.time.Duration.standardHours((((java.lang.Long)v10).longValue()));
    Object v12 = org.joda.time.Instant.now();
    Object v13 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v11),((org.joda.time.ReadableInstant)v12));
    Object v14 = 0L;
    Object v15 = ((org.joda.time.chrono.BaseChronology)v9).get(((org.joda.time.ReadablePeriod)v13),(((java.lang.Long)v14).longValue()));
    Object v16 = 0L;
    Object v17 = 4;
    Object v18 = 30;
    Object v19 = 16;
    Object v20 = -5;
    Object v21 = ((org.joda.time.chrono.AssembledChronology)v9).getDateTimeMillis((((java.lang.Long)v16).longValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }
}
