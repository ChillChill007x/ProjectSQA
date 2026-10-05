package org.apache.commons.lang3.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = org.apache.commons.lang3.time.DateUtils.round(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -8;
    Object v7 = org.apache.commons.lang3.time.DateUtils.iterator(((java.lang.Object)v5),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = 0;
    Object v4 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(((java.util.Calendar)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = org.apache.commons.lang3.time.DateUtils.iterator(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = -30;
    Object v8 = 26;
    Object v9 = -7;
    Object v10 = -10;
    Object v11 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = org.apache.commons.lang3.time.DateUtils.isSameDay(((java.util.Date)v5),((java.util.Date)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = 0;
    Object v4 = org.apache.commons.lang3.time.DateUtils.iterator(((java.util.Calendar)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = 4;
    Object v4 = org.apache.commons.lang3.time.DateUtils.getFragmentInSeconds(((java.util.Calendar)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = 46;
    Object v4 = org.apache.commons.lang3.time.DateUtils.round(((java.lang.Object)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = java.time.ZoneId.systemDefault();
    Object v4 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v3));
    Object v5 = java.util.Calendar.getInstance(((java.util.TimeZone)v4));
    Object v6 = org.apache.commons.lang3.time.DateUtils.isSameInstant(((java.util.Calendar)v2),((java.util.Calendar)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = 0;
    ((java.util.Calendar)v2).setMinimalDaysInFirstWeek((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = -45;
    Object v6 = org.apache.commons.lang3.time.DateUtils.truncate(((java.util.Calendar)v2),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -1L;
    ((java.util.Date)v5).setTime((((java.lang.Long)v6).longValue()));
    Object v7 = null;
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.iterator(((java.util.Date)v5),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = -20;
    Object v9 = org.apache.commons.lang3.time.DateUtils.round(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = -30;
    Object v8 = 26;
    Object v9 = -7;
    Object v10 = -10;
    Object v11 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = -30;
    Object v16 = 26;
    Object v17 = -7;
    Object v18 = -10;
    Object v19 = new java.util.Date((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = 0;
    Object v21 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = 0;
    Object v23 = -30;
    Object v24 = 26;
    Object v25 = -7;
    Object v26 = -10;
    Object v27 = new java.util.Date((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = java.util.Map.of(((java.lang.Object)v5),((java.lang.Object)v13),((java.lang.Object)v21),((java.lang.Object)v27));
    Object v29 = -7;
    Object v30 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.lang.Object)v28),(((java.lang.Integer)v29).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = ((java.util.Calendar)v2).toInstant();
    Object v4 = 58;
    Object v5 = org.apache.commons.lang3.time.DateUtils.truncate(((java.util.Calendar)v2),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = java.time.ZoneId.systemDefault();
    Object v4 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v3));
    Object v5 = java.util.Calendar.getInstance(((java.util.TimeZone)v4));
    Object v6 = org.apache.commons.lang3.time.DateUtils.isSameDay(((java.util.Calendar)v2),((java.util.Calendar)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.util.Date)v7).hashCode();
    Object v9 = 0;
    Object v10 = -30;
    Object v11 = 26;
    Object v12 = -7;
    Object v13 = -10;
    Object v14 = new java.util.Date((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = 0;
    Object v16 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = 0;
    Object v18 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v16),(((java.lang.Integer)v17).intValue()));
    Object v19 = -1;
    Object v20 = org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(((java.util.Date)v7),((java.util.Date)v18),(((java.lang.Integer)v19).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = -45;
    Object v4 = org.apache.commons.lang3.time.DateUtils.round(((java.util.Calendar)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = 31;
    Object v3 = org.apache.commons.lang3.time.DateUtils.iterator(((java.lang.Object)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new java.lang.String[]{"-","L"};
    Object v2 = org.apache.commons.lang3.time.DateUtils.parseDateStrictly(((java.lang.String)v0),((java.lang.String[])v1));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = 26;
    Object v3 = org.apache.commons.lang3.time.DateUtils.truncate(((java.lang.Object)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.util.Date)v5).hashCode();
    Object v7 = -61;
    Object v8 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(((java.util.Date)v5),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = 5;
    Object v4 = org.apache.commons.lang3.time.DateUtils.truncate(((java.util.Calendar)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = org.apache.commons.lang3.time.DateUtils.addDays(((java.util.Date)v9),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.util.Date)v5).getTime();
    Object v7 = 0;
    Object v8 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.time.DateUtils.iterator(((java.util.Calendar)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = -30;
    Object v8 = 26;
    Object v9 = -7;
    Object v10 = -10;
    Object v11 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = org.apache.commons.lang3.time.DateUtils.isSameDay(((java.util.Date)v5),((java.util.Date)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 4;
    Object v9 = org.apache.commons.lang3.time.DateUtils.iterator(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = java.time.ZoneId.systemDefault();
    Object v4 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v3));
    Object v5 = java.util.Calendar.getInstance(((java.util.TimeZone)v4));
    Object v6 = -48;
    Object v7 = org.apache.commons.lang3.time.DateUtils.truncatedEquals(((java.util.Calendar)v2),((java.util.Calendar)v5),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = -30;
    Object v10 = 26;
    Object v11 = -7;
    Object v12 = -10;
    Object v13 = new java.util.Date((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = org.apache.commons.lang3.time.DateUtils.isSameInstant(((java.util.Date)v7),((java.util.Date)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = -30;
    Object v12 = 26;
    Object v13 = -7;
    Object v14 = -10;
    Object v15 = new java.util.Date((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = 19;
    Object v17 = org.apache.commons.lang3.time.DateUtils.truncatedEquals(((java.util.Date)v9),((java.util.Date)v15),(((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.util.Date)v5).getTime();
    Object v7 = 0;
    Object v8 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v7).intValue()));
    Object v9 = 20;
    Object v10 = org.apache.commons.lang3.time.DateUtils.truncate(((java.util.Date)v8),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.util.Date)v5).getHours();
    Object v7 = 0;
    Object v8 = -30;
    Object v9 = 26;
    Object v10 = -7;
    Object v11 = -10;
    Object v12 = new java.util.Date((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((java.util.Date)v12).getTime();
    Object v14 = 0;
    Object v15 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v12),(((java.lang.Integer)v14).intValue()));
    Object v16 = org.apache.commons.lang3.time.DateUtils.isSameInstant(((java.util.Date)v5),((java.util.Date)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Calendar)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = java.time.ZoneId.systemDefault();
    Object v4 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v3));
    Object v5 = java.util.Calendar.getInstance(((java.util.TimeZone)v4));
    Object v6 = ((java.util.Calendar)v5).getWeeksInWeekYear();
    Object v7 = 0;
    Object v8 = org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(((java.util.Calendar)v2),((java.util.Calendar)v5),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = 9;
    Object v3 = org.apache.commons.lang3.time.DateUtils.truncate(((java.lang.Object)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = -12;
    Object v4 = org.apache.commons.lang3.time.DateUtils.round(((java.lang.Object)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 19;
    Object v7 = org.apache.commons.lang3.time.DateUtils.setMonths(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = -30;
    Object v8 = 26;
    Object v9 = -7;
    Object v10 = -10;
    Object v11 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = 0;
    Object v17 = org.apache.commons.lang3.time.DateUtils.addDays(((java.util.Date)v15),(((java.lang.Integer)v16).intValue()));
    Object v18 = org.apache.commons.lang3.time.DateUtils.isSameInstant(((java.util.Date)v5),((java.util.Date)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = org.apache.commons.lang3.time.DateUtils.addMonths(((java.util.Date)v9),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = java.time.ZoneId.systemDefault();
    Object v4 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v3));
    Object v5 = java.util.Calendar.getInstance(((java.util.TimeZone)v4));
    Object v6 = false;
    ((java.util.Calendar)v5).setLenient((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = org.apache.commons.lang3.time.DateUtils.isSameDay(((java.util.Calendar)v2),((java.util.Calendar)v5));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = org.apache.commons.lang3.time.DateUtils.addMonths(((java.util.Date)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 3;
    Object v13 = org.apache.commons.lang3.time.DateUtils.addYears(((java.util.Date)v11),(((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = ((java.util.Calendar)v2).toInstant();
    Object v4 = -16;
    Object v5 = org.apache.commons.lang3.time.DateUtils.round(((java.util.Calendar)v2),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = java.util.Locale.getDefault();
    Object v1 = 55;
    Object v2 = org.apache.commons.lang3.time.DateUtils.iterator(((java.lang.Object)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "V\u0397";
    Object v1 = new java.lang.String[]{"Q"," has no clone methBd"};
    Object v2 = org.apache.commons.lang3.time.DateUtils.parseDate(((java.lang.String)v0),((java.lang.String[])v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.lang.Object)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = -30;
    Object v8 = 26;
    Object v9 = -7;
    Object v10 = -10;
    Object v11 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = 31;
    Object v17 = org.apache.commons.lang3.time.DateUtils.truncatedEquals(((java.util.Date)v5),((java.util.Date)v15),(((java.lang.Integer)v16).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = org.apache.commons.lang3.time.DateUtils.addMonths(((java.util.Date)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 3;
    Object v13 = org.apache.commons.lang3.time.DateUtils.addYears(((java.util.Date)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = -11;
    Object v15 = org.apache.commons.lang3.time.DateUtils.round(((java.util.Date)v13),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = java.time.ZoneId.systemDefault();
    Object v4 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v3));
    Object v5 = java.util.Calendar.getInstance(((java.util.TimeZone)v4));
    Object v6 = org.apache.commons.lang3.time.DateUtils.isSameLocalTime(((java.util.Calendar)v2),((java.util.Calendar)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = -25;
    Object v9 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = -45;
    Object v4 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Calendar)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = org.apache.commons.lang3.time.DateUtils.addMonths(((java.util.Date)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v11),(((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.util.Date)v5).getTime();
    Object v7 = 0;
    Object v8 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(((java.util.Date)v8),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.util.Date)v5).getTime();
    Object v7 = 0;
    Object v8 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v7).intValue()));
    Object v9 = 18;
    Object v10 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(((java.util.Date)v8),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = java.time.ZoneId.systemDefault();
    Object v4 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v3));
    Object v5 = java.util.Calendar.getInstance(((java.util.TimeZone)v4));
    Object v6 = 10;
    Object v7 = org.apache.commons.lang3.time.DateUtils.truncatedEquals(((java.util.Calendar)v2),((java.util.Calendar)v5),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = org.apache.commons.lang3.time.DateUtils.addMonths(((java.util.Date)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = org.apache.commons.lang3.time.DateUtils.addHours(((java.util.Date)v11),(((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = java.time.ZoneId.systemDefault();
    Object v4 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v3));
    Object v5 = java.util.Calendar.getInstance(((java.util.TimeZone)v4));
    Object v6 = 1;
    ((java.util.Calendar)v5).clear((((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = org.apache.commons.lang3.time.DateUtils.isSameLocalTime(((java.util.Calendar)v2),((java.util.Calendar)v5));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = -3;
    Object v3 = org.apache.commons.lang3.time.DateUtils.truncate(((java.lang.Object)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = -4;
    Object v11 = org.apache.commons.lang3.time.DateUtils.truncate(((java.util.Date)v9),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = org.apache.commons.lang3.time.DateUtils.addMonths(((java.util.Date)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(((java.util.Date)v11),(((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertEquals((Object)(1L), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = 0;
    Object v4 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Calendar)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = org.apache.commons.lang3.time.DateUtils.addDays(((java.util.Date)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v11),(((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = 18;
    Object v4 = org.apache.commons.lang3.time.DateUtils.getFragmentInHours(((java.util.Calendar)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = -3;
    Object v4 = org.apache.commons.lang3.time.DateUtils.iterator(((java.util.Calendar)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = org.apache.commons.lang3.time.DateUtils.addMonths(((java.util.Date)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = org.apache.commons.lang3.time.DateUtils.addHours(((java.util.Date)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = -30;
    Object v16 = 26;
    Object v17 = -7;
    Object v18 = -10;
    Object v19 = new java.util.Date((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = 0;
    Object v21 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = 0;
    Object v23 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = 0;
    Object v25 = org.apache.commons.lang3.time.DateUtils.addMonths(((java.util.Date)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = 1;
    Object v27 = org.apache.commons.lang3.time.DateUtils.truncatedEquals(((java.util.Date)v13),((java.util.Date)v25),(((java.lang.Integer)v26).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = org.apache.commons.lang3.time.DateUtils.addMonths(((java.util.Date)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.apache.commons.lang3.time.DateUtils.toCalendar(((java.util.Date)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = org.apache.commons.lang3.time.DateUtils.addMonths(((java.util.Date)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = org.apache.commons.lang3.time.DateUtils.addHours(((java.util.Date)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = -8;
    Object v15 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v13),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = org.apache.commons.lang3.time.DateUtils.addMonths(((java.util.Date)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = -30;
    Object v14 = 26;
    Object v15 = -7;
    Object v16 = -10;
    Object v17 = new java.util.Date((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = 0;
    Object v19 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = 0;
    Object v21 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = 0;
    Object v23 = org.apache.commons.lang3.time.DateUtils.addMonths(((java.util.Date)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = 1;
    Object v25 = org.apache.commons.lang3.time.DateUtils.addHours(((java.util.Date)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = 1;
    ((java.util.Date)v25).setDate((((java.lang.Integer)v26).intValue()));
    Object v27 = null;
    Object v28 = 0;
    Object v29 = org.apache.commons.lang3.time.DateUtils.truncatedEquals(((java.util.Date)v11),((java.util.Date)v25),(((java.lang.Integer)v28).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = java.util.Locale.getDefault();
    Object v1 = -91;
    Object v2 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.lang.Object)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = org.apache.commons.lang3.time.DateUtils.addMonths(((java.util.Date)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = -30;
    Object v14 = 26;
    Object v15 = -7;
    Object v16 = -10;
    Object v17 = new java.util.Date((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = 0;
    Object v19 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = 0;
    Object v21 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = 0;
    Object v23 = org.apache.commons.lang3.time.DateUtils.addDays(((java.util.Date)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = 0;
    Object v25 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = org.apache.commons.lang3.time.DateUtils.isSameDay(((java.util.Date)v11),((java.util.Date)v25));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -31;
    Object v7 = org.apache.commons.lang3.time.DateUtils.getFragmentInDays(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 27;
    Object v7 = org.apache.commons.lang3.time.DateUtils.addMinutes(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = -30;
    Object v8 = 26;
    Object v9 = -7;
    Object v10 = -10;
    Object v11 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = -30;
    Object v16 = 26;
    Object v17 = -7;
    Object v18 = -10;
    Object v19 = new java.util.Date((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = 0;
    Object v21 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = 0;
    Object v23 = -30;
    Object v24 = 26;
    Object v25 = -7;
    Object v26 = -10;
    Object v27 = new java.util.Date((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = java.util.Map.of(((java.lang.Object)v5),((java.lang.Object)v13),((java.lang.Object)v21),((java.lang.Object)v27));
    Object v29 = 0;
    Object v30 = org.apache.commons.lang3.time.DateUtils.round(((java.lang.Object)v28),(((java.lang.Integer)v29).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = org.apache.commons.lang3.time.DateUtils.addMonths(((java.util.Date)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 3;
    Object v13 = org.apache.commons.lang3.time.DateUtils.addYears(((java.util.Date)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = org.apache.commons.lang3.time.DateUtils.setDays(((java.util.Date)v13),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = org.apache.commons.lang3.time.DateUtils.addDays(((java.util.Date)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = org.apache.commons.lang3.time.DateUtils.setMilliseconds(((java.util.Date)v13),(((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.util.Date)v5).getTime();
    Object v7 = 0;
    Object v8 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = org.apache.commons.lang3.time.DateUtils.addYears(((java.util.Date)v8),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = 0;
    Object v4 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Calendar)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = 2;
    Object v6 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(((java.util.Calendar)v4),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(86400000L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = 4;
    Object v4 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.lang.Object)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.lang3.time.DateUtils.iterator(((java.lang.Object)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = 0;
    Object v4 = org.apache.commons.lang3.time.DateUtils.round(((java.util.Calendar)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = java.util.Locale.getDefault();
    Object v1 = 14;
    Object v2 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.lang.Object)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = -20;
    Object v4 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Calendar)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = -22;
    Object v11 = org.apache.commons.lang3.time.DateUtils.iterator(((java.util.Date)v9),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = org.apache.commons.lang3.time.DateUtils.addMonths(((java.util.Date)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 2;
    Object v13 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = org.apache.commons.lang3.time.DateUtils.iterator(((java.util.Date)v13),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = java.time.ZoneId.systemDefault();
    Object v4 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v3));
    Object v5 = java.util.Calendar.getInstance(((java.util.TimeZone)v4));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Calendar)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.lang3.time.DateUtils.isSameDay(((java.util.Calendar)v2),((java.util.Calendar)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = java.time.ZoneId.systemDefault();
    Object v4 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v3));
    Object v5 = java.util.Calendar.getInstance(((java.util.TimeZone)v4));
    Object v6 = org.apache.commons.lang3.time.DateUtils.isSameLocalTime(((java.util.Calendar)v2),((java.util.Calendar)v5));
    Object v7 = 1;
    Object v8 = org.apache.commons.lang3.time.DateUtils.iterator(((java.lang.Object)v6),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = org.apache.commons.lang3.time.DateUtils.addDays(((java.util.Date)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 0;
    Object v13 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = org.apache.commons.lang3.time.DateUtils.getFragmentInMinutes(((java.util.Date)v13),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = org.apache.commons.lang3.time.DateUtils.addMonths(((java.util.Date)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = org.apache.commons.lang3.time.DateUtils.setMonths(((java.util.Date)v11),(((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = java.time.ZoneId.systemDefault();
    Object v4 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v3));
    Object v5 = java.util.Calendar.getInstance(((java.util.TimeZone)v4));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.truncatedCompareTo(((java.util.Calendar)v2),((java.util.Calendar)v5),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = org.apache.commons.lang3.time.DateUtils.addMonths(((java.util.Date)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = org.apache.commons.lang3.time.DateUtils.setMonths(((java.util.Date)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 20;
    Object v15 = org.apache.commons.lang3.time.DateUtils.round(((java.util.Date)v13),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = 25;
    Object v4 = org.apache.commons.lang3.time.DateUtils.round(((java.util.Calendar)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addWeeks(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = org.apache.commons.lang3.time.DateUtils.addMonths(((java.util.Date)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = org.apache.commons.lang3.time.DateUtils.addHours(((java.util.Date)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = 6;
    Object v15 = org.apache.commons.lang3.time.DateUtils.truncate(((java.util.Date)v13),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = ((java.util.Calendar)v2).getTime();
    Object v4 = -28;
    Object v5 = org.apache.commons.lang3.time.DateUtils.truncate(((java.util.Calendar)v2),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Calendar)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = 33;
    Object v6 = org.apache.commons.lang3.time.DateUtils.iterator(((java.util.Calendar)v4),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 0;
    Object v1 = -30;
    Object v2 = 26;
    Object v3 = -7;
    Object v4 = -10;
    Object v5 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 27;
    Object v7 = org.apache.commons.lang3.time.DateUtils.addMinutes(((java.util.Date)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = org.apache.commons.lang3.time.DateUtils.addMilliseconds(((java.util.Date)v7),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = java.time.ZoneId.systemDefault();
    Object v4 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v3));
    Object v5 = java.util.Calendar.getInstance(((java.util.TimeZone)v4));
    Object v6 = ((java.util.Calendar)v2).compareTo(((java.util.Calendar)v5));
    Object v7 = -58;
    Object v8 = org.apache.commons.lang3.time.DateUtils.getFragmentInMilliseconds(((java.util.Calendar)v2),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = 33;
    Object v3 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.lang.Object)v1),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.time.DateUtils.truncate(((java.lang.Object)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = java.time.ZoneId.systemDefault();
    Object v1 = java.util.TimeZone.getTimeZone(((java.time.ZoneId)v0));
    Object v2 = java.util.Calendar.getInstance(((java.util.TimeZone)v1));
    Object v3 = 0;
    Object v4 = org.apache.commons.lang3.time.DateUtils.ceiling(((java.util.Calendar)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.util.Calendar)v4).getTime();
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.time.DateUtils.round(((java.util.Calendar)v4),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }
}
