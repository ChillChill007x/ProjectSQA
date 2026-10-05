package org.joda.time.chrono;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.chrono.ZonedChronology)v4).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.chrono.ZonedChronology)v4).withZone(((org.joda.time.DateTimeZone)v7));
    Object v9 = 8;
    Object v10 = 0;
    Object v11 = 51;
    Object v12 = 25;
    Object v13 = 0;
    Object v14 = 0;
    Object v15 = -26;
    Object v16 = ((org.joda.time.chrono.ZonedChronology)v4).getDateTimeMillis((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = new org.joda.time.Period();
    Object v2 = 6;
    Object v3 = ((org.joda.time.ReadablePeriod)v1).getFieldType((((java.lang.Integer)v2).intValue()));
    Object v4 = 26L;
    Object v5 = 2;
    Object v6 = ((org.joda.time.chrono.BaseChronology)v0).add(((org.joda.time.ReadablePeriod)v1),(((java.lang.Long)v4).longValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(26L), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.YearMonth();
    Object v6 = new org.joda.time.Period();
    Object v7 = ((org.joda.time.ReadablePartial)v5).equals(((java.lang.Object)v6));
    Object v8 = 0L;
    Object v9 = ((org.joda.time.chrono.BaseChronology)v4).set(((org.joda.time.ReadablePartial)v5),(((java.lang.Long)v8).longValue()));
    org.junit.Assert.assertEquals((Object)(2035238400000L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.seconds();
    Object v1 = -1L;
    Object v2 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v0),(((java.lang.Long)v1).longValue()));
    Object v3 = org.joda.time.chrono.ZonedChronology.useTimeArithmetic(((org.joda.time.DurationField)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = ((org.joda.time.chrono.AssembledChronology)v0).millisOfDay();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = new org.joda.time.YearMonth();
    Object v2 = 1;
    Object v3 = ((org.joda.time.ReadablePartial)v1).getValue((((java.lang.Integer)v2).intValue()));
    Object v4 = 0L;
    Object v5 = ((org.joda.time.chrono.BaseChronology)v0).get(((org.joda.time.ReadablePartial)v1),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.chrono.ZonedChronology)v4).withZone(((org.joda.time.DateTimeZone)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 30L;
    Object v6 = 1L;
    Object v7 = 46;
    Object v8 = ((org.joda.time.chrono.BaseChronology)v4).add((((java.lang.Long)v5).longValue()),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(76L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.Period();
    Object v6 = 0;
    Object v7 = ((org.joda.time.ReadablePeriod)v5).getFieldType((((java.lang.Integer)v6).intValue()));
    Object v8 = 10L;
    Object v9 = 11L;
    Object v10 = ((org.joda.time.chrono.BaseChronology)v4).get(((org.joda.time.ReadablePeriod)v5),(((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.YearMonth();
    Object v6 = new int[]{};
    ((org.joda.time.chrono.BaseChronology)v4).validate(((org.joda.time.ReadablePartial)v5),((int[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.chrono.BaseChronology)v4).toString();
    Object v6 = ((org.joda.time.chrono.AssembledChronology)v4).minuteOfHour();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = new org.joda.time.YearMonth();
    Object v2 = 1;
    Object v3 = ((org.joda.time.ReadablePartial)v1).getFieldType((((java.lang.Integer)v2).intValue()));
    Object v4 = 0L;
    Object v5 = ((org.joda.time.chrono.BaseChronology)v0).get(((org.joda.time.ReadablePartial)v1),(((java.lang.Long)v4).longValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.chrono.AssembledChronology)v4).monthOfYear();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.chrono.AssembledChronology)v4).hourOfHalfday();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.chrono.AssembledChronology)v4).centuryOfEra();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.chrono.BaseChronology)v4).getZone();
    Object v6 = new org.joda.time.YearMonth();
    Object v7 = new int[]{};
    ((org.joda.time.chrono.BaseChronology)v4).validate(((org.joda.time.ReadablePartial)v6),((int[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = -36;
    Object v6 = 73;
    Object v7 = 0;
    Object v8 = -26;
    Object v9 = ((org.joda.time.chrono.ZonedChronology)v4).getDateTimeMillis((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.chrono.AssembledChronology)v4).era();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = new org.joda.time.YearMonth();
    Object v2 = 1L;
    Object v3 = ((org.joda.time.chrono.BaseChronology)v0).set(((org.joda.time.ReadablePartial)v1),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertEquals((Object)(2035234800001L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = new org.joda.time.YearMonth();
    Object v2 = new int[]{-18,1,34};
    ((org.joda.time.chrono.BaseChronology)v0).validate(((org.joda.time.ReadablePartial)v1),((int[])v2));
    Object v3 = null;
    Object v4 = ((org.joda.time.chrono.AssembledChronology)v0).dayOfWeek();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.DurationFieldType.seconds();
    Object v6 = -1L;
    Object v7 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.useTimeArithmetic(((org.joda.time.DurationField)v7));
    Object v9 = ((org.joda.time.chrono.ZonedChronology)v4).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.Period();
    Object v6 = ((org.joda.time.ReadablePeriod)v5).toPeriod();
    Object v7 = -43L;
    Object v8 = -32;
    Object v9 = ((org.joda.time.chrono.BaseChronology)v4).add(((org.joda.time.ReadablePeriod)v5),(((java.lang.Long)v7).longValue()),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertEquals((Object)(-43L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = new org.joda.time.Period();
    Object v2 = 0L;
    Object v3 = 1L;
    Object v4 = ((org.joda.time.chrono.BaseChronology)v0).get(((org.joda.time.ReadablePeriod)v1),(((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.chrono.BaseChronology)v4).withUTC();
    Object v6 = ((org.joda.time.chrono.AssembledChronology)v4).days();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.YearMonth();
    Object v6 = new int[]{-29,0};
    ((org.joda.time.chrono.BaseChronology)v4).validate(((org.joda.time.ReadablePartial)v5),((int[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = new org.joda.time.Period();
    Object v2 = -12L;
    Object v3 = ((org.joda.time.chrono.BaseChronology)v0).get(((org.joda.time.ReadablePeriod)v1),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = ((org.joda.time.chrono.AssembledChronology)v0).secondOfDay();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.chrono.BaseChronology)v4).era();
    Object v6 = 61L;
    Object v7 = 17L;
    Object v8 = -36;
    Object v9 = ((org.joda.time.chrono.BaseChronology)v4).add((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()),(((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertEquals((Object)(-551L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.chrono.BaseChronology)v4).yearOfCentury();
    Object v6 = new org.joda.time.Period();
    Object v7 = ((org.joda.time.ReadablePeriod)v6).getPeriodType();
    Object v8 = 0L;
    Object v9 = 0L;
    Object v10 = ((org.joda.time.chrono.BaseChronology)v4).get(((org.joda.time.ReadablePeriod)v6),(((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = new org.joda.time.Period();
    Object v2 = 34L;
    Object v3 = 0;
    Object v4 = ((org.joda.time.chrono.BaseChronology)v0).add(((org.joda.time.ReadablePeriod)v1),(((java.lang.Long)v2).longValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(34L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 3L;
    Object v2 = 0L;
    Object v3 = 18;
    Object v4 = ((org.joda.time.chrono.BaseChronology)v0).add((((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(3L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.Period();
    Object v6 = -1L;
    Object v7 = ((org.joda.time.chrono.BaseChronology)v4).get(((org.joda.time.ReadablePeriod)v5),(((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = ((org.joda.time.chrono.AssembledChronology)v8).seconds();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = ((org.joda.time.chrono.AssembledChronology)v8).eras();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.chrono.AssembledChronology)v4).halfdayOfDay();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.YearMonth();
    Object v6 = 1L;
    Object v7 = ((org.joda.time.chrono.BaseChronology)v4).set(((org.joda.time.ReadablePartial)v5),(((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertEquals((Object)(2035238400001L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = new org.joda.time.Period();
    Object v2 = 10L;
    Object v3 = -46L;
    Object v4 = ((org.joda.time.chrono.BaseChronology)v0).get(((org.joda.time.ReadablePeriod)v1),(((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = ((org.joda.time.chrono.AssembledChronology)v8).halfdays();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 0L;
    Object v2 = 1L;
    Object v3 = 44;
    Object v4 = ((org.joda.time.chrono.BaseChronology)v0).add((((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.joda.time.YearMonth();
    Object v6 = 32L;
    Object v7 = ((org.joda.time.chrono.BaseChronology)v0).get(((org.joda.time.ReadablePartial)v5),(((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v6 = new org.joda.time.Period();
    Object v7 = -12L;
    Object v8 = ((org.joda.time.chrono.BaseChronology)v5).get(((org.joda.time.ReadablePeriod)v6),(((java.lang.Long)v7).longValue()));
    Object v9 = ((org.joda.time.chrono.ZonedChronology)v4).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.Period();
    Object v6 = 21L;
    Object v7 = ((org.joda.time.chrono.BaseChronology)v4).get(((org.joda.time.ReadablePeriod)v5),(((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = 19;
    Object v10 = 19;
    Object v11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v8),((org.joda.time.DateTimeZone)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.chrono.BaseChronology)v4).hourOfDay();
    Object v6 = new org.joda.time.Period();
    Object v7 = ((org.joda.time.ReadablePeriod)v6).getPeriodType();
    Object v8 = -54L;
    Object v9 = 9;
    Object v10 = ((org.joda.time.chrono.BaseChronology)v4).add(((org.joda.time.ReadablePeriod)v6),(((java.lang.Long)v8).longValue()),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertEquals((Object)(-54L), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = ((org.joda.time.chrono.AssembledChronology)v0).halfdayOfDay();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = ((org.joda.time.chrono.AssembledChronology)v8).halfdays();
    Object v10 = org.joda.time.chrono.ZonedChronology.useTimeArithmetic(((org.joda.time.DurationField)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = 19;
    Object v10 = 19;
    Object v11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v8),((org.joda.time.DateTimeZone)v11));
    Object v13 = ((org.joda.time.chrono.AssembledChronology)v12).secondOfDay();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.seconds();
    Object v1 = -1L;
    Object v2 = new org.joda.time.field.PreciseDurationField(((org.joda.time.DurationFieldType)v0),(((java.lang.Long)v1).longValue()));
    Object v3 = ((org.joda.time.DurationField)v2).getType();
    Object v4 = org.joda.time.chrono.ZonedChronology.useTimeArithmetic(((org.joda.time.DurationField)v2));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = new org.joda.time.Period();
    Object v10 = -5L;
    Object v11 = ((org.joda.time.chrono.BaseChronology)v8).get(((org.joda.time.ReadablePeriod)v9),(((java.lang.Long)v10).longValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = 19;
    Object v10 = 19;
    Object v11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v8),((org.joda.time.DateTimeZone)v11));
    Object v13 = new org.joda.time.Period();
    Object v14 = 6L;
    Object v15 = ((org.joda.time.chrono.BaseChronology)v12).get(((org.joda.time.ReadablePeriod)v13),(((java.lang.Long)v14).longValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = new org.joda.time.Period();
    Object v10 = 26L;
    Object v11 = 0;
    Object v12 = ((org.joda.time.chrono.BaseChronology)v8).add(((org.joda.time.ReadablePeriod)v9),(((java.lang.Long)v10).longValue()),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertEquals((Object)(26L), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.chrono.AssembledChronology)v4).millisOfSecond();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = 1L;
    Object v10 = -21;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = ((org.joda.time.chrono.ZonedChronology)v8).getDateTimeMillis((((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = 0L;
    Object v10 = 13L;
    Object v11 = 0;
    Object v12 = ((org.joda.time.chrono.BaseChronology)v8).add((((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = 19;
    Object v10 = 19;
    Object v11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v8),((org.joda.time.DateTimeZone)v11));
    Object v13 = ((org.joda.time.chrono.BaseChronology)v12).weekyears();
    Object v14 = new org.joda.time.YearMonth();
    Object v15 = 1L;
    Object v16 = ((org.joda.time.chrono.BaseChronology)v12).get(((org.joda.time.ReadablePartial)v14),(((java.lang.Long)v15).longValue()));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = ((org.joda.time.chrono.AssembledChronology)v8).halfdays();
    Object v10 = ((org.joda.time.DurationField)v9).getName();
    Object v11 = org.joda.time.chrono.ZonedChronology.useTimeArithmetic(((org.joda.time.DurationField)v9));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = ((org.joda.time.chrono.AssembledChronology)v8).yearOfEra();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.chrono.AssembledChronology)v4).year();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 1L;
    Object v6 = 2L;
    Object v7 = 0;
    Object v8 = ((org.joda.time.chrono.BaseChronology)v4).add((((java.lang.Long)v5).longValue()),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(1L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = -61L;
    Object v6 = 2L;
    Object v7 = 0;
    Object v8 = ((org.joda.time.chrono.BaseChronology)v4).add((((java.lang.Long)v5).longValue()),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(-61L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = new org.joda.time.YearMonth();
    Object v10 = 0L;
    Object v11 = 19;
    Object v12 = 19;
    Object v13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new org.joda.time.MutableDateTime((((java.lang.Long)v10).longValue()),((org.joda.time.DateTimeZone)v13));
    Object v15 = ((org.joda.time.ReadablePartial)v9).toDateTime(((org.joda.time.ReadableInstant)v14));
    Object v16 = 1L;
    Object v17 = ((org.joda.time.chrono.BaseChronology)v8).set(((org.joda.time.ReadablePartial)v9),(((java.lang.Long)v16).longValue()));
    org.junit.Assert.assertEquals((Object)(2035238400001L), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = 19;
    Object v10 = 19;
    Object v11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v8),((org.joda.time.DateTimeZone)v11));
    Object v13 = new org.joda.time.YearMonth();
    Object v14 = 7L;
    Object v15 = ((org.joda.time.chrono.BaseChronology)v12).get(((org.joda.time.ReadablePartial)v13),(((java.lang.Long)v14).longValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.chrono.AssembledChronology)v4).weekyear();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = new org.joda.time.Period();
    Object v10 = 58L;
    Object v11 = ((org.joda.time.chrono.BaseChronology)v8).get(((org.joda.time.ReadablePeriod)v9),(((java.lang.Long)v10).longValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = ((org.joda.time.chrono.AssembledChronology)v0).dayOfYear();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.chrono.ZonedChronology)v4).toString();
    org.junit.Assert.assertEquals((Object)("ZonedChronology[EthiopicChronology[UTC], +19:19]"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.chrono.ZonedChronology)v4).withZone(((org.joda.time.DateTimeZone)v7));
    Object v9 = ((org.joda.time.chrono.ZonedChronology)v8).getZone();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = 0L;
    Object v10 = 1L;
    Object v11 = 0;
    Object v12 = ((org.joda.time.chrono.BaseChronology)v8).add((((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.joda.time.chrono.AssembledChronology)v8).minuteOfHour();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 0L;
    Object v6 = 0L;
    Object v7 = -11;
    Object v8 = ((org.joda.time.chrono.BaseChronology)v4).add((((java.lang.Long)v5).longValue()),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.Period();
    Object v6 = 20L;
    Object v7 = ((org.joda.time.chrono.BaseChronology)v4).get(((org.joda.time.ReadablePeriod)v5),(((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = 19;
    Object v10 = 19;
    Object v11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v8),((org.joda.time.DateTimeZone)v11));
    Object v13 = new org.joda.time.Period();
    Object v14 = -21L;
    Object v15 = ((org.joda.time.chrono.BaseChronology)v12).get(((org.joda.time.ReadablePeriod)v13),(((java.lang.Long)v14).longValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = new org.joda.time.Period();
    Object v2 = 1L;
    Object v3 = 3L;
    Object v4 = ((org.joda.time.chrono.BaseChronology)v0).get(((org.joda.time.ReadablePeriod)v1),(((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()));
    Object v5 = new org.joda.time.Period();
    Object v6 = 1L;
    Object v7 = 0;
    Object v8 = ((org.joda.time.chrono.BaseChronology)v0).add(((org.joda.time.ReadablePeriod)v5),(((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(1L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = ((org.joda.time.chrono.AssembledChronology)v8).weekyear();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.YearMonth();
    Object v6 = 0L;
    Object v7 = ((org.joda.time.chrono.BaseChronology)v4).set(((org.joda.time.ReadablePartial)v5),(((java.lang.Long)v6).longValue()));
    Object v8 = ((org.joda.time.chrono.AssembledChronology)v4).weeks();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = ((org.joda.time.chrono.AssembledChronology)v8).clockhourOfDay();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = ((org.joda.time.chrono.BaseChronology)v8).weekyearOfCentury();
    Object v10 = new org.joda.time.YearMonth();
    Object v11 = 30L;
    Object v12 = ((org.joda.time.chrono.BaseChronology)v8).get(((org.joda.time.ReadablePartial)v10),(((java.lang.Long)v11).longValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = -79L;
    Object v10 = 1;
    Object v11 = 11;
    Object v12 = 70;
    Object v13 = 1;
    Object v14 = ((org.joda.time.chrono.ZonedChronology)v8).getDateTimeMillis((((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0L;
    Object v9 = ((org.joda.time.DateTimeZone)v7).getStandardOffset((((java.lang.Long)v8).longValue()));
    Object v10 = ((org.joda.time.chrono.ZonedChronology)v4).withZone(((org.joda.time.DateTimeZone)v7));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.chrono.AssembledChronology)v4).weekyears();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = 8L;
    Object v10 = 10;
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = ((org.joda.time.chrono.ZonedChronology)v8).getDateTimeMillis((((java.lang.Long)v9).longValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertEquals((Object)(-33480000L), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0L;
    Object v9 = ((org.joda.time.DateTimeZone)v7).getStandardOffset((((java.lang.Long)v8).longValue()));
    Object v10 = ((org.joda.time.chrono.ZonedChronology)v4).withZone(((org.joda.time.DateTimeZone)v7));
    Object v11 = ((org.joda.time.chrono.AssembledChronology)v10).hours();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.chrono.AssembledChronology)v4).seconds();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.Period();
    Object v6 = -4L;
    Object v7 = ((org.joda.time.chrono.BaseChronology)v4).get(((org.joda.time.ReadablePeriod)v5),(((java.lang.Long)v6).longValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 71L;
    Object v2 = 0L;
    Object v3 = 0;
    Object v4 = ((org.joda.time.chrono.BaseChronology)v0).add((((java.lang.Long)v1).longValue()),(((java.lang.Long)v2).longValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(71L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = 19;
    Object v10 = 19;
    Object v11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v8),((org.joda.time.DateTimeZone)v11));
    Object v13 = ((org.joda.time.chrono.ZonedChronology)v12).getZone();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0L;
    Object v9 = ((org.joda.time.DateTimeZone)v7).getStandardOffset((((java.lang.Long)v8).longValue()));
    Object v10 = ((org.joda.time.chrono.ZonedChronology)v4).withZone(((org.joda.time.DateTimeZone)v7));
    Object v11 = new org.joda.time.YearMonth();
    Object v12 = -40L;
    Object v13 = ((org.joda.time.chrono.BaseChronology)v10).get(((org.joda.time.ReadablePartial)v11),(((java.lang.Long)v12).longValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = 19;
    Object v10 = 19;
    Object v11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v8),((org.joda.time.DateTimeZone)v11));
    Object v13 = ((org.joda.time.chrono.BaseChronology)v12).minuteOfDay();
    Object v14 = new org.joda.time.Period();
    Object v15 = 0L;
    Object v16 = 0L;
    Object v17 = ((org.joda.time.chrono.BaseChronology)v12).get(((org.joda.time.ReadablePeriod)v14),(((java.lang.Long)v15).longValue()),(((java.lang.Long)v16).longValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = ((org.joda.time.chrono.AssembledChronology)v8).centuries();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = 19;
    Object v10 = 19;
    Object v11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v8),((org.joda.time.DateTimeZone)v11));
    Object v13 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v14 = 19;
    Object v15 = 19;
    Object v16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v13),((org.joda.time.DateTimeZone)v16));
    Object v18 = 19;
    Object v19 = 19;
    Object v20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v17),((org.joda.time.DateTimeZone)v20));
    Object v22 = 19;
    Object v23 = 19;
    Object v24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v21),((org.joda.time.DateTimeZone)v24));
    Object v26 = new org.joda.time.Period();
    Object v27 = -21L;
    Object v28 = ((org.joda.time.chrono.BaseChronology)v25).get(((org.joda.time.ReadablePeriod)v26),(((java.lang.Long)v27).longValue()));
    Object v29 = ((org.joda.time.chrono.ZonedChronology)v12).equals(((java.lang.Object)v28));
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.chrono.AssembledChronology)v4).centuries();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = ((org.joda.time.chrono.AssembledChronology)v8).monthOfYear();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 37;
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = -26;
    Object v10 = -17;
    Object v11 = -32;
    Object v12 = ((org.joda.time.chrono.ZonedChronology)v4).getDateTimeMillis((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = 0L;
    Object v9 = ((org.joda.time.DateTimeZone)v7).getStandardOffset((((java.lang.Long)v8).longValue()));
    Object v10 = ((org.joda.time.chrono.ZonedChronology)v4).withZone(((org.joda.time.DateTimeZone)v7));
    Object v11 = ((org.joda.time.chrono.BaseChronology)v10).toString();
    Object v12 = new org.joda.time.YearMonth();
    Object v13 = new int[]{-24,1,0};
    ((org.joda.time.chrono.BaseChronology)v10).validate(((org.joda.time.ReadablePartial)v12),((int[])v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = new org.joda.time.Period();
    Object v10 = 0L;
    Object v11 = 0;
    Object v12 = ((org.joda.time.chrono.BaseChronology)v8).add(((org.joda.time.ReadablePeriod)v9),(((java.lang.Long)v10).longValue()),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = 19;
    Object v10 = 19;
    Object v11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v8),((org.joda.time.DateTimeZone)v11));
    Object v13 = ((org.joda.time.chrono.BaseChronology)v12).eras();
    Object v14 = new org.joda.time.YearMonth();
    Object v15 = new int[]{-1};
    ((org.joda.time.chrono.BaseChronology)v12).validate(((org.joda.time.ReadablePartial)v14),((int[])v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = ((org.joda.time.chrono.AssembledChronology)v4).dayOfMonth();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = 19;
    Object v6 = 19;
    Object v7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v4),((org.joda.time.DateTimeZone)v7));
    Object v9 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v10 = 19;
    Object v11 = 19;
    Object v12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v9),((org.joda.time.DateTimeZone)v12));
    Object v14 = 19;
    Object v15 = 19;
    Object v16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v13),((org.joda.time.DateTimeZone)v16));
    Object v18 = 0L;
    Object v19 = 1L;
    Object v20 = 0;
    Object v21 = ((org.joda.time.chrono.BaseChronology)v17).add((((java.lang.Long)v18).longValue()),(((java.lang.Long)v19).longValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.joda.time.chrono.AssembledChronology)v17).minuteOfHour();
    Object v23 = ((org.joda.time.chrono.ZonedChronology)v8).equals(((java.lang.Object)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    Object v1 = 19;
    Object v2 = 19;
    Object v3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.chrono.ZonedChronology.getInstance(((org.joda.time.Chronology)v0),((org.joda.time.DateTimeZone)v3));
    Object v5 = new org.joda.time.YearMonth();
    Object v6 = new int[]{24,-37,13};
    ((org.joda.time.chrono.BaseChronology)v4).validate(((org.joda.time.ReadablePartial)v5),((int[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }
}
