package org.joda.time.format;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = "Field '";
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v3).parseLocalDateTime(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = java.util.Locale.Category.DISPLAY;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v3).withLocale(((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v2).getChronology();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = "aboe the supported maximum of ";
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v2).parseMillis(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v2).isParser();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = "Zone";
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).parseDateTime(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = "The date must not bd null";
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).parseDateTime(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = -4;
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withDefaultYear((((java.lang.Integer)v2).intValue()));
    Object v4 = "\" from remaining set: ";
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v1).parseDateTime(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = "The DateTimeFieldType must not ";
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).parseMillis(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = org.joda.time.format.ISODateTimeFormat.date();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withChronology(((org.joda.time.Chronology)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).getChronology();
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v3).withChronology(((org.joda.time.Chronology)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = org.joda.time.Instant.now();
    ((org.joda.time.format.DateTimeFormatter)v3).printTo(((java.lang.Appendable)v4),((org.joda.time.ReadableInstant)v5));
    Object v6 = null;
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v3).isPrinter();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = 26L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.MutableDateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = "Chrxonology must not be null";
    Object v7 = 51;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v2).parseInto(((org.joda.time.ReadWritableInstant)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(-52), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = 1;
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withPivotYear(((java.lang.Integer)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = new java.lang.StringBuffer();
    Object v5 = new java.lang.StringBuffer(((java.lang.CharSequence)v4));
    Object v6 = false;
    Object v7 = ((java.lang.StringBuffer)v5).append((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = org.joda.time.DateTimeZone.getDefault();
    Object v9 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v8));
    ((org.joda.time.format.DateTimeFormatter)v3).printTo(((java.lang.StringBuffer)v5),((org.joda.time.ReadablePartial)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = "PeriodFormat.sSaceandspace";
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v3).parseLocalDateTime(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v5));
    ((org.joda.time.format.DateTimeFormatter)v3).printTo(((java.io.Writer)v4),((org.joda.time.ReadablePartial)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v2).print(((org.joda.time.ReadablePartial)v4));
    org.junit.Assert.assertEquals((Object)("\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffd"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v2).isPrinter();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = java.util.Locale.Category.DISPLAY;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v3).withLocale(((java.util.Locale)v5));
    Object v7 = "Invalid min days in frst week: ";
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).parseMutableDateTime(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = Character.valueOf((char)1);
    Object v5 = ((java.io.Writer)v3).append((((java.lang.Character)v4).charValue()));
    Object v6 = org.joda.time.DateTimeZone.getDefault();
    Object v7 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v6));
    Object v8 = new java.lang.StringBuffer();
    Object v9 = ((org.joda.time.ReadablePartial)v7).equals(((java.lang.Object)v8));
    ((org.joda.time.format.DateTimeFormatter)v2).printTo(((java.io.Writer)v3),((org.joda.time.ReadablePartial)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = new java.lang.StringBuffer();
    Object v3 = new java.lang.StringBuffer(((java.lang.CharSequence)v2));
    Object v4 = ((java.lang.StringBuffer)v3).toString();
    Object v5 = -4L;
    ((org.joda.time.format.DateTimeFormatter)v1).printTo(((java.lang.StringBuffer)v3),(((java.lang.Long)v5).longValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = java.util.Locale.Category.DISPLAY;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v3).withLocale(((java.util.Locale)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v4));
    ((org.joda.time.format.DateTimeFormatter)v2).printTo(((java.io.Writer)v3),((org.joda.time.ReadablePartial)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = 1;
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withPivotYear(((java.lang.Integer)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).isPrinter();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = 0;
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v3).withPivotYear((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v3).withOffsetParsed();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = java.util.Locale.Category.DISPLAY;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v3).withLocale(((java.util.Locale)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v8).getChronolgy();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = 1;
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withPivotYear(((java.lang.Integer)v2));
    Object v4 = new java.lang.StringBuffer();
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v5));
    ((org.joda.time.format.DateTimeFormatter)v3).printTo(((java.lang.StringBuffer)v4),((org.joda.time.ReadablePartial)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = 26L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.MutableDateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = "The partial must not be null";
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v2).parseInto(((org.joda.time.ReadWritableInstant)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = java.io.Writer.nullWriter();
    Object v3 = 0L;
    ((org.joda.time.format.DateTimeFormatter)v1).printTo(((java.io.Writer)v2),(((java.lang.Long)v3).longValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = 8;
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withDefaultYear((((java.lang.Integer)v3).intValue()));
    Object v5 = java.io.Writer.nullWriter();
    Object v6 = 26L;
    Object v7 = org.joda.time.DateTimeZone.getDefault();
    Object v8 = new org.joda.time.MutableDateTime((((java.lang.Long)v6).longValue()),((org.joda.time.DateTimeZone)v7));
    ((org.joda.time.format.DateTimeFormatter)v2).printTo(((java.io.Writer)v5),((org.joda.time.ReadableInstant)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = org.joda.time.format.ISODateTimeFormat.date();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withChronology(((org.joda.time.Chronology)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).getChronology();
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v3).withChronology(((org.joda.time.Chronology)v7));
    Object v9 = "yea";
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v3).parseMutableDateTime(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = 1;
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withPivotYear(((java.lang.Integer)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).withZoneUTC();
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v3).getParser();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = org.joda.time.format.ISODateTimeFormat.date();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withChronology(((org.joda.time.Chronology)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).getChronology();
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v3).withChronology(((org.joda.time.Chronology)v7));
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v8).getZone();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = 0;
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withPivotYear(((java.lang.Integer)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = java.util.Locale.Category.DISPLAY;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v3).withLocale(((java.util.Locale)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    Object v9 = org.joda.time.format.ISODateTimeFormat.date();
    Object v10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v11 = ((org.joda.time.format.DateTimeFormatter)v9).withChronology(((org.joda.time.Chronology)v10));
    Object v12 = ((org.joda.time.format.DateTimeFormatter)v11).getChronology();
    Object v13 = ((org.joda.time.format.DateTimeFormatter)v8).withChronology(((org.joda.time.Chronology)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = java.util.Locale.Category.DISPLAY;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v3).withLocale(((java.util.Locale)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v8).getParser();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = java.util.Locale.Category.DISPLAY;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v3).withLocale(((java.util.Locale)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).getLocale();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = 1;
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withPivotYear(((java.lang.Integer)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).isParser();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).isParser();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = 0;
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v3).withPivotYear((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v3).withOffsetParsed();
    Object v7 = java.io.Writer.nullWriter();
    Object v8 = org.joda.time.DateTimeZone.getDefault();
    Object v9 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v8));
    ((org.joda.time.format.DateTimeFormatter)v6).printTo(((java.io.Writer)v7),((org.joda.time.ReadablePartial)v9));
    Object v10 = null;
    Object v11 = "1";
    Object v12 = ((org.joda.time.format.DateTimeFormatter)v6).parseMutableDateTime(((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = java.util.Locale.Category.DISPLAY;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v3).withLocale(((java.util.Locale)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    Object v9 = new java.lang.StringBuffer();
    Object v10 = org.joda.time.DateTimeZone.getDefault();
    Object v11 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v10));
    ((org.joda.time.format.DateTimeFormatter)v8).printTo(((java.lang.StringBuffer)v9),((org.joda.time.ReadablePartial)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = java.util.Locale.Category.DISPLAY;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v3).withLocale(((java.util.Locale)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v8).isParser();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v2).getPivotYear();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).withOffsetParsed();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = 1;
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withPivotYear(((java.lang.Integer)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).isOffsetParsed();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).isPrinter();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = new java.lang.StringBuffer();
    Object v3 = 1L;
    ((org.joda.time.format.DateTimeFormatter)v1).printTo(((java.lang.StringBuffer)v2),(((java.lang.Long)v3).longValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).withOffsetParsed();
    Object v5 = "The cal+endar must not be null";
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).parseLocalDateTime(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = 1;
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withPivotYear(((java.lang.Integer)v2));
    Object v4 = new java.lang.StringBuffer();
    Object v5 = new java.lang.StringBuffer(((java.lang.CharSequence)v4));
    Object v6 = org.joda.time.DateTimeZone.getDefault();
    Object v7 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v6));
    ((org.joda.time.format.DateTimeFormatter)v3).printTo(((java.lang.StringBuffer)v5),((org.joda.time.ReadablePartial)v7));
    Object v8 = null;
    Object v9 = "Must supply a chronology";
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v3).parseLocalTime(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = "-l";
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v3).parseMutableDateTime(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = java.util.Locale.Category.DISPLAY;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v3).withLocale(((java.util.Locale)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    Object v9 = org.joda.time.format.ISODateTimeFormat.date();
    Object v10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v11 = ((org.joda.time.format.DateTimeFormatter)v9).withChronology(((org.joda.time.Chronology)v10));
    Object v12 = ((org.joda.time.format.DateTimeFormatter)v11).getChronology();
    Object v13 = ((org.joda.time.format.DateTimeFormatter)v8).withChronology(((org.joda.time.Chronology)v12));
    Object v14 = ((org.joda.time.format.DateTimeFormatter)v13).getZone();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = java.util.Locale.Category.DISPLAY;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v3).withLocale(((java.util.Locale)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    Object v9 = org.joda.time.format.ISODateTimeFormat.date();
    Object v10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v11 = ((org.joda.time.format.DateTimeFormatter)v9).withChronology(((org.joda.time.Chronology)v10));
    Object v12 = ((org.joda.time.format.DateTimeFormatter)v11).getChronology();
    Object v13 = ((org.joda.time.format.DateTimeFormatter)v8).withChronology(((org.joda.time.Chronology)v12));
    Object v14 = ((org.joda.time.format.DateTimeFormatter)v13).isPrinter();
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = 1;
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withPivotYear(((java.lang.Integer)v2));
    Object v4 = 0;
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v3).withPivotYear(((java.lang.Integer)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = org.joda.time.format.ISODateTimeFormat.date();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withChronology(((org.joda.time.Chronology)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).getChronology();
    Object v8 = ((org.joda.time.Chronology)v7).yearOfCentury();
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v3).withChronology(((org.joda.time.Chronology)v7));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).withOffsetParsed();
    Object v5 = 26L;
    Object v6 = org.joda.time.DateTimeZone.getDefault();
    Object v7 = new org.joda.time.MutableDateTime((((java.lang.Long)v5).longValue()),((org.joda.time.DateTimeZone)v6));
    Object v8 = "CEJT";
    Object v9 = 0;
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v4).parseInto(((org.joda.time.ReadWritableInstant)v7),((java.lang.String)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = org.joda.time.format.ISODateTimeFormat.date();
    Object v12 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v13 = ((org.joda.time.format.DateTimeFormatter)v11).withChronology(((org.joda.time.Chronology)v12));
    Object v14 = ((org.joda.time.format.DateTimeFormatter)v13).getChronology();
    Object v15 = ((org.joda.time.format.DateTimeFormatter)v4).withChronology(((org.joda.time.Chronology)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = org.joda.time.format.ISODateTimeFormat.date();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withChronology(((org.joda.time.Chronology)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).getChronology();
    Object v8 = ((org.joda.time.Chronology)v7).yearOfCentury();
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v3).withChronology(((org.joda.time.Chronology)v7));
    Object v10 = new java.lang.StringBuffer();
    Object v11 = new java.lang.StringBuffer(((java.lang.CharSequence)v10));
    Object v12 = org.joda.time.DateTimeZone.getDefault();
    Object v13 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v12));
    ((org.joda.time.format.DateTimeFormatter)v9).printTo(((java.lang.StringBuffer)v11),((org.joda.time.ReadablePartial)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = org.joda.time.format.ISODateTimeFormat.date();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withChronology(((org.joda.time.Chronology)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).getChronology();
    Object v8 = ((org.joda.time.Chronology)v7).yearOfCentury();
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v3).withChronology(((org.joda.time.Chronology)v7));
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v9).withOffsetParsed();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = ",`";
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v3).parseDateTime(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.format.ISODateTimeFormat.date();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).withOffsetParsed();
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = java.util.Locale.Category.DISPLAY;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v6).withLocale(((java.util.Locale)v8));
    Object v10 = 0;
    Object v11 = ((org.joda.time.format.DateTimeFormatter)v9).withPivotYear(((java.lang.Integer)v10));
    Object v12 = org.joda.time.format.ISODateTimeFormat.date();
    Object v13 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v14 = ((org.joda.time.format.DateTimeFormatter)v12).withChronology(((org.joda.time.Chronology)v13));
    Object v15 = ((org.joda.time.format.DateTimeFormatter)v14).getChronology();
    Object v16 = ((org.joda.time.format.DateTimeFormatter)v11).withChronology(((org.joda.time.Chronology)v15));
    Object v17 = ((org.joda.time.format.DateTimeFormatter)v16).getZone();
    Object v18 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v17));
    Object v19 = org.joda.time.format.ISODateTimeFormat.date();
    Object v20 = ((org.joda.time.format.DateTimeFormatter)v19).withOffsetParsed();
    Object v21 = org.joda.time.DateTimeZone.getDefault();
    Object v22 = ((org.joda.time.format.DateTimeFormatter)v20).withZone(((org.joda.time.DateTimeZone)v21));
    Object v23 = java.util.Locale.Category.DISPLAY;
    Object v24 = java.util.Locale.getDefault(((java.util.Locale.Category)v23));
    Object v25 = ((org.joda.time.format.DateTimeFormatter)v22).withLocale(((java.util.Locale)v24));
    Object v26 = 0;
    Object v27 = ((org.joda.time.format.DateTimeFormatter)v25).withPivotYear(((java.lang.Integer)v26));
    Object v28 = org.joda.time.format.ISODateTimeFormat.date();
    Object v29 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v30 = ((org.joda.time.format.DateTimeFormatter)v28).withChronology(((org.joda.time.Chronology)v29));
    Object v31 = ((org.joda.time.format.DateTimeFormatter)v30).getChronology();
    Object v32 = ((org.joda.time.format.DateTimeFormatter)v27).withChronology(((org.joda.time.Chronology)v31));
    Object v33 = ((org.joda.time.format.DateTimeFormatter)v32).getZone();
    Object v34 = 0L;
    Object v35 = ((org.joda.time.DateTimeZone)v33).isStandardOffset((((java.lang.Long)v34).longValue()));
    Object v36 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v33));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = 1;
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withPivotYear(((java.lang.Integer)v2));
    Object v4 = "W";
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v3).parseMillis(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = 0;
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withPivotYear(((java.lang.Integer)v2));
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = new char[]{Character.valueOf((char)2),Character.valueOf((char)4)};
    ((java.io.Writer)v4).write(((char[])v5));
    Object v6 = null;
    Object v7 = 1L;
    ((org.joda.time.format.DateTimeFormatter)v3).printTo(((java.io.Writer)v4),(((java.lang.Long)v7).longValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = org.joda.time.format.ISODateTimeFormat.date();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withChronology(((org.joda.time.Chronology)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).getChronology();
    Object v8 = ((org.joda.time.Chronology)v7).yearOfCentury();
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v3).withChronology(((org.joda.time.Chronology)v7));
    Object v10 = java.io.Writer.nullWriter();
    Object v11 = org.joda.time.DateTimeZone.getDefault();
    Object v12 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v11));
    ((org.joda.time.format.DateTimeFormatter)v9).printTo(((java.io.Writer)v10),((org.joda.time.ReadablePartial)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).withOffsetParsed();
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v4).isParser();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).withOffsetParsed();
    Object v5 = 40;
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withDefaultYear((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = org.joda.time.format.ISODateTimeFormat.date();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withChronology(((org.joda.time.Chronology)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).getChronology();
    Object v8 = ((org.joda.time.Chronology)v7).yearOfCentury();
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v3).withChronology(((org.joda.time.Chronology)v7));
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v9).isPrinter();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = new java.lang.StringBuffer();
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v3));
    Object v5 = 1;
    Object v6 = ((org.joda.time.ReadablePartial)v4).getField((((java.lang.Integer)v5).intValue()));
    ((org.joda.time.format.DateTimeFormatter)v1).printTo(((java.lang.StringBuffer)v2),((org.joda.time.ReadablePartial)v4));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).withOffsetParsed();
    Object v5 = new java.lang.StringBuffer();
    Object v6 = new java.lang.StringBuffer();
    Object v7 = ((java.lang.Appendable)v5).append(((java.lang.CharSequence)v6));
    Object v8 = org.joda.time.Instant.now();
    ((org.joda.time.format.DateTimeFormatter)v4).printTo(((java.lang.Appendable)v5),((org.joda.time.ReadableInstant)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = 1;
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withPivotYear(((java.lang.Integer)v2));
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = org.joda.time.Instant.now();
    ((org.joda.time.format.DateTimeFormatter)v3).printTo(((java.io.Writer)v4),((org.joda.time.ReadableInstant)v5));
    Object v6 = null;
    Object v7 = "The field must not be null";
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v3).parseLocalDateTime(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).withOffsetParsed();
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v4).isPrinter();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = 1;
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withPivotYear(((java.lang.Integer)v2));
    Object v4 = org.joda.time.format.ISODateTimeFormat.date();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withChronology(((org.joda.time.Chronology)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).getChronology();
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v3).withChronology(((org.joda.time.Chronology)v7));
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v3).getParser();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).withOffsetParsed();
    Object v5 = 40;
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withDefaultYear((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).isPrinter();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = 1;
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withPivotYear(((java.lang.Integer)v2));
    Object v4 = 0;
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v3).withPivotYear(((java.lang.Integer)v4));
    Object v6 = 26L;
    Object v7 = org.joda.time.DateTimeZone.getDefault();
    Object v8 = new org.joda.time.MutableDateTime((((java.lang.Long)v6).longValue()),((org.joda.time.DateTimeZone)v7));
    Object v9 = "";
    Object v10 = 24;
    Object v11 = ((org.joda.time.format.DateTimeFormatter)v5).parseInto(((org.joda.time.ReadWritableInstant)v8),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertEquals((Object)(-25), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = new java.lang.StringBuffer();
    Object v2 = org.joda.time.Instant.now();
    ((org.joda.time.format.DateTimeFormatter)v0).printTo(((java.lang.StringBuffer)v1),((org.joda.time.ReadableInstant)v2));
    Object v3 = null;
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v5));
    Object v7 = org.joda.time.Instant.now();
    Object v8 = ((org.joda.time.ReadablePartial)v6).toDateTime(((org.joda.time.ReadableInstant)v7));
    ((org.joda.time.format.DateTimeFormatter)v0).printTo(((java.io.Writer)v4),((org.joda.time.ReadablePartial)v6));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = org.joda.time.format.ISODateTimeFormat.date();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withChronology(((org.joda.time.Chronology)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).getChronology();
    Object v8 = ((org.joda.time.Chronology)v7).yearOfCentury();
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v3).withChronology(((org.joda.time.Chronology)v7));
    Object v10 = "R";
    Object v11 = ((org.joda.time.format.DateTimeFormatter)v9).parseDateTime(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).withOffsetParsed();
    Object v5 = 1;
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withPivotYear((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = 26L;
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = new org.joda.time.MutableDateTime((((java.lang.Long)v2).longValue()),((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.ReadableInstant)v4).getZone();
    Object v6 = "Day(";
    Object v7 = -25;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v1).parseInto(((org.joda.time.ReadWritableInstant)v4),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(-25), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = 1;
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withPivotYear(((java.lang.Integer)v2));
    Object v4 = java.util.Locale.Category.DISPLAY;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v3).withLocale(((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).withOffsetParsed();
    Object v5 = org.joda.time.format.ISODateTimeFormat.date();
    Object v6 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v5).withChronology(((org.joda.time.Chronology)v6));
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v7).getChronology();
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v4).withChronology(((org.joda.time.Chronology)v8));
    Object v10 = "Illegal pattern component: ";
    Object v11 = ((org.joda.time.format.DateTimeFormatter)v4).parseMutableDateTime(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).withOffsetParsed();
    Object v5 = 40;
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withDefaultYear((((java.lang.Integer)v5).intValue()));
    Object v7 = "Format invalid: ";
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).parseMillis(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).withOffsetParsed();
    Object v5 = 1;
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withPivotYear(((java.lang.Integer)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = 0;
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v3).withPivotYear((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v3).withOffsetParsed();
    Object v7 = "-Summerr";
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).parseMutableDateTime(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = 1;
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withPivotYear(((java.lang.Integer)v2));
    Object v4 = java.util.Locale.Category.DISPLAY;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v3).withLocale(((java.util.Locale)v5));
    Object v7 = 26L;
    Object v8 = org.joda.time.DateTimeZone.getDefault();
    Object v9 = new org.joda.time.MutableDateTime((((java.lang.Long)v7).longValue()),((org.joda.time.DateTimeZone)v8));
    Object v10 = "' is ot supported";
    Object v11 = -29;
    Object v12 = ((org.joda.time.format.DateTimeFormatter)v6).parseInto(((org.joda.time.ReadWritableInstant)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertEquals((Object)(-29), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = org.joda.time.format.ISODateTimeFormat.date();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withChronology(((org.joda.time.Chronology)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).getChronology();
    Object v8 = ((org.joda.time.Chronology)v7).yearOfCentury();
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v3).withChronology(((org.joda.time.Chronology)v7));
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v9).isParser();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = 1;
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withPivotYear(((java.lang.Integer)v2));
    Object v4 = "";
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v3).parseLocalTime(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).withOffsetParsed();
    Object v5 = 40;
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withDefaultYear((((java.lang.Integer)v5).intValue()));
    Object v7 = java.io.Writer.nullWriter();
    Object v8 = org.joda.time.DateTimeZone.getDefault();
    Object v9 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v8));
    ((org.joda.time.format.DateTimeFormatter)v6).printTo(((java.io.Writer)v7),((org.joda.time.ReadablePartial)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = 1;
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withPivotYear(((java.lang.Integer)v2));
    Object v4 = 0;
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v3).withPivotYear(((java.lang.Integer)v4));
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = org.joda.time.DateTimeZone.getDefault();
    Object v8 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v7));
    ((org.joda.time.format.DateTimeFormatter)v5).printTo(((java.io.Writer)v6),((org.joda.time.ReadablePartial)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = 1;
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withPivotYear(((java.lang.Integer)v2));
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v5));
    ((org.joda.time.format.DateTimeFormatter)v3).printTo(((java.io.Writer)v4),((org.joda.time.ReadablePartial)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).withOffsetParsed();
    Object v5 = new java.lang.StringBuffer();
    Object v6 = new java.lang.StringBuffer(((java.lang.CharSequence)v5));
    Object v7 = org.joda.time.DateTimeZone.getDefault();
    Object v8 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v7));
    ((org.joda.time.format.DateTimeFormatter)v4).printTo(((java.lang.StringBuffer)v6),((org.joda.time.ReadablePartial)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = 1;
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withPivotYear(((java.lang.Integer)v2));
    Object v4 = new java.lang.StringBuffer();
    Object v5 = new java.lang.StringBuffer(((java.lang.CharSequence)v4));
    Object v6 = 0L;
    ((org.joda.time.format.DateTimeFormatter)v3).printTo(((java.lang.Appendable)v5),(((java.lang.Long)v6).longValue()));
    Object v7 = null;
    Object v8 = "Invalid index: ";
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v3).parseDateTime(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = java.io.Writer.nullWriter();
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v3));
    ((org.joda.time.format.DateTimeFormatter)v1).printTo(((java.io.Writer)v2),((org.joda.time.ReadablePartial)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).withOffsetParsed();
    Object v5 = 1;
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withPivotYear(((java.lang.Integer)v5));
    Object v7 = new java.lang.StringBuffer();
    Object v8 = new java.lang.StringBuffer(((java.lang.CharSequence)v7));
    Object v9 = 1L;
    ((org.joda.time.format.DateTimeFormatter)v6).printTo(((java.lang.Appendable)v8),(((java.lang.Long)v9).longValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).withOffsetParsed();
    Object v5 = org.joda.time.format.ISODateTimeFormat.date();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v5).withOffsetParsed();
    Object v7 = org.joda.time.DateTimeZone.getDefault();
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withZone(((org.joda.time.DateTimeZone)v7));
    Object v9 = org.joda.time.format.ISODateTimeFormat.date();
    Object v10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v11 = ((org.joda.time.format.DateTimeFormatter)v9).withChronology(((org.joda.time.Chronology)v10));
    Object v12 = ((org.joda.time.format.DateTimeFormatter)v11).getChronology();
    Object v13 = ((org.joda.time.format.DateTimeFormatter)v8).withChronology(((org.joda.time.Chronology)v12));
    Object v14 = ((org.joda.time.format.DateTimeFormatter)v13).getZone();
    Object v15 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = java.util.Locale.Category.DISPLAY;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v2).withLocale(((java.util.Locale)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).withOffsetParsed();
    Object v5 = "The calendar must not be nul";
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).parseDateTime(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = org.joda.time.format.ISODateTimeFormat.date();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withChronology(((org.joda.time.Chronology)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).getChronology();
    Object v8 = ((org.joda.time.Chronology)v7).yearOfCentury();
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v3).withChronology(((org.joda.time.Chronology)v7));
    Object v10 = org.joda.time.Instant.now();
    Object v11 = ((org.joda.time.format.DateTimeFormatter)v9).print(((org.joda.time.ReadableInstant)v10));
    org.junit.Assert.assertEquals((Object)("2026-10-05"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).withOffsetParsed();
    Object v5 = 1;
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withPivotYear((((java.lang.Integer)v5).intValue()));
    Object v7 = 0L;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).print((((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertEquals((Object)("1969-12-31"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = ((org.joda.time.format.DateTimeFormatter)v0).withOffsetParsed();
    Object v2 = org.joda.time.DateTimeZone.getDefault();
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v1).withZone(((org.joda.time.DateTimeZone)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).withOffsetParsed();
    Object v5 = 1;
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withPivotYear((((java.lang.Integer)v5).intValue()));
    Object v7 = 26L;
    Object v8 = org.joda.time.DateTimeZone.getDefault();
    Object v9 = new org.joda.time.MutableDateTime((((java.lang.Long)v7).longValue()),((org.joda.time.DateTimeZone)v8));
    Object v10 = "VST";
    Object v11 = 1;
    Object v12 = ((org.joda.time.format.DateTimeFormatter)v6).parseInto(((org.joda.time.ReadWritableInstant)v9),((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertEquals((Object)(-2), v12);
  }
}
