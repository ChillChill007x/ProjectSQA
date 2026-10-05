package org.joda.time.field;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = -14L;
    Object v8 = "The field must be supported";
    Object v9 = ((org.joda.time.field.DelegatedDateTimeField)v6).set((((java.lang.Long)v7).longValue()),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).getRangeDurationField();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = -26;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v7).intValue()));
    Object v9 = new org.joda.time.LocalDate(((org.joda.time.DateTimeZone)v8));
    Object v10 = new int[]{0,4};
    Object v11 = ((org.joda.time.field.DelegatedDateTimeField)v6).getMinimumValue(((org.joda.time.ReadablePartial)v9),((int[])v10));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = -26;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v7).intValue()));
    Object v9 = new org.joda.time.LocalDate(((org.joda.time.DateTimeZone)v8));
    Object v10 = 0L;
    Object v11 = new org.joda.time.MutableDateTime((((java.lang.Long)v10).longValue()));
    Object v12 = ((org.joda.time.ReadablePartial)v9).toDateTime(((org.joda.time.ReadableInstant)v11));
    Object v13 = new int[]{0};
    Object v14 = ((org.joda.time.field.DelegatedDateTimeField)v6).getMaximumValue(((org.joda.time.ReadablePartial)v9),((int[])v13));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).isSupported();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).getDurationField();
    Object v8 = ((org.joda.time.field.DelegatedDateTimeField)v6).getLeapDurationField();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).isSupported();
    Object v8 = ((org.joda.time.field.DelegatedDateTimeField)v6).getMaximumValue();
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = -26;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v7).intValue()));
    Object v9 = new org.joda.time.LocalDate(((org.joda.time.DateTimeZone)v8));
    Object v10 = -28;
    Object v11 = new int[]{0,49,0};
    Object v12 = 0;
    Object v13 = ((org.joda.time.field.DelegatedDateTimeField)v6).add(((org.joda.time.ReadablePartial)v9),(((java.lang.Integer)v10).intValue()),((int[])v11),(((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = -26;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v7).intValue()));
    Object v9 = new org.joda.time.LocalDate(((org.joda.time.DateTimeZone)v8));
    Object v10 = java.util.Locale.Category.FORMAT;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = ((org.joda.time.field.DelegatedDateTimeField)v6).getAsText(((org.joda.time.ReadablePartial)v9),((java.util.Locale)v11));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = -13L;
    Object v8 = ((org.joda.time.field.DelegatedDateTimeField)v6).remainder((((java.lang.Long)v7).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = -47L;
    Object v8 = 19L;
    Object v9 = ((org.joda.time.field.DelegatedDateTimeField)v6).getDifference((((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
    org.junit.Assert.assertEquals((Object)(-66), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).getWrappedField();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v9 = ((org.joda.time.field.DelegatedDateTimeField)v8).getName();
    org.junit.Assert.assertEquals((Object)("year"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = 10L;
    Object v8 = 3L;
    Object v9 = ((org.joda.time.field.DelegatedDateTimeField)v6).getDifference((((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
    Object v10 = java.util.Locale.Category.FORMAT;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = ((org.joda.time.field.DelegatedDateTimeField)v6).getMaximumShortTextLength(((java.util.Locale)v11));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.Chronology)v7).halfdays();
    Object v9 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = -26;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v7).intValue()));
    Object v9 = new org.joda.time.LocalDate(((org.joda.time.DateTimeZone)v8));
    Object v10 = 0;
    Object v11 = new int[]{-8};
    Object v12 = 7;
    Object v13 = ((org.joda.time.field.DelegatedDateTimeField)v6).add(((org.joda.time.ReadablePartial)v9),(((java.lang.Integer)v10).intValue()),((int[])v11),(((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = 0L;
    Object v8 = 14L;
    Object v9 = ((org.joda.time.field.DelegatedDateTimeField)v6).add((((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
    Object v10 = -26;
    Object v11 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v10).intValue()));
    Object v12 = new org.joda.time.LocalDate(((org.joda.time.DateTimeZone)v11));
    Object v13 = 1;
    Object v14 = new int[]{};
    Object v15 = 16;
    Object v16 = ((org.joda.time.field.DelegatedDateTimeField)v6).set(((org.joda.time.ReadablePartial)v12),(((java.lang.Integer)v13).intValue()),((int[])v14),(((java.lang.Integer)v15).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = 3L;
    Object v8 = ((org.joda.time.field.DelegatedDateTimeField)v6).remainder((((java.lang.Long)v7).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v10 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v8),((org.joda.time.Chronology)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = 13;
    Object v8 = java.util.Locale.Category.FORMAT;
    Object v9 = java.util.Locale.getDefault(((java.util.Locale.Category)v8));
    Object v10 = ((org.joda.time.field.DelegatedDateTimeField)v6).getAsShortText((((java.lang.Integer)v7).intValue()),((java.util.Locale)v9));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.Chronology)v7).halfdays();
    Object v9 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v10 = ((org.joda.time.field.DelegatedDateTimeField)v9).getDurationField();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v9 = ((org.joda.time.field.DelegatedDateTimeField)v8).getRangeDurationField();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).getLeapDurationField();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).isSupported();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = -26;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v7).intValue()));
    Object v9 = new org.joda.time.LocalDate(((org.joda.time.DateTimeZone)v8));
    Object v10 = org.joda.time.DateTimeFieldType.year();
    Object v11 = ((org.joda.time.ReadablePartial)v9).isSupported(((org.joda.time.DateTimeFieldType)v10));
    Object v12 = java.util.Locale.Category.FORMAT;
    Object v13 = java.util.Locale.getDefault(((java.util.Locale.Category)v12));
    Object v14 = ((java.util.Locale)v13).getDisplayName();
    Object v15 = ((org.joda.time.field.DelegatedDateTimeField)v6).getAsShortText(((org.joda.time.ReadablePartial)v9),((java.util.Locale)v13));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.Chronology)v7).halfdays();
    Object v9 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v10 = ((org.joda.time.field.DelegatedDateTimeField)v9).getDurationField();
    Object v11 = -38L;
    Object v12 = java.util.Locale.Category.FORMAT;
    Object v13 = java.util.Locale.getDefault(((java.util.Locale.Category)v12));
    Object v14 = ((org.joda.time.field.DelegatedDateTimeField)v9).getAsText((((java.lang.Long)v11).longValue()),((java.util.Locale)v13));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = -49L;
    Object v8 = "";
    Object v9 = ((org.joda.time.field.DelegatedDateTimeField)v6).set((((java.lang.Long)v7).longValue()),((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = -26;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v7).intValue()));
    Object v9 = new org.joda.time.LocalDate(((org.joda.time.DateTimeZone)v8));
    Object v10 = 0;
    Object v11 = new int[]{-7};
    Object v12 = 16;
    Object v13 = ((org.joda.time.field.DelegatedDateTimeField)v6).addWrapPartial(((org.joda.time.ReadablePartial)v9),(((java.lang.Integer)v10).intValue()),((int[])v11),(((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v9 = -16L;
    Object v10 = java.util.Locale.Category.FORMAT;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = ((org.joda.time.field.DelegatedDateTimeField)v8).getAsText((((java.lang.Long)v9).longValue()),((java.util.Locale)v11));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = -32L;
    Object v8 = -22;
    Object v9 = ((org.joda.time.field.DelegatedDateTimeField)v6).add((((java.lang.Long)v7).longValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 1L;
    Object v11 = ((org.joda.time.field.DelegatedDateTimeField)v6).getMinimumValue((((java.lang.Long)v10).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = -26;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v7).intValue()));
    Object v9 = new org.joda.time.LocalDate(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.ReadablePartial)v9).toString();
    Object v11 = java.util.Locale.Category.FORMAT;
    Object v12 = java.util.Locale.getDefault(((java.util.Locale.Category)v11));
    Object v13 = ((org.joda.time.field.DelegatedDateTimeField)v6).getAsShortText(((org.joda.time.ReadablePartial)v9),((java.util.Locale)v12));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = -26;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v7).intValue()));
    Object v9 = new org.joda.time.LocalDate(((org.joda.time.DateTimeZone)v8));
    Object v10 = 1;
    Object v11 = new int[]{0,-26,1};
    Object v12 = 0;
    Object v13 = ((org.joda.time.field.DelegatedDateTimeField)v6).set(((org.joda.time.ReadablePartial)v9),(((java.lang.Integer)v10).intValue()),((int[])v11),(((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v9 = ((org.joda.time.field.DelegatedDateTimeField)v8).toString();
    org.junit.Assert.assertEquals((Object)("DateTimeField[year]"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v9 = -1L;
    Object v10 = 10;
    Object v11 = ((org.joda.time.field.LenientDateTimeField)v8).set((((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = -26;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v7).intValue()));
    Object v9 = new org.joda.time.LocalDate(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.ReadablePartial)v9).size();
    Object v11 = java.util.Locale.Category.FORMAT;
    Object v12 = java.util.Locale.getDefault(((java.util.Locale.Category)v11));
    Object v13 = ((org.joda.time.field.DelegatedDateTimeField)v6).getAsShortText(((org.joda.time.ReadablePartial)v9),((java.util.Locale)v12));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v9 = java.util.Locale.Category.FORMAT;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = ((org.joda.time.field.DelegatedDateTimeField)v8).getMaximumTextLength(((java.util.Locale)v10));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = 0L;
    Object v8 = ((org.joda.time.field.DelegatedDateTimeField)v6).getMaximumValue((((java.lang.Long)v7).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = -26;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v7).intValue()));
    Object v9 = new org.joda.time.LocalDate(((org.joda.time.DateTimeZone)v8));
    Object v10 = -21;
    Object v11 = new int[]{0,7};
    Object v12 = "Seconds";
    Object v13 = java.util.Locale.Category.FORMAT;
    Object v14 = java.util.Locale.getDefault(((java.util.Locale.Category)v13));
    Object v15 = ((org.joda.time.field.DelegatedDateTimeField)v6).set(((org.joda.time.ReadablePartial)v9),(((java.lang.Integer)v10).intValue()),((int[])v11),((java.lang.String)v12),((java.util.Locale)v14));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v9 = ((org.joda.time.field.DelegatedDateTimeField)v8).getDurationField();
    Object v10 = -26;
    Object v11 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v10).intValue()));
    Object v12 = new org.joda.time.LocalDate(((org.joda.time.DateTimeZone)v11));
    Object v13 = java.util.Locale.Category.FORMAT;
    Object v14 = java.util.Locale.getDefault(((java.util.Locale.Category)v13));
    Object v15 = ((org.joda.time.field.DelegatedDateTimeField)v8).getAsShortText(((org.joda.time.ReadablePartial)v12),((java.util.Locale)v14));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v10 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v8),((org.joda.time.Chronology)v9));
    Object v11 = ((org.joda.time.field.DelegatedDateTimeField)v10).getMinimumValue();
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v9 = 9L;
    Object v10 = 0L;
    Object v11 = ((org.joda.time.field.DelegatedDateTimeField)v8).add((((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
    Object v12 = -26;
    Object v13 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v12).intValue()));
    Object v14 = new org.joda.time.LocalDate(((org.joda.time.DateTimeZone)v13));
    Object v15 = ((org.joda.time.field.DelegatedDateTimeField)v8).getMaximumValue(((org.joda.time.ReadablePartial)v14));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = -5L;
    Object v8 = 24L;
    Object v9 = ((org.joda.time.field.DelegatedDateTimeField)v6).getDifferenceAsLong((((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
    Object v10 = 7L;
    Object v11 = 58L;
    Object v12 = ((org.joda.time.field.DelegatedDateTimeField)v6).getDifference((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()));
    org.junit.Assert.assertEquals((Object)(-51), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = 8L;
    Object v8 = ((org.joda.time.field.DelegatedDateTimeField)v6).getAsShortText((((java.lang.Long)v7).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v10 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v8),((org.joda.time.Chronology)v9));
    Object v11 = 1L;
    Object v12 = ((org.joda.time.field.DelegatedDateTimeField)v10).getMaximumValue((((java.lang.Long)v11).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).getWrappedField();
    Object v8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v9 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v7),((org.joda.time.Chronology)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = -23L;
    Object v8 = 0L;
    Object v9 = ((org.joda.time.field.DelegatedDateTimeField)v6).getDifferenceAsLong((((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
    Object v10 = -26;
    Object v11 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v10).intValue()));
    Object v12 = new org.joda.time.LocalDate(((org.joda.time.DateTimeZone)v11));
    Object v13 = java.util.Locale.Category.FORMAT;
    Object v14 = java.util.Locale.getDefault(((java.util.Locale.Category)v13));
    Object v15 = ((org.joda.time.field.DelegatedDateTimeField)v6).getAsShortText(((org.joda.time.ReadablePartial)v12),((java.util.Locale)v14));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).getWrappedField();
    Object v8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v9 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v7),((org.joda.time.Chronology)v8));
    Object v10 = -26;
    Object v11 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v10).intValue()));
    Object v12 = new org.joda.time.LocalDate(((org.joda.time.DateTimeZone)v11));
    Object v13 = 26;
    Object v14 = java.util.Locale.Category.FORMAT;
    Object v15 = java.util.Locale.getDefault(((java.util.Locale.Category)v14));
    Object v16 = ((org.joda.time.field.DelegatedDateTimeField)v9).getAsText(((org.joda.time.ReadablePartial)v12),(((java.lang.Integer)v13).intValue()),((java.util.Locale)v15));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = -23;
    Object v8 = java.util.Locale.Category.FORMAT;
    Object v9 = java.util.Locale.getDefault(((java.util.Locale.Category)v8));
    Object v10 = ((java.util.Locale)v9).getISO3Country();
    Object v11 = ((org.joda.time.field.DelegatedDateTimeField)v6).getAsText((((java.lang.Integer)v7).intValue()),((java.util.Locale)v9));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.Chronology)v7).halfdays();
    Object v9 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v10 = 100;
    Object v11 = java.util.Locale.Category.FORMAT;
    Object v12 = java.util.Locale.getDefault(((java.util.Locale.Category)v11));
    Object v13 = ((org.joda.time.field.DelegatedDateTimeField)v9).getAsShortText((((java.lang.Integer)v10).intValue()),((java.util.Locale)v12));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.Chronology)v7).halfdays();
    Object v9 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v10 = 31L;
    Object v11 = java.util.Locale.Category.FORMAT;
    Object v12 = java.util.Locale.getDefault(((java.util.Locale.Category)v11));
    Object v13 = ((org.joda.time.field.DelegatedDateTimeField)v9).getAsShortText((((java.lang.Long)v10).longValue()),((java.util.Locale)v12));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).getWrappedField();
    Object v8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v9 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v7),((org.joda.time.Chronology)v8));
    Object v10 = ((org.joda.time.field.DelegatedDateTimeField)v9).getMinimumValue();
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.Chronology)v7).halfdays();
    Object v9 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v10 = -26;
    Object v11 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v10).intValue()));
    Object v12 = new org.joda.time.LocalDate(((org.joda.time.DateTimeZone)v11));
    Object v13 = new int[]{0,1};
    Object v14 = ((org.joda.time.field.DelegatedDateTimeField)v9).getMaximumValue(((org.joda.time.ReadablePartial)v12),((int[])v13));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v9 = ((org.joda.time.field.LenientDateTimeField)v8).isLenient();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).getLeapDurationField();
    Object v8 = ((org.joda.time.field.DelegatedDateTimeField)v6).getMinimumValue();
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v9 = -26;
    Object v10 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v9).intValue()));
    Object v11 = new org.joda.time.LocalDate(((org.joda.time.DateTimeZone)v10));
    Object v12 = org.joda.time.DateTimeFieldType.year();
    Object v13 = org.joda.time.DurationFieldType.minutes();
    Object v14 = 1L;
    Object v15 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v13),(((java.lang.Long)v14).longValue()));
    Object v16 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v12),((org.joda.time.DurationField)v15));
    Object v17 = ((org.joda.time.ReadablePartial)v11).equals(((java.lang.Object)v16));
    Object v18 = -47;
    Object v19 = java.util.Locale.Category.FORMAT;
    Object v20 = java.util.Locale.getDefault(((java.util.Locale.Category)v19));
    Object v21 = java.util.Locale.Category.FORMAT;
    Object v22 = java.util.Locale.getDefault(((java.util.Locale.Category)v21));
    Object v23 = ((java.util.Locale)v20).getDisplayVariant(((java.util.Locale)v22));
    Object v24 = ((org.joda.time.field.DelegatedDateTimeField)v8).getAsText(((org.joda.time.ReadablePartial)v11),(((java.lang.Integer)v18).intValue()),((java.util.Locale)v20));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = 1L;
    Object v8 = "The date must not be null";
    Object v9 = java.util.Locale.Category.FORMAT;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = ((org.joda.time.field.DelegatedDateTimeField)v6).set((((java.lang.Long)v7).longValue()),((java.lang.String)v8),((java.util.Locale)v10));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = 0L;
    Object v8 = ((org.joda.time.field.DelegatedDateTimeField)v6).get((((java.lang.Long)v7).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = java.util.Locale.Category.FORMAT;
    Object v8 = java.util.Locale.getDefault(((java.util.Locale.Category)v7));
    Object v9 = ((org.joda.time.field.DelegatedDateTimeField)v6).getMaximumShortTextLength(((java.util.Locale)v8));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v9 = -26;
    Object v10 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v9).intValue()));
    Object v11 = new org.joda.time.LocalDate(((org.joda.time.DateTimeZone)v10));
    Object v12 = ((org.joda.time.ReadablePartial)v11).getChronology();
    Object v13 = ((org.joda.time.field.DelegatedDateTimeField)v8).getMaximumValue(((org.joda.time.ReadablePartial)v11));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).toString();
    Object v8 = 22L;
    Object v9 = 1;
    Object v10 = ((org.joda.time.field.DelegatedDateTimeField)v6).addWrapField((((java.lang.Long)v8).longValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = -15L;
    Object v8 = ((org.joda.time.field.DelegatedDateTimeField)v6).isLeap((((java.lang.Long)v7).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = 1L;
    Object v8 = 1L;
    Object v9 = ((org.joda.time.field.DelegatedDateTimeField)v6).add((((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
    org.junit.Assert.assertEquals((Object)(2L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v9 = -20L;
    Object v10 = 1;
    Object v11 = ((org.joda.time.field.DelegatedDateTimeField)v8).addWrapField((((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = -26;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v7).intValue()));
    Object v9 = new org.joda.time.LocalDate(((org.joda.time.DateTimeZone)v8));
    Object v10 = new int[]{};
    Object v11 = ((org.joda.time.field.DelegatedDateTimeField)v6).getMinimumValue(((org.joda.time.ReadablePartial)v9),((int[])v10));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).getWrappedField();
    Object v8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v9 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v7),((org.joda.time.Chronology)v8));
    Object v10 = ((org.joda.time.field.DelegatedDateTimeField)v9).getLeapDurationField();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.Chronology)v7).halfdays();
    Object v9 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v10 = 0;
    Object v11 = java.util.Locale.Category.FORMAT;
    Object v12 = java.util.Locale.getDefault(((java.util.Locale.Category)v11));
    Object v13 = ((org.joda.time.field.DelegatedDateTimeField)v9).getAsText((((java.lang.Integer)v10).intValue()),((java.util.Locale)v12));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v9 = 0L;
    Object v10 = java.util.Locale.Category.FORMAT;
    Object v11 = java.util.Locale.getDefault(((java.util.Locale.Category)v10));
    Object v12 = ((org.joda.time.field.DelegatedDateTimeField)v8).getAsShortText((((java.lang.Long)v9).longValue()),((java.util.Locale)v11));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = 2L;
    Object v8 = "Invalid index: ";
    Object v9 = java.util.Locale.Category.FORMAT;
    Object v10 = java.util.Locale.getDefault(((java.util.Locale.Category)v9));
    Object v11 = ((org.joda.time.field.DelegatedDateTimeField)v6).set((((java.lang.Long)v7).longValue()),((java.lang.String)v8),((java.util.Locale)v10));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).getWrappedField();
    Object v8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v9 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v7),((org.joda.time.Chronology)v8));
    Object v10 = ((org.joda.time.field.DelegatedDateTimeField)v9).isLenient();
    Object v11 = 1L;
    Object v12 = ((org.joda.time.field.DelegatedDateTimeField)v9).roundFloor((((java.lang.Long)v11).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v10 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v8),((org.joda.time.Chronology)v9));
    Object v11 = ((org.joda.time.field.DelegatedDateTimeField)v10).getLeapDurationField();
    Object v12 = 18L;
    Object v13 = ((org.joda.time.field.DelegatedDateTimeField)v10).roundHalfFloor((((java.lang.Long)v12).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = 21L;
    Object v8 = java.util.Locale.Category.FORMAT;
    Object v9 = java.util.Locale.getDefault(((java.util.Locale.Category)v8));
    Object v10 = ((org.joda.time.field.DelegatedDateTimeField)v6).getAsShortText((((java.lang.Long)v7).longValue()),((java.util.Locale)v9));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).toString();
    org.junit.Assert.assertEquals((Object)("DateTimeField[year]"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).getWrappedField();
    Object v8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v9 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v7),((org.joda.time.Chronology)v8));
    Object v10 = 1L;
    Object v11 = ((org.joda.time.field.DelegatedDateTimeField)v9).roundHalfCeiling((((java.lang.Long)v10).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).getWrappedField();
    Object v8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v9 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v7),((org.joda.time.Chronology)v8));
    Object v10 = 1L;
    Object v11 = 0;
    Object v12 = ((org.joda.time.field.DelegatedDateTimeField)v9).add((((java.lang.Long)v10).longValue()),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertEquals((Object)(1L), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = -68L;
    Object v8 = 28;
    Object v9 = ((org.joda.time.field.LenientDateTimeField)v6).set((((java.lang.Long)v7).longValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = 59968L;
    Object v8 = ((org.joda.time.field.DelegatedDateTimeField)v6).roundHalfCeiling((((java.lang.Long)v7).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).getWrappedField();
    Object v8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v9 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v7),((org.joda.time.Chronology)v8));
    Object v10 = ((org.joda.time.field.DelegatedDateTimeField)v9).getDurationField();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = ((org.joda.time.DateTimeField)v6).getType();
    Object v8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v9 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = 1L;
    Object v8 = ((org.joda.time.field.DelegatedDateTimeField)v6).remainder((((java.lang.Long)v7).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).getDurationField();
    Object v8 = -16L;
    Object v9 = ((org.joda.time.field.DelegatedDateTimeField)v6).get((((java.lang.Long)v8).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v10 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v8),((org.joda.time.Chronology)v9));
    Object v11 = 12L;
    Object v12 = -45L;
    Object v13 = ((org.joda.time.field.DelegatedDateTimeField)v10).getDifferenceAsLong((((java.lang.Long)v11).longValue()),(((java.lang.Long)v12).longValue()));
    org.junit.Assert.assertEquals((Object)(57L), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v9 = 1L;
    Object v10 = ((org.joda.time.field.DelegatedDateTimeField)v8).getMinimumValue((((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = 1L;
    Object v8 = ((org.joda.time.field.DelegatedDateTimeField)v6).roundHalfCeiling((((java.lang.Long)v7).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).getName();
    org.junit.Assert.assertEquals((Object)("year"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = 0L;
    Object v8 = ((org.joda.time.field.DelegatedDateTimeField)v6).roundHalfEven((((java.lang.Long)v7).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = -26;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v7).intValue()));
    Object v9 = new org.joda.time.LocalDate(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.field.DelegatedDateTimeField)v6).getMinimumValue(((org.joda.time.ReadablePartial)v9));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = 1L;
    Object v8 = java.util.Locale.Category.FORMAT;
    Object v9 = java.util.Locale.getDefault(((java.util.Locale.Category)v8));
    Object v10 = ((java.util.Locale)v9).getDisplayLanguage();
    Object v11 = ((org.joda.time.field.DelegatedDateTimeField)v6).getAsShortText((((java.lang.Long)v7).longValue()),((java.util.Locale)v9));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = -26;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHours((((java.lang.Integer)v7).intValue()));
    Object v9 = new org.joda.time.LocalDate(((org.joda.time.DateTimeZone)v8));
    Object v10 = ((org.joda.time.field.DelegatedDateTimeField)v6).getMaximumValue(((org.joda.time.ReadablePartial)v9));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).getType();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).getMaximumValue();
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.Chronology)v7).halfdays();
    Object v9 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v10 = 1L;
    Object v11 = -1L;
    Object v12 = ((org.joda.time.field.DelegatedDateTimeField)v9).add((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = -20L;
    Object v8 = ((org.joda.time.field.DelegatedDateTimeField)v6).roundHalfFloor((((java.lang.Long)v7).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v6 = new org.joda.time.field.LenientDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v8 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v6),((org.joda.time.Chronology)v7));
    Object v9 = 0L;
    Object v10 = ((org.joda.time.field.DelegatedDateTimeField)v8).getMinimumValue((((java.lang.Long)v9).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).getRangeDurationField();
    Object v8 = 0L;
    Object v9 = ((org.joda.time.field.DelegatedDateTimeField)v6).getAsText((((java.lang.Long)v8).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = 7L;
    Object v8 = ((org.joda.time.field.DelegatedDateTimeField)v6).roundCeiling((((java.lang.Long)v7).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = ((org.joda.time.field.DelegatedDateTimeField)v6).getWrappedField();
    Object v8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v9 = org.joda.time.field.LenientDateTimeField.getInstance(((org.joda.time.DateTimeField)v7),((org.joda.time.Chronology)v8));
    Object v10 = -9L;
    Object v11 = ((org.joda.time.field.DelegatedDateTimeField)v9).roundFloor((((java.lang.Long)v10).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.minutes();
    Object v2 = 1L;
    Object v3 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v1),(((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v3));
    Object v5 = org.joda.time.DateTimeFieldType.year();
    Object v6 = new org.joda.time.field.DelegatedDateTimeField(((org.joda.time.DateTimeField)v4),((org.joda.time.DateTimeFieldType)v5));
    Object v7 = 1L;
    Object v8 = ((org.joda.time.field.DelegatedDateTimeField)v6).isLeap((((java.lang.Long)v7).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }
}
