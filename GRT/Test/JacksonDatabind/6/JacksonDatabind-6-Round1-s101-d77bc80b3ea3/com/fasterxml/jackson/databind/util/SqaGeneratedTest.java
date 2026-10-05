package com.fasterxml.jackson.databind.util;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 0;
    Object v1 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = java.util.Locale.getDefault();
    Object v3 = ((java.text.DateFormat)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ")";
    Object v4 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = "sring";
    Object v4 = java.util.TimeZone.getTimeZone(((java.lang.String)v3));
    Object v5 = ((java.text.DateFormat)v2).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = "sring";
    Object v4 = java.util.TimeZone.getTimeZone(((java.lang.String)v3));
    Object v5 = java.util.Calendar.getInstance(((java.util.TimeZone)v4));
    ((java.text.DateFormat)v2).setCalendar(((java.util.Calendar)v5));
    Object v6 = null;
    Object v7 = "sring";
    Object v8 = java.util.TimeZone.getTimeZone(((java.lang.String)v7));
    Object v9 = ((java.text.DateFormat)v2).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 0;
    Object v1 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.text.DateFormat)v1).getCalendar();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 0;
    Object v1 = java.util.Locale.getDefault();
    Object v2 = ((java.util.Locale)v1).getExtensionKeys();
    Object v3 = java.text.DateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = java.util.Locale.getDefault();
    Object v2 = ((java.util.Locale)v1).getExtensionKeys();
    Object v3 = java.text.DateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v1));
    Object v4 = 0;
    Object v5 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v4).intValue()));
    Object v6 = java.util.Locale.getDefault();
    Object v7 = ((java.text.DateFormat)v5).equals(((java.lang.Object)v6));
    Object v8 = -76L;
    Object v9 = 0L;
    Object v10 = java.time.Instant.ofEpochSecond((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
    Object v11 = java.util.Date.from(((java.time.Instant)v10));
    Object v12 = false;
    Object v13 = "sring";
    Object v14 = java.util.TimeZone.getTimeZone(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ISO8601Utils.format(((java.util.Date)v11),(((java.lang.Boolean)v12).booleanValue()),((java.util.TimeZone)v14));
    Object v16 = new java.lang.StringBuffer(((java.lang.CharSequence)v15));
    Object v17 = -76L;
    Object v18 = 0L;
    Object v19 = java.time.Instant.ofEpochSecond((((java.lang.Long)v17).longValue()),(((java.lang.Long)v18).longValue()));
    Object v20 = java.util.Date.from(((java.time.Instant)v19));
    Object v21 = false;
    Object v22 = "sring";
    Object v23 = java.util.TimeZone.getTimeZone(((java.lang.String)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ISO8601Utils.format(((java.util.Date)v20),(((java.lang.Boolean)v21).booleanValue()),((java.util.TimeZone)v23));
    Object v25 = new java.lang.StringBuffer(((java.lang.CharSequence)v24));
    Object v26 = ((java.lang.StringBuffer)v16).append(((java.lang.StringBuffer)v25));
    Object v27 = -8;
    Object v28 = new java.text.FieldPosition((((java.lang.Integer)v27).intValue()));
    Object v29 = 0;
    ((java.text.FieldPosition)v28).setEndIndex((((java.lang.Integer)v29).intValue()));
    Object v30 = null;
    Object v31 = ((java.text.DateFormat)v3).format(((java.lang.Object)v7),((java.lang.StringBuffer)v16),((java.text.FieldPosition)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = "sring";
    Object v4 = java.util.TimeZone.getTimeZone(((java.lang.String)v3));
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).setTimeZone(((java.util.TimeZone)v4));
    Object v5 = null;
    Object v6 = "Class ";
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).looksLikeISO8601(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = -76L;
    Object v4 = 0L;
    Object v5 = java.time.Instant.ofEpochSecond((((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = java.util.Date.from(((java.time.Instant)v5));
    Object v7 = ((java.text.DateFormat)v2).format(((java.util.Date)v6));
    Object v8 = "Can not find a deserializer for type ";
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).looksLikeISO8601(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = java.util.Locale.getDefault();
    Object v4 = ((java.text.DateFormat)v2).equals(((java.lang.Object)v3));
    Object v5 = "sring";
    Object v6 = java.util.TimeZone.getTimeZone(((java.lang.String)v5));
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).setTimeZone(((java.util.TimeZone)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = java.util.Locale.getDefault();
    Object v4 = java.text.NumberFormat.getPercentInstance(((java.util.Locale)v3));
    ((java.text.DateFormat)v2).setNumberFormat(((java.text.NumberFormat)v4));
    Object v5 = null;
    Object v6 = "";
    Object v7 = 0;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parseAsISO8601(((java.lang.String)v6),((java.text.ParsePosition)v8));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = "sring";
    Object v4 = java.util.TimeZone.getTimeZone(((java.lang.String)v3));
    Object v5 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withTimeZone(((java.util.TimeZone)v4));
    Object v6 = ")";
    Object v7 = 0;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parseAsRFC1123(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = java.util.Locale.getDefault();
    Object v2 = ((java.util.Locale)v1).getExtensionKeys();
    Object v3 = java.text.DateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v1));
    Object v4 = "]x";
    Object v5 = ((java.text.Format)v3).parseObject(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = "object";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = -8;
    Object v10 = new java.text.FieldPosition((((java.lang.Integer)v9).intValue()));
    Object v11 = -76L;
    Object v12 = 0L;
    Object v13 = java.time.Instant.ofEpochSecond((((java.lang.Long)v11).longValue()),(((java.lang.Long)v12).longValue()));
    Object v14 = java.util.Date.from(((java.time.Instant)v13));
    Object v15 = false;
    Object v16 = "sring";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = com.fasterxml.jackson.databind.util.ISO8601Utils.format(((java.util.Date)v14),(((java.lang.Boolean)v15).booleanValue()),((java.util.TimeZone)v17));
    Object v19 = new java.lang.StringBuffer(((java.lang.CharSequence)v18));
    Object v20 = -8;
    Object v21 = new java.text.FieldPosition((((java.lang.Integer)v20).intValue()));
    Object v22 = 1;
    ((java.text.FieldPosition)v21).setBeginIndex((((java.lang.Integer)v22).intValue()));
    Object v23 = null;
    Object v24 = ((java.text.DateFormat)v8).format(((java.lang.Object)v10),((java.lang.StringBuffer)v19),((java.text.FieldPosition)v21));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(((java.util.TimeZone)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(((java.util.TimeZone)v1));
    Object v3 = ((java.text.DateFormat)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(-1969359365), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).toString();
    org.junit.Assert.assertEquals((Object)("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en)"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = "tems";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parseAsISO8601(((java.lang.String)v3),((java.text.ParsePosition)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = java.util.Locale.getDefault();
    Object v1 = java.text.NumberFormat.getPercentInstance(((java.util.Locale)v0));
    Object v2 = "items";
    Object v3 = ((java.text.Format)v1).parseObject(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(((java.util.TimeZone)v1));
    Object v3 = false;
    ((java.text.DateFormat)v2).setLenient((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = java.util.Locale.getDefault();
    Object v1 = java.text.NumberFormat.getPercentInstance(((java.util.Locale)v0));
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.text.Format)v1).formatToCharacterIterator(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = java.util.Locale.getDefault();
    Object v1 = java.text.NumberFormat.getPercentInstance(((java.util.Locale)v0));
    Object v2 = "Failed;to getValue() with method ";
    Object v3 = ((java.text.Format)v1).parseObject(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(((java.util.TimeZone)v1));
    Object v3 = "integer";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.text.Format)v2).parseObject(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = "Attempted to unwrap single value array for single 'long' value but there was more than a single value n the array";
    Object v8 = ((java.text.Format)v2).parseObject(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = -76L;
    Object v10 = 0L;
    Object v11 = java.time.Instant.ofEpochSecond((((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
    Object v12 = java.util.Date.from(((java.time.Instant)v11));
    Object v13 = ((java.text.DateFormat)v8).format(((java.util.Date)v12));
    Object v14 = "sring";
    Object v15 = java.util.TimeZone.getTimeZone(((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withTimeZone(((java.util.TimeZone)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = ((java.text.DateFormat)v8).getNumberFormat();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 0;
    Object v1 = java.util.Locale.getDefault();
    Object v2 = ((java.util.Locale)v1).getExtensionKeys();
    Object v3 = java.text.DateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v1));
    Object v4 = -76L;
    Object v5 = 0L;
    Object v6 = java.time.Instant.ofEpochSecond((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()));
    Object v7 = java.util.Date.from(((java.time.Instant)v6));
    Object v8 = ((java.text.DateFormat)v3).format(((java.util.Date)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = java.text.NumberFormat.getPercentInstance(((java.util.Locale)v9));
    Object v11 = java.math.RoundingMode.HALF_UP;
    ((java.text.NumberFormat)v10).setRoundingMode(((java.math.RoundingMode)v11));
    Object v12 = null;
    ((java.text.DateFormat)v3).setNumberFormat(((java.text.NumberFormat)v10));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = "sring";
    Object v4 = java.util.TimeZone.getTimeZone(((java.lang.String)v3));
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).setTimeZone(((java.util.TimeZone)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = -76L;
    Object v10 = 0L;
    Object v11 = java.time.Instant.ofEpochSecond((((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
    Object v12 = java.util.Date.from(((java.time.Instant)v11));
    Object v13 = ((java.text.DateFormat)v8).format(((java.util.Date)v12));
    Object v14 = "sring";
    Object v15 = java.util.TimeZone.getTimeZone(((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withTimeZone(((java.util.TimeZone)v15));
    Object v17 = "Attempted to unwrap single value array for single '";
    Object v18 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v16).looksLikeISO8601(((java.lang.String)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.text.DateFormat.getInstance();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = java.text.DateFormat.getInstance();
    Object v1 = 0;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = -76L;
    Object v4 = 0L;
    Object v5 = java.time.Instant.ofEpochSecond((((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = java.util.Date.from(((java.time.Instant)v5));
    Object v7 = false;
    Object v8 = "sring";
    Object v9 = java.util.TimeZone.getTimeZone(((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ISO8601Utils.format(((java.util.Date)v6),(((java.lang.Boolean)v7).booleanValue()),((java.util.TimeZone)v9));
    Object v11 = new java.lang.StringBuffer(((java.lang.CharSequence)v10));
    Object v12 = -8;
    Object v13 = new java.text.FieldPosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((java.text.DateFormat)v0).format(((java.lang.Object)v2),((java.lang.StringBuffer)v11),((java.text.FieldPosition)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = ")";
    Object v10 = 0;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).parseAsISO8601(((java.lang.String)v9),((java.text.ParsePosition)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = java.text.NumberFormat.getPercentInstance(((java.util.Locale)v1));
    ((java.text.DateFormat)v0).setNumberFormat(((java.text.NumberFormat)v2));
    Object v3 = null;
    Object v4 = "sring";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = -76L;
    Object v7 = 0L;
    Object v8 = java.time.Instant.ofEpochSecond((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()));
    Object v9 = java.util.Date.from(((java.time.Instant)v8));
    Object v10 = false;
    Object v11 = "sring";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = com.fasterxml.jackson.databind.util.ISO8601Utils.format(((java.util.Date)v9),(((java.lang.Boolean)v10).booleanValue()),((java.util.TimeZone)v12));
    Object v14 = new java.lang.StringBuffer(((java.lang.CharSequence)v13));
    Object v15 = -8;
    Object v16 = new java.text.FieldPosition((((java.lang.Integer)v15).intValue()));
    Object v17 = -64;
    ((java.text.FieldPosition)v16).setBeginIndex((((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = ((java.text.DateFormat)v0).format(((java.lang.Object)v5),((java.lang.StringBuffer)v14),((java.text.FieldPosition)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = -76L;
    Object v10 = 0L;
    Object v11 = java.time.Instant.ofEpochSecond((((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
    Object v12 = java.util.Date.from(((java.time.Instant)v11));
    Object v13 = ((java.text.DateFormat)v8).format(((java.util.Date)v12));
    Object v14 = "sring";
    Object v15 = java.util.TimeZone.getTimeZone(((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withTimeZone(((java.util.TimeZone)v15));
    Object v17 = "sring";
    Object v18 = java.util.TimeZone.getTimeZone(((java.lang.String)v17));
    Object v19 = java.util.Calendar.getInstance(((java.util.TimeZone)v18));
    ((java.text.DateFormat)v16).setCalendar(((java.util.Calendar)v19));
    Object v20 = null;
    Object v21 = "AnnotationIntrospector returned Class ";
    Object v22 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v16).parse(((java.lang.String)v21));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = -76L;
    Object v10 = 0L;
    Object v11 = java.time.Instant.ofEpochSecond((((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
    Object v12 = java.util.Date.from(((java.time.Instant)v11));
    Object v13 = -76L;
    Object v14 = 0L;
    Object v15 = java.time.Instant.ofEpochSecond((((java.lang.Long)v13).longValue()),(((java.lang.Long)v14).longValue()));
    Object v16 = java.util.Date.from(((java.time.Instant)v15));
    Object v17 = false;
    Object v18 = "sring";
    Object v19 = java.util.TimeZone.getTimeZone(((java.lang.String)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ISO8601Utils.format(((java.util.Date)v16),(((java.lang.Boolean)v17).booleanValue()),((java.util.TimeZone)v19));
    Object v21 = new java.lang.StringBuffer(((java.lang.CharSequence)v20));
    Object v22 = -8;
    Object v23 = new java.text.FieldPosition((((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).format(((java.util.Date)v12),((java.lang.StringBuffer)v21),((java.text.FieldPosition)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = java.text.NumberFormat.getPercentInstance(((java.util.Locale)v1));
    ((java.text.DateFormat)v0).setNumberFormat(((java.text.NumberFormat)v2));
    Object v3 = null;
    Object v4 = "sring";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v5));
    Object v7 = ((java.text.DateFormat)v0).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 0;
    Object v1 = java.util.Locale.getDefault();
    Object v2 = ((java.util.Locale)v1).getExtensionKeys();
    Object v3 = java.text.DateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v1));
    Object v4 = -76L;
    Object v5 = 0L;
    Object v6 = java.time.Instant.ofEpochSecond((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()));
    Object v7 = java.util.Date.from(((java.time.Instant)v6));
    Object v8 = ((java.text.DateFormat)v3).format(((java.util.Date)v7));
    org.junit.Assert.assertEquals((Object)("Wednesday, December 31, 1969"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withLocale(((java.util.Locale)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withLocale(((java.util.Locale)v9));
    Object v11 = java.util.Locale.getDefault();
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withLocale(((java.util.Locale)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withLocale(((java.util.Locale)v9));
    Object v11 = "sring";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withTimeZone(((java.util.TimeZone)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = -25;
    Object v1 = java.util.Locale.getDefault();
    Object v2 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
    Object v1 = "sring";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = ((java.text.DateFormat)v0).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withLocale(((java.util.Locale)v9));
    Object v11 = java.util.Locale.getDefault();
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withLocale(((java.util.Locale)v11));
    Object v13 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v12).toString();
    Object v14 = java.util.Locale.getDefault();
    Object v15 = ((java.util.Locale)v14).getUnicodeLocaleAttributes();
    Object v16 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v12).withLocale(((java.util.Locale)v14));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = -76L;
    Object v10 = 0L;
    Object v11 = java.time.Instant.ofEpochSecond((((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
    Object v12 = java.util.Date.from(((java.time.Instant)v11));
    Object v13 = ((java.text.DateFormat)v8).format(((java.util.Date)v12));
    Object v14 = "sring";
    Object v15 = java.util.TimeZone.getTimeZone(((java.lang.String)v14));
    Object v16 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withTimeZone(((java.util.TimeZone)v15));
    Object v17 = "valueOf";
    Object v18 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v16).parse(((java.lang.String)v17));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = java.text.DateFormat.getTimeInstance();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
    Object v10 = ((java.text.Format)v8).format(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
    Object v1 = ((java.text.DateFormat)v0).getTimeZone();
    Object v2 = -76L;
    Object v3 = 0L;
    Object v4 = java.time.Instant.ofEpochSecond((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()));
    Object v5 = ((java.text.DateFormat)v0).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withLocale(((java.util.Locale)v9));
    Object v11 = java.util.Locale.getDefault();
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withLocale(((java.util.Locale)v11));
    Object v13 = java.util.Locale.getDefault();
    Object v14 = ((java.text.DateFormat)v12).equals(((java.lang.Object)v13));
    Object v15 = "sring";
    Object v16 = java.util.TimeZone.getTimeZone(((java.lang.String)v15));
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v12).setTimeZone(((java.util.TimeZone)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
    Object v1 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
    Object v2 = ((java.text.DateFormat)v1).getTimeZone();
    Object v3 = -76L;
    Object v4 = 0L;
    Object v5 = java.time.Instant.ofEpochSecond((((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = ((java.text.DateFormat)v1).equals(((java.lang.Object)v5));
    Object v7 = ((java.text.DateFormat)v0).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = java.text.DateFormat.getDateInstance();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = -76L;
    Object v10 = 0L;
    Object v11 = java.time.Instant.ofEpochSecond((((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
    Object v12 = java.util.Date.from(((java.time.Instant)v11));
    Object v13 = -76L;
    Object v14 = 0L;
    Object v15 = java.time.Instant.ofEpochSecond((((java.lang.Long)v13).longValue()),(((java.lang.Long)v14).longValue()));
    Object v16 = java.util.Date.from(((java.time.Instant)v15));
    Object v17 = false;
    Object v18 = "sring";
    Object v19 = java.util.TimeZone.getTimeZone(((java.lang.String)v18));
    Object v20 = com.fasterxml.jackson.databind.util.ISO8601Utils.format(((java.util.Date)v16),(((java.lang.Boolean)v17).booleanValue()),((java.util.TimeZone)v19));
    Object v21 = new java.lang.StringBuffer(((java.lang.CharSequence)v20));
    Object v22 = -8;
    Object v23 = new java.text.FieldPosition((((java.lang.Integer)v22).intValue()));
    Object v24 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).format(((java.util.Date)v12),((java.lang.StringBuffer)v21),((java.text.FieldPosition)v23));
    Object v25 = java.util.Locale.getDefault();
    Object v26 = java.util.Locale.getDefault();
    Object v27 = ((java.util.Locale)v25).getDisplayName(((java.util.Locale)v26));
    Object v28 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withLocale(((java.util.Locale)v25));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = java.text.DateFormat.getDateTimeInstance();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withLocale(((java.util.Locale)v9));
    Object v11 = java.util.Locale.getDefault();
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withLocale(((java.util.Locale)v11));
    Object v13 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v12).toString();
    Object v14 = java.util.Locale.getDefault();
    Object v15 = ((java.util.Locale)v14).getUnicodeLocaleAttributes();
    Object v16 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v12).withLocale(((java.util.Locale)v14));
    Object v17 = -76L;
    Object v18 = 0L;
    Object v19 = java.time.Instant.ofEpochSecond((((java.lang.Long)v17).longValue()),(((java.lang.Long)v18).longValue()));
    Object v20 = java.util.Date.from(((java.time.Instant)v19));
    Object v21 = -76L;
    Object v22 = 0L;
    Object v23 = java.time.Instant.ofEpochSecond((((java.lang.Long)v21).longValue()),(((java.lang.Long)v22).longValue()));
    Object v24 = java.util.Date.from(((java.time.Instant)v23));
    Object v25 = false;
    Object v26 = "sring";
    Object v27 = java.util.TimeZone.getTimeZone(((java.lang.String)v26));
    Object v28 = com.fasterxml.jackson.databind.util.ISO8601Utils.format(((java.util.Date)v24),(((java.lang.Boolean)v25).booleanValue()),((java.util.TimeZone)v27));
    Object v29 = new java.lang.StringBuffer(((java.lang.CharSequence)v28));
    Object v30 = -8;
    Object v31 = new java.text.FieldPosition((((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v16).format(((java.util.Date)v20),((java.lang.StringBuffer)v29),((java.text.FieldPosition)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 1;
    Object v1 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withLocale(((java.util.Locale)v9));
    Object v11 = java.util.Locale.getDefault();
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withLocale(((java.util.Locale)v11));
    Object v13 = "sring";
    Object v14 = java.util.TimeZone.getTimeZone(((java.lang.String)v13));
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v12).setTimeZone(((java.util.TimeZone)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withLocale(((java.util.Locale)v9));
    Object v11 = java.util.Locale.getDefault();
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withLocale(((java.util.Locale)v11));
    Object v13 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v12).toString();
    Object v14 = java.util.Locale.getDefault();
    Object v15 = ((java.util.Locale)v14).getUnicodeLocaleAttributes();
    Object v16 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v12).withLocale(((java.util.Locale)v14));
    Object v17 = "";
    Object v18 = 0;
    Object v19 = new java.text.ParsePosition((((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v16).parse(((java.lang.String)v17),((java.text.ParsePosition)v19));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 0;
    Object v1 = java.text.DateFormat.getDateInstance((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 81;
    Object v1 = -22;
    Object v2 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withLocale(((java.util.Locale)v9));
    Object v11 = "sring";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withTimeZone(((java.util.TimeZone)v12));
    Object v14 = " has no property name annotation; must have name when multiple-parameter constructor annotated as Creator";
    Object v15 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v13).looksLikeISO8601(((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(((java.util.TimeZone)v1));
    Object v3 = ((java.text.DateFormat)v2).getTimeZone();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = java.text.DateFormat.getAvailableLocales();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withLocale(((java.util.Locale)v9));
    Object v11 = "'), but";
    Object v12 = 0;
    Object v13 = new java.text.ParsePosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).parse(((java.lang.String)v11),((java.text.ParsePosition)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = java.util.Locale.getDefault();
    Object v3 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.Locale)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = java.util.Locale.getDefault();
    Object v3 = java.util.Locale.getDefault();
    Object v4 = ((java.util.Locale)v2).getDisplayScript(((java.util.Locale)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1),((java.util.Locale)v2));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withLocale(((java.util.Locale)v9));
    Object v11 = java.util.Locale.getDefault();
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withLocale(((java.util.Locale)v11));
    Object v13 = "sring";
    Object v14 = java.util.TimeZone.getTimeZone(((java.lang.String)v13));
    Object v15 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v12).withTimeZone(((java.util.TimeZone)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.Locale.getDefault();
    Object v2 = ((java.util.Locale)v1).getDisplayScript();
    Object v3 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = java.text.DateFormat.getDateTimeInstance();
    Object v1 = "sring";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = -76L;
    Object v4 = 0L;
    Object v5 = java.time.Instant.ofEpochSecond((((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = java.util.Date.from(((java.time.Instant)v5));
    Object v7 = false;
    Object v8 = "sring";
    Object v9 = java.util.TimeZone.getTimeZone(((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.databind.util.ISO8601Utils.format(((java.util.Date)v6),(((java.lang.Boolean)v7).booleanValue()),((java.util.TimeZone)v9));
    Object v11 = new java.lang.StringBuffer(((java.lang.CharSequence)v10));
    Object v12 = -8;
    Object v13 = new java.text.FieldPosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((java.text.DateFormat)v0).format(((java.lang.Object)v2),((java.lang.StringBuffer)v11),((java.text.FieldPosition)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = java.util.Locale.getDefault();
    Object v3 = java.util.Locale.getDefault();
    Object v4 = ((java.util.Locale)v2).getDisplayScript(((java.util.Locale)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v6 = "BOOLE";
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).clone();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withLocale(((java.util.Locale)v9));
    Object v11 = "sring";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withTimeZone(((java.util.TimeZone)v12));
    Object v14 = "aBray";
    Object v15 = 0;
    Object v16 = new java.text.ParsePosition((((java.lang.Integer)v15).intValue()));
    Object v17 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v13).parseAsRFC1123(((java.lang.String)v14),((java.text.ParsePosition)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = java.util.Locale.getDefault();
    Object v3 = java.util.Locale.getDefault();
    Object v4 = ((java.util.Locale)v2).getDisplayScript(((java.util.Locale)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v6 = "sring";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = java.util.Calendar.getInstance(((java.util.TimeZone)v7));
    Object v9 = ((java.text.DateFormat)v5).equals(((java.lang.Object)v8));
    Object v10 = "sring";
    Object v11 = java.util.TimeZone.getTimeZone(((java.lang.String)v10));
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v5).setTimeZone(((java.util.TimeZone)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withLocale(((java.util.Locale)v9));
    Object v11 = "sring";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withTimeZone(((java.util.TimeZone)v12));
    Object v14 = "]";
    Object v15 = 0;
    Object v16 = new java.text.ParsePosition((((java.lang.Integer)v15).intValue()));
    Object v17 = 1;
    ((java.text.ParsePosition)v16).setIndex((((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v13).parseAsRFC1123(((java.lang.String)v14),((java.text.ParsePosition)v16));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withLocale(((java.util.Locale)v9));
    Object v11 = java.util.Locale.getDefault();
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withLocale(((java.util.Locale)v11));
    Object v13 = "sring";
    Object v14 = java.util.TimeZone.getTimeZone(((java.lang.String)v13));
    Object v15 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v12).withTimeZone(((java.util.TimeZone)v14));
    Object v16 = java.util.Locale.getDefault();
    Object v17 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v15).withLocale(((java.util.Locale)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withLocale(((java.util.Locale)v9));
    Object v11 = java.util.Locale.getDefault();
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withLocale(((java.util.Locale)v11));
    Object v13 = "sring";
    Object v14 = java.util.TimeZone.getTimeZone(((java.lang.String)v13));
    Object v15 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v12).withTimeZone(((java.util.TimeZone)v14));
    Object v16 = "sring";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = java.util.Locale.getDefault();
    Object v19 = java.util.Locale.getDefault();
    Object v20 = ((java.util.Locale)v18).getDisplayScript(((java.util.Locale)v19));
    Object v21 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v17),((java.util.Locale)v18));
    Object v22 = -76L;
    Object v23 = 0L;
    Object v24 = java.time.Instant.ofEpochSecond((((java.lang.Long)v22).longValue()),(((java.lang.Long)v23).longValue()));
    Object v25 = java.util.Date.from(((java.time.Instant)v24));
    Object v26 = false;
    Object v27 = "sring";
    Object v28 = java.util.TimeZone.getTimeZone(((java.lang.String)v27));
    Object v29 = com.fasterxml.jackson.databind.util.ISO8601Utils.format(((java.util.Date)v25),(((java.lang.Boolean)v26).booleanValue()),((java.util.TimeZone)v28));
    Object v30 = new java.lang.StringBuffer(((java.lang.CharSequence)v29));
    Object v31 = -8;
    Object v32 = new java.text.FieldPosition((((java.lang.Integer)v31).intValue()));
    Object v33 = ((java.text.DateFormat)v15).format(((java.lang.Object)v21),((java.lang.StringBuffer)v30),((java.text.FieldPosition)v32));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
    Object v1 = -8;
    Object v2 = new java.text.FieldPosition((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.text.DateFormat)v0).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 0;
    Object v1 = java.util.Locale.getDefault();
    Object v2 = java.text.DateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withLocale(((java.util.Locale)v9));
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).toString();
    org.junit.Assert.assertEquals((Object)("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null])(locale: en)"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = -26;
    Object v1 = -24;
    Object v2 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.text.DateFormat.getDateInstance();
    Object v1 = ((java.text.DateFormat)v0).getTimeZone();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
    Object v1 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
    Object v2 = ((java.text.DateFormat)v0).equals(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = java.text.NumberFormat.getPercentInstance(((java.util.Locale)v1));
    ((java.text.DateFormat)v0).setNumberFormat(((java.text.NumberFormat)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintISO8601Format();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = java.util.Locale.getDefault();
    Object v3 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(((java.util.TimeZone)v1),((java.util.Locale)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).clone();
    Object v10 = "AnnotationIntrospector returned Class ";
    Object v11 = 0;
    Object v12 = new java.text.ParsePosition((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).parseAsRFC1123(((java.lang.String)v10),((java.text.ParsePosition)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
    Object v1 = -76L;
    Object v2 = 0L;
    Object v3 = java.time.Instant.ofEpochSecond((((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()));
    Object v4 = ((java.text.DateFormat)v0).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(((java.util.TimeZone)v0),((java.util.Locale)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = java.util.Locale.getDefault();
    Object v3 = ((java.util.Locale)v2).stripExtensions();
    Object v4 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.Locale)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(((java.util.TimeZone)v1));
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = java.util.Locale.getDefault();
    Object v6 = ((java.util.Locale)v5).stripExtensions();
    Object v7 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),((java.util.Locale)v5));
    Object v8 = -76L;
    Object v9 = 0L;
    Object v10 = java.time.Instant.ofEpochSecond((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
    Object v11 = java.util.Date.from(((java.time.Instant)v10));
    Object v12 = false;
    Object v13 = "sring";
    Object v14 = java.util.TimeZone.getTimeZone(((java.lang.String)v13));
    Object v15 = com.fasterxml.jackson.databind.util.ISO8601Utils.format(((java.util.Date)v11),(((java.lang.Boolean)v12).booleanValue()),((java.util.TimeZone)v14));
    Object v16 = new java.lang.StringBuffer(((java.lang.CharSequence)v15));
    Object v17 = -76L;
    Object v18 = 0L;
    Object v19 = java.time.Instant.ofEpochSecond((((java.lang.Long)v17).longValue()),(((java.lang.Long)v18).longValue()));
    Object v20 = java.util.Date.from(((java.time.Instant)v19));
    Object v21 = false;
    Object v22 = "sring";
    Object v23 = java.util.TimeZone.getTimeZone(((java.lang.String)v22));
    Object v24 = com.fasterxml.jackson.databind.util.ISO8601Utils.format(((java.util.Date)v20),(((java.lang.Boolean)v21).booleanValue()),((java.util.TimeZone)v23));
    Object v25 = new java.lang.StringBuffer(((java.lang.CharSequence)v24));
    Object v26 = ((java.lang.StringBuffer)v16).compareTo(((java.lang.StringBuffer)v25));
    Object v27 = -8;
    Object v28 = new java.text.FieldPosition((((java.lang.Integer)v27).intValue()));
    Object v29 = 0;
    ((java.text.FieldPosition)v28).setEndIndex((((java.lang.Integer)v29).intValue()));
    Object v30 = null;
    Object v31 = ((java.text.DateFormat)v2).format(((java.lang.Object)v7),((java.lang.StringBuffer)v16),((java.text.FieldPosition)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 1;
    Object v1 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = false;
    ((java.text.DateFormat)v1).setLenient((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = "sring";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v5));
    Object v7 = "sring";
    Object v8 = java.util.TimeZone.getTimeZone(((java.lang.String)v7));
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).setTimeZone(((java.util.TimeZone)v8));
    Object v9 = null;
    Object v10 = "Class ";
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).looksLikeISO8601(((java.lang.String)v10));
    Object v12 = ((java.text.DateFormat)v1).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = java.util.Locale.getDefault();
    Object v3 = java.util.Locale.getDefault();
    Object v4 = ((java.util.Locale)v2).getDisplayScript(((java.util.Locale)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v6 = "sring";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v5).setTimeZone(((java.util.TimeZone)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = java.util.Locale.getDefault();
    Object v3 = java.util.Locale.getDefault();
    Object v4 = ((java.util.Locale)v2).getDisplayScript(((java.util.Locale)v3));
    Object v5 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v6 = -76L;
    Object v7 = 0L;
    Object v8 = java.time.Instant.ofEpochSecond((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()));
    Object v9 = java.util.Date.from(((java.time.Instant)v8));
    Object v10 = -76L;
    Object v11 = 0L;
    Object v12 = java.time.Instant.ofEpochSecond((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()));
    Object v13 = java.util.Date.from(((java.time.Instant)v12));
    Object v14 = false;
    Object v15 = "sring";
    Object v16 = java.util.TimeZone.getTimeZone(((java.lang.String)v15));
    Object v17 = com.fasterxml.jackson.databind.util.ISO8601Utils.format(((java.util.Date)v13),(((java.lang.Boolean)v14).booleanValue()),((java.util.TimeZone)v16));
    Object v18 = new java.lang.StringBuffer(((java.lang.CharSequence)v17));
    Object v19 = -8;
    Object v20 = new java.text.FieldPosition((((java.lang.Integer)v19).intValue()));
    Object v21 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v5).format(((java.util.Date)v9),((java.lang.StringBuffer)v18),((java.text.FieldPosition)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "sring";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v1));
    Object v3 = ": ";
    Object v4 = 0;
    Object v5 = new java.text.ParsePosition((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).parse(((java.lang.String)v3),((java.text.ParsePosition)v5));
    Object v7 = java.util.Locale.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v2).withLocale(((java.util.Locale)v7));
    Object v9 = java.util.Locale.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withLocale(((java.util.Locale)v9));
    Object v11 = "";
    Object v12 = 0;
    Object v13 = new java.text.ParsePosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).parse(((java.lang.String)v11),((java.text.ParsePosition)v13));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.getDefault();
    Object v2 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = java.text.DateFormat.getDateTimeInstance();
    Object v1 = "V";
    Object v2 = 0;
    Object v3 = new java.text.ParsePosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.text.DateFormat)v0).parseObject(((java.lang.String)v1),((java.text.ParsePosition)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.util.StdDateFormat.getBlueprintRFC1123Format();
    Object v1 = "sring";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(((java.util.TimeZone)v2));
    Object v4 = ((java.text.DateFormat)v3).hashCode();
    Object v5 = ((java.text.DateFormat)v0).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }
}
