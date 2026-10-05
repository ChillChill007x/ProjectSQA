package com.google.gson.internal.bind.util;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "?";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "_";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.google.gson.internal.bind.util.ISO8601Utils();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = false;
    Object v5 = "Invalid time zone indicator '";
    Object v6 = java.util.TimeZone.getTimeZone(((java.lang.String)v5));
    Object v7 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v4).booleanValue()),((java.util.TimeZone)v6));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00Z"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = false;
    Object v5 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00Z"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "nul";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = "Incomple";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = true;
    Object v5 = "Invalid time zone indicator '";
    Object v6 = java.util.TimeZone.getTimeZone(((java.lang.String)v5));
    Object v7 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v4).booleanValue()),((java.util.TimeZone)v6));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00.000Z"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00Z"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = ", ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "Expected BEGINOBJECT but was ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "null";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "Unterminated comment";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = true;
    Object v5 = "Invalid time zone indicator '";
    Object v6 = java.util.TimeZone.getTimeZone(((java.lang.String)v5));
    Object v7 = ((java.util.TimeZone)v6).toZoneId();
    Object v8 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v4).booleanValue()),((java.util.TimeZone)v6));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00.000Z"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "Not a JSON Object: ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.text.ParsePosition)v2).toString();
    Object v4 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = " path ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = " is not a valid double value as per JSON spe";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = 0;
    ((java.util.Date)v3).setSeconds((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = true;
    Object v7 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00.000Z"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = -2L;
    ((java.util.Date)v3).setTime((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    Object v6 = true;
    Object v7 = "Invalid time zone indicator '";
    Object v8 = java.util.TimeZone.getTimeZone(((java.lang.String)v7));
    Object v9 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v6).booleanValue()),((java.util.TimeZone)v8));
    org.junit.Assert.assertEquals((Object)("1969-12-31T23:59:59.998Z"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = ((java.util.Date)v3).getTime();
    Object v5 = true;
    Object v6 = "Invalid time zone indicator '";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v5).booleanValue()),((java.util.TimeZone)v7));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00.000Z"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "]";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "]";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    ((java.text.ParsePosition)v2).setIndex((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "nul";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.text.ParsePosition)v2).toString();
    Object v4 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = true;
    Object v5 = "Invalid time zone indicator '";
    Object v6 = java.util.TimeZone.getTimeZone(((java.lang.String)v5));
    Object v7 = 0L;
    Object v8 = java.time.Instant.ofEpochMilli((((java.lang.Long)v7).longValue()));
    Object v9 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v8));
    Object v10 = java.util.Date.from(((java.time.Instant)v9));
    Object v11 = ((java.util.TimeZone)v6).inDaylightTime(((java.util.Date)v10));
    Object v12 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v4).booleanValue()),((java.util.TimeZone)v6));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00.000Z"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "Vhh:mm";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "? zuper ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = -19;
    ((java.text.ParsePosition)v2).setIndex((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "{serializeNulls:";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "}";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = ((java.util.Date)v3).hashCode();
    Object v5 = false;
    Object v6 = "Invalid time zone indicator '";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v5).booleanValue()),((java.util.TimeZone)v7));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00Z"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = true;
    Object v5 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00.000Z"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = " but was ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = 1;
    ((java.util.Date)v3).setYear((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = true;
    Object v7 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)("1902-01-01T00:00:00.000Z"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = 0;
    ((java.util.Date)v3).setMonth((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = true;
    Object v7 = "Invalid time zone indicator '";
    Object v8 = java.util.TimeZone.getTimeZone(((java.lang.String)v7));
    Object v9 = ((java.util.TimeZone)v8).observesDaylightTime();
    Object v10 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v6).booleanValue()),((java.util.TimeZone)v8));
    org.junit.Assert.assertEquals((Object)("1969-02-01T00:00:00.000Z"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = -5;
    ((java.text.ParsePosition)v2).setErrorIndex((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = " pth ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = ",adapte=";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "Mismatching time zone indicator: ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "? super ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = -23;
    ((java.text.ParsePosition)v2).setIndex((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = ",adapter=";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "Inva$id EnumSet type: ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = " ?column ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.text.ParsePosition)v2).toString();
    Object v4 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "MM+";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "yyyy";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "theUnsafe";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.text.ParsePosition)v2).toString();
    Object v4 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = ((java.util.Date)v3).getHours();
    Object v5 = true;
    Object v6 = "Invalid time zone indicator '";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v5).booleanValue()),((java.util.TimeZone)v7));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00.000Z"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = ((java.util.Date)v3).toInstant();
    Object v5 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00Z"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = 0L;
    Object v5 = java.time.Instant.ofEpochMilli((((java.lang.Long)v4).longValue()));
    Object v6 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v5));
    Object v7 = java.util.Date.from(((java.time.Instant)v6));
    Object v8 = ((java.util.Date)v3).compareTo(((java.util.Date)v7));
    Object v9 = true;
    Object v10 = "Invalid time zone indicator '";
    Object v11 = java.util.TimeZone.getTimeZone(((java.lang.String)v10));
    Object v12 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v9).booleanValue()),((java.util.TimeZone)v11));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00.000Z"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "Expected an int but was ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = ((java.util.Date)v3).getTimezoneOffset();
    Object v5 = true;
    Object v6 = "Invalid time zone indicator '";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v5).booleanValue()),((java.util.TimeZone)v7));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00.000Z"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = 22;
    ((java.util.Date)v3).setDate((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = true;
    Object v7 = "Invalid time zone indicator '";
    Object v8 = java.util.TimeZone.getTimeZone(((java.lang.String)v7));
    Object v9 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v6).booleanValue()),((java.util.TimeZone)v8));
    org.junit.Assert.assertEquals((Object)("1969-12-23T00:00:00.000Z"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "sss";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = " column ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "nyll";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = " colun ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = ((java.util.Date)v3).getYear();
    Object v5 = false;
    Object v6 = "Invalid time zone indicator '";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v5).booleanValue()),((java.util.TimeZone)v7));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00Z"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "Expected a";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "JSON forbids NaN and infinities: ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = " colu6mn ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = 0L;
    Object v5 = java.time.Instant.ofEpochMilli((((java.lang.Long)v4).longValue()));
    Object v6 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v5));
    Object v7 = java.util.Date.from(((java.time.Instant)v6));
    Object v8 = ((java.util.Date)v3).after(((java.util.Date)v7));
    Object v9 = true;
    Object v10 = "Invalid time zone indicator '";
    Object v11 = java.util.TimeZone.getTimeZone(((java.lang.String)v10));
    Object v12 = true;
    Object v13 = 0;
    Object v14 = ((java.util.TimeZone)v11).getDisplayName((((java.lang.Boolean)v12).booleanValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v9).booleanValue()),((java.util.TimeZone)v11));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00.000Z"), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "Ujnexpected type. Expected one of: ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = " jut was ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = 0;
    ((java.util.Date)v3).setMonth((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = false;
    Object v7 = "Invalid time zone indicator '";
    Object v8 = java.util.TimeZone.getTimeZone(((java.lang.String)v7));
    Object v9 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v6).booleanValue()),((java.util.TimeZone)v8));
    org.junit.Assert.assertEquals((Object)("1969-02-01T00:00:00Z"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "End of input at line ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = " cannot deserialize to ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "\\u4";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = 0L;
    Object v5 = java.time.Instant.ofEpochMilli((((java.lang.Long)v4).longValue()));
    Object v6 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v5));
    Object v7 = java.util.Date.from(((java.time.Instant)v6));
    Object v8 = ((java.util.Date)v3).after(((java.util.Date)v7));
    Object v9 = false;
    Object v10 = "Invalid time zone indicator '";
    Object v11 = java.util.TimeZone.getTimeZone(((java.lang.String)v10));
    Object v12 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v9).booleanValue()),((java.util.TimeZone)v11));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00Z"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = ")]}'\n";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "? super ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = 1L;
    ((java.util.Date)v3).setTime((((java.lang.Long)v4).longValue()));
    Object v5 = null;
    Object v6 = true;
    Object v7 = "Invalid time zone indicator '";
    Object v8 = java.util.TimeZone.getTimeZone(((java.lang.String)v7));
    Object v9 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v6).booleanValue()),((java.util.TimeZone)v8));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00.001Z"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = ((java.util.Date)v3).getMinutes();
    Object v5 = false;
    Object v6 = "Invalid time zone indicator '";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v5).booleanValue()),((java.util.TimeZone)v7));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00Z"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = false;
    Object v5 = "Invalid time zone indicator '";
    Object v6 = java.util.TimeZone.getTimeZone(((java.lang.String)v5));
    Object v7 = "Invalid time zone indicator '";
    Object v8 = java.util.TimeZone.getTimeZone(((java.lang.String)v7));
    Object v9 = ((java.util.TimeZone)v6).hasSameRules(((java.util.TimeZone)v8));
    Object v10 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v4).booleanValue()),((java.util.TimeZone)v6));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00Z"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = 22;
    ((java.util.Date)v3).setHours((((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = true;
    Object v7 = "Invalid time zone indicator '";
    Object v8 = java.util.TimeZone.getTimeZone(((java.lang.String)v7));
    Object v9 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v6).booleanValue()),((java.util.TimeZone)v8));
    org.junit.Assert.assertEquals((Object)("1970-01-01T06:00:00.000Z"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = ". Forgot to register";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "\\\\";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = true;
    Object v5 = "Invalid time zone indicator '";
    Object v6 = java.util.TimeZone.getTimeZone(((java.lang.String)v5));
    Object v7 = ((java.util.TimeZone)v6).getRawOffset();
    Object v8 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v4).booleanValue()),((java.util.TimeZone)v6));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00.000Z"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "Numeric values must be finite, bu@t was ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "END_OBJECT";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = " c";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "mm";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = ((java.util.Date)v3).getMonth();
    Object v5 = false;
    Object v6 = "Invalid time zone indicator '";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v5).booleanValue()),((java.util.TimeZone)v7));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00Z"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = false;
    Object v5 = "Invalid time zone indicator '";
    Object v6 = java.util.TimeZone.getTimeZone(((java.lang.String)v5));
    Object v7 = ((java.util.TimeZone)v6).clone();
    Object v8 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v4).booleanValue()),((java.util.TimeZone)v6));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00Z"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = ":";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = false;
    Object v5 = "Invalid time zone indicator '";
    Object v6 = java.util.TimeZone.getTimeZone(((java.lang.String)v5));
    Object v7 = ((java.util.TimeZone)v6).getDisplayName();
    Object v8 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v4).booleanValue()),((java.util.TimeZone)v6));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00Z"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "l";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = ((java.util.Date)v3).getMinutes();
    Object v5 = true;
    Object v6 = "Invalid time zone indicator '";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = "Invalid time zone indicator '";
    Object v9 = java.util.TimeZone.getTimeZone(((java.lang.String)v8));
    Object v10 = ((java.util.TimeZone)v7).hasSameRules(((java.util.TimeZone)v9));
    Object v11 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v5).booleanValue()),((java.util.TimeZone)v7));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00.000Z"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "key == null";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "miute";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "\\u";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "BOOLEAN";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "n";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = true;
    Object v5 = "Invalid time zone indicator '";
    Object v6 = java.util.TimeZone.getTimeZone(((java.lang.String)v5));
    Object v7 = false;
    Object v8 = 1;
    Object v9 = "LOWER_CASE_WITH_DASHES";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = ((java.util.TimeZone)v6).getDisplayName((((java.lang.Boolean)v7).booleanValue()),(((java.lang.Integer)v8).intValue()),((java.util.Locale)v10));
    Object v12 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v4).booleanValue()),((java.util.TimeZone)v6));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00.000Z"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = false;
    Object v5 = "Invalid time zone indicator '";
    Object v6 = java.util.TimeZone.getTimeZone(((java.lang.String)v5));
    Object v7 = false;
    Object v8 = 0;
    Object v9 = "LOWER_CASE_WITH_DASHES";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = ((java.util.TimeZone)v6).getDisplayName((((java.lang.Boolean)v7).booleanValue()),(((java.lang.Integer)v8).intValue()),((java.util.Locale)v10));
    Object v12 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v4).booleanValue()),((java.util.TimeZone)v6));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00Z"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = " cotlumn ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = 7;
    ((java.text.ParsePosition)v2).setErrorIndex((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = " clumn ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "Expected BEGIN_OBJEC$T but was ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = " column ";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    ((java.text.ParsePosition)v2).setIndex((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = ",adapter=";
    Object v1 = 1;
    Object v2 = new java.text.ParsePosition((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.text.ParsePosition)v2).toString();
    Object v4 = com.google.gson.internal.bind.util.ISO8601Utils.parse(((java.lang.String)v0),((java.text.ParsePosition)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 0L;
    Object v1 = java.time.Instant.ofEpochMilli((((java.lang.Long)v0).longValue()));
    Object v2 = java.time.Instant.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.Date.from(((java.time.Instant)v2));
    Object v4 = false;
    Object v5 = "Invalid time zone indicator '";
    Object v6 = java.util.TimeZone.getTimeZone(((java.lang.String)v5));
    Object v7 = "]";
    ((java.util.TimeZone)v6).setID(((java.lang.String)v7));
    Object v8 = null;
    Object v9 = com.google.gson.internal.bind.util.ISO8601Utils.format(((java.util.Date)v3),(((java.lang.Boolean)v4).booleanValue()),((java.util.TimeZone)v6));
    org.junit.Assert.assertEquals((Object)("1970-01-01T00:00:00Z"), v9);
  }
}
