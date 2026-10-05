package com.fasterxml.jackson.databind.util;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = "false";
    Object v6 = 1;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = java.util.Locale.Category.DISPLAY;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.util.Locale.Category.DISPLAY;
    Object v1 = java.util.Locale.getDefault(((java.util.Locale.Category)v0));
    Object v2 = 1;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.databind.util.StdDateFormat._equals(((java.lang.Object)v1),((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = "]";
    Object v6 = 1;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4)._parseAsISO8601(((java.lang.String)v5),((java.text.ParsePosition)v7));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v6 = java.util.Locale.Category.DISPLAY;
    Object v7 = java.util.Locale.getDefault(((java.util.Locale.Category)v6));
    Object v8 = java.util.Calendar.getInstance(((java.util.TimeZone)v5),((java.util.Locale)v7));
    ((java.text.DateFormat)v4).setCalendar(((java.util.Calendar)v8));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v11 = java.util.Locale.Category.DISPLAY;
    Object v12 = java.util.Locale.getDefault(((java.util.Locale.Category)v11));
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = 0;
    Object v16 = new java.util.Date((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = "Unexpected JSON values; expected at most %d properties (in JSON Array)";
    Object v18 = new java.lang.StringBuffer(((java.lang.String)v17));
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v4)._format(((java.util.TimeZone)v10),((java.util.Locale)v12),((java.util.Date)v16),((java.lang.StringBuffer)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withColonInTimeZone((((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = "string";
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).parse(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLenient(((java.lang.Boolean)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).setTimeZone(((java.util.TimeZone)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withColonInTimeZone((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ")";
    Object v10 = 1;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((java.text.DateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).isLenient();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = "arra-";
    Object v6 = 1;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).parse(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = ((java.util.TimeZone)v9).getRawOffset();
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withTimeZone(((java.util.TimeZone)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = 1;
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = new java.util.Date((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.text.DateFormat)v4).format(((java.util.Date)v8));
    Object v10 = java.util.Locale.Category.DISPLAY;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = java.util.Locale.Category.DISPLAY;
    Object v13 = java.util.Locale.getDefault(((java.util.Locale.Category)v12));
    Object v14 = ((java.util.Locale)v11).getDisplayLanguage(((java.util.Locale)v13));
    Object v15 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLocale(((java.util.Locale)v11));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v6 = java.util.Locale.Category.DISPLAY;
    Object v7 = java.util.Locale.getDefault(((java.util.Locale.Category)v6));
    Object v8 = 1;
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new java.util.Date((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = "Unexpected JSON values; expected at most %d properties (in JSON Array)";
    Object v13 = new java.lang.StringBuffer(((java.lang.String)v12));
    Object v14 = 1;
    Object v15 = new java.text.ParsePosition((((java.lang.Integer)v14).intValue()));
    Object v16 = ((java.lang.StringBuffer)v13).append(((java.lang.Object)v15));
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v4)._format(((java.util.TimeZone)v5),((java.util.Locale)v7),((java.util.Date)v11),((java.lang.StringBuffer)v13));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLenient(((java.lang.Boolean)v9));
    Object v11 = "strig";
    Object v12 = 1;
    Object v13 = new java.text.ParsePosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10)._parseDate(((java.lang.String)v11),((java.text.ParsePosition)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = -20;
    Object v1 = -23;
    Object v2 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = "x";
    Object v8 = ((java.text.Format)v6).parseObject(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLenient(((java.lang.Boolean)v9));
    Object v11 = "Unexpected JSON values; expected at most %d properties (in JSON Array)";
    Object v12 = new java.lang.StringBuffer(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLenient(((java.lang.Boolean)v9));
    Object v11 = "Unexpected JSON values; expected at most %d properties (in JSON Array)";
    Object v12 = new java.lang.StringBuffer(((java.lang.String)v11));
    Object v13 = 1;
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v10)._formatBCEYear(((java.lang.StringBuffer)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "Unexpected JSON values; expected at most %d properties (in JSON Array)";
    Object v1 = new java.lang.StringBuffer(((java.lang.String)v0));
    Object v2 = 1;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = com.fasterxml.jackson.databind.util.StdDateFormat._equals(((java.lang.Object)v1),((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).toPattern();
    org.junit.Assert.assertEquals((Object)("[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', 'EEE, dd MMM yyyy HH:mm:ss zzz' (strict)]"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4)._getCalendar(((java.util.TimeZone)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withColonInTimeZone((((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withColonInTimeZone((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).toPattern();
    org.junit.Assert.assertEquals((Object)("[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', 'EEE, dd MMM yyyy HH:mm:ss zzz' (lenient)]"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = "]";
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).looksLikeISO8601(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = 1;
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = new java.util.Date((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "Unexpected JSON values; expected at most %d properties (in JSON Array)";
    Object v10 = new java.lang.StringBuffer(((java.lang.String)v9));
    Object v11 = 26;
    Object v12 = new java.text.FieldPosition((((java.lang.Integer)v11).intValue()));
    Object v13 = 1;
    Object v14 = new java.text.ParsePosition((((java.lang.Integer)v13).intValue()));
    Object v15 = ((java.text.FieldPosition)v12).equals(((java.lang.Object)v14));
    Object v16 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).format(((java.util.Date)v8),((java.lang.StringBuffer)v10),((java.text.FieldPosition)v12));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).setTimeZone(((java.util.TimeZone)v5));
    Object v6 = null;
    Object v7 = "string";
    Object v8 = 1;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).parseAsRFC1123(((java.lang.String)v7),((java.text.ParsePosition)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLenient(((java.lang.Boolean)v9));
    Object v11 = ":";
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).parse(((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = 26;
    Object v6 = new java.text.FieldPosition((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.text.Format)v4).format(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(((java.util.TimeZone)v0),((java.util.Locale)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLenient(((java.lang.Boolean)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).setTimeZone(((java.util.TimeZone)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = "Cannot upgrade from an insZtance of ";
    Object v6 = ((java.text.Format)v4).parseObject(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = 26;
    Object v6 = new java.text.FieldPosition((((java.lang.Integer)v5).intValue()));
    Object v7 = "Unexpected JSON values; expected at most %d properties (in JSON Array)";
    Object v8 = new java.lang.StringBuffer(((java.lang.String)v7));
    Object v9 = 26;
    Object v10 = new java.text.FieldPosition((((java.lang.Integer)v9).intValue()));
    Object v11 = ((java.text.DateFormat)v4).format(((java.lang.Object)v6),((java.lang.StringBuffer)v8),((java.text.FieldPosition)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withColonInTimeZone((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "strig";
    Object v10 = ((java.text.Format)v8).parseObject(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLenient(((java.lang.Boolean)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).setTimeZone(((java.util.TimeZone)v11));
    Object v12 = null;
    Object v13 = true;
    Object v14 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withColonInTimeZone((((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "";
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = java.util.Locale.Category.DISPLAY;
    Object v6 = java.util.Locale.getDefault(((java.util.Locale.Category)v5));
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat._equals(((java.lang.Object)v6),((java.lang.Object)v8));
    Object v10 = "Unexpected JSON values; expected at most %d properties (in JSON Array)";
    Object v11 = new java.lang.StringBuffer(((java.lang.String)v10));
    Object v12 = 26;
    Object v13 = new java.text.FieldPosition((((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    ((java.text.FieldPosition)v13).setBeginIndex((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    Object v16 = ((java.text.DateFormat)v4).format(((java.lang.Object)v9),((java.lang.StringBuffer)v11),((java.text.FieldPosition)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = ((java.text.DateFormat)v4).getCalendar();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withColonInTimeZone((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v8 = java.util.Locale.Category.DISPLAY;
    Object v9 = java.util.Locale.getDefault(((java.util.Locale.Category)v8));
    Object v10 = true;
    Object v11 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v7),((java.util.Locale)v9),((java.lang.Boolean)v10));
    Object v12 = "Unexpected JSON values; expected at most %d properties (in JSON Array)";
    Object v13 = new java.lang.StringBuffer(((java.lang.String)v12));
    Object v14 = 26;
    Object v15 = new java.text.FieldPosition((((java.lang.Integer)v14).intValue()));
    Object v16 = ((java.text.DateFormat)v6).format(((java.lang.Object)v11),((java.lang.StringBuffer)v13),((java.text.FieldPosition)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = "')]";
    Object v6 = 1;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4)._parseDate(((java.lang.String)v5),((java.text.ParsePosition)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = "Unexpected JSON values; expected at most %d properties (in JSON Array)";
    Object v8 = new java.lang.StringBuffer(((java.lang.String)v7));
    Object v9 = 28;
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v6)._formatBCEYear(((java.lang.StringBuffer)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = "java.util.Deque";
    Object v6 = ((java.text.Format)v4).parseObject(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = "'";
    Object v6 = 1;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).parseAsRFC1123(((java.lang.String)v5),((java.text.ParsePosition)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).setLenient((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = "Missing constructor (broken JDK (de)serialization?)";
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).parse(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = false;
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v5).setLenient((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v5)._getCalendar(((java.util.TimeZone)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withColonInTimeZone((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "Unexpected JSON values; expected at most %d properties (in JSON Array)";
    Object v10 = new java.lang.StringBuffer(((java.lang.String)v9));
    Object v11 = 5;
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v8)._formatBCEYear(((java.lang.StringBuffer)v10),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLenient(((java.lang.Boolean)v9));
    Object v11 = true;
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withColonInTimeZone((((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v6 = ((java.util.TimeZone)v5).getDisplayName();
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).setTimeZone(((java.util.TimeZone)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "]";
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withColonInTimeZone((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = java.util.Locale.Category.DISPLAY;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withLocale(((java.util.Locale)v10));
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v8)._clearFormats();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v5).toPattern();
    org.junit.Assert.assertEquals((Object)("[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', 'EEE, dd MMM yyyy HH:mm:ss zzz' (lenient)]"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).toPattern();
    org.junit.Assert.assertEquals((Object)("[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', 'EEE, dd MMM yyyy HH:mm:ss zzz' (lenient)]"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "Unexpected JSON values; expected at most %d properties (in JSON Array)";
    Object v7 = new java.lang.StringBuffer(((java.lang.String)v6));
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v5).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v5).isLenient();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withColonInTimeZone((((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = java.util.Locale.Category.DISPLAY;
    Object v6 = java.util.Locale.getDefault(((java.util.Locale.Category)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLocale(((java.util.Locale)v6));
    Object v8 = true;
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).setLenient((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(((java.util.TimeZone)v0),((java.util.Locale)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withColonInTimeZone((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "true";
    Object v10 = 1;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8)._parseAsISO8601(((java.lang.String)v9),((java.text.ParsePosition)v11));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withColonInTimeZone((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6)._getCalendar(((java.util.TimeZone)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withColonInTimeZone((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withTimeZone(((java.util.TimeZone)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 0;
    Object v1 = java.text.DateFormat.getDateInstance((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLenient(((java.lang.Boolean)v9));
    Object v11 = true;
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withColonInTimeZone((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = "java.utl.Deque";
    Object v14 = 1;
    Object v15 = new java.text.ParsePosition((((java.lang.Integer)v14).intValue()));
    Object v16 = 1;
    ((java.text.ParsePosition)v15).setIndex((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v12)._parseAsISO8601(((java.lang.String)v13),((java.text.ParsePosition)v15));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLenient(((java.lang.Boolean)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v12 = java.util.Locale.Category.DISPLAY;
    Object v13 = java.util.Locale.getDefault(((java.util.Locale.Category)v12));
    Object v14 = true;
    Object v15 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v11),((java.util.Locale)v13),((java.lang.Boolean)v14));
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v15).withColonInTimeZone((((java.lang.Boolean)v16).booleanValue()));
    Object v18 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v19 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v17)._getCalendar(((java.util.TimeZone)v18));
    ((java.text.DateFormat)v10).setCalendar(((java.util.Calendar)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = "Broken registered ValueInstantiators (of type %s): returned null ValueInstantiator";
    Object v8 = 1;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = -16;
    ((java.text.ParsePosition)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6)._parseDate(((java.lang.String)v7),((java.text.ParsePosition)v9));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.text.ParsePosition((((java.lang.Integer)v0).intValue()));
    Object v2 = java.util.Locale.Category.DISPLAY;
    Object v3 = java.util.Locale.getDefault(((java.util.Locale.Category)v2));
    Object v4 = com.fasterxml.jackson.databind.util.StdDateFormat._equals(((java.lang.Object)v1),((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withColonInTimeZone((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = java.util.Locale.Category.DISPLAY;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = ((java.text.Format)v8).formatToCharacterIterator(((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3),(((java.lang.Boolean)v4).booleanValue()));
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v5)._clearFormats();
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = 1;
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = new java.util.Date((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = "Unexpected JSON values; expected at most %d properties (in JSON Array)";
    Object v10 = new java.lang.StringBuffer(((java.lang.String)v9));
    Object v11 = 26;
    Object v12 = new java.text.FieldPosition((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).format(((java.util.Date)v8),((java.lang.StringBuffer)v10),((java.text.FieldPosition)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withColonInTimeZone((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withTimeZone(((java.util.TimeZone)v9));
    Object v11 = java.util.Locale.Category.DISPLAY;
    Object v12 = java.util.Locale.getDefault(((java.util.Locale.Category)v11));
    Object v13 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withLocale(((java.util.Locale)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withColonInTimeZone((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "seX";
    Object v8 = 1;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((java.text.ParsePosition)v9).toString();
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).parse(((java.lang.String)v7),((java.text.ParsePosition)v9));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = "Internal error: unable to lo";
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).looksLikeISO8601(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withColonInTimeZone((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).toPattern();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withColonInTimeZone((((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "USE_JAVA_ARRAY_FOR_JSON_ARRAY";
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withColonInTimeZone((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withTimeZone(((java.util.TimeZone)v9));
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withLenient(((java.lang.Boolean)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    ((java.text.DateFormat)v4).setLenient((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = 0;
    Object v10 = new java.util.Date((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((java.text.DateFormat)v4).format(((java.util.Date)v10));
    org.junit.Assert.assertEquals((Object)("1901-01-31T08:00:00.000+0000"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = "arra-";
    Object v6 = 1;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).parse(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = ((java.util.TimeZone)v9).getRawOffset();
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withTimeZone(((java.util.TimeZone)v9));
    Object v12 = "AnnotationIntrospector returned Class ";
    Object v13 = 1;
    Object v14 = new java.text.ParsePosition((((java.lang.Integer)v13).intValue()));
    Object v15 = ((java.text.Format)v11).parseObject(((java.lang.String)v12),((java.text.ParsePosition)v14));
    Object v16 = 26;
    Object v17 = new java.text.FieldPosition((((java.lang.Integer)v16).intValue()));
    Object v18 = ((java.text.Format)v11).format(((java.lang.Object)v17));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 1;
    Object v1 = java.text.DateFormat.getDateInstance((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withColonInTimeZone((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "AnnotationIntrospector returned deseerializer definition of type ";
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).parse(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withColonInTimeZone((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = java.util.Locale.Category.DISPLAY;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v8));
    Object v10 = java.util.Locale.Category.DISPLAY;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLenient(((java.lang.Boolean)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).setTimeZone(((java.util.TimeZone)v11));
    Object v12 = null;
    Object v13 = true;
    Object v14 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withColonInTimeZone((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v14).toPattern();
    org.junit.Assert.assertEquals((Object)("[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSZ', 'EEE, dd MMM yyyy HH:mm:ss zzz' (strict)]"), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLenient(((java.lang.Boolean)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v12 = java.util.Locale.Category.DISPLAY;
    Object v13 = java.util.Locale.getDefault(((java.util.Locale.Category)v12));
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = 0;
    Object v17 = new java.util.Date((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = "Unexpected JSON values; expected at most %d properties (in JSON Array)";
    Object v19 = new java.lang.StringBuffer(((java.lang.String)v18));
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v10)._format(((java.util.TimeZone)v11),((java.util.Locale)v13),((java.util.Date)v17),((java.lang.StringBuffer)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLenient(((java.lang.Boolean)v9));
    Object v11 = true;
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withColonInTimeZone((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v14 = java.util.Locale.Category.DISPLAY;
    Object v15 = java.util.Locale.getDefault(((java.util.Locale.Category)v14));
    Object v16 = true;
    Object v17 = false;
    Object v18 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v13),((java.util.Locale)v15),((java.lang.Boolean)v16),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v12).equals(((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v7 = java.util.Locale.Category.DISPLAY;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = true;
    Object v10 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v6),((java.util.Locale)v8),((java.lang.Boolean)v9));
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withLenient(((java.lang.Boolean)v11));
    Object v13 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v14 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v12).withTimeZone(((java.util.TimeZone)v13));
    Object v15 = false;
    Object v16 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v12).withLenient(((java.lang.Boolean)v15));
    Object v17 = "Unexpected JSON values; expected at most %d properties (in JSON Array)";
    Object v18 = new java.lang.StringBuffer(((java.lang.String)v17));
    Object v19 = 26;
    Object v20 = new java.text.FieldPosition((((java.lang.Integer)v19).intValue()));
    Object v21 = ((java.text.DateFormat)v5).format(((java.lang.Object)v16),((java.lang.StringBuffer)v18),((java.text.FieldPosition)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = false;
    Object v5 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = "Cannot construct SimpleType for a Collection (class: ";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v5).parseAsRFC1123(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = "7, ";
    Object v6 = 1;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.DateFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withTimeZone(((java.util.TimeZone)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withColonInTimeZone((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = "";
    Object v8 = ((java.text.Format)v6).parseObject(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withColonInTimeZone((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((java.text.Format)v8).clone();
    Object v10 = "falsY";
    Object v11 = ((java.text.Format)v8).parseObject(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.text.ParsePosition((((java.lang.Integer)v0).intValue()));
    Object v2 = "Unexpected JSON values; expected at most %d properties (in JSON Array)";
    Object v3 = new java.lang.StringBuffer(((java.lang.String)v2));
    Object v4 = com.fasterxml.jackson.databind.util.StdDateFormat._equals(((java.lang.Object)v1),((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = true;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = "; expected Class<Jsonjerializer>";
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).parse(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = java.text.DateFormat.getDateInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = "Unexpected JSON values; expected at most %d properties (in JSON Array)";
    Object v3 = new java.lang.StringBuffer(((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.util.StdDateFormat._equals(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = ((java.text.Format)v1).formatToCharacterIterator(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLenient(((java.lang.Boolean)v9));
    Object v11 = "need JSON String that contains type id (for subtype of ";
    Object v12 = 1;
    Object v13 = new java.text.ParsePosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).parse(((java.lang.String)v11),((java.text.ParsePosition)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withColonInTimeZone((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = java.util.Locale.Category.DISPLAY;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v8));
    Object v10 = java.util.Locale.Category.DISPLAY;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v11));
    Object v13 = "serializaQion type ";
    Object v14 = 1;
    Object v15 = new java.text.ParsePosition((((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v12)._parseDate(((java.lang.String)v13),((java.text.ParsePosition)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withColonInTimeZone((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "' of cl$ss ";
    Object v10 = 1;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((java.text.DateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = true;
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).setLenient((((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = false;
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).setLenient((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).clone();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = false;
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLenient(((java.lang.Boolean)v5));
    Object v7 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLenient(((java.lang.Boolean)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).setTimeZone(((java.util.TimeZone)v11));
    Object v12 = null;
    Object v13 = true;
    Object v14 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withColonInTimeZone((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((java.text.DateFormat)v14).getCalendar();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = ((java.text.DateFormat)v4).getNumberFormat();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.Category.DISPLAY;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = true;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v6 = java.util.Locale.Category.DISPLAY;
    Object v7 = java.util.Locale.getDefault(((java.util.Locale.Category)v6));
    Object v8 = true;
    Object v9 = false;
    Object v10 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v5),((java.util.Locale)v7),((java.lang.Boolean)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).isLenient();
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }
}
