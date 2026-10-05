package com.fasterxml.jackson.databind.util;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v4 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v5 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v3).withTimeZone(((java.util.TimeZone)v4));
    Object v6 = new java.lang.StringBuffer();
    Object v7 = new java.lang.StringBuffer(((java.lang.CharSequence)v6));
    Object v8 = new java.lang.StringBuffer();
    Object v9 = ((java.lang.StringBuffer)v7).append(((java.lang.StringBuffer)v8));
    Object v10 = 20;
    Object v11 = new java.text.FieldPosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((java.text.DateFormat)v2).format(((java.lang.Object)v5),((java.lang.StringBuffer)v7),((java.text.FieldPosition)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "REQUIRE_SETTERS_FOR_GE";
    Object v4 = 4;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parseAsISO8601(((java.lang.String)v3),((java.text.ParsePosition)v5),(((java.lang.Boolean)v6).booleanValue()));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = 4;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parseAsRFC1123(((java.lang.String)v3),((java.text.ParsePosition)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = ((java.text.DateFormat)v2).getTimeZone();
    Object v4 = ((java.text.DateFormat)v2).getNumberFormat();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = ")t";
    Object v4 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = true;
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).setLenient((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "arxray";
    Object v4 = 4;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v8 = 5;
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new java.util.Date((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.lang.StringBuffer();
    Object v13 = 20;
    Object v14 = new java.text.FieldPosition((((java.lang.Integer)v13).intValue()));
    Object v15 = -22;
    ((java.text.FieldPosition)v14).setBeginIndex((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    Object v17 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).format(((java.util.Date)v11),((java.lang.StringBuffer)v12),((java.text.FieldPosition)v14));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).isLenient();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v4 = "";
    Object v5 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v6 = "' value but there was more than a singe value in the array";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v7));
    ((java.text.DateFormat)v2).setCalendar(((java.util.Calendar)v8));
    Object v9 = null;
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).toString();
    org.junit.Assert.assertEquals((Object)("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).getUnicodeLocaleKeys();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "DEFAULT_TYPING";
    Object v4 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).looksLikeISO8601(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = 5;
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new java.lang.StringBuffer();
    Object v6 = new java.lang.StringBuffer(((java.lang.CharSequence)v5));
    Object v7 = 20;
    Object v8 = new java.text.FieldPosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).format(((java.util.Date)v4),((java.lang.StringBuffer)v6),((java.text.FieldPosition)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).getUnicodeLocaleKeys();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v9 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v10 = "";
    Object v11 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v12 = "' value but there was more than a singe value in the array";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = java.util.Calendar.getInstance(((java.util.TimeZone)v9),((java.util.Locale)v13));
    Object v15 = 0;
    ((java.util.Calendar)v14).clear((((java.lang.Integer)v15).intValue()));
    Object v16 = null;
    ((java.text.DateFormat)v8).setCalendar(((java.util.Calendar)v14));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v4 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withTimeZone(((java.util.TimeZone)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "]x";
    Object v4 = ((java.text.Format)v2).parseObject(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).getUnicodeLocaleKeys();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v9 = "number";
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).parse(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = ")";
    Object v4 = 4;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parseAsRFC1123(((java.lang.String)v3),((java.text.ParsePosition)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v8 = "'Q)";
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).parse(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).getUnicodeLocaleKeys();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v9 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).setTimeZone(((java.util.TimeZone)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).getUnicodeLocaleKeys();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v9 = "";
    Object v10 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v11 = "' value but there was more than a singe value in the array";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new java.lang.StringBuffer();
    Object v14 = 20;
    Object v15 = new java.text.FieldPosition((((java.lang.Integer)v14).intValue()));
    Object v16 = 1;
    ((java.text.FieldPosition)v15).setBeginIndex((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = ((java.text.DateFormat)v8).format(((java.lang.Object)v12),((java.lang.StringBuffer)v13),((java.text.FieldPosition)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).isLenient();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 0;
    Object v1 = "";
    Object v2 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v3 = "' value but there was more than a singe value in the array";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v4 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withTimeZone(((java.util.TimeZone)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v6 = "";
    Object v7 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v8 = "' value but there was more than a singe value in the array";
    Object v9 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = java.util.Calendar.getInstance(((java.util.TimeZone)v5),((java.util.Locale)v9));
    ((java.text.DateFormat)v4).setCalendar(((java.util.Calendar)v10));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).setTimeZone(((java.util.TimeZone)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v8 = "string";
    Object v9 = 4;
    Object v10 = new java.text.ParsePosition((((java.lang.Integer)v9).intValue()));
    Object v11 = true;
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).parseAsISO8601(((java.lang.String)v8),((java.text.ParsePosition)v10),(((java.lang.Boolean)v11).booleanValue()));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v4 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v5 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v3).withTimeZone(((java.util.TimeZone)v4));
    Object v6 = new java.lang.StringBuffer();
    Object v7 = 20;
    Object v8 = new java.text.FieldPosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.text.DateFormat)v2).format(((java.lang.Object)v5),((java.lang.StringBuffer)v6),((java.text.FieldPosition)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).getUnicodeLocaleKeys();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v9 = "!";
    Object v10 = 4;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    ((java.text.ParsePosition)v11).setErrorIndex((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).parseAsRFC1123(((java.lang.String)v9),((java.text.ParsePosition)v11));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v9 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withTimeZone(((java.util.TimeZone)v9));
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).isLenient();
    Object v12 = new java.lang.StringBuffer();
    Object v13 = new java.lang.StringBuffer();
    Object v14 = ((java.lang.StringBuffer)v12).append(((java.lang.CharSequence)v13));
    Object v15 = 20;
    Object v16 = new java.text.FieldPosition((((java.lang.Integer)v15).intValue()));
    Object v17 = ((java.text.DateFormat)v7).format(((java.lang.Object)v11),((java.lang.StringBuffer)v12),((java.text.FieldPosition)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).getUnicodeLocaleKeys();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).isLenient();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v8 = 5;
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new java.util.Date((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((java.util.Date)v11).getHours();
    Object v13 = new java.lang.StringBuffer();
    Object v14 = new java.lang.StringBuffer(((java.lang.CharSequence)v13));
    Object v15 = 20;
    Object v16 = new java.text.FieldPosition((((java.lang.Integer)v15).intValue()));
    Object v17 = "";
    Object v18 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v19 = "' value but there was more than a singe value in the array";
    Object v20 = new java.util.Locale(((java.lang.String)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = ((java.text.FieldPosition)v16).equals(((java.lang.Object)v20));
    Object v22 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).format(((java.util.Date)v11),((java.lang.StringBuffer)v14),((java.text.FieldPosition)v16));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v4 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withTimeZone(((java.util.TimeZone)v3));
    Object v5 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).isLenient();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(((java.util.TimeZone)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v4 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withTimeZone(((java.util.TimeZone)v3));
    Object v5 = 5;
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = new java.util.Date((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.text.DateFormat)v4).format(((java.util.Date)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v11 = -3L;
    Object v12 = ((java.util.TimeZone)v10).getOffset((((java.lang.Long)v11).longValue()));
    Object v13 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withTimeZone(((java.util.TimeZone)v10));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = java.text.DateFormat.getTimeInstance();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).getUnicodeLocaleKeys();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v9 = "long";
    Object v10 = 4;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((java.text.DateFormat)v8).parse(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v14 = "";
    Object v15 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v16 = "' value but there was more than a singe value in the array";
    Object v17 = new java.util.Locale(((java.lang.String)v14),((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = java.util.Calendar.getInstance(((java.util.TimeZone)v13),((java.util.Locale)v17));
    ((java.text.DateFormat)v8).setCalendar(((java.util.Calendar)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "org.springframework.cglib";
    Object v4 = 4;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v4 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withTimeZone(((java.util.TimeZone)v3));
    Object v5 = true;
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).setLenient((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = false;
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).setLenient((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v8 = "";
    Object v9 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v10 = "' value but there was more than a singe value in the array";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).withLocale(((java.util.Locale)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).getTimeZone();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.text.DateFormat.getInstance();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).toString();
    org.junit.Assert.assertEquals((Object)("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).getUnicodeLocaleKeys();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v9 = 5;
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = new java.util.Date((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new java.lang.StringBuffer();
    Object v14 = 20;
    Object v15 = new java.text.FieldPosition((((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).format(((java.util.Date)v12),((java.lang.StringBuffer)v13),((java.text.FieldPosition)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = -4;
    Object v1 = "";
    Object v2 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v3 = "' value but there was more than a singe value in the array";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = java.text.DateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v4 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withTimeZone(((java.util.TimeZone)v3));
    Object v5 = ")";
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).looksLikeISO8601(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).getUnicodeLocaleKeys();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v9 = 5;
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = new java.util.Date((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((java.text.DateFormat)v8).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 0;
    Object v1 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).getUnicodeLocaleKeys();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v9 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v10 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(((java.util.TimeZone)v9));
    Object v11 = new java.lang.StringBuffer();
    Object v12 = new java.lang.StringBuffer(((java.lang.CharSequence)v11));
    Object v13 = 20;
    Object v14 = new java.text.FieldPosition((((java.lang.Integer)v13).intValue()));
    Object v15 = ((java.text.DateFormat)v8).format(((java.lang.Object)v10),((java.lang.StringBuffer)v12),((java.text.FieldPosition)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = 0;
    Object v4 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.text.DateFormat)v2).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).getUnicodeLocaleKeys();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).toString();
    org.junit.Assert.assertEquals((Object)("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _USE_JAVA_ARRAY_FOR_JSONT_ARRAY_' value but there was more than a singe value in the array)"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = 7;
    Object v2 = "";
    Object v3 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v4 = "' value but there was more than a singe value in the array";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).getDisplayVariant();
    Object v7 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.Locale)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v8 = "";
    Object v9 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v10 = "' value but there was more than a singe value in the array";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).withLocale(((java.util.Locale)v11));
    Object v13 = ((java.text.Format)v12).clone();
    Object v14 = "3";
    Object v15 = ((java.text.Format)v12).parseObject(((java.lang.String)v14));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 0;
    Object v1 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v3 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v4 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withTimeZone(((java.util.TimeZone)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withTimeZone(((java.util.TimeZone)v5));
    Object v7 = ")";
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).looksLikeISO8601(((java.lang.String)v7));
    Object v9 = ((java.text.DateFormat)v1).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).getUnicodeLocaleKeys();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v9 = ((java.text.DateFormat)v8).getCalendar();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(((java.util.TimeZone)v0));
    Object v2 = "";
    Object v3 = ((java.text.Format)v1).parseObject(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = java.text.DateFormat.getDateInstance();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v8 = 5;
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = new java.util.Date((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new java.lang.StringBuffer();
    Object v13 = 20;
    Object v14 = new java.text.FieldPosition((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).format(((java.util.Date)v11),((java.lang.StringBuffer)v12),((java.text.FieldPosition)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).getTimeZone();
    Object v4 = ((java.util.TimeZone)v3).toZoneId();
    Object v5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(((java.util.TimeZone)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v8 = ")";
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).parse(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new java.lang.StringBuffer();
    Object v8 = 20;
    Object v9 = new java.text.FieldPosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((java.text.DateFormat)v2).format(((java.lang.Object)v6),((java.lang.StringBuffer)v7),((java.text.FieldPosition)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v3 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v4 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withTimeZone(((java.util.TimeZone)v3));
    Object v5 = "";
    Object v6 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v7 = "' value but there was more than a singe value in the array";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((java.util.Locale)v8).getUnicodeLocaleKeys();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withLocale(((java.util.Locale)v8));
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).toString();
    Object v12 = new java.lang.StringBuffer();
    Object v13 = new java.lang.StringBuffer(((java.lang.CharSequence)v12));
    Object v14 = 20;
    Object v15 = new java.text.FieldPosition((((java.lang.Integer)v14).intValue()));
    Object v16 = ((java.text.DateFormat)v1).format(((java.lang.Object)v11),((java.lang.StringBuffer)v13),((java.text.FieldPosition)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = 5;
    Object v4 = 1;
    Object v5 = 0;
    Object v6 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new java.lang.StringBuffer();
    Object v8 = new java.lang.StringBuffer(((java.lang.CharSequence)v7));
    Object v9 = 20;
    Object v10 = new java.text.FieldPosition((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).format(((java.util.Date)v6),((java.lang.StringBuffer)v8),((java.text.FieldPosition)v10));
    Object v12 = "";
    Object v13 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v14 = "' value but there was more than a singe value in the array";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v4 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withTimeZone(((java.util.TimeZone)v3));
    Object v5 = "/), but ";
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).looksLikeISO8601(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).clone();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v4 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withTimeZone(((java.util.TimeZone)v3));
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v4)._clearFormats();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v8 = "";
    Object v9 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v10 = "' value but there was more than a singe value in the array";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).withLocale(((java.util.Locale)v11));
    Object v13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v14 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v15 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v13).withTimeZone(((java.util.TimeZone)v14));
    Object v16 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v15).getTimeZone();
    Object v17 = ((java.util.TimeZone)v16).toZoneId();
    Object v18 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(((java.util.TimeZone)v16));
    Object v19 = ((java.text.Format)v12).formatToCharacterIterator(((java.lang.Object)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).getUnicodeLocaleKeys();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v9 = 5;
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = new java.util.Date((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v14 = 5;
    Object v15 = 1;
    Object v16 = 0;
    Object v17 = new java.util.Date((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new java.lang.StringBuffer();
    Object v19 = new java.lang.StringBuffer(((java.lang.CharSequence)v18));
    Object v20 = 20;
    Object v21 = new java.text.FieldPosition((((java.lang.Integer)v20).intValue()));
    Object v22 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v13).format(((java.util.Date)v17),((java.lang.StringBuffer)v19),((java.text.FieldPosition)v21));
    Object v23 = 20;
    Object v24 = new java.text.FieldPosition((((java.lang.Integer)v23).intValue()));
    Object v25 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).format(((java.util.Date)v12),((java.lang.StringBuffer)v22),((java.text.FieldPosition)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).clone();
    Object v9 = "";
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).parse(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v8 = "";
    Object v9 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v10 = "' value but there was more than a singe value in the array";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).withLocale(((java.util.Locale)v11));
    Object v13 = "]";
    Object v14 = ((java.text.Format)v12).parseObject(((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = 8;
    Object v1 = "";
    Object v2 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v3 = "' value but there was more than a singe value in the array";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = java.text.DateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(((java.util.TimeZone)v0));
    Object v2 = 20;
    Object v3 = new java.text.FieldPosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.text.Format)v1).formatToCharacterIterator(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v9 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withTimeZone(((java.util.TimeZone)v9));
    Object v11 = "";
    Object v12 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v13 = "' value but there was more than a singe value in the array";
    Object v14 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((java.util.Locale)v14).getUnicodeLocaleKeys();
    Object v16 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withLocale(((java.util.Locale)v14));
    Object v17 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v16).toString();
    Object v18 = ((java.text.Format)v7).format(((java.lang.Object)v17));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).clone();
    Object v9 = "NUrLL";
    Object v10 = 4;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).parse(((java.lang.String)v9),((java.text.ParsePosition)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(((java.util.TimeZone)v0));
    Object v2 = "uri";
    Object v3 = ((java.text.Format)v1).parseObject(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = 5;
    Object v4 = 1;
    Object v5 = 0;
    Object v6 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new java.lang.StringBuffer();
    Object v8 = 20;
    Object v9 = new java.text.FieldPosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).format(((java.util.Date)v6),((java.lang.StringBuffer)v7),((java.text.FieldPosition)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).clone();
    Object v9 = false;
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).setLenient((((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = ((java.text.DateFormat)v2).hashCode();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).clone();
    Object v9 = new java.lang.StringBuffer();
    Object v10 = ((java.text.DateFormat)v8).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).getTimeZone();
    Object v4 = ((java.util.TimeZone)v3).toZoneId();
    Object v5 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(((java.util.TimeZone)v3));
    Object v6 = "";
    Object v7 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v8 = "' value but there was more than a singe value in the array";
    Object v9 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((java.text.DateFormat)v5).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v8 = "";
    Object v9 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v10 = "' value but there was more than a singe value in the array";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).withLocale(((java.util.Locale)v11));
    Object v13 = "type";
    Object v14 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v12).parse(((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v2)._clearFormats();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).getUnicodeLocaleKeys();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v9 = "iBems";
    Object v10 = 4;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).parseAsRFC1123(((java.lang.String)v9),((java.text.ParsePosition)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v8 = "";
    Object v9 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v10 = "' value but there was more than a singe value in the array";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).withLocale(((java.util.Locale)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v14 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v12).withTimeZone(((java.util.TimeZone)v13));
    Object v15 = true;
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v12).setLenient((((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).getUnicodeLocaleKeys();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v9 = "OBJECT";
    Object v10 = 4;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = -57;
    ((java.text.ParsePosition)v11).setIndex((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    Object v14 = true;
    Object v15 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).parseAsISO8601(((java.lang.String)v9),((java.text.ParsePosition)v11),(((java.lang.Boolean)v14).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v4 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v5 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v3).withTimeZone(((java.util.TimeZone)v4));
    Object v6 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v5).withTimeZone(((java.util.TimeZone)v6));
    Object v8 = "/), but ";
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).looksLikeISO8601(((java.lang.String)v8));
    Object v10 = ((java.text.DateFormat)v2).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v4 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withTimeZone(((java.util.TimeZone)v3));
    Object v5 = 5;
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = new java.util.Date((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.text.DateFormat)v4).format(((java.util.Date)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v11 = -3L;
    Object v12 = ((java.util.TimeZone)v10).getOffset((((java.lang.Long)v11).longValue()));
    Object v13 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).withTimeZone(((java.util.TimeZone)v10));
    Object v14 = "number";
    Object v15 = 4;
    Object v16 = new java.text.ParsePosition((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v13).parseAsRFC1123(((java.lang.String)v14),((java.text.ParsePosition)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = java.text.DateFormat.getDateInstance();
    Object v1 = 5;
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.text.DateFormat)v0).format(((java.util.Date)v4));
    org.junit.Assert.assertEquals((Object)("Jan 31, 1905"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v4 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withTimeZone(((java.util.TimeZone)v3));
    Object v5 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v6 = ((java.text.DateFormat)v4).equals(((java.lang.Object)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).isLenient();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).getUnicodeLocaleKeys();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v9 = "Failed to parse Date vale '%s': %s";
    Object v10 = 4;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).parse(((java.lang.String)v9),((java.text.ParsePosition)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v4 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withTimeZone(((java.util.TimeZone)v3));
    Object v5 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).toString();
    org.junit.Assert.assertEquals((Object)("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en_US)"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).clone();
    Object v9 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).setTimeZone(((java.util.TimeZone)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v8 = "";
    Object v9 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v10 = "' value but there was more than a singe value in the array";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).withLocale(((java.util.Locale)v11));
    Object v13 = "')]";
    Object v14 = 4;
    Object v15 = new java.text.ParsePosition((((java.lang.Integer)v14).intValue()));
    Object v16 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v12).parse(((java.lang.String)v13),((java.text.ParsePosition)v15));
    Object v17 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v12).toString();
    org.junit.Assert.assertEquals((Object)("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: _USE_JAVA_ARRAY_FOR_JSONT_ARRAY_' value but there was more than a singe value in the array)"), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v1 = 23L;
    Object v2 = ((java.util.TimeZone)v0).getOffset((((java.lang.Long)v1).longValue()));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v6),((java.lang.Boolean)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.text.DateFormat.getDateInstance();
    Object v1 = java.text.NumberFormat.getIntegerInstance();
    ((java.text.DateFormat)v0).setNumberFormat(((java.text.NumberFormat)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "[field ";
    Object v4 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).looksLikeISO8601(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = com.fasterxml.jackson.databind.util.ISO8601Utils.timeZoneGMT();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withTimeZone(((java.util.TimeZone)v1));
    Object v3 = "";
    Object v4 = "USE_JAVA_ARRAY_FOR_JSONt_ARRAY";
    Object v5 = "' value but there was more than a singe value in the array";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).getUnicodeLocaleKeys();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v6));
    Object v9 = "";
    Object v10 = 4;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = true;
    Object v13 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).parseAsISO8601(((java.lang.String)v9),((java.text.ParsePosition)v11),(((java.lang.Boolean)v12).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }
}
