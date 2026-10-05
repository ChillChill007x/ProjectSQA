package org.apache.commons.lang3.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = new int[]{1,-9};
    Object v8 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).parseToken(((java.lang.String)v6),((int[])v7));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).parsePattern();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = -3L;
    Object v7 = new java.util.Date((((java.lang.Long)v6).longValue()));
    Object v8 = ((java.util.Date)v7).getMonth();
    Object v9 = new org.apache.commons.lang3.exception.ContextedException();
    Object v10 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v9));
    Object v11 = new java.lang.StringBuffer(((java.lang.CharSequence)v10));
    Object v12 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.util.Date)v7),((java.lang.StringBuffer)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "_";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = "b";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = java.util.Calendar.getInstance(((java.util.TimeZone)v7),((java.util.Locale)v9));
    Object v11 = new org.apache.commons.lang3.exception.ContextedException();
    Object v12 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v11));
    Object v13 = new java.lang.StringBuffer(((java.lang.CharSequence)v12));
    Object v14 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.util.Calendar)v10),((java.lang.StringBuffer)v13));
    Object v15 = 1L;
    Object v16 = new org.apache.commons.lang3.exception.ContextedException();
    Object v17 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v16));
    Object v18 = new java.lang.StringBuffer(((java.lang.CharSequence)v17));
    Object v19 = 0;
    Object v20 = ((java.lang.StringBuffer)v18).charAt((((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format((((java.lang.Long)v15).longValue()),((java.lang.StringBuffer)v18));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "_";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = "b";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = java.util.Calendar.getInstance(((java.util.TimeZone)v7),((java.util.Locale)v9));
    Object v11 = new org.apache.commons.lang3.exception.ContextedException();
    Object v12 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v11));
    Object v13 = new java.lang.StringBuffer(((java.lang.CharSequence)v12));
    Object v14 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).applyRules(((java.util.Calendar)v10),((java.lang.StringBuffer)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "_";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = "b";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = java.util.Calendar.getInstance(((java.util.TimeZone)v7),((java.util.Locale)v9));
    Object v11 = new org.apache.commons.lang3.exception.ContextedException();
    Object v12 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v11));
    Object v13 = new java.lang.StringBuffer(((java.lang.CharSequence)v12));
    Object v14 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.util.Calendar)v10),((java.lang.StringBuffer)v13));
    Object v15 = new org.apache.commons.lang3.exception.ContextedException();
    Object v16 = new org.apache.commons.lang3.exception.ContextedException();
    Object v17 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v16));
    Object v18 = new java.lang.StringBuffer(((java.lang.CharSequence)v17));
    Object v19 = 0;
    Object v20 = new char[]{};
    Object v21 = ((java.lang.StringBuffer)v18).insert((((java.lang.Integer)v19).intValue()),((char[])v20));
    Object v22 = 0;
    Object v23 = new java.text.FieldPosition((((java.lang.Integer)v22).intValue()));
    Object v24 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.lang.Object)v15),((java.lang.StringBuffer)v18),((java.text.FieldPosition)v23));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = 0;
    Object v7 = new java.text.FieldPosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "_";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = true;
    Object v3 = 1;
    Object v4 = "b";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(((java.util.TimeZone)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v5));
    org.junit.Assert.assertEquals((Object)("Greenwich Mean Time"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "_";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = "b";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = java.util.Calendar.getInstance(((java.util.TimeZone)v7),((java.util.Locale)v9));
    Object v11 = new org.apache.commons.lang3.exception.ContextedException();
    Object v12 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v11));
    Object v13 = new java.lang.StringBuffer(((java.lang.CharSequence)v12));
    Object v14 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.util.Calendar)v10),((java.lang.StringBuffer)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = -3L;
    Object v7 = new java.util.Date((((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.util.Date)v7));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "The Arr";
    Object v7 = new int[]{0,0};
    Object v8 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).parseToken(((java.lang.String)v6),((int[])v7));
    org.junit.Assert.assertEquals((Object)("T"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = 0L;
    Object v7 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format((((java.lang.Long)v6).longValue()));
    Object v8 = "";
    Object v9 = new int[]{4};
    Object v10 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).parseToken(((java.lang.String)v8),((int[])v9));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "_";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = false;
    Object v3 = 0;
    Object v4 = "b";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(((java.util.TimeZone)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v5));
    org.junit.Assert.assertEquals((Object)("GMT"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "_";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = "b";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = java.util.Calendar.getInstance(((java.util.TimeZone)v7),((java.util.Locale)v9));
    Object v11 = "";
    Object v12 = "_";
    Object v13 = java.util.TimeZone.getTimeZone(((java.lang.String)v12));
    Object v14 = "b";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v11),((java.util.TimeZone)v13),((java.util.Locale)v15));
    Object v17 = "_";
    Object v18 = java.util.TimeZone.getTimeZone(((java.lang.String)v17));
    Object v19 = "b";
    Object v20 = java.util.Locale.forLanguageTag(((java.lang.String)v19));
    Object v21 = java.util.Calendar.getInstance(((java.util.TimeZone)v18),((java.util.Locale)v20));
    Object v22 = new org.apache.commons.lang3.exception.ContextedException();
    Object v23 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v22));
    Object v24 = new java.lang.StringBuffer(((java.lang.CharSequence)v23));
    Object v25 = ((org.apache.commons.lang3.time.FastDatePrinter)v16).applyRules(((java.util.Calendar)v21),((java.lang.StringBuffer)v24));
    Object v26 = -27;
    Object v27 = ((java.lang.StringBuffer)v25).append((((java.lang.Integer)v26).intValue()));
    Object v28 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).applyRules(((java.util.Calendar)v10),((java.lang.StringBuffer)v25));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = java.util.TimeZone.getTimeZone(((java.lang.String)v7));
    Object v9 = "b";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v6),((java.util.TimeZone)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = new org.apache.commons.lang3.exception.ContextedException();
    Object v7 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v6));
    Object v8 = new java.lang.StringBuffer(((java.lang.CharSequence)v7));
    Object v9 = new org.apache.commons.lang3.exception.ContextedException();
    Object v10 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v9));
    Object v11 = new java.lang.StringBuffer(((java.lang.CharSequence)v10));
    Object v12 = 0;
    Object v13 = new java.text.FieldPosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.lang.Object)v8),((java.lang.StringBuffer)v11),((java.text.FieldPosition)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "_";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = "b";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = java.util.Calendar.getInstance(((java.util.TimeZone)v7),((java.util.Locale)v9));
    Object v11 = ((java.util.Calendar)v10).toInstant();
    Object v12 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.util.Calendar)v10));
    org.junit.Assert.assertEquals((Object)(""), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).toString();
    Object v7 = "_";
    Object v8 = java.util.TimeZone.getTimeZone(((java.lang.String)v7));
    Object v9 = "b";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = java.util.Calendar.getInstance(((java.util.TimeZone)v8),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.lang3.exception.ContextedException();
    Object v13 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v12));
    Object v14 = new java.lang.StringBuffer(((java.lang.CharSequence)v13));
    Object v15 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).applyRules(((java.util.Calendar)v11),((java.lang.StringBuffer)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = 0L;
    Object v7 = "";
    Object v8 = "_";
    Object v9 = java.util.TimeZone.getTimeZone(((java.lang.String)v8));
    Object v10 = "b";
    Object v11 = java.util.Locale.forLanguageTag(((java.lang.String)v10));
    Object v12 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v7),((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = "_";
    Object v14 = java.util.TimeZone.getTimeZone(((java.lang.String)v13));
    Object v15 = "b";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = java.util.Calendar.getInstance(((java.util.TimeZone)v14),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.lang3.exception.ContextedException();
    Object v19 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v18));
    Object v20 = new java.lang.StringBuffer(((java.lang.CharSequence)v19));
    Object v21 = ((org.apache.commons.lang3.time.FastDatePrinter)v12).applyRules(((java.util.Calendar)v17),((java.lang.StringBuffer)v20));
    Object v22 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format((((java.lang.Long)v6).longValue()),((java.lang.StringBuffer)v21));
    Object v23 = new org.apache.commons.lang3.exception.ContextedException();
    Object v24 = new org.apache.commons.lang3.exception.ContextedException();
    Object v25 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v24));
    Object v26 = new java.lang.StringBuffer(((java.lang.CharSequence)v25));
    Object v27 = 0;
    Object v28 = new java.text.FieldPosition((((java.lang.Integer)v27).intValue()));
    Object v29 = "b";
    Object v30 = java.util.Locale.forLanguageTag(((java.lang.String)v29));
    Object v31 = ((java.text.FieldPosition)v28).equals(((java.lang.Object)v30));
    Object v32 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.lang.Object)v23),((java.lang.StringBuffer)v26),((java.text.FieldPosition)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = 0L;
    Object v7 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format((((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).getPattern();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = java.util.TimeZone.getTimeZone(((java.lang.String)v7));
    Object v9 = "b";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v6),((java.util.TimeZone)v8),((java.util.Locale)v10));
    Object v12 = new org.apache.commons.lang3.exception.ContextedException();
    Object v13 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v12));
    Object v14 = new java.lang.StringBuffer(((java.lang.CharSequence)v13));
    Object v15 = "N&isin;";
    Object v16 = ((java.lang.StringBuffer)v14).indexOf(((java.lang.String)v15));
    Object v17 = 0;
    Object v18 = new java.text.FieldPosition((((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.lang.Object)v11),((java.lang.StringBuffer)v14),((java.text.FieldPosition)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "The Array must not be null";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "Exception thrown on toString(): ";
    Object v7 = new int[]{};
    Object v8 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).parseToken(((java.lang.String)v6),((int[])v7));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "HP-UX";
    Object v7 = new int[]{};
    Object v8 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).parseToken(((java.lang.String)v6),((int[])v7));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = new int[]{1,1,1};
    Object v8 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).parseToken(((java.lang.String)v6),((int[])v7));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "_";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = "b";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = java.util.Calendar.getInstance(((java.util.TimeZone)v7),((java.util.Locale)v9));
    Object v11 = ((java.util.Calendar)v10).getWeeksInWeekYear();
    Object v12 = new org.apache.commons.lang3.exception.ContextedException();
    Object v13 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v12));
    Object v14 = new java.lang.StringBuffer(((java.lang.CharSequence)v13));
    Object v15 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).applyRules(((java.util.Calendar)v10),((java.lang.StringBuffer)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "_";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = false;
    Object v3 = 2;
    Object v4 = "b";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(((java.util.TimeZone)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = -3L;
    Object v7 = new java.util.Date((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.lang3.exception.ContextedException();
    Object v9 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v8));
    Object v10 = new java.lang.StringBuffer(((java.lang.CharSequence)v9));
    Object v11 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.util.Date)v7),((java.lang.StringBuffer)v10));
    Object v12 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).getTimeZone();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = 0;
    Object v7 = new java.text.FieldPosition((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.lang3.exception.ContextedException();
    Object v9 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v8));
    Object v10 = new java.lang.StringBuffer(((java.lang.CharSequence)v9));
    Object v11 = 0;
    Object v12 = new java.text.FieldPosition((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.lang.Object)v7),((java.lang.StringBuffer)v10),((java.text.FieldPosition)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).getLocale();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "missing assignment type for type variable ";
    Object v7 = new int[]{0,13};
    Object v8 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).parseToken(((java.lang.String)v6),((int[])v7));
    org.junit.Assert.assertEquals((Object)("m"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).toString();
    org.junit.Assert.assertEquals((Object)("FastDatePrinter[,,GMT]"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "_";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = "b";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = java.util.Calendar.getInstance(((java.util.TimeZone)v7),((java.util.Locale)v9));
    Object v11 = "";
    Object v12 = "_";
    Object v13 = java.util.TimeZone.getTimeZone(((java.lang.String)v12));
    Object v14 = "b";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v11),((java.util.TimeZone)v13),((java.util.Locale)v15));
    Object v17 = "_";
    Object v18 = java.util.TimeZone.getTimeZone(((java.lang.String)v17));
    Object v19 = "b";
    Object v20 = java.util.Locale.forLanguageTag(((java.lang.String)v19));
    Object v21 = java.util.Calendar.getInstance(((java.util.TimeZone)v18),((java.util.Locale)v20));
    Object v22 = new org.apache.commons.lang3.exception.ContextedException();
    Object v23 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v22));
    Object v24 = new java.lang.StringBuffer(((java.lang.CharSequence)v23));
    Object v25 = ((org.apache.commons.lang3.time.FastDatePrinter)v16).applyRules(((java.util.Calendar)v21),((java.lang.StringBuffer)v24));
    Object v26 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).applyRules(((java.util.Calendar)v10),((java.lang.StringBuffer)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = 4L;
    Object v7 = new org.apache.commons.lang3.exception.ContextedException();
    Object v8 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v7));
    Object v9 = new java.lang.StringBuffer(((java.lang.CharSequence)v8));
    Object v10 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format((((java.lang.Long)v6).longValue()),((java.lang.StringBuffer)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "_";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = "b";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = java.util.Calendar.getInstance(((java.util.TimeZone)v7),((java.util.Locale)v9));
    Object v11 = new org.apache.commons.lang3.exception.ContextedException();
    Object v12 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v11));
    Object v13 = new java.lang.StringBuffer(((java.lang.CharSequence)v12));
    Object v14 = new org.apache.commons.lang3.exception.ContextedException();
    Object v15 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v14));
    Object v16 = new java.lang.StringBuffer(((java.lang.CharSequence)v15));
    Object v17 = ((java.lang.StringBuffer)v13).append(((java.lang.StringBuffer)v16));
    Object v18 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.util.Calendar)v10),((java.lang.StringBuffer)v13));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = 41L;
    Object v7 = new org.apache.commons.lang3.exception.ContextedException();
    Object v8 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v7));
    Object v9 = new java.lang.StringBuffer(((java.lang.CharSequence)v8));
    Object v10 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format((((java.lang.Long)v6).longValue()),((java.lang.StringBuffer)v9));
    Object v11 = "";
    Object v12 = new int[]{};
    Object v13 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).parseToken(((java.lang.String)v11),((int[])v12));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = -3L;
    Object v7 = new java.util.Date((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.lang3.exception.ContextedException();
    Object v9 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v8));
    Object v10 = new java.lang.StringBuffer(((java.lang.CharSequence)v9));
    Object v11 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.util.Date)v7),((java.lang.StringBuffer)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = -3L;
    Object v7 = new java.util.Date((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.lang3.exception.ContextedException();
    Object v9 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v8));
    Object v10 = new java.lang.StringBuffer(((java.lang.CharSequence)v9));
    Object v11 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.util.Date)v7),((java.lang.StringBuffer)v10));
    Object v12 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).getTimeZone();
    Object v13 = false;
    Object v14 = 18;
    Object v15 = "";
    Object v16 = "_";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = "b";
    Object v19 = java.util.Locale.forLanguageTag(((java.lang.String)v18));
    Object v20 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v15),((java.util.TimeZone)v17),((java.util.Locale)v19));
    Object v21 = ((org.apache.commons.lang3.time.FastDatePrinter)v20).getLocale();
    Object v22 = "";
    Object v23 = "_";
    Object v24 = java.util.TimeZone.getTimeZone(((java.lang.String)v23));
    Object v25 = "b";
    Object v26 = java.util.Locale.forLanguageTag(((java.lang.String)v25));
    Object v27 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v22),((java.util.TimeZone)v24),((java.util.Locale)v26));
    Object v28 = ((org.apache.commons.lang3.time.FastDatePrinter)v27).getLocale();
    Object v29 = ((java.util.Locale)v21).getDisplayVariant(((java.util.Locale)v28));
    Object v30 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(((java.util.TimeZone)v12),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Integer)v14).intValue()),((java.util.Locale)v21));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = -3L;
    Object v7 = new java.util.Date((((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.util.Date)v7));
    Object v9 = 0;
    Object v10 = new java.text.FieldPosition((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = java.util.TimeZone.getTimeZone(((java.lang.String)v7));
    Object v9 = "b";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v6),((java.util.TimeZone)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.lang3.time.FastDatePrinter)v11).getLocale();
    Object v13 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).equals(((java.lang.Object)v12));
    Object v14 = "_";
    Object v15 = java.util.TimeZone.getTimeZone(((java.lang.String)v14));
    Object v16 = "b";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = java.util.Calendar.getInstance(((java.util.TimeZone)v15),((java.util.Locale)v17));
    Object v19 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.util.Calendar)v18));
    org.junit.Assert.assertEquals((Object)(""), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "_";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = true;
    Object v3 = 13;
    Object v4 = "";
    Object v5 = "_";
    Object v6 = java.util.TimeZone.getTimeZone(((java.lang.String)v5));
    Object v7 = "b";
    Object v8 = java.util.Locale.forLanguageTag(((java.lang.String)v7));
    Object v9 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v4),((java.util.TimeZone)v6),((java.util.Locale)v8));
    Object v10 = ((org.apache.commons.lang3.time.FastDatePrinter)v9).getLocale();
    Object v11 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(((java.util.TimeZone)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = java.util.TimeZone.getTimeZone(((java.lang.String)v7));
    Object v9 = "b";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v6),((java.util.TimeZone)v8),((java.util.Locale)v10));
    Object v12 = -3L;
    Object v13 = new java.util.Date((((java.lang.Long)v12).longValue()));
    Object v14 = ((org.apache.commons.lang3.time.FastDatePrinter)v11).format(((java.util.Date)v13));
    Object v15 = 0;
    Object v16 = new java.text.FieldPosition((((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.apache.commons.lang3.time.FastDatePrinter)v11).equals(((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).equals(((java.lang.Object)v17));
    Object v19 = "";
    Object v20 = "_";
    Object v21 = java.util.TimeZone.getTimeZone(((java.lang.String)v20));
    Object v22 = "b";
    Object v23 = java.util.Locale.forLanguageTag(((java.lang.String)v22));
    Object v24 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v19),((java.util.TimeZone)v21),((java.util.Locale)v23));
    Object v25 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).equals(((java.lang.Object)v24));
    org.junit.Assert.assertEquals((Object)(true), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "_";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = false;
    Object v3 = -13;
    Object v4 = "";
    Object v5 = "_";
    Object v6 = java.util.TimeZone.getTimeZone(((java.lang.String)v5));
    Object v7 = "b";
    Object v8 = java.util.Locale.forLanguageTag(((java.lang.String)v7));
    Object v9 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v4),((java.util.TimeZone)v6),((java.util.Locale)v8));
    Object v10 = ((org.apache.commons.lang3.time.FastDatePrinter)v9).getLocale();
    Object v11 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(((java.util.TimeZone)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = -3L;
    Object v7 = new java.util.Date((((java.lang.Long)v6).longValue()));
    Object v8 = new org.apache.commons.lang3.exception.ContextedException();
    Object v9 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v8));
    Object v10 = new java.lang.StringBuffer(((java.lang.CharSequence)v9));
    Object v11 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.util.Date)v7),((java.lang.StringBuffer)v10));
    Object v12 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).getTimeZone();
    Object v13 = false;
    Object v14 = 7;
    Object v15 = "";
    Object v16 = "_";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = "b";
    Object v19 = java.util.Locale.forLanguageTag(((java.lang.String)v18));
    Object v20 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v15),((java.util.TimeZone)v17),((java.util.Locale)v19));
    Object v21 = ((org.apache.commons.lang3.time.FastDatePrinter)v20).getLocale();
    Object v22 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(((java.util.TimeZone)v12),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Integer)v14).intValue()),((java.util.Locale)v21));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "_";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = "b";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = java.util.Calendar.getInstance(((java.util.TimeZone)v7),((java.util.Locale)v9));
    Object v11 = "";
    Object v12 = "_";
    Object v13 = java.util.TimeZone.getTimeZone(((java.lang.String)v12));
    Object v14 = "b";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v11),((java.util.TimeZone)v13),((java.util.Locale)v15));
    Object v17 = "_";
    Object v18 = java.util.TimeZone.getTimeZone(((java.lang.String)v17));
    Object v19 = "b";
    Object v20 = java.util.Locale.forLanguageTag(((java.lang.String)v19));
    Object v21 = java.util.Calendar.getInstance(((java.util.TimeZone)v18),((java.util.Locale)v20));
    Object v22 = new org.apache.commons.lang3.exception.ContextedException();
    Object v23 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v22));
    Object v24 = new java.lang.StringBuffer(((java.lang.CharSequence)v23));
    Object v25 = ((org.apache.commons.lang3.time.FastDatePrinter)v16).format(((java.util.Calendar)v21),((java.lang.StringBuffer)v24));
    Object v26 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).applyRules(((java.util.Calendar)v10),((java.lang.StringBuffer)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).getMaxLengthEstimate();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = java.util.TimeZone.getTimeZone(((java.lang.String)v7));
    Object v9 = "b";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v6),((java.util.TimeZone)v8),((java.util.Locale)v10));
    Object v12 = 0L;
    Object v13 = ((org.apache.commons.lang3.time.FastDatePrinter)v11).format((((java.lang.Long)v12).longValue()));
    Object v14 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).equals(((java.lang.Object)v13));
    Object v15 = -3L;
    Object v16 = new java.util.Date((((java.lang.Long)v15).longValue()));
    Object v17 = ((java.util.Date)v16).hashCode();
    Object v18 = "";
    Object v19 = "_";
    Object v20 = java.util.TimeZone.getTimeZone(((java.lang.String)v19));
    Object v21 = "b";
    Object v22 = java.util.Locale.forLanguageTag(((java.lang.String)v21));
    Object v23 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v18),((java.util.TimeZone)v20),((java.util.Locale)v22));
    Object v24 = "_";
    Object v25 = java.util.TimeZone.getTimeZone(((java.lang.String)v24));
    Object v26 = "b";
    Object v27 = java.util.Locale.forLanguageTag(((java.lang.String)v26));
    Object v28 = java.util.Calendar.getInstance(((java.util.TimeZone)v25),((java.util.Locale)v27));
    Object v29 = new org.apache.commons.lang3.exception.ContextedException();
    Object v30 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v29));
    Object v31 = new java.lang.StringBuffer(((java.lang.CharSequence)v30));
    Object v32 = ((org.apache.commons.lang3.time.FastDatePrinter)v23).format(((java.util.Calendar)v28),((java.lang.StringBuffer)v31));
    Object v33 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.util.Date)v16),((java.lang.StringBuffer)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = java.util.TimeZone.getTimeZone(((java.lang.String)v7));
    Object v9 = "b";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v6),((java.util.TimeZone)v8),((java.util.Locale)v10));
    Object v12 = -3L;
    Object v13 = new java.util.Date((((java.lang.Long)v12).longValue()));
    Object v14 = ((org.apache.commons.lang3.time.FastDatePrinter)v11).format(((java.util.Date)v13));
    Object v15 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = 26L;
    Object v7 = new org.apache.commons.lang3.exception.ContextedException();
    Object v8 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v7));
    Object v9 = new java.lang.StringBuffer(((java.lang.CharSequence)v8));
    Object v10 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format((((java.lang.Long)v6).longValue()),((java.lang.StringBuffer)v9));
    Object v11 = "_";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = "b";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = java.util.Calendar.getInstance(((java.util.TimeZone)v12),((java.util.Locale)v14));
    Object v16 = ((java.util.Calendar)v15).getTimeInMillis();
    Object v17 = new org.apache.commons.lang3.exception.ContextedException();
    Object v18 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v17));
    Object v19 = new java.lang.StringBuffer(((java.lang.CharSequence)v18));
    Object v20 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).applyRules(((java.util.Calendar)v15),((java.lang.StringBuffer)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = 25L;
    Object v7 = new org.apache.commons.lang3.exception.ContextedException();
    Object v8 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v7));
    Object v9 = new java.lang.StringBuffer(((java.lang.CharSequence)v8));
    Object v10 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format((((java.lang.Long)v6).longValue()),((java.lang.StringBuffer)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).parsePattern();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).toString();
    Object v12 = "";
    Object v13 = "_";
    Object v14 = java.util.TimeZone.getTimeZone(((java.lang.String)v13));
    Object v15 = "b";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v12),((java.util.TimeZone)v14),((java.util.Locale)v16));
    Object v18 = "missing assignment type for type variable ";
    Object v19 = new int[]{0,13};
    Object v20 = ((org.apache.commons.lang3.time.FastDatePrinter)v17).parseToken(((java.lang.String)v18),((int[])v19));
    Object v21 = new org.apache.commons.lang3.exception.ContextedException();
    Object v22 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v21));
    Object v23 = new java.lang.StringBuffer(((java.lang.CharSequence)v22));
    Object v24 = 0;
    Object v25 = new java.text.FieldPosition((((java.lang.Integer)v24).intValue()));
    Object v26 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).format(((java.lang.Object)v20),((java.lang.StringBuffer)v23),((java.text.FieldPosition)v25));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = "";
    Object v12 = new int[]{8,-55,22};
    Object v13 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).parseToken(((java.lang.String)v11),((int[])v12));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "h";
    Object v7 = new int[]{};
    Object v8 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).parseToken(((java.lang.String)v6),((int[])v7));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format((((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = -3L;
    Object v7 = new java.util.Date((((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.util.Date)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).toString();
    org.junit.Assert.assertEquals((Object)("FastDatePrinter[,,GMT]"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).getPattern();
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = "_";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = "b";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = java.util.Calendar.getInstance(((java.util.TimeZone)v12),((java.util.Locale)v14));
    Object v16 = "";
    Object v17 = "_";
    Object v18 = java.util.TimeZone.getTimeZone(((java.lang.String)v17));
    Object v19 = "b";
    Object v20 = java.util.Locale.forLanguageTag(((java.lang.String)v19));
    Object v21 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v16),((java.util.TimeZone)v18),((java.util.Locale)v20));
    Object v22 = "_";
    Object v23 = java.util.TimeZone.getTimeZone(((java.lang.String)v22));
    Object v24 = "b";
    Object v25 = java.util.Locale.forLanguageTag(((java.lang.String)v24));
    Object v26 = java.util.Calendar.getInstance(((java.util.TimeZone)v23),((java.util.Locale)v25));
    Object v27 = new org.apache.commons.lang3.exception.ContextedException();
    Object v28 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v27));
    Object v29 = new java.lang.StringBuffer(((java.lang.CharSequence)v28));
    Object v30 = ((org.apache.commons.lang3.time.FastDatePrinter)v21).format(((java.util.Calendar)v26),((java.lang.StringBuffer)v29));
    Object v31 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).format(((java.util.Calendar)v15),((java.lang.StringBuffer)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).toString();
    org.junit.Assert.assertEquals((Object)("FastDatePrinter[,,GMT]"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).getTimeZone();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = java.util.TimeZone.getTimeZone(((java.lang.String)v7));
    Object v9 = "b";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v6),((java.util.TimeZone)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.lang3.time.FastDatePrinter)v11).getMaxLengthEstimate();
    Object v13 = "";
    Object v14 = "_";
    Object v15 = java.util.TimeZone.getTimeZone(((java.lang.String)v14));
    Object v16 = "b";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v13),((java.util.TimeZone)v15),((java.util.Locale)v17));
    Object v19 = -3L;
    Object v20 = new java.util.Date((((java.lang.Long)v19).longValue()));
    Object v21 = new org.apache.commons.lang3.exception.ContextedException();
    Object v22 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v21));
    Object v23 = new java.lang.StringBuffer(((java.lang.CharSequence)v22));
    Object v24 = ((org.apache.commons.lang3.time.FastDatePrinter)v18).format(((java.util.Date)v20),((java.lang.StringBuffer)v23));
    Object v25 = 0;
    Object v26 = new java.text.FieldPosition((((java.lang.Integer)v25).intValue()));
    Object v27 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.lang.Object)v12),((java.lang.StringBuffer)v24),((java.text.FieldPosition)v26));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = "";
    Object v12 = "_";
    Object v13 = java.util.TimeZone.getTimeZone(((java.lang.String)v12));
    Object v14 = "b";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v11),((java.util.TimeZone)v13),((java.util.Locale)v15));
    Object v17 = "The Arr";
    Object v18 = new int[]{0,0};
    Object v19 = ((org.apache.commons.lang3.time.FastDatePrinter)v16).parseToken(((java.lang.String)v17),((int[])v18));
    Object v20 = "";
    Object v21 = "_";
    Object v22 = java.util.TimeZone.getTimeZone(((java.lang.String)v21));
    Object v23 = "b";
    Object v24 = java.util.Locale.forLanguageTag(((java.lang.String)v23));
    Object v25 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v20),((java.util.TimeZone)v22),((java.util.Locale)v24));
    Object v26 = -3L;
    Object v27 = new java.util.Date((((java.lang.Long)v26).longValue()));
    Object v28 = new org.apache.commons.lang3.exception.ContextedException();
    Object v29 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v28));
    Object v30 = new java.lang.StringBuffer(((java.lang.CharSequence)v29));
    Object v31 = ((org.apache.commons.lang3.time.FastDatePrinter)v25).format(((java.util.Date)v27),((java.lang.StringBuffer)v30));
    Object v32 = 0;
    Object v33 = new java.text.FieldPosition((((java.lang.Integer)v32).intValue()));
    Object v34 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).format(((java.lang.Object)v19),((java.lang.StringBuffer)v31),((java.text.FieldPosition)v33));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).getTimeZone();
    Object v12 = true;
    Object v13 = 2;
    Object v14 = "";
    Object v15 = "_";
    Object v16 = java.util.TimeZone.getTimeZone(((java.lang.String)v15));
    Object v17 = "b";
    Object v18 = java.util.Locale.forLanguageTag(((java.lang.String)v17));
    Object v19 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v14),((java.util.TimeZone)v16),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.lang3.time.FastDatePrinter)v19).getLocale();
    Object v21 = ((java.util.Locale)v20).getISO3Country();
    Object v22 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(((java.util.TimeZone)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Integer)v13).intValue()),((java.util.Locale)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = "";
    Object v12 = new int[]{4};
    Object v13 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).parseToken(((java.lang.String)v11),((int[])v12));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).getTimeZone();
    Object v12 = false;
    Object v13 = 2;
    Object v14 = "";
    Object v15 = "_";
    Object v16 = java.util.TimeZone.getTimeZone(((java.lang.String)v15));
    Object v17 = "b";
    Object v18 = java.util.Locale.forLanguageTag(((java.lang.String)v17));
    Object v19 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v14),((java.util.TimeZone)v16),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.lang3.time.FastDatePrinter)v19).getLocale();
    Object v21 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(((java.util.TimeZone)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Integer)v13).intValue()),((java.util.Locale)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).getMaxLengthEstimate();
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = "";
    Object v12 = "_";
    Object v13 = java.util.TimeZone.getTimeZone(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = "_";
    Object v16 = java.util.TimeZone.getTimeZone(((java.lang.String)v15));
    Object v17 = "b";
    Object v18 = java.util.Locale.forLanguageTag(((java.lang.String)v17));
    Object v19 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v14),((java.util.TimeZone)v16),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.lang3.time.FastDatePrinter)v19).getLocale();
    Object v21 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v11),((java.util.TimeZone)v13),((java.util.Locale)v20));
    Object v22 = "";
    Object v23 = "_";
    Object v24 = java.util.TimeZone.getTimeZone(((java.lang.String)v23));
    Object v25 = "b";
    Object v26 = java.util.Locale.forLanguageTag(((java.lang.String)v25));
    Object v27 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v22),((java.util.TimeZone)v24),((java.util.Locale)v26));
    Object v28 = -3L;
    Object v29 = new java.util.Date((((java.lang.Long)v28).longValue()));
    Object v30 = new org.apache.commons.lang3.exception.ContextedException();
    Object v31 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v30));
    Object v32 = new java.lang.StringBuffer(((java.lang.CharSequence)v31));
    Object v33 = ((org.apache.commons.lang3.time.FastDatePrinter)v27).format(((java.util.Date)v29),((java.lang.StringBuffer)v32));
    Object v34 = 0;
    Object v35 = new java.text.FieldPosition((((java.lang.Integer)v34).intValue()));
    Object v36 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).format(((java.lang.Object)v21),((java.lang.StringBuffer)v33),((java.text.FieldPosition)v35));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).getTimeZone();
    Object v12 = false;
    Object v13 = 0;
    Object v14 = "";
    Object v15 = "_";
    Object v16 = java.util.TimeZone.getTimeZone(((java.lang.String)v15));
    Object v17 = "b";
    Object v18 = java.util.Locale.forLanguageTag(((java.lang.String)v17));
    Object v19 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v14),((java.util.TimeZone)v16),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.lang3.time.FastDatePrinter)v19).getLocale();
    Object v21 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(((java.util.TimeZone)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Integer)v13).intValue()),((java.util.Locale)v20));
    org.junit.Assert.assertEquals((Object)("GMT"), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = -3L;
    Object v7 = new java.util.Date((((java.lang.Long)v6).longValue()));
    Object v8 = "";
    Object v9 = "_";
    Object v10 = java.util.TimeZone.getTimeZone(((java.lang.String)v9));
    Object v11 = "b";
    Object v12 = java.util.Locale.forLanguageTag(((java.lang.String)v11));
    Object v13 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v8),((java.util.TimeZone)v10),((java.util.Locale)v12));
    Object v14 = -3L;
    Object v15 = new java.util.Date((((java.lang.Long)v14).longValue()));
    Object v16 = new org.apache.commons.lang3.exception.ContextedException();
    Object v17 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v16));
    Object v18 = new java.lang.StringBuffer(((java.lang.CharSequence)v17));
    Object v19 = ((org.apache.commons.lang3.time.FastDatePrinter)v13).format(((java.util.Date)v15),((java.lang.StringBuffer)v18));
    Object v20 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.util.Date)v7),((java.lang.StringBuffer)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = -3L;
    Object v12 = new java.util.Date((((java.lang.Long)v11).longValue()));
    Object v13 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).format(((java.util.Date)v12));
    Object v14 = 1L;
    Object v15 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).format((((java.lang.Long)v14).longValue()));
    org.junit.Assert.assertEquals((Object)(""), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = -3L;
    Object v12 = new java.util.Date((((java.lang.Long)v11).longValue()));
    Object v13 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).format(((java.util.Date)v12));
    Object v14 = "_";
    Object v15 = java.util.TimeZone.getTimeZone(((java.lang.String)v14));
    Object v16 = "b";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = java.util.Calendar.getInstance(((java.util.TimeZone)v15),((java.util.Locale)v17));
    Object v19 = true;
    ((java.util.Calendar)v18).setLenient((((java.lang.Boolean)v19).booleanValue()));
    Object v20 = null;
    Object v21 = new org.apache.commons.lang3.exception.ContextedException();
    Object v22 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v21));
    Object v23 = new java.lang.StringBuffer(((java.lang.CharSequence)v22));
    Object v24 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).applyRules(((java.util.Calendar)v18),((java.lang.StringBuffer)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = -35L;
    Object v7 = "";
    Object v8 = "_";
    Object v9 = java.util.TimeZone.getTimeZone(((java.lang.String)v8));
    Object v10 = "b";
    Object v11 = java.util.Locale.forLanguageTag(((java.lang.String)v10));
    Object v12 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v7),((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = "_";
    Object v14 = java.util.TimeZone.getTimeZone(((java.lang.String)v13));
    Object v15 = "b";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = java.util.Calendar.getInstance(((java.util.TimeZone)v14),((java.util.Locale)v16));
    Object v18 = new org.apache.commons.lang3.exception.ContextedException();
    Object v19 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v18));
    Object v20 = new java.lang.StringBuffer(((java.lang.CharSequence)v19));
    Object v21 = ((org.apache.commons.lang3.time.FastDatePrinter)v12).applyRules(((java.util.Calendar)v17),((java.lang.StringBuffer)v20));
    Object v22 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format((((java.lang.Long)v6).longValue()),((java.lang.StringBuffer)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = "";
    Object v12 = "_";
    Object v13 = java.util.TimeZone.getTimeZone(((java.lang.String)v12));
    Object v14 = "b";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v11),((java.util.TimeZone)v13),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.lang3.time.FastDatePrinter)v16).getPattern();
    Object v18 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).equals(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = "_";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = false;
    Object v14 = 0;
    Object v15 = "b";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(((java.util.TimeZone)v12),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Integer)v14).intValue()),((java.util.Locale)v16));
    Object v18 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).equals(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "_";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = "b";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = java.util.Calendar.getInstance(((java.util.TimeZone)v7),((java.util.Locale)v9));
    Object v11 = new org.apache.commons.lang3.exception.ContextedException();
    Object v12 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v11));
    Object v13 = new java.lang.StringBuffer(((java.lang.CharSequence)v12));
    Object v14 = 1;
    Object v15 = 22.513271F;
    Object v16 = ((java.lang.StringBuffer)v13).insert((((java.lang.Integer)v14).intValue()),(((java.lang.Float)v15).floatValue()));
    Object v17 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).applyRules(((java.util.Calendar)v10),((java.lang.StringBuffer)v13));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).getTimeZone();
    Object v12 = true;
    Object v13 = 0;
    Object v14 = "";
    Object v15 = "_";
    Object v16 = java.util.TimeZone.getTimeZone(((java.lang.String)v15));
    Object v17 = "b";
    Object v18 = java.util.Locale.forLanguageTag(((java.lang.String)v17));
    Object v19 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v14),((java.util.TimeZone)v16),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.lang3.time.FastDatePrinter)v19).getLocale();
    Object v21 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(((java.util.TimeZone)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Integer)v13).intValue()),((java.util.Locale)v20));
    org.junit.Assert.assertEquals((Object)("GMT"), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = 0;
    Object v12 = new java.text.FieldPosition((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).equals(((java.lang.Object)v12));
    Object v14 = -3L;
    Object v15 = new java.util.Date((((java.lang.Long)v14).longValue()));
    Object v16 = "";
    Object v17 = "_";
    Object v18 = java.util.TimeZone.getTimeZone(((java.lang.String)v17));
    Object v19 = "b";
    Object v20 = java.util.Locale.forLanguageTag(((java.lang.String)v19));
    Object v21 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v16),((java.util.TimeZone)v18),((java.util.Locale)v20));
    Object v22 = "_";
    Object v23 = java.util.TimeZone.getTimeZone(((java.lang.String)v22));
    Object v24 = "b";
    Object v25 = java.util.Locale.forLanguageTag(((java.lang.String)v24));
    Object v26 = java.util.Calendar.getInstance(((java.util.TimeZone)v23),((java.util.Locale)v25));
    Object v27 = new org.apache.commons.lang3.exception.ContextedException();
    Object v28 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v27));
    Object v29 = new java.lang.StringBuffer(((java.lang.CharSequence)v28));
    Object v30 = ((org.apache.commons.lang3.time.FastDatePrinter)v21).applyRules(((java.util.Calendar)v26),((java.lang.StringBuffer)v29));
    Object v31 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).format(((java.util.Date)v15),((java.lang.StringBuffer)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = new int[]{0};
    Object v8 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).parseToken(((java.lang.String)v6),((int[])v7));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).getTimeZone();
    Object v12 = false;
    Object v13 = -22;
    Object v14 = "";
    Object v15 = "_";
    Object v16 = java.util.TimeZone.getTimeZone(((java.lang.String)v15));
    Object v17 = "b";
    Object v18 = java.util.Locale.forLanguageTag(((java.lang.String)v17));
    Object v19 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v14),((java.util.TimeZone)v16),((java.util.Locale)v18));
    Object v20 = ((org.apache.commons.lang3.time.FastDatePrinter)v19).getLocale();
    Object v21 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(((java.util.TimeZone)v11),(((java.lang.Boolean)v12).booleanValue()),(((java.lang.Integer)v13).intValue()),((java.util.Locale)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "$";
    Object v7 = new int[]{};
    Object v8 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).parseToken(((java.lang.String)v6),((int[])v7));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = -3L;
    Object v12 = new java.util.Date((((java.lang.Long)v11).longValue()));
    Object v13 = "";
    Object v14 = "_";
    Object v15 = java.util.TimeZone.getTimeZone(((java.lang.String)v14));
    Object v16 = "b";
    Object v17 = java.util.Locale.forLanguageTag(((java.lang.String)v16));
    Object v18 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v13),((java.util.TimeZone)v15),((java.util.Locale)v17));
    Object v19 = "_";
    Object v20 = java.util.TimeZone.getTimeZone(((java.lang.String)v19));
    Object v21 = "b";
    Object v22 = java.util.Locale.forLanguageTag(((java.lang.String)v21));
    Object v23 = java.util.Calendar.getInstance(((java.util.TimeZone)v20),((java.util.Locale)v22));
    Object v24 = new org.apache.commons.lang3.exception.ContextedException();
    Object v25 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v24));
    Object v26 = new java.lang.StringBuffer(((java.lang.CharSequence)v25));
    Object v27 = ((org.apache.commons.lang3.time.FastDatePrinter)v18).format(((java.util.Calendar)v23),((java.lang.StringBuffer)v26));
    Object v28 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).format(((java.util.Date)v12),((java.lang.StringBuffer)v27));
    Object v29 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).getTimeZone();
    Object v12 = ((java.util.TimeZone)v11).clone();
    Object v13 = false;
    Object v14 = 0;
    Object v15 = "";
    Object v16 = "_";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = "b";
    Object v19 = java.util.Locale.forLanguageTag(((java.lang.String)v18));
    Object v20 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v15),((java.util.TimeZone)v17),((java.util.Locale)v19));
    Object v21 = ((org.apache.commons.lang3.time.FastDatePrinter)v20).getLocale();
    Object v22 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(((java.util.TimeZone)v11),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Integer)v14).intValue()),((java.util.Locale)v21));
    org.junit.Assert.assertEquals((Object)("GMT"), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = "";
    Object v12 = "_";
    Object v13 = java.util.TimeZone.getTimeZone(((java.lang.String)v12));
    Object v14 = "b";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v11),((java.util.TimeZone)v13),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).equals(((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = -3L;
    Object v7 = new java.util.Date((((java.lang.Long)v6).longValue()));
    Object v8 = "";
    Object v9 = "_";
    Object v10 = java.util.TimeZone.getTimeZone(((java.lang.String)v9));
    Object v11 = "b";
    Object v12 = java.util.Locale.forLanguageTag(((java.lang.String)v11));
    Object v13 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v8),((java.util.TimeZone)v10),((java.util.Locale)v12));
    Object v14 = -3L;
    Object v15 = new java.util.Date((((java.lang.Long)v14).longValue()));
    Object v16 = "";
    Object v17 = "_";
    Object v18 = java.util.TimeZone.getTimeZone(((java.lang.String)v17));
    Object v19 = "b";
    Object v20 = java.util.Locale.forLanguageTag(((java.lang.String)v19));
    Object v21 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v16),((java.util.TimeZone)v18),((java.util.Locale)v20));
    Object v22 = -3L;
    Object v23 = new java.util.Date((((java.lang.Long)v22).longValue()));
    Object v24 = new org.apache.commons.lang3.exception.ContextedException();
    Object v25 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v24));
    Object v26 = new java.lang.StringBuffer(((java.lang.CharSequence)v25));
    Object v27 = ((org.apache.commons.lang3.time.FastDatePrinter)v21).format(((java.util.Date)v23),((java.lang.StringBuffer)v26));
    Object v28 = ((org.apache.commons.lang3.time.FastDatePrinter)v13).format(((java.util.Date)v15),((java.lang.StringBuffer)v27));
    Object v29 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.util.Date)v7),((java.lang.StringBuffer)v28));
    Object v30 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).getPattern();
    org.junit.Assert.assertEquals((Object)(""), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).getTimeZone();
    Object v12 = ((java.util.TimeZone)v11).observesDaylightTime();
    Object v13 = false;
    Object v14 = -35;
    Object v15 = "";
    Object v16 = "_";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = "b";
    Object v19 = java.util.Locale.forLanguageTag(((java.lang.String)v18));
    Object v20 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v15),((java.util.TimeZone)v17),((java.util.Locale)v19));
    Object v21 = ((org.apache.commons.lang3.time.FastDatePrinter)v20).getLocale();
    Object v22 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(((java.util.TimeZone)v11),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Integer)v14).intValue()),((java.util.Locale)v21));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "_";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = "b";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = java.util.Calendar.getInstance(((java.util.TimeZone)v7),((java.util.Locale)v9));
    Object v11 = "";
    Object v12 = "_";
    Object v13 = java.util.TimeZone.getTimeZone(((java.lang.String)v12));
    Object v14 = "b";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v11),((java.util.TimeZone)v13),((java.util.Locale)v15));
    Object v17 = 26L;
    Object v18 = new org.apache.commons.lang3.exception.ContextedException();
    Object v19 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v18));
    Object v20 = new java.lang.StringBuffer(((java.lang.CharSequence)v19));
    Object v21 = ((org.apache.commons.lang3.time.FastDatePrinter)v16).format((((java.lang.Long)v17).longValue()),((java.lang.StringBuffer)v20));
    Object v22 = "_";
    Object v23 = java.util.TimeZone.getTimeZone(((java.lang.String)v22));
    Object v24 = "b";
    Object v25 = java.util.Locale.forLanguageTag(((java.lang.String)v24));
    Object v26 = java.util.Calendar.getInstance(((java.util.TimeZone)v23),((java.util.Locale)v25));
    Object v27 = ((java.util.Calendar)v26).getTimeInMillis();
    Object v28 = new org.apache.commons.lang3.exception.ContextedException();
    Object v29 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v28));
    Object v30 = new java.lang.StringBuffer(((java.lang.CharSequence)v29));
    Object v31 = ((org.apache.commons.lang3.time.FastDatePrinter)v16).applyRules(((java.util.Calendar)v26),((java.lang.StringBuffer)v30));
    Object v32 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).applyRules(((java.util.Calendar)v10),((java.lang.StringBuffer)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "\u2211";
    Object v1 = "";
    Object v2 = "_";
    Object v3 = java.util.TimeZone.getTimeZone(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = "_";
    Object v6 = java.util.TimeZone.getTimeZone(((java.lang.String)v5));
    Object v7 = "b";
    Object v8 = java.util.Locale.forLanguageTag(((java.lang.String)v7));
    Object v9 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v4),((java.util.TimeZone)v6),((java.util.Locale)v8));
    Object v10 = ((org.apache.commons.lang3.time.FastDatePrinter)v9).getLocale();
    Object v11 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v1),((java.util.TimeZone)v3),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.lang3.time.FastDatePrinter)v11).getTimeZone();
    Object v13 = "&omicrone;";
    ((java.util.TimeZone)v12).setID(((java.lang.String)v13));
    Object v14 = null;
    Object v15 = "";
    Object v16 = "_";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = "b";
    Object v19 = java.util.Locale.forLanguageTag(((java.lang.String)v18));
    Object v20 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v15),((java.util.TimeZone)v17),((java.util.Locale)v19));
    Object v21 = ((org.apache.commons.lang3.time.FastDatePrinter)v20).getLocale();
    Object v22 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v12),((java.util.Locale)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = 0;
    Object v12 = new java.text.FieldPosition((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "_";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = false;
    Object v3 = 1;
    Object v4 = "";
    Object v5 = "_";
    Object v6 = java.util.TimeZone.getTimeZone(((java.lang.String)v5));
    Object v7 = "b";
    Object v8 = java.util.Locale.forLanguageTag(((java.lang.String)v7));
    Object v9 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v4),((java.util.TimeZone)v6),((java.util.Locale)v8));
    Object v10 = ((org.apache.commons.lang3.time.FastDatePrinter)v9).getLocale();
    Object v11 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(((java.util.TimeZone)v1),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v10));
    org.junit.Assert.assertEquals((Object)("Greenwich Mean Time"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = "_";
    Object v8 = java.util.TimeZone.getTimeZone(((java.lang.String)v7));
    Object v9 = "b";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v6),((java.util.TimeZone)v8),((java.util.Locale)v10));
    Object v12 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).equals(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).getLocale();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = "_";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = "b";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = java.util.Calendar.getInstance(((java.util.TimeZone)v12),((java.util.Locale)v14));
    Object v16 = -46;
    ((java.util.Calendar)v15).setFirstDayOfWeek((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = new org.apache.commons.lang3.exception.ContextedException();
    Object v19 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v18));
    Object v20 = new java.lang.StringBuffer(((java.lang.CharSequence)v19));
    Object v21 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).applyRules(((java.util.Calendar)v15),((java.lang.StringBuffer)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = "_";
    Object v12 = java.util.TimeZone.getTimeZone(((java.lang.String)v11));
    Object v13 = "b";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = java.util.Calendar.getInstance(((java.util.TimeZone)v12),((java.util.Locale)v14));
    Object v16 = "";
    Object v17 = "_";
    Object v18 = java.util.TimeZone.getTimeZone(((java.lang.String)v17));
    Object v19 = "b";
    Object v20 = java.util.Locale.forLanguageTag(((java.lang.String)v19));
    Object v21 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v16),((java.util.TimeZone)v18),((java.util.Locale)v20));
    Object v22 = "_";
    Object v23 = java.util.TimeZone.getTimeZone(((java.lang.String)v22));
    Object v24 = "b";
    Object v25 = java.util.Locale.forLanguageTag(((java.lang.String)v24));
    Object v26 = java.util.Calendar.getInstance(((java.util.TimeZone)v23),((java.util.Locale)v25));
    Object v27 = ((java.util.Calendar)v26).getWeeksInWeekYear();
    Object v28 = new org.apache.commons.lang3.exception.ContextedException();
    Object v29 = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(((java.lang.Throwable)v28));
    Object v30 = new java.lang.StringBuffer(((java.lang.CharSequence)v29));
    Object v31 = ((org.apache.commons.lang3.time.FastDatePrinter)v21).applyRules(((java.util.Calendar)v26),((java.lang.StringBuffer)v30));
    Object v32 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).applyRules(((java.util.Calendar)v15),((java.lang.StringBuffer)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = 6L;
    Object v12 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).format((((java.lang.Long)v11).longValue()));
    Object v13 = "f";
    Object v14 = new int[]{};
    Object v15 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).parseToken(((java.lang.String)v13),((int[])v14));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "_";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = "b";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = java.util.Calendar.getInstance(((java.util.TimeZone)v7),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.util.Calendar)v10));
    Object v12 = "";
    Object v13 = "_";
    Object v14 = java.util.TimeZone.getTimeZone(((java.lang.String)v13));
    Object v15 = "";
    Object v16 = "_";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = "b";
    Object v19 = java.util.Locale.forLanguageTag(((java.lang.String)v18));
    Object v20 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v15),((java.util.TimeZone)v17),((java.util.Locale)v19));
    Object v21 = ((org.apache.commons.lang3.time.FastDatePrinter)v20).getLocale();
    Object v22 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v12),((java.util.TimeZone)v14),((java.util.Locale)v21));
    Object v23 = "";
    Object v24 = "_";
    Object v25 = java.util.TimeZone.getTimeZone(((java.lang.String)v24));
    Object v26 = "b";
    Object v27 = java.util.Locale.forLanguageTag(((java.lang.String)v26));
    Object v28 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v23),((java.util.TimeZone)v25),((java.util.Locale)v27));
    Object v29 = ((org.apache.commons.lang3.time.FastDatePrinter)v22).equals(((java.lang.Object)v28));
    Object v30 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).equals(((java.lang.Object)v29));
    org.junit.Assert.assertEquals((Object)(false), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "_";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v3),((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDatePrinter)v8).getLocale();
    Object v10 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.lang3.time.FastDatePrinter)v10).getTimeZone();
    Object v12 = ((java.util.TimeZone)v11).toZoneId();
    Object v13 = false;
    Object v14 = 0;
    Object v15 = "";
    Object v16 = "_";
    Object v17 = java.util.TimeZone.getTimeZone(((java.lang.String)v16));
    Object v18 = "b";
    Object v19 = java.util.Locale.forLanguageTag(((java.lang.String)v18));
    Object v20 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v15),((java.util.TimeZone)v17),((java.util.Locale)v19));
    Object v21 = "";
    Object v22 = "_";
    Object v23 = java.util.TimeZone.getTimeZone(((java.lang.String)v22));
    Object v24 = "b";
    Object v25 = java.util.Locale.forLanguageTag(((java.lang.String)v24));
    Object v26 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v21),((java.util.TimeZone)v23),((java.util.Locale)v25));
    Object v27 = ((org.apache.commons.lang3.time.FastDatePrinter)v20).equals(((java.lang.Object)v26));
    Object v28 = ((org.apache.commons.lang3.time.FastDatePrinter)v20).getLocale();
    Object v29 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(((java.util.TimeZone)v11),(((java.lang.Boolean)v13).booleanValue()),(((java.lang.Integer)v14).intValue()),((java.util.Locale)v28));
    org.junit.Assert.assertEquals((Object)("GMT"), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDatePrinter(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "_";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = "b";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = java.util.Calendar.getInstance(((java.util.TimeZone)v7),((java.util.Locale)v9));
    Object v11 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).format(((java.util.Calendar)v10));
    Object v12 = "Array cannot be empty.";
    Object v13 = new int[]{0,-29,1};
    Object v14 = ((org.apache.commons.lang3.time.FastDatePrinter)v5).parseToken(((java.lang.String)v12),((int[])v13));
    org.junit.Assert.assertEquals((Object)("A"), v14);
  }
}
