package com.fasterxml.jackson.databind.util;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.Locale.Category.FORMAT;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.Locale.Category.FORMAT;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v8));
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).isLenient();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.Locale.Category.FORMAT;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v8));
    Object v10 = java.util.TimeZone.getDefault();
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).withTimeZone(((java.util.TimeZone)v10));
    Object v12 = "number";
    Object v13 = 0;
    Object v14 = new java.text.ParsePosition((((java.lang.Integer)v13).intValue()));
    Object v15 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).parse(((java.lang.String)v12),((java.text.ParsePosition)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).toString();
    org.junit.Assert.assertEquals((Object)("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en)"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.Locale.Category.FORMAT;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v8));
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).toString();
    org.junit.Assert.assertEquals((Object)("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en)"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = new java.util.TreeSet();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.Locale.Category.FORMAT;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v8));
    Object v10 = 0;
    Object v11 = -2;
    Object v12 = 0;
    Object v13 = -18;
    Object v14 = 34;
    Object v15 = 0;
    Object v16 = new java.util.Date((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = 0;
    Object v18 = -2;
    Object v19 = 0;
    Object v20 = -18;
    Object v21 = 34;
    Object v22 = 0;
    Object v23 = new java.util.Date((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((java.util.Date)v16).before(((java.util.Date)v23));
    Object v25 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v26 = java.util.Locale.Category.FORMAT;
    Object v27 = java.util.Locale.getDefault(((java.util.Locale.Category)v26));
    Object v28 = java.util.Locale.Category.FORMAT;
    Object v29 = java.util.Locale.getDefault(((java.util.Locale.Category)v28));
    Object v30 = ((java.util.Locale)v27).getDisplayCountry(((java.util.Locale)v29));
    Object v31 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v25).withLocale(((java.util.Locale)v27));
    Object v32 = java.util.Locale.Category.FORMAT;
    Object v33 = java.util.Locale.getDefault(((java.util.Locale.Category)v32));
    Object v34 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v31).withLocale(((java.util.Locale)v33));
    Object v35 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v34).toString();
    Object v36 = new java.lang.StringBuffer(((java.lang.CharSequence)v35));
    Object v37 = -38;
    Object v38 = new java.text.FieldPosition((((java.lang.Integer)v37).intValue()));
    Object v39 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).format(((java.util.Date)v16),((java.lang.StringBuffer)v36),((java.text.FieldPosition)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.Locale.Category.FORMAT;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v8));
    Object v10 = java.util.Locale.Category.FORMAT;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v13 = java.util.Locale.Category.FORMAT;
    Object v14 = java.util.Locale.getDefault(((java.util.Locale.Category)v13));
    Object v15 = java.util.Locale.Category.FORMAT;
    Object v16 = java.util.Locale.getDefault(((java.util.Locale.Category)v15));
    Object v17 = ((java.util.Locale)v14).getDisplayCountry(((java.util.Locale)v16));
    Object v18 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v12).withLocale(((java.util.Locale)v14));
    Object v19 = java.util.Locale.Category.FORMAT;
    Object v20 = java.util.Locale.getDefault(((java.util.Locale.Category)v19));
    Object v21 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v18).withLocale(((java.util.Locale)v20));
    Object v22 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v21).toString();
    Object v23 = new java.lang.StringBuffer(((java.lang.CharSequence)v22));
    Object v24 = -3.7561311138592224D;
    Object v25 = ((java.lang.StringBuffer)v23).append((((java.lang.Double)v24).doubleValue()));
    Object v26 = -38;
    Object v27 = new java.text.FieldPosition((((java.lang.Integer)v26).intValue()));
    Object v28 = 55;
    ((java.text.FieldPosition)v27).setEndIndex((((java.lang.Integer)v28).intValue()));
    Object v29 = null;
    Object v30 = ((java.text.DateFormat)v9).format(((java.lang.Object)v11),((java.lang.StringBuffer)v23),((java.text.FieldPosition)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = 41;
    Object v1 = 0;
    Object v2 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = "";
    Object v8 = 0;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).parseAsISO8601(((java.lang.String)v7),((java.text.ParsePosition)v9),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.Locale.Category.FORMAT;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v8));
    Object v10 = ((java.text.Format)v9).clone();
    Object v11 = "'";
    Object v12 = ((java.text.Format)v9).parseObject(((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).setTimeZone(((java.util.TimeZone)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = "[";
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).parse(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.Locale.Category.FORMAT;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v8));
    Object v10 = java.util.Locale.Category.FORMAT;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = java.text.NumberFormat.getNumberInstance(((java.util.Locale)v11));
    ((java.text.DateFormat)v9).setNumberFormat(((java.text.NumberFormat)v12));
    Object v13 = null;
    Object v14 = java.util.TimeZone.getDefault();
    Object v15 = 1L;
    Object v16 = ((java.util.TimeZone)v14).getOffset((((java.lang.Long)v15).longValue()));
    Object v17 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).withTimeZone(((java.util.TimeZone)v14));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = -41;
    Object v1 = 1;
    Object v2 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v10 = java.util.Locale.Category.FORMAT;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = java.util.Locale.Category.FORMAT;
    Object v13 = java.util.Locale.getDefault(((java.util.Locale.Category)v12));
    Object v14 = ((java.util.Locale)v11).getDisplayCountry(((java.util.Locale)v13));
    Object v15 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).withLocale(((java.util.Locale)v11));
    Object v16 = java.util.Locale.Category.FORMAT;
    Object v17 = java.util.Locale.getDefault(((java.util.Locale.Category)v16));
    Object v18 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v15).withLocale(((java.util.Locale)v17));
    Object v19 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v18).toString();
    Object v20 = new java.lang.StringBuffer(((java.lang.CharSequence)v19));
    Object v21 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).equals(((java.lang.Object)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = java.util.TimeZone.getDefault();
    Object v10 = java.util.Locale.Category.FORMAT;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = java.util.Calendar.getInstance(((java.util.TimeZone)v9),((java.util.Locale)v11));
    ((java.text.DateFormat)v8).setCalendar(((java.util.Calendar)v12));
    Object v13 = null;
    Object v14 = "]G";
    Object v15 = 0;
    Object v16 = new java.text.ParsePosition((((java.lang.Integer)v15).intValue()));
    Object v17 = -35;
    ((java.text.ParsePosition)v16).setErrorIndex((((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).parseAsRFC1123(((java.lang.String)v14),((java.text.ParsePosition)v16));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = java.util.Locale.Category.FORMAT;
    Object v1 = java.util.Locale.getDefault(((java.util.Locale.Category)v0));
    Object v2 = java.text.NumberFormat.getNumberInstance(((java.util.Locale)v1));
    Object v3 = "no double/Double-argument constructor/factory method to deserialize from Number value (%s)";
    Object v4 = ((java.text.Format)v2).parseObject(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = java.util.Locale.Category.FORMAT;
    Object v1 = java.util.Locale.getDefault(((java.util.Locale.Category)v0));
    Object v2 = java.text.NumberFormat.getNumberInstance(((java.util.Locale)v1));
    Object v3 = ((java.text.Format)v2).clone();
    Object v4 = "Can not figure out type for";
    Object v5 = ((java.text.Format)v2).parseObject(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = "'; no FilterProvider configurd";
    Object v8 = 0;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).parseAsRFC1123(((java.lang.String)v7),((java.text.ParsePosition)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.Locale.Category.FORMAT;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v8));
    Object v10 = "";
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).parse(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).isLenient();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = java.util.Locale.Category.FORMAT;
    Object v1 = java.util.Locale.getDefault(((java.util.Locale.Category)v0));
    Object v2 = java.text.NumberFormat.getNumberInstance(((java.util.Locale)v1));
    Object v3 = "integZer";
    Object v4 = ((java.text.Format)v2).parseObject(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = java.util.Locale.Category.FORMAT;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = java.text.NumberFormat.getNumberInstance(((java.util.Locale)v10));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v13 = java.util.Locale.Category.FORMAT;
    Object v14 = java.util.Locale.getDefault(((java.util.Locale.Category)v13));
    Object v15 = java.util.Locale.Category.FORMAT;
    Object v16 = java.util.Locale.getDefault(((java.util.Locale.Category)v15));
    Object v17 = ((java.util.Locale)v14).getDisplayCountry(((java.util.Locale)v16));
    Object v18 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v12).withLocale(((java.util.Locale)v14));
    Object v19 = java.util.Locale.Category.FORMAT;
    Object v20 = java.util.Locale.getDefault(((java.util.Locale.Category)v19));
    Object v21 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v18).withLocale(((java.util.Locale)v20));
    Object v22 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v21).toString();
    Object v23 = new java.lang.StringBuffer(((java.lang.CharSequence)v22));
    Object v24 = -38;
    Object v25 = new java.text.FieldPosition((((java.lang.Integer)v24).intValue()));
    Object v26 = ((java.text.DateFormat)v8).format(((java.lang.Object)v11),((java.lang.StringBuffer)v23),((java.text.FieldPosition)v25));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = java.util.Locale.Category.FORMAT;
    Object v1 = java.util.Locale.getDefault(((java.util.Locale.Category)v0));
    Object v2 = java.text.NumberFormat.getNumberInstance(((java.util.Locale)v1));
    Object v3 = "strig";
    Object v4 = ((java.text.Format)v2).parseObject(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.Locale.Category.FORMAT;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v8));
    Object v10 = 0;
    Object v11 = -2;
    Object v12 = 0;
    Object v13 = -18;
    Object v14 = 34;
    Object v15 = 0;
    Object v16 = new java.util.Date((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((java.text.DateFormat)v9).format(((java.util.Date)v16));
    Object v18 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).toString();
    org.junit.Assert.assertEquals((Object)("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat(locale: en)"), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = 0;
    Object v10 = -2;
    Object v11 = 0;
    Object v12 = -18;
    Object v13 = 34;
    Object v14 = 0;
    Object v15 = new java.util.Date((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v17 = java.util.Locale.Category.FORMAT;
    Object v18 = java.util.Locale.getDefault(((java.util.Locale.Category)v17));
    Object v19 = java.util.Locale.Category.FORMAT;
    Object v20 = java.util.Locale.getDefault(((java.util.Locale.Category)v19));
    Object v21 = ((java.util.Locale)v18).getDisplayCountry(((java.util.Locale)v20));
    Object v22 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v16).withLocale(((java.util.Locale)v18));
    Object v23 = java.util.Locale.Category.FORMAT;
    Object v24 = java.util.Locale.getDefault(((java.util.Locale.Category)v23));
    Object v25 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v22).withLocale(((java.util.Locale)v24));
    Object v26 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v25).toString();
    Object v27 = new java.lang.StringBuffer(((java.lang.CharSequence)v26));
    Object v28 = -38;
    Object v29 = new java.text.FieldPosition((((java.lang.Integer)v28).intValue()));
    Object v30 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).format(((java.util.Date)v15),((java.lang.StringBuffer)v27),((java.text.FieldPosition)v29));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.text.DateFormat.getDateInstance();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.Locale.Category.FORMAT;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v8));
    Object v10 = "set";
    Object v11 = 0;
    Object v12 = new java.text.ParsePosition((((java.lang.Integer)v11).intValue()));
    Object v13 = ((java.text.Format)v9).parseObject(((java.lang.String)v10),((java.text.ParsePosition)v12));
    Object v14 = "\")]";
    Object v15 = ((java.text.Format)v9).parseObject(((java.lang.String)v14));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v9 = java.util.Locale.Category.FORMAT;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = java.util.Locale.Category.FORMAT;
    Object v12 = java.util.Locale.getDefault(((java.util.Locale.Category)v11));
    Object v13 = ((java.util.Locale)v10).getDisplayCountry(((java.util.Locale)v12));
    Object v14 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withLocale(((java.util.Locale)v10));
    Object v15 = java.util.Locale.Category.FORMAT;
    Object v16 = java.util.Locale.getDefault(((java.util.Locale.Category)v15));
    Object v17 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v14).withLocale(((java.util.Locale)v16));
    Object v18 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v17).toString();
    Object v19 = new java.lang.StringBuffer(((java.lang.CharSequence)v18));
    Object v20 = -38;
    Object v21 = new java.text.FieldPosition((((java.lang.Integer)v20).intValue()));
    Object v22 = 26;
    ((java.text.FieldPosition)v21).setBeginIndex((((java.lang.Integer)v22).intValue()));
    Object v23 = null;
    Object v24 = ((java.text.DateFormat)v6).format(((java.lang.Object)v7),((java.lang.StringBuffer)v19),((java.text.FieldPosition)v21));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((java.util.TimeZone)v7).toZoneId();
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).setTimeZone(((java.util.TimeZone)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = java.util.TimeZone.getDefault();
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).setTimeZone(((java.util.TimeZone)v9));
    Object v10 = null;
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).toString();
    org.junit.Assert.assertEquals((Object)("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,transitions=185,lastRule=java.util.SimpleTimeZone[id=America/Los_Angeles,offset=-28800000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]])(locale: en)"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = java.util.TimeZone.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withTimeZone(((java.util.TimeZone)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = java.util.TimeZone.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withTimeZone(((java.util.TimeZone)v9));
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).getTimeZone();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = java.util.Locale.Category.FORMAT;
    Object v1 = java.util.Locale.getDefault(((java.util.Locale.Category)v0));
    Object v2 = java.text.NumberFormat.getNumberInstance(((java.util.Locale)v1));
    Object v3 = " fr format ";
    Object v4 = ((java.text.Format)v2).parseObject(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.Locale.Category.FORMAT;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v8));
    Object v10 = java.util.Locale.Category.FORMAT;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).withLocale(((java.util.Locale)v11));
    Object v13 = "null";
    Object v14 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).parse(((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.Locale.Category.FORMAT;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v8));
    Object v10 = ((java.text.DateFormat)v9).getCalendar();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = false;
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).setLenient((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.Locale.Category.FORMAT;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v8));
    Object v10 = java.util.Locale.Category.FORMAT;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = java.text.NumberFormat.getNumberInstance(((java.util.Locale)v11));
    ((java.text.DateFormat)v9).setNumberFormat(((java.text.NumberFormat)v12));
    Object v13 = null;
    Object v14 = java.util.TimeZone.getDefault();
    Object v15 = 1L;
    Object v16 = ((java.util.TimeZone)v14).getOffset((((java.lang.Long)v15).longValue()));
    Object v17 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).withTimeZone(((java.util.TimeZone)v14));
    Object v18 = new java.util.TreeSet();
    Object v19 = new java.util.ArrayList(((java.util.Collection)v18));
    Object v20 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v17).equals(((java.lang.Object)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = "N/A";
    Object v8 = 0;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = true;
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).parseAsISO8601(((java.lang.String)v7),((java.text.ParsePosition)v9),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = java.util.TimeZone.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withTimeZone(((java.util.TimeZone)v9));
    Object v11 = "UTC";
    Object v12 = 0;
    Object v13 = new java.text.ParsePosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).parse(((java.lang.String)v11),((java.text.ParsePosition)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = java.util.TimeZone.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withTimeZone(((java.util.TimeZone)v9));
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).toString();
    org.junit.Assert.assertEquals((Object)("DateFormat com.fasterxml.jackson.databind.util.StdDateFormat (timezone: sun.util.calendar.ZoneInfo[id=\"America/Los_Angeles\",offset=-28800000,dstSavings=3600000,useDaylight=true,transitions=185,lastRule=java.util.SimpleTimeZone[id=America/Los_Angeles,offset=-28800000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=3,startMonth=2,startDay=8,startDayOfWeek=1,startTime=7200000,startTimeMode=0,endMode=3,endMonth=10,endDay=1,endDayOfWeek=1,endTime=7200000,endTimeMode=0]])(locale: en)"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = 9;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = ((java.util.Locale)v2).getDisplayScript();
    Object v4 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = "";
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).parse(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.Locale.Category.FORMAT;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v8));
    Object v10 = java.util.Locale.Category.FORMAT;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = java.text.NumberFormat.getNumberInstance(((java.util.Locale)v11));
    ((java.text.DateFormat)v9).setNumberFormat(((java.text.NumberFormat)v12));
    Object v13 = null;
    Object v14 = java.util.TimeZone.getDefault();
    Object v15 = 1L;
    Object v16 = ((java.util.TimeZone)v14).getOffset((((java.lang.Long)v15).longValue()));
    Object v17 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).withTimeZone(((java.util.TimeZone)v14));
    Object v18 = ((java.text.DateFormat)v17).getTimeZone();
    Object v19 = java.util.TimeZone.getDefault();
    Object v20 = java.util.Locale.Category.FORMAT;
    Object v21 = java.util.Locale.getDefault(((java.util.Locale.Category)v20));
    Object v22 = java.util.Calendar.getInstance(((java.util.TimeZone)v19),((java.util.Locale)v21));
    ((java.text.DateFormat)v17).setCalendar(((java.util.Calendar)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = false;
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).setLenient((((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).clone();
    Object v10 = "string";
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).looksLikeISO8601(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = new java.util.TreeSet();
    Object v10 = new java.util.ArrayList(((java.util.Collection)v9));
    Object v11 = ((java.text.Format)v8).formatToCharacterIterator(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = java.util.TimeZone.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withTimeZone(((java.util.TimeZone)v9));
    Object v11 = 0;
    Object v12 = -2;
    Object v13 = 0;
    Object v14 = -18;
    Object v15 = 34;
    Object v16 = 0;
    Object v17 = new java.util.Date((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v19 = java.util.Locale.Category.FORMAT;
    Object v20 = java.util.Locale.getDefault(((java.util.Locale.Category)v19));
    Object v21 = java.util.Locale.Category.FORMAT;
    Object v22 = java.util.Locale.getDefault(((java.util.Locale.Category)v21));
    Object v23 = ((java.util.Locale)v20).getDisplayCountry(((java.util.Locale)v22));
    Object v24 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v18).withLocale(((java.util.Locale)v20));
    Object v25 = java.util.Locale.Category.FORMAT;
    Object v26 = java.util.Locale.getDefault(((java.util.Locale.Category)v25));
    Object v27 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v24).withLocale(((java.util.Locale)v26));
    Object v28 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v27).toString();
    Object v29 = new java.lang.StringBuffer(((java.lang.CharSequence)v28));
    Object v30 = -38;
    Object v31 = new java.text.FieldPosition((((java.lang.Integer)v30).intValue()));
    Object v32 = ((java.text.DateFormat)v10).format(((java.lang.Object)v17),((java.lang.StringBuffer)v29),((java.text.FieldPosition)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = java.text.DateFormat.getInstance();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.Locale.Category.FORMAT;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v8));
    Object v10 = ")";
    Object v11 = ((java.text.Format)v9).parseObject(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = java.util.TimeZone.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withTimeZone(((java.util.TimeZone)v9));
    Object v11 = 0;
    Object v12 = -2;
    Object v13 = 0;
    Object v14 = -18;
    Object v15 = 34;
    Object v16 = 0;
    Object v17 = new java.util.Date((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v19 = java.util.Locale.Category.FORMAT;
    Object v20 = java.util.Locale.getDefault(((java.util.Locale.Category)v19));
    Object v21 = java.util.Locale.Category.FORMAT;
    Object v22 = java.util.Locale.getDefault(((java.util.Locale.Category)v21));
    Object v23 = ((java.util.Locale)v20).getDisplayCountry(((java.util.Locale)v22));
    Object v24 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v18).withLocale(((java.util.Locale)v20));
    Object v25 = java.util.Locale.Category.FORMAT;
    Object v26 = java.util.Locale.getDefault(((java.util.Locale.Category)v25));
    Object v27 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v24).withLocale(((java.util.Locale)v26));
    Object v28 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v27).toString();
    Object v29 = new java.lang.StringBuffer(((java.lang.CharSequence)v28));
    Object v30 = -38;
    Object v31 = new java.text.FieldPosition((((java.lang.Integer)v30).intValue()));
    Object v32 = -38;
    Object v33 = new java.text.FieldPosition((((java.lang.Integer)v32).intValue()));
    Object v34 = ((java.text.FieldPosition)v31).equals(((java.lang.Object)v33));
    Object v35 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).format(((java.util.Date)v17),((java.lang.StringBuffer)v29),((java.text.FieldPosition)v31));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = java.util.TimeZone.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withTimeZone(((java.util.TimeZone)v9));
    Object v11 = java.util.Locale.Category.FORMAT;
    Object v12 = java.util.Locale.getDefault(((java.util.Locale.Category)v11));
    Object v13 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withLocale(((java.util.Locale)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = java.util.TimeZone.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withTimeZone(((java.util.TimeZone)v9));
    Object v11 = "strXng";
    Object v12 = 0;
    Object v13 = new java.text.ParsePosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((java.text.ParsePosition)v13).toString();
    Object v15 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).parseAsRFC1123(((java.lang.String)v11),((java.text.ParsePosition)v13));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = "Can not ";
    Object v8 = 0;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).parseAsISO8601(((java.lang.String)v7),((java.text.ParsePosition)v9),(((java.lang.Boolean)v10).booleanValue()));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 24;
    Object v2 = java.util.Locale.Category.FORMAT;
    Object v3 = java.util.Locale.getDefault(((java.util.Locale.Category)v2));
    Object v4 = java.text.DateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.Locale)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = "DeserializationProblemHandler.handleMissingInstantiator() for type %s reurned value of type %s";
    Object v10 = 0;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).parse(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = "), expectiog String";
    Object v14 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).looksLikeISO8601(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = java.util.TimeZone.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withTimeZone(((java.util.TimeZone)v9));
    Object v11 = java.util.Locale.Category.FORMAT;
    Object v12 = java.util.Locale.getDefault(((java.util.Locale.Category)v11));
    Object v13 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withLocale(((java.util.Locale)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v15 = java.util.Locale.Category.FORMAT;
    Object v16 = java.util.Locale.getDefault(((java.util.Locale.Category)v15));
    Object v17 = java.util.Locale.Category.FORMAT;
    Object v18 = java.util.Locale.getDefault(((java.util.Locale.Category)v17));
    Object v19 = ((java.util.Locale)v16).getDisplayCountry(((java.util.Locale)v18));
    Object v20 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v14).withLocale(((java.util.Locale)v16));
    Object v21 = java.util.TimeZone.getDefault();
    Object v22 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v20).withTimeZone(((java.util.TimeZone)v21));
    Object v23 = java.util.TimeZone.getDefault();
    Object v24 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v22).withTimeZone(((java.util.TimeZone)v23));
    Object v25 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v24).getTimeZone();
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v13).setTimeZone(((java.util.TimeZone)v25));
    Object v26 = null;
    Object v27 = java.util.TimeZone.getDefault();
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v13).setTimeZone(((java.util.TimeZone)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = -19;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayScript(((java.util.Locale)v4));
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.text.DateFormat.getDateTimeInstance();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayScript(((java.util.Locale)v4));
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v6));
    Object v8 = "Do dot know how to construct standard type serializer for inclusion type: ";
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).looksLikeISO8601(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = -38;
    Object v10 = new java.text.FieldPosition((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v10 = java.util.Locale.Category.FORMAT;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = java.util.Locale.Category.FORMAT;
    Object v13 = java.util.Locale.getDefault(((java.util.Locale.Category)v12));
    Object v14 = ((java.util.Locale)v11).getDisplayCountry(((java.util.Locale)v13));
    Object v15 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).withLocale(((java.util.Locale)v11));
    Object v16 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayScript(((java.util.Locale)v4));
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v6));
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).withTimeZone(((java.util.TimeZone)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = -23;
    Object v1 = java.text.DateFormat.getDateInstance((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = java.util.TimeZone.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withTimeZone(((java.util.TimeZone)v9));
    Object v11 = "Can not upgrade from an instance of ";
    Object v12 = 0;
    Object v13 = new java.text.ParsePosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).parseAsRFC1123(((java.lang.String)v11),((java.text.ParsePosition)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayScript(((java.util.Locale)v4));
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v6));
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).withTimeZone(((java.util.TimeZone)v8));
    Object v10 = true;
    ((java.text.DateFormat)v9).setLenient((((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    Object v12 = 0;
    Object v13 = -2;
    Object v14 = 0;
    Object v15 = -18;
    Object v16 = 34;
    Object v17 = 0;
    Object v18 = new java.util.Date((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = ((java.text.DateFormat)v9).format(((java.util.Date)v18));
    org.junit.Assert.assertEquals((Object)("1899-10-30T06:34:00.000-0800"), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayScript(((java.util.Locale)v4));
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v6));
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).withTimeZone(((java.util.TimeZone)v8));
    Object v10 = ": ";
    Object v11 = 0;
    Object v12 = new java.text.ParsePosition((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).parse(((java.lang.String)v10),((java.text.ParsePosition)v12));
    Object v14 = java.util.TimeZone.getDefault();
    Object v15 = java.util.Locale.Category.FORMAT;
    Object v16 = java.util.Locale.getDefault(((java.util.Locale.Category)v15));
    Object v17 = java.util.Locale.Category.FORMAT;
    Object v18 = java.util.Locale.getDefault(((java.util.Locale.Category)v17));
    Object v19 = ((java.util.Locale)v16).getDisplayScript(((java.util.Locale)v18));
    Object v20 = false;
    Object v21 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v14),((java.util.Locale)v16),((java.lang.Boolean)v20));
    Object v22 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).equals(((java.lang.Object)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.Locale.Category.FORMAT;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v8));
    Object v10 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v11 = java.util.Locale.Category.FORMAT;
    Object v12 = java.util.Locale.getDefault(((java.util.Locale.Category)v11));
    Object v13 = java.util.Locale.Category.FORMAT;
    Object v14 = java.util.Locale.getDefault(((java.util.Locale.Category)v13));
    Object v15 = ((java.util.Locale)v12).getDisplayCountry(((java.util.Locale)v14));
    Object v16 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).withLocale(((java.util.Locale)v12));
    Object v17 = java.util.TimeZone.getDefault();
    Object v18 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v16).withTimeZone(((java.util.TimeZone)v17));
    Object v19 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v18).clone();
    Object v20 = "string";
    Object v21 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v18).looksLikeISO8601(((java.lang.String)v20));
    Object v22 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).equals(((java.lang.Object)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayScript(((java.util.Locale)v4));
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v6));
    Object v8 = true;
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).setLenient((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = java.util.TimeZone.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withTimeZone(((java.util.TimeZone)v9));
    Object v11 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v12 = java.util.Locale.Category.FORMAT;
    Object v13 = java.util.Locale.getDefault(((java.util.Locale.Category)v12));
    Object v14 = java.util.Locale.Category.FORMAT;
    Object v15 = java.util.Locale.getDefault(((java.util.Locale.Category)v14));
    Object v16 = ((java.util.Locale)v13).getDisplayCountry(((java.util.Locale)v15));
    Object v17 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v11).withLocale(((java.util.Locale)v13));
    Object v18 = java.util.TimeZone.getDefault();
    Object v19 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v17).withTimeZone(((java.util.TimeZone)v18));
    Object v20 = java.util.TimeZone.getDefault();
    Object v21 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v19).withTimeZone(((java.util.TimeZone)v20));
    Object v22 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v21).getTimeZone();
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).setTimeZone(((java.util.TimeZone)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.Locale.Category.FORMAT;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = java.text.NumberFormat.getNumberInstance(((java.util.Locale)v8));
    Object v10 = java.math.RoundingMode.HALF_EVEN;
    ((java.text.NumberFormat)v9).setRoundingMode(((java.math.RoundingMode)v10));
    Object v11 = null;
    ((java.text.DateFormat)v6).setNumberFormat(((java.text.NumberFormat)v9));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.Locale.Category.FORMAT;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v8));
    Object v10 = java.util.TimeZone.getDefault();
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).setTimeZone(((java.util.TimeZone)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(((java.util.TimeZone)v0),((java.util.Locale)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayScript(((java.util.Locale)v4));
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v6));
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).withTimeZone(((java.util.TimeZone)v8));
    Object v10 = java.util.TimeZone.getDefault();
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).withTimeZone(((java.util.TimeZone)v10));
    Object v12 = ": ";
    Object v13 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).looksLikeISO8601(((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayScript(((java.util.Locale)v4));
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v6));
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).withTimeZone(((java.util.TimeZone)v8));
    Object v10 = java.util.Locale.Category.FORMAT;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = ((java.util.Locale)v11).getISO3Language();
    Object v13 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).withLocale(((java.util.Locale)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withTimeZone(((java.util.TimeZone)v7));
    Object v9 = java.util.TimeZone.getDefault();
    Object v10 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v8).withTimeZone(((java.util.TimeZone)v9));
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v10).getTimeZone();
    Object v12 = java.util.Locale.Category.FORMAT;
    Object v13 = java.util.Locale.getDefault(((java.util.Locale.Category)v12));
    Object v14 = com.fasterxml.jackson.databind.util.StdDateFormat.getISO8601Format(((java.util.TimeZone)v11),((java.util.Locale)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = "truH";
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).looksLikeISO8601(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayScript(((java.util.Locale)v4));
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v6));
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).withTimeZone(((java.util.TimeZone)v8));
    Object v10 = java.util.Locale.Category.FORMAT;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = ((java.util.Locale)v11).getISO3Language();
    Object v13 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).withLocale(((java.util.Locale)v11));
    Object v14 = java.util.Locale.Category.FORMAT;
    Object v15 = java.util.Locale.getDefault(((java.util.Locale.Category)v14));
    Object v16 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v13).withLocale(((java.util.Locale)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.Locale.Category.FORMAT;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v8));
    Object v10 = "B";
    Object v11 = ((java.text.Format)v9).parseObject(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayScript(((java.util.Locale)v4));
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v6));
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v7)._clearFormats();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayScript(((java.util.Locale)v4));
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v6));
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).withTimeZone(((java.util.TimeZone)v8));
    Object v10 = java.util.Locale.Category.FORMAT;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = java.text.NumberFormat.getNumberInstance(((java.util.Locale)v11));
    ((java.text.DateFormat)v9).setNumberFormat(((java.text.NumberFormat)v12));
    Object v13 = null;
    Object v14 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).isLenient();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = 0;
    Object v8 = -2;
    Object v9 = 0;
    Object v10 = -18;
    Object v11 = 34;
    Object v12 = 0;
    Object v13 = new java.util.Date((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((java.text.DateFormat)v6).format(((java.util.Date)v13));
    org.junit.Assert.assertEquals((Object)("1899-10-30T14:34:00.000+0000"), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = ((java.util.TimeZone)v0).getDSTSavings();
    Object v2 = java.util.Locale.Category.FORMAT;
    Object v3 = java.util.Locale.getDefault(((java.util.Locale.Category)v2));
    Object v4 = java.util.Locale.Category.FORMAT;
    Object v5 = java.util.Locale.getDefault(((java.util.Locale.Category)v4));
    Object v6 = ((java.util.Locale)v3).getDisplayVariant(((java.util.Locale)v5));
    Object v7 = true;
    Object v8 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v3),((java.lang.Boolean)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.text.DateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = 0;
    Object v6 = -2;
    Object v7 = 0;
    Object v8 = -18;
    Object v9 = 34;
    Object v10 = 0;
    Object v11 = new java.util.Date((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v13 = java.util.Locale.Category.FORMAT;
    Object v14 = java.util.Locale.getDefault(((java.util.Locale.Category)v13));
    Object v15 = java.util.Locale.Category.FORMAT;
    Object v16 = java.util.Locale.getDefault(((java.util.Locale.Category)v15));
    Object v17 = ((java.util.Locale)v14).getDisplayCountry(((java.util.Locale)v16));
    Object v18 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v12).withLocale(((java.util.Locale)v14));
    Object v19 = java.util.Locale.Category.FORMAT;
    Object v20 = java.util.Locale.getDefault(((java.util.Locale.Category)v19));
    Object v21 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v18).withLocale(((java.util.Locale)v20));
    Object v22 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v21).toString();
    Object v23 = new java.lang.StringBuffer(((java.lang.CharSequence)v22));
    Object v24 = -38;
    Object v25 = new java.text.FieldPosition((((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).format(((java.util.Date)v11),((java.lang.StringBuffer)v23),((java.text.FieldPosition)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = java.util.Locale.Category.FORMAT;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).withLocale(((java.util.Locale)v8));
    ((com.fasterxml.jackson.databind.util.StdDateFormat)v6)._clearFormats();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayScript(((java.util.Locale)v4));
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v6));
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).withTimeZone(((java.util.TimeZone)v8));
    Object v10 = java.util.Locale.Category.FORMAT;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = ((java.util.Locale)v11).getISO3Language();
    Object v13 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v9).withLocale(((java.util.Locale)v11));
    Object v14 = 0;
    Object v15 = -2;
    Object v16 = 0;
    Object v17 = -18;
    Object v18 = 34;
    Object v19 = 0;
    Object v20 = new java.util.Date((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v22 = java.util.Locale.Category.FORMAT;
    Object v23 = java.util.Locale.getDefault(((java.util.Locale.Category)v22));
    Object v24 = java.util.Locale.Category.FORMAT;
    Object v25 = java.util.Locale.getDefault(((java.util.Locale.Category)v24));
    Object v26 = ((java.util.Locale)v23).getDisplayCountry(((java.util.Locale)v25));
    Object v27 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v21).withLocale(((java.util.Locale)v23));
    Object v28 = java.util.Locale.Category.FORMAT;
    Object v29 = java.util.Locale.getDefault(((java.util.Locale.Category)v28));
    Object v30 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v27).withLocale(((java.util.Locale)v29));
    Object v31 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v30).toString();
    Object v32 = new java.lang.StringBuffer(((java.lang.CharSequence)v31));
    Object v33 = -38;
    Object v34 = new java.text.FieldPosition((((java.lang.Integer)v33).intValue()));
    Object v35 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v13).format(((java.util.Date)v20),((java.lang.StringBuffer)v32),((java.text.FieldPosition)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.util.StdDateFormat();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v4));
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v0).withLocale(((java.util.Locale)v2));
    Object v7 = "";
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v6).looksLikeISO8601(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = com.fasterxml.jackson.databind.util.StdDateFormat.getRFC1123Format(((java.util.TimeZone)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.util.Locale.Category.FORMAT;
    Object v4 = java.util.Locale.getDefault(((java.util.Locale.Category)v3));
    Object v5 = ((java.util.Locale)v2).getDisplayScript(((java.util.Locale)v4));
    Object v6 = false;
    Object v7 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v6));
    Object v8 = "";
    Object v9 = 0;
    Object v10 = new java.text.ParsePosition((((java.lang.Integer)v9).intValue()));
    Object v11 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v7).parse(((java.lang.String)v8),((java.text.ParsePosition)v10));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = "_";
    Object v6 = 0;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).parseAsRFC1123(((java.lang.String)v5),((java.text.ParsePosition)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = false;
    Object v4 = new com.fasterxml.jackson.databind.util.StdDateFormat(((java.util.TimeZone)v0),((java.util.Locale)v2),((java.lang.Boolean)v3));
    Object v5 = "Can not pass null modifier";
    Object v6 = ((com.fasterxml.jackson.databind.util.StdDateFormat)v4).looksLikeISO8601(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = 21;
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = java.text.DateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
