package org.joda.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 0L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).isStandardOffset((((java.lang.Long)v1).longValue()));
    Object v3 = 29L;
    Object v4 = java.time.Instant.ofEpochSecond((((java.lang.Long)v3).longValue()));
    Object v5 = java.util.Date.from(((java.time.Instant)v4));
    Object v6 = org.joda.time.LocalDateTime.fromDateFields(((java.util.Date)v5));
    Object v7 = ((org.joda.time.DateTimeZone)v0).isLocalDateTimeGap(((org.joda.time.LocalDateTime)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = -21L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getOffsetFromLocal((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-28800000), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "D";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 0L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).convertUTCToLocal((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-28800000L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = ((org.joda.time.DateTimeZone)v0).isFixed();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 2L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).isStandardOffset((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).previousTransition((((java.lang.Long)v1).longValue()));
    Object v3 = 0L;
    Object v4 = ((org.joda.time.DateTimeZone)v0).getStandardOffset((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(-28800000), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 0L;
    Object v2 = java.util.Locale.getDefault();
    Object v3 = ((org.joda.time.DateTimeZone)v0).getShortName((((java.lang.Long)v1).longValue()),((java.util.Locale)v2));
    org.junit.Assert.assertEquals((Object)("-08:00"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = 10;
    Object v1 = -32;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = -38L;
    Object v2 = true;
    Object v3 = 1L;
    Object v4 = ((org.joda.time.DateTimeZone)v0).convertLocalToUTC((((java.lang.Long)v1).longValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(28799962L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = java.util.Locale.getDefault();
    Object v3 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v2));
    org.junit.Assert.assertEquals((Object)("-08:00"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 0L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).nextTransition((((java.lang.Long)v1).longValue()));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = 1L;
    Object v5 = ((org.joda.time.DateTimeZone)v0).getMillisKeepLocal(((org.joda.time.DateTimeZone)v3),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 2L;
    Object v2 = true;
    Object v3 = ((org.joda.time.DateTimeZone)v0).convertLocalToUTC((((java.lang.Long)v1).longValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(28800002L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 29L;
    Object v2 = java.time.Instant.ofEpochSecond((((java.lang.Long)v1).longValue()));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = org.joda.time.LocalDateTime.fromDateFields(((java.util.Date)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).isLocalDateTimeGap(((org.joda.time.LocalDateTime)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 0L;
    Object v2 = true;
    Object v3 = ((org.joda.time.DateTimeZone)v0).convertLocalToUTC((((java.lang.Long)v1).longValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(28800000L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.getDefault();
    Object v2 = 0L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).nextTransition((((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = 1L;
    Object v6 = ((org.joda.time.DateTimeZone)v1).getMillisKeepLocal(((org.joda.time.DateTimeZone)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.joda.time.DateTimeZone)v0).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 17L;
    Object v2 = java.util.Locale.getDefault();
    Object v3 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v2));
    org.junit.Assert.assertEquals((Object)("-08:00"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 0L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).isStandardOffset((((java.lang.Long)v1).longValue()));
    Object v3 = 0L;
    Object v4 = ((org.joda.time.DateTimeZone)v0).isStandardOffset((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = true;
    Object v3 = ((org.joda.time.DateTimeZone)v0).convertLocalToUTC((((java.lang.Long)v1).longValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0L;
    Object v5 = ((org.joda.time.DateTimeZone)v0).previousTransition((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(-5756400001L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = -21L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getStandardOffset((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-28800000), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = -29L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).previousTransition((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-5756400001L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).previousTransition((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-5756400001L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 5L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).convertUTCToLocal((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-28799995L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 0L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getOffset((((java.lang.Long)v1).longValue()));
    org.joda.time.DateTimeZone.setDefault(((org.joda.time.DateTimeZone)v0));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    org.joda.time.DateTimeZone.setDefault(((org.joda.time.DateTimeZone)v0));
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 4L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getOffset((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-28800000), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getProvider();
    org.joda.time.DateTimeZone.setProvider(((org.joda.time.tz.Provider)v0));
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 1L;
    Object v3 = false;
    Object v4 = -3L;
    Object v5 = ((org.joda.time.DateTimeZone)v1).convertLocalToUTC((((java.lang.Long)v2).longValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(28800001L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = ((org.joda.time.DateTimeZone)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 49L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getNameKey((((java.lang.Long)v2).longValue()));
    Object v4 = 0L;
    Object v5 = ((org.joda.time.DateTimeZone)v1).previousTransition((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(-5756400001L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getOffset((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-28800000), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = 1L;
    Object v5 = false;
    Object v6 = -3L;
    Object v7 = ((org.joda.time.DateTimeZone)v3).convertLocalToUTC((((java.lang.Long)v4).longValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Long)v6).longValue()));
    Object v8 = new org.joda.time.DateMidnight(((java.lang.Object)v7));
    Object v9 = ((org.joda.time.DateTimeZone)v1).getOffset(((org.joda.time.ReadableInstant)v8));
    org.junit.Assert.assertEquals((Object)(-28800000), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getOffset((((java.lang.Long)v2).longValue()));
    Object v4 = ((org.joda.time.DateTimeZone)v1).toTimeZone();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -13;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getProvider();
    Object v1 = ((org.joda.time.tz.Provider)v0).getAvailableIDs();
    org.joda.time.DateTimeZone.setProvider(((org.joda.time.tz.Provider)v0));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = -6L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getNameKey((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)("PST"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getNameProvider();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = "Prefix not followed by field";
    Object v3 = "FielR '";
    Object v4 = ((org.joda.time.tz.NameProvider)v0).getName(((java.util.Locale)v1),((java.lang.String)v2),((java.lang.String)v3));
    org.joda.time.DateTimeZone.setNameProvider(((org.joda.time.tz.NameProvider)v0));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 1L;
    Object v3 = true;
    Object v4 = ((org.joda.time.DateTimeZone)v1).convertLocalToUTC((((java.lang.Long)v2).longValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(28800001L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 26L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getOffset((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-28800000), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "Fied must not be null";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = -13L;
    Object v3 = java.util.Locale.getDefault();
    Object v4 = ((org.joda.time.DateTimeZone)v1).getShortName((((java.lang.Long)v2).longValue()),((java.util.Locale)v3));
    org.junit.Assert.assertEquals((Object)("-08:00"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 100L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getNameKey((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)("PST"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getNameProvider();
    org.joda.time.DateTimeZone.setNameProvider(((org.joda.time.tz.NameProvider)v0));
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 1L;
    Object v3 = true;
    Object v4 = 2L;
    Object v5 = ((org.joda.time.DateTimeZone)v1).convertLocalToUTC((((java.lang.Long)v2).longValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(28800001L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 19L;
    Object v3 = false;
    Object v4 = 0L;
    Object v5 = ((org.joda.time.DateTimeZone)v1).convertLocalToUTC((((java.lang.Long)v2).longValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(28800019L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "The date must no.t be null";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).previousTransition((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-5756400001L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    org.joda.time.DateTimeZone.setDefault(((org.joda.time.DateTimeZone)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = ((org.joda.time.DateTimeZone)v1).getID();
    org.junit.Assert.assertEquals((Object)("America/Los_Angeles"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 3L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).isStandardOffset((((java.lang.Long)v2).longValue()));
    Object v4 = 36L;
    Object v5 = ((org.joda.time.DateTimeZone)v1).nextTransition((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(9972000000L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = 1L;
    Object v5 = ((org.joda.time.DateTimeZone)v1).getMillisKeepLocal(((org.joda.time.DateTimeZone)v3),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = -4L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getOffsetFromLocal((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-28800000), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 22L;
    Object v3 = java.util.Locale.getDefault();
    Object v4 = ((org.joda.time.DateTimeZone)v1).getName((((java.lang.Long)v2).longValue()),((java.util.Locale)v3));
    org.junit.Assert.assertEquals((Object)("-08:00"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 2L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).previousTransition((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-5756400001L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 1L;
    Object v3 = true;
    Object v4 = 1L;
    Object v5 = ((org.joda.time.DateTimeZone)v1).convertLocalToUTC((((java.lang.Long)v2).longValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(28800001L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = -34L;
    Object v3 = java.util.Locale.getDefault();
    Object v4 = ((org.joda.time.DateTimeZone)v1).getName((((java.lang.Long)v2).longValue()),((java.util.Locale)v3));
    org.junit.Assert.assertEquals((Object)("-08:00"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getNameProvider();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = "]";
    Object v3 = "resultingB";
    Object v4 = ((org.joda.time.tz.NameProvider)v0).getShortName(((java.util.Locale)v1),((java.lang.String)v2),((java.lang.String)v3));
    org.joda.time.DateTimeZone.setNameProvider(((org.joda.time.tz.NameProvider)v0));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 46L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).nextTransition((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(9972000000L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = -26L;
    Object v3 = true;
    Object v4 = 2L;
    Object v5 = ((org.joda.time.DateTimeZone)v1).convertLocalToUTC((((java.lang.Long)v2).longValue()),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(28799974L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 29L;
    Object v3 = java.time.Instant.ofEpochSecond((((java.lang.Long)v2).longValue()));
    Object v4 = ((org.joda.time.DateTimeZone)v1).equals(((java.lang.Object)v3));
    org.joda.time.DateTimeZone.setDefault(((org.joda.time.DateTimeZone)v1));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = 1L;
    Object v5 = ((org.joda.time.DateTimeZone)v3).getOffset((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.joda.time.DateTimeZone)v3).toTimeZone();
    Object v7 = ((org.joda.time.DateTimeZone)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 47L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).nextTransition((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(9972000000L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getOffset((((java.lang.Long)v2).longValue()));
    Object v4 = ((org.joda.time.DateTimeZone)v1).toTimeZone();
    Object v5 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 29L;
    Object v3 = java.time.Instant.ofEpochSecond((((java.lang.Long)v2).longValue()));
    Object v4 = java.util.Date.from(((java.time.Instant)v3));
    Object v5 = org.joda.time.LocalDateTime.fromDateFields(((java.util.Date)v4));
    Object v6 = ((org.joda.time.DateTimeZone)v1).isLocalDateTimeGap(((org.joda.time.LocalDateTime)v5));
    Object v7 = -17L;
    Object v8 = ((org.joda.time.DateTimeZone)v1).getName((((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertEquals((Object)("-08:00"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = ((org.joda.time.DateTimeZone)v1).isFixed();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 1L;
    Object v3 = java.util.Locale.getDefault();
    Object v4 = ((org.joda.time.DateTimeZone)v1).getShortName((((java.lang.Long)v2).longValue()),((java.util.Locale)v3));
    org.junit.Assert.assertEquals((Object)("-08:00"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = -9L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).nextTransition((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(9972000000L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 0L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getStandardOffset((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-28800000), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getOffset((((java.lang.Long)v2).longValue()));
    Object v4 = ((org.joda.time.DateTimeZone)v1).toTimeZone();
    Object v5 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v4));
    Object v6 = ((org.joda.time.DateTimeZone)v5).toTimeZone();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 29L;
    Object v3 = java.time.Instant.ofEpochSecond((((java.lang.Long)v2).longValue()));
    Object v4 = java.util.Date.from(((java.time.Instant)v3));
    Object v5 = org.joda.time.LocalDateTime.fromDateFields(((java.util.Date)v4));
    Object v6 = ((org.joda.time.DateTimeZone)v1).isLocalDateTimeGap(((org.joda.time.LocalDateTime)v5));
    Object v7 = 29L;
    Object v8 = java.time.Instant.ofEpochSecond((((java.lang.Long)v7).longValue()));
    Object v9 = java.util.Date.from(((java.time.Instant)v8));
    Object v10 = org.joda.time.LocalDateTime.fromDateFields(((java.util.Date)v9));
    Object v11 = ((org.joda.time.DateTimeZone)v1).isLocalDateTimeGap(((org.joda.time.LocalDateTime)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = -15L;
    Object v3 = java.util.Locale.getDefault();
    Object v4 = ((org.joda.time.DateTimeZone)v1).getShortName((((java.lang.Long)v2).longValue()),((java.util.Locale)v3));
    Object v5 = -26L;
    Object v6 = ((org.joda.time.DateTimeZone)v1).getOffsetFromLocal((((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertEquals((Object)(-28800000), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getProvider();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v2));
    Object v4 = 1L;
    Object v5 = false;
    Object v6 = -3L;
    Object v7 = ((org.joda.time.DateTimeZone)v3).convertLocalToUTC((((java.lang.Long)v4).longValue()),(((java.lang.Boolean)v5).booleanValue()),(((java.lang.Long)v6).longValue()));
    Object v8 = new org.joda.time.DateMidnight(((java.lang.Object)v7));
    Object v9 = ((org.joda.time.DateTimeZone)v1).getOffset(((org.joda.time.ReadableInstant)v8));
    Object v10 = -10L;
    Object v11 = ((org.joda.time.DateTimeZone)v1).convertUTCToLocal((((java.lang.Long)v10).longValue()));
    org.junit.Assert.assertEquals((Object)(-28800010L), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).convertUTCToLocal((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-28799999L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getNameProvider();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 0L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getNameKey((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)("PST"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 0L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).isStandardOffset((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 0L;
    Object v3 = true;
    Object v4 = ((org.joda.time.DateTimeZone)v1).convertLocalToUTC((((java.lang.Long)v2).longValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(28800000L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = ((org.joda.time.DateTimeZone)v1).isFixed();
    Object v3 = 23L;
    Object v4 = ((org.joda.time.DateTimeZone)v1).getOffset((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(-28800000), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = ((org.joda.time.DateTimeZone)v1).toTimeZone();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 0L;
    Object v3 = java.util.Locale.getDefault();
    Object v4 = ((org.joda.time.DateTimeZone)v1).getShortName((((java.lang.Long)v2).longValue()),((java.util.Locale)v3));
    org.junit.Assert.assertEquals((Object)("-08:00"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getOffset((((java.lang.Long)v2).longValue()));
    Object v4 = ((org.joda.time.DateTimeZone)v1).toTimeZone();
    Object v5 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v4));
    Object v6 = 0L;
    Object v7 = ((org.joda.time.DateTimeZone)v5).getOffsetFromLocal((((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertEquals((Object)(-28800000), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 59L;
    Object v3 = true;
    Object v4 = ((org.joda.time.DateTimeZone)v1).convertLocalToUTC((((java.lang.Long)v2).longValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(28800059L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 29L;
    Object v3 = java.time.Instant.ofEpochSecond((((java.lang.Long)v2).longValue()));
    Object v4 = java.util.Date.from(((java.time.Instant)v3));
    Object v5 = org.joda.time.LocalDateTime.fromDateFields(((java.util.Date)v4));
    Object v6 = ((org.joda.time.DateTimeZone)v1).isLocalDateTimeGap(((org.joda.time.LocalDateTime)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 30;
    Object v1 = 6;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getAvailableIDs();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = -40L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).previousTransition((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-5756400001L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "\nOffsetMillis: ";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 29L;
    Object v3 = java.time.Instant.ofEpochSecond((((java.lang.Long)v2).longValue()));
    Object v4 = java.util.Date.from(((java.time.Instant)v3));
    Object v5 = org.joda.time.LocalDateTime.fromDateFields(((java.util.Date)v4));
    Object v6 = ((org.joda.time.LocalDateTime)v5).getMillisOfSecond();
    Object v7 = ((org.joda.time.DateTimeZone)v1).isLocalDateTimeGap(((org.joda.time.LocalDateTime)v5));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).isStandardOffset((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 58;
    Object v1 = 14;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getProvider();
    Object v1 = "";
    Object v2 = ((org.joda.time.tz.Provider)v0).getZone(((java.lang.String)v1));
    org.joda.time.DateTimeZone.setProvider(((org.joda.time.tz.Provider)v0));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 58;
    Object v1 = 14;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 29L;
    Object v4 = java.time.Instant.ofEpochSecond((((java.lang.Long)v3).longValue()));
    Object v5 = java.util.Date.from(((java.time.Instant)v4));
    Object v6 = org.joda.time.LocalDateTime.fromDateFields(((java.util.Date)v5));
    Object v7 = ((org.joda.time.DateTimeZone)v2).isLocalDateTimeGap(((org.joda.time.LocalDateTime)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 39L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).previousTransition((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-5756400001L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 58;
    Object v1 = 14;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.DateTimeZone)v2).hashCode();
    Object v4 = 32L;
    Object v5 = java.util.Locale.getDefault();
    Object v6 = ((org.joda.time.DateTimeZone)v2).getName((((java.lang.Long)v4).longValue()),((java.util.Locale)v5));
    org.junit.Assert.assertEquals((Object)("+58:14"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v0));
    Object v2 = 1L;
    Object v3 = java.util.Locale.getDefault();
    Object v4 = ((org.joda.time.DateTimeZone)v1).getShortName((((java.lang.Long)v2).longValue()),((java.util.Locale)v3));
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v5));
    Object v7 = 22L;
    Object v8 = java.util.Locale.getDefault();
    Object v9 = ((org.joda.time.DateTimeZone)v6).getName((((java.lang.Long)v7).longValue()),((java.util.Locale)v8));
    Object v10 = ((org.joda.time.DateTimeZone)v1).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = -13;
    Object v1 = -32;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
