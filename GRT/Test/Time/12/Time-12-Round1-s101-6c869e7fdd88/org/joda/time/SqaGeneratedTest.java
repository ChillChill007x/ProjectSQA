package org.joda.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v3 = -36;
    Object v4 = ((org.joda.time.LocalDateTime)v1).withField(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v3 = ((org.joda.time.LocalDateTime)v1).property(((org.joda.time.DateTimeFieldType)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = ((org.joda.time.LocalDateTime)v1).millisOfSecond();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 12;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusSeconds((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.joda.time.LocalDateTime)v3).toDate();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = 2;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusMonths((((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v9 = 0;
    Object v10 = ((org.joda.time.LocalDateTime)v5).withField(((org.joda.time.DateTimeFieldType)v8),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = ((org.joda.time.LocalDateTime)v5).withMillisOfDay((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.LocalDateTime)v5).era();
    Object v7 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v8 = ((org.joda.time.LocalDateTime)v5).isSupported(((org.joda.time.DateTimeFieldType)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v7 = 0;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.DateTimeFieldType)v6).getField(((org.joda.time.Chronology)v9));
    Object v11 = ((org.joda.time.LocalDateTime)v5).property(((org.joda.time.DateTimeFieldType)v6));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = -15L;
    Object v7 = new org.joda.time.LocalDateTime((((java.lang.Long)v6).longValue()));
    Object v8 = -25;
    Object v9 = ((org.joda.time.LocalDateTime)v7).plusMillis((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.LocalDateTime)v5).withFields(((org.joda.time.ReadablePartial)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = -1;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusSeconds((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = "Clone eror";
    Object v7 = ((org.joda.time.LocalDateTime)v5).toString(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = ((org.joda.time.LocalDateTime)v5).withMillisOfDay((((java.lang.Integer)v6).intValue()));
    Object v8 = 37;
    Object v9 = ((org.joda.time.LocalDateTime)v7).minusSeconds((((java.lang.Integer)v8).intValue()));
    Object v10 = 4;
    Object v11 = ((org.joda.time.LocalDateTime)v7).minusWeeks((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = ((org.joda.time.LocalDateTime)v5).withMillisOfDay((((java.lang.Integer)v6).intValue()));
    Object v8 = 37;
    Object v9 = ((org.joda.time.LocalDateTime)v7).minusSeconds((((java.lang.Integer)v8).intValue()));
    Object v10 = 4;
    Object v11 = ((org.joda.time.LocalDateTime)v7).minusWeeks((((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = ((org.joda.time.LocalDateTime)v11).withDayOfWeek((((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 12;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusSeconds((((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = ((org.joda.time.LocalDateTime)v5).minusMonths((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v8));
    Object v10 = -15L;
    Object v11 = new org.joda.time.LocalDateTime((((java.lang.Long)v10).longValue()));
    Object v12 = -25;
    Object v13 = ((org.joda.time.LocalDateTime)v11).plusMillis((((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = ((org.joda.time.LocalDateTime)v13).minusMillis((((java.lang.Integer)v14).intValue()));
    Object v16 = -15L;
    Object v17 = new org.joda.time.LocalDateTime((((java.lang.Long)v16).longValue()));
    Object v18 = -25;
    Object v19 = ((org.joda.time.LocalDateTime)v17).plusMillis((((java.lang.Integer)v18).intValue()));
    Object v20 = ((org.joda.time.LocalDateTime)v15).withFields(((org.joda.time.ReadablePartial)v19));
    Object v21 = 1L;
    Object v22 = ((org.joda.time.Chronology)v9).set(((org.joda.time.ReadablePartial)v20),(((java.lang.Long)v21).longValue()));
    Object v23 = ((org.joda.time.LocalDateTime)v5).getField((((java.lang.Integer)v6).intValue()),((org.joda.time.Chronology)v9));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = -4;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusHours((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = -4;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusHours((((java.lang.Integer)v6).intValue()));
    Object v8 = -15L;
    Object v9 = new org.joda.time.LocalDateTime((((java.lang.Long)v8).longValue()));
    Object v10 = -25;
    Object v11 = ((org.joda.time.LocalDateTime)v9).plusMillis((((java.lang.Integer)v10).intValue()));
    Object v12 = 12;
    Object v13 = ((org.joda.time.LocalDateTime)v11).minusSeconds((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.base.AbstractPartial)v7).isEqual(((org.joda.time.ReadablePartial)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 12;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusSeconds((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.base.AbstractPartial)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(-123971132), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v1));
    Object v3 = org.joda.time.LocalDateTime.now(((org.joda.time.Chronology)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v1));
    Object v3 = org.joda.time.LocalDateTime.now(((org.joda.time.Chronology)v2));
    Object v4 = 1L;
    Object v5 = 0;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.MutableDateTime((((java.lang.Long)v4).longValue()),((org.joda.time.DateTimeZone)v6));
    Object v8 = ((org.joda.time.ReadableInstant)v7).getZone();
    Object v9 = ((org.joda.time.base.AbstractPartial)v3).toDateTime(((org.joda.time.ReadableInstant)v7));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v1));
    Object v3 = org.joda.time.LocalDateTime.now(((org.joda.time.Chronology)v2));
    Object v4 = ((org.joda.time.base.AbstractPartial)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(-703428959), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 12;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusSeconds((((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v7 = ((org.joda.time.base.AbstractPartial)v5).isSupported(((org.joda.time.DateTimeFieldType)v6));
    Object v8 = org.joda.time.format.ISODateTimeFormat.hour();
    Object v9 = ((org.joda.time.base.AbstractPartial)v5).toString(((org.joda.time.format.DateTimeFormatter)v8));
    org.junit.Assert.assertEquals((Object)("15"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DurationFieldType.years();
    Object v7 = ((org.joda.time.LocalDateTime)v5).isSupported(((org.joda.time.DurationFieldType)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v1));
    Object v3 = org.joda.time.LocalDateTime.now(((org.joda.time.Chronology)v2));
    Object v4 = ((org.joda.time.LocalDateTime)v3).era();
    Object v5 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v6 = ((org.joda.time.LocalDateTime)v3).get(((org.joda.time.DateTimeFieldType)v5));
    org.junit.Assert.assertEquals((Object)(5), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = 1L;
    Object v7 = -5L;
    Object v8 = new org.joda.time.Duration((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()));
    Object v9 = 13;
    Object v10 = ((org.joda.time.LocalDateTime)v5).withDurationAdded(((org.joda.time.ReadableDuration)v8),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = -15L;
    Object v7 = new org.joda.time.LocalDateTime((((java.lang.Long)v6).longValue()));
    Object v8 = -25;
    Object v9 = ((org.joda.time.LocalDateTime)v7).plusMillis((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.LocalDateTime)v5).withFields(((org.joda.time.ReadablePartial)v9));
    Object v11 = ((org.joda.time.base.AbstractPartial)v10).hashCode();
    org.junit.Assert.assertEquals((Object)(-123695132), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = 28;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusYears((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = -4;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusHours((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.LocalDateTime)v7).hourOfDay();
    Object v9 = -42;
    Object v10 = ((org.joda.time.LocalDateTime)v7).plusWeeks((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = -19;
    Object v7 = 10;
    Object v8 = -5;
    Object v9 = ((org.joda.time.LocalDateTime)v5).withDate((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = 1L;
    Object v7 = -5L;
    Object v8 = new org.joda.time.Duration((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()));
    Object v9 = 1;
    Object v10 = ((org.joda.time.LocalDateTime)v5).withDurationAdded(((org.joda.time.ReadableDuration)v8),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "' is not supported";
    Object v1 = org.joda.time.LocalDateTime.parse(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = java.util.Calendar.getInstance();
    Object v1 = org.joda.time.LocalDateTime.fromCalendarFields(((java.util.Calendar)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.joda.time.LocalDateTime)v3).toDate();
    Object v5 = org.joda.time.LocalDateTime.fromDateFields(((java.util.Date)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = -4;
    Object v7 = ((org.joda.time.LocalDateTime)v5).minusHours((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.LocalDateTime)v5).getSecondOfMinute();
    org.junit.Assert.assertEquals((Object)(59), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = 7;
    Object v7 = ((org.joda.time.LocalDateTime)v5).withMinuteOfHour((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = 28;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusYears((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.LocalDateTime)v7).getYear();
    Object v9 = -37;
    Object v10 = ((org.joda.time.LocalDateTime)v7).plusWeeks((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.base.AbstractPartial)v5).getFieldTypes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = -4;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusHours((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.LocalDateTime)v7).hourOfDay();
    Object v9 = -42;
    Object v10 = ((org.joda.time.LocalDateTime)v7).plusWeeks((((java.lang.Integer)v9).intValue()));
    Object v11 = -15L;
    Object v12 = new org.joda.time.LocalDateTime((((java.lang.Long)v11).longValue()));
    Object v13 = -25;
    Object v14 = ((org.joda.time.LocalDateTime)v12).plusMillis((((java.lang.Integer)v13).intValue()));
    Object v15 = 0;
    Object v16 = ((org.joda.time.LocalDateTime)v14).minusMillis((((java.lang.Integer)v15).intValue()));
    Object v17 = -4;
    Object v18 = ((org.joda.time.LocalDateTime)v16).plusHours((((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.joda.time.base.AbstractPartial)v10).isEqual(((org.joda.time.ReadablePartial)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = ((org.joda.time.LocalDateTime)v5).withMillisOfDay((((java.lang.Integer)v6).intValue()));
    Object v8 = 1L;
    Object v9 = -5L;
    Object v10 = new org.joda.time.Duration((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
    Object v11 = -15L;
    Object v12 = new org.joda.time.LocalDateTime((((java.lang.Long)v11).longValue()));
    Object v13 = -25;
    Object v14 = ((org.joda.time.LocalDateTime)v12).plusMillis((((java.lang.Integer)v13).intValue()));
    Object v15 = 0;
    Object v16 = ((org.joda.time.LocalDateTime)v14).plusMinutes((((java.lang.Integer)v15).intValue()));
    Object v17 = 1;
    Object v18 = 0;
    Object v19 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v18).intValue()));
    Object v20 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v19));
    Object v21 = -15L;
    Object v22 = new org.joda.time.LocalDateTime((((java.lang.Long)v21).longValue()));
    Object v23 = -25;
    Object v24 = ((org.joda.time.LocalDateTime)v22).plusMillis((((java.lang.Integer)v23).intValue()));
    Object v25 = 0;
    Object v26 = ((org.joda.time.LocalDateTime)v24).minusMillis((((java.lang.Integer)v25).intValue()));
    Object v27 = -15L;
    Object v28 = new org.joda.time.LocalDateTime((((java.lang.Long)v27).longValue()));
    Object v29 = -25;
    Object v30 = ((org.joda.time.LocalDateTime)v28).plusMillis((((java.lang.Integer)v29).intValue()));
    Object v31 = ((org.joda.time.LocalDateTime)v26).withFields(((org.joda.time.ReadablePartial)v30));
    Object v32 = 1L;
    Object v33 = ((org.joda.time.Chronology)v20).set(((org.joda.time.ReadablePartial)v31),(((java.lang.Long)v32).longValue()));
    Object v34 = ((org.joda.time.LocalDateTime)v16).getField((((java.lang.Integer)v17).intValue()),((org.joda.time.Chronology)v20));
    Object v35 = ((org.joda.time.ReadableDuration)v10).equals(((java.lang.Object)v34));
    Object v36 = ((org.joda.time.LocalDateTime)v7).minus(((org.joda.time.ReadableDuration)v10));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = 28;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusYears((((java.lang.Integer)v6).intValue()));
    Object v8 = -15L;
    Object v9 = new org.joda.time.LocalDateTime((((java.lang.Long)v8).longValue()));
    Object v10 = -25;
    Object v11 = ((org.joda.time.LocalDateTime)v9).plusMillis((((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = ((org.joda.time.LocalDateTime)v11).minusMillis((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.base.AbstractPartial)v7).isAfter(((org.joda.time.ReadablePartial)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v1));
    Object v3 = org.joda.time.LocalDateTime.now(((org.joda.time.Chronology)v2));
    Object v4 = ((org.joda.time.LocalDateTime)v3).getHourOfDay();
    org.junit.Assert.assertEquals((Object)(12), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = -4;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusHours((((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.format.ISODateTimeFormat.hour();
    Object v9 = ((org.joda.time.base.AbstractPartial)v7).toString(((org.joda.time.format.DateTimeFormatter)v8));
    org.junit.Assert.assertEquals((Object)("11"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = java.util.Calendar.getInstance();
    Object v1 = org.joda.time.LocalDateTime.fromCalendarFields(((java.util.Calendar)v0));
    Object v2 = -10;
    Object v3 = ((org.joda.time.LocalDateTime)v1).minusMillis((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = -4;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusHours((((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = ((org.joda.time.LocalDateTime)v7).minusHours((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.base.AbstractPartial)v5).getValues();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = java.util.Calendar.getInstance();
    Object v1 = org.joda.time.LocalDateTime.fromCalendarFields(((java.util.Calendar)v0));
    Object v2 = -10;
    Object v3 = ((org.joda.time.LocalDateTime)v1).minusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = ":TC";
    Object v5 = java.util.Locale.Category.DISPLAY;
    Object v6 = java.util.Locale.getDefault(((java.util.Locale.Category)v5));
    Object v7 = ((org.joda.time.LocalDateTime)v3).toString(((java.lang.String)v4),((java.util.Locale)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = java.util.Calendar.getInstance();
    Object v1 = org.joda.time.LocalDateTime.fromCalendarFields(((java.util.Calendar)v0));
    Object v2 = -10;
    Object v3 = ((org.joda.time.LocalDateTime)v1).minusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.joda.time.LocalDateTime)v3).getDayOfWeek();
    Object v5 = 60;
    Object v6 = 0;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v7));
    Object v9 = ((org.joda.time.LocalDateTime)v3).getField((((java.lang.Integer)v5).intValue()),((org.joda.time.Chronology)v8));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = java.util.Calendar.getInstance();
    Object v1 = org.joda.time.LocalDateTime.fromCalendarFields(((java.util.Calendar)v0));
    Object v2 = -6;
    Object v3 = ((org.joda.time.LocalDateTime)v1).minusYears((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v5 = ((org.joda.time.LocalDateTime)v3).get(((org.joda.time.DateTimeFieldType)v4));
    org.junit.Assert.assertEquals((Object)(31), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = 28;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusYears((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.LocalDateTime)v7).getYear();
    Object v9 = -37;
    Object v10 = ((org.joda.time.LocalDateTime)v7).plusWeeks((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.joda.time.LocalDateTime)v10).toLocalDate();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 12;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusSeconds((((java.lang.Integer)v4).intValue()));
    Object v6 = -24;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusMinutes((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = 28;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusYears((((java.lang.Integer)v6).intValue()));
    Object v8 = -17;
    Object v9 = ((org.joda.time.base.AbstractPartial)v7).getFieldType((((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = -71;
    Object v7 = ((org.joda.time.LocalDateTime)v5).getValue((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = 28;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusYears((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.LocalDateTime)v7).getDayOfYear();
    org.junit.Assert.assertEquals((Object)(365), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.base.AbstractPartial)v5).getFieldTypes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v1));
    Object v3 = org.joda.time.LocalDateTime.now(((org.joda.time.Chronology)v2));
    Object v4 = 1;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusDays((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = java.util.Calendar.getInstance();
    Object v7 = org.joda.time.LocalDateTime.fromCalendarFields(((java.util.Calendar)v6));
    Object v8 = -6;
    Object v9 = ((org.joda.time.LocalDateTime)v7).minusYears((((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    Object v11 = ((org.joda.time.ReadablePartial)v9).getField((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.joda.time.LocalDateTime)v5).withFields(((org.joda.time.ReadablePartial)v9));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = 28;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusYears((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.LocalDateTime)v7).getYear();
    Object v9 = -37;
    Object v10 = ((org.joda.time.LocalDateTime)v7).plusWeeks((((java.lang.Integer)v9).intValue()));
    Object v11 = 1L;
    Object v12 = -5L;
    Object v13 = new org.joda.time.Duration((((java.lang.Long)v11).longValue()),(((java.lang.Long)v12).longValue()));
    Object v14 = 2;
    Object v15 = ((org.joda.time.LocalDateTime)v10).withDurationAdded(((org.joda.time.ReadableDuration)v13),(((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.util.Calendar.getInstance();
    Object v1 = org.joda.time.LocalDateTime.fromCalendarFields(((java.util.Calendar)v0));
    Object v2 = -6;
    Object v3 = ((org.joda.time.LocalDateTime)v1).minusYears((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusYears((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 12;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusSeconds((((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = ((org.joda.time.LocalDateTime)v5).minusMonths((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.base.AbstractPartial)v7).getFields();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v1));
    Object v3 = org.joda.time.LocalDateTime.now(((org.joda.time.Chronology)v2));
    Object v4 = 1;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusDays((((java.lang.Integer)v4).intValue()));
    Object v6 = -31;
    Object v7 = ((org.joda.time.LocalDateTime)v5).minusDays((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = -4;
    Object v7 = ((org.joda.time.LocalDateTime)v5).minusHours((((java.lang.Integer)v6).intValue()));
    Object v8 = -21;
    Object v9 = ((org.joda.time.LocalDateTime)v7).minusMinutes((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = -4;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusHours((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.LocalDateTime)v7).hourOfDay();
    Object v9 = -42;
    Object v10 = ((org.joda.time.LocalDateTime)v7).plusWeeks((((java.lang.Integer)v9).intValue()));
    Object v11 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v12 = ((org.joda.time.LocalDateTime)v10).property(((org.joda.time.DateTimeFieldType)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = -15L;
    Object v5 = new org.joda.time.LocalDateTime((((java.lang.Long)v4).longValue()));
    Object v6 = -25;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusMillis((((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = ((org.joda.time.LocalDateTime)v7).plusMinutes((((java.lang.Integer)v8).intValue()));
    Object v10 = 28;
    Object v11 = ((org.joda.time.LocalDateTime)v9).plusYears((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.joda.time.LocalDateTime)v11).getYear();
    Object v13 = -37;
    Object v14 = ((org.joda.time.LocalDateTime)v11).plusWeeks((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.joda.time.base.AbstractPartial)v3).isBefore(((org.joda.time.ReadablePartial)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = 32;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusMonths((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = 28;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusYears((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.LocalDateTime)v7).era();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v1));
    Object v3 = org.joda.time.LocalDateTime.now(((org.joda.time.Chronology)v2));
    Object v4 = 1;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusDays((((java.lang.Integer)v4).intValue()));
    Object v6 = -31;
    Object v7 = ((org.joda.time.LocalDateTime)v5).minusDays((((java.lang.Integer)v6).intValue()));
    Object v8 = -7;
    Object v9 = ((org.joda.time.LocalDateTime)v7).minusDays((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 12;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusSeconds((((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = ((org.joda.time.LocalDateTime)v5).minusMonths((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.LocalDateTime)v7).yearOfEra();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v1));
    Object v3 = org.joda.time.LocalDateTime.now(((org.joda.time.Chronology)v2));
    Object v4 = 1;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusDays((((java.lang.Integer)v4).intValue()));
    Object v6 = 17;
    Object v7 = ((org.joda.time.LocalDateTime)v5).minusSeconds((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = -4;
    Object v7 = ((org.joda.time.LocalDateTime)v5).minusHours((((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v9 = ((org.joda.time.LocalDateTime)v7).isSupported(((org.joda.time.DateTimeFieldType)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v5 = ((org.joda.time.LocalDateTime)v3).isSupported(((org.joda.time.DateTimeFieldType)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = -4;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusHours((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.LocalDateTime)v7).hourOfDay();
    Object v9 = -42;
    Object v10 = ((org.joda.time.LocalDateTime)v7).plusWeeks((((java.lang.Integer)v9).intValue()));
    Object v11 = -15L;
    Object v12 = new org.joda.time.LocalDateTime((((java.lang.Long)v11).longValue()));
    Object v13 = -25;
    Object v14 = ((org.joda.time.LocalDateTime)v12).plusMillis((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.joda.time.LocalDateTime)v14).toDate();
    Object v16 = org.joda.time.LocalDateTime.fromDateFields(((java.util.Date)v15));
    Object v17 = ((org.joda.time.ReadablePartial)v16).getChronology();
    Object v18 = ((org.joda.time.base.AbstractPartial)v10).isBefore(((org.joda.time.ReadablePartial)v16));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = java.util.Calendar.getInstance();
    Object v1 = org.joda.time.LocalDateTime.fromCalendarFields(((java.util.Calendar)v0));
    Object v2 = ((org.joda.time.base.AbstractPartial)v1).getFields();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 2L;
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 2L;
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()),((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.LocalDateTime)v3).getDayOfYear();
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v1));
    Object v3 = org.joda.time.LocalDateTime.now(((org.joda.time.Chronology)v2));
    Object v4 = ((org.joda.time.base.AbstractPartial)v3).hashCode();
    Object v5 = -15L;
    Object v6 = new org.joda.time.LocalDateTime((((java.lang.Long)v5).longValue()));
    Object v7 = -25;
    Object v8 = ((org.joda.time.LocalDateTime)v6).plusMillis((((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v10 = ((org.joda.time.ReadablePartial)v8).get(((org.joda.time.DateTimeFieldType)v9));
    Object v11 = ((org.joda.time.base.AbstractPartial)v3).isEqual(((org.joda.time.ReadablePartial)v8));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = 32;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusMonths((((java.lang.Integer)v6).intValue()));
    Object v8 = -23;
    Object v9 = ((org.joda.time.LocalDateTime)v7).minusMinutes((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = "The date must not be null";
    Object v7 = java.util.Locale.Category.DISPLAY;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((java.util.Locale)v8).hashCode();
    Object v10 = ((org.joda.time.LocalDateTime)v5).toString(((java.lang.String)v6),((java.util.Locale)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = -15L;
    Object v7 = new org.joda.time.LocalDateTime((((java.lang.Long)v6).longValue()));
    Object v8 = -25;
    Object v9 = ((org.joda.time.LocalDateTime)v7).plusMillis((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.LocalDateTime)v5).withFields(((org.joda.time.ReadablePartial)v9));
    Object v11 = ((org.joda.time.base.AbstractPartial)v10).getValues();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = -4;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusHours((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.LocalDateTime)v7).hourOfDay();
    Object v9 = -42;
    Object v10 = ((org.joda.time.LocalDateTime)v7).plusWeeks((((java.lang.Integer)v9).intValue()));
    Object v11 = 3;
    Object v12 = ((org.joda.time.LocalDateTime)v10).minusSeconds((((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = -15L;
    Object v7 = new org.joda.time.LocalDateTime((((java.lang.Long)v6).longValue()));
    Object v8 = -25;
    Object v9 = ((org.joda.time.LocalDateTime)v7).plusMillis((((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = ((org.joda.time.LocalDateTime)v9).plusMinutes((((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = ((org.joda.time.ReadablePartial)v11).getField((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.LocalDateTime)v5).compareTo(((org.joda.time.ReadablePartial)v11));
    org.junit.Assert.assertEquals((Object)(1), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.joda.time.LocalDateTime)v3).toDate();
    Object v5 = org.joda.time.LocalDateTime.fromDateFields(((java.util.Date)v4));
    Object v6 = ((org.joda.time.LocalDateTime)v5).getMillisOfSecond();
    Object v7 = -15L;
    Object v8 = new org.joda.time.LocalDateTime((((java.lang.Long)v7).longValue()));
    Object v9 = -25;
    Object v10 = ((org.joda.time.LocalDateTime)v8).plusMillis((((java.lang.Integer)v9).intValue()));
    Object v11 = 0;
    Object v12 = ((org.joda.time.LocalDateTime)v10).plusMinutes((((java.lang.Integer)v11).intValue()));
    Object v13 = 28;
    Object v14 = ((org.joda.time.LocalDateTime)v12).plusYears((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.joda.time.LocalDateTime)v14).getYear();
    Object v16 = -37;
    Object v17 = ((org.joda.time.LocalDateTime)v14).plusWeeks((((java.lang.Integer)v16).intValue()));
    Object v18 = 1L;
    Object v19 = -5L;
    Object v20 = new org.joda.time.Duration((((java.lang.Long)v18).longValue()),(((java.lang.Long)v19).longValue()));
    Object v21 = 2;
    Object v22 = ((org.joda.time.LocalDateTime)v17).withDurationAdded(((org.joda.time.ReadableDuration)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((org.joda.time.LocalDateTime)v5).withFields(((org.joda.time.ReadablePartial)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = 28;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusYears((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.LocalDateTime)v7).getYear();
    Object v9 = -37;
    Object v10 = ((org.joda.time.LocalDateTime)v7).plusWeeks((((java.lang.Integer)v9).intValue()));
    Object v11 = org.joda.time.DurationFieldType.years();
    Object v12 = 0;
    Object v13 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v12).intValue()));
    Object v14 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v13));
    Object v15 = ((org.joda.time.DurationFieldType)v11).isSupported(((org.joda.time.Chronology)v14));
    Object v16 = ((org.joda.time.LocalDateTime)v10).isSupported(((org.joda.time.DurationFieldType)v11));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v7 = ((org.joda.time.base.AbstractPartial)v5).indexOf(((org.joda.time.DateTimeFieldType)v6));
    org.junit.Assert.assertEquals((Object)(2), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 12;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusSeconds((((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTimeFieldType.dayOfMonth();
    Object v7 = ((org.joda.time.LocalDateTime)v5).isSupported(((org.joda.time.DateTimeFieldType)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 12;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusSeconds((((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = ((org.joda.time.LocalDateTime)v5).minusMonths((((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.DurationFieldType.years();
    Object v9 = ((org.joda.time.LocalDateTime)v7).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = java.util.Calendar.getInstance();
    Object v1 = org.joda.time.LocalDateTime.fromCalendarFields(((java.util.Calendar)v0));
    Object v2 = -6;
    Object v3 = ((org.joda.time.LocalDateTime)v1).minusYears((((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.DurationFieldType.years();
    Object v5 = 1;
    Object v6 = ((org.joda.time.LocalDateTime)v3).withFieldAdded(((org.joda.time.DurationFieldType)v4),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.chrono.GregorianChronology.getInstance(((org.joda.time.DateTimeZone)v1));
    Object v3 = ((org.joda.time.Chronology)v2).weekyear();
    Object v4 = org.joda.time.LocalDateTime.now(((org.joda.time.Chronology)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = -4;
    Object v7 = ((org.joda.time.LocalDateTime)v5).minusHours((((java.lang.Integer)v6).intValue()));
    Object v8 = -21;
    Object v9 = ((org.joda.time.LocalDateTime)v7).minusMinutes((((java.lang.Integer)v8).intValue()));
    Object v10 = 4;
    Object v11 = ((org.joda.time.LocalDateTime)v9).plusDays((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusHours((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = 1L;
    Object v7 = -5L;
    Object v8 = new org.joda.time.Duration((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()));
    Object v9 = 1;
    Object v10 = ((org.joda.time.LocalDateTime)v5).withDurationAdded(((org.joda.time.ReadableDuration)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.joda.time.LocalDateTime)v10).dayOfMonth();
    Object v12 = -16;
    Object v13 = ((org.joda.time.LocalDateTime)v10).minusHours((((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.util.Calendar.getInstance();
    Object v1 = org.joda.time.LocalDateTime.fromCalendarFields(((java.util.Calendar)v0));
    Object v2 = 15;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusDays((((java.lang.Integer)v2).intValue()));
    Object v4 = -30;
    Object v5 = ((org.joda.time.LocalDateTime)v1).plusSeconds((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.joda.time.LocalDateTime)v3).plusMinutes((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.LocalDateTime)v5).getMonthOfYear();
    org.junit.Assert.assertEquals((Object)(12), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = -15L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = -25;
    Object v3 = ((org.joda.time.LocalDateTime)v1).plusMillis((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((org.joda.time.LocalDateTime)v3).minusMillis((((java.lang.Integer)v4).intValue()));
    Object v6 = -4;
    Object v7 = ((org.joda.time.LocalDateTime)v5).plusHours((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.LocalDateTime)v7).hourOfDay();
    Object v9 = -42;
    Object v10 = ((org.joda.time.LocalDateTime)v7).plusWeeks((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.joda.time.LocalDateTime)v10).getLocalMillis();
    org.junit.Assert.assertEquals((Object)(-25444800040L), v11);
  }
}
