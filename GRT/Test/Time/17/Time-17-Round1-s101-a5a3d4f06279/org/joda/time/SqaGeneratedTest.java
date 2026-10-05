package org.joda.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v7 = org.joda.time.LocalDateTime.now(((org.joda.time.Chronology)v6));
    Object v8 = ((org.joda.time.DateTimeZone)v0).isLocalDateTimeGap(((org.joda.time.LocalDateTime)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 0L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getStandardOffset((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-28800000), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 0L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getShortName((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)("-08:00"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 3L;
    Object v2 = false;
    Object v3 = ((org.joda.time.DateTimeZone)v0).adjustOffset((((java.lang.Long)v1).longValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(3L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 0L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getOffsetFromLocal((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-28800000), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 3L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).isStandardOffset((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = true;
    Object v3 = ((org.joda.time.DateTimeZone)v0).convertLocalToUTC((((java.lang.Long)v1).longValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(28800001L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 0L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).previousTransition((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-5756400001L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = -26L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).isStandardOffset((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = -8L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).convertUTCToLocal((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-28800008L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = ((org.joda.time.DateTimeZone)v0).isFixed();
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = org.joda.time.LocalDateTime.now(((org.joda.time.Chronology)v2));
    Object v4 = 19;
    Object v5 = ((org.joda.time.LocalDateTime)v3).withSecondOfMinute((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DateTimeZone)v0).isLocalDateTimeGap(((org.joda.time.LocalDateTime)v3));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = -46L;
    Object v2 = false;
    Object v3 = 4L;
    Object v4 = ((org.joda.time.DateTimeZone)v0).convertLocalToUTC((((java.lang.Long)v1).longValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Long)v3).longValue()));
    Object v5 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v6 = org.joda.time.LocalDateTime.now(((org.joda.time.Chronology)v5));
    Object v7 = ((org.joda.time.DateTimeZone)v0).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 8L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getShortName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    org.junit.Assert.assertEquals((Object)("-08:00"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = ((org.joda.time.DateTimeZone)v0).isFixed();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 41L;
    Object v4 = true;
    Object v5 = 1L;
    Object v6 = ((org.joda.time.DateTimeZone)v2).convertLocalToUTC((((java.lang.Long)v3).longValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertEquals((Object)(-3659959L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -20L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).getOffsetFromLocal((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(3660000), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.DateTimeZone)v2).toTimeZone();
    Object v4 = ((org.joda.time.DateTimeZone)v2).getID();
    org.junit.Assert.assertEquals((Object)("+01:01"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).getOffset((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(3660000), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "]";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.Chronology)v4));
    Object v6 = ((org.joda.time.DateTimeZone)v2).getOffset(((org.joda.time.ReadableInstant)v5));
    org.junit.Assert.assertEquals((Object)(3660000), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getProvider();
    org.joda.time.DateTimeZone.setProvider(((org.joda.time.tz.Provider)v0));
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.DateTimeZone)v2).isFixed();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -50L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).getNameKey((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getProvider();
    Object v1 = ((org.joda.time.tz.Provider)v0).getAvailableIDs();
    org.joda.time.DateTimeZone.setProvider(((org.joda.time.tz.Provider)v0));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = "Chronology must not /e null";
    Object v5 = "The datetime zone must ";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "Chronology must not /e null";
    Object v8 = "The datetime zone must ";
    Object v9 = new java.util.Locale(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((java.util.Locale)v6).getDisplayScript(((java.util.Locale)v9));
    Object v11 = ((org.joda.time.DateTimeZone)v2).getName((((java.lang.Long)v3).longValue()),((java.util.Locale)v6));
    org.junit.Assert.assertEquals((Object)("+01:01"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = 1L;
    Object v4 = false;
    Object v5 = ((org.joda.time.DateTimeZone)v2).adjustOffset((((java.lang.Long)v3).longValue()),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)(1L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = 0L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).isStandardOffset((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = -5L;
    Object v4 = "Chronology must not /e null";
    Object v5 = "The datetime zone must ";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).toLanguageTag();
    Object v8 = ((org.joda.time.DateTimeZone)v2).getShortName((((java.lang.Long)v3).longValue()),((java.util.Locale)v6));
    org.junit.Assert.assertEquals((Object)("-08:00"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = -8;
    Object v4 = java.time.ZoneOffset.ofTotalSeconds((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.joda.time.DateTimeZone)v2).equals(((java.lang.Object)v4));
    Object v6 = 8L;
    Object v7 = ((org.joda.time.DateTimeZone)v2).getStandardOffset((((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertEquals((Object)(-28800000), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.joda.time.tz.DefaultNameProvider();
    Object v1 = "Chronology must not /e null";
    Object v2 = "The datetime zone must ";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "The calendar must no.t be null";
    Object v5 = "resultng";
    Object v6 = ((org.joda.time.tz.NameProvider)v0).getShortName(((java.util.Locale)v3),((java.lang.String)v4),((java.lang.String)v5));
    org.joda.time.DateTimeZone.setNameProvider(((org.joda.time.tz.NameProvider)v0));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = ((org.joda.time.DateTimeZone)v2).isFixed();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "PeiodFormat.commaspace";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = -16L;
    Object v4 = false;
    Object v5 = 32L;
    Object v6 = ((org.joda.time.DateTimeZone)v2).convertLocalToUTC((((java.lang.Long)v3).longValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertEquals((Object)(28799984L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).getOffsetFromLocal((((java.lang.Long)v3).longValue()));
    Object v5 = 0L;
    Object v6 = "Chronology must not /e null";
    Object v7 = "The datetime zone must ";
    Object v8 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((java.util.Locale)v8).toString();
    Object v10 = ((org.joda.time.DateTimeZone)v2).getShortName((((java.lang.Long)v5).longValue()),((java.util.Locale)v8));
    org.junit.Assert.assertEquals((Object)("+01:01"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = java.util.List.of();
    Object v4 = ((org.joda.time.DateTimeZone)v2).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 34L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).isStandardOffset((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = -50L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).getStandardOffset((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(-28800000), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).convertUTCToLocal((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(3660000L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v4 = org.joda.time.LocalDateTime.now(((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v2).isLocalDateTimeGap(((org.joda.time.LocalDateTime)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = false;
    Object v5 = 2L;
    Object v6 = ((org.joda.time.DateTimeZone)v2).convertLocalToUTC((((java.lang.Long)v3).longValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertEquals((Object)(-3660000L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 2L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).convertUTCToLocal((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(3660002L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.joda.time.tz.DefaultNameProvider();
    org.joda.time.DateTimeZone.setNameProvider(((org.joda.time.tz.NameProvider)v0));
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = 2L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).getOffset((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(-28800000), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -7L;
    Object v4 = true;
    Object v5 = ((org.joda.time.DateTimeZone)v2).convertLocalToUTC((((java.lang.Long)v3).longValue()),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)(-3660007L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = 2L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).getNameKey((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)("PST"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).previousTransition((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = -1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = 0L;
    Object v4 = "Chronology must not /e null";
    Object v5 = "The datetime zone must ";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.joda.time.DateTimeZone)v2).getName((((java.lang.Long)v3).longValue()),((java.util.Locale)v6));
    org.junit.Assert.assertEquals((Object)("-08:00"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = 1L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).nextTransition((((java.lang.Long)v3).longValue()));
    org.joda.time.DateTimeZone.setDefault(((org.joda.time.DateTimeZone)v2));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = ((org.joda.time.DateTimeZone)v2).hashCode();
    org.joda.time.DateTimeZone.setDefault(((org.joda.time.DateTimeZone)v2));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -29L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).nextTransition((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(-29L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    org.joda.time.DateTimeZone.setDefault(((org.joda.time.DateTimeZone)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = 17L;
    Object v4 = "Chronology must not /e null";
    Object v5 = "The datetime zone must ";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.joda.time.DateTimeZone)v2).getShortName((((java.lang.Long)v3).longValue()),((java.util.Locale)v6));
    org.junit.Assert.assertEquals((Object)("-08:00"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = 15L;
    Object v4 = "Chronology must not /e null";
    Object v5 = "The datetime zone must ";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.joda.time.DateTimeZone)v2).getName((((java.lang.Long)v3).longValue()),((java.util.Locale)v6));
    org.junit.Assert.assertEquals((Object)("-08:00"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 1L;
    Object v7 = ((org.joda.time.DateTimeZone)v2).getMillisKeepLocal(((org.joda.time.DateTimeZone)v5),(((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 17L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).convertUTCToLocal((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(3660017L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = ((java.util.TimeZone)v1).clone();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = ((java.util.TimeZone)v1).clone();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v4 = java.time.ZoneId.systemDefault();
    Object v5 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v4));
    Object v6 = ((java.util.TimeZone)v5).clone();
    Object v7 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v5));
    Object v8 = 1L;
    Object v9 = ((org.joda.time.DateTimeZone)v3).getMillisKeepLocal(((org.joda.time.DateTimeZone)v7),(((java.lang.Long)v8).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "UTC";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "UTC";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
    Object v2 = 15L;
    Object v3 = true;
    Object v4 = ((org.joda.time.DateTimeZone)v1).adjustOffset((((java.lang.Long)v2).longValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 1L;
    Object v6 = ((org.joda.time.DateTimeZone)v1).getNameKey((((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertEquals((Object)("UTC"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = 1L;
    Object v4 = false;
    Object v5 = 0L;
    Object v6 = ((org.joda.time.DateTimeZone)v2).convertLocalToUTC((((java.lang.Long)v3).longValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertEquals((Object)(28800001L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "UTC";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).nextTransition((((java.lang.Long)v2).longValue()));
    Object v4 = java.time.ZoneId.systemDefault();
    Object v5 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v4));
    Object v6 = ((java.util.TimeZone)v5).clone();
    Object v7 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v5));
    Object v8 = 1L;
    Object v9 = ((org.joda.time.DateTimeZone)v1).getMillisKeepLocal(((org.joda.time.DateTimeZone)v7),(((java.lang.Long)v8).longValue()));
    org.junit.Assert.assertEquals((Object)(28800001L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = true;
    Object v5 = ((org.joda.time.DateTimeZone)v2).adjustOffset((((java.lang.Long)v3).longValue()),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "UTC";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = 3L;
    Object v4 = false;
    Object v5 = ((org.joda.time.DateTimeZone)v2).adjustOffset((((java.lang.Long)v3).longValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.joda.time.DateTimeZone)v1).equals(((java.lang.Object)v5));
    Object v7 = -22L;
    Object v8 = ((org.joda.time.DateTimeZone)v1).getOffset((((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "UTC";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
    Object v2 = 0L;
    Object v3 = true;
    Object v4 = ((org.joda.time.DateTimeZone)v1).convertLocalToUTC((((java.lang.Long)v2).longValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 55L;
    Object v6 = false;
    Object v7 = ((org.joda.time.DateTimeZone)v1).convertLocalToUTC((((java.lang.Long)v5).longValue()),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)(55L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "UTC";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
    Object v2 = ((org.joda.time.DateTimeZone)v1).isFixed();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "UTC";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
    Object v2 = -7L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getStandardOffset((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "UTC";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
    Object v2 = 9L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).nextTransition((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(9L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "UTC";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
    Object v2 = 5L;
    Object v3 = "Chronology must not /e null";
    Object v4 = "The datetime zone must ";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.DateTimeZone)v1).getShortName((((java.lang.Long)v2).longValue()),((java.util.Locale)v5));
    org.junit.Assert.assertEquals((Object)("+00:00"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = 1L;
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.Chronology)v4));
    Object v6 = ((org.joda.time.DateTimeZone)v2).getOffset(((org.joda.time.ReadableInstant)v5));
    org.junit.Assert.assertEquals((Object)(-28800000), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "UTC";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).isStandardOffset((((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v5 = org.joda.time.LocalDateTime.now(((org.joda.time.Chronology)v4));
    Object v6 = ((org.joda.time.DateTimeZone)v1).isLocalDateTimeGap(((org.joda.time.LocalDateTime)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = ((java.util.TimeZone)v1).clone();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v4 = 0L;
    Object v5 = ((org.joda.time.DateTimeZone)v3).getOffset((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(-28800000), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 2;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 2;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 35L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getOffset((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(7200000), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "UTC";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = org.joda.time.LocalDateTime.now(((org.joda.time.Chronology)v2));
    Object v4 = ((org.joda.time.DateTimeZone)v1).isLocalDateTimeGap(((org.joda.time.LocalDateTime)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "UTC";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
    Object v2 = -14L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).convertUTCToLocal((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-14L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 2;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.joda.time.DateTimeZone)v1).isFixed();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = 1L;
    Object v4 = true;
    Object v5 = ((org.joda.time.DateTimeZone)v2).convertLocalToUTC((((java.lang.Long)v3).longValue()),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)(28800001L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = ((java.util.TimeZone)v1).clone();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v4 = 0L;
    Object v5 = ((org.joda.time.DateTimeZone)v3).getStandardOffset((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(-28800000), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "UTC";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
    Object v2 = 33L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).isStandardOffset((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "UTC";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
    Object v2 = ((org.joda.time.DateTimeZone)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(84356), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getProvider();
    Object v1 = "";
    Object v2 = ((org.joda.time.tz.Provider)v0).getZone(((java.lang.String)v1));
    org.joda.time.DateTimeZone.setProvider(((org.joda.time.tz.Provider)v0));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 2;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v3 = org.joda.time.LocalDateTime.now(((org.joda.time.Chronology)v2));
    Object v4 = ((org.joda.time.DateTimeZone)v1).isLocalDateTimeGap(((org.joda.time.LocalDateTime)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = ((java.util.TimeZone)v1).clone();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v4 = 56L;
    Object v5 = ((org.joda.time.DateTimeZone)v3).previousTransition((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(-5756400001L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "UTC";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
    Object v2 = 0L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).convertUTCToLocal((((java.lang.Long)v2).longValue()));
    Object v4 = ((org.joda.time.DateTimeZone)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(84356), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "UTC";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).nextTransition((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = ((java.util.TimeZone)v1).clone();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    org.joda.time.DateTimeZone.setDefault(((org.joda.time.DateTimeZone)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "UTC";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getStandardOffset((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "UTC";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
    Object v2 = ((org.joda.time.DateTimeZone)v1).toTimeZone();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "UTC";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
    Object v2 = -29L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).isStandardOffset((((java.lang.Long)v2).longValue()));
    Object v4 = 4L;
    Object v5 = false;
    Object v6 = 1L;
    Object v7 = ((org.joda.time.DateTimeZone)v1).convertLocalToUTC((((java.lang.Long)v4).longValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertEquals((Object)(4L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "UTC";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).convertUTCToLocal((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = -23L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).previousTransition((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(-5756400001L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = 0L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).previousTransition((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(-5756400001L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = ((java.util.TimeZone)v1).clone();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v4 = "UTC";
    Object v5 = org.joda.time.DateTimeZone.forID(((java.lang.String)v4));
    Object v6 = 26L;
    Object v7 = ((org.joda.time.DateTimeZone)v3).getMillisKeepLocal(((org.joda.time.DateTimeZone)v5),(((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertEquals((Object)(-28799974L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "UTC";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
    Object v2 = -5L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getNameKey((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)("UTC"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "UTC";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
    Object v2 = -5L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).nextTransition((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-5L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 2;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 1L;
    Object v3 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    Object v4 = new org.joda.time.DateTime((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3));
    Object v5 = ((org.joda.time.ReadableInstant)v4).hashCode();
    Object v6 = ((org.joda.time.DateTimeZone)v1).getOffset(((org.joda.time.ReadableInstant)v4));
    org.junit.Assert.assertEquals((Object)(7200000), v6);
  }
}
