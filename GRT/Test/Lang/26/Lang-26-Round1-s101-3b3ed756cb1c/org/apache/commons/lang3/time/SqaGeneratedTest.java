package org.apache.commons.lang3.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = true;
    Object v2 = -11;
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "nll";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(((java.util.TimeZone)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((java.util.Locale)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "i";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = ((java.util.TimeZone)v1).useDaylightTime();
    Object v3 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = 48;
    Object v1 = -25;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = ((java.util.TimeZone)v0).useDaylightTime();
    Object v2 = true;
    Object v3 = 1;
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "nll";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(((java.util.TimeZone)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v7));
    org.junit.Assert.assertEquals((Object)("Pacific Daylight Time"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 1;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = "nll";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateFormat)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(717449796), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 1;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = "nll";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = 11;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v5).parseObject(((java.lang.String)v6),((java.text.ParsePosition)v8));
    ((org.apache.commons.lang3.time.FastDateFormat)v5).init();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = "nll";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = new int[]{0,21};
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v5).parseToken(((java.lang.String)v6),((int[])v7));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "Windows 4";
    ((java.util.TimeZone)v2).setID(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = "]";
    Object v6 = "u";
    Object v7 = "nll";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "Windows 4";
    ((java.util.TimeZone)v2).setID(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = "]";
    Object v6 = "u";
    Object v7 = "nll";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v8));
    Object v10 = -16L;
    Object v11 = 1;
    Object v12 = new java.lang.StringBuffer((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.lang3.time.FastDateFormat)v9).format((((java.lang.Long)v10).longValue()),((java.lang.StringBuffer)v12));
    Object v14 = java.time.Instant.now();
    Object v15 = java.util.Date.from(((java.time.Instant)v14));
    Object v16 = org.apache.commons.lang3.time.DateUtils.toCalendar(((java.util.Date)v15));
    Object v17 = ((java.util.Calendar)v16).getCalendarType();
    Object v18 = 1;
    Object v19 = new java.lang.StringBuffer((((java.lang.Integer)v18).intValue()));
    Object v20 = ((org.apache.commons.lang3.time.FastDateFormat)v9).applyRules(((java.util.Calendar)v16),((java.lang.StringBuffer)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "Windows 4";
    ((java.util.TimeZone)v2).setID(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = "]";
    Object v6 = "u";
    Object v7 = "nll";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v8));
    Object v10 = 1;
    Object v11 = new java.lang.StringBuffer((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = new java.lang.StringBuffer((((java.lang.Integer)v12).intValue()));
    Object v14 = -27;
    Object v15 = new java.text.FieldPosition((((java.lang.Integer)v14).intValue()));
    Object v16 = -7;
    ((java.text.FieldPosition)v15).setEndIndex((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = ((org.apache.commons.lang3.time.FastDateFormat)v9).format(((java.lang.Object)v11),((java.lang.StringBuffer)v13),((java.text.FieldPosition)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "Windows 4";
    ((java.util.TimeZone)v2).setID(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = "]";
    Object v6 = "u";
    Object v7 = "nll";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v8));
    Object v10 = java.time.Instant.now();
    Object v11 = java.util.Date.from(((java.time.Instant)v10));
    Object v12 = org.apache.commons.lang3.time.DateUtils.toCalendar(((java.util.Date)v11));
    Object v13 = ((org.apache.commons.lang3.time.FastDateFormat)v9).format(((java.util.Calendar)v12));
    org.junit.Assert.assertEquals((Object)("26 Oct 4, Sun 18:41:04 GMT-07:00"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = false;
    Object v2 = 0;
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "nll";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(((java.util.TimeZone)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((java.util.Locale)v6));
    org.junit.Assert.assertEquals((Object)("PST"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "Windows 4";
    ((java.util.TimeZone)v2).setID(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = "]";
    Object v6 = "u";
    Object v7 = "nll";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v8));
    Object v10 = java.time.Instant.now();
    Object v11 = java.util.Date.from(((java.time.Instant)v10));
    Object v12 = 1;
    Object v13 = new java.lang.StringBuffer((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.lang3.time.FastDateFormat)v9).format(((java.util.Date)v11),((java.lang.StringBuffer)v13));
    Object v15 = java.time.Instant.now();
    Object v16 = java.util.Date.from(((java.time.Instant)v15));
    Object v17 = 1;
    Object v18 = new java.lang.StringBuffer((((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.lang3.time.FastDateFormat)v9).format(((java.util.Date)v16),((java.lang.StringBuffer)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "Windows 4";
    ((java.util.TimeZone)v2).setID(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = "]";
    Object v6 = "u";
    Object v7 = "nll";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v8));
    Object v10 = java.time.Instant.now();
    Object v11 = java.util.Date.from(((java.time.Instant)v10));
    Object v12 = ((org.apache.commons.lang3.time.FastDateFormat)v9).format(((java.util.Date)v11));
    org.junit.Assert.assertEquals((Object)("26 Oct 4, Sun 18:41:04 GMT-07:00"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "Windows 4";
    ((java.util.TimeZone)v2).setID(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = "]";
    Object v6 = "u";
    Object v7 = "nll";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v8));
    Object v10 = java.time.Instant.now();
    Object v11 = java.util.Date.from(((java.time.Instant)v10));
    Object v12 = org.apache.commons.lang3.time.DateUtils.toCalendar(((java.util.Date)v11));
    Object v13 = 1;
    Object v14 = new java.lang.StringBuffer((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.lang3.time.FastDateFormat)v9).format(((java.util.Calendar)v12),((java.lang.StringBuffer)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "&rAfrr;";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 0;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.Instant.now();
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = ((java.text.Format)v1).format(((java.lang.Object)v3));
    ((org.apache.commons.lang3.time.FastDateFormat)v1).init();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = "";
    Object v8 = 11;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((java.text.Format)v6).parseObject(((java.lang.String)v7),((java.text.ParsePosition)v9));
    Object v11 = "";
    Object v12 = ((java.text.Format)v6).parseObject(((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.Instant.now();
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = org.apache.commons.lang3.time.DateUtils.toCalendar(((java.util.Date)v3));
    Object v5 = 1;
    Object v6 = new java.lang.StringBuffer((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v1).format(((java.util.Calendar)v4),((java.lang.StringBuffer)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = 26;
    Object v1 = -16;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "nll";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = "\u00ba";
    Object v3 = 11;
    Object v4 = new java.text.ParsePosition((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.text.Format)v1).parseObject(((java.lang.String)v2),((java.text.ParsePosition)v4));
    Object v6 = "g]";
    Object v7 = ((java.text.Format)v1).parseObject(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).getTimeZoneOverridesCalendar();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = 0L;
    Object v3 = ((org.apache.commons.lang3.time.FastDateFormat)v1).format((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)("4:00:00 PM Pacific Standard Time"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.lang3.time.FastDateFormat)v1).parsePattern();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = -31;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = java.time.Instant.now();
    Object v8 = java.util.Date.from(((java.time.Instant)v7));
    Object v9 = org.apache.commons.lang3.time.DateUtils.toCalendar(((java.util.Date)v8));
    Object v10 = 1;
    Object v11 = ((java.util.Calendar)v9).getActualMinimum((((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = java.util.TimeZone.getDefault();
    Object v15 = "Windows 4";
    ((java.util.TimeZone)v14).setID(((java.lang.String)v15));
    Object v16 = null;
    Object v17 = "]";
    Object v18 = "u";
    Object v19 = "nll";
    Object v20 = new java.util.Locale(((java.lang.String)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),((java.util.TimeZone)v14),((java.util.Locale)v20));
    Object v22 = java.time.Instant.now();
    Object v23 = java.util.Date.from(((java.time.Instant)v22));
    Object v24 = 1;
    Object v25 = new java.lang.StringBuffer((((java.lang.Integer)v24).intValue()));
    Object v26 = ((org.apache.commons.lang3.time.FastDateFormat)v21).format(((java.util.Date)v23),((java.lang.StringBuffer)v25));
    Object v27 = java.time.Instant.now();
    Object v28 = java.util.Date.from(((java.time.Instant)v27));
    Object v29 = 1;
    Object v30 = new java.lang.StringBuffer((((java.lang.Integer)v29).intValue()));
    Object v31 = ((org.apache.commons.lang3.time.FastDateFormat)v21).format(((java.util.Date)v28),((java.lang.StringBuffer)v30));
    Object v32 = ((org.apache.commons.lang3.time.FastDateFormat)v6).format(((java.util.Calendar)v9),((java.lang.StringBuffer)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    ((org.apache.commons.lang3.time.FastDateFormat)v1).init();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.Instant.now();
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = 1;
    Object v5 = new java.lang.StringBuffer((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.lang3.time.FastDateFormat)v1).format(((java.util.Date)v3),((java.lang.StringBuffer)v5));
    Object v7 = "+\u2030";
    Object v8 = new int[]{97,0,1};
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v1).parseToken(((java.lang.String)v7),((int[])v8));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).toString();
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v6).parsePattern();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(-160861589), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.Locale)v5));
    Object v7 = 11;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new java.lang.StringBuffer((((java.lang.Integer)v9).intValue()));
    Object v11 = -27;
    Object v12 = new java.text.FieldPosition((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.lang3.time.FastDateFormat)v6).format(((java.lang.Object)v8),((java.lang.StringBuffer)v10),((java.text.FieldPosition)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.Locale)v5));
    Object v7 = java.time.Instant.now();
    Object v8 = java.util.Date.from(((java.time.Instant)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v6).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = -36L;
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v6).format((((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 0;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = "nll";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = java.time.Instant.now();
    Object v8 = java.util.Date.from(((java.time.Instant)v7));
    Object v9 = 1;
    Object v10 = new java.lang.StringBuffer((((java.lang.Integer)v9).intValue()));
    Object v11 = -27;
    Object v12 = new java.text.FieldPosition((((java.lang.Integer)v11).intValue()));
    Object v13 = ((java.text.Format)v6).format(((java.lang.Object)v8),((java.lang.StringBuffer)v10),((java.text.FieldPosition)v12));
    Object v14 = 0;
    Object v15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.lang3.time.FastDateFormat)v15).parsePattern();
    Object v17 = ((java.text.Format)v6).formatToCharacterIterator(((java.lang.Object)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = java.time.Instant.now();
    Object v8 = java.util.Date.from(((java.time.Instant)v7));
    Object v9 = org.apache.commons.lang3.time.DateUtils.toCalendar(((java.util.Date)v8));
    Object v10 = 0;
    Object v11 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v10).intValue()));
    Object v12 = java.time.Instant.now();
    Object v13 = java.util.Date.from(((java.time.Instant)v12));
    Object v14 = org.apache.commons.lang3.time.DateUtils.toCalendar(((java.util.Date)v13));
    Object v15 = 1;
    Object v16 = new java.lang.StringBuffer((((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.apache.commons.lang3.time.FastDateFormat)v11).format(((java.util.Calendar)v14),((java.lang.StringBuffer)v16));
    Object v18 = "f";
    Object v19 = 2;
    Object v20 = ((java.lang.StringBuffer)v17).indexOf(((java.lang.String)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.apache.commons.lang3.time.FastDateFormat)v6).applyRules(((java.util.Calendar)v9),((java.lang.StringBuffer)v17));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).getTimeZone();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 2;
    Object v1 = "";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "nll";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "nll";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v8),((java.util.Locale)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = "";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "nll";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "nll";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v8),((java.util.Locale)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = 33;
    Object v1 = "";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "nll";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "nll";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v8),((java.util.Locale)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.Locale)v5));
    Object v7 = "";
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "nll";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v7),((java.util.TimeZone)v8),((java.util.Locale)v12));
    Object v14 = ((org.apache.commons.lang3.time.FastDateFormat)v13).getTimeZone();
    Object v15 = 1;
    Object v16 = new java.lang.StringBuffer((((java.lang.Integer)v15).intValue()));
    Object v17 = -27;
    Object v18 = new java.text.FieldPosition((((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.lang3.time.FastDateFormat)v6).format(((java.lang.Object)v14),((java.lang.StringBuffer)v16),((java.text.FieldPosition)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 0;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = "nll";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v6 = java.time.Instant.now();
    Object v7 = java.util.Date.from(((java.time.Instant)v6));
    Object v8 = org.apache.commons.lang3.time.DateUtils.toCalendar(((java.util.Date)v7));
    Object v9 = 1;
    Object v10 = new java.lang.StringBuffer((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang3.time.FastDateFormat)v5).format(((java.util.Calendar)v8),((java.lang.StringBuffer)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 2;
    Object v1 = "";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "nll";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "nll";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v8),((java.util.Locale)v12));
    Object v14 = ((org.apache.commons.lang3.time.FastDateFormat)v13).parsePattern();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "nll";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "nll";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((java.util.Locale)v12).getDisplayName();
    Object v14 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v8),((java.util.Locale)v12));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = -44;
    Object v1 = "";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "nll";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "nll";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "]";
    Object v14 = "u";
    Object v15 = "nll";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((java.util.Locale)v12).getDisplayName(((java.util.Locale)v16));
    Object v18 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v8),((java.util.Locale)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.Locale)v5));
    Object v7 = java.time.Instant.now();
    Object v8 = java.util.Date.from(((java.time.Instant)v7));
    Object v9 = 1;
    Object v10 = new java.lang.StringBuffer((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang3.time.FastDateFormat)v6).format(((java.util.Date)v8),((java.lang.StringBuffer)v10));
    Object v12 = "\u03b9";
    Object v13 = 11;
    Object v14 = new java.text.ParsePosition((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.lang3.time.FastDateFormat)v6).parseObject(((java.lang.String)v12),((java.text.ParsePosition)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 0;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = "nll";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateFormat)v5).hashCode();
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(672992650), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = "\u00b7";
    Object v8 = 11;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang3.time.FastDateFormat)v6).parseObject(((java.lang.String)v7),((java.text.ParsePosition)v9));
    Object v11 = ((org.apache.commons.lang3.time.FastDateFormat)v6).getLocale();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "&pound;";
    Object v1 = "";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "nll";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v9 = 1;
    Object v10 = java.util.TimeZone.getDefault();
    Object v11 = "]";
    Object v12 = "u";
    Object v13 = "nll";
    Object v14 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v9).intValue()),((java.util.TimeZone)v10),((java.util.Locale)v14));
    Object v16 = "\u00b7";
    Object v17 = 11;
    Object v18 = new java.text.ParsePosition((((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.lang3.time.FastDateFormat)v15).parseObject(((java.lang.String)v16),((java.text.ParsePosition)v18));
    Object v20 = ((org.apache.commons.lang3.time.FastDateFormat)v15).getLocale();
    Object v21 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v8),((java.util.Locale)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = "nll";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = "]";
    Object v9 = "u";
    Object v10 = "nll";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v6),((java.util.TimeZone)v7),((java.util.Locale)v11));
    Object v13 = ((org.apache.commons.lang3.time.FastDateFormat)v12).hashCode();
    Object v14 = 1;
    Object v15 = new java.lang.StringBuffer((((java.lang.Integer)v14).intValue()));
    Object v16 = "";
    Object v17 = ((java.lang.StringBuffer)v15).append(((java.lang.String)v16));
    Object v18 = -27;
    Object v19 = new java.text.FieldPosition((((java.lang.Integer)v18).intValue()));
    Object v20 = ((org.apache.commons.lang3.time.FastDateFormat)v5).format(((java.lang.Object)v13),((java.lang.StringBuffer)v15),((java.text.FieldPosition)v19));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.Instant.now();
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = org.apache.commons.lang3.time.DateUtils.toCalendar(((java.util.Date)v3));
    Object v5 = 1;
    Object v6 = new java.lang.StringBuffer((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v1).format(((java.util.Calendar)v4),((java.lang.StringBuffer)v6));
    Object v8 = java.time.Instant.now();
    Object v9 = java.util.Date.from(((java.time.Instant)v8));
    Object v10 = org.apache.commons.lang3.time.DateUtils.toCalendar(((java.util.Date)v9));
    Object v11 = ((org.apache.commons.lang3.time.FastDateFormat)v1).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = -65;
    Object v2 = "";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "nll";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v8).getTimeZone();
    Object v10 = "]";
    Object v11 = "u";
    Object v12 = "nll";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v9),((java.util.Locale)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 2;
    Object v1 = "";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "nll";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "nll";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v8),((java.util.Locale)v12));
    Object v14 = ((org.apache.commons.lang3.time.FastDateFormat)v13).hashCode();
    org.junit.Assert.assertEquals((Object)(842514357), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).getMaxLengthEstimate();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = -27;
    Object v8 = new java.text.FieldPosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v6).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 0;
    Object v1 = "";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "nll";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "nll";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v8),((java.util.Locale)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = java.time.Instant.now();
    Object v8 = java.util.Date.from(((java.time.Instant)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v6).format(((java.util.Date)v8));
    org.junit.Assert.assertEquals((Object)("26 Oct 4"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 0;
    Object v1 = "";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "nll";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "nll";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v8),((java.util.Locale)v12));
    Object v14 = "Could not truncate";
    Object v15 = new int[]{15,-24,-38};
    Object v16 = ((org.apache.commons.lang3.time.FastDateFormat)v13).parseToken(((java.lang.String)v14),((int[])v15));
    org.junit.Assert.assertEquals((Object)("a"), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.lang3.time.FastDateFormat)v1).getLocale();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = "&e";
    Object v8 = 11;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang3.time.FastDateFormat)v6).parseObject(((java.lang.String)v7),((java.text.ParsePosition)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 0;
    Object v1 = "";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "nll";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "nll";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v8),((java.util.Locale)v12));
    Object v14 = ((org.apache.commons.lang3.time.FastDateFormat)v13).getPattern();
    org.junit.Assert.assertEquals((Object)("HH:mm:ss zzzz"), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = 0;
    Object v8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v8).getLocale();
    Object v10 = 1;
    Object v11 = new java.lang.StringBuffer((((java.lang.Integer)v10).intValue()));
    Object v12 = -27;
    Object v13 = new java.text.FieldPosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.lang3.time.FastDateFormat)v6).format(((java.lang.Object)v9),((java.lang.StringBuffer)v11),((java.text.FieldPosition)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = "t";
    Object v3 = ((java.text.Format)v1).parseObject(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 0;
    Object v1 = "";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "nll";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "nll";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v8),((java.util.Locale)v12));
    ((org.apache.commons.lang3.time.FastDateFormat)v13).init();
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.lang3.time.FastDateFormat)v1).getTimeZone();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = "nll";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v6 = ":";
    Object v7 = ((java.text.Format)v5).parseObject(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 0;
    Object v1 = "";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "nll";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "nll";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v8),((java.util.Locale)v12));
    Object v14 = java.time.Instant.now();
    Object v15 = java.util.Date.from(((java.time.Instant)v14));
    Object v16 = org.apache.commons.lang3.time.DateUtils.toCalendar(((java.util.Date)v15));
    Object v17 = 0;
    Object v18 = 0;
    Object v19 = java.util.TimeZone.getDefault();
    Object v20 = "Windows 4";
    ((java.util.TimeZone)v19).setID(((java.lang.String)v20));
    Object v21 = null;
    Object v22 = "]";
    Object v23 = "u";
    Object v24 = "nll";
    Object v25 = new java.util.Locale(((java.lang.String)v22),((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),((java.util.TimeZone)v19),((java.util.Locale)v25));
    Object v27 = java.time.Instant.now();
    Object v28 = java.util.Date.from(((java.time.Instant)v27));
    Object v29 = 1;
    Object v30 = new java.lang.StringBuffer((((java.lang.Integer)v29).intValue()));
    Object v31 = ((org.apache.commons.lang3.time.FastDateFormat)v26).format(((java.util.Date)v28),((java.lang.StringBuffer)v30));
    Object v32 = java.time.Instant.now();
    Object v33 = java.util.Date.from(((java.time.Instant)v32));
    Object v34 = 1;
    Object v35 = new java.lang.StringBuffer((((java.lang.Integer)v34).intValue()));
    Object v36 = ((org.apache.commons.lang3.time.FastDateFormat)v26).format(((java.util.Date)v33),((java.lang.StringBuffer)v35));
    Object v37 = ((org.apache.commons.lang3.time.FastDateFormat)v13).applyRules(((java.util.Calendar)v16),((java.lang.StringBuffer)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).getTimeZone();
    Object v8 = ((java.util.TimeZone)v7).clone();
    Object v9 = false;
    Object v10 = 69;
    Object v11 = 0;
    Object v12 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.lang3.time.FastDateFormat)v12).getLocale();
    Object v14 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(((java.util.TimeZone)v7),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Integer)v10).intValue()),((java.util.Locale)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.lang3.time.FastDateFormat)v2).getTimeZone();
    Object v4 = 0;
    Object v5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.lang3.time.FastDateFormat)v5).getLocale();
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v3),((java.util.Locale)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.lang3.time.FastDateFormat)v2).getTimeZone();
    Object v4 = 0;
    Object v5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.lang3.time.FastDateFormat)v5).getLocale();
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v3),((java.util.Locale)v6));
    Object v8 = ((java.text.Format)v7).clone();
    Object v9 = "p";
    Object v10 = ((java.text.Format)v7).parseObject(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = java.time.Instant.now();
    Object v8 = java.util.Date.from(((java.time.Instant)v7));
    Object v9 = org.apache.commons.lang3.time.DateUtils.toCalendar(((java.util.Date)v8));
    Object v10 = 1;
    Object v11 = new java.lang.StringBuffer((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang3.time.FastDateFormat)v6).applyRules(((java.util.Calendar)v9),((java.lang.StringBuffer)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = 74;
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.lang3.time.FastDateFormat)v3).getTimeZone();
    Object v5 = 0;
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).getLocale();
    Object v8 = ((java.util.Locale)v7).getUnicodeLocaleAttributes();
    Object v9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v4),((java.util.Locale)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = "";
    Object v4 = ((java.text.Format)v1).parseObject(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.lang3.time.FastDateFormat)v2).getTimeZone();
    Object v4 = 0;
    Object v5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.lang3.time.FastDateFormat)v5).getLocale();
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v3),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getMaxLengthEstimate();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "nll";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = "";
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang3.time.FastDateFormat)v9).getTimeZone();
    Object v11 = 0;
    Object v12 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.lang3.time.FastDateFormat)v12).getLocale();
    Object v14 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v7),((java.util.TimeZone)v10),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.lang3.time.FastDateFormat)v6).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "v";
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.lang3.time.FastDateFormat)v2).getTimeZone();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "nll";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((java.util.Locale)v7).getExtensionKeys();
    Object v9 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v3),((java.util.Locale)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.lang3.time.FastDateFormat)v1).getTimeZone();
    Object v3 = true;
    Object v4 = 5;
    Object v5 = "]";
    Object v6 = "u";
    Object v7 = "nll";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(((java.util.TimeZone)v2),(((java.lang.Boolean)v3).booleanValue()),(((java.lang.Integer)v4).intValue()),((java.util.Locale)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.lang3.time.FastDateFormat)v2).getTimeZone();
    Object v4 = 0;
    Object v5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.lang3.time.FastDateFormat)v5).getLocale();
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v3),((java.util.Locale)v6));
    Object v8 = java.time.Instant.now();
    Object v9 = java.util.Date.from(((java.time.Instant)v8));
    Object v10 = org.apache.commons.lang3.time.DateUtils.toCalendar(((java.util.Date)v9));
    Object v11 = 1;
    Object v12 = new java.lang.StringBuffer((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.lang3.time.FastDateFormat)v7).format(((java.util.Calendar)v10),((java.lang.StringBuffer)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.lang3.time.FastDateFormat)v2).getTimeZone();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "nll";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "]";
    Object v9 = "u";
    Object v10 = "nll";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((java.util.Locale)v7).getDisplayScript(((java.util.Locale)v11));
    Object v13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v3),((java.util.Locale)v7));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.lang3.time.FastDateFormat)v2).getTimeZone();
    Object v4 = 0;
    Object v5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.lang3.time.FastDateFormat)v5).getLocale();
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v3),((java.util.Locale)v6));
    Object v8 = 0L;
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v7).format((((java.lang.Long)v8).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = -40;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.lang3.time.FastDateFormat)v2).getTimeZone();
    Object v4 = 0;
    Object v5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.lang3.time.FastDateFormat)v5).getLocale();
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v3),((java.util.Locale)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "The Array must not be null";
    Object v1 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = -1;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.lang3.time.FastDateFormat)v2).getTimeZone();
    Object v4 = false;
    Object v5 = 0;
    Object v6 = ((java.util.TimeZone)v3).getDisplayName((((java.lang.Boolean)v4).booleanValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.lang3.time.FastDateFormat)v2).getTimeZone();
    Object v4 = 0;
    Object v5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.lang3.time.FastDateFormat)v5).getLocale();
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v3),((java.util.Locale)v6));
    Object v8 = "Elements in a range must not be null: element1=";
    Object v9 = 11;
    Object v10 = new java.text.ParsePosition((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang3.time.FastDateFormat)v7).parseObject(((java.lang.String)v8),((java.text.ParsePosition)v10));
    ((org.apache.commons.lang3.time.FastDateFormat)v7).init();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "Stopwatch must";
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.lang3.time.FastDateFormat)v2).getTimeZone();
    Object v4 = ((java.util.TimeZone)v3).getRawOffset();
    Object v5 = 0;
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).getLocale();
    Object v8 = ((java.util.Locale)v7).getDisplayScript();
    Object v9 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v3),((java.util.Locale)v7));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.lang3.time.FastDateFormat)v2).getTimeZone();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "nll";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "]";
    Object v9 = "u";
    Object v10 = "nll";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((java.util.Locale)v7).getDisplayScript(((java.util.Locale)v11));
    Object v13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v14 = java.time.Instant.now();
    Object v15 = java.util.Date.from(((java.time.Instant)v14));
    Object v16 = org.apache.commons.lang3.time.DateUtils.toCalendar(((java.util.Date)v15));
    Object v17 = 1;
    Object v18 = new java.lang.StringBuffer((((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.lang3.time.FastDateFormat)v13).format(((java.util.Calendar)v16),((java.lang.StringBuffer)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.lang3.time.FastDateFormat)v2).getTimeZone();
    Object v4 = 0;
    Object v5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.lang3.time.FastDateFormat)v5).getLocale();
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v3),((java.util.Locale)v6));
    Object v8 = "&ge;";
    Object v9 = new int[]{0,0};
    Object v10 = ((org.apache.commons.lang3.time.FastDateFormat)v7).parseToken(((java.lang.String)v8),((int[])v9));
    org.junit.Assert.assertEquals((Object)("'&"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = -23;
    Object v1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 30;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.lang3.time.FastDateFormat)v3).getTimeZone();
    Object v5 = ((java.util.TimeZone)v4).clone();
    Object v6 = 1;
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = "]";
    Object v9 = "u";
    Object v10 = "nll";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v6).intValue()),((java.util.TimeZone)v7),((java.util.Locale)v11));
    Object v13 = "\u00b7";
    Object v14 = 11;
    Object v15 = new java.text.ParsePosition((((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.lang3.time.FastDateFormat)v12).parseObject(((java.lang.String)v13),((java.text.ParsePosition)v15));
    Object v17 = ((org.apache.commons.lang3.time.FastDateFormat)v12).getLocale();
    Object v18 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v4),((java.util.Locale)v17));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = 49;
    Object v1 = 59;
    Object v2 = 0;
    Object v3 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.lang3.time.FastDateFormat)v3).getTimeZone();
    Object v5 = 0;
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).getLocale();
    Object v8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v4),((java.util.Locale)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = -2;
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.lang3.time.FastDateFormat)v2).getTimeZone();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "nll";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v3),((java.util.Locale)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "Stopwatch must";
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.lang3.time.FastDateFormat)v2).getTimeZone();
    Object v4 = ((java.util.TimeZone)v3).getRawOffset();
    Object v5 = 0;
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).getLocale();
    Object v8 = ((java.util.Locale)v7).getDisplayScript();
    Object v9 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v10 = java.time.Instant.now();
    Object v11 = java.util.Date.from(((java.time.Instant)v10));
    Object v12 = org.apache.commons.lang3.time.DateUtils.toCalendar(((java.util.Date)v11));
    Object v13 = 54;
    Object v14 = 0;
    Object v15 = 49;
    Object v16 = 1;
    Object v17 = 0;
    Object v18 = 1;
    ((java.util.Calendar)v12).set((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = 1;
    Object v21 = new java.lang.StringBuffer((((java.lang.Integer)v20).intValue()));
    Object v22 = "";
    Object v23 = ((java.lang.StringBuffer)v21).append(((java.lang.String)v22));
    Object v24 = ((org.apache.commons.lang3.time.FastDateFormat)v9).format(((java.util.Calendar)v12),((java.lang.StringBuffer)v21));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.apache.commons.lang3.time.FastDateFormat)v2).getTimeZone();
    Object v4 = 0;
    Object v5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.lang3.time.FastDateFormat)v5).getLocale();
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v3),((java.util.Locale)v6));
    Object v8 = java.time.Instant.now();
    Object v9 = java.util.Date.from(((java.time.Instant)v8));
    Object v10 = org.apache.commons.lang3.time.DateUtils.toCalendar(((java.util.Date)v9));
    Object v11 = 1;
    Object v12 = new java.lang.StringBuffer((((java.lang.Integer)v11).intValue()));
    Object v13 = 0;
    Object v14 = 1L;
    Object v15 = ((java.lang.StringBuffer)v12).insert((((java.lang.Integer)v13).intValue()),(((java.lang.Long)v14).longValue()));
    Object v16 = ((org.apache.commons.lang3.time.FastDateFormat)v7).applyRules(((java.util.Calendar)v10),((java.lang.StringBuffer)v12));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
