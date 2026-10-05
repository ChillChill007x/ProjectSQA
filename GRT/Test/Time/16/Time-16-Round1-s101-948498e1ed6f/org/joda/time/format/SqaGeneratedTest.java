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
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v2).withOffsetParsed();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = "Field '";
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).parseLocalDateTime(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = java.util.Locale.Category.DISPLAY;
    Object v6 = java.util.Locale.getDefault(((java.util.Locale.Category)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v4).withLocale(((java.util.Locale)v6));
    org.junit.Assert.assertNotNull(v7);
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
    Object v5 = "ConverterManager.alerInstantConverters";
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
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v2).withOffsetParsed();
    Object v4 = "Zone";
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v3).parseDateTime(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = "The date must not bd null";
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).parseDateTime(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v2).withOffsetParsed();
    Object v4 = -4;
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v3).withDefaultYear((((java.lang.Integer)v4).intValue()));
    Object v6 = "Invalid format: \"";
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v3).parseDateTime(((java.lang.String)v6));
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
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = java.util.Locale.Category.DISPLAY;
    Object v6 = java.util.Locale.getDefault(((java.util.Locale.Category)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v4).withLocale(((java.util.Locale)v6));
    Object v8 = org.joda.time.format.ISODateTimeFormat.date();
    Object v9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v8).withChronology(((org.joda.time.Chronology)v9));
    Object v11 = ((org.joda.time.format.DateTimeFormatter)v10).getChronology();
    Object v12 = ((org.joda.time.format.DateTimeFormatter)v7).withChronology(((org.joda.time.Chronology)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = java.io.Writer.nullWriter();
    Object v8 = org.joda.time.Instant.now();
    ((org.joda.time.format.DateTimeFormatter)v6).printTo(((java.lang.Appendable)v7),((org.joda.time.ReadableInstant)v8));
    Object v9 = null;
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v6).isPrinter();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
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
  public void test16() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = 1;
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withPivotYear(((java.lang.Integer)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = java.util.Locale.Category.DISPLAY;
    Object v6 = java.util.Locale.getDefault(((java.util.Locale.Category)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v4).withLocale(((java.util.Locale)v6));
    Object v8 = new java.lang.StringBuffer();
    Object v9 = new java.lang.StringBuffer(((java.lang.CharSequence)v8));
    Object v10 = false;
    Object v11 = ((java.lang.StringBuffer)v9).append((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = org.joda.time.DateTimeZone.getDefault();
    Object v13 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v12));
    ((org.joda.time.format.DateTimeFormatter)v7).printTo(((java.lang.StringBuffer)v9),((org.joda.time.ReadablePartial)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = java.util.Locale.Category.DISPLAY;
    Object v6 = java.util.Locale.getDefault(((java.util.Locale.Category)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v4).withLocale(((java.util.Locale)v6));
    Object v8 = "PeriodFormat.sSaceandspace";
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v7).parseLocalDateTime(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = java.util.Locale.Category.DISPLAY;
    Object v6 = java.util.Locale.getDefault(((java.util.Locale.Category)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v4).withLocale(((java.util.Locale)v6));
    Object v8 = java.io.Writer.nullWriter();
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v9));
    ((org.joda.time.format.DateTimeFormatter)v7).printTo(((java.io.Writer)v8),((org.joda.time.ReadablePartial)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v2).print(((org.joda.time.ReadablePartial)v4));
    org.junit.Assert.assertEquals((Object)("\ufffd\ufffd\ufffd\ufffd-\ufffd\ufffd-\ufffd\ufffd"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v2).isPrinter();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = "M";
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).parseMutableDateTime(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = Character.valueOf((char)1);
    Object v5 = ((java.io.Writer)v3).append((((java.lang.Character)v4).charValue()));
    Object v6 = org.joda.time.DateTimeZone.getDefault();
    Object v7 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v6));
    Object v8 = new java.lang.StringBuffer();
    Object v9 = new java.lang.StringBuffer(((java.lang.CharSequence)v8));
    Object v10 = ((org.joda.time.ReadablePartial)v7).equals(((java.lang.Object)v9));
    ((org.joda.time.format.DateTimeFormatter)v2).printTo(((java.io.Writer)v3),((org.joda.time.ReadablePartial)v7));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v2).withOffsetParsed();
    Object v4 = new java.lang.StringBuffer();
    Object v5 = new java.lang.StringBuffer(((java.lang.CharSequence)v4));
    Object v6 = ((java.lang.StringBuffer)v5).toString();
    Object v7 = -4L;
    ((org.joda.time.format.DateTimeFormatter)v3).printTo(((java.lang.StringBuffer)v5),(((java.lang.Long)v7).longValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
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
  public void test27() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = 1;
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withPivotYear(((java.lang.Integer)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).isPrinter();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v6).withOffsetParsed();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v6).withOffsetParsed();
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v9).getChronolgy();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = 1;
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withPivotYear(((java.lang.Integer)v5));
    Object v7 = new java.lang.StringBuffer();
    Object v8 = org.joda.time.DateTimeZone.getDefault();
    Object v9 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v8));
    ((org.joda.time.format.DateTimeFormatter)v6).printTo(((java.lang.StringBuffer)v7),((org.joda.time.ReadablePartial)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = 26L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.MutableDateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = "ReadablePartial objects must have the same set of fields";
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v2).parseInto(((org.joda.time.ReadWritableInstant)v5),((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = java.util.Locale.Category.DISPLAY;
    Object v6 = java.util.Locale.getDefault(((java.util.Locale.Category)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v4).withLocale(((java.util.Locale)v6));
    Object v8 = java.io.Writer.nullWriter();
    Object v9 = 0L;
    ((org.joda.time.format.DateTimeFormatter)v7).printTo(((java.io.Writer)v8),(((java.lang.Long)v9).longValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
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
  public void test34() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = org.joda.time.format.ISODateTimeFormat.date();
    Object v8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v7).withChronology(((org.joda.time.Chronology)v8));
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v9).getChronology();
    Object v11 = ((org.joda.time.format.DateTimeFormatter)v6).withChronology(((org.joda.time.Chronology)v10));
    Object v12 = "er";
    Object v13 = ((org.joda.time.format.DateTimeFormatter)v6).parseMutableDateTime(((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v8).withZoneUTC();
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v8).getParser();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).getZone();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v2).withOffsetParsed();
    Object v4 = 0;
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v3).withPivotYear(((java.lang.Integer)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
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
  public void test39() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v8).getParser();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).getLocale();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = 1;
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withPivotYear(((java.lang.Integer)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).isParser();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).isParser();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v6).withOffsetParsed();
    Object v10 = java.io.Writer.nullWriter();
    Object v11 = org.joda.time.DateTimeZone.getDefault();
    Object v12 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v11));
    ((org.joda.time.format.DateTimeFormatter)v9).printTo(((java.io.Writer)v10),((org.joda.time.ReadablePartial)v12));
    Object v13 = null;
    Object v14 = "1";
    Object v15 = ((org.joda.time.format.DateTimeFormatter)v9).parseMutableDateTime(((java.lang.String)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v6).withOffsetParsed();
    Object v10 = new java.lang.StringBuffer();
    Object v11 = org.joda.time.DateTimeZone.getDefault();
    Object v12 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v11));
    ((org.joda.time.format.DateTimeFormatter)v9).printTo(((java.lang.StringBuffer)v10),((org.joda.time.ReadablePartial)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v8).isParser();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v2).withOffsetParsed();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v3).getPivotYear();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).withOffsetParsed();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).isOffsetParsed();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).isPrinter();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v2).withOffsetParsed();
    Object v4 = new java.lang.StringBuffer();
    Object v5 = 1L;
    ((org.joda.time.format.DateTimeFormatter)v3).printTo(((java.lang.StringBuffer)v4),(((java.lang.Long)v5).longValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).withOffsetParsed();
    Object v8 = "The cal+endar must not be null";
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v7).parseLocalDateTime(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = new java.lang.StringBuffer();
    Object v8 = new java.lang.StringBuffer(((java.lang.CharSequence)v7));
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v9));
    ((org.joda.time.format.DateTimeFormatter)v6).printTo(((java.lang.StringBuffer)v8),((org.joda.time.ReadablePartial)v10));
    Object v11 = null;
    Object v12 = "resulting";
    Object v13 = ((org.joda.time.format.DateTimeFormatter)v6).parseLocalTime(((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = java.util.Locale.Category.DISPLAY;
    Object v6 = java.util.Locale.getDefault(((java.util.Locale.Category)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v4).withLocale(((java.util.Locale)v6));
    Object v8 = "-l";
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v7).parseMutableDateTime(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v6).withOffsetParsed();
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v9).getZone();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = java.util.Locale.Category.DISPLAY;
    Object v6 = java.util.Locale.getDefault(((java.util.Locale.Category)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v4).withLocale(((java.util.Locale)v6));
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v7).isPrinter();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v6).withOffsetParsed();
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v9).isPrinter();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = 1;
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withPivotYear(((java.lang.Integer)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = org.joda.time.format.ISODateTimeFormat.date();
    Object v8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v7).withChronology(((org.joda.time.Chronology)v8));
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v9).getChronology();
    Object v11 = ((org.joda.time.Chronology)v10).yearOfCentury();
    Object v12 = ((org.joda.time.format.DateTimeFormatter)v6).withChronology(((org.joda.time.Chronology)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).withOffsetParsed();
    Object v8 = 26L;
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = new org.joda.time.MutableDateTime((((java.lang.Long)v8).longValue()),((org.joda.time.DateTimeZone)v9));
    Object v11 = "AddingJ time zone offset caused overflow";
    Object v12 = 0;
    Object v13 = ((org.joda.time.format.DateTimeFormatter)v7).parseInto(((org.joda.time.ReadWritableInstant)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = org.joda.time.format.ISODateTimeFormat.date();
    Object v15 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v16 = ((org.joda.time.format.DateTimeFormatter)v14).withChronology(((org.joda.time.Chronology)v15));
    Object v17 = ((org.joda.time.format.DateTimeFormatter)v16).getChronology();
    Object v18 = ((org.joda.time.format.DateTimeFormatter)v7).withChronology(((org.joda.time.Chronology)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = org.joda.time.format.ISODateTimeFormat.date();
    Object v8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v7).withChronology(((org.joda.time.Chronology)v8));
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v9).getChronology();
    Object v11 = ((org.joda.time.Chronology)v10).yearOfCentury();
    Object v12 = ((org.joda.time.format.DateTimeFormatter)v6).withChronology(((org.joda.time.Chronology)v10));
    Object v13 = new java.lang.StringBuffer();
    Object v14 = new java.lang.StringBuffer(((java.lang.CharSequence)v13));
    Object v15 = org.joda.time.DateTimeZone.getDefault();
    Object v16 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v15));
    ((org.joda.time.format.DateTimeFormatter)v12).printTo(((java.lang.StringBuffer)v14),((org.joda.time.ReadablePartial)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = org.joda.time.format.ISODateTimeFormat.date();
    Object v8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v7).withChronology(((org.joda.time.Chronology)v8));
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v9).getChronology();
    Object v11 = ((org.joda.time.Chronology)v10).yearOfCentury();
    Object v12 = ((org.joda.time.format.DateTimeFormatter)v6).withChronology(((org.joda.time.Chronology)v10));
    Object v13 = ((org.joda.time.format.DateTimeFormatter)v12).withOffsetParsed();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = "minu`nd";
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).parseDateTime(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.format.ISODateTimeFormat.date();
    Object v4 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v3).withChronology(((org.joda.time.Chronology)v4));
    Object v6 = org.joda.time.DateTimeZone.getDefault();
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v5).withZone(((org.joda.time.DateTimeZone)v6));
    Object v8 = org.joda.time.DateTimeZone.getDefault();
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v7).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v9).getZone();
    Object v11 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v10));
    Object v12 = org.joda.time.format.ISODateTimeFormat.date();
    Object v13 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v14 = ((org.joda.time.format.DateTimeFormatter)v12).withChronology(((org.joda.time.Chronology)v13));
    Object v15 = org.joda.time.DateTimeZone.getDefault();
    Object v16 = ((org.joda.time.format.DateTimeFormatter)v14).withZone(((org.joda.time.DateTimeZone)v15));
    Object v17 = org.joda.time.DateTimeZone.getDefault();
    Object v18 = ((org.joda.time.format.DateTimeFormatter)v16).withZone(((org.joda.time.DateTimeZone)v17));
    Object v19 = ((org.joda.time.format.DateTimeFormatter)v18).getZone();
    Object v20 = 0L;
    Object v21 = ((org.joda.time.DateTimeZone)v19).isStandardOffset((((java.lang.Long)v20).longValue()));
    Object v22 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v19));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = 1;
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withPivotYear(((java.lang.Integer)v5));
    Object v7 = "Partial cannot be null";
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).parseMillis(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v8).getChronolgy();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v6).withOffsetParsed();
    Object v10 = java.io.Writer.nullWriter();
    Object v11 = new char[]{Character.valueOf((char)2),Character.valueOf((char)4)};
    ((java.io.Writer)v10).write(((char[])v11));
    Object v12 = null;
    Object v13 = 1L;
    ((org.joda.time.format.DateTimeFormatter)v9).printTo(((java.io.Writer)v10),(((java.lang.Long)v13).longValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).withOffsetParsed();
    Object v8 = 26L;
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = new org.joda.time.MutableDateTime((((java.lang.Long)v8).longValue()),((org.joda.time.DateTimeZone)v9));
    Object v11 = "AddingJ time zone offset caused overflow";
    Object v12 = 0;
    Object v13 = ((org.joda.time.format.DateTimeFormatter)v7).parseInto(((org.joda.time.ReadWritableInstant)v10),((java.lang.String)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = org.joda.time.format.ISODateTimeFormat.date();
    Object v15 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v16 = ((org.joda.time.format.DateTimeFormatter)v14).withChronology(((org.joda.time.Chronology)v15));
    Object v17 = ((org.joda.time.format.DateTimeFormatter)v16).getChronology();
    Object v18 = ((org.joda.time.format.DateTimeFormatter)v7).withChronology(((org.joda.time.Chronology)v17));
    Object v19 = java.io.Writer.nullWriter();
    Object v20 = org.joda.time.DateTimeZone.getDefault();
    Object v21 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v20));
    ((org.joda.time.format.DateTimeFormatter)v18).printTo(((java.io.Writer)v19),((org.joda.time.ReadablePartial)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).withOffsetParsed();
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v7).isParser();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    Object v9 = org.joda.time.format.ISODateTimeFormat.date();
    Object v10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v11 = ((org.joda.time.format.DateTimeFormatter)v9).withChronology(((org.joda.time.Chronology)v10));
    Object v12 = ((org.joda.time.format.DateTimeFormatter)v11).getChronology();
    Object v13 = ((org.joda.time.format.DateTimeFormatter)v8).withChronology(((org.joda.time.Chronology)v12));
    Object v14 = 40;
    Object v15 = ((org.joda.time.format.DateTimeFormatter)v13).withDefaultYear((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = org.joda.time.format.ISODateTimeFormat.date();
    Object v8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v7).withChronology(((org.joda.time.Chronology)v8));
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v9).getChronology();
    Object v11 = ((org.joda.time.Chronology)v10).yearOfCentury();
    Object v12 = ((org.joda.time.format.DateTimeFormatter)v6).withChronology(((org.joda.time.Chronology)v10));
    Object v13 = ((org.joda.time.format.DateTimeFormatter)v12).isPrinter();
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v2).withOffsetParsed();
    Object v4 = new java.lang.StringBuffer();
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v5));
    Object v7 = 1;
    Object v8 = ((org.joda.time.ReadablePartial)v6).getField((((java.lang.Integer)v7).intValue()));
    ((org.joda.time.format.DateTimeFormatter)v3).printTo(((java.lang.StringBuffer)v4),((org.joda.time.ReadablePartial)v6));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v6).withOffsetParsed();
    Object v10 = new java.lang.StringBuffer();
    Object v11 = new java.lang.StringBuffer();
    Object v12 = ((java.lang.Appendable)v10).append(((java.lang.CharSequence)v11));
    Object v13 = org.joda.time.Instant.now();
    ((org.joda.time.format.DateTimeFormatter)v9).printTo(((java.lang.Appendable)v10),((org.joda.time.ReadableInstant)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    Object v9 = java.io.Writer.nullWriter();
    Object v10 = org.joda.time.Instant.now();
    ((org.joda.time.format.DateTimeFormatter)v8).printTo(((java.io.Writer)v9),((org.joda.time.ReadableInstant)v10));
    Object v11 = null;
    Object v12 = "The field must not be null";
    Object v13 = ((org.joda.time.format.DateTimeFormatter)v8).parseLocalDateTime(((java.lang.String)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v2).withOffsetParsed();
    Object v4 = 0;
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v3).withPivotYear(((java.lang.Integer)v4));
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v5).isPrinter();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    Object v9 = org.joda.time.format.ISODateTimeFormat.date();
    Object v10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v11 = ((org.joda.time.format.DateTimeFormatter)v9).withChronology(((org.joda.time.Chronology)v10));
    Object v12 = org.joda.time.DateTimeZone.getDefault();
    Object v13 = ((org.joda.time.format.DateTimeFormatter)v11).withZone(((org.joda.time.DateTimeZone)v12));
    Object v14 = org.joda.time.DateTimeZone.getDefault();
    Object v15 = ((org.joda.time.format.DateTimeFormatter)v13).withZone(((org.joda.time.DateTimeZone)v14));
    Object v16 = 0;
    Object v17 = ((org.joda.time.format.DateTimeFormatter)v15).withPivotYear((((java.lang.Integer)v16).intValue()));
    Object v18 = ((org.joda.time.format.DateTimeFormatter)v15).withOffsetParsed();
    Object v19 = ((org.joda.time.format.DateTimeFormatter)v18).getChronolgy();
    Object v20 = ((org.joda.time.format.DateTimeFormatter)v8).withChronology(((org.joda.time.Chronology)v19));
    Object v21 = ((org.joda.time.format.DateTimeFormatter)v8).getParser();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    Object v9 = org.joda.time.format.ISODateTimeFormat.date();
    Object v10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v11 = ((org.joda.time.format.DateTimeFormatter)v9).withChronology(((org.joda.time.Chronology)v10));
    Object v12 = ((org.joda.time.format.DateTimeFormatter)v11).getChronology();
    Object v13 = ((org.joda.time.format.DateTimeFormatter)v8).withChronology(((org.joda.time.Chronology)v12));
    Object v14 = 40;
    Object v15 = ((org.joda.time.format.DateTimeFormatter)v13).withDefaultYear((((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.joda.time.format.DateTimeFormatter)v15).isPrinter();
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = 1;
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withPivotYear(((java.lang.Integer)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    Object v9 = 26L;
    Object v10 = org.joda.time.DateTimeZone.getDefault();
    Object v11 = new org.joda.time.MutableDateTime((((java.lang.Long)v9).longValue()),((org.joda.time.DateTimeZone)v10));
    Object v12 = "";
    Object v13 = 24;
    Object v14 = ((org.joda.time.format.DateTimeFormatter)v8).parseInto(((org.joda.time.ReadWritableInstant)v11),((java.lang.String)v12),(((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertEquals((Object)(-25), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = new java.lang.StringBuffer();
    Object v4 = org.joda.time.Instant.now();
    ((org.joda.time.format.DateTimeFormatter)v2).printTo(((java.lang.StringBuffer)v3),((org.joda.time.ReadableInstant)v4));
    Object v5 = null;
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = org.joda.time.DateTimeZone.getDefault();
    Object v8 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v7));
    Object v9 = org.joda.time.Instant.now();
    Object v10 = ((org.joda.time.ReadablePartial)v8).toDateTime(((org.joda.time.ReadableInstant)v9));
    ((org.joda.time.format.DateTimeFormatter)v2).printTo(((java.io.Writer)v6),((org.joda.time.ReadablePartial)v8));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = 1;
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withPivotYear(((java.lang.Integer)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    Object v9 = "Hour";
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v8).parseDateTime(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    Object v9 = org.joda.time.format.ISODateTimeFormat.date();
    Object v10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v11 = ((org.joda.time.format.DateTimeFormatter)v9).withChronology(((org.joda.time.Chronology)v10));
    Object v12 = ((org.joda.time.format.DateTimeFormatter)v11).getChronology();
    Object v13 = ((org.joda.time.format.DateTimeFormatter)v8).withChronology(((org.joda.time.Chronology)v12));
    Object v14 = 1;
    Object v15 = ((org.joda.time.format.DateTimeFormatter)v13).withPivotYear((((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = java.util.Locale.Category.DISPLAY;
    Object v6 = java.util.Locale.getDefault(((java.util.Locale.Category)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v4).withLocale(((java.util.Locale)v6));
    Object v8 = org.joda.time.format.ISODateTimeFormat.date();
    Object v9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v8).withChronology(((org.joda.time.Chronology)v9));
    Object v11 = org.joda.time.DateTimeZone.getDefault();
    Object v12 = ((org.joda.time.format.DateTimeFormatter)v10).withZone(((org.joda.time.DateTimeZone)v11));
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = ((org.joda.time.format.DateTimeFormatter)v12).withZone(((org.joda.time.DateTimeZone)v13));
    Object v15 = 0;
    Object v16 = ((org.joda.time.format.DateTimeFormatter)v14).withPivotYear(((java.lang.Integer)v15));
    Object v17 = ((org.joda.time.format.DateTimeFormatter)v16).getChronolgy();
    Object v18 = ((org.joda.time.format.DateTimeFormatter)v7).withChronology(((org.joda.time.Chronology)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v2).withOffsetParsed();
    Object v4 = 26L;
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = new org.joda.time.MutableDateTime((((java.lang.Long)v4).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = org.joda.time.Instant.now();
    Object v8 = ((java.lang.Comparable)v6).compareTo(((java.lang.Object)v7));
    Object v9 = "Cannot (onvert to ";
    Object v10 = -25;
    Object v11 = ((org.joda.time.format.DateTimeFormatter)v3).parseInto(((org.joda.time.ReadWritableInstant)v6),((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertEquals((Object)(-25), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    Object v9 = java.util.Locale.Category.DISPLAY;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = ((org.joda.time.format.DateTimeFormatter)v8).withLocale(((java.util.Locale)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v6).withOffsetParsed();
    Object v10 = org.joda.time.format.ISODateTimeFormat.date();
    Object v11 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v12 = ((org.joda.time.format.DateTimeFormatter)v10).withChronology(((org.joda.time.Chronology)v11));
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = ((org.joda.time.format.DateTimeFormatter)v12).withZone(((org.joda.time.DateTimeZone)v13));
    Object v15 = org.joda.time.DateTimeZone.getDefault();
    Object v16 = ((org.joda.time.format.DateTimeFormatter)v14).withZone(((org.joda.time.DateTimeZone)v15));
    Object v17 = 0;
    Object v18 = ((org.joda.time.format.DateTimeFormatter)v16).withPivotYear(((java.lang.Integer)v17));
    Object v19 = ((org.joda.time.format.DateTimeFormatter)v18).getChronolgy();
    Object v20 = ((org.joda.time.format.DateTimeFormatter)v9).withChronology(((org.joda.time.Chronology)v19));
    Object v21 = "Printing not supported";
    Object v22 = ((org.joda.time.format.DateTimeFormatter)v9).parseMutableDateTime(((java.lang.String)v21));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.format.ISODateTimeFormat.date();
    Object v4 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v3).withChronology(((org.joda.time.Chronology)v4));
    Object v6 = org.joda.time.DateTimeZone.getDefault();
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v5).withZone(((org.joda.time.DateTimeZone)v6));
    Object v8 = org.joda.time.DateTimeZone.getDefault();
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v7).withZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v9).getZone();
    Object v11 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v10));
    Object v12 = org.joda.time.format.ISODateTimeFormat.date();
    Object v13 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v14 = ((org.joda.time.format.DateTimeFormatter)v12).withChronology(((org.joda.time.Chronology)v13));
    Object v15 = org.joda.time.DateTimeZone.getDefault();
    Object v16 = ((org.joda.time.format.DateTimeFormatter)v14).withZone(((org.joda.time.DateTimeZone)v15));
    Object v17 = org.joda.time.DateTimeZone.getDefault();
    Object v18 = ((org.joda.time.format.DateTimeFormatter)v16).withZone(((org.joda.time.DateTimeZone)v17));
    Object v19 = ((org.joda.time.format.DateTimeFormatter)v18).getZone();
    Object v20 = 0L;
    Object v21 = ((org.joda.time.DateTimeZone)v19).isStandardOffset((((java.lang.Long)v20).longValue()));
    Object v22 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v19));
    Object v23 = "The instant must not be null";
    Object v24 = ((org.joda.time.format.DateTimeFormatter)v22).parseMillis(((java.lang.String)v23));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).withOffsetParsed();
    Object v8 = 1;
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v7).withPivotYear(((java.lang.Integer)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    Object v9 = "String pool isr too large";
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v8).parseMutableDateTime(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    Object v9 = org.joda.time.format.ISODateTimeFormat.date();
    Object v10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v11 = ((org.joda.time.format.DateTimeFormatter)v9).withChronology(((org.joda.time.Chronology)v10));
    Object v12 = ((org.joda.time.format.DateTimeFormatter)v11).getChronology();
    Object v13 = ((org.joda.time.format.DateTimeFormatter)v8).withChronology(((org.joda.time.Chronology)v12));
    Object v14 = 40;
    Object v15 = ((org.joda.time.format.DateTimeFormatter)v13).withDefaultYear((((java.lang.Integer)v14).intValue()));
    Object v16 = 26L;
    Object v17 = org.joda.time.DateTimeZone.getDefault();
    Object v18 = new org.joda.time.MutableDateTime((((java.lang.Long)v16).longValue()),((org.joda.time.DateTimeZone)v17));
    Object v19 = "Field'";
    Object v20 = -29;
    Object v21 = ((org.joda.time.format.DateTimeFormatter)v15).parseInto(((org.joda.time.ReadWritableInstant)v18),((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    org.junit.Assert.assertEquals((Object)(-29), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = 1;
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withPivotYear(((java.lang.Integer)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v8).isParser();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = "";
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).parseLocalTime(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = org.joda.time.format.ISODateTimeFormat.date();
    Object v8 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v7).withChronology(((org.joda.time.Chronology)v8));
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v9).getChronology();
    Object v11 = ((org.joda.time.Chronology)v10).yearOfCentury();
    Object v12 = ((org.joda.time.format.DateTimeFormatter)v6).withChronology(((org.joda.time.Chronology)v10));
    Object v13 = java.io.Writer.nullWriter();
    Object v14 = org.joda.time.DateTimeZone.getDefault();
    Object v15 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v14));
    ((org.joda.time.format.DateTimeFormatter)v12).printTo(((java.io.Writer)v13),((org.joda.time.ReadablePartial)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v6).withOffsetParsed();
    Object v8 = java.io.Writer.nullWriter();
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v9));
    ((org.joda.time.format.DateTimeFormatter)v7).printTo(((java.io.Writer)v8),((org.joda.time.ReadablePartial)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = java.util.Locale.Category.DISPLAY;
    Object v6 = java.util.Locale.getDefault(((java.util.Locale.Category)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatter)v4).withLocale(((java.util.Locale)v6));
    Object v8 = org.joda.time.format.ISODateTimeFormat.date();
    Object v9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v10 = ((org.joda.time.format.DateTimeFormatter)v8).withChronology(((org.joda.time.Chronology)v9));
    Object v11 = ((org.joda.time.format.DateTimeFormatter)v10).getChronology();
    Object v12 = ((org.joda.time.format.DateTimeFormatter)v7).withChronology(((org.joda.time.Chronology)v11));
    Object v13 = java.io.Writer.nullWriter();
    Object v14 = org.joda.time.DateTimeZone.getDefault();
    Object v15 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v14));
    ((org.joda.time.format.DateTimeFormatter)v12).printTo(((java.io.Writer)v13),((org.joda.time.ReadablePartial)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v6).withOffsetParsed();
    Object v10 = new java.lang.StringBuffer();
    Object v11 = new java.lang.StringBuffer(((java.lang.CharSequence)v10));
    Object v12 = org.joda.time.DateTimeZone.getDefault();
    Object v13 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v12));
    ((org.joda.time.format.DateTimeFormatter)v9).printTo(((java.lang.StringBuffer)v11),((org.joda.time.ReadablePartial)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = new java.lang.StringBuffer();
    Object v8 = new java.lang.StringBuffer(((java.lang.CharSequence)v7));
    Object v9 = 0L;
    ((org.joda.time.format.DateTimeFormatter)v6).printTo(((java.lang.Appendable)v8),(((java.lang.Long)v9).longValue()));
    Object v10 = null;
    Object v11 = "Invalid index: ";
    Object v12 = ((org.joda.time.format.DateTimeFormatter)v6).parseDateTime(((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = ((org.joda.time.format.DateTimeFormatter)v2).withOffsetParsed();
    Object v4 = java.io.Writer.nullWriter();
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = org.joda.time.LocalTime.now(((org.joda.time.DateTimeZone)v5));
    ((org.joda.time.format.DateTimeFormatter)v3).printTo(((java.io.Writer)v4),((org.joda.time.ReadablePartial)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear(((java.lang.Integer)v7));
    Object v9 = java.util.Locale.Category.DISPLAY;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = ((org.joda.time.format.DateTimeFormatter)v8).withLocale(((java.util.Locale)v10));
    Object v12 = new java.lang.StringBuffer();
    Object v13 = new java.lang.StringBuffer(((java.lang.CharSequence)v12));
    Object v14 = 1L;
    ((org.joda.time.format.DateTimeFormatter)v11).printTo(((java.lang.Appendable)v13),(((java.lang.Long)v14).longValue()));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = ((org.joda.time.format.DateTimeFormatter)v2).withZone(((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = ((org.joda.time.format.DateTimeFormatter)v4).withZone(((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = ((org.joda.time.format.DateTimeFormatter)v6).withPivotYear((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeFormatter)v6).withOffsetParsed();
    Object v10 = org.joda.time.format.ISODateTimeFormat.date();
    Object v11 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v12 = ((org.joda.time.format.DateTimeFormatter)v10).withChronology(((org.joda.time.Chronology)v11));
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = ((org.joda.time.format.DateTimeFormatter)v12).withZone(((org.joda.time.DateTimeZone)v13));
    Object v15 = org.joda.time.DateTimeZone.getDefault();
    Object v16 = ((org.joda.time.format.DateTimeFormatter)v14).withZone(((org.joda.time.DateTimeZone)v15));
    Object v17 = ((org.joda.time.format.DateTimeFormatter)v16).getZone();
    Object v18 = ((org.joda.time.format.DateTimeFormatter)v9).withZone(((org.joda.time.DateTimeZone)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = org.joda.time.format.ISODateTimeFormat.date();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.format.DateTimeFormatter)v0).withChronology(((org.joda.time.Chronology)v1));
    Object v3 = java.util.Locale.Category.DISPLAY;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((org.joda.time.format.DateTimeFormatter)v2).withLocale(((java.util.Locale)v4));
    org.junit.Assert.assertNotNull(v5);
  }
}
