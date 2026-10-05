package org.apache.commons.lang.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 4;
    Object v3 = 0;
    Object v4 = org.apache.commons.lang.time.DateUtils.add(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = -9L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = org.apache.commons.lang.time.DateUtils.isSameInstant(((java.util.Date)v1),((java.util.Date)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.time.DateUtils.addHours(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "uuml";
    Object v1 = new java.util.Locale(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.time.DateUtils.round(((java.lang.Object)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 1;
    ((java.util.Calendar)v13).clear((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    Object v16 = -11;
    Object v17 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v16).intValue()));
    Object v18 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v17));
    Object v19 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v18));
    Object v20 = "uuml";
    Object v21 = new java.util.Locale(((java.lang.String)v20));
    Object v22 = java.util.Calendar.getInstance(((java.util.TimeZone)v19),((java.util.Locale)v21));
    Object v23 = -9L;
    Object v24 = new java.util.Date((((java.lang.Long)v23).longValue()));
    ((java.util.Calendar)v22).setTime(((java.util.Date)v24));
    Object v25 = null;
    Object v26 = 2;
    Object v27 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v22),(((java.lang.Integer)v26).intValue()));
    Object v28 = org.apache.commons.lang.time.DateUtils.isSameLocalTime(((java.util.Calendar)v13),((java.util.Calendar)v27));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 59;
    Object v3 = org.apache.commons.lang.time.DateUtils.round(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = -9L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = org.apache.commons.lang.time.DateUtils.isSameDay(((java.util.Date)v1),((java.util.Date)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = -11;
    Object v13 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v12).intValue()));
    Object v14 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v13));
    Object v15 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v14));
    Object v16 = "uuml";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = java.util.Calendar.getInstance(((java.util.TimeZone)v15),((java.util.Locale)v17));
    Object v19 = -9L;
    Object v20 = new java.util.Date((((java.lang.Long)v19).longValue()));
    ((java.util.Calendar)v18).setTime(((java.util.Date)v20));
    Object v21 = null;
    Object v22 = 2;
    Object v23 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v18),(((java.lang.Integer)v22).intValue()));
    Object v24 = 0;
    Object v25 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = org.apache.commons.lang.time.DateUtils.isSameLocalTime(((java.util.Calendar)v11),((java.util.Calendar)v25));
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = -26;
    Object v4 = org.apache.commons.lang.time.DateUtils.truncate(((java.lang.Object)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 6;
    Object v15 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v13),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.time.DateUtils.addHours(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.Date)v3).getMonth();
    Object v5 = 1;
    Object v6 = org.apache.commons.lang.time.DateUtils.addMinutes(((java.util.Date)v3),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = org.apache.commons.lang.time.DateUtils.add(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.time.DateUtils.addHours(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = org.apache.commons.lang.time.DateUtils.iterator(((java.util.Date)v3),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "The start indexGwas out of bounds: ";
    Object v1 = new java.lang.String[]{};
    Object v2 = org.apache.commons.lang.time.DateUtils.parseDate(((java.lang.String)v0),((java.lang.String[])v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 0;
    ((java.util.Date)v1).setMinutes((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = -9L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = org.apache.commons.lang.time.DateUtils.add(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.util.Date)v8).toInstant();
    Object v10 = org.apache.commons.lang.time.DateUtils.isSameInstant(((java.util.Date)v1),((java.util.Date)v8));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = -11;
    Object v13 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v12).intValue()));
    Object v14 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v13));
    Object v15 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v14));
    Object v16 = "uuml";
    Object v17 = new java.util.Locale(((java.lang.String)v16));
    Object v18 = java.util.Calendar.getInstance(((java.util.TimeZone)v15),((java.util.Locale)v17));
    Object v19 = -9L;
    Object v20 = new java.util.Date((((java.lang.Long)v19).longValue()));
    ((java.util.Calendar)v18).setTime(((java.util.Date)v20));
    Object v21 = null;
    Object v22 = 2;
    Object v23 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v18),(((java.lang.Integer)v22).intValue()));
    Object v24 = 0;
    Object v25 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = org.apache.commons.lang.time.DateUtils.isSameInstant(((java.util.Calendar)v11),((java.util.Calendar)v25));
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v13),(((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = 25;
    Object v17 = org.apache.commons.lang.time.DateUtils.iterator(((java.util.Calendar)v15),(((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "prim";
    Object v1 = new java.lang.String[]{"The number must not be fNaN","<"};
    Object v2 = org.apache.commons.lang.time.DateUtils.parseDate(((java.lang.String)v0),((java.lang.String[])v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = org.apache.commons.lang.time.DateUtils.add(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 30;
    Object v6 = org.apache.commons.lang.time.DateUtils.round(((java.lang.Object)v4),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 26;
    Object v3 = org.apache.commons.lang.time.DateUtils.round(((java.lang.Object)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = -11;
    Object v15 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v14).intValue()));
    Object v16 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v15));
    Object v17 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v16));
    Object v18 = "uuml";
    Object v19 = new java.util.Locale(((java.lang.String)v18));
    Object v20 = java.util.Calendar.getInstance(((java.util.TimeZone)v17),((java.util.Locale)v19));
    Object v21 = -9L;
    Object v22 = new java.util.Date((((java.lang.Long)v21).longValue()));
    ((java.util.Calendar)v20).setTime(((java.util.Date)v22));
    Object v23 = null;
    Object v24 = 2;
    Object v25 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v20),(((java.lang.Integer)v24).intValue()));
    Object v26 = 0;
    Object v27 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = 0;
    Object v29 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = org.apache.commons.lang.time.DateUtils.isSameDay(((java.util.Calendar)v13),((java.util.Calendar)v29));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.time.DateUtils.iterator(((java.lang.Object)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.time.DateUtils.addHours(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = -1;
    Object v5 = org.apache.commons.lang.time.DateUtils.iterator(((java.util.Date)v3),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.time.DateUtils.iterator(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = -11;
    Object v17 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v16).intValue()));
    Object v18 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v17));
    Object v19 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v18));
    Object v20 = "uuml";
    Object v21 = new java.util.Locale(((java.lang.String)v20));
    Object v22 = java.util.Calendar.getInstance(((java.util.TimeZone)v19),((java.util.Locale)v21));
    Object v23 = -9L;
    Object v24 = new java.util.Date((((java.lang.Long)v23).longValue()));
    ((java.util.Calendar)v22).setTime(((java.util.Date)v24));
    Object v25 = null;
    Object v26 = 2;
    Object v27 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v22),(((java.lang.Integer)v26).intValue()));
    Object v28 = 0;
    Object v29 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = 0;
    Object v31 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((java.util.Calendar)v31).toString();
    Object v33 = org.apache.commons.lang.time.DateUtils.isSameLocalTime(((java.util.Calendar)v15),((java.util.Calendar)v31));
    org.junit.Assert.assertEquals((Object)(true), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.time.DateUtils.addHours(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.Date)v3).getMonth();
    Object v5 = 1;
    Object v6 = org.apache.commons.lang.time.DateUtils.addMinutes(((java.util.Date)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = org.apache.commons.lang.time.DateUtils.round(((java.util.Date)v6),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "l";
    Object v1 = new java.lang.String[]{};
    Object v2 = org.apache.commons.lang.time.DateUtils.parseDate(((java.lang.String)v0),((java.lang.String[])v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = 28;
    Object v4 = org.apache.commons.lang.time.DateUtils.truncate(((java.lang.Object)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = -11;
    Object v15 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v14).intValue()));
    Object v16 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v15));
    Object v17 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v16));
    Object v18 = "uuml";
    Object v19 = new java.util.Locale(((java.lang.String)v18));
    Object v20 = java.util.Calendar.getInstance(((java.util.TimeZone)v17),((java.util.Locale)v19));
    Object v21 = -9L;
    Object v22 = new java.util.Date((((java.lang.Long)v21).longValue()));
    ((java.util.Calendar)v20).setTime(((java.util.Date)v22));
    Object v23 = null;
    Object v24 = 2;
    Object v25 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v20),(((java.lang.Integer)v24).intValue()));
    Object v26 = 0;
    Object v27 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = 0;
    Object v29 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = org.apache.commons.lang.time.DateUtils.isSameLocalTime(((java.util.Calendar)v13),((java.util.Calendar)v29));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = -11;
    Object v15 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v14).intValue()));
    Object v16 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v15));
    Object v17 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v16));
    Object v18 = "uuml";
    Object v19 = new java.util.Locale(((java.lang.String)v18));
    Object v20 = java.util.Calendar.getInstance(((java.util.TimeZone)v17),((java.util.Locale)v19));
    Object v21 = -9L;
    Object v22 = new java.util.Date((((java.lang.Long)v21).longValue()));
    ((java.util.Calendar)v20).setTime(((java.util.Date)v22));
    Object v23 = null;
    Object v24 = 2;
    Object v25 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v20),(((java.lang.Integer)v24).intValue()));
    Object v26 = 0;
    Object v27 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = org.apache.commons.lang.time.DateUtils.isSameDay(((java.util.Calendar)v13),((java.util.Calendar)v27));
    org.junit.Assert.assertEquals((Object)(true), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 3;
    Object v15 = ((java.util.Calendar)v13).getMaximum((((java.lang.Integer)v14).intValue()));
    Object v16 = -11;
    Object v17 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v16).intValue()));
    Object v18 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v17));
    Object v19 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v18));
    Object v20 = "uuml";
    Object v21 = new java.util.Locale(((java.lang.String)v20));
    Object v22 = java.util.Calendar.getInstance(((java.util.TimeZone)v19),((java.util.Locale)v21));
    Object v23 = -9L;
    Object v24 = new java.util.Date((((java.lang.Long)v23).longValue()));
    ((java.util.Calendar)v22).setTime(((java.util.Date)v24));
    Object v25 = null;
    Object v26 = 2;
    Object v27 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v22),(((java.lang.Integer)v26).intValue()));
    Object v28 = 0;
    Object v29 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = 0;
    Object v31 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = 0;
    ((java.util.Calendar)v31).setFirstDayOfWeek((((java.lang.Integer)v32).intValue()));
    Object v33 = null;
    Object v34 = org.apache.commons.lang.time.DateUtils.isSameDay(((java.util.Calendar)v13),((java.util.Calendar)v31));
    org.junit.Assert.assertEquals((Object)(true), v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.time.DateUtils.addSeconds(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = java.util.Map.of();
    Object v1 = -7;
    Object v2 = org.apache.commons.lang.time.DateUtils.truncate(((java.lang.Object)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "uuml";
    Object v1 = new java.util.Locale(((java.lang.String)v0));
    Object v2 = -1;
    Object v3 = org.apache.commons.lang.time.DateUtils.truncate(((java.lang.Object)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = org.apache.commons.lang.time.DateUtils.add(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -9L;
    Object v6 = new java.util.Date((((java.lang.Long)v5).longValue()));
    Object v7 = ((java.util.Date)v4).after(((java.util.Date)v6));
    Object v8 = -45;
    Object v9 = org.apache.commons.lang.time.DateUtils.addWeeks(((java.util.Date)v4),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = 23;
    Object v17 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v15),(((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = org.apache.commons.lang.time.DateUtils.add(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -9L;
    Object v6 = new java.util.Date((((java.lang.Long)v5).longValue()));
    Object v7 = 1;
    Object v8 = org.apache.commons.lang.time.DateUtils.addSeconds(((java.util.Date)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.lang.time.DateUtils.isSameDay(((java.util.Date)v4),((java.util.Date)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.iterator(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = ((java.util.Date)v1).toLocaleString();
    Object v3 = 12;
    Object v4 = org.apache.commons.lang.time.DateUtils.addMinutes(((java.util.Date)v1),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = -11;
    Object v17 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v16).intValue()));
    Object v18 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v17));
    Object v19 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v18));
    Object v20 = "uuml";
    Object v21 = new java.util.Locale(((java.lang.String)v20));
    Object v22 = java.util.Calendar.getInstance(((java.util.TimeZone)v19),((java.util.Locale)v21));
    Object v23 = -9L;
    Object v24 = new java.util.Date((((java.lang.Long)v23).longValue()));
    ((java.util.Calendar)v22).setTime(((java.util.Date)v24));
    Object v25 = null;
    Object v26 = 2;
    Object v27 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v22),(((java.lang.Integer)v26).intValue()));
    Object v28 = 0;
    Object v29 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = 1L;
    ((java.util.Calendar)v29).setTimeInMillis((((java.lang.Long)v30).longValue()));
    Object v31 = null;
    Object v32 = org.apache.commons.lang.time.DateUtils.isSameLocalTime(((java.util.Calendar)v15),((java.util.Calendar)v29));
    org.junit.Assert.assertEquals((Object)(false), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "?";
    Object v1 = new java.lang.String[]{};
    Object v2 = org.apache.commons.lang.time.DateUtils.parseDate(((java.lang.String)v0),((java.lang.String[])v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = 0;
    Object v4 = org.apache.commons.lang.time.DateUtils.iterator(((java.lang.Object)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.time.DateUtils.addSeconds(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = -9L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    Object v6 = 1;
    Object v7 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.lang.time.DateUtils.isSameInstant(((java.util.Date)v3),((java.util.Date)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 9;
    Object v15 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v13),(((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.DateUtils();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 9;
    Object v15 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = 1;
    Object v17 = ((java.util.Calendar)v15).getActualMinimum((((java.lang.Integer)v16).intValue()));
    Object v18 = -11;
    Object v19 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v18).intValue()));
    Object v20 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v19));
    Object v21 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v20));
    Object v22 = "uuml";
    Object v23 = new java.util.Locale(((java.lang.String)v22));
    Object v24 = java.util.Calendar.getInstance(((java.util.TimeZone)v21),((java.util.Locale)v23));
    Object v25 = -9L;
    Object v26 = new java.util.Date((((java.lang.Long)v25).longValue()));
    ((java.util.Calendar)v24).setTime(((java.util.Date)v26));
    Object v27 = null;
    Object v28 = 2;
    Object v29 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v24),(((java.lang.Integer)v28).intValue()));
    Object v30 = 0;
    Object v31 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((java.util.Calendar)v31).toString();
    Object v33 = org.apache.commons.lang.time.DateUtils.isSameInstant(((java.util.Calendar)v15),((java.util.Calendar)v31));
    org.junit.Assert.assertEquals((Object)(true), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 9;
    Object v15 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = -1;
    Object v17 = org.apache.commons.lang.time.DateUtils.iterator(((java.util.Calendar)v15),(((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "uuml";
    Object v1 = new java.util.Locale(((java.lang.String)v0));
    Object v2 = -5;
    Object v3 = org.apache.commons.lang.time.DateUtils.iterator(((java.lang.Object)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 9;
    Object v15 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = 1;
    Object v17 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v15),(((java.lang.Integer)v16).intValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.time.DateUtils.addHours(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = org.apache.commons.lang.time.DateUtils.addHours(((java.util.Date)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 9;
    Object v15 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = 1;
    Object v17 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v15),(((java.lang.Integer)v16).intValue()));
    Object v18 = -11;
    Object v19 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v18).intValue()));
    Object v20 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v19));
    Object v21 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v20));
    Object v22 = "uuml";
    Object v23 = new java.util.Locale(((java.lang.String)v22));
    Object v24 = java.util.Calendar.getInstance(((java.util.TimeZone)v21),((java.util.Locale)v23));
    Object v25 = -9L;
    Object v26 = new java.util.Date((((java.lang.Long)v25).longValue()));
    ((java.util.Calendar)v24).setTime(((java.util.Date)v26));
    Object v27 = null;
    Object v28 = 2;
    Object v29 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v24),(((java.lang.Integer)v28).intValue()));
    Object v30 = 0;
    Object v31 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = 9;
    Object v33 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v31),(((java.lang.Integer)v32).intValue()));
    Object v34 = org.apache.commons.lang.time.DateUtils.isSameLocalTime(((java.util.Calendar)v17),((java.util.Calendar)v33));
    org.junit.Assert.assertEquals((Object)(true), v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    ((java.util.Calendar)v13).clear((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    Object v16 = 2;
    Object v17 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v13),(((java.lang.Integer)v16).intValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "926";
    Object v1 = new java.lang.String[]{"Y"};
    Object v2 = org.apache.commons.lang.time.DateUtils.parseDate(((java.lang.String)v0),((java.lang.String[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 9;
    Object v15 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = -11;
    Object v17 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v16).intValue()));
    Object v18 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v17));
    Object v19 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v18));
    Object v20 = "uuml";
    Object v21 = new java.util.Locale(((java.lang.String)v20));
    Object v22 = java.util.Calendar.getInstance(((java.util.TimeZone)v19),((java.util.Locale)v21));
    Object v23 = -9L;
    Object v24 = new java.util.Date((((java.lang.Long)v23).longValue()));
    ((java.util.Calendar)v22).setTime(((java.util.Date)v24));
    Object v25 = null;
    Object v26 = 2;
    Object v27 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v22),(((java.lang.Integer)v26).intValue()));
    Object v28 = 0;
    Object v29 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = 0;
    ((java.util.Calendar)v29).clear((((java.lang.Integer)v30).intValue()));
    Object v31 = null;
    Object v32 = 2;
    Object v33 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v29),(((java.lang.Integer)v32).intValue()));
    Object v34 = org.apache.commons.lang.time.DateUtils.isSameInstant(((java.util.Calendar)v15),((java.util.Calendar)v33));
    org.junit.Assert.assertEquals((Object)(true), v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.time.DateUtils.addHours(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.Date)v3).getMonth();
    Object v5 = 1;
    Object v6 = org.apache.commons.lang.time.DateUtils.addMinutes(((java.util.Date)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = org.apache.commons.lang.time.DateUtils.round(((java.util.Date)v6),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 9;
    Object v15 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = -11;
    Object v17 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v16).intValue()));
    Object v18 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v17));
    Object v19 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v18));
    Object v20 = "uuml";
    Object v21 = new java.util.Locale(((java.lang.String)v20));
    Object v22 = java.util.Calendar.getInstance(((java.util.TimeZone)v19),((java.util.Locale)v21));
    Object v23 = -9L;
    Object v24 = new java.util.Date((((java.lang.Long)v23).longValue()));
    ((java.util.Calendar)v22).setTime(((java.util.Date)v24));
    Object v25 = null;
    Object v26 = 2;
    Object v27 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v22),(((java.lang.Integer)v26).intValue()));
    Object v28 = 0;
    Object v29 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = 9;
    Object v31 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = org.apache.commons.lang.time.DateUtils.isSameDay(((java.util.Calendar)v15),((java.util.Calendar)v31));
    org.junit.Assert.assertEquals((Object)(true), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 9;
    Object v15 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = 1;
    Object v17 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v15),(((java.lang.Integer)v16).intValue()));
    Object v18 = -11;
    Object v19 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v18).intValue()));
    Object v20 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v19));
    Object v21 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v20));
    Object v22 = "uuml";
    Object v23 = new java.util.Locale(((java.lang.String)v22));
    Object v24 = java.util.Calendar.getInstance(((java.util.TimeZone)v21),((java.util.Locale)v23));
    Object v25 = -9L;
    Object v26 = new java.util.Date((((java.lang.Long)v25).longValue()));
    ((java.util.Calendar)v24).setTime(((java.util.Date)v26));
    Object v27 = null;
    Object v28 = 2;
    Object v29 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v24),(((java.lang.Integer)v28).intValue()));
    Object v30 = 0;
    Object v31 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = 0;
    ((java.util.Calendar)v31).clear((((java.lang.Integer)v32).intValue()));
    Object v33 = null;
    Object v34 = 2;
    Object v35 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v31),(((java.lang.Integer)v34).intValue()));
    Object v36 = org.apache.commons.lang.time.DateUtils.isSameInstant(((java.util.Calendar)v17),((java.util.Calendar)v35));
    org.junit.Assert.assertEquals((Object)(true), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 6;
    Object v3 = org.apache.commons.lang.time.DateUtils.addHours(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 6;
    Object v3 = org.apache.commons.lang.time.DateUtils.addHours(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = -14;
    Object v5 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Date)v3),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 6;
    Object v3 = org.apache.commons.lang.time.DateUtils.addHours(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Date)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = -11;
    Object v15 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v14).intValue()));
    Object v16 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v15));
    Object v17 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v16));
    Object v18 = "uuml";
    Object v19 = new java.util.Locale(((java.lang.String)v18));
    Object v20 = java.util.Calendar.getInstance(((java.util.TimeZone)v17),((java.util.Locale)v19));
    Object v21 = -9L;
    Object v22 = new java.util.Date((((java.lang.Long)v21).longValue()));
    ((java.util.Calendar)v20).setTime(((java.util.Date)v22));
    Object v23 = null;
    Object v24 = 2;
    Object v25 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v20),(((java.lang.Integer)v24).intValue()));
    Object v26 = 0;
    Object v27 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = 9;
    Object v29 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = org.apache.commons.lang.time.DateUtils.isSameLocalTime(((java.util.Calendar)v13),((java.util.Calendar)v29));
    org.junit.Assert.assertEquals((Object)(true), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 6;
    Object v3 = org.apache.commons.lang.time.DateUtils.addHours(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 24;
    Object v5 = org.apache.commons.lang.time.DateUtils.addYears(((java.util.Date)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.DateUtils();
    Object v1 = 4;
    Object v2 = org.apache.commons.lang.time.DateUtils.iterator(((java.lang.Object)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.time.DateUtils.addHours(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.Date)v3).getMonth();
    Object v5 = 1;
    Object v6 = org.apache.commons.lang.time.DateUtils.addMinutes(((java.util.Date)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = org.apache.commons.lang.time.DateUtils.round(((java.util.Date)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Date)v8),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = org.apache.commons.lang.time.DateUtils.add(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang.time.DateUtils.addDays(((java.util.Date)v4),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 20;
    Object v3 = org.apache.commons.lang.time.DateUtils.iterator(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 6;
    Object v3 = org.apache.commons.lang.time.DateUtils.addHours(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = -9L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    Object v6 = 6;
    Object v7 = org.apache.commons.lang.time.DateUtils.addHours(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.lang.time.DateUtils.isSameDay(((java.util.Date)v3),((java.util.Date)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 9;
    Object v15 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = 34;
    Object v17 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v15),(((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "uuml";
    Object v1 = new java.util.Locale(((java.lang.String)v0));
    Object v2 = 20;
    Object v3 = org.apache.commons.lang.time.DateUtils.truncate(((java.lang.Object)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 1L;
    ((java.util.Date)v1).setTime((((java.lang.Long)v2).longValue()));
    Object v3 = null;
    Object v4 = 0;
    Object v5 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Date)v1),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 9;
    Object v15 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = 11;
    Object v17 = org.apache.commons.lang.time.DateUtils.iterator(((java.util.Calendar)v15),(((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    ((java.util.Calendar)v13).clear((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    Object v16 = 2;
    Object v17 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v13),(((java.lang.Integer)v16).intValue()));
    Object v18 = 0;
    Object v19 = 0;
    ((java.util.Calendar)v17).roll((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = -11;
    Object v22 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v21).intValue()));
    Object v23 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v22));
    Object v24 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v23));
    Object v25 = "uuml";
    Object v26 = new java.util.Locale(((java.lang.String)v25));
    Object v27 = java.util.Calendar.getInstance(((java.util.TimeZone)v24),((java.util.Locale)v26));
    Object v28 = -9L;
    Object v29 = new java.util.Date((((java.lang.Long)v28).longValue()));
    ((java.util.Calendar)v27).setTime(((java.util.Date)v29));
    Object v30 = null;
    Object v31 = 2;
    Object v32 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v27),(((java.lang.Integer)v31).intValue()));
    Object v33 = 0;
    Object v34 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v32),(((java.lang.Integer)v33).intValue()));
    Object v35 = org.apache.commons.lang.time.DateUtils.isSameInstant(((java.util.Calendar)v17),((java.util.Calendar)v34));
    org.junit.Assert.assertEquals((Object)(true), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 6;
    Object v3 = org.apache.commons.lang.time.DateUtils.addHours(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 24;
    Object v5 = org.apache.commons.lang.time.DateUtils.addYears(((java.util.Date)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = -9L;
    Object v7 = new java.util.Date((((java.lang.Long)v6).longValue()));
    Object v8 = 6;
    Object v9 = org.apache.commons.lang.time.DateUtils.addHours(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.apache.commons.lang.time.DateUtils.isSameInstant(((java.util.Date)v5),((java.util.Date)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    ((java.util.Calendar)v13).clear((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    Object v16 = 2;
    Object v17 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v13),(((java.lang.Integer)v16).intValue()));
    Object v18 = 0;
    Object v19 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v17),(((java.lang.Integer)v18).intValue()));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "9j22";
    Object v1 = new java.lang.String[]{"l","`"};
    Object v2 = org.apache.commons.lang.time.DateUtils.parseDate(((java.lang.String)v0),((java.lang.String[])v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "Windows";
    Object v1 = new java.lang.String[]{};
    Object v2 = org.apache.commons.lang.time.DateUtils.parseDate(((java.lang.String)v0),((java.lang.String[])v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 9;
    Object v15 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = 1;
    Object v17 = org.apache.commons.lang.time.DateUtils.iterator(((java.util.Calendar)v15),(((java.lang.Integer)v16).intValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 9;
    Object v15 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = new org.apache.commons.lang.time.DateUtils();
    Object v17 = ((java.util.Calendar)v15).equals(((java.lang.Object)v16));
    Object v18 = 24;
    Object v19 = org.apache.commons.lang.time.DateUtils.iterator(((java.util.Calendar)v15),(((java.lang.Integer)v18).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.time.DateUtils.addSeconds(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 7;
    Object v5 = org.apache.commons.lang.time.DateUtils.truncate(((java.lang.Object)v3),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = -1;
    Object v3 = org.apache.commons.lang.time.DateUtils.truncate(((java.lang.Object)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 9;
    Object v15 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = 0;
    Object v17 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v15),(((java.lang.Integer)v16).intValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    ((java.util.Calendar)v13).clear((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    Object v16 = 2;
    Object v17 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v13),(((java.lang.Integer)v16).intValue()));
    Object v18 = -11;
    Object v19 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v18).intValue()));
    Object v20 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v19));
    Object v21 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v20));
    Object v22 = "uuml";
    Object v23 = new java.util.Locale(((java.lang.String)v22));
    Object v24 = java.util.Calendar.getInstance(((java.util.TimeZone)v21),((java.util.Locale)v23));
    Object v25 = -9L;
    Object v26 = new java.util.Date((((java.lang.Long)v25).longValue()));
    ((java.util.Calendar)v24).setTime(((java.util.Date)v26));
    Object v27 = null;
    Object v28 = 2;
    Object v29 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v24),(((java.lang.Integer)v28).intValue()));
    Object v30 = 0;
    Object v31 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = 9;
    Object v33 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v31),(((java.lang.Integer)v32).intValue()));
    Object v34 = org.apache.commons.lang.time.DateUtils.isSameInstant(((java.util.Calendar)v17),((java.util.Calendar)v33));
    org.junit.Assert.assertEquals((Object)(true), v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 6;
    Object v3 = org.apache.commons.lang.time.DateUtils.addHours(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = -6;
    Object v5 = org.apache.commons.lang.time.DateUtils.round(((java.lang.Object)v3),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = org.apache.commons.lang.time.DateUtils.add(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -9L;
    Object v6 = new java.util.Date((((java.lang.Long)v5).longValue()));
    Object v7 = ((java.util.Date)v4).after(((java.util.Date)v6));
    Object v8 = -45;
    Object v9 = org.apache.commons.lang.time.DateUtils.addWeeks(((java.util.Date)v4),(((java.lang.Integer)v8).intValue()));
    Object v10 = -9;
    Object v11 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Date)v9),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "p";
    Object v1 = new java.lang.String[]{"","H"};
    Object v2 = org.apache.commons.lang.time.DateUtils.parseDate(((java.lang.String)v0),((java.lang.String[])v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.lang.String[]{"949"," 0 minutes","8629"};
    Object v2 = org.apache.commons.lang.time.DateUtils.parseDate(((java.lang.String)v0),((java.lang.String[])v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = -9L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = org.apache.commons.lang.time.DateUtils.add(((java.util.Date)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.lang.time.DateUtils.isSameInstant(((java.util.Date)v1),((java.util.Date)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 9;
    Object v15 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = 0;
    Object v17 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v15),(((java.lang.Integer)v16).intValue()));
    Object v18 = 0;
    Object v19 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v17),(((java.lang.Integer)v18).intValue()));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = ((java.util.Date)v1).getMonth();
    Object v3 = 2;
    Object v4 = org.apache.commons.lang.time.DateUtils.addMinutes(((java.util.Date)v1),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.time.DateUtils.addSeconds(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.Date)v3).getMonth();
    Object v5 = 21;
    Object v6 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Date)v3),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 1;
    Object v3 = org.apache.commons.lang.time.DateUtils.truncate(((java.lang.Object)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 6;
    Object v3 = org.apache.commons.lang.time.DateUtils.addHours(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = org.apache.commons.lang.time.DateUtils.addSeconds(((java.util.Date)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 6;
    Object v3 = org.apache.commons.lang.time.DateUtils.addHours(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = org.apache.commons.lang.time.DateUtils.addSeconds(((java.util.Date)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.util.Date)v5).getMinutes();
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    Object v9 = 6;
    Object v10 = org.apache.commons.lang.time.DateUtils.addHours(((java.util.Date)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = org.apache.commons.lang.time.DateUtils.isSameInstant(((java.util.Date)v5),((java.util.Date)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = -11;
    Object v1 = java.time.ZoneOffset.ofHours((((java.lang.Integer)v0).intValue()));
    Object v2 = java.time.ZoneId.from(((java.time.temporal.TemporalAccessor)v1));
    Object v3 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v2));
    Object v4 = "uuml";
    Object v5 = new java.util.Locale(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -9L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((java.util.Calendar)v6).setTime(((java.util.Date)v8));
    Object v9 = null;
    Object v10 = 2;
    Object v11 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v6),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = org.apache.commons.lang.time.DateUtils.round(((java.util.Calendar)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = 43;
    Object v17 = org.apache.commons.lang.time.DateUtils.truncate(((java.util.Calendar)v15),(((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 0;
    Object v3 = org.apache.commons.lang.time.DateUtils.round(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = -9L;
    Object v1 = new java.util.Date((((java.lang.Long)v0).longValue()));
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = org.apache.commons.lang.time.DateUtils.add(((java.util.Date)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -9L;
    Object v6 = new java.util.Date((((java.lang.Long)v5).longValue()));
    Object v7 = ((java.util.Date)v4).after(((java.util.Date)v6));
    Object v8 = -45;
    Object v9 = org.apache.commons.lang.time.DateUtils.addWeeks(((java.util.Date)v4),(((java.lang.Integer)v8).intValue()));
    Object v10 = 3;
    Object v11 = org.apache.commons.lang.time.DateUtils.iterator(((java.lang.Object)v9),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }
}
