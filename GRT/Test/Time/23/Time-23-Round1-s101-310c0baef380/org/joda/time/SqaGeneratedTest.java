package org.joda.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Field must n/t be null";
    Object v3 = "CE";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = -6L;
    Object v7 = new org.joda.time.LocalDateTime((((java.lang.Long)v6).longValue()));
    Object v8 = ((org.joda.time.DateTimeZone)v0).isLocalDateTimeGap(((org.joda.time.LocalDateTime)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 2L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).isStandardOffset((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 0L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getOffsetFromLocal((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-28800000), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = -10L;
    Object v2 = true;
    Object v3 = -6L;
    Object v4 = ((org.joda.time.DateTimeZone)v0).convertLocalToUTC((((java.lang.Long)v1).longValue()),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(28799990L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getNameProvider();
    org.joda.time.DateTimeZone.setNameProvider(((org.joda.time.tz.NameProvider)v0));
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    org.joda.time.DateTimeZone.setDefault(((org.joda.time.DateTimeZone)v0));
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 34L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getShortName((((java.lang.Long)v1).longValue()));
    Object v3 = 0L;
    Object v4 = ((org.joda.time.DateTimeZone)v0).previousTransition((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(-5756400001L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = -38L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).convertUTCToLocal((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-28800038L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = -44L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).previousTransition((((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-5756400001L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = java.util.List.of();
    Object v2 = ((org.joda.time.DateTimeZone)v0).equals(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 49;
    Object v1 = 25;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 49;
    Object v1 = 25;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).isStandardOffset((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.joda.time.DateTimeZone)v2).getID();
    org.junit.Assert.assertEquals((Object)("+49:25"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 49;
    Object v1 = 25;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 66L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).nextTransition((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(66L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 49;
    Object v1 = 25;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -5L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).getNameKey((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 49;
    Object v1 = 25;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -36L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).getNameKey((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 49;
    Object v1 = 25;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.DateTimeZone)v2).isFixed();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 49;
    Object v1 = 25;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -23L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).getOffset((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(177900000), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 49;
    Object v1 = 25;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = 1L;
    Object v5 = true;
    Object v6 = ((org.joda.time.DateTimeZone)v3).convertLocalToUTC((((java.lang.Long)v4).longValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 0L;
    Object v8 = ((org.joda.time.DateTimeZone)v2).getMillisKeepLocal(((org.joda.time.DateTimeZone)v3),(((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertEquals((Object)(206700000L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 49;
    Object v1 = 25;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).convertUTCToLocal((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(177900001L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = 0L;
    Object v3 = ((java.util.TimeZone)v1).getOffset((((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = 0L;
    Object v3 = ((java.util.TimeZone)v1).getOffset((((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v5 = 0L;
    Object v6 = false;
    Object v7 = ((org.joda.time.DateTimeZone)v4).adjustOffset((((java.lang.Long)v5).longValue()),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)(0L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "P";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 8L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).convertUTCToLocal((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(3660008L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getNameProvider();
    Object v1 = "Field must n/t be null";
    Object v2 = "CE";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "null";
    Object v5 = "Invalid index: ";
    Object v6 = ((org.joda.time.tz.NameProvider)v0).getName(((java.util.Locale)v3),((java.lang.String)v4),((java.lang.String)v5));
    org.joda.time.DateTimeZone.setNameProvider(((org.joda.time.tz.NameProvider)v0));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = 6L;
    Object v4 = true;
    Object v5 = ((org.joda.time.DateTimeZone)v2).convertLocalToUTC((((java.lang.Long)v3).longValue()),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)(6L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = false;
    Object v5 = ((org.joda.time.DateTimeZone)v2).convertLocalToUTC((((java.lang.Long)v3).longValue()),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)(-3659999L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = -14L;
    Object v4 = "Field must n/t be null";
    Object v5 = "CE";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.joda.time.DateTimeZone)v2).getShortName((((java.lang.Long)v3).longValue()),((java.util.Locale)v6));
    org.junit.Assert.assertEquals((Object)("+00:00"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.DateTimeZone)v2).toTimeZone();
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 26L;
    Object v8 = ((org.joda.time.DateTimeZone)v2).getMillisKeepLocal(((org.joda.time.DateTimeZone)v6),(((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertEquals((Object)(26L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = 0L;
    Object v3 = ((java.util.TimeZone)v1).getOffset((((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v5 = 1L;
    Object v6 = false;
    Object v7 = ((org.joda.time.DateTimeZone)v4).adjustOffset((((java.lang.Long)v5).longValue()),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)(1L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.Instant();
    Object v4 = ((org.joda.time.ReadableInstant)v3).toString();
    Object v5 = ((org.joda.time.DateTimeZone)v2).getOffset(((org.joda.time.ReadableInstant)v3));
    org.junit.Assert.assertEquals((Object)(3660000), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = 0L;
    Object v3 = ((java.util.TimeZone)v1).getOffset((((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v5 = ((org.joda.time.DateTimeZone)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(84356), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = 0L;
    Object v3 = ((java.util.TimeZone)v1).getOffset((((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v5 = -21L;
    Object v6 = ((org.joda.time.DateTimeZone)v4).getStandardOffset((((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 9223372036854775807L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).getOffsetFromLocal((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(3660000), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = 0L;
    Object v3 = ((java.util.TimeZone)v1).getOffset((((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v5 = 9L;
    Object v6 = ((org.joda.time.DateTimeZone)v4).previousTransition((((java.lang.Long)v5).longValue()));
    Object v7 = 4L;
    Object v8 = ((org.joda.time.DateTimeZone)v4).getStandardOffset((((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getNameProvider();
    Object v1 = "Field must n/t be null";
    Object v2 = "CE";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "reulting";
    Object v5 = "PeriodFormat.com";
    Object v6 = ((org.joda.time.tz.NameProvider)v0).getName(((java.util.Locale)v3),((java.lang.String)v4),((java.lang.String)v5));
    org.joda.time.DateTimeZone.setNameProvider(((org.joda.time.tz.NameProvider)v0));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "Field '";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = true;
    Object v5 = ((org.joda.time.DateTimeZone)v2).convertLocalToUTC((((java.lang.Long)v3).longValue()),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)(-3659999L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = ((org.joda.time.DateTimeZone)v2).hashCode();
    Object v4 = -6L;
    Object v5 = new org.joda.time.LocalDateTime((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.joda.time.DateTimeZone)v2).isLocalDateTimeGap(((org.joda.time.LocalDateTime)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getProvider();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = 0L;
    Object v4 = false;
    Object v5 = -1L;
    Object v6 = ((org.joda.time.DateTimeZone)v2).convertLocalToUTC((((java.lang.Long)v3).longValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.DateTimeZone)v2).hashCode();
    Object v4 = -13L;
    Object v5 = ((org.joda.time.DateTimeZone)v2).getName((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)("+01:01"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = 0L;
    Object v3 = ((java.util.TimeZone)v1).getOffset((((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v5 = 0L;
    Object v6 = "Field must n/t be null";
    Object v7 = "CE";
    Object v8 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.joda.time.DateTimeZone)v4).getShortName((((java.lang.Long)v5).longValue()),((java.util.Locale)v8));
    org.junit.Assert.assertEquals((Object)("+00:00"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = 0L;
    Object v3 = ((java.util.TimeZone)v1).getOffset((((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v5 = -38L;
    Object v6 = ((org.joda.time.DateTimeZone)v4).getName((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.joda.time.DateTimeZone)v4).isFixed();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = 2L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).isStandardOffset((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -1L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).getOffsetFromLocal((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(3660000), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = 0L;
    Object v3 = ((java.util.TimeZone)v1).getOffset((((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v5 = -6L;
    Object v6 = new org.joda.time.LocalDateTime((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.joda.time.LocalDateTime)v6).minuteOfHour();
    Object v8 = ((org.joda.time.DateTimeZone)v4).isLocalDateTimeGap(((org.joda.time.LocalDateTime)v6));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getProvider();
    org.joda.time.DateTimeZone.setProvider(((org.joda.time.tz.Provider)v0));
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.DateTimeZone)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(1525779535), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = "The calculaion caused an overflow: ";
    Object v4 = java.util.TimeZone.getTimeZone(((java.lang.String)v3));
    Object v5 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v4));
    Object v6 = 6L;
    Object v7 = true;
    Object v8 = ((org.joda.time.DateTimeZone)v5).convertLocalToUTC((((java.lang.Long)v6).longValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.joda.time.DateTimeZone)v2).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).nextTransition((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "Invalid min days in first week: ";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = ((org.joda.time.DateTimeZone)v2).hashCode();
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 0L;
    Object v8 = ((org.joda.time.DateTimeZone)v2).getMillisKeepLocal(((org.joda.time.DateTimeZone)v6),(((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertEquals((Object)(-3660000L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = 0L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).previousTransition((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
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
  public void test57() throws Throwable {
    Object v0 = 39;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 39;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.joda.time.DateTimeZone)v1).hashCode();
    Object v3 = new org.joda.time.Instant();
    Object v4 = ((org.joda.time.DateTimeZone)v1).getOffset(((org.joda.time.ReadableInstant)v3));
    org.junit.Assert.assertEquals((Object)(140400000), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = -25L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).nextTransition((((java.lang.Long)v3).longValue()));
    Object v5 = new org.joda.time.Instant();
    Object v6 = ((org.joda.time.DateTimeZone)v2).getOffset(((org.joda.time.ReadableInstant)v5));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = 0L;
    Object v5 = ((org.joda.time.DateTimeZone)v3).getOffsetFromLocal((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.joda.time.DateTimeZone)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = "The calculaion caused an overflow: ";
    Object v4 = java.util.TimeZone.getTimeZone(((java.lang.String)v3));
    Object v5 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v4));
    Object v6 = 12L;
    Object v7 = ((org.joda.time.DateTimeZone)v2).getMillisKeepLocal(((org.joda.time.DateTimeZone)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = ((org.joda.time.DateTimeZone)v2).isFixed();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 39;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = -64L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).nextTransition((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-64L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = 0L;
    Object v3 = ((java.util.TimeZone)v1).getOffset((((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v5 = -13L;
    Object v6 = false;
    Object v7 = ((org.joda.time.DateTimeZone)v4).convertLocalToUTC((((java.lang.Long)v5).longValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new org.joda.time.Instant();
    Object v9 = ((org.joda.time.DateTimeZone)v4).getOffset(((org.joda.time.ReadableInstant)v8));
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = 0L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).isStandardOffset((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 39;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 0L;
    Object v3 = "Field must n/t be null";
    Object v4 = "CE";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.DateTimeZone)v1).getName((((java.lang.Long)v2).longValue()),((java.util.Locale)v5));
    org.junit.Assert.assertEquals((Object)("+39:00"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 39;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 60L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getStandardOffset((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(140400000), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.DateTimeZone)v2).toTimeZone();
    Object v4 = 1;
    Object v5 = 0;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.joda.time.DateTimeZone)v2).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = "Field must n/t be null";
    Object v5 = "CE";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "Field must n/t be null";
    Object v8 = "CE";
    Object v9 = new java.util.Locale(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((java.util.Locale)v6).getDisplayCountry(((java.util.Locale)v9));
    Object v11 = ((org.joda.time.DateTimeZone)v2).getShortName((((java.lang.Long)v3).longValue()),((java.util.Locale)v6));
    org.junit.Assert.assertEquals((Object)("+01:00"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).getOffset((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(3600000), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "Adding time zone offset caused overflow";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).getNameKey((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -25L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).getStandardOffset((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(3600000), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = 0L;
    Object v3 = ((java.util.TimeZone)v1).getOffset((((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v5 = 13L;
    Object v6 = ((org.joda.time.DateTimeZone)v4).getNameKey((((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertEquals((Object)("UTC"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 21L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).getOffsetFromLocal((((java.lang.Long)v3).longValue()));
    Object v5 = -53L;
    Object v6 = true;
    Object v7 = ((org.joda.time.DateTimeZone)v2).convertLocalToUTC((((java.lang.Long)v5).longValue()),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)(-3600053L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 39;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 0L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).previousTransition((((java.lang.Long)v2).longValue()));
    Object v4 = 1L;
    Object v5 = ((org.joda.time.DateTimeZone)v1).getNameKey((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.DateTimeZone)v2).toTimeZone();
    Object v4 = -4L;
    Object v5 = ((org.joda.time.DateTimeZone)v2).getOffset((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(3660000), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "ays";
    Object v1 = org.joda.time.DateTimeZone.forID(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.joda.time.DateTimeZone.setDefault(((org.joda.time.DateTimeZone)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -3L;
    Object v4 = true;
    Object v5 = ((org.joda.time.DateTimeZone)v2).adjustOffset((((java.lang.Long)v3).longValue()),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)(-3L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = 0L;
    Object v3 = ((java.util.TimeZone)v1).getOffset((((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v5 = -40L;
    Object v6 = ((org.joda.time.DateTimeZone)v4).getStandardOffset((((java.lang.Long)v5).longValue()));
    Object v7 = 16L;
    Object v8 = ((org.joda.time.DateTimeZone)v4).previousTransition((((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertEquals((Object)(16L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -29L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).getOffset((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(3660000), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).getStandardOffset((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(3660000), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.Instant();
    Object v4 = ((org.joda.time.DateTimeZone)v2).getOffset(((org.joda.time.ReadableInstant)v3));
    org.junit.Assert.assertEquals((Object)(3660000), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = -1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v3 = 1L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).nextTransition((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).convertUTCToLocal((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(3660000L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 39;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getOffsetFromLocal((((java.lang.Long)v2).longValue()));
    Object v4 = 66L;
    Object v5 = true;
    Object v6 = ((org.joda.time.DateTimeZone)v1).adjustOffset((((java.lang.Long)v4).longValue()),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertEquals((Object)(66L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 39;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    org.joda.time.DateTimeZone.setDefault(((org.joda.time.DateTimeZone)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 11L;
    Object v4 = "Field must n/t be null";
    Object v5 = "CE";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.joda.time.DateTimeZone)v2).getName((((java.lang.Long)v3).longValue()),((java.util.Locale)v6));
    org.junit.Assert.assertEquals((Object)("+01:01"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getAvailableIDs();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 39;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = -6L;
    Object v3 = new org.joda.time.LocalDateTime((((java.lang.Long)v2).longValue()));
    Object v4 = 1;
    Object v5 = ((org.joda.time.LocalDateTime)v3).getValue((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DateTimeZone)v1).isLocalDateTimeGap(((org.joda.time.LocalDateTime)v3));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 39;
    Object v1 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v0).intValue()));
    Object v2 = 0L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getOffsetFromLocal((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(140400000), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 10L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).getOffsetFromLocal((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(3600000), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -51L;
    Object v4 = false;
    Object v5 = ((org.joda.time.DateTimeZone)v2).convertLocalToUTC((((java.lang.Long)v3).longValue()),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)(-3600051L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = -1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = ((org.joda.time.DateTimeZone)v2).getNameKey((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = "Field must n/t be null";
    Object v5 = "CE";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.joda.time.DateTimeZone)v2).getName((((java.lang.Long)v3).longValue()),((java.util.Locale)v6));
    org.junit.Assert.assertEquals((Object)("+01:00"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "The calculaion caused an overflow: ";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = 0L;
    Object v3 = ((java.util.TimeZone)v1).getOffset((((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.DateTimeZone.forTimeZone(((java.util.TimeZone)v1));
    Object v5 = 0L;
    Object v6 = ((org.joda.time.DateTimeZone)v4).getOffsetFromLocal((((java.lang.Long)v5).longValue()));
    Object v7 = -11L;
    Object v8 = ((org.joda.time.DateTimeZone)v4).getOffset((((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 20L;
    Object v4 = true;
    Object v5 = 6L;
    Object v6 = ((org.joda.time.DateTimeZone)v2).convertLocalToUTC((((java.lang.Long)v3).longValue()),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertEquals((Object)(-3659980L), v6);
  }
}
