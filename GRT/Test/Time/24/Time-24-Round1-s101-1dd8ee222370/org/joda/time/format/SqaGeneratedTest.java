package org.joda.time.format;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 12L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = java.util.Locale.forLanguageTag(((java.lang.String)v2));
    Object v4 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v3));
    Object v5 = ((org.joda.time.format.DateTimeParserBucket)v4).saveState();
    Object v6 = ((org.joda.time.format.DateTimeParserBucket)v4).saveState();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.seconds();
    Object v1 = -30L;
    Object v2 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v0),(((java.lang.Long)v1).longValue()));
    Object v3 = org.joda.time.DurationFieldType.seconds();
    Object v4 = -30L;
    Object v5 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = ((org.joda.time.DurationField)v5).getType();
    Object v7 = org.joda.time.format.DateTimeParserBucket.compareReverse(((org.joda.time.DurationField)v2),((org.joda.time.DurationField)v5));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 12L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = java.util.Locale.forLanguageTag(((java.lang.String)v2));
    Object v4 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v3));
    Object v5 = ((org.joda.time.format.DateTimeParserBucket)v4).saveState();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 14L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = java.util.Locale.forLanguageTag(((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = 32;
    Object v6 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v3),((java.lang.Integer)v4),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 12L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = java.util.Locale.forLanguageTag(((java.lang.String)v2));
    Object v4 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v3));
    Object v5 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v6 = 0;
    ((org.joda.time.format.DateTimeParserBucket)v4).saveField(((org.joda.time.DateTimeFieldType)v5),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    Object v8 = org.joda.time.DateTimeZone.getDefault();
    Object v9 = ((org.joda.time.DateTimeZone)v8).isFixed();
    ((org.joda.time.format.DateTimeParserBucket)v4).setZone(((org.joda.time.DateTimeZone)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 14L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = java.util.Locale.forLanguageTag(((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = 32;
    Object v6 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v3),((java.lang.Integer)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v8 = 3;
    ((org.joda.time.format.DateTimeParserBucket)v6).saveField(((org.joda.time.DateTimeFieldType)v7),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = true;
    Object v11 = "ReadablePartial objects must have the same set of fields";
    Object v12 = ((org.joda.time.format.DateTimeParserBucket)v6).computeMillis((((java.lang.Boolean)v10).booleanValue()),((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(-52205817600000L), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 12L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = java.util.Locale.forLanguageTag(((java.lang.String)v2));
    Object v4 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v3));
    Object v5 = org.joda.time.DurationFieldType.seconds();
    Object v6 = -30L;
    Object v7 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = ((org.joda.time.format.DateTimeParserBucket)v4).restoreState(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 14L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = java.util.Locale.forLanguageTag(((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = 32;
    Object v6 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v3),((java.lang.Integer)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v8 = ((org.joda.time.format.DateTimeParserBucket)v6).restoreState(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 14L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = java.util.Locale.forLanguageTag(((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = 32;
    Object v6 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v3),((java.lang.Integer)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = false;
    Object v8 = ((org.joda.time.format.DateTimeParserBucket)v6).computeMillis((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    ((org.joda.time.format.DateTimeParserBucket)v6).setZone(((org.joda.time.DateTimeZone)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 12L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = java.util.Locale.forLanguageTag(((java.lang.String)v2));
    Object v4 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v3));
    Object v5 = 0;
    ((org.joda.time.format.DateTimeParserBucket)v4).setPivotYear(((java.lang.Integer)v5));
    Object v6 = null;
    Object v7 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v8 = org.joda.time.DurationFieldType.seconds();
    Object v9 = -30L;
    Object v10 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v8),(((java.lang.Long)v9).longValue()));
    Object v11 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v7),((org.joda.time.DurationField)v10));
    Object v12 = -8;
    ((org.joda.time.format.DateTimeParserBucket)v4).saveField(((org.joda.time.DateTimeField)v11),(((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 12L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = java.util.Locale.forLanguageTag(((java.lang.String)v2));
    Object v4 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v3));
    Object v5 = true;
    Object v6 = "m";
    Object v7 = ((org.joda.time.format.DateTimeParserBucket)v4).computeMillis((((java.lang.Boolean)v5).booleanValue()),((java.lang.String)v6));
    Object v8 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v9 = ((org.joda.time.DateTimeFieldType)v8).getRangeDurationType();
    Object v10 = "";
    Object v11 = "The DateTimeFieldType must not be null";
    Object v12 = java.util.Locale.forLanguageTag(((java.lang.String)v11));
    ((org.joda.time.format.DateTimeParserBucket)v4).saveField(((org.joda.time.DateTimeFieldType)v8),((java.lang.String)v10),((java.util.Locale)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 14L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = java.util.Locale.forLanguageTag(((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = 32;
    Object v6 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v3),((java.lang.Integer)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.joda.time.format.DateTimeParserBucket)v6).getLocale();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 14L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = java.util.Locale.forLanguageTag(((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = 32;
    Object v6 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v3),((java.lang.Integer)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.DateTimeZone.getDefault();
    Object v8 = ((org.joda.time.DateTimeZone)v7).hashCode();
    ((org.joda.time.format.DateTimeParserBucket)v6).setZone(((org.joda.time.DateTimeZone)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 14L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = java.util.Locale.forLanguageTag(((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = 32;
    Object v6 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v3),((java.lang.Integer)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.DurationFieldType.seconds();
    Object v8 = ((org.joda.time.format.DateTimeParserBucket)v6).restoreState(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.seconds();
    Object v1 = -30L;
    Object v2 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v0),(((java.lang.Long)v1).longValue()));
    Object v3 = org.joda.time.DurationFieldType.seconds();
    Object v4 = -30L;
    Object v5 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = 8L;
    Object v7 = 0L;
    Object v8 = ((org.joda.time.DurationField)v5).getValue((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()));
    Object v9 = org.joda.time.format.DateTimeParserBucket.compareReverse(((org.joda.time.DurationField)v2),((org.joda.time.DurationField)v5));
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 0L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.Chronology)v1).toString();
    Object v3 = "The DateTimeFieldType must not be null";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = 3;
    Object v7 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v4),((java.lang.Integer)v5),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 0L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.Chronology)v1).toString();
    Object v3 = "The DateTimeFieldType must not be null";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = 3;
    Object v7 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v4),((java.lang.Integer)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.DateTimeZone.getDefault();
    ((org.joda.time.format.DateTimeParserBucket)v7).setZone(((org.joda.time.DateTimeZone)v8));
    Object v9 = null;
    Object v10 = ((org.joda.time.format.DateTimeParserBucket)v7).getLocale();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 0L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.Chronology)v1).toString();
    Object v3 = "The DateTimeFieldType must not be null";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = 3;
    Object v7 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v4),((java.lang.Integer)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v9 = 22;
    ((org.joda.time.format.DateTimeParserBucket)v7).saveField(((org.joda.time.DateTimeFieldType)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = -67;
    ((org.joda.time.format.DateTimeParserBucket)v7).setOffset((((java.lang.Integer)v11).intValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 0L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.Chronology)v1).toString();
    Object v3 = "The DateTimeFieldType must not be null";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = 3;
    Object v7 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v4),((java.lang.Integer)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = false;
    Object v9 = "The date must not be null";
    Object v10 = ((org.joda.time.format.DateTimeParserBucket)v7).computeMillis((((java.lang.Boolean)v8).booleanValue()),((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(0L), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 14L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = java.util.Locale.forLanguageTag(((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = 32;
    Object v6 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v3),((java.lang.Integer)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.joda.time.format.DateTimeParserBucket)v6).getOffset();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 4L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 8;
    Object v11 = 46;
    Object v12 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 12L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = java.util.Locale.forLanguageTag(((java.lang.String)v2));
    Object v4 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v3));
    Object v5 = org.joda.time.DateTimeZone.getDefault();
    ((org.joda.time.format.DateTimeParserBucket)v4).setZone(((org.joda.time.DateTimeZone)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 12L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = java.util.Locale.forLanguageTag(((java.lang.String)v2));
    Object v4 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v3));
    Object v5 = ((org.joda.time.format.DateTimeParserBucket)v4).getZone();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 4L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 8;
    Object v11 = 46;
    Object v12 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.joda.time.format.DateTimeParserBucket)v12).saveState();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 14L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = java.util.Locale.forLanguageTag(((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = 32;
    Object v6 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v3),((java.lang.Integer)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = true;
    Object v8 = "minimum";
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v6).computeMillis((((java.lang.Boolean)v7).booleanValue()),((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(14L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 4L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 8;
    Object v11 = 46;
    Object v12 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = false;
    Object v14 = ((org.joda.time.format.DateTimeParserBucket)v12).computeMillis((((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertEquals((Object)(4L), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 14L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = java.util.Locale.forLanguageTag(((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = 32;
    Object v6 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v3),((java.lang.Integer)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = 4;
    ((org.joda.time.format.DateTimeParserBucket)v6).setOffset((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = 1;
    ((org.joda.time.format.DateTimeParserBucket)v6).setPivotYear(((java.lang.Integer)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 14L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = java.util.Locale.forLanguageTag(((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = 32;
    Object v6 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v3),((java.lang.Integer)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.DateTimeZone.getDefault();
    ((org.joda.time.format.DateTimeParserBucket)v6).setZone(((org.joda.time.DateTimeZone)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 12L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = java.util.Locale.forLanguageTag(((java.lang.String)v2));
    Object v4 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v3));
    Object v5 = 17;
    ((org.joda.time.format.DateTimeParserBucket)v4).setPivotYear(((java.lang.Integer)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 4L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 8;
    Object v11 = 46;
    Object v12 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v14 = "(ull";
    Object v15 = 14L;
    Object v16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v17 = "The DateTimeFieldType must not be null";
    Object v18 = java.util.Locale.forLanguageTag(((java.lang.String)v17));
    Object v19 = 1;
    Object v20 = 32;
    Object v21 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v15).longValue()),((org.joda.time.Chronology)v16),((java.util.Locale)v18),((java.lang.Integer)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.joda.time.format.DateTimeParserBucket)v21).getLocale();
    ((org.joda.time.format.DateTimeParserBucket)v12).saveField(((org.joda.time.DateTimeFieldType)v13),((java.lang.String)v14),((java.util.Locale)v22));
    Object v23 = null;
    Object v24 = ((org.joda.time.format.DateTimeParserBucket)v12).getPivotYear();
    org.junit.Assert.assertEquals((Object)(8), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = -28L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 0L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = ((org.joda.time.Chronology)v3).toString();
    Object v5 = "The DateTimeFieldType must not be null";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = 3;
    Object v9 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v6),((java.lang.Integer)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.joda.time.DateTimeZone.getDefault();
    ((org.joda.time.format.DateTimeParserBucket)v9).setZone(((org.joda.time.DateTimeZone)v10));
    Object v11 = null;
    Object v12 = ((org.joda.time.format.DateTimeParserBucket)v9).getLocale();
    Object v13 = 0;
    Object v14 = 17;
    Object v15 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v12),((java.lang.Integer)v13),(((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 0L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.Chronology)v1).toString();
    Object v3 = "The DateTimeFieldType must not be null";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = 3;
    Object v7 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v4),((java.lang.Integer)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = "Y?";
    Object v10 = ((org.joda.time.format.DateTimeParserBucket)v7).computeMillis((((java.lang.Boolean)v8).booleanValue()),((java.lang.String)v9));
    Object v11 = 0;
    ((org.joda.time.format.DateTimeParserBucket)v7).setPivotYear(((java.lang.Integer)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 8L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 1;
    Object v11 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = -42L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 11;
    Object v11 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = -42L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 11;
    Object v11 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10));
    Object v12 = true;
    Object v13 = "null";
    Object v14 = ((org.joda.time.format.DateTimeParserBucket)v11).computeMillis((((java.lang.Boolean)v12).booleanValue()),((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(-42L), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 8L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 1;
    Object v11 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10));
    Object v12 = ((org.joda.time.format.DateTimeParserBucket)v11).getLocale();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 4L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 8;
    Object v11 = 46;
    Object v12 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.joda.time.format.DateTimeParserBucket)v12).getChronology();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 4L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 8;
    Object v11 = 46;
    Object v12 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = false;
    Object v14 = "UT";
    Object v15 = ((org.joda.time.format.DateTimeParserBucket)v12).computeMillis((((java.lang.Boolean)v13).booleanValue()),((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(4L), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = -28L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 0L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = ((org.joda.time.Chronology)v3).toString();
    Object v5 = "The DateTimeFieldType must not be null";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = 3;
    Object v9 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v6),((java.lang.Integer)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.joda.time.DateTimeZone.getDefault();
    ((org.joda.time.format.DateTimeParserBucket)v9).setZone(((org.joda.time.DateTimeZone)v10));
    Object v11 = null;
    Object v12 = ((org.joda.time.format.DateTimeParserBucket)v9).getLocale();
    Object v13 = 0;
    Object v14 = 17;
    Object v15 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v12),((java.lang.Integer)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = org.joda.time.DateTimeZone.getDefault();
    ((org.joda.time.format.DateTimeParserBucket)v15).setZone(((org.joda.time.DateTimeZone)v16));
    Object v17 = null;
    Object v18 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v19 = org.joda.time.DurationFieldType.seconds();
    Object v20 = -30L;
    Object v21 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v19),(((java.lang.Long)v20).longValue()));
    Object v22 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v18),((org.joda.time.DurationField)v21));
    Object v23 = 1;
    ((org.joda.time.format.DateTimeParserBucket)v15).saveField(((org.joda.time.DateTimeField)v22),(((java.lang.Integer)v23).intValue()));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 14L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = java.util.Locale.forLanguageTag(((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = 32;
    Object v6 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v3),((java.lang.Integer)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v8 = "ReadablePartial objects must be contiguous";
    Object v9 = 8L;
    Object v10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v11 = 14L;
    Object v12 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v13 = "The DateTimeFieldType must not be null";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = 1;
    Object v16 = 32;
    Object v17 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v11).longValue()),((org.joda.time.Chronology)v12),((java.util.Locale)v14),((java.lang.Integer)v15),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((org.joda.time.format.DateTimeParserBucket)v17).getLocale();
    Object v19 = 1;
    Object v20 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v9).longValue()),((org.joda.time.Chronology)v10),((java.util.Locale)v18),((java.lang.Integer)v19));
    Object v21 = ((org.joda.time.format.DateTimeParserBucket)v20).getLocale();
    ((org.joda.time.format.DateTimeParserBucket)v6).saveField(((org.joda.time.DateTimeFieldType)v7),((java.lang.String)v8),((java.util.Locale)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 4L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 8;
    Object v11 = 46;
    Object v12 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.joda.time.format.DateTimeParserBucket)v12).getPivotYear();
    org.junit.Assert.assertEquals((Object)(8), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = -42L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 11;
    Object v11 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10));
    Object v12 = false;
    Object v13 = "The partial must not ";
    Object v14 = ((org.joda.time.format.DateTimeParserBucket)v11).computeMillis((((java.lang.Boolean)v12).booleanValue()),((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(-42L), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.seconds();
    Object v1 = -30L;
    Object v2 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v0),(((java.lang.Long)v1).longValue()));
    Object v3 = org.joda.time.DurationFieldType.seconds();
    Object v4 = -30L;
    Object v5 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = org.joda.time.format.DateTimeParserBucket.compareReverse(((org.joda.time.DurationField)v2),((org.joda.time.DurationField)v5));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = -28L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 0L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = ((org.joda.time.Chronology)v3).toString();
    Object v5 = "The DateTimeFieldType must not be null";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = 3;
    Object v9 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v6),((java.lang.Integer)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.joda.time.DateTimeZone.getDefault();
    ((org.joda.time.format.DateTimeParserBucket)v9).setZone(((org.joda.time.DateTimeZone)v10));
    Object v11 = null;
    Object v12 = ((org.joda.time.format.DateTimeParserBucket)v9).getLocale();
    Object v13 = 0;
    Object v14 = 17;
    Object v15 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v12),((java.lang.Integer)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = true;
    Object v17 = "Magnitude of ad@ amount is too large: ";
    Object v18 = ((org.joda.time.format.DateTimeParserBucket)v15).computeMillis((((java.lang.Boolean)v16).booleanValue()),((java.lang.String)v17));
    org.junit.Assert.assertEquals((Object)(-28L), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 36L;
    Object v1 = 4L;
    Object v2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v3 = 14L;
    Object v4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v5 = "The DateTimeFieldType must not be null";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = 32;
    Object v9 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v3).longValue()),((org.joda.time.Chronology)v4),((java.util.Locale)v6),((java.lang.Integer)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.DateTimeParserBucket)v9).getLocale();
    Object v11 = 8;
    Object v12 = 46;
    Object v13 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v1).longValue()),((org.joda.time.Chronology)v2),((java.util.Locale)v10),((java.lang.Integer)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.format.DateTimeParserBucket)v13).getChronology();
    Object v15 = "The DateTimeFieldType must not be null";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = 0;
    Object v18 = -33;
    Object v19 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v14),((java.util.Locale)v16),((java.lang.Integer)v17),(((java.lang.Integer)v18).intValue()));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 0L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.Chronology)v1).toString();
    Object v3 = "The DateTimeFieldType must not be null";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = 3;
    Object v7 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v4),((java.lang.Integer)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = "The DateTimeFieldType must not be null";
    Object v10 = ((org.joda.time.format.DateTimeParserBucket)v7).computeMillis((((java.lang.Boolean)v8).booleanValue()),((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(0L), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = -42L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 11;
    Object v11 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10));
    Object v12 = ((org.joda.time.format.DateTimeParserBucket)v11).saveState();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = -42L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 11;
    Object v11 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10));
    Object v12 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v13 = "ConverterManager.alterDurationConverters";
    Object v14 = 8L;
    Object v15 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v16 = 14L;
    Object v17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v18 = "The DateTimeFieldType must not be null";
    Object v19 = java.util.Locale.forLanguageTag(((java.lang.String)v18));
    Object v20 = 1;
    Object v21 = 32;
    Object v22 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v16).longValue()),((org.joda.time.Chronology)v17),((java.util.Locale)v19),((java.lang.Integer)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((org.joda.time.format.DateTimeParserBucket)v22).getLocale();
    Object v24 = 1;
    Object v25 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v14).longValue()),((org.joda.time.Chronology)v15),((java.util.Locale)v23),((java.lang.Integer)v24));
    Object v26 = ((org.joda.time.format.DateTimeParserBucket)v25).getLocale();
    ((org.joda.time.format.DateTimeParserBucket)v11).saveField(((org.joda.time.DateTimeFieldType)v12),((java.lang.String)v13),((java.util.Locale)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 1L;
    Object v1 = 4L;
    Object v2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v3 = 14L;
    Object v4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v5 = "The DateTimeFieldType must not be null";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = 32;
    Object v9 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v3).longValue()),((org.joda.time.Chronology)v4),((java.util.Locale)v6),((java.lang.Integer)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.DateTimeParserBucket)v9).getLocale();
    Object v11 = 8;
    Object v12 = 46;
    Object v13 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v1).longValue()),((org.joda.time.Chronology)v2),((java.util.Locale)v10),((java.lang.Integer)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.format.DateTimeParserBucket)v13).getChronology();
    Object v15 = ((org.joda.time.Chronology)v14).minuteOfHour();
    Object v16 = 8L;
    Object v17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v18 = 14L;
    Object v19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v20 = "The DateTimeFieldType must not be null";
    Object v21 = java.util.Locale.forLanguageTag(((java.lang.String)v20));
    Object v22 = 1;
    Object v23 = 32;
    Object v24 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v18).longValue()),((org.joda.time.Chronology)v19),((java.util.Locale)v21),((java.lang.Integer)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((org.joda.time.format.DateTimeParserBucket)v24).getLocale();
    Object v26 = 1;
    Object v27 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v16).longValue()),((org.joda.time.Chronology)v17),((java.util.Locale)v25),((java.lang.Integer)v26));
    Object v28 = ((org.joda.time.format.DateTimeParserBucket)v27).getLocale();
    Object v29 = 1;
    Object v30 = 6;
    Object v31 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v14),((java.util.Locale)v28),((java.lang.Integer)v29),(((java.lang.Integer)v30).intValue()));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 1L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = -56;
    Object v11 = -56;
    Object v12 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = -42L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 11;
    Object v11 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10));
    Object v12 = org.joda.time.DateTimeZone.getDefault();
    ((org.joda.time.format.DateTimeParserBucket)v11).setZone(((org.joda.time.DateTimeZone)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 8L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 1;
    Object v11 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10));
    Object v12 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v13 = "The d";
    Object v14 = "The DateTimeFieldType must not be null";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    ((org.joda.time.format.DateTimeParserBucket)v11).saveField(((org.joda.time.DateTimeFieldType)v12),((java.lang.String)v13),((java.util.Locale)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 14L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = java.util.Locale.forLanguageTag(((java.lang.String)v2));
    Object v4 = 1;
    Object v5 = 32;
    Object v6 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v3),((java.lang.Integer)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = true;
    Object v8 = "ReadablePartial objects must ha)e the same set of fields";
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v6).computeMillis((((java.lang.Boolean)v7).booleanValue()),((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(14L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 36L;
    Object v1 = 4L;
    Object v2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v3 = 14L;
    Object v4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v5 = "The DateTimeFieldType must not be null";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = 32;
    Object v9 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v3).longValue()),((org.joda.time.Chronology)v4),((java.util.Locale)v6),((java.lang.Integer)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.DateTimeParserBucket)v9).getLocale();
    Object v11 = 8;
    Object v12 = 46;
    Object v13 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v1).longValue()),((org.joda.time.Chronology)v2),((java.util.Locale)v10),((java.lang.Integer)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.format.DateTimeParserBucket)v13).getChronology();
    Object v15 = "The DateTimeFieldType must not be null";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = 0;
    Object v18 = -33;
    Object v19 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v14),((java.util.Locale)v16),((java.lang.Integer)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = org.joda.time.DateTimeZone.getDefault();
    ((org.joda.time.format.DateTimeParserBucket)v19).setZone(((org.joda.time.DateTimeZone)v20));
    Object v21 = null;
    Object v22 = org.joda.time.DurationFieldType.seconds();
    Object v23 = ((org.joda.time.format.DateTimeParserBucket)v19).restoreState(((java.lang.Object)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 4L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 8;
    Object v11 = 46;
    Object v12 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = false;
    Object v14 = "resulting";
    Object v15 = ((org.joda.time.format.DateTimeParserBucket)v12).computeMillis((((java.lang.Boolean)v13).booleanValue()),((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(4L), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 1L;
    Object v1 = 4L;
    Object v2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v3 = 14L;
    Object v4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v5 = "The DateTimeFieldType must not be null";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = 32;
    Object v9 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v3).longValue()),((org.joda.time.Chronology)v4),((java.util.Locale)v6),((java.lang.Integer)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.DateTimeParserBucket)v9).getLocale();
    Object v11 = 8;
    Object v12 = 46;
    Object v13 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v1).longValue()),((org.joda.time.Chronology)v2),((java.util.Locale)v10),((java.lang.Integer)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.format.DateTimeParserBucket)v13).getChronology();
    Object v15 = 8L;
    Object v16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v17 = 14L;
    Object v18 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v19 = "The DateTimeFieldType must not be null";
    Object v20 = java.util.Locale.forLanguageTag(((java.lang.String)v19));
    Object v21 = 1;
    Object v22 = 32;
    Object v23 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v17).longValue()),((org.joda.time.Chronology)v18),((java.util.Locale)v20),((java.lang.Integer)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = ((org.joda.time.format.DateTimeParserBucket)v23).getLocale();
    Object v25 = 1;
    Object v26 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v15).longValue()),((org.joda.time.Chronology)v16),((java.util.Locale)v24),((java.lang.Integer)v25));
    Object v27 = ((org.joda.time.format.DateTimeParserBucket)v26).getLocale();
    Object v28 = 1;
    Object v29 = 1;
    Object v30 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v14),((java.util.Locale)v27),((java.lang.Integer)v28),(((java.lang.Integer)v29).intValue()));
    org.junit.Assert.assertNotNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.seconds();
    Object v1 = -30L;
    Object v2 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v0),(((java.lang.Long)v1).longValue()));
    Object v3 = org.joda.time.DurationFieldType.seconds();
    Object v4 = -30L;
    Object v5 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = -15L;
    Object v7 = ((org.joda.time.DurationField)v5).getValue((((java.lang.Long)v6).longValue()));
    Object v8 = org.joda.time.format.DateTimeParserBucket.compareReverse(((org.joda.time.DurationField)v2),((org.joda.time.DurationField)v5));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = -28L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 0L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = ((org.joda.time.Chronology)v3).toString();
    Object v5 = "The DateTimeFieldType must not be null";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = 3;
    Object v9 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v6),((java.lang.Integer)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.joda.time.DateTimeZone.getDefault();
    ((org.joda.time.format.DateTimeParserBucket)v9).setZone(((org.joda.time.DateTimeZone)v10));
    Object v11 = null;
    Object v12 = ((org.joda.time.format.DateTimeParserBucket)v9).getLocale();
    Object v13 = 0;
    Object v14 = 17;
    Object v15 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v12),((java.lang.Integer)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v17 = -26;
    ((org.joda.time.format.DateTimeParserBucket)v15).saveField(((org.joda.time.DateTimeFieldType)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = org.joda.time.DateTimeZone.getDefault();
    ((org.joda.time.format.DateTimeParserBucket)v15).setZone(((org.joda.time.DateTimeZone)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 8L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 1;
    Object v11 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10));
    Object v12 = org.joda.time.DateTimeZone.getDefault();
    Object v13 = 0L;
    Object v14 = ((org.joda.time.DateTimeZone)v12).convertUTCToLocal((((java.lang.Long)v13).longValue()));
    ((org.joda.time.format.DateTimeParserBucket)v11).setZone(((org.joda.time.DateTimeZone)v12));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 0L;
    Object v1 = 4L;
    Object v2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v3 = 14L;
    Object v4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v5 = "The DateTimeFieldType must not be null";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = 32;
    Object v9 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v3).longValue()),((org.joda.time.Chronology)v4),((java.util.Locale)v6),((java.lang.Integer)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.DateTimeParserBucket)v9).getLocale();
    Object v11 = 8;
    Object v12 = 46;
    Object v13 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v1).longValue()),((org.joda.time.Chronology)v2),((java.util.Locale)v10),((java.lang.Integer)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.format.DateTimeParserBucket)v13).getChronology();
    Object v15 = 0L;
    Object v16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v17 = ((org.joda.time.Chronology)v16).toString();
    Object v18 = "The DateTimeFieldType must not be null";
    Object v19 = java.util.Locale.forLanguageTag(((java.lang.String)v18));
    Object v20 = 0;
    Object v21 = 3;
    Object v22 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v15).longValue()),((org.joda.time.Chronology)v16),((java.util.Locale)v19),((java.lang.Integer)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = org.joda.time.DateTimeZone.getDefault();
    ((org.joda.time.format.DateTimeParserBucket)v22).setZone(((org.joda.time.DateTimeZone)v23));
    Object v24 = null;
    Object v25 = ((org.joda.time.format.DateTimeParserBucket)v22).getLocale();
    Object v26 = 3;
    Object v27 = 1;
    Object v28 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v14),((java.util.Locale)v25),((java.lang.Integer)v26),(((java.lang.Integer)v27).intValue()));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 4L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 8;
    Object v11 = 46;
    Object v12 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.joda.time.format.DateTimeParserBucket)v12).saveState();
    Object v14 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v15 = ((org.joda.time.format.DateTimeParserBucket)v12).restoreState(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 1L;
    Object v1 = 4L;
    Object v2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v3 = 14L;
    Object v4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v5 = "The DateTimeFieldType must not be null";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = 32;
    Object v9 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v3).longValue()),((org.joda.time.Chronology)v4),((java.util.Locale)v6),((java.lang.Integer)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.DateTimeParserBucket)v9).getLocale();
    Object v11 = 8;
    Object v12 = 46;
    Object v13 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v1).longValue()),((org.joda.time.Chronology)v2),((java.util.Locale)v10),((java.lang.Integer)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.format.DateTimeParserBucket)v13).getChronology();
    Object v15 = ((org.joda.time.Chronology)v14).months();
    Object v16 = 14L;
    Object v17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v18 = "The DateTimeFieldType must not be null";
    Object v19 = java.util.Locale.forLanguageTag(((java.lang.String)v18));
    Object v20 = 1;
    Object v21 = 32;
    Object v22 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v16).longValue()),((org.joda.time.Chronology)v17),((java.util.Locale)v19),((java.lang.Integer)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((org.joda.time.format.DateTimeParserBucket)v22).getLocale();
    Object v24 = 7;
    Object v25 = 9;
    Object v26 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v14),((java.util.Locale)v23),((java.lang.Integer)v24),(((java.lang.Integer)v25).intValue()));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 0L;
    Object v1 = 4L;
    Object v2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v3 = 14L;
    Object v4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v5 = "The DateTimeFieldType must not be null";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = 32;
    Object v9 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v3).longValue()),((org.joda.time.Chronology)v4),((java.util.Locale)v6),((java.lang.Integer)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.DateTimeParserBucket)v9).getLocale();
    Object v11 = 8;
    Object v12 = 46;
    Object v13 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v1).longValue()),((org.joda.time.Chronology)v2),((java.util.Locale)v10),((java.lang.Integer)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.format.DateTimeParserBucket)v13).getChronology();
    Object v15 = "The DateTimeFieldType must not be null";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = 0;
    Object v18 = 17;
    Object v19 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v14),((java.util.Locale)v16),((java.lang.Integer)v17),(((java.lang.Integer)v18).intValue()));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 0L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.Chronology)v1).toString();
    Object v3 = "The DateTimeFieldType must not be null";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = 3;
    Object v7 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v4),((java.lang.Integer)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.format.DateTimeParserBucket)v7).getZone();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 0L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.Chronology)v1).toString();
    Object v3 = "The DateTimeFieldType must not be null";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = 3;
    Object v7 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v4),((java.lang.Integer)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    Object v9 = "nThe DateTimeFieldType must not be null";
    Object v10 = ((org.joda.time.format.DateTimeParserBucket)v7).computeMillis((((java.lang.Boolean)v8).booleanValue()),((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(0L), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 106L;
    Object v1 = 4L;
    Object v2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v3 = 14L;
    Object v4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v5 = "The DateTimeFieldType must not be null";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = 32;
    Object v9 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v3).longValue()),((org.joda.time.Chronology)v4),((java.util.Locale)v6),((java.lang.Integer)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.DateTimeParserBucket)v9).getLocale();
    Object v11 = 8;
    Object v12 = 46;
    Object v13 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v1).longValue()),((org.joda.time.Chronology)v2),((java.util.Locale)v10),((java.lang.Integer)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.format.DateTimeParserBucket)v13).getChronology();
    Object v15 = 0L;
    Object v16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v17 = ((org.joda.time.Chronology)v16).toString();
    Object v18 = "The DateTimeFieldType must not be null";
    Object v19 = java.util.Locale.forLanguageTag(((java.lang.String)v18));
    Object v20 = 0;
    Object v21 = 3;
    Object v22 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v15).longValue()),((org.joda.time.Chronology)v16),((java.util.Locale)v19),((java.lang.Integer)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = org.joda.time.DateTimeZone.getDefault();
    ((org.joda.time.format.DateTimeParserBucket)v22).setZone(((org.joda.time.DateTimeZone)v23));
    Object v24 = null;
    Object v25 = ((org.joda.time.format.DateTimeParserBucket)v22).getLocale();
    Object v26 = ((java.util.Locale)v25).getUnicodeLocaleAttributes();
    Object v27 = -14;
    Object v28 = 1;
    Object v29 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v14),((java.util.Locale)v25),((java.lang.Integer)v27),(((java.lang.Integer)v28).intValue()));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 4L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 8;
    Object v11 = 46;
    Object v12 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v14 = org.joda.time.DurationFieldType.seconds();
    Object v15 = -30L;
    Object v16 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v14),(((java.lang.Long)v15).longValue()));
    Object v17 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v13),((org.joda.time.DurationField)v16));
    Object v18 = 1;
    ((org.joda.time.format.DateTimeParserBucket)v12).saveField(((org.joda.time.DateTimeField)v17),(((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 1L;
    Object v1 = 4L;
    Object v2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v3 = 14L;
    Object v4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v5 = "The DateTimeFieldType must not be null";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = 32;
    Object v9 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v3).longValue()),((org.joda.time.Chronology)v4),((java.util.Locale)v6),((java.lang.Integer)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.DateTimeParserBucket)v9).getLocale();
    Object v11 = 8;
    Object v12 = 46;
    Object v13 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v1).longValue()),((org.joda.time.Chronology)v2),((java.util.Locale)v10),((java.lang.Integer)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.format.DateTimeParserBucket)v13).getChronology();
    Object v15 = ((org.joda.time.Chronology)v14).months();
    Object v16 = 14L;
    Object v17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v18 = "The DateTimeFieldType must not be null";
    Object v19 = java.util.Locale.forLanguageTag(((java.lang.String)v18));
    Object v20 = 1;
    Object v21 = 32;
    Object v22 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v16).longValue()),((org.joda.time.Chronology)v17),((java.util.Locale)v19),((java.lang.Integer)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((org.joda.time.format.DateTimeParserBucket)v22).getLocale();
    Object v24 = 7;
    Object v25 = 9;
    Object v26 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v14),((java.util.Locale)v23),((java.lang.Integer)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((org.joda.time.format.DateTimeParserBucket)v26).saveState();
    Object v28 = ((org.joda.time.format.DateTimeParserBucket)v26).computeMillis();
    org.junit.Assert.assertEquals((Object)(1L), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 27L;
    Object v1 = 4L;
    Object v2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v3 = 14L;
    Object v4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v5 = "The DateTimeFieldType must not be null";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = 32;
    Object v9 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v3).longValue()),((org.joda.time.Chronology)v4),((java.util.Locale)v6),((java.lang.Integer)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.DateTimeParserBucket)v9).getLocale();
    Object v11 = 8;
    Object v12 = 46;
    Object v13 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v1).longValue()),((org.joda.time.Chronology)v2),((java.util.Locale)v10),((java.lang.Integer)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.format.DateTimeParserBucket)v13).getChronology();
    Object v15 = ((org.joda.time.Chronology)v14).weekyear();
    Object v16 = 8L;
    Object v17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v18 = 14L;
    Object v19 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v20 = "The DateTimeFieldType must not be null";
    Object v21 = java.util.Locale.forLanguageTag(((java.lang.String)v20));
    Object v22 = 1;
    Object v23 = 32;
    Object v24 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v18).longValue()),((org.joda.time.Chronology)v19),((java.util.Locale)v21),((java.lang.Integer)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = ((org.joda.time.format.DateTimeParserBucket)v24).getLocale();
    Object v26 = 1;
    Object v27 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v16).longValue()),((org.joda.time.Chronology)v17),((java.util.Locale)v25),((java.lang.Integer)v26));
    Object v28 = ((org.joda.time.format.DateTimeParserBucket)v27).getLocale();
    Object v29 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v14),((java.util.Locale)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 106L;
    Object v1 = 4L;
    Object v2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v3 = 14L;
    Object v4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v5 = "The DateTimeFieldType must not be null";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = 32;
    Object v9 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v3).longValue()),((org.joda.time.Chronology)v4),((java.util.Locale)v6),((java.lang.Integer)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.DateTimeParserBucket)v9).getLocale();
    Object v11 = 8;
    Object v12 = 46;
    Object v13 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v1).longValue()),((org.joda.time.Chronology)v2),((java.util.Locale)v10),((java.lang.Integer)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.format.DateTimeParserBucket)v13).getChronology();
    Object v15 = 0L;
    Object v16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v17 = ((org.joda.time.Chronology)v16).toString();
    Object v18 = "The DateTimeFieldType must not be null";
    Object v19 = java.util.Locale.forLanguageTag(((java.lang.String)v18));
    Object v20 = 0;
    Object v21 = 3;
    Object v22 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v15).longValue()),((org.joda.time.Chronology)v16),((java.util.Locale)v19),((java.lang.Integer)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = org.joda.time.DateTimeZone.getDefault();
    ((org.joda.time.format.DateTimeParserBucket)v22).setZone(((org.joda.time.DateTimeZone)v23));
    Object v24 = null;
    Object v25 = ((org.joda.time.format.DateTimeParserBucket)v22).getLocale();
    Object v26 = ((java.util.Locale)v25).getUnicodeLocaleAttributes();
    Object v27 = -14;
    Object v28 = 1;
    Object v29 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v14),((java.util.Locale)v25),((java.lang.Integer)v27),(((java.lang.Integer)v28).intValue()));
    Object v30 = true;
    Object v31 = "The date must not be null";
    Object v32 = ((org.joda.time.format.DateTimeParserBucket)v29).computeMillis((((java.lang.Boolean)v30).booleanValue()),((java.lang.String)v31));
    Object v33 = true;
    Object v34 = "getInstanbe";
    Object v35 = ((org.joda.time.format.DateTimeParserBucket)v29).computeMillis((((java.lang.Boolean)v33).booleanValue()),((java.lang.String)v34));
    org.junit.Assert.assertEquals((Object)(106L), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 12L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = "The DateTimeFieldType must not be null";
    Object v3 = java.util.Locale.forLanguageTag(((java.lang.String)v2));
    Object v4 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v3));
    Object v5 = ((org.joda.time.format.DateTimeParserBucket)v4).getChronology();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 1L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = -56;
    Object v11 = -56;
    Object v12 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.joda.time.format.DateTimeParserBucket)v12).getOffset();
    org.junit.Assert.assertEquals((Object)(0), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 4L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 8;
    Object v11 = 46;
    Object v12 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = org.joda.time.DurationFieldType.seconds();
    Object v14 = -30L;
    Object v15 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v13),(((java.lang.Long)v14).longValue()));
    Object v16 = ((org.joda.time.format.DateTimeParserBucket)v12).restoreState(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.seconds();
    Object v1 = -30L;
    Object v2 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v0),(((java.lang.Long)v1).longValue()));
    Object v3 = org.joda.time.DurationFieldType.seconds();
    Object v4 = -30L;
    Object v5 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = 0L;
    Object v7 = -4L;
    Object v8 = ((org.joda.time.DurationField)v5).getDifferenceAsLong((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()));
    Object v9 = org.joda.time.format.DateTimeParserBucket.compareReverse(((org.joda.time.DurationField)v2),((org.joda.time.DurationField)v5));
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = -28L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 0L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = ((org.joda.time.Chronology)v3).toString();
    Object v5 = "The DateTimeFieldType must not be null";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = 3;
    Object v9 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v6),((java.lang.Integer)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.joda.time.DateTimeZone.getDefault();
    ((org.joda.time.format.DateTimeParserBucket)v9).setZone(((org.joda.time.DateTimeZone)v10));
    Object v11 = null;
    Object v12 = ((org.joda.time.format.DateTimeParserBucket)v9).getLocale();
    Object v13 = 0;
    Object v14 = 17;
    Object v15 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v12),((java.lang.Integer)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = org.joda.time.DateTimeZone.getDefault();
    ((org.joda.time.format.DateTimeParserBucket)v15).setZone(((org.joda.time.DateTimeZone)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 1L;
    Object v1 = 4L;
    Object v2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v3 = 14L;
    Object v4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v5 = "The DateTimeFieldType must not be null";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = 32;
    Object v9 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v3).longValue()),((org.joda.time.Chronology)v4),((java.util.Locale)v6),((java.lang.Integer)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.DateTimeParserBucket)v9).getLocale();
    Object v11 = 8;
    Object v12 = 46;
    Object v13 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v1).longValue()),((org.joda.time.Chronology)v2),((java.util.Locale)v10),((java.lang.Integer)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.format.DateTimeParserBucket)v13).getChronology();
    Object v15 = ((org.joda.time.Chronology)v14).months();
    Object v16 = 14L;
    Object v17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v18 = "The DateTimeFieldType must not be null";
    Object v19 = java.util.Locale.forLanguageTag(((java.lang.String)v18));
    Object v20 = 1;
    Object v21 = 32;
    Object v22 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v16).longValue()),((org.joda.time.Chronology)v17),((java.util.Locale)v19),((java.lang.Integer)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((org.joda.time.format.DateTimeParserBucket)v22).getLocale();
    Object v24 = 7;
    Object v25 = 9;
    Object v26 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v14),((java.util.Locale)v23),((java.lang.Integer)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = ((org.joda.time.format.DateTimeParserBucket)v26).saveState();
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 1L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = -56;
    Object v11 = -56;
    Object v12 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v14 = 0;
    ((org.joda.time.format.DateTimeParserBucket)v12).saveField(((org.joda.time.DateTimeFieldType)v13),(((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = -42L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 11;
    Object v11 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10));
    Object v12 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v13 = 1;
    ((org.joda.time.format.DateTimeParserBucket)v11).saveField(((org.joda.time.DateTimeFieldType)v12),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    Object v15 = org.joda.time.DurationFieldType.seconds();
    Object v16 = -30L;
    Object v17 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v15),(((java.lang.Long)v16).longValue()));
    Object v18 = org.joda.time.DurationFieldType.seconds();
    Object v19 = -30L;
    Object v20 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v18),(((java.lang.Long)v19).longValue()));
    Object v21 = -15L;
    Object v22 = ((org.joda.time.DurationField)v20).getValue((((java.lang.Long)v21).longValue()));
    Object v23 = org.joda.time.format.DateTimeParserBucket.compareReverse(((org.joda.time.DurationField)v17),((org.joda.time.DurationField)v20));
    Object v24 = ((org.joda.time.format.DateTimeParserBucket)v11).restoreState(((java.lang.Object)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 4L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 8;
    Object v11 = 46;
    Object v12 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = 4;
    ((org.joda.time.format.DateTimeParserBucket)v12).setOffset((((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 2L;
    Object v1 = 12L;
    Object v2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v3 = "The DateTimeFieldType must not be null";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v1).longValue()),((org.joda.time.Chronology)v2),((java.util.Locale)v4));
    Object v6 = ((org.joda.time.format.DateTimeParserBucket)v5).getChronology();
    Object v7 = 8L;
    Object v8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v9 = 14L;
    Object v10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v11 = "The DateTimeFieldType must not be null";
    Object v12 = java.util.Locale.forLanguageTag(((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = 32;
    Object v15 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v9).longValue()),((org.joda.time.Chronology)v10),((java.util.Locale)v12),((java.lang.Integer)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.joda.time.format.DateTimeParserBucket)v15).getLocale();
    Object v17 = 1;
    Object v18 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v7).longValue()),((org.joda.time.Chronology)v8),((java.util.Locale)v16),((java.lang.Integer)v17));
    Object v19 = ((org.joda.time.format.DateTimeParserBucket)v18).getLocale();
    Object v20 = ((java.util.Locale)v19).clone();
    Object v21 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v6),((java.util.Locale)v19));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = -42L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 11;
    Object v11 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10));
    Object v12 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v13 = "' is not supported";
    Object v14 = "The DateTimeFieldType must not be null";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    ((org.joda.time.format.DateTimeParserBucket)v11).saveField(((org.joda.time.DateTimeFieldType)v12),((java.lang.String)v13),((java.util.Locale)v15));
    Object v16 = null;
    Object v17 = ((org.joda.time.format.DateTimeParserBucket)v11).getLocale();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 1L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = -56;
    Object v11 = -56;
    Object v12 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = true;
    Object v14 = "No parser supplied";
    Object v15 = ((org.joda.time.format.DateTimeParserBucket)v12).computeMillis((((java.lang.Boolean)v13).booleanValue()),((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(1L), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 1L;
    Object v1 = 4L;
    Object v2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v3 = 14L;
    Object v4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v5 = "The DateTimeFieldType must not be null";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = 32;
    Object v9 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v3).longValue()),((org.joda.time.Chronology)v4),((java.util.Locale)v6),((java.lang.Integer)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.DateTimeParserBucket)v9).getLocale();
    Object v11 = 8;
    Object v12 = 46;
    Object v13 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v1).longValue()),((org.joda.time.Chronology)v2),((java.util.Locale)v10),((java.lang.Integer)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.format.DateTimeParserBucket)v13).getChronology();
    Object v15 = ((org.joda.time.Chronology)v14).months();
    Object v16 = 14L;
    Object v17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v18 = "The DateTimeFieldType must not be null";
    Object v19 = java.util.Locale.forLanguageTag(((java.lang.String)v18));
    Object v20 = 1;
    Object v21 = 32;
    Object v22 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v16).longValue()),((org.joda.time.Chronology)v17),((java.util.Locale)v19),((java.lang.Integer)v20),(((java.lang.Integer)v21).intValue()));
    Object v23 = ((org.joda.time.format.DateTimeParserBucket)v22).getLocale();
    Object v24 = 7;
    Object v25 = 9;
    Object v26 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v14),((java.util.Locale)v23),((java.lang.Integer)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = true;
    Object v28 = "PeriodFormat.days";
    Object v29 = ((org.joda.time.format.DateTimeParserBucket)v26).computeMillis((((java.lang.Boolean)v27).booleanValue()),((java.lang.String)v28));
    org.junit.Assert.assertEquals((Object)(1L), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 4L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 8;
    Object v11 = 46;
    Object v12 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = -1;
    ((org.joda.time.format.DateTimeParserBucket)v12).setPivotYear(((java.lang.Integer)v13));
    Object v14 = null;
    Object v15 = ((org.joda.time.format.DateTimeParserBucket)v12).getPivotYear();
    org.junit.Assert.assertEquals((Object)(-1), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.seconds();
    Object v1 = -30L;
    Object v2 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v0),(((java.lang.Long)v1).longValue()));
    Object v3 = ((org.joda.time.DurationField)v2).toString();
    Object v4 = org.joda.time.DurationFieldType.seconds();
    Object v5 = -30L;
    Object v6 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((org.joda.time.DurationField)v6).toString();
    Object v8 = org.joda.time.format.DateTimeParserBucket.compareReverse(((org.joda.time.DurationField)v2),((org.joda.time.DurationField)v6));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 0L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.Chronology)v1).toString();
    Object v3 = "The DateTimeFieldType must not be null";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = 3;
    Object v7 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v4),((java.lang.Integer)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.format.DateTimeParserBucket)v7).getOffset();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = -28L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 0L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = ((org.joda.time.Chronology)v3).toString();
    Object v5 = "The DateTimeFieldType must not be null";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = 3;
    Object v9 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v6),((java.lang.Integer)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.joda.time.DateTimeZone.getDefault();
    ((org.joda.time.format.DateTimeParserBucket)v9).setZone(((org.joda.time.DateTimeZone)v10));
    Object v11 = null;
    Object v12 = ((org.joda.time.format.DateTimeParserBucket)v9).getLocale();
    Object v13 = 0;
    Object v14 = 17;
    Object v15 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v12),((java.lang.Integer)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = true;
    Object v17 = "";
    Object v18 = ((org.joda.time.format.DateTimeParserBucket)v15).computeMillis((((java.lang.Boolean)v16).booleanValue()),((java.lang.String)v17));
    org.junit.Assert.assertEquals((Object)(-28L), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 2L;
    Object v1 = 12L;
    Object v2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v3 = "The DateTimeFieldType must not be null";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v1).longValue()),((org.joda.time.Chronology)v2),((java.util.Locale)v4));
    Object v6 = ((org.joda.time.format.DateTimeParserBucket)v5).getChronology();
    Object v7 = 8L;
    Object v8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v9 = 14L;
    Object v10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v11 = "The DateTimeFieldType must not be null";
    Object v12 = java.util.Locale.forLanguageTag(((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = 32;
    Object v15 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v9).longValue()),((org.joda.time.Chronology)v10),((java.util.Locale)v12),((java.lang.Integer)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.joda.time.format.DateTimeParserBucket)v15).getLocale();
    Object v17 = 1;
    Object v18 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v7).longValue()),((org.joda.time.Chronology)v8),((java.util.Locale)v16),((java.lang.Integer)v17));
    Object v19 = ((org.joda.time.format.DateTimeParserBucket)v18).getLocale();
    Object v20 = ((java.util.Locale)v19).clone();
    Object v21 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v6),((java.util.Locale)v19));
    Object v22 = false;
    Object v23 = ((org.joda.time.format.DateTimeParserBucket)v21).computeMillis((((java.lang.Boolean)v22).booleanValue()));
    org.junit.Assert.assertEquals((Object)(2L), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 1L;
    Object v1 = 12L;
    Object v2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v3 = "The DateTimeFieldType must not be null";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v1).longValue()),((org.joda.time.Chronology)v2),((java.util.Locale)v4));
    Object v6 = ((org.joda.time.format.DateTimeParserBucket)v5).getChronology();
    Object v7 = 8L;
    Object v8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v9 = 14L;
    Object v10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v11 = "The DateTimeFieldType must not be null";
    Object v12 = java.util.Locale.forLanguageTag(((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = 32;
    Object v15 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v9).longValue()),((org.joda.time.Chronology)v10),((java.util.Locale)v12),((java.lang.Integer)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.joda.time.format.DateTimeParserBucket)v15).getLocale();
    Object v17 = 1;
    Object v18 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v7).longValue()),((org.joda.time.Chronology)v8),((java.util.Locale)v16),((java.lang.Integer)v17));
    Object v19 = ((org.joda.time.format.DateTimeParserBucket)v18).getLocale();
    Object v20 = ((java.util.Locale)v19).hashCode();
    Object v21 = 21;
    Object v22 = -44;
    Object v23 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v6),((java.util.Locale)v19),((java.lang.Integer)v21),(((java.lang.Integer)v22).intValue()));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 1L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = -56;
    Object v11 = -56;
    Object v12 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = 4L;
    Object v14 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v15 = 14L;
    Object v16 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v17 = "The DateTimeFieldType must not be null";
    Object v18 = java.util.Locale.forLanguageTag(((java.lang.String)v17));
    Object v19 = 1;
    Object v20 = 32;
    Object v21 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v15).longValue()),((org.joda.time.Chronology)v16),((java.util.Locale)v18),((java.lang.Integer)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.joda.time.format.DateTimeParserBucket)v21).getLocale();
    Object v23 = 8;
    Object v24 = 46;
    Object v25 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v13).longValue()),((org.joda.time.Chronology)v14),((java.util.Locale)v22),((java.lang.Integer)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = false;
    Object v27 = "resulting";
    Object v28 = ((org.joda.time.format.DateTimeParserBucket)v25).computeMillis((((java.lang.Boolean)v26).booleanValue()),((java.lang.String)v27));
    Object v29 = ((org.joda.time.format.DateTimeParserBucket)v12).restoreState(((java.lang.Object)v28));
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 8L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 1;
    Object v11 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10));
    Object v12 = ((org.joda.time.format.DateTimeParserBucket)v11).getPivotYear();
    org.junit.Assert.assertEquals((Object)(1), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 4L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 8;
    Object v11 = 46;
    Object v12 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = true;
    Object v14 = "WField must not be null";
    Object v15 = ((org.joda.time.format.DateTimeParserBucket)v12).computeMillis((((java.lang.Boolean)v13).booleanValue()),((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(4L), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = -42L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 11;
    Object v11 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10));
    Object v12 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v13 = org.joda.time.DurationFieldType.seconds();
    Object v14 = -30L;
    Object v15 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v13),(((java.lang.Long)v14).longValue()));
    Object v16 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v12),((org.joda.time.DurationField)v15));
    Object v17 = 0;
    ((org.joda.time.format.DateTimeParserBucket)v11).saveField(((org.joda.time.DateTimeField)v16),(((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v20 = 55;
    ((org.joda.time.format.DateTimeParserBucket)v11).saveField(((org.joda.time.DateTimeFieldType)v19),(((java.lang.Integer)v20).intValue()));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = -42L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 11;
    Object v11 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10));
    Object v12 = ((org.joda.time.format.DateTimeParserBucket)v11).getZone();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 0L;
    Object v1 = 4L;
    Object v2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v3 = 14L;
    Object v4 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v5 = "The DateTimeFieldType must not be null";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = 32;
    Object v9 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v3).longValue()),((org.joda.time.Chronology)v4),((java.util.Locale)v6),((java.lang.Integer)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.format.DateTimeParserBucket)v9).getLocale();
    Object v11 = 8;
    Object v12 = 46;
    Object v13 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v1).longValue()),((org.joda.time.Chronology)v2),((java.util.Locale)v10),((java.lang.Integer)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.format.DateTimeParserBucket)v13).getChronology();
    Object v15 = ((org.joda.time.Chronology)v14).clockhourOfDay();
    Object v16 = 0L;
    Object v17 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v18 = ((org.joda.time.Chronology)v17).toString();
    Object v19 = "The DateTimeFieldType must not be null";
    Object v20 = java.util.Locale.forLanguageTag(((java.lang.String)v19));
    Object v21 = 0;
    Object v22 = 3;
    Object v23 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v16).longValue()),((org.joda.time.Chronology)v17),((java.util.Locale)v20),((java.lang.Integer)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = org.joda.time.DateTimeZone.getDefault();
    ((org.joda.time.format.DateTimeParserBucket)v23).setZone(((org.joda.time.DateTimeZone)v24));
    Object v25 = null;
    Object v26 = ((org.joda.time.format.DateTimeParserBucket)v23).getLocale();
    Object v27 = 15;
    Object v28 = 21;
    Object v29 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v14),((java.util.Locale)v26),((java.lang.Integer)v27),(((java.lang.Integer)v28).intValue()));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.seconds();
    Object v1 = -30L;
    Object v2 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v0),(((java.lang.Long)v1).longValue()));
    Object v3 = org.joda.time.DurationFieldType.seconds();
    Object v4 = -30L;
    Object v5 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v3),(((java.lang.Long)v4).longValue()));
    Object v6 = 4L;
    Object v7 = -21L;
    Object v8 = ((org.joda.time.DurationField)v5).add((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()));
    Object v9 = org.joda.time.format.DateTimeParserBucket.compareReverse(((org.joda.time.DurationField)v2),((org.joda.time.DurationField)v5));
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 1L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = -56;
    Object v11 = -56;
    Object v12 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = true;
    Object v14 = "' is not supported";
    Object v15 = ((org.joda.time.format.DateTimeParserBucket)v12).computeMillis((((java.lang.Boolean)v13).booleanValue()),((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(1L), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 2L;
    Object v1 = 12L;
    Object v2 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v3 = "The DateTimeFieldType must not be null";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v1).longValue()),((org.joda.time.Chronology)v2),((java.util.Locale)v4));
    Object v6 = ((org.joda.time.format.DateTimeParserBucket)v5).getChronology();
    Object v7 = 8L;
    Object v8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v9 = 14L;
    Object v10 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v11 = "The DateTimeFieldType must not be null";
    Object v12 = java.util.Locale.forLanguageTag(((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = 32;
    Object v15 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v9).longValue()),((org.joda.time.Chronology)v10),((java.util.Locale)v12),((java.lang.Integer)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.joda.time.format.DateTimeParserBucket)v15).getLocale();
    Object v17 = 1;
    Object v18 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v7).longValue()),((org.joda.time.Chronology)v8),((java.util.Locale)v16),((java.lang.Integer)v17));
    Object v19 = ((org.joda.time.format.DateTimeParserBucket)v18).getLocale();
    Object v20 = ((java.util.Locale)v19).clone();
    Object v21 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v6),((java.util.Locale)v19));
    Object v22 = 28;
    ((org.joda.time.format.DateTimeParserBucket)v21).setOffset((((java.lang.Integer)v22).intValue()));
    Object v23 = null;
    Object v24 = ((org.joda.time.format.DateTimeParserBucket)v21).computeMillis();
    org.junit.Assert.assertEquals((Object)(-26L), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = -42L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 11;
    Object v11 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10));
    Object v12 = org.joda.time.DateTimeFieldType.dayOfWeek();
    Object v13 = " -/";
    Object v14 = "The DateTimeFieldType must not be null";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    ((org.joda.time.format.DateTimeParserBucket)v11).saveField(((org.joda.time.DateTimeFieldType)v12),((java.lang.String)v13),((java.util.Locale)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 4L;
    Object v1 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v2 = 14L;
    Object v3 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v4 = "The DateTimeFieldType must not be null";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 32;
    Object v8 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v2).longValue()),((org.joda.time.Chronology)v3),((java.util.Locale)v5),((java.lang.Integer)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.format.DateTimeParserBucket)v8).getLocale();
    Object v10 = 8;
    Object v11 = 46;
    Object v12 = new org.joda.time.format.DateTimeParserBucket((((java.lang.Long)v0).longValue()),((org.joda.time.Chronology)v1),((java.util.Locale)v9),((java.lang.Integer)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = 0;
    ((org.joda.time.format.DateTimeParserBucket)v12).setPivotYear(((java.lang.Integer)v13));
    Object v14 = null;
    Object v15 = org.joda.time.DurationFieldType.seconds();
    Object v16 = -30L;
    Object v17 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v15),(((java.lang.Long)v16).longValue()));
    Object v18 = org.joda.time.DurationFieldType.seconds();
    Object v19 = -30L;
    Object v20 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v18),(((java.lang.Long)v19).longValue()));
    Object v21 = org.joda.time.format.DateTimeParserBucket.compareReverse(((org.joda.time.DurationField)v17),((org.joda.time.DurationField)v20));
    Object v22 = ((org.joda.time.format.DateTimeParserBucket)v12).restoreState(((java.lang.Object)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }
}
