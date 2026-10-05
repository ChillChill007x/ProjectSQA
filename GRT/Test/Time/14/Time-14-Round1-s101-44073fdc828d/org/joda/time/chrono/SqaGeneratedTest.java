package org.joda.time.chrono;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.year();
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = new org.joda.time.field.OffsetDateTimeField(((org.joda.time.DateTimeField)v1),((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 30L;
    Object v8 = 0;
    Object v9 = 13;
    Object v10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new org.joda.time.LocalDate((((java.lang.Long)v7).longValue()),((org.joda.time.DateTimeZone)v10));
    Object v12 = "(";
    Object v13 = "CTT";
    Object v14 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.joda.time.field.BaseDateTimeField)v6).getAsShortText(((org.joda.time.ReadablePartial)v11),((java.util.Locale)v14));
    Object v16 = 1L;
    Object v17 = ((org.joda.time.field.BaseDateTimeField)v6).roundCeiling((((java.lang.Long)v16).longValue()));
    org.junit.Assert.assertEquals((Object)(22118400000L), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 4;
    Object v4 = "(";
    Object v5 = "CTT";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.joda.time.field.BaseDateTimeField)v2).getAsText((((java.lang.Integer)v3).intValue()),((java.util.Locale)v6));
    Object v8 = 1L;
    Object v9 = 0;
    Object v10 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).add((((java.lang.Long)v8).longValue()),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertEquals((Object)(1L), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = -30L;
    Object v5 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).add((((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(-72835200000L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = 0;
    Object v5 = 13;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v6));
    Object v8 = "(";
    Object v9 = "CTT";
    Object v10 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.joda.time.field.BaseDateTimeField)v2).getAsShortText(((org.joda.time.ReadablePartial)v7),((java.util.Locale)v10));
    Object v12 = -41L;
    Object v13 = ((org.joda.time.field.BaseDateTimeField)v2).getMaximumValue((((java.lang.Long)v12).longValue()));
    org.junit.Assert.assertEquals((Object)(13), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.field.BaseDateTimeField)v2).toString();
    Object v4 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).getMinimumValue();
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = 0;
    Object v5 = 13;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v6));
    Object v8 = 13;
    Object v9 = new int[]{};
    Object v10 = 1;
    Object v11 = ((org.joda.time.field.BaseDateTimeField)v2).addWrapPartial(((org.joda.time.ReadablePartial)v7),(((java.lang.Integer)v8).intValue()),((int[])v9),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = -2L;
    Object v4 = ((org.joda.time.field.BaseDateTimeField)v2).roundCeiling((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).getLeapDurationField();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = 0;
    Object v5 = 13;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v6));
    Object v8 = -70;
    Object v9 = new int[]{0};
    Object v10 = 0;
    Object v11 = ((org.joda.time.field.BaseDateTimeField)v2).addWrapPartial(((org.joda.time.ReadablePartial)v7),(((java.lang.Integer)v8).intValue()),((int[])v9),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = "(";
    Object v3 = "CTT";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.joda.time.field.BaseDateTimeField)v1).getMaximumTextLength(((java.util.Locale)v4));
    org.junit.Assert.assertEquals((Object)(9), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = 30L;
    Object v3 = 0;
    Object v4 = 13;
    Object v5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v2).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 0;
    Object v8 = new int[]{58};
    Object v9 = 8;
    Object v10 = ((org.joda.time.field.BaseDateTimeField)v1).addWrapPartial(((org.joda.time.ReadablePartial)v6),(((java.lang.Integer)v7).intValue()),((int[])v8),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = 30L;
    Object v3 = 0;
    Object v4 = 13;
    Object v5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v2).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 1;
    Object v8 = new int[]{45,3};
    Object v9 = 0;
    Object v10 = ((org.joda.time.field.BaseDateTimeField)v1).addWrapPartial(((org.joda.time.ReadablePartial)v6),(((java.lang.Integer)v7).intValue()),((int[])v8),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 16L;
    Object v4 = ((org.joda.time.field.BaseDateTimeField)v2).roundHalfEven((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(691200000L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = ((org.joda.time.field.BaseDateTimeField)v2).roundCeiling((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(691200000L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 14L;
    Object v4 = ((org.joda.time.field.BaseDateTimeField)v2).roundHalfCeiling((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(691200000L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).add((((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(2592000001L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = 22L;
    Object v3 = ((org.joda.time.field.BaseDateTimeField)v1).roundHalfFloor((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-9936000000L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 25L;
    Object v4 = "(";
    Object v5 = "CTT";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.joda.time.field.BaseDateTimeField)v2).getAsText((((java.lang.Long)v3).longValue()),((java.util.Locale)v6));
    org.junit.Assert.assertEquals((Object)("4"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 17L;
    Object v4 = 0;
    Object v5 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).set((((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = 7L;
    Object v3 = ((org.joda.time.field.BaseDateTimeField)v1).roundHalfFloor((((java.lang.Long)v2).longValue()));
    Object v4 = 30L;
    Object v5 = 0;
    Object v6 = 13;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.joda.time.LocalDate((((java.lang.Long)v4).longValue()),((org.joda.time.DateTimeZone)v7));
    Object v9 = new int[]{-6};
    Object v10 = ((org.joda.time.field.BaseDateTimeField)v1).getMaximumValue(((org.joda.time.ReadablePartial)v8),((int[])v9));
    org.junit.Assert.assertEquals((Object)(292272708), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = 20;
    Object v5 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).set((((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = 1;
    Object v5 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).set((((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(-7776000000L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = -35L;
    Object v4 = ((org.joda.time.field.BaseDateTimeField)v2).roundHalfEven((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(691200000L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = "(";
    Object v3 = "CTT";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "(";
    Object v6 = "CTT";
    Object v7 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((java.util.Locale)v4).getDisplayCountry(((java.util.Locale)v7));
    Object v9 = ((org.joda.time.field.BaseDateTimeField)v1).getMaximumTextLength(((java.util.Locale)v4));
    org.junit.Assert.assertEquals((Object)(9), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 82L;
    Object v4 = -9;
    Object v5 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).add((((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(-21167999918L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = 0;
    Object v5 = 13;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v6));
    Object v8 = new int[]{0};
    Object v9 = ((org.joda.time.field.BaseDateTimeField)v2).getMaximumValue(((org.joda.time.ReadablePartial)v7),((int[])v8));
    Object v10 = 30L;
    Object v11 = 0;
    Object v12 = 13;
    Object v13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new org.joda.time.LocalDate((((java.lang.Long)v10).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = -62;
    Object v16 = new int[]{-29,-8,2};
    Object v17 = -7;
    Object v18 = ((org.joda.time.field.BaseDateTimeField)v2).addWrapPartial(((org.joda.time.ReadablePartial)v14),(((java.lang.Integer)v15).intValue()),((int[])v16),(((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.year();
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = new org.joda.time.field.OffsetDateTimeField(((org.joda.time.DateTimeField)v1),((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 3L;
    Object v8 = -10L;
    Object v9 = ((org.joda.time.field.BaseDateTimeField)v6).getDifferenceAsLong((((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
    Object v10 = 30L;
    Object v11 = 0;
    Object v12 = 13;
    Object v13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new org.joda.time.LocalDate((((java.lang.Long)v10).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = 0;
    Object v16 = new int[]{1,1};
    Object v17 = -28;
    Object v18 = ((org.joda.time.field.BaseDateTimeField)v6).addWrapPartial(((org.joda.time.ReadablePartial)v14),(((java.lang.Integer)v15).intValue()),((int[])v16),(((java.lang.Integer)v17).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).isLenient();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = 0L;
    Object v3 = ((org.joda.time.field.BaseDateTimeField)v1).roundHalfFloor((((java.lang.Long)v2).longValue()));
    Object v4 = -3L;
    Object v5 = "Long.MIN_VALUE cannot be negated";
    Object v6 = "(";
    Object v7 = "CTT";
    Object v8 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.joda.time.field.BaseDateTimeField)v1).set((((java.lang.Long)v4).longValue()),((java.lang.String)v5),((java.util.Locale)v8));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = ((org.joda.time.field.BaseDateTimeField)v2).roundHalfCeiling((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(691200000L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 4L;
    Object v4 = 1L;
    Object v5 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).add((((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(2592000004L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = -33L;
    Object v4 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).isLeap((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 6L;
    Object v4 = 35L;
    Object v5 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).getDifferenceAsLong((((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = 0;
    Object v5 = 13;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v6));
    Object v8 = 4;
    Object v9 = new int[]{59,0,1};
    Object v10 = -16;
    Object v11 = ((org.joda.time.field.BaseDateTimeField)v2).set(((org.joda.time.ReadablePartial)v7),(((java.lang.Integer)v8).intValue()),((int[])v9),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = 0L;
    Object v3 = ((org.joda.time.field.BaseDateTimeField)v1).roundFloor((((java.lang.Long)v2).longValue()));
    Object v4 = 1L;
    Object v5 = ((org.joda.time.field.BaseDateTimeField)v1).roundHalfCeiling((((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(-9936000000L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = 0;
    Object v5 = 13;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v6));
    Object v8 = 1;
    Object v9 = new int[]{1,8,1};
    Object v10 = 40;
    Object v11 = ((org.joda.time.field.BaseDateTimeField)v2).addWrapField(((org.joda.time.ReadablePartial)v7),(((java.lang.Integer)v8).intValue()),((int[])v9),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = 30L;
    Object v2 = 0;
    Object v3 = 13;
    Object v4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.joda.time.LocalDate((((java.lang.Long)v1).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 1L;
    Object v7 = ((org.joda.time.chrono.BaseChronology)v0).get(((org.joda.time.ReadablePartial)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = 46;
    Object v9 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = 0;
    Object v5 = 13;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v6));
    Object v8 = -18;
    Object v9 = new int[]{};
    Object v10 = 27;
    Object v11 = ((org.joda.time.field.BaseDateTimeField)v2).addWrapPartial(((org.joda.time.ReadablePartial)v7),(((java.lang.Integer)v8).intValue()),((int[])v9),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = 0L;
    Object v5 = ((org.joda.time.field.ImpreciseDateTimeField)v2).getDifference((((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = 17;
    Object v5 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).set((((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = 30L;
    Object v3 = 0;
    Object v4 = 13;
    Object v5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v2).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 19L;
    Object v8 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v9 = new org.joda.time.DateTime((((java.lang.Long)v7).longValue()),((org.joda.time.Chronology)v8));
    Object v10 = ((org.joda.time.ReadablePartial)v6).toDateTime(((org.joda.time.ReadableInstant)v9));
    Object v11 = "(";
    Object v12 = "CTT";
    Object v13 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.joda.time.field.BaseDateTimeField)v1).getAsShortText(((org.joda.time.ReadablePartial)v6),((java.util.Locale)v13));
    org.junit.Assert.assertEquals((Object)("1970"), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 29L;
    Object v4 = 0L;
    Object v5 = ((org.joda.time.field.ImpreciseDateTimeField)v2).getDifference((((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = -25L;
    Object v4 = ((org.joda.time.field.BaseDateTimeField)v2).roundHalfFloor((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(691200000L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.year();
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = new org.joda.time.field.OffsetDateTimeField(((org.joda.time.DateTimeField)v1),((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 2L;
    Object v8 = ((org.joda.time.field.BaseDateTimeField)v6).remainder((((java.lang.Long)v7).longValue()));
    Object v9 = 30L;
    Object v10 = 0;
    Object v11 = 13;
    Object v12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new org.joda.time.LocalDate((((java.lang.Long)v9).longValue()),((org.joda.time.DateTimeZone)v12));
    Object v14 = ((org.joda.time.ReadablePartial)v13).size();
    Object v15 = new int[]{};
    Object v16 = ((org.joda.time.field.BaseDateTimeField)v6).getMinimumValue(((org.joda.time.ReadablePartial)v13),((int[])v15));
    org.junit.Assert.assertEquals((Object)(1), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).roundFloor((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(-1900800000L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = ((org.joda.time.field.BaseDateTimeField)v2).roundHalfCeiling((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(691200000L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = 0;
    Object v5 = 13;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v6));
    Object v8 = 0;
    Object v9 = new int[]{};
    Object v10 = 1;
    Object v11 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).add(((org.joda.time.ReadablePartial)v7),(((java.lang.Integer)v8).intValue()),((int[])v9),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = 0;
    Object v5 = 13;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v6));
    Object v8 = -1;
    Object v9 = new int[]{-15,0,0};
    Object v10 = 1;
    Object v11 = ((org.joda.time.field.BaseDateTimeField)v2).set(((org.joda.time.ReadablePartial)v7),(((java.lang.Integer)v8).intValue()),((int[])v9),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).getLeapAmount((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = 4L;
    Object v3 = ((org.joda.time.field.BaseDateTimeField)v1).roundHalfEven((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-9936000000L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 8;
    Object v5 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).add((((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(20736000001L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = "(";
    Object v3 = "CTT";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "(";
    Object v6 = "CTT";
    Object v7 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((java.util.Locale)v4).getDisplayScript(((java.util.Locale)v7));
    Object v9 = ((org.joda.time.field.BaseDateTimeField)v1).getMaximumShortTextLength(((java.util.Locale)v4));
    org.junit.Assert.assertEquals((Object)(9), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "(";
    Object v4 = "CTT";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.joda.time.field.BaseDateTimeField)v2).getMaximumTextLength(((java.util.Locale)v5));
    Object v7 = 30L;
    Object v8 = 0;
    Object v9 = 13;
    Object v10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new org.joda.time.LocalDate((((java.lang.Long)v7).longValue()),((org.joda.time.DateTimeZone)v10));
    Object v12 = 0;
    Object v13 = new int[]{6,1,21};
    Object v14 = 1;
    Object v15 = ((org.joda.time.field.BaseDateTimeField)v2).addWrapPartial(((org.joda.time.ReadablePartial)v11),(((java.lang.Integer)v12).intValue()),((int[])v13),(((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = ((org.joda.time.field.BaseDateTimeField)v2).getAsText((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)("4"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = 30L;
    Object v3 = 0;
    Object v4 = 13;
    Object v5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v2).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = 11;
    Object v8 = "(";
    Object v9 = "CTT";
    Object v10 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((java.util.Locale)v10).getUnicodeLocaleAttributes();
    Object v12 = ((org.joda.time.field.BaseDateTimeField)v1).getAsText(((org.joda.time.ReadablePartial)v6),(((java.lang.Integer)v7).intValue()),((java.util.Locale)v10));
    org.junit.Assert.assertEquals((Object)("11"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.year();
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = new org.joda.time.field.OffsetDateTimeField(((org.joda.time.DateTimeField)v1),((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 0L;
    Object v8 = ((org.joda.time.field.BaseDateTimeField)v6).getAsShortText((((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertEquals((Object)("1687"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = 0L;
    Object v3 = ((org.joda.time.field.BaseDateTimeField)v1).roundHalfCeiling((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-9936000000L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = -23L;
    Object v4 = 5;
    Object v5 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).add((((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(12959999977L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = "(";
    Object v5 = "CTT";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.joda.time.field.BaseDateTimeField)v2).getAsShortText((((java.lang.Long)v3).longValue()),((java.util.Locale)v6));
    Object v8 = -12L;
    Object v9 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).isLeap((((java.lang.Long)v8).longValue()));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = "(";
    Object v5 = "CTT";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.joda.time.field.BaseDateTimeField)v2).getAsShortText((((java.lang.Long)v3).longValue()),((java.util.Locale)v6));
    org.junit.Assert.assertEquals((Object)("4"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 2L;
    Object v4 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).getLeapAmount((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = 30L;
    Object v2 = 0;
    Object v3 = 13;
    Object v4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.joda.time.LocalDate((((java.lang.Long)v1).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 1L;
    Object v7 = ((org.joda.time.chrono.BaseChronology)v0).get(((org.joda.time.ReadablePartial)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = 46;
    Object v9 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v8).intValue()));
    Object v10 = 2L;
    Object v11 = ((org.joda.time.field.BaseDateTimeField)v9).getAsText((((java.lang.Long)v10).longValue()));
    org.junit.Assert.assertEquals((Object)("4"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = 0;
    Object v5 = 13;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v6));
    Object v8 = 0;
    Object v9 = new int[]{12,1,1};
    Object v10 = -1;
    Object v11 = ((org.joda.time.field.BaseDateTimeField)v2).addWrapPartial(((org.joda.time.ReadablePartial)v7),(((java.lang.Integer)v8).intValue()),((int[])v9),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.field.BaseDateTimeField)v2).toString();
    Object v4 = 30L;
    Object v5 = 0;
    Object v6 = 13;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.joda.time.LocalDate((((java.lang.Long)v4).longValue()),((org.joda.time.DateTimeZone)v7));
    Object v9 = -2;
    Object v10 = new int[]{0};
    Object v11 = 0;
    Object v12 = ((org.joda.time.field.BaseDateTimeField)v2).addWrapPartial(((org.joda.time.ReadablePartial)v8),(((java.lang.Integer)v9).intValue()),((int[])v10),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 31L;
    Object v4 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).isLeap((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = -32L;
    Object v5 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).add((((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(-76550399999L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = 1L;
    Object v3 = ((org.joda.time.field.BaseDateTimeField)v1).roundHalfCeiling((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-9936000000L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = ((org.joda.time.field.BaseDateTimeField)v2).roundHalfEven((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(691200000L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = -19L;
    Object v4 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).remainder((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(1900799981L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = 0;
    Object v5 = 13;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v6));
    Object v8 = 1;
    Object v9 = new int[]{};
    Object v10 = 5;
    Object v11 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).add(((org.joda.time.ReadablePartial)v7),(((java.lang.Integer)v8).intValue()),((int[])v9),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = 0L;
    Object v3 = ((org.joda.time.field.BaseDateTimeField)v1).roundHalfFloor((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(-9936000000L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = 30L;
    Object v2 = 0;
    Object v3 = 13;
    Object v4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.joda.time.LocalDate((((java.lang.Long)v1).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 1L;
    Object v7 = ((org.joda.time.chrono.BaseChronology)v0).get(((org.joda.time.ReadablePartial)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = 46;
    Object v9 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v8).intValue()));
    Object v10 = 53L;
    Object v11 = 2;
    Object v12 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v9).add((((java.lang.Long)v10).longValue()),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertEquals((Object)(5184000053L), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = ((org.joda.time.field.ImpreciseDateTimeField)v1).getDurationField();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = 0;
    Object v5 = 13;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v6));
    Object v8 = -15;
    Object v9 = new int[]{};
    Object v10 = 0;
    Object v11 = ((org.joda.time.field.BaseDateTimeField)v2).set(((org.joda.time.ReadablePartial)v7),(((java.lang.Integer)v8).intValue()),((int[])v9),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.year();
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = new org.joda.time.field.OffsetDateTimeField(((org.joda.time.DateTimeField)v1),((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 30L;
    Object v8 = 0;
    Object v9 = 13;
    Object v10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new org.joda.time.LocalDate((((java.lang.Long)v7).longValue()),((org.joda.time.DateTimeZone)v10));
    Object v12 = new int[]{-19,-24};
    Object v13 = ((org.joda.time.field.BaseDateTimeField)v6).getMinimumValue(((org.joda.time.ReadablePartial)v11),((int[])v12));
    org.junit.Assert.assertEquals((Object)(1), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = 0;
    Object v5 = 13;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v6));
    Object v8 = 71;
    Object v9 = new int[]{-39,-14};
    Object v10 = -60;
    Object v11 = ((org.joda.time.field.BaseDateTimeField)v2).addWrapPartial(((org.joda.time.ReadablePartial)v7),(((java.lang.Integer)v8).intValue()),((int[])v9),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 67L;
    Object v4 = ((org.joda.time.field.BaseDateTimeField)v2).roundHalfFloor((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(691200000L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = 0;
    Object v5 = 13;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v6));
    Object v8 = 65533;
    Object v9 = "(";
    Object v10 = "CTT";
    Object v11 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.joda.time.field.BaseDateTimeField)v2).getAsText(((org.joda.time.ReadablePartial)v7),(((java.lang.Integer)v8).intValue()),((java.util.Locale)v11));
    Object v13 = 0L;
    Object v14 = 0;
    Object v15 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).add((((java.lang.Long)v13).longValue()),(((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = 1L;
    Object v3 = ((org.joda.time.field.BaseDateTimeField)v1).getAsShortText((((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)("1686"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = ((org.joda.time.field.BaseDateTimeField)v1).getName();
    org.junit.Assert.assertEquals((Object)("weekyear"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 1;
    Object v5 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).set((((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(-7775999999L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = 0;
    Object v5 = 13;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v6));
    Object v8 = 4;
    Object v9 = new int[]{0};
    Object v10 = 0;
    Object v11 = ((org.joda.time.field.BaseDateTimeField)v2).set(((org.joda.time.ReadablePartial)v7),(((java.lang.Integer)v8).intValue()),((int[])v9),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = -13L;
    Object v4 = 0L;
    Object v5 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).getDifferenceAsLong((((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 6L;
    Object v4 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).remainder((((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertEquals((Object)(1900800006L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = 5L;
    Object v3 = ((org.joda.time.field.BaseDateTimeField)v1).roundCeiling((((java.lang.Long)v2).longValue()));
    Object v4 = "(";
    Object v5 = "CTT";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).toString();
    Object v8 = ((org.joda.time.field.BaseDateTimeField)v1).getMaximumShortTextLength(((java.util.Locale)v6));
    org.junit.Assert.assertEquals((Object)(9), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = 6L;
    Object v3 = ((org.joda.time.field.BaseDateTimeField)v1).getAsText((((java.lang.Long)v2).longValue()));
    Object v4 = 0;
    Object v5 = "(";
    Object v6 = "CTT";
    Object v7 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "(";
    Object v9 = "CTT";
    Object v10 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((java.util.Locale)v7).getDisplayVariant(((java.util.Locale)v10));
    Object v12 = ((org.joda.time.field.BaseDateTimeField)v1).getAsShortText((((java.lang.Integer)v4).intValue()),((java.util.Locale)v7));
    org.junit.Assert.assertEquals((Object)("0"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.year();
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = new org.joda.time.field.OffsetDateTimeField(((org.joda.time.DateTimeField)v1),((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = -22L;
    Object v8 = "PT";
    Object v9 = "(";
    Object v10 = "CTT";
    Object v11 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((java.util.Locale)v11).getExtensionKeys();
    Object v13 = ((org.joda.time.field.BaseDateTimeField)v6).set((((java.lang.Long)v7).longValue()),((java.lang.String)v8),((java.util.Locale)v11));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.year();
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = new org.joda.time.field.OffsetDateTimeField(((org.joda.time.DateTimeField)v1),((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 1L;
    Object v8 = ((org.joda.time.field.BaseDateTimeField)v6).roundCeiling((((java.lang.Long)v7).longValue()));
    org.junit.Assert.assertEquals((Object)(22118400000L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = 0;
    Object v5 = 13;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v6));
    Object v8 = new int[]{17,-64,0};
    Object v9 = ((org.joda.time.field.BaseDateTimeField)v2).getMaximumValue(((org.joda.time.ReadablePartial)v7),((int[])v8));
    Object v10 = 1L;
    Object v11 = 1;
    Object v12 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).add((((java.lang.Long)v10).longValue()),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertEquals((Object)(2592000001L), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = 30L;
    Object v3 = 0;
    Object v4 = 13;
    Object v5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.LocalDate((((java.lang.Long)v2).longValue()),((org.joda.time.DateTimeZone)v5));
    Object v7 = "(";
    Object v8 = "CTT";
    Object v9 = new java.util.Locale(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((java.util.Locale)v9).stripExtensions();
    Object v11 = ((org.joda.time.field.BaseDateTimeField)v1).getAsShortText(((org.joda.time.ReadablePartial)v6),((java.util.Locale)v9));
    org.junit.Assert.assertEquals((Object)("1970"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 15L;
    Object v4 = 19;
    Object v5 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).addWrapField((((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(15552000015L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.year();
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = new org.joda.time.field.OffsetDateTimeField(((org.joda.time.DateTimeField)v1),((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.joda.time.field.BaseDateTimeField)v6).getMinimumValue();
    Object v8 = -7L;
    Object v9 = ((org.joda.time.field.BaseDateTimeField)v6).roundHalfFloor((((java.lang.Long)v8).longValue()));
    org.junit.Assert.assertEquals((Object)(-9936000000L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = new org.joda.time.chrono.BasicWeekyearDateTimeField(((org.joda.time.chrono.BasicChronology)v0));
    Object v2 = org.joda.time.DateTimeFieldType.year();
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = new org.joda.time.field.OffsetDateTimeField(((org.joda.time.DateTimeField)v1),((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 30L;
    Object v8 = 0;
    Object v9 = 13;
    Object v10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new org.joda.time.LocalDate((((java.lang.Long)v7).longValue()),((org.joda.time.DateTimeZone)v10));
    Object v12 = 7;
    Object v13 = "(";
    Object v14 = "CTT";
    Object v15 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((org.joda.time.field.BaseDateTimeField)v6).getAsText(((org.joda.time.ReadablePartial)v11),(((java.lang.Integer)v12).intValue()),((java.util.Locale)v15));
    org.junit.Assert.assertEquals((Object)("7"), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = 0;
    Object v5 = 13;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v6));
    Object v8 = 19L;
    Object v9 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v10 = new org.joda.time.DateTime((((java.lang.Long)v8).longValue()),((org.joda.time.Chronology)v9));
    Object v11 = ((org.joda.time.ReadablePartial)v7).toDateTime(((org.joda.time.ReadableInstant)v10));
    Object v12 = -46;
    Object v13 = new int[]{39};
    Object v14 = -26;
    Object v15 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).add(((org.joda.time.ReadablePartial)v7),(((java.lang.Integer)v12).intValue()),((int[])v13),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = 0;
    Object v5 = 13;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v6));
    Object v8 = 1;
    Object v9 = "(";
    Object v10 = "CTT";
    Object v11 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.joda.time.field.BaseDateTimeField)v2).getAsShortText(((org.joda.time.ReadablePartial)v7),(((java.lang.Integer)v8).intValue()),((java.util.Locale)v11));
    org.junit.Assert.assertEquals((Object)("1"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 0L;
    Object v5 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).getDifferenceAsLong((((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = 0;
    Object v5 = 13;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v6));
    Object v8 = 0;
    Object v9 = ((org.joda.time.ReadablePartial)v7).getFieldType((((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    Object v11 = new int[]{7,3,28};
    Object v12 = 1;
    Object v13 = ((org.joda.time.field.BaseDateTimeField)v2).addWrapPartial(((org.joda.time.ReadablePartial)v7),(((java.lang.Integer)v10).intValue()),((int[])v11),(((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 6L;
    Object v4 = ((org.joda.time.field.BaseDateTimeField)v2).roundCeiling((((java.lang.Long)v3).longValue()));
    Object v5 = 30L;
    Object v6 = 0;
    Object v7 = 13;
    Object v8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = new org.joda.time.LocalDate((((java.lang.Long)v5).longValue()),((org.joda.time.DateTimeZone)v8));
    Object v10 = 10;
    Object v11 = new int[]{};
    Object v12 = 0;
    Object v13 = ((org.joda.time.field.BaseDateTimeField)v2).addWrapPartial(((org.joda.time.ReadablePartial)v9),(((java.lang.Integer)v10).intValue()),((int[])v11),(((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = 30L;
    Object v2 = 0;
    Object v3 = 13;
    Object v4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.joda.time.LocalDate((((java.lang.Long)v1).longValue()),((org.joda.time.DateTimeZone)v4));
    Object v6 = 1L;
    Object v7 = ((org.joda.time.chrono.BaseChronology)v0).get(((org.joda.time.ReadablePartial)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = 46;
    Object v9 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v8).intValue()));
    Object v10 = 75L;
    Object v11 = ((org.joda.time.field.BaseDateTimeField)v9).roundCeiling((((java.lang.Long)v10).longValue()));
    org.junit.Assert.assertEquals((Object)(691200000L), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = 0;
    Object v5 = 13;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v6));
    Object v8 = new int[]{1,-11};
    Object v9 = ((org.joda.time.field.BaseDateTimeField)v2).getMinimumValue(((org.joda.time.ReadablePartial)v7),((int[])v8));
    Object v10 = ((org.joda.time.chrono.BasicMonthOfYearDateTimeField)v2).getRangeDurationField();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
    Object v1 = -9;
    Object v2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(((org.joda.time.chrono.BasicChronology)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 30L;
    Object v4 = 0;
    Object v5 = 13;
    Object v6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.LocalDate((((java.lang.Long)v3).longValue()),((org.joda.time.DateTimeZone)v6));
    Object v8 = 0;
    Object v9 = ((org.joda.time.ReadablePartial)v7).getFieldType((((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = new int[]{};
    Object v12 = 5;
    Object v13 = ((org.joda.time.field.BaseDateTimeField)v2).addWrapPartial(((org.joda.time.ReadablePartial)v7),(((java.lang.Integer)v10).intValue()),((int[])v11),(((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }
}
