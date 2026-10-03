package org.joda.time.field;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = org.joda.time.DurationFieldType.days();
    Object v3 = ((org.joda.time.field.UnsupportedDurationField)v1).equals(((java.lang.Object)v2));
    Object v4 = 1;
    Object v5 = ((org.joda.time.field.UnsupportedDurationField)v1).getMillis((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = ((org.joda.time.field.UnsupportedDurationField)v1).toString();
    org.junit.Assert.assertEquals((Object)("UnsupportedDurationField[days]"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = 0L;
    Object v3 = 0L;
    Object v4 = ((org.joda.time.DurationField)v1).subtract((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = ((org.joda.time.field.UnsupportedDurationField)v1).getUnitMillis();
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = org.joda.time.DurationFieldType.days();
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v2));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getUnitMillis();
    Object v5 = ((org.joda.time.field.UnsupportedDurationField)v1).equals(((java.lang.Object)v4));
    Object v6 = ((org.joda.time.field.UnsupportedDurationField)v1).toString();
    org.junit.Assert.assertEquals((Object)("UnsupportedDurationField[days]"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = ((org.joda.time.field.UnsupportedDurationField)v1).toString();
    Object v3 = 1L;
    Object v4 = 4L;
    Object v5 = ((org.joda.time.field.UnsupportedDurationField)v1).getValue((((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = 0L;
    Object v3 = -3;
    Object v4 = ((org.joda.time.DurationField)v1).subtract((((java.lang.Long)v2).longValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = org.joda.time.DurationFieldType.days();
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v2));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).toString();
    Object v5 = ((org.joda.time.field.UnsupportedDurationField)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = 20L;
    Object v3 = 12L;
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v1).getDifference((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = 0L;
    Object v3 = 0;
    Object v4 = ((org.joda.time.DurationField)v1).subtract((((java.lang.Long)v2).longValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = -44;
    Object v3 = ((org.joda.time.field.UnsupportedDurationField)v1).getMillis((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = 1L;
    Object v3 = 2L;
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v1).getMillis((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = ((org.joda.time.DurationField)v1).isPrecise();
    Object v3 = 1L;
    Object v4 = 0;
    Object v5 = ((org.joda.time.DurationField)v1).subtract((((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = org.joda.time.DurationFieldType.days();
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v2));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).toString();
    Object v5 = ((org.joda.time.field.UnsupportedDurationField)v1).equals(((java.lang.Object)v4));
    Object v6 = org.joda.time.DurationFieldType.days();
    Object v7 = ((org.joda.time.field.UnsupportedDurationField)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = 53L;
    Object v3 = 1;
    Object v4 = ((org.joda.time.DurationField)v1).subtract((((java.lang.Long)v2).longValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = org.joda.time.DurationFieldType.days();
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v9).toString();
    Object v11 = ((org.joda.time.field.UnsupportedDurationField)v7).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 1L;
    Object v9 = 48L;
    Object v10 = ((org.joda.time.DurationField)v7).subtract((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).toString();
    org.junit.Assert.assertEquals((Object)("UnsupportedDurationField[days]"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = org.joda.time.DurationFieldType.days();
    Object v9 = ((org.joda.time.field.UnsupportedDurationField)v7).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = org.joda.time.DurationFieldType.days();
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v9).toString();
    Object v11 = ((org.joda.time.field.UnsupportedDurationField)v7).equals(((java.lang.Object)v10));
    Object v12 = 2L;
    Object v13 = 0L;
    Object v14 = ((org.joda.time.field.UnsupportedDurationField)v7).getMillis((((java.lang.Long)v12).longValue()),(((java.lang.Long)v13).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).getType();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 1L;
    Object v9 = 12L;
    Object v10 = ((org.joda.time.DurationField)v7).subtract((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = org.joda.time.DurationFieldType.days();
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v10 = org.joda.time.DurationFieldType.days();
    Object v11 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v10));
    Object v12 = ((org.joda.time.field.UnsupportedDurationField)v11).getUnitMillis();
    Object v13 = ((org.joda.time.field.UnsupportedDurationField)v9).equals(((java.lang.Object)v12));
    Object v14 = ((org.joda.time.field.UnsupportedDurationField)v9).toString();
    Object v15 = ((org.joda.time.field.UnsupportedDurationField)v7).equals(((java.lang.Object)v14));
    Object v16 = org.joda.time.DurationFieldType.days();
    Object v17 = 46;
    Object v18 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v17).intValue()));
    Object v19 = new org.joda.time.DateTime();
    Object v20 = 1;
    Object v21 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v18),((org.joda.time.ReadableInstant)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.joda.time.DurationFieldType)v16).isSupported(((org.joda.time.Chronology)v21));
    Object v23 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v16));
    Object v24 = ((org.joda.time.field.UnsupportedDurationField)v7).compareTo(((org.joda.time.DurationField)v23));
    org.junit.Assert.assertEquals((Object)(0), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 41L;
    Object v9 = ((org.joda.time.field.UnsupportedDurationField)v7).getMillis((((java.lang.Long)v8).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = -30L;
    Object v9 = 0L;
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v7).getDifferenceAsLong((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).isSupported();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 0;
    Object v9 = -22L;
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v7).getMillis((((java.lang.Integer)v8).intValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = ((org.joda.time.field.UnsupportedDurationField)v1).hashCode();
    Object v3 = ((org.joda.time.field.UnsupportedDurationField)v1).isSupported();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = ((org.joda.time.field.UnsupportedDurationField)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(3076183), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).hashCode();
    Object v9 = org.joda.time.DurationFieldType.days();
    Object v10 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v9));
    Object v11 = org.joda.time.DurationFieldType.days();
    Object v12 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v11));
    Object v13 = ((org.joda.time.field.UnsupportedDurationField)v12).getUnitMillis();
    Object v14 = ((org.joda.time.field.UnsupportedDurationField)v10).equals(((java.lang.Object)v13));
    Object v15 = ((org.joda.time.field.UnsupportedDurationField)v10).toString();
    Object v16 = ((org.joda.time.field.UnsupportedDurationField)v7).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 1L;
    Object v9 = 1;
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v7).add((((java.lang.Long)v8).longValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 2L;
    Object v9 = ((org.joda.time.field.UnsupportedDurationField)v7).getValueAsLong((((java.lang.Long)v8).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 1L;
    Object v9 = 4;
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v7).add((((java.lang.Long)v8).longValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = org.joda.time.DurationFieldType.days();
    Object v9 = 46;
    Object v10 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v9).intValue()));
    Object v11 = new org.joda.time.DateTime();
    Object v12 = 1;
    Object v13 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v10),((org.joda.time.ReadableInstant)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.DurationFieldType)v8).isSupported(((org.joda.time.Chronology)v13));
    Object v15 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v16 = ((org.joda.time.field.UnsupportedDurationField)v7).compareTo(((org.joda.time.DurationField)v15));
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 0L;
    Object v9 = ((org.joda.time.field.UnsupportedDurationField)v7).getValue((((java.lang.Long)v8).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 13L;
    Object v9 = 2;
    Object v10 = ((org.joda.time.DurationField)v7).subtract((((java.lang.Long)v8).longValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 2L;
    Object v9 = 1L;
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v7).add((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).getName();
    org.junit.Assert.assertEquals((Object)("days"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 12L;
    Object v9 = -16L;
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v7).getDifferenceAsLong((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = org.joda.time.DurationFieldType.days();
    Object v9 = 46;
    Object v10 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v9).intValue()));
    Object v11 = new org.joda.time.DateTime();
    Object v12 = 1;
    Object v13 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v10),((org.joda.time.ReadableInstant)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.DurationFieldType)v8).isSupported(((org.joda.time.Chronology)v13));
    Object v15 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v16 = ((org.joda.time.field.UnsupportedDurationField)v7).equals(((java.lang.Object)v15));
    Object v17 = ((org.joda.time.field.UnsupportedDurationField)v7).isPrecise();
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 4;
    Object v9 = 0L;
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v7).getMillis((((java.lang.Integer)v8).intValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 1;
    Object v9 = ((org.joda.time.field.UnsupportedDurationField)v7).getMillis((((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 0L;
    Object v9 = 0;
    Object v10 = ((org.joda.time.DurationField)v7).subtract((((java.lang.Long)v8).longValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 48L;
    Object v9 = -38L;
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v7).getMillis((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 1L;
    Object v9 = 1L;
    Object v10 = ((org.joda.time.DurationField)v7).subtract((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).getType();
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).getType();
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v9).toString();
    Object v11 = 0;
    Object v12 = 27L;
    Object v13 = ((org.joda.time.field.UnsupportedDurationField)v9).getMillis((((java.lang.Integer)v11).intValue()),(((java.lang.Long)v12).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 0L;
    Object v9 = 1L;
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v7).add((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = 0L;
    Object v3 = 0L;
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v1).getValueAsLong((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = -15L;
    Object v9 = -28L;
    Object v10 = ((org.joda.time.DurationField)v7).subtract((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).getType();
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v9).toString();
    Object v11 = 3L;
    Object v12 = ((org.joda.time.field.UnsupportedDurationField)v9).getValue((((java.lang.Long)v11).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 30L;
    Object v9 = 0L;
    Object v10 = ((org.joda.time.DurationField)v7).subtract((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).toString();
    Object v9 = -38L;
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v7).getMillis((((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 0L;
    Object v9 = 0L;
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v7).getDifference((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).getType();
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v10 = 68L;
    Object v11 = 0L;
    Object v12 = ((org.joda.time.DurationField)v9).subtract((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).toString();
    Object v9 = 1L;
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v7).getMillis((((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).getType();
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v10 = -1L;
    Object v11 = 0L;
    Object v12 = ((org.joda.time.field.UnsupportedDurationField)v9).add((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 48L;
    Object v9 = 1;
    Object v10 = ((org.joda.time.DurationField)v7).subtract((((java.lang.Long)v8).longValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = org.joda.time.DurationFieldType.days();
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v10 = org.joda.time.DurationFieldType.days();
    Object v11 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v10));
    Object v12 = ((org.joda.time.field.UnsupportedDurationField)v11).getUnitMillis();
    Object v13 = ((org.joda.time.field.UnsupportedDurationField)v9).equals(((java.lang.Object)v12));
    Object v14 = ((org.joda.time.field.UnsupportedDurationField)v9).toString();
    Object v15 = ((org.joda.time.field.UnsupportedDurationField)v7).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 0L;
    Object v9 = 6L;
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v7).getValueAsLong((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 13L;
    Object v9 = ((org.joda.time.field.UnsupportedDurationField)v7).getMillis((((java.lang.Long)v8).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = -2147483673L;
    Object v9 = 31L;
    Object v10 = ((org.joda.time.DurationField)v7).subtract((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).getType();
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v10 = org.joda.time.DurationFieldType.days();
    Object v11 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v10));
    Object v12 = ((org.joda.time.field.UnsupportedDurationField)v11).hashCode();
    Object v13 = ((org.joda.time.field.UnsupportedDurationField)v9).equals(((java.lang.Object)v12));
    Object v14 = -17L;
    Object v15 = ((org.joda.time.field.UnsupportedDurationField)v9).getMillis((((java.lang.Long)v14).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = org.joda.time.DurationFieldType.days();
    Object v9 = ((org.joda.time.field.UnsupportedDurationField)v7).equals(((java.lang.Object)v8));
    Object v10 = org.joda.time.DurationFieldType.days();
    Object v11 = 46;
    Object v12 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v11).intValue()));
    Object v13 = new org.joda.time.DateTime();
    Object v14 = 1;
    Object v15 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v12),((org.joda.time.ReadableInstant)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.joda.time.DurationFieldType)v10).isSupported(((org.joda.time.Chronology)v15));
    Object v17 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v10));
    Object v18 = ((org.joda.time.field.UnsupportedDurationField)v17).getName();
    Object v19 = ((org.joda.time.field.UnsupportedDurationField)v7).equals(((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).getType();
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v10 = org.joda.time.DurationFieldType.days();
    Object v11 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v10));
    Object v12 = ((org.joda.time.field.UnsupportedDurationField)v11).getUnitMillis();
    Object v13 = ((org.joda.time.field.UnsupportedDurationField)v9).equals(((java.lang.Object)v12));
    Object v14 = 1L;
    Object v15 = ((org.joda.time.field.UnsupportedDurationField)v9).getValueAsLong((((java.lang.Long)v14).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(3076183), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = org.joda.time.DurationFieldType.days();
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v9).getUnitMillis();
    Object v11 = ((org.joda.time.field.UnsupportedDurationField)v7).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 1L;
    Object v9 = -49;
    Object v10 = ((org.joda.time.DurationField)v7).subtract((((java.lang.Long)v8).longValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).toString();
    Object v9 = -14;
    Object v10 = 1L;
    Object v11 = ((org.joda.time.field.UnsupportedDurationField)v7).getMillis((((java.lang.Integer)v9).intValue()),(((java.lang.Long)v10).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).toString();
    Object v9 = org.joda.time.DurationFieldType.days();
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v7).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).hashCode();
    Object v9 = ((org.joda.time.field.UnsupportedDurationField)v7).isPrecise();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).getType();
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v10 = org.joda.time.DurationFieldType.days();
    Object v11 = 46;
    Object v12 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v11).intValue()));
    Object v13 = new org.joda.time.DateTime();
    Object v14 = 1;
    Object v15 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v12),((org.joda.time.ReadableInstant)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.joda.time.DurationFieldType)v10).isSupported(((org.joda.time.Chronology)v15));
    Object v17 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v10));
    Object v18 = org.joda.time.DurationFieldType.days();
    Object v19 = 46;
    Object v20 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v19).intValue()));
    Object v21 = new org.joda.time.DateTime();
    Object v22 = 1;
    Object v23 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v20),((org.joda.time.ReadableInstant)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((org.joda.time.DurationFieldType)v18).isSupported(((org.joda.time.Chronology)v23));
    Object v25 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v18));
    Object v26 = ((org.joda.time.field.UnsupportedDurationField)v17).compareTo(((org.joda.time.DurationField)v25));
    Object v27 = ((org.joda.time.field.UnsupportedDurationField)v9).equals(((java.lang.Object)v26));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).getType();
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v9).hashCode();
    Object v11 = org.joda.time.DurationFieldType.days();
    Object v12 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v11));
    Object v13 = ((org.joda.time.field.UnsupportedDurationField)v12).hashCode();
    Object v14 = ((org.joda.time.field.UnsupportedDurationField)v12).isSupported();
    Object v15 = ((org.joda.time.field.UnsupportedDurationField)v9).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 21859199992L;
    Object v9 = -13L;
    Object v10 = ((org.joda.time.DurationField)v7).subtract((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = -1L;
    Object v9 = 2;
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v7).add((((java.lang.Long)v8).longValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).getType();
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v10 = 3L;
    Object v11 = 0;
    Object v12 = ((org.joda.time.DurationField)v9).subtract((((java.lang.Long)v10).longValue()),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 6L;
    Object v9 = 0;
    Object v10 = ((org.joda.time.DurationField)v7).subtract((((java.lang.Long)v8).longValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = 38L;
    Object v3 = 0L;
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v1).getValue((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 1L;
    Object v9 = 11L;
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v7).getDifference((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).getUnitMillis();
    org.junit.Assert.assertEquals((Object)(0L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).getType();
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v10 = -46L;
    Object v11 = 1;
    Object v12 = ((org.joda.time.DurationField)v9).subtract((((java.lang.Long)v10).longValue()),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).getType();
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v10 = org.joda.time.DurationFieldType.days();
    Object v11 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v10));
    Object v12 = ((org.joda.time.field.UnsupportedDurationField)v11).getUnitMillis();
    Object v13 = ((org.joda.time.field.UnsupportedDurationField)v9).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).hashCode();
    Object v9 = org.joda.time.DurationFieldType.days();
    Object v10 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v9));
    Object v11 = ((org.joda.time.field.UnsupportedDurationField)v10).getUnitMillis();
    Object v12 = ((org.joda.time.field.UnsupportedDurationField)v7).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = org.joda.time.DurationFieldType.days();
    Object v9 = ((org.joda.time.field.UnsupportedDurationField)v7).equals(((java.lang.Object)v8));
    Object v10 = org.joda.time.DurationFieldType.days();
    Object v11 = 46;
    Object v12 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v11).intValue()));
    Object v13 = new org.joda.time.DateTime();
    Object v14 = 1;
    Object v15 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v12),((org.joda.time.ReadableInstant)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.joda.time.DurationFieldType)v10).isSupported(((org.joda.time.Chronology)v15));
    Object v17 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v10));
    Object v18 = ((org.joda.time.field.UnsupportedDurationField)v17).hashCode();
    Object v19 = ((org.joda.time.field.UnsupportedDurationField)v7).equals(((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).getType();
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v10 = org.joda.time.DurationFieldType.days();
    Object v11 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v10));
    Object v12 = ((org.joda.time.field.UnsupportedDurationField)v11).toString();
    Object v13 = ((org.joda.time.field.UnsupportedDurationField)v9).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).getType();
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v10 = ((org.joda.time.DurationField)v9).isPrecise();
    Object v11 = -26L;
    Object v12 = 4;
    Object v13 = ((org.joda.time.DurationField)v9).subtract((((java.lang.Long)v11).longValue()),(((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 5L;
    Object v9 = -54L;
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v7).getMillis((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).getType();
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v9).getType();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 1L;
    Object v9 = 0L;
    Object v10 = ((org.joda.time.DurationField)v7).subtract((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 1L;
    Object v9 = 1L;
    Object v10 = ((org.joda.time.DurationField)v7).subtract((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 3L;
    Object v9 = -73;
    Object v10 = ((org.joda.time.DurationField)v7).subtract((((java.lang.Long)v8).longValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 1L;
    Object v9 = 24L;
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v7).add((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = -42L;
    Object v9 = -3L;
    Object v10 = ((org.joda.time.DurationField)v7).subtract((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 14L;
    Object v9 = -2L;
    Object v10 = ((org.joda.time.DurationField)v7).subtract((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = ((org.joda.time.DurationField)v7).toString();
    Object v9 = 32L;
    Object v10 = 59L;
    Object v11 = ((org.joda.time.DurationField)v7).subtract((((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = 0L;
    Object v9 = 1L;
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v7).getDifference((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.days();
    Object v1 = 46;
    Object v2 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.DateTime();
    Object v4 = 1;
    Object v5 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v2),((org.joda.time.ReadableInstant)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v8 = org.joda.time.DurationFieldType.days();
    Object v9 = 46;
    Object v10 = org.joda.time.DateTimeZone.forOffsetMillis((((java.lang.Integer)v9).intValue()));
    Object v11 = new org.joda.time.DateTime();
    Object v12 = 1;
    Object v13 = org.joda.time.chrono.GJChronology.getInstance(((org.joda.time.DateTimeZone)v10),((org.joda.time.ReadableInstant)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.DurationFieldType)v8).isSupported(((org.joda.time.Chronology)v13));
    Object v15 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v16 = ((org.joda.time.field.UnsupportedDurationField)v15).hashCode();
    Object v17 = org.joda.time.DurationFieldType.days();
    Object v18 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v17));
    Object v19 = ((org.joda.time.field.UnsupportedDurationField)v18).getUnitMillis();
    Object v20 = ((org.joda.time.field.UnsupportedDurationField)v15).equals(((java.lang.Object)v19));
    Object v21 = ((org.joda.time.field.UnsupportedDurationField)v7).equals(((java.lang.Object)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }
}
