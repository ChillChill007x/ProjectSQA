package org.joda.time.format;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new java.lang.StringBuffer();
    Object v1 = new java.lang.StringBuffer(((java.lang.CharSequence)v0));
    Object v2 = 48;
    org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(((java.lang.StringBuffer)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.format.ISODateTimeFormat.dateElementParser();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).append(((org.joda.time.format.DateTimeFormatter)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = 1;
    Object v2 = false;
    Object v3 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTwoDigitWeekyear((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.format.ISODateTimeFormat.dateElementParser();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).append(((org.joda.time.format.DateTimeFormatter)v1));
    Object v3 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v4 = 25;
    Object v5 = -16;
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendFraction(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.format.ISODateTimeFormat.dateElementParser();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).append(((org.joda.time.format.DateTimeFormatter)v1));
    Object v3 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v4 = 25;
    Object v5 = -16;
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendFraction(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.joda.time.format.DateTimeFormatterBuilder)v6).appendTimeZoneId();
    Object v8 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v9 = ((org.joda.time.format.DateTimeFormatterBuilder)v6).appendText(((org.joda.time.DateTimeFieldType)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = 0;
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendClockhourOfDay((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v4 = 33;
    Object v5 = -26;
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendFraction(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.format.ISODateTimeFormat.dateElementParser();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).append(((org.joda.time.format.DateTimeFormatter)v1));
    Object v3 = -8;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendDayOfMonth((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendDayOfWeekText();
    Object v2 = 0;
    Object v3 = 2;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendWeekyear((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendDayOfWeekText();
    Object v2 = 0;
    Object v3 = 2;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendWeekyear((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    ((org.joda.time.format.DateTimeFormatterBuilder)v4).clear();
    Object v5 = null;
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v4).toPrinter();
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneId();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneId();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendDayOfWeekShortText();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v2 = 4;
    Object v3 = 0;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendSignedDecimal(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneShortName();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = 1;
    Object v2 = false;
    Object v3 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTwoDigitWeekyear((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.joda.time.format.ISODateTimeFormat.dateElementParser();
    Object v5 = ((org.joda.time.format.DateTimeFormatterBuilder)v3).append(((org.joda.time.format.DateTimeFormatter)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).toParser();
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneId();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendDayOfWeekShortText();
    Object v3 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).canBuildPrinter();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneId();
    Object v2 = 29;
    Object v3 = false;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendTwoDigitWeekyear((((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneId();
    Object v2 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v3 = 0;
    Object v4 = true;
    Object v5 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = 26L;
    Object v8 = 49;
    Object v9 = 0;
    Object v10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v10));
    Object v12 = 0;
    Object v13 = 49;
    Object v14 = 0;
    Object v15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = java.util.Locale.Category.FORMAT;
    Object v17 = java.util.Locale.getDefault(((java.util.Locale.Category)v16));
    ((org.joda.time.format.DateTimePrinter)v5).printTo(((java.io.Writer)v6),(((java.lang.Long)v7).longValue()),((org.joda.time.Chronology)v11),(((java.lang.Integer)v12).intValue()),((org.joda.time.DateTimeZone)v15),((java.util.Locale)v17));
    Object v18 = null;
    Object v19 = new org.joda.time.format.DateTimeParser[]{null,null,null};
    Object v20 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).append(((org.joda.time.format.DateTimePrinter)v5),((org.joda.time.format.DateTimeParser[])v19));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.format.ISODateTimeFormat.dateElementParser();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).append(((org.joda.time.format.DateTimeFormatter)v1));
    Object v3 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v4 = 25;
    Object v5 = -16;
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendFraction(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v8 = ((org.joda.time.format.DateTimeFormatterBuilder)v6).appendShortText(((org.joda.time.DateTimeFieldType)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneId();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).toParser();
    org.junit.Assert.assertEquals((Object)(org.joda.time.format.DateTimeFormatterBuilder.TimeZoneId.INSTANCE), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendDayOfWeekText();
    Object v2 = 0;
    Object v3 = 2;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendWeekyear((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.joda.time.format.DateTimeFormatterBuilder)v4).toFormatter();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new java.lang.StringBuffer();
    Object v1 = new java.lang.StringBuffer(((java.lang.CharSequence)v0));
    Object v2 = 0;
    org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(((java.lang.StringBuffer)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneId();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendDayOfWeekShortText();
    Object v3 = -12;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendMillisOfDay((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).toPrinter();
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = 1;
    Object v2 = false;
    Object v3 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTwoDigitWeekyear((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.joda.time.format.ISODateTimeFormat.dateElementParser();
    Object v5 = ((org.joda.time.format.DateTimeFormatterBuilder)v3).append(((org.joda.time.format.DateTimeFormatter)v4));
    Object v6 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v7 = ((org.joda.time.format.DateTimeFormatterBuilder)v6).appendDayOfWeekText();
    Object v8 = 0;
    Object v9 = 2;
    Object v10 = ((org.joda.time.format.DateTimeFormatterBuilder)v6).appendWeekyear((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.joda.time.format.DateTimeFormatterBuilder)v10).toFormatter();
    Object v12 = ((org.joda.time.format.DateTimeFormatterBuilder)v5).append(((org.joda.time.format.DateTimeFormatter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendHalfdayOfDayText();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = 19;
    org.joda.time.format.DateTimeFormatterBuilder.printUnknownString(((java.io.Writer)v0),(((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendHalfdayOfDayText();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendHalfdayOfDayText();
    Object v3 = 1;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendHourOfDay((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = 10;
    org.joda.time.format.DateTimeFormatterBuilder.printUnknownString(((java.io.Writer)v0),(((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = -1;
    Object v2 = 1;
    Object v3 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendYearOfCentury((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v2 = 4;
    Object v3 = 0;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendSignedDecimal(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.joda.time.format.DateTimeFormatterBuilder)v4).appendTimeZoneShortName();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.format.ISODateTimeFormat.dateElementParser();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).append(((org.joda.time.format.DateTimeFormatter)v1));
    Object v3 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).toParser();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new java.lang.StringBuffer();
    Object v1 = new java.lang.StringBuffer(((java.lang.CharSequence)v0));
    Object v2 = -42;
    org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(((java.lang.StringBuffer)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v2 = 24;
    Object v3 = -30;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendFraction(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v2 = 24;
    Object v3 = -30;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendFraction(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v5).appendDayOfWeekText();
    Object v7 = 0;
    Object v8 = 2;
    Object v9 = ((org.joda.time.format.DateTimeFormatterBuilder)v5).appendWeekyear((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.DateTimeFormatterBuilder)v9).toFormatter();
    Object v11 = ((org.joda.time.format.DateTimeFormatterBuilder)v4).append(((org.joda.time.format.DateTimeFormatter)v10));
    Object v12 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v13 = ((org.joda.time.format.DateTimeFormatterBuilder)v4).appendText(((org.joda.time.DateTimeFieldType)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendMonthOfYearText();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v2 = -44;
    Object v3 = 3;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendDecimal(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneShortName();
    Object v2 = org.joda.time.format.ISODateTimeFormat.dateElementParser();
    Object v3 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).append(((org.joda.time.format.DateTimeFormatter)v2));
    Object v4 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v5 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendShortText(((org.joda.time.DateTimeFieldType)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.format.ISODateTimeFormat.dateElementParser();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).append(((org.joda.time.format.DateTimeFormatter)v1));
    Object v3 = -47;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendTwoDigitWeekyear((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendMillisOfSecond((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendHalfdayOfDayText();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendHalfdayOfDayText();
    Object v3 = 1;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendHourOfDay((((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v6 = ((org.joda.time.DateTimeFieldType)v5).getDurationType();
    Object v7 = 37;
    Object v8 = ((org.joda.time.format.DateTimeFormatterBuilder)v4).appendFixedSignedDecimal(((org.joda.time.DateTimeFieldType)v5),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendHalfdayOfDayText();
    Object v2 = -11;
    Object v3 = false;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendTwoDigitWeekyear((((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "Invalid min days in first week: ";
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendLiteral(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.format.ISODateTimeFormat.dateElementParser();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).append(((org.joda.time.format.DateTimeFormatter)v1));
    Object v3 = new java.util.TreeMap();
    Object v4 = new java.util.TreeMap(((java.util.SortedMap)v3));
    Object v5 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendTimeZoneShortName(((java.util.Map)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendHalfdayOfDayText();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).toPrinter();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneId();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendDayOfWeekShortText();
    Object v3 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new org.joda.time.format.DateTimeParser[]{null};
    Object v8 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).append(((org.joda.time.format.DateTimePrinter)v6),((org.joda.time.format.DateTimeParser[])v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = 1;
    Object v2 = false;
    Object v3 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTwoDigitWeekyear((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v3).toFormatter();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneId();
    Object v2 = "yyyy-MM-dd'T'HH:mm:ss.SSS";
    Object v3 = "";
    Object v4 = true;
    Object v5 = 0;
    Object v6 = 1;
    Object v7 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendTimeZoneOffset(((java.lang.String)v2),((java.lang.String)v3),(((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v2 = 24;
    Object v3 = -30;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendFraction(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v4).appendClockhourOfHalfday((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = -3;
    Object v2 = 12;
    Object v3 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendCenturyOfEra((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneId();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendDayOfWeekShortText();
    Object v3 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v4 = 18;
    Object v5 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendFixedDecimal(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneId();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendDayOfWeekShortText();
    Object v3 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v4 = 18;
    Object v5 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendFixedDecimal(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v7 = 3;
    Object v8 = 0;
    Object v9 = ((org.joda.time.format.DateTimeFormatterBuilder)v5).appendDecimal(((org.joda.time.DateTimeFieldType)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneId();
    Object v2 = 0;
    Object v3 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendClockhourOfDay((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneShortName();
    Object v2 = org.joda.time.format.ISODateTimeFormat.dateElementParser();
    Object v3 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).append(((org.joda.time.format.DateTimeFormatter)v2));
    Object v4 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v5 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendShortText(((org.joda.time.DateTimeFieldType)v4));
    Object v6 = "The partial must not be null";
    Object v7 = ((org.joda.time.format.DateTimeFormatterBuilder)v5).appendLiteral(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneShortName();
    Object v2 = -9;
    Object v3 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendHourOfDay((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneId();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendDayOfWeekShortText();
    Object v3 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v4 = 18;
    Object v5 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendFixedDecimal(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v7 = 49;
    Object v8 = 0;
    Object v9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9));
    Object v11 = ((org.joda.time.DateTimeFieldType)v6).isSupported(((org.joda.time.Chronology)v10));
    Object v12 = -47;
    Object v13 = ((org.joda.time.format.DateTimeFormatterBuilder)v5).appendFixedDecimal(((org.joda.time.DateTimeFieldType)v6),(((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneShortName();
    Object v2 = "-";
    Object v3 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendLiteral(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendHalfdayOfDayText();
    Object v2 = -11;
    Object v3 = false;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendTwoDigitWeekyear((((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "Invalid min days in first week: ";
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendLiteral(((java.lang.String)v5));
    Object v7 = new java.util.TreeMap();
    Object v8 = ((org.joda.time.format.DateTimeFormatterBuilder)v6).appendTimeZoneName(((java.util.Map)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneShortName();
    Object v2 = "-";
    Object v3 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendLiteral(((java.lang.String)v2));
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v3).canBuildFormatter();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneId();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendEraText();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneId();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendDayOfWeekShortText();
    Object v3 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v4 = 18;
    Object v5 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendFixedDecimal(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "Too many time zone ids";
    Object v7 = ((org.joda.time.format.DateTimeFormatterBuilder)v5).appendLiteral(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.format.ISODateTimeFormat.dateElementParser();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).append(((org.joda.time.format.DateTimeFormatter)v1));
    Object v3 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v4 = 49;
    Object v5 = 0;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v6));
    Object v8 = ((org.joda.time.DateTimeFieldType)v3).isSupported(((org.joda.time.Chronology)v7));
    Object v9 = -3;
    Object v10 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendFixedDecimal(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v2 = 24;
    Object v3 = -30;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendFraction(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v4).appendDayOfWeek((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendHalfdayOfDayText();
    Object v2 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v3 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendTimeZoneId();
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v3).toParser();
    Object v5 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v6 = org.joda.time.format.ISODateTimeFormat.dateElementParser();
    Object v7 = ((org.joda.time.format.DateTimeFormatterBuilder)v5).append(((org.joda.time.format.DateTimeFormatter)v6));
    Object v8 = ((org.joda.time.format.DateTimeFormatterBuilder)v7).toParser();
    Object v9 = 1L;
    Object v10 = 49;
    Object v11 = 0;
    Object v12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v12));
    Object v14 = java.util.Locale.Category.FORMAT;
    Object v15 = java.util.Locale.getDefault(((java.util.Locale.Category)v14));
    Object v16 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v9).longValue()),((org.joda.time.Chronology)v13),((java.util.Locale)v15));
    Object v17 = "The";
    Object v18 = 0;
    Object v19 = ((org.joda.time.format.DateTimeParser)v8).parseInto(((org.joda.time.format.DateTimeParserBucket)v16),((java.lang.String)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).append(((org.joda.time.format.DateTimePrinter)v4),((org.joda.time.format.DateTimeParser)v8));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = 0;
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendClockhourOfDay((((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v4 = 33;
    Object v5 = -26;
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendFraction(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v8 = 1;
    Object v9 = 0;
    Object v10 = ((org.joda.time.format.DateTimeFormatterBuilder)v6).appendDecimal(((org.joda.time.DateTimeFieldType)v7),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneId();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendDayOfWeekShortText();
    Object v3 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v4 = 18;
    Object v5 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendFixedDecimal(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v7 = 3;
    Object v8 = 0;
    Object v9 = ((org.joda.time.format.DateTimeFormatterBuilder)v5).appendDecimal(((org.joda.time.DateTimeFieldType)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.DateTimeFormatterBuilder)v9).toFormatter();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.format.ISODateTimeFormat.dateElementParser();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).append(((org.joda.time.format.DateTimeFormatter)v1));
    Object v3 = -47;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendTwoDigitWeekyear((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendMillisOfSecond((((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v8 = 1;
    Object v9 = false;
    Object v10 = ((org.joda.time.format.DateTimeFormatterBuilder)v7).appendTwoDigitWeekyear((((java.lang.Integer)v8).intValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.joda.time.format.DateTimeFormatterBuilder)v10).toFormatter();
    Object v12 = ((org.joda.time.format.DateTimeFormatterBuilder)v6).append(((org.joda.time.format.DateTimeFormatter)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendHalfdayOfDayText();
    Object v2 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v3 = 49;
    Object v4 = 0;
    Object v5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v5));
    Object v7 = ((org.joda.time.DateTimeFieldType)v2).getField(((org.joda.time.Chronology)v6));
    Object v8 = 8;
    Object v9 = 6;
    Object v10 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendSignedDecimal(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new java.lang.StringBuffer();
    Object v1 = new java.lang.StringBuffer(((java.lang.CharSequence)v0));
    Object v2 = 21;
    org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(((java.lang.StringBuffer)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendHalfdayOfDayText();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendHalfdayOfDayText();
    Object v3 = 1;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendHourOfDay((((java.lang.Integer)v3).intValue()));
    Object v5 = -53;
    Object v6 = -14;
    Object v7 = ((org.joda.time.format.DateTimeFormatterBuilder)v4).appendWeekyear((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendHalfdayOfDayText();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendHalfdayOfDayText();
    Object v3 = 1;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendHourOfDay((((java.lang.Integer)v3).intValue()));
    Object v5 = "";
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v4).appendPattern(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendHalfdayOfDayText();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendHalfdayOfDayText();
    Object v3 = 1;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendHourOfDay((((java.lang.Integer)v3).intValue()));
    Object v5 = 27;
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v4).appendMinuteOfDay((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = 1;
    Object v2 = false;
    Object v3 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTwoDigitWeekyear((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v3).appendMonthOfYearShortText();
    Object v5 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v6 = 0;
    Object v7 = ((org.joda.time.format.DateTimeFormatterBuilder)v3).appendFixedDecimal(((org.joda.time.DateTimeFieldType)v5),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.format.ISODateTimeFormat.dateElementParser();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).append(((org.joda.time.format.DateTimeFormatter)v1));
    Object v3 = -47;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendTwoDigitWeekyear((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendMillisOfSecond((((java.lang.Integer)v5).intValue()));
    Object v7 = 2;
    Object v8 = 1;
    Object v9 = ((org.joda.time.format.DateTimeFormatterBuilder)v6).appendFractionOfHour((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneId();
    Object v2 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v3 = 1;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendFixedSignedDecimal(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v2 = 24;
    Object v3 = -30;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendFraction(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 2;
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v4).appendTwoDigitWeekyear((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendText(((org.joda.time.DateTimeFieldType)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = new java.util.TreeMap();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneName(((java.util.Map)v1));
    Object v3 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendShortText(((org.joda.time.DateTimeFieldType)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v2 = 49;
    Object v3 = 0;
    Object v4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v4));
    Object v6 = ((org.joda.time.DateTimeFieldType)v1).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendText(((org.joda.time.DateTimeFieldType)v1));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = new java.util.TreeMap();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneName(((java.util.Map)v1));
    Object v3 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendShortText(((org.joda.time.DateTimeFieldType)v3));
    Object v5 = ((org.joda.time.format.DateTimeFormatterBuilder)v4).toFormatter();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = 1;
    Object v2 = false;
    Object v3 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTwoDigitWeekyear((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v5 = 49;
    Object v6 = 0;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v7));
    Object v9 = ((org.joda.time.DateTimeFieldType)v4).isSupported(((org.joda.time.Chronology)v8));
    Object v10 = -29;
    Object v11 = ((org.joda.time.format.DateTimeFormatterBuilder)v3).appendFixedSignedDecimal(((org.joda.time.DateTimeFieldType)v4),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendText(((org.joda.time.DateTimeFieldType)v1));
    Object v3 = 5;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendClockhourOfDay((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendDayOfWeekText();
    Object v2 = 0;
    Object v3 = 2;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendWeekyear((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "]o";
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v4).appendPattern(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendMonthOfYearText();
    Object v2 = 2;
    Object v3 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendHourOfHalfday((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneId();
    Object v2 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v3 = 1;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendFixedSignedDecimal(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v4).appendSecondOfMinute((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendHalfdayOfDayText();
    Object v2 = -25;
    Object v3 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendDayOfYear((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new java.lang.StringBuffer();
    Object v1 = new java.lang.StringBuffer(((java.lang.CharSequence)v0));
    Object v2 = 34;
    org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(((java.lang.StringBuffer)v1),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendText(((org.joda.time.DateTimeFieldType)v1));
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendYear((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendHalfdayOfDayText();
    Object v2 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v3 = 1;
    Object v4 = false;
    Object v5 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendTwoDigitWeekyear((((java.lang.Integer)v3).intValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v5).toFormatter();
    Object v7 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).append(((org.joda.time.format.DateTimeFormatter)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v2 = 4;
    Object v3 = 0;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendSignedDecimal(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v4).appendHourOfDay((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.joda.time.format.DateTimeFormatterBuilder)v4).toPrinter();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new java.lang.StringBuffer();
    Object v1 = new java.lang.StringBuffer(((java.lang.CharSequence)v0));
    Object v2 = "Field must not be null";
    Object v3 = ((java.lang.StringBuffer)v1).lastIndexOf(((java.lang.String)v2));
    Object v4 = 0;
    org.joda.time.format.DateTimeFormatterBuilder.appendUnknownString(((java.lang.StringBuffer)v1),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendMonthOfYearText();
    Object v2 = 0;
    Object v3 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendSecondOfMinute((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneId();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendDayOfWeekShortText();
    Object v3 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v4 = 0;
    Object v5 = true;
    Object v6 = new org.joda.time.format.DateTimeFormatterBuilder.FixedNumber(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new org.joda.time.format.DateTimeParser[]{null,null};
    Object v8 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).append(((org.joda.time.format.DateTimePrinter)v6),((org.joda.time.format.DateTimeParser[])v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneShortName();
    Object v2 = org.joda.time.format.ISODateTimeFormat.dateElementParser();
    Object v3 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).append(((org.joda.time.format.DateTimeFormatter)v2));
    Object v4 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v5 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendShortText(((org.joda.time.DateTimeFieldType)v4));
    Object v6 = "The partial must not be null";
    Object v7 = ((org.joda.time.format.DateTimeFormatterBuilder)v5).appendLiteral(((java.lang.String)v6));
    Object v8 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v9 = -21;
    Object v10 = 1;
    Object v11 = ((org.joda.time.format.DateTimeFormatterBuilder)v7).appendSignedDecimal(((org.joda.time.DateTimeFieldType)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendText(((org.joda.time.DateTimeFieldType)v1));
    Object v3 = 0;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendSecondOfMinute((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).toFormatter();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneShortName();
    Object v2 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v3 = -47;
    Object v4 = 0;
    Object v5 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendDecimal(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.format.ISODateTimeFormat.dateElementParser();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).append(((org.joda.time.format.DateTimeFormatter)v1));
    Object v3 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v4 = 25;
    Object v5 = -16;
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendFraction(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v8 = ((org.joda.time.format.DateTimeFormatterBuilder)v6).appendShortText(((org.joda.time.DateTimeFieldType)v7));
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = ((org.joda.time.format.DateTimeFormatterBuilder)v8).appendFractionOfDay((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.format.ISODateTimeFormat.dateElementParser();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).append(((org.joda.time.format.DateTimeFormatter)v1));
    Object v3 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v4 = 25;
    Object v5 = -16;
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendFraction(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.joda.time.format.DateTimeFormatterBuilder)v6).appendDayOfWeekText();
    Object v8 = 11;
    Object v9 = ((org.joda.time.format.DateTimeFormatterBuilder)v6).appendSecondOfDay((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v2 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendText(((org.joda.time.DateTimeFieldType)v1));
    Object v3 = 5;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v2).appendClockhourOfDay((((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v6 = 4;
    Object v7 = ((org.joda.time.format.DateTimeFormatterBuilder)v4).appendFixedDecimal(((org.joda.time.DateTimeFieldType)v5),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v2 = 49;
    Object v3 = 0;
    Object v4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v4));
    Object v6 = ((org.joda.time.DateTimeFieldType)v1).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendText(((org.joda.time.DateTimeFieldType)v1));
    Object v8 = ((org.joda.time.format.DateTimeFormatterBuilder)v7).toParser();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.joda.time.format.DateTimeFormatterBuilder();
    Object v1 = ((org.joda.time.format.DateTimeFormatterBuilder)v0).appendTimeZoneId();
    Object v2 = 29;
    Object v3 = false;
    Object v4 = ((org.joda.time.format.DateTimeFormatterBuilder)v1).appendTwoDigitWeekyear((((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 21;
    Object v6 = ((org.joda.time.format.DateTimeFormatterBuilder)v4).appendMillisOfSecond((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }
}
