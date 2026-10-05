package org.joda.time.chrono;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -6L;
    Object v10 = 1;
    Object v11 = 27;
    Object v12 = -20;
    Object v13 = -27;
    Object v14 = ((org.joda.time.chrono.AssembledChronology)v8).getDateTimeMillis((((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = 28L;
    Object v11 = "Chronology must not /e null";
    Object v12 = "The datetime zone must ";
    Object v13 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.joda.time.DateTimeZone)v9).getName((((java.lang.Long)v10).longValue()),((java.util.Locale)v13));
    Object v15 = 1L;
    Object v16 = 1;
    Object v17 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),(((java.lang.Long)v15).longValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v17));
    Object v19 = 26L;
    Object v20 = ((org.joda.time.chrono.BaseChronology)v8).get(((org.joda.time.ReadablePartial)v18),(((java.lang.Long)v19).longValue()));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = 28L;
    Object v11 = "Chronology must not /e null";
    Object v12 = "The datetime zone must ";
    Object v13 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.joda.time.DateTimeZone)v9).getName((((java.lang.Long)v10).longValue()),((java.util.Locale)v13));
    Object v15 = 1L;
    Object v16 = 1;
    Object v17 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),(((java.lang.Long)v15).longValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v17));
    Object v19 = org.joda.time.DateTimeZone.getDefault();
    Object v20 = 28L;
    Object v21 = "Chronology must not /e null";
    Object v22 = "The datetime zone must ";
    Object v23 = new java.util.Locale(((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = ((org.joda.time.DateTimeZone)v19).getName((((java.lang.Long)v20).longValue()),((java.util.Locale)v23));
    Object v25 = 1L;
    Object v26 = 1;
    Object v27 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v19),(((java.lang.Long)v25).longValue()),(((java.lang.Integer)v26).intValue()));
    Object v28 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v27));
    Object v29 = org.joda.time.Minutes.minutesBetween(((org.joda.time.ReadablePartial)v18),((org.joda.time.ReadablePartial)v28));
    Object v30 = -27L;
    Object v31 = -22L;
    Object v32 = ((org.joda.time.chrono.BaseChronology)v8).get(((org.joda.time.ReadablePeriod)v29),(((java.lang.Long)v30).longValue()),(((java.lang.Long)v31).longValue()));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.DateTimeZone.getDefault();
    Object v9 = 28L;
    Object v10 = "Chronology must not /e null";
    Object v11 = "The datetime zone must ";
    Object v12 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.joda.time.DateTimeZone)v8).getName((((java.lang.Long)v9).longValue()),((java.util.Locale)v12));
    Object v14 = 1L;
    Object v15 = 1;
    Object v16 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v8),(((java.lang.Long)v14).longValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v16));
    Object v18 = org.joda.time.DateTimeZone.getDefault();
    Object v19 = 28L;
    Object v20 = "Chronology must not /e null";
    Object v21 = "The datetime zone must ";
    Object v22 = new java.util.Locale(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = ((org.joda.time.DateTimeZone)v18).getName((((java.lang.Long)v19).longValue()),((java.util.Locale)v22));
    Object v24 = 1L;
    Object v25 = 1;
    Object v26 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v18),(((java.lang.Long)v24).longValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v26));
    Object v28 = org.joda.time.Minutes.minutesBetween(((org.joda.time.ReadablePartial)v17),((org.joda.time.ReadablePartial)v27));
    Object v29 = java.util.List.of();
    Object v30 = ((org.joda.time.ReadablePeriod)v28).equals(((java.lang.Object)v29));
    Object v31 = 1L;
    Object v32 = ((org.joda.time.chrono.BaseChronology)v7).get(((org.joda.time.ReadablePeriod)v28),(((java.lang.Long)v31).longValue()));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 33L;
    Object v9 = 26;
    Object v10 = 27;
    Object v11 = 1;
    Object v12 = -61;
    Object v13 = ((org.joda.time.chrono.AssembledChronology)v7).getDateTimeMillis((((java.lang.Long)v8).longValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.DateTimeZone.getDefault();
    Object v9 = 28L;
    Object v10 = "Chronology must not /e null";
    Object v11 = "The datetime zone must ";
    Object v12 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.joda.time.DateTimeZone)v8).getName((((java.lang.Long)v9).longValue()),((java.util.Locale)v12));
    Object v14 = 1L;
    Object v15 = 1;
    Object v16 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v8),(((java.lang.Long)v14).longValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v16));
    Object v18 = org.joda.time.DateTimeZone.getDefault();
    Object v19 = 28L;
    Object v20 = "Chronology must not /e null";
    Object v21 = "The datetime zone must ";
    Object v22 = new java.util.Locale(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = ((org.joda.time.DateTimeZone)v18).getName((((java.lang.Long)v19).longValue()),((java.util.Locale)v22));
    Object v24 = 1L;
    Object v25 = 1;
    Object v26 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v18),(((java.lang.Long)v24).longValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v26));
    Object v28 = org.joda.time.Minutes.minutesBetween(((org.joda.time.ReadablePartial)v17),((org.joda.time.ReadablePartial)v27));
    Object v29 = 3L;
    Object v30 = 0;
    Object v31 = ((org.joda.time.chrono.BaseChronology)v7).add(((org.joda.time.ReadablePeriod)v28),(((java.lang.Long)v29).longValue()),(((java.lang.Integer)v30).intValue()));
    org.junit.Assert.assertEquals((Object)(3L), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = ((org.joda.time.DateTimeZone)v0).hashCode();
    Object v2 = 3L;
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = new org.joda.time.DateTime((((java.lang.Long)v2).longValue()),((org.joda.time.DateTimeZone)v3));
    Object v5 = -4;
    Object v6 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v4),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.chrono.GJChronology)v7).getZone();
    Object v9 = ((org.joda.time.chrono.GJChronology)v7).getZone();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.DateTimeZone.getDefault();
    Object v9 = 1L;
    Object v10 = ((org.joda.time.DateTimeZone)v8).getNameKey((((java.lang.Long)v9).longValue()));
    Object v11 = 3L;
    Object v12 = org.joda.time.DateTimeZone.getDefault();
    Object v13 = new org.joda.time.DateTime((((java.lang.Long)v11).longValue()),((org.joda.time.DateTimeZone)v12));
    Object v14 = 2;
    Object v15 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v8),((org.joda.time.ReadableInstant)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.joda.time.chrono.GJChronology)v15).getZone();
    Object v17 = ((org.joda.time.chrono.GJChronology)v15).getZone();
    Object v18 = ((org.joda.time.chrono.GJChronology)v7).equals(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.AssembledChronology)v8).millisOfSecond();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.DateTimeZone.getDefault();
    Object v9 = 28L;
    Object v10 = "Chronology must not /e null";
    Object v11 = "The datetime zone must ";
    Object v12 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.joda.time.DateTimeZone)v8).getName((((java.lang.Long)v9).longValue()),((java.util.Locale)v12));
    Object v14 = 1L;
    Object v15 = 1;
    Object v16 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v8),(((java.lang.Long)v14).longValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v16));
    Object v18 = ((org.joda.time.ReadablePartial)v17).hashCode();
    Object v19 = 0L;
    Object v20 = ((org.joda.time.chrono.BaseChronology)v7).set(((org.joda.time.ReadablePartial)v17),(((java.lang.Long)v19).longValue()));
    org.junit.Assert.assertEquals((Object)(-38278626L), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = -32;
    Object v9 = -35;
    Object v10 = 8;
    Object v11 = 46;
    Object v12 = 4;
    Object v13 = 1;
    Object v14 = 53;
    Object v15 = ((org.joda.time.chrono.GJChronology)v7).getDateTimeMillis((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.chrono.AssembledChronology)v7).halfdayOfDay();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.chrono.GJChronology)v7).toString();
    Object v9 = 1L;
    Object v10 = ((org.joda.time.chrono.GJChronology)v7).gregorianToJulianByWeekyear((((java.lang.Long)v9).longValue()));
    org.junit.Assert.assertEquals((Object)(1209600001L), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getNameKey((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 2;
    Object v16 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v18 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v19 = ((org.joda.time.chrono.GJChronology)v8).withZone(((org.joda.time.DateTimeZone)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 8L;
    Object v10 = ((org.joda.time.chrono.GJChronology)v8).julianToGregorianByWeekyear((((java.lang.Long)v9).longValue()));
    org.junit.Assert.assertEquals((Object)(-1209599992L), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = -27;
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = -40;
    Object v12 = ((org.joda.time.chrono.GJChronology)v7).getDateTimeMillis((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.chrono.AssembledChronology)v7).weekyear();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getNameKey((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 2;
    Object v16 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v18 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v19 = ((org.joda.time.chrono.GJChronology)v8).withZone(((org.joda.time.DateTimeZone)v18));
    Object v20 = ((org.joda.time.chrono.GJChronology)v19).getZone();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getNameKey((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 2;
    Object v16 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v18 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v19 = ((org.joda.time.chrono.GJChronology)v8).withZone(((org.joda.time.DateTimeZone)v18));
    Object v20 = ((org.joda.time.chrono.AssembledChronology)v19).secondOfDay();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getNameKey((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 2;
    Object v16 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v18 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v19 = ((org.joda.time.chrono.GJChronology)v8).withZone(((org.joda.time.DateTimeZone)v18));
    Object v20 = new org.joda.time.chrono.AssembledChronology.Fields();
    Object v21 = org.joda.time.DateTimeZone.getDefault();
    Object v22 = 1L;
    Object v23 = ((org.joda.time.DateTimeZone)v21).getNameKey((((java.lang.Long)v22).longValue()));
    Object v24 = 3L;
    Object v25 = org.joda.time.DateTimeZone.getDefault();
    Object v26 = new org.joda.time.DateTime((((java.lang.Long)v24).longValue()),((org.joda.time.DateTimeZone)v25));
    Object v27 = 2;
    Object v28 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v21),((org.joda.time.ReadableInstant)v26),(((java.lang.Integer)v27).intValue()));
    ((org.joda.time.chrono.AssembledChronology.Fields)v20).copyFieldsFrom(((org.joda.time.Chronology)v28));
    Object v29 = null;
    ((org.joda.time.chrono.GJChronology)v19).assemble(((org.joda.time.chrono.AssembledChronology.Fields)v20));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.chrono.GJChronology)v7).toString();
    org.junit.Assert.assertEquals((Object)("GJChronology[America/Los_Angeles,cutover=1970-01-01T00:00:00.003Z,mdfw=2]"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getNameKey((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 2;
    Object v16 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v18 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v19 = ((org.joda.time.chrono.GJChronology)v8).withZone(((org.joda.time.DateTimeZone)v18));
    Object v20 = ((org.joda.time.chrono.GJChronology)v19).getMinimumDaysInFirstWeek();
    org.junit.Assert.assertEquals((Object)(1), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.chrono.AssembledChronology)v7).getZone();
    Object v9 = ((org.joda.time.chrono.AssembledChronology)v7).months();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getNameKey((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 2;
    Object v16 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v18 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v19 = ((org.joda.time.chrono.GJChronology)v8).withZone(((org.joda.time.DateTimeZone)v18));
    Object v20 = ((org.joda.time.chrono.AssembledChronology)v19).weeks();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.chrono.GJChronology)v7).getZone();
    Object v9 = ((org.joda.time.chrono.GJChronology)v7).getZone();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getOffset((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 3L;
    Object v16 = org.joda.time.DateTimeZone.getDefault();
    Object v17 = new org.joda.time.DateTime((((java.lang.Long)v15).longValue()),((org.joda.time.DateTimeZone)v16));
    Object v18 = ((org.joda.time.ReadableInstant)v14).isBefore(((org.joda.time.ReadableInstant)v17));
    Object v19 = 1;
    Object v20 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v19).intValue()));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.chrono.GJChronology)v7).getMinimumDaysInFirstWeek();
    Object v9 = ((org.joda.time.chrono.GJChronology)v7).toString();
    org.junit.Assert.assertEquals((Object)("GJChronology[America/Los_Angeles,cutover=1970-01-01T00:00:00.003Z,mdfw=2]"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getNameKey((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 2;
    Object v16 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v18 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v19 = ((org.joda.time.chrono.GJChronology)v8).withZone(((org.joda.time.DateTimeZone)v18));
    Object v20 = ((org.joda.time.chrono.BaseChronology)v19).withUTC();
    Object v21 = ((org.joda.time.chrono.AssembledChronology)v19).weeks();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.chrono.GJChronology)v7).getZone();
    Object v9 = ((org.joda.time.chrono.GJChronology)v7).getZone();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getOffset((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 3L;
    Object v16 = org.joda.time.DateTimeZone.getDefault();
    Object v17 = new org.joda.time.DateTime((((java.lang.Long)v15).longValue()),((org.joda.time.DateTimeZone)v16));
    Object v18 = ((org.joda.time.ReadableInstant)v14).isBefore(((org.joda.time.ReadableInstant)v17));
    Object v19 = 1;
    Object v20 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v19).intValue()));
    Object v21 = org.joda.time.DateTimeZone.getDefault();
    Object v22 = 28L;
    Object v23 = "Chronology must not /e null";
    Object v24 = "The datetime zone must ";
    Object v25 = new java.util.Locale(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = ((org.joda.time.DateTimeZone)v21).getName((((java.lang.Long)v22).longValue()),((java.util.Locale)v25));
    Object v27 = 1L;
    Object v28 = 1;
    Object v29 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v21),(((java.lang.Long)v27).longValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v29));
    Object v31 = -28L;
    Object v32 = ((org.joda.time.chrono.BaseChronology)v20).set(((org.joda.time.ReadablePartial)v30),(((java.lang.Long)v31).longValue()));
    org.junit.Assert.assertEquals((Object)(-38278575L), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getNameKey((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 2;
    Object v16 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v18 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v19 = ((org.joda.time.chrono.GJChronology)v8).withZone(((org.joda.time.DateTimeZone)v18));
    Object v20 = ((org.joda.time.chrono.AssembledChronology)v19).centuryOfEra();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.chrono.GJChronology)v7).getZone();
    Object v9 = ((org.joda.time.chrono.GJChronology)v7).getZone();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getOffset((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 3L;
    Object v16 = org.joda.time.DateTimeZone.getDefault();
    Object v17 = new org.joda.time.DateTime((((java.lang.Long)v15).longValue()),((org.joda.time.DateTimeZone)v16));
    Object v18 = ((org.joda.time.ReadableInstant)v14).isBefore(((org.joda.time.ReadableInstant)v17));
    Object v19 = 1;
    Object v20 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.joda.time.chrono.AssembledChronology)v20).dayOfWeek();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getNameKey((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 2;
    Object v16 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v18 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v19 = ((org.joda.time.chrono.GJChronology)v8).withZone(((org.joda.time.DateTimeZone)v18));
    Object v20 = org.joda.time.DateTimeZone.getDefault();
    Object v21 = 1L;
    Object v22 = ((org.joda.time.DateTimeZone)v20).getNameKey((((java.lang.Long)v21).longValue()));
    Object v23 = 3L;
    Object v24 = org.joda.time.DateTimeZone.getDefault();
    Object v25 = new org.joda.time.DateTime((((java.lang.Long)v23).longValue()),((org.joda.time.DateTimeZone)v24));
    Object v26 = 2;
    Object v27 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v20),((org.joda.time.ReadableInstant)v25),(((java.lang.Integer)v26).intValue()));
    Object v28 = ((org.joda.time.chrono.GJChronology)v27).getZone();
    Object v29 = ((org.joda.time.chrono.GJChronology)v27).getZone();
    Object v30 = ((org.joda.time.chrono.GJChronology)v19).withZone(((org.joda.time.DateTimeZone)v29));
    Object v31 = ((org.joda.time.chrono.GJChronology)v19).getZone();
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = 26;
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = ((org.joda.time.chrono.GJChronology)v7).getDateTimeMillis((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.chrono.GJChronology)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(192662116), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.chrono.AssembledChronology)v7).years();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.chrono.GJChronology)v7).getZone();
    Object v9 = ((org.joda.time.chrono.GJChronology)v7).getZone();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getOffset((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 3L;
    Object v16 = org.joda.time.DateTimeZone.getDefault();
    Object v17 = new org.joda.time.DateTime((((java.lang.Long)v15).longValue()),((org.joda.time.DateTimeZone)v16));
    Object v18 = ((org.joda.time.ReadableInstant)v14).isBefore(((org.joda.time.ReadableInstant)v17));
    Object v19 = 1;
    Object v20 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.joda.time.chrono.AssembledChronology)v20).clockhourOfHalfday();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = org.joda.time.DateTimeZone.getDefault();
    Object v2 = 28L;
    Object v3 = "Chronology must not /e null";
    Object v4 = "The datetime zone must ";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.DateTimeZone)v1).getName((((java.lang.Long)v2).longValue()),((java.util.Locale)v5));
    Object v7 = 1L;
    Object v8 = 1;
    Object v9 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Long)v7).longValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v9));
    Object v11 = new int[]{-4,1};
    ((org.joda.time.chrono.BaseChronology)v0).validate(((org.joda.time.ReadablePartial)v10),((int[])v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = org.joda.time.DateTimeZone.getDefault();
    Object v2 = 28L;
    Object v3 = "Chronology must not /e null";
    Object v4 = "The datetime zone must ";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.DateTimeZone)v1).getName((((java.lang.Long)v2).longValue()),((java.util.Locale)v5));
    Object v7 = 1L;
    Object v8 = 1;
    Object v9 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Long)v7).longValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v9));
    Object v11 = org.joda.time.DateTimeZone.getDefault();
    Object v12 = 28L;
    Object v13 = "Chronology must not /e null";
    Object v14 = "The datetime zone must ";
    Object v15 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((org.joda.time.DateTimeZone)v11).getName((((java.lang.Long)v12).longValue()),((java.util.Locale)v15));
    Object v17 = 1L;
    Object v18 = 1;
    Object v19 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v11),(((java.lang.Long)v17).longValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v19));
    Object v21 = org.joda.time.Minutes.minutesBetween(((org.joda.time.ReadablePartial)v10),((org.joda.time.ReadablePartial)v20));
    Object v22 = ((org.joda.time.ReadablePeriod)v21).hashCode();
    Object v23 = -10L;
    Object v24 = 0L;
    Object v25 = ((org.joda.time.chrono.BaseChronology)v0).get(((org.joda.time.ReadablePeriod)v21),(((java.lang.Long)v23).longValue()),(((java.lang.Long)v24).longValue()));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.chrono.GJChronology)v7).getZone();
    Object v9 = ((org.joda.time.chrono.GJChronology)v7).getZone();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getOffset((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 3L;
    Object v16 = org.joda.time.DateTimeZone.getDefault();
    Object v17 = new org.joda.time.DateTime((((java.lang.Long)v15).longValue()),((org.joda.time.DateTimeZone)v16));
    Object v18 = ((org.joda.time.ReadableInstant)v14).isBefore(((org.joda.time.ReadableInstant)v17));
    Object v19 = 1;
    Object v20 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v19).intValue()));
    Object v21 = 38;
    Object v22 = 0;
    Object v23 = -37;
    Object v24 = -23;
    Object v25 = ((org.joda.time.chrono.GJChronology)v20).getDateTimeMillis((((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = 1;
    Object v2 = 23;
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = -10;
    Object v6 = 24;
    Object v7 = -1;
    Object v8 = ((org.joda.time.chrono.GJChronology)v0).getDateTimeMillis((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.chrono.GJChronology)v7).getZone();
    Object v9 = ((org.joda.time.chrono.GJChronology)v7).getZone();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getOffset((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 3L;
    Object v16 = org.joda.time.DateTimeZone.getDefault();
    Object v17 = new org.joda.time.DateTime((((java.lang.Long)v15).longValue()),((org.joda.time.DateTimeZone)v16));
    Object v18 = ((org.joda.time.ReadableInstant)v14).isBefore(((org.joda.time.ReadableInstant)v17));
    Object v19 = 1;
    Object v20 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.joda.time.chrono.AssembledChronology)v20).halfdays();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getNameKey((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 2;
    Object v16 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v18 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v19 = ((org.joda.time.chrono.GJChronology)v8).withZone(((org.joda.time.DateTimeZone)v18));
    Object v20 = ((org.joda.time.chrono.GJChronology)v19).getZone();
    Object v21 = 0L;
    Object v22 = "Chronology must not /e null";
    Object v23 = "The datetime zone must ";
    Object v24 = new java.util.Locale(((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = ((org.joda.time.DateTimeZone)v20).getShortName((((java.lang.Long)v21).longValue()),((java.util.Locale)v24));
    Object v26 = 1L;
    Object v27 = 48;
    Object v28 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v20),(((java.lang.Long)v26).longValue()),(((java.lang.Integer)v27).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.AssembledChronology.Fields();
    Object v2 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    ((org.joda.time.chrono.AssembledChronology.Fields)v1).copyFieldsFrom(((org.joda.time.Chronology)v2));
    Object v3 = null;
    ((org.joda.time.chrono.GJChronology)v0).assemble(((org.joda.time.chrono.AssembledChronology.Fields)v1));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = ((org.joda.time.chrono.BaseChronology)v0).toString();
    Object v2 = ((org.joda.time.chrono.AssembledChronology)v0).year();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = org.joda.time.DateTimeZone.getDefault();
    Object v2 = 28L;
    Object v3 = "Chronology must not /e null";
    Object v4 = "The datetime zone must ";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.DateTimeZone)v1).getName((((java.lang.Long)v2).longValue()),((java.util.Locale)v5));
    Object v7 = 1L;
    Object v8 = 1;
    Object v9 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Long)v7).longValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v9));
    Object v11 = 3L;
    Object v12 = ((org.joda.time.chrono.BaseChronology)v0).get(((org.joda.time.ReadablePartial)v10),(((java.lang.Long)v11).longValue()));
    Object v13 = ((org.joda.time.chrono.GJChronology)v0).getZone();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = ((org.joda.time.chrono.GJChronology)v0).getMinimumDaysInFirstWeek();
    org.junit.Assert.assertEquals((Object)(4), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.AssembledChronology.Fields();
    ((org.joda.time.chrono.GJChronology)v0).assemble(((org.joda.time.chrono.AssembledChronology.Fields)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = org.joda.time.DateTimeZone.getDefault();
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getNameKey((((java.lang.Long)v2).longValue()));
    Object v4 = 3L;
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 2;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1),((org.joda.time.ReadableInstant)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v8).getZone();
    Object v10 = ((org.joda.time.chrono.GJChronology)v8).getZone();
    Object v11 = ((org.joda.time.chrono.BaseChronology)v0).withZone(((org.joda.time.DateTimeZone)v10));
    Object v12 = org.joda.time.DateTimeZone.getDefault();
    Object v13 = 28L;
    Object v14 = "Chronology must not /e null";
    Object v15 = "The datetime zone must ";
    Object v16 = new java.util.Locale(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((org.joda.time.DateTimeZone)v12).getName((((java.lang.Long)v13).longValue()),((java.util.Locale)v16));
    Object v18 = 1L;
    Object v19 = 1;
    Object v20 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v12),(((java.lang.Long)v18).longValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v20));
    Object v22 = 8L;
    Object v23 = ((org.joda.time.chrono.BaseChronology)v0).get(((org.joda.time.ReadablePartial)v21),(((java.lang.Long)v22).longValue()));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = ((org.joda.time.chrono.BaseChronology)v0).toString();
    Object v2 = -22L;
    Object v3 = 0L;
    Object v4 = 1;
    Object v5 = ((org.joda.time.chrono.BaseChronology)v0).add((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(-22L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = org.joda.time.DateTimeZone.getDefault();
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getNameKey((((java.lang.Long)v2).longValue()));
    Object v4 = 3L;
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 2;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1),((org.joda.time.ReadableInstant)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v8).getZone();
    Object v10 = ((org.joda.time.chrono.GJChronology)v8).getZone();
    Object v11 = ((org.joda.time.chrono.GJChronology)v0).withZone(((org.joda.time.DateTimeZone)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = org.joda.time.DateTimeZone.getDefault();
    Object v2 = 28L;
    Object v3 = "Chronology must not /e null";
    Object v4 = "The datetime zone must ";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.DateTimeZone)v1).getName((((java.lang.Long)v2).longValue()),((java.util.Locale)v5));
    Object v7 = 1L;
    Object v8 = 1;
    Object v9 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Long)v7).longValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v9));
    Object v11 = 3L;
    Object v12 = ((org.joda.time.chrono.BaseChronology)v0).get(((org.joda.time.ReadablePartial)v10),(((java.lang.Long)v11).longValue()));
    Object v13 = ((org.joda.time.chrono.GJChronology)v0).getZone();
    Object v14 = 0L;
    Object v15 = ((org.joda.time.DateTimeZone)v13).getOffset((((java.lang.Long)v14).longValue()));
    Object v16 = 3L;
    Object v17 = org.joda.time.DateTimeZone.getDefault();
    Object v18 = new org.joda.time.DateTime((((java.lang.Long)v16).longValue()),((org.joda.time.DateTimeZone)v17));
    Object v19 = ((org.joda.time.ReadableInstant)v18).hashCode();
    Object v20 = 0;
    Object v21 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v13),((org.joda.time.ReadableInstant)v18),(((java.lang.Integer)v20).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = org.joda.time.DateTimeZone.getDefault();
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getNameKey((((java.lang.Long)v2).longValue()));
    Object v4 = 3L;
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 2;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1),((org.joda.time.ReadableInstant)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v8).getZone();
    Object v10 = ((org.joda.time.chrono.GJChronology)v8).getZone();
    Object v11 = ((org.joda.time.chrono.GJChronology)v0).withZone(((org.joda.time.DateTimeZone)v10));
    Object v12 = ((org.joda.time.chrono.GJChronology)v11).toString();
    org.junit.Assert.assertEquals((Object)("GJChronology[America/Los_Angeles]"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = org.joda.time.DateTimeZone.getDefault();
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getNameKey((((java.lang.Long)v2).longValue()));
    Object v4 = 3L;
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 2;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1),((org.joda.time.ReadableInstant)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v8).getZone();
    Object v10 = ((org.joda.time.chrono.GJChronology)v8).getZone();
    Object v11 = ((org.joda.time.chrono.GJChronology)v0).withZone(((org.joda.time.DateTimeZone)v10));
    Object v12 = ((org.joda.time.chrono.AssembledChronology)v11).centuryOfEra();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = -22;
    Object v2 = 6;
    Object v3 = -39;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = 60000;
    Object v7 = 0;
    Object v8 = ((org.joda.time.chrono.GJChronology)v0).getDateTimeMillis((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = org.joda.time.DateTimeZone.getDefault();
    Object v2 = 28L;
    Object v3 = "Chronology must not /e null";
    Object v4 = "The datetime zone must ";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.DateTimeZone)v1).getName((((java.lang.Long)v2).longValue()),((java.util.Locale)v5));
    Object v7 = 1L;
    Object v8 = 1;
    Object v9 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Long)v7).longValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v9));
    Object v11 = org.joda.time.DateTimeZone.getDefault();
    Object v12 = 28L;
    Object v13 = "Chronology must not /e null";
    Object v14 = "The datetime zone must ";
    Object v15 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((org.joda.time.DateTimeZone)v11).getName((((java.lang.Long)v12).longValue()),((java.util.Locale)v15));
    Object v17 = 1L;
    Object v18 = 1;
    Object v19 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v11),(((java.lang.Long)v17).longValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v19));
    Object v21 = org.joda.time.Minutes.minutesBetween(((org.joda.time.ReadablePartial)v10),((org.joda.time.ReadablePartial)v20));
    Object v22 = 0L;
    Object v23 = 1L;
    Object v24 = ((org.joda.time.chrono.BaseChronology)v0).get(((org.joda.time.ReadablePeriod)v21),(((java.lang.Long)v22).longValue()),(((java.lang.Long)v23).longValue()));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = ((org.joda.time.chrono.AssembledChronology)v0).millisOfDay();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.chrono.GJChronology)v7).getZone();
    Object v9 = ((org.joda.time.chrono.GJChronology)v7).getZone();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getOffset((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 3L;
    Object v16 = org.joda.time.DateTimeZone.getDefault();
    Object v17 = new org.joda.time.DateTime((((java.lang.Long)v15).longValue()),((org.joda.time.DateTimeZone)v16));
    Object v18 = ((org.joda.time.ReadableInstant)v14).isBefore(((org.joda.time.ReadableInstant)v17));
    Object v19 = 1;
    Object v20 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.joda.time.chrono.GJChronology)v20).getGregorianCutover();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.chrono.GJChronology)v7).getZone();
    Object v9 = ((org.joda.time.chrono.GJChronology)v7).getZone();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getOffset((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 3L;
    Object v16 = org.joda.time.DateTimeZone.getDefault();
    Object v17 = new org.joda.time.DateTime((((java.lang.Long)v15).longValue()),((org.joda.time.DateTimeZone)v16));
    Object v18 = ((org.joda.time.ReadableInstant)v14).isBefore(((org.joda.time.ReadableInstant)v17));
    Object v19 = 1;
    Object v20 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v19).intValue()));
    Object v21 = 0L;
    Object v22 = -21L;
    Object v23 = 1;
    Object v24 = ((org.joda.time.chrono.BaseChronology)v20).add((((java.lang.Long)v21).longValue()),(((java.lang.Long)v22).longValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = 1L;
    Object v26 = ((org.joda.time.chrono.GJChronology)v20).julianToGregorianByYear((((java.lang.Long)v25).longValue()));
    org.junit.Assert.assertEquals((Object)(-1123199999L), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = 32;
    Object v4 = 0;
    Object v5 = ((org.joda.time.chrono.GJChronology)v0).getDateTimeMillis((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getNameKey((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 2;
    Object v16 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v18 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v19 = ((org.joda.time.chrono.GJChronology)v8).withZone(((org.joda.time.DateTimeZone)v18));
    Object v20 = ((org.joda.time.chrono.AssembledChronology)v19).minuteOfDay();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getNameKey((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 2;
    Object v16 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v18 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v19 = ((org.joda.time.chrono.GJChronology)v8).withZone(((org.joda.time.DateTimeZone)v18));
    Object v20 = -40L;
    Object v21 = ((org.joda.time.chrono.GJChronology)v19).gregorianToJulianByYear((((java.lang.Long)v20).longValue()));
    org.junit.Assert.assertEquals((Object)(1123199960L), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getNameKey((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 2;
    Object v16 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v18 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v19 = ((org.joda.time.chrono.GJChronology)v8).withZone(((org.joda.time.DateTimeZone)v18));
    Object v20 = ((org.joda.time.chrono.AssembledChronology)v19).clockhourOfDay();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = org.joda.time.DateTimeZone.getDefault();
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getNameKey((((java.lang.Long)v2).longValue()));
    Object v4 = 3L;
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 2;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1),((org.joda.time.ReadableInstant)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v8).getZone();
    Object v10 = ((org.joda.time.chrono.GJChronology)v8).getZone();
    Object v11 = ((org.joda.time.chrono.GJChronology)v0).withZone(((org.joda.time.DateTimeZone)v10));
    Object v12 = org.joda.time.DateTimeZone.getDefault();
    Object v13 = 28L;
    Object v14 = "Chronology must not /e null";
    Object v15 = "The datetime zone must ";
    Object v16 = new java.util.Locale(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((org.joda.time.DateTimeZone)v12).getName((((java.lang.Long)v13).longValue()),((java.util.Locale)v16));
    Object v18 = 1L;
    Object v19 = 1;
    Object v20 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v12),(((java.lang.Long)v18).longValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v20));
    Object v22 = new int[]{};
    ((org.joda.time.chrono.BaseChronology)v11).validate(((org.joda.time.ReadablePartial)v21),((int[])v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = ((org.joda.time.chrono.AssembledChronology)v0).hourOfHalfday();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = ((org.joda.time.chrono.GJChronology)v0).toString();
    org.junit.Assert.assertEquals((Object)("GJChronology[UTC]"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = ((org.joda.time.chrono.AssembledChronology)v0).weekOfWeekyear();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = ((org.joda.time.chrono.GJChronology)v0).getZone();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = org.joda.time.DateTimeZone.getDefault();
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getNameKey((((java.lang.Long)v2).longValue()));
    Object v4 = 3L;
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 2;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1),((org.joda.time.ReadableInstant)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v8).getZone();
    Object v10 = ((org.joda.time.chrono.GJChronology)v8).getZone();
    Object v11 = ((org.joda.time.chrono.GJChronology)v0).withZone(((org.joda.time.DateTimeZone)v10));
    Object v12 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v13 = ((org.joda.time.chrono.AssembledChronology)v12).hourOfHalfday();
    Object v14 = ((org.joda.time.chrono.GJChronology)v11).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = ((org.joda.time.chrono.AssembledChronology)v0).clockhourOfDay();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = ((org.joda.time.chrono.AssembledChronology)v0).hourOfDay();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = 0L;
    Object v2 = 0L;
    Object v3 = 1;
    Object v4 = ((org.joda.time.chrono.BaseChronology)v0).add((((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = ((org.joda.time.chrono.GJChronology)v0).getZone();
    Object v2 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.DateTimeZone.getDefault();
    Object v9 = 28L;
    Object v10 = "Chronology must not /e null";
    Object v11 = "The datetime zone must ";
    Object v12 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.joda.time.DateTimeZone)v8).getName((((java.lang.Long)v9).longValue()),((java.util.Locale)v12));
    Object v14 = 1L;
    Object v15 = 1;
    Object v16 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v8),(((java.lang.Long)v14).longValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v16));
    Object v18 = org.joda.time.DateTimeZone.getDefault();
    Object v19 = 28L;
    Object v20 = "Chronology must not /e null";
    Object v21 = "The datetime zone must ";
    Object v22 = new java.util.Locale(((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = ((org.joda.time.DateTimeZone)v18).getName((((java.lang.Long)v19).longValue()),((java.util.Locale)v22));
    Object v24 = 1L;
    Object v25 = 1;
    Object v26 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v18),(((java.lang.Long)v24).longValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v26));
    Object v28 = org.joda.time.Minutes.minutesBetween(((org.joda.time.ReadablePartial)v17),((org.joda.time.ReadablePartial)v27));
    Object v29 = 1L;
    Object v30 = 1;
    Object v31 = ((org.joda.time.chrono.BaseChronology)v7).add(((org.joda.time.ReadablePeriod)v28),(((java.lang.Long)v29).longValue()),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((org.joda.time.chrono.AssembledChronology)v7).dayOfMonth();
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = org.joda.time.DateTimeZone.getDefault();
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getNameKey((((java.lang.Long)v2).longValue()));
    Object v4 = 3L;
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 2;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1),((org.joda.time.ReadableInstant)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v8).getZone();
    Object v10 = ((org.joda.time.chrono.GJChronology)v8).getZone();
    Object v11 = ((org.joda.time.chrono.GJChronology)v0).withZone(((org.joda.time.DateTimeZone)v10));
    Object v12 = org.joda.time.DateTimeZone.getDefault();
    Object v13 = 28L;
    Object v14 = "Chronology must not /e null";
    Object v15 = "The datetime zone must ";
    Object v16 = new java.util.Locale(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((org.joda.time.DateTimeZone)v12).getName((((java.lang.Long)v13).longValue()),((java.util.Locale)v16));
    Object v18 = 1L;
    Object v19 = 1;
    Object v20 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v12),(((java.lang.Long)v18).longValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v20));
    Object v22 = 45L;
    Object v23 = ((org.joda.time.chrono.BaseChronology)v11).get(((org.joda.time.ReadablePartial)v21),(((java.lang.Long)v22).longValue()));
    Object v24 = ((org.joda.time.chrono.AssembledChronology)v11).weekyearOfCentury();
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = ((org.joda.time.chrono.AssembledChronology)v0).years();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getNameKey((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 2;
    Object v16 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v18 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v19 = ((org.joda.time.chrono.GJChronology)v8).withZone(((org.joda.time.DateTimeZone)v18));
    Object v20 = ((org.joda.time.chrono.GJChronology)v19).hashCode();
    org.junit.Assert.assertEquals((Object)(192662112), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = org.joda.time.DateTimeZone.getDefault();
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getNameKey((((java.lang.Long)v2).longValue()));
    Object v4 = 3L;
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 2;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1),((org.joda.time.ReadableInstant)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v8).getZone();
    Object v10 = ((org.joda.time.chrono.GJChronology)v8).getZone();
    Object v11 = ((org.joda.time.chrono.GJChronology)v0).withZone(((org.joda.time.DateTimeZone)v10));
    Object v12 = ((org.joda.time.chrono.AssembledChronology)v11).weekyears();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = ((org.joda.time.chrono.GJChronology)v0).getZone();
    Object v2 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = 28L;
    Object v5 = "Chronology must not /e null";
    Object v6 = "The datetime zone must ";
    Object v7 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.joda.time.DateTimeZone)v3).getName((((java.lang.Long)v4).longValue()),((java.util.Locale)v7));
    Object v9 = 1L;
    Object v10 = 1;
    Object v11 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v3),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v11));
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = 28L;
    Object v15 = "Chronology must not /e null";
    Object v16 = "The datetime zone must ";
    Object v17 = new java.util.Locale(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((org.joda.time.DateTimeZone)v13).getName((((java.lang.Long)v14).longValue()),((java.util.Locale)v17));
    Object v19 = 1L;
    Object v20 = 1;
    Object v21 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v13),(((java.lang.Long)v19).longValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v21));
    Object v23 = org.joda.time.Minutes.minutesBetween(((org.joda.time.ReadablePartial)v12),((org.joda.time.ReadablePartial)v22));
    Object v24 = 0L;
    Object v25 = 0;
    Object v26 = ((org.joda.time.chrono.BaseChronology)v2).add(((org.joda.time.ReadablePeriod)v23),(((java.lang.Long)v24).longValue()),(((java.lang.Integer)v25).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = ((org.joda.time.chrono.GJChronology)v0).getZone();
    Object v2 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1));
    Object v3 = ((org.joda.time.chrono.AssembledChronology)v2).years();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = ((org.joda.time.chrono.GJChronology)v0).getZone();
    Object v2 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = 28L;
    Object v5 = "Chronology must not /e null";
    Object v6 = "The datetime zone must ";
    Object v7 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.joda.time.DateTimeZone)v3).getName((((java.lang.Long)v4).longValue()),((java.util.Locale)v7));
    Object v9 = 1L;
    Object v10 = 1;
    Object v11 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v3),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v11));
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = 28L;
    Object v15 = "Chronology must not /e null";
    Object v16 = "The datetime zone must ";
    Object v17 = new java.util.Locale(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((org.joda.time.DateTimeZone)v13).getName((((java.lang.Long)v14).longValue()),((java.util.Locale)v17));
    Object v19 = 1L;
    Object v20 = 1;
    Object v21 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v13),(((java.lang.Long)v19).longValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v21));
    Object v23 = org.joda.time.Minutes.minutesBetween(((org.joda.time.ReadablePartial)v12),((org.joda.time.ReadablePartial)v22));
    Object v24 = ((org.joda.time.ReadablePeriod)v23).size();
    Object v25 = 24L;
    Object v26 = 30L;
    Object v27 = ((org.joda.time.chrono.BaseChronology)v2).get(((org.joda.time.ReadablePeriod)v23),(((java.lang.Long)v25).longValue()),(((java.lang.Long)v26).longValue()));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = 0L;
    Object v2 = 1L;
    Object v3 = 77;
    Object v4 = ((org.joda.time.chrono.BaseChronology)v0).add((((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(77L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = org.joda.time.DateTimeZone.getDefault();
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getNameKey((((java.lang.Long)v2).longValue()));
    Object v4 = 3L;
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 2;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1),((org.joda.time.ReadableInstant)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v8).getZone();
    Object v10 = ((org.joda.time.chrono.GJChronology)v8).getZone();
    Object v11 = ((org.joda.time.chrono.GJChronology)v0).withZone(((org.joda.time.DateTimeZone)v10));
    Object v12 = org.joda.time.DateTimeZone.getDefault();
    Object v13 = 28L;
    Object v14 = "Chronology must not /e null";
    Object v15 = "The datetime zone must ";
    Object v16 = new java.util.Locale(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((org.joda.time.DateTimeZone)v12).getName((((java.lang.Long)v13).longValue()),((java.util.Locale)v16));
    Object v18 = 1L;
    Object v19 = 1;
    Object v20 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v12),(((java.lang.Long)v18).longValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v20));
    Object v22 = org.joda.time.DateTimeZone.getDefault();
    Object v23 = 28L;
    Object v24 = "Chronology must not /e null";
    Object v25 = "The datetime zone must ";
    Object v26 = new java.util.Locale(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = ((org.joda.time.DateTimeZone)v22).getName((((java.lang.Long)v23).longValue()),((java.util.Locale)v26));
    Object v28 = 1L;
    Object v29 = 1;
    Object v30 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v22),(((java.lang.Long)v28).longValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v30));
    Object v32 = org.joda.time.Minutes.minutesBetween(((org.joda.time.ReadablePartial)v21),((org.joda.time.ReadablePartial)v31));
    Object v33 = 46L;
    Object v34 = 0L;
    Object v35 = ((org.joda.time.chrono.BaseChronology)v11).get(((org.joda.time.ReadablePeriod)v32),(((java.lang.Long)v33).longValue()),(((java.lang.Long)v34).longValue()));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = org.joda.time.DateTimeZone.getDefault();
    Object v2 = 28L;
    Object v3 = "Chronology must not /e null";
    Object v4 = "The datetime zone must ";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.DateTimeZone)v1).getName((((java.lang.Long)v2).longValue()),((java.util.Locale)v5));
    Object v7 = 1L;
    Object v8 = 1;
    Object v9 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Long)v7).longValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v9));
    Object v11 = org.joda.time.DateTimeZone.getDefault();
    Object v12 = 28L;
    Object v13 = "Chronology must not /e null";
    Object v14 = "The datetime zone must ";
    Object v15 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((org.joda.time.DateTimeZone)v11).getName((((java.lang.Long)v12).longValue()),((java.util.Locale)v15));
    Object v17 = 1L;
    Object v18 = 1;
    Object v19 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v11),(((java.lang.Long)v17).longValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v19));
    Object v21 = org.joda.time.Minutes.minutesBetween(((org.joda.time.ReadablePartial)v10),((org.joda.time.ReadablePartial)v20));
    Object v22 = 0L;
    Object v23 = 39;
    Object v24 = ((org.joda.time.chrono.BaseChronology)v0).add(((org.joda.time.ReadablePeriod)v21),(((java.lang.Long)v22).longValue()),(((java.lang.Integer)v23).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getNameKey((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 2;
    Object v16 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v18 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v19 = ((org.joda.time.chrono.GJChronology)v8).withZone(((org.joda.time.DateTimeZone)v18));
    Object v20 = ((org.joda.time.chrono.BaseChronology)v19).toString();
    Object v21 = ((org.joda.time.chrono.AssembledChronology)v19).hours();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = org.joda.time.DateTimeZone.getDefault();
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getNameKey((((java.lang.Long)v2).longValue()));
    Object v4 = 3L;
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 2;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1),((org.joda.time.ReadableInstant)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v8).getZone();
    Object v10 = ((org.joda.time.chrono.GJChronology)v8).getZone();
    Object v11 = ((org.joda.time.chrono.GJChronology)v0).withZone(((org.joda.time.DateTimeZone)v10));
    Object v12 = ((org.joda.time.chrono.GJChronology)v11).withUTC();
    Object v13 = ((org.joda.time.chrono.GJChronology)v11).getZone();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = org.joda.time.DateTimeZone.getDefault();
    Object v2 = 28L;
    Object v3 = "Chronology must not /e null";
    Object v4 = "The datetime zone must ";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.DateTimeZone)v1).getName((((java.lang.Long)v2).longValue()),((java.util.Locale)v5));
    Object v7 = 1L;
    Object v8 = 1;
    Object v9 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1),(((java.lang.Long)v7).longValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v9));
    Object v11 = org.joda.time.DateTimeZone.getDefault();
    Object v12 = 28L;
    Object v13 = "Chronology must not /e null";
    Object v14 = "The datetime zone must ";
    Object v15 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((org.joda.time.DateTimeZone)v11).getName((((java.lang.Long)v12).longValue()),((java.util.Locale)v15));
    Object v17 = 1L;
    Object v18 = 1;
    Object v19 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v11),(((java.lang.Long)v17).longValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v19));
    Object v21 = org.joda.time.Minutes.minutesBetween(((org.joda.time.ReadablePartial)v10),((org.joda.time.ReadablePartial)v20));
    Object v22 = 0;
    Object v23 = ((org.joda.time.ReadablePeriod)v21).getValue((((java.lang.Integer)v22).intValue()));
    Object v24 = 0L;
    Object v25 = -3L;
    Object v26 = ((org.joda.time.chrono.BaseChronology)v0).get(((org.joda.time.ReadablePeriod)v21),(((java.lang.Long)v24).longValue()),(((java.lang.Long)v25).longValue()));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getNameKey((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 2;
    Object v16 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v18 = ((org.joda.time.chrono.GJChronology)v16).getZone();
    Object v19 = ((org.joda.time.chrono.GJChronology)v8).withZone(((org.joda.time.DateTimeZone)v18));
    Object v20 = ((org.joda.time.chrono.BaseChronology)v19).weekOfWeekyear();
    Object v21 = org.joda.time.DateTimeZone.getDefault();
    Object v22 = 28L;
    Object v23 = "Chronology must not /e null";
    Object v24 = "The datetime zone must ";
    Object v25 = new java.util.Locale(((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = ((org.joda.time.DateTimeZone)v21).getName((((java.lang.Long)v22).longValue()),((java.util.Locale)v25));
    Object v27 = 1L;
    Object v28 = 1;
    Object v29 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v21),(((java.lang.Long)v27).longValue()),(((java.lang.Integer)v28).intValue()));
    Object v30 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v29));
    Object v31 = 31L;
    Object v32 = ((org.joda.time.chrono.BaseChronology)v19).set(((org.joda.time.ReadablePartial)v30),(((java.lang.Long)v31).longValue()));
    org.junit.Assert.assertEquals((Object)(-38278424L), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = ((org.joda.time.chrono.GJChronology)v0).getZone();
    Object v2 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1));
    Object v3 = ((org.joda.time.chrono.AssembledChronology)v2).days();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = -32;
    Object v2 = -22;
    Object v3 = -3;
    Object v4 = 4;
    Object v5 = 604799947;
    Object v6 = -15;
    Object v7 = -18;
    Object v8 = ((org.joda.time.chrono.GJChronology)v0).getDateTimeMillis((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = org.joda.time.DateTimeZone.getDefault();
    Object v2 = 1L;
    Object v3 = ((org.joda.time.DateTimeZone)v1).getNameKey((((java.lang.Long)v2).longValue()));
    Object v4 = 3L;
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    Object v6 = new org.joda.time.DateTime((((java.lang.Long)v4).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 2;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1),((org.joda.time.ReadableInstant)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.chrono.GJChronology)v8).getZone();
    Object v10 = ((org.joda.time.chrono.GJChronology)v8).getZone();
    Object v11 = ((org.joda.time.chrono.GJChronology)v0).withZone(((org.joda.time.DateTimeZone)v10));
    Object v12 = org.joda.time.DateTimeZone.getDefault();
    Object v13 = 28L;
    Object v14 = "Chronology must not /e null";
    Object v15 = "The datetime zone must ";
    Object v16 = new java.util.Locale(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((org.joda.time.DateTimeZone)v12).getName((((java.lang.Long)v13).longValue()),((java.util.Locale)v16));
    Object v18 = 1L;
    Object v19 = 1;
    Object v20 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v12),(((java.lang.Long)v18).longValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v20));
    Object v22 = org.joda.time.DateTimeZone.getDefault();
    Object v23 = 28L;
    Object v24 = "Chronology must not /e null";
    Object v25 = "The datetime zone must ";
    Object v26 = new java.util.Locale(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = ((org.joda.time.DateTimeZone)v22).getName((((java.lang.Long)v23).longValue()),((java.util.Locale)v26));
    Object v28 = 1L;
    Object v29 = 1;
    Object v30 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v22),(((java.lang.Long)v28).longValue()),(((java.lang.Integer)v29).intValue()));
    Object v31 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v30));
    Object v32 = org.joda.time.Minutes.minutesBetween(((org.joda.time.ReadablePartial)v21),((org.joda.time.ReadablePartial)v31));
    Object v33 = 11L;
    Object v34 = 1;
    Object v35 = ((org.joda.time.chrono.BaseChronology)v11).add(((org.joda.time.ReadablePeriod)v32),(((java.lang.Long)v33).longValue()),(((java.lang.Integer)v34).intValue()));
    Object v36 = ((org.joda.time.chrono.AssembledChronology)v11).minutes();
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 28L;
    Object v2 = "Chronology must not /e null";
    Object v3 = "The datetime zone must ";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.DateTimeZone)v0).getName((((java.lang.Long)v1).longValue()),((java.util.Locale)v4));
    Object v6 = 1L;
    Object v7 = 1;
    Object v8 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v10 = ((org.joda.time.chrono.GJChronology)v9).getZone();
    Object v11 = ((org.joda.time.chrono.BaseChronology)v8).withZone(((org.joda.time.DateTimeZone)v10));
    Object v12 = ((org.joda.time.chrono.AssembledChronology)v8).months();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = ((org.joda.time.chrono.GJChronology)v0).getZone();
    Object v2 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = 28L;
    Object v5 = "Chronology must not /e null";
    Object v6 = "The datetime zone must ";
    Object v7 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.joda.time.DateTimeZone)v3).getName((((java.lang.Long)v4).longValue()),((java.util.Locale)v7));
    Object v9 = 1L;
    Object v10 = 1;
    Object v11 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v3),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v11));
    Object v13 = new int[]{};
    ((org.joda.time.chrono.BaseChronology)v2).validate(((org.joda.time.ReadablePartial)v12),((int[])v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = org.joda.time.DateTimeZone.getDefault();
    Object v1 = 1L;
    Object v2 = ((org.joda.time.DateTimeZone)v0).getNameKey((((java.lang.Long)v1).longValue()));
    Object v3 = 3L;
    Object v4 = org.joda.time.DateTimeZone.getDefault();
    Object v5 = new org.joda.time.DateTime((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 2;
    Object v7 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v0),((org.joda.time.ReadableInstant)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.chrono.GJChronology)v7).getZone();
    Object v9 = ((org.joda.time.chrono.GJChronology)v7).getZone();
    Object v10 = 1L;
    Object v11 = ((org.joda.time.DateTimeZone)v9).getOffset((((java.lang.Long)v10).longValue()));
    Object v12 = 3L;
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = new org.joda.time.DateTime((((java.lang.Long)v12).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 3L;
    Object v16 = org.joda.time.DateTimeZone.getDefault();
    Object v17 = new org.joda.time.DateTime((((java.lang.Long)v15).longValue()),((org.joda.time.DateTimeZone)v16));
    Object v18 = ((org.joda.time.ReadableInstant)v14).isBefore(((org.joda.time.ReadableInstant)v17));
    Object v19 = 1;
    Object v20 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v9),((org.joda.time.ReadableInstant)v14),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.joda.time.chrono.AssembledChronology)v20).yearOfCentury();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = ((org.joda.time.chrono.GJChronology)v0).getZone();
    Object v2 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = 28L;
    Object v5 = "Chronology must not /e null";
    Object v6 = "The datetime zone must ";
    Object v7 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.joda.time.DateTimeZone)v3).getName((((java.lang.Long)v4).longValue()),((java.util.Locale)v7));
    Object v9 = 1L;
    Object v10 = 1;
    Object v11 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v3),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v11));
    Object v13 = ((org.joda.time.ReadablePartial)v12).toString();
    Object v14 = 1L;
    Object v15 = ((org.joda.time.chrono.BaseChronology)v2).get(((org.joda.time.ReadablePartial)v12),(((java.lang.Long)v14).longValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = ((org.joda.time.chrono.GJChronology)v0).getZone();
    Object v2 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1));
    Object v3 = new org.joda.time.chrono.AssembledChronology.Fields();
    ((org.joda.time.chrono.GJChronology)v2).assemble(((org.joda.time.chrono.AssembledChronology.Fields)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = ((org.joda.time.chrono.GJChronology)v0).getZone();
    Object v2 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1));
    Object v3 = ((org.joda.time.chrono.GJChronology)v2).getGregorianCutover();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v1 = ((org.joda.time.chrono.GJChronology)v0).getZone();
    Object v2 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v1));
    Object v3 = org.joda.time.DateTimeZone.getDefault();
    Object v4 = 28L;
    Object v5 = "Chronology must not /e null";
    Object v6 = "The datetime zone must ";
    Object v7 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.joda.time.DateTimeZone)v3).getName((((java.lang.Long)v4).longValue()),((java.util.Locale)v7));
    Object v9 = 1L;
    Object v10 = 1;
    Object v11 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v3),(((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v11));
    Object v13 = org.joda.time.DateTimeZone.getDefault();
    Object v14 = 28L;
    Object v15 = "Chronology must not /e null";
    Object v16 = "The datetime zone must ";
    Object v17 = new java.util.Locale(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = ((org.joda.time.DateTimeZone)v13).getName((((java.lang.Long)v14).longValue()),((java.util.Locale)v17));
    Object v19 = 1L;
    Object v20 = 1;
    Object v21 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v13),(((java.lang.Long)v19).longValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = org.joda.time.LocalTime.now(((org.joda.time.Chronology)v21));
    Object v23 = org.joda.time.Minutes.minutesBetween(((org.joda.time.ReadablePartial)v12),((org.joda.time.ReadablePartial)v22));
    Object v24 = 5L;
    Object v25 = -4;
    Object v26 = ((org.joda.time.chrono.BaseChronology)v2).add(((org.joda.time.ReadablePeriod)v23),(((java.lang.Long)v24).longValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = 16L;
    Object v28 = ((org.joda.time.chrono.GJChronology)v2).julianToGregorianByYear((((java.lang.Long)v27).longValue()));
    org.junit.Assert.assertEquals((Object)(-1123199984L), v28);
  }
}
