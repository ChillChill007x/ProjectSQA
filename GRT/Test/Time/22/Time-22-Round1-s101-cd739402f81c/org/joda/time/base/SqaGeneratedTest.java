package org.joda.time.base;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = null;
    Object v7 = new org.joda.time.MutableDateTime(((java.lang.Object)v6));
    Object v8 = ((org.joda.time.base.BasePeriod)v5).toDurationTo(((org.joda.time.ReadableInstant)v7));
    Object v9 = 3L;
    Object v10 = 1L;
    Object v11 = new org.joda.time.Duration((((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
    Object v12 = null;
    Object v13 = new org.joda.time.MutableDateTime(((java.lang.Object)v12));
    Object v14 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v11),((org.joda.time.ReadableInstant)v13));
    Object v15 = ((org.joda.time.ReadablePeriod)v14).size();
    ((org.joda.time.base.BasePeriod)v5).mergePeriod(((org.joda.time.ReadablePeriod)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = 26;
    ((org.joda.time.base.BasePeriod)v5).addField(((org.joda.time.DurationFieldType)v6),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).get(((org.joda.time.DurationFieldType)v6));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = new int[]{1,15,0};
    Object v7 = org.joda.time.DurationFieldType.eras();
    Object v8 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
    Object v9 = ((org.joda.time.DurationFieldType)v7).getField(((org.joda.time.Chronology)v8));
    Object v10 = 1;
    ((org.joda.time.base.BasePeriod)v5).addFieldInto(((int[])v6),((org.joda.time.DurationFieldType)v7),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).getValues();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = new int[]{};
    Object v7 = org.joda.time.DurationFieldType.eras();
    Object v8 = 0;
    ((org.joda.time.base.BasePeriod)v5).setFieldInto(((int[])v6),((org.joda.time.DurationFieldType)v7),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = new int[]{1,-40};
    Object v7 = 3L;
    Object v8 = 1L;
    Object v9 = new org.joda.time.Duration((((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
    Object v10 = null;
    Object v11 = new org.joda.time.MutableDateTime(((java.lang.Object)v10));
    Object v12 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v9),((org.joda.time.ReadableInstant)v11));
    Object v13 = ((org.joda.time.base.BasePeriod)v5).addPeriodInto(((int[])v6),((org.joda.time.ReadablePeriod)v12));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = new int[]{58,30};
    Object v7 = org.joda.time.DurationFieldType.eras();
    Object v8 = 10;
    ((org.joda.time.base.BasePeriod)v5).addFieldInto(((int[])v6),((org.joda.time.DurationFieldType)v7),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).getFieldTypes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).indexOf(((org.joda.time.DurationFieldType)v6));
    Object v8 = new int[]{17,57};
    Object v9 = org.joda.time.DurationFieldType.eras();
    Object v10 = -9;
    ((org.joda.time.base.BasePeriod)v5).setFieldInto(((int[])v8),((org.joda.time.DurationFieldType)v9),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = 3L;
    Object v7 = 1L;
    Object v8 = new org.joda.time.Duration((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()));
    Object v9 = null;
    Object v10 = new org.joda.time.MutableDateTime(((java.lang.Object)v9));
    Object v11 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v8),((org.joda.time.ReadableInstant)v10));
    ((org.joda.time.base.BasePeriod)v5).addPeriod(((org.joda.time.ReadablePeriod)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).isSupported(((org.joda.time.DurationFieldType)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DateTimeZone.getDefault();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.format.PeriodFormat.getDefault();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).toString(((org.joda.time.format.PeriodFormatter)v6));
    org.junit.Assert.assertEquals((Object)("-2 milliseconds"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).getValues();
    Object v7 = new int[]{};
    Object v8 = 3L;
    Object v9 = 1L;
    Object v10 = new org.joda.time.Duration((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
    Object v11 = null;
    Object v12 = new org.joda.time.MutableDateTime(((java.lang.Object)v11));
    Object v13 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v10),((org.joda.time.ReadableInstant)v12));
    Object v14 = ((org.joda.time.base.BasePeriod)v5).addPeriodInto(((int[])v7),((org.joda.time.ReadablePeriod)v13));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).hashCode();
    Object v7 = new int[]{-58,56};
    Object v8 = org.joda.time.DurationFieldType.eras();
    Object v9 = -1;
    ((org.joda.time.base.BasePeriod)v5).addFieldInto(((int[])v7),((org.joda.time.DurationFieldType)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = new int[]{0,0};
    Object v7 = 3L;
    Object v8 = 1L;
    Object v9 = new org.joda.time.Duration((((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
    Object v10 = null;
    Object v11 = new org.joda.time.MutableDateTime(((java.lang.Object)v10));
    Object v12 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v9),((org.joda.time.ReadableInstant)v11));
    Object v13 = ((org.joda.time.base.BasePeriod)v5).mergePeriodInto(((int[])v6),((org.joda.time.ReadablePeriod)v12));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = 1;
    Object v7 = -21;
    ((org.joda.time.base.BasePeriod)v5).setValue((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = new int[]{0};
    Object v7 = 3L;
    Object v8 = 1L;
    Object v9 = new org.joda.time.Duration((((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
    Object v10 = null;
    Object v11 = new org.joda.time.MutableDateTime(((java.lang.Object)v10));
    Object v12 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v9),((org.joda.time.ReadableInstant)v11));
    Object v13 = ((org.joda.time.base.BasePeriod)v5).mergePeriodInto(((int[])v6),((org.joda.time.ReadablePeriod)v12));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = 1;
    Object v7 = ((org.joda.time.ReadablePeriod)v5).getFieldType((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.base.AbstractPeriod)v5).getFieldTypes();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(-837025232), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).getFieldTypes();
    Object v7 = 3L;
    Object v8 = 1L;
    Object v9 = new org.joda.time.Duration((((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
    Object v10 = null;
    Object v11 = new org.joda.time.MutableDateTime(((java.lang.Object)v10));
    Object v12 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v9),((org.joda.time.ReadableInstant)v11));
    ((org.joda.time.base.BasePeriod)v5).mergePeriod(((org.joda.time.ReadablePeriod)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).isSupported(((org.joda.time.DurationFieldType)v6));
    Object v8 = org.joda.time.format.PeriodFormat.getDefault();
    Object v9 = "\" from remaining set: ";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = ((org.joda.time.format.PeriodFormatter)v8).withLocale(((java.util.Locale)v10));
    Object v12 = ((org.joda.time.base.AbstractPeriod)v5).toString(((org.joda.time.format.PeriodFormatter)v8));
    org.junit.Assert.assertEquals((Object)("-2 milliseconds"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toPeriod();
    Object v7 = 3L;
    Object v8 = 1L;
    Object v9 = new org.joda.time.Duration((((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
    Object v10 = null;
    Object v11 = new org.joda.time.MutableDateTime(((java.lang.Object)v10));
    Object v12 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v9),((org.joda.time.ReadableInstant)v11));
    ((org.joda.time.base.BasePeriod)v5).setPeriod(((org.joda.time.ReadablePeriod)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toString();
    Object v7 = org.joda.time.DurationFieldType.eras();
    Object v8 = -7;
    ((org.joda.time.base.BasePeriod)v5).setField(((org.joda.time.DurationFieldType)v7),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = 22;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = 0;
    Object v10 = 39;
    Object v11 = 0;
    Object v12 = 1;
    Object v13 = -8;
    ((org.joda.time.base.BasePeriod)v5).setPeriod((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toString();
    Object v7 = new int[]{10,1};
    Object v8 = 3L;
    Object v9 = 1L;
    Object v10 = new org.joda.time.Duration((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
    Object v11 = null;
    Object v12 = new org.joda.time.MutableDateTime(((java.lang.Object)v11));
    Object v13 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v10),((org.joda.time.ReadableInstant)v12));
    Object v14 = ((org.joda.time.base.BasePeriod)v5).addPeriodInto(((int[])v7),((org.joda.time.ReadablePeriod)v13));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.BasePeriod)v5).size();
    org.junit.Assert.assertEquals((Object)(8), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = 3L;
    Object v7 = 1L;
    Object v8 = new org.joda.time.Duration((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()));
    Object v9 = null;
    Object v10 = new org.joda.time.MutableDateTime(((java.lang.Object)v9));
    Object v11 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v8),((org.joda.time.ReadableInstant)v10));
    ((org.joda.time.base.BasePeriod)v5).setPeriod(((org.joda.time.ReadablePeriod)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).indexOf(((org.joda.time.DurationFieldType)v6));
    Object v8 = ((org.joda.time.base.AbstractPeriod)v5).getFieldTypes();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = -24;
    Object v7 = -38;
    Object v8 = 0;
    Object v9 = -30;
    Object v10 = 19;
    Object v11 = 1;
    Object v12 = -9;
    Object v13 = -79;
    ((org.joda.time.base.BasePeriod)v5).setPeriod((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = new int[]{0,9};
    Object v7 = org.joda.time.DurationFieldType.eras();
    Object v8 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
    Object v9 = ((org.joda.time.DurationFieldType)v7).getField(((org.joda.time.Chronology)v8));
    Object v10 = 0;
    ((org.joda.time.base.BasePeriod)v5).addFieldInto(((int[])v6),((org.joda.time.DurationFieldType)v7),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = new int[]{0,1};
    Object v7 = 3L;
    Object v8 = 1L;
    Object v9 = new org.joda.time.Duration((((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
    Object v10 = null;
    Object v11 = new org.joda.time.MutableDateTime(((java.lang.Object)v10));
    Object v12 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v9),((org.joda.time.ReadableInstant)v11));
    Object v13 = ((org.joda.time.base.BasePeriod)v5).addPeriodInto(((int[])v6),((org.joda.time.ReadablePeriod)v12));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.DurationFieldType)v6).isSupported(((org.joda.time.Chronology)v7));
    Object v9 = -33;
    ((org.joda.time.base.BasePeriod)v5).addField(((org.joda.time.DurationFieldType)v6),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = new int[]{1,69,1};
    Object v7 = org.joda.time.DurationFieldType.eras();
    Object v8 = 1;
    ((org.joda.time.base.BasePeriod)v5).addFieldInto(((int[])v6),((org.joda.time.DurationFieldType)v7),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = new int[]{0,0,0};
    Object v7 = 3L;
    Object v8 = 1L;
    Object v9 = new org.joda.time.Duration((((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
    Object v10 = null;
    Object v11 = new org.joda.time.MutableDateTime(((java.lang.Object)v10));
    Object v12 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v9),((org.joda.time.ReadableInstant)v11));
    Object v13 = ((org.joda.time.base.BasePeriod)v5).mergePeriodInto(((int[])v6),((org.joda.time.ReadablePeriod)v12));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = 1;
    Object v7 = ((org.joda.time.base.BasePeriod)v5).getValue((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.PeriodType.months();
    Object v7 = ((org.joda.time.base.BasePeriod)v5).checkPeriodType(((org.joda.time.PeriodType)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.DurationFieldType)v6).isSupported(((org.joda.time.Chronology)v7));
    Object v9 = 86400000;
    ((org.joda.time.base.BasePeriod)v5).setField(((org.joda.time.DurationFieldType)v6),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = 3L;
    Object v7 = 1L;
    Object v8 = new org.joda.time.Duration((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()));
    Object v9 = null;
    Object v10 = new org.joda.time.MutableDateTime(((java.lang.Object)v9));
    Object v11 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v8),((org.joda.time.ReadableInstant)v10));
    Object v12 = ((org.joda.time.ReadablePeriod)v11).hashCode();
    ((org.joda.time.base.BasePeriod)v5).addPeriod(((org.joda.time.ReadablePeriod)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toString();
    org.junit.Assert.assertEquals((Object)("PT0.002S"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).getValues();
    Object v7 = org.joda.time.format.PeriodFormat.getDefault();
    Object v8 = ((org.joda.time.base.AbstractPeriod)v5).toString(((org.joda.time.format.PeriodFormatter)v7));
    org.junit.Assert.assertEquals((Object)("-2 milliseconds"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = new int[]{1,-4,-14};
    Object v7 = org.joda.time.DurationFieldType.eras();
    Object v8 = 640208007;
    ((org.joda.time.base.BasePeriod)v5).addFieldInto(((int[])v6),((org.joda.time.DurationFieldType)v7),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).indexOf(((org.joda.time.DurationFieldType)v6));
    Object v8 = org.joda.time.format.PeriodFormat.getDefault();
    Object v9 = ((org.joda.time.base.AbstractPeriod)v5).toString(((org.joda.time.format.PeriodFormatter)v8));
    org.junit.Assert.assertEquals((Object)("-2 milliseconds"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = new int[]{0};
    ((org.joda.time.base.BasePeriod)v5).setValues(((int[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = new int[]{1};
    Object v7 = 3L;
    Object v8 = 1L;
    Object v9 = new org.joda.time.Duration((((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
    Object v10 = null;
    Object v11 = new org.joda.time.MutableDateTime(((java.lang.Object)v10));
    Object v12 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v9),((org.joda.time.ReadableInstant)v11));
    Object v13 = org.joda.time.DurationFieldType.eras();
    Object v14 = ((org.joda.time.ReadablePeriod)v12).get(((org.joda.time.DurationFieldType)v13));
    Object v15 = ((org.joda.time.base.BasePeriod)v5).addPeriodInto(((int[])v6),((org.joda.time.ReadablePeriod)v12));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).indexOf(((org.joda.time.DurationFieldType)v6));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = new int[]{1};
    Object v7 = org.joda.time.DurationFieldType.eras();
    Object v8 = 39;
    ((org.joda.time.base.BasePeriod)v5).setFieldInto(((int[])v6),((org.joda.time.DurationFieldType)v7),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = new int[]{1,2};
    Object v7 = org.joda.time.DurationFieldType.eras();
    Object v8 = -6;
    ((org.joda.time.base.BasePeriod)v5).setFieldInto(((int[])v6),((org.joda.time.DurationFieldType)v7),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = new int[]{41,0};
    Object v7 = org.joda.time.DurationFieldType.eras();
    Object v8 = -1;
    ((org.joda.time.base.BasePeriod)v5).setFieldInto(((int[])v6),((org.joda.time.DurationFieldType)v7),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = 3L;
    Object v7 = 1L;
    Object v8 = new org.joda.time.Duration((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()));
    Object v9 = ((org.joda.time.base.AbstractPeriod)v5).equals(((java.lang.Object)v8));
    Object v10 = ((org.joda.time.base.AbstractPeriod)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(-837025232), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = new int[]{13,40};
    Object v7 = org.joda.time.DurationFieldType.eras();
    Object v8 = -3;
    ((org.joda.time.base.BasePeriod)v5).addFieldInto(((int[])v6),((org.joda.time.DurationFieldType)v7),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toPeriod();
    Object v7 = org.joda.time.format.PeriodFormat.getDefault();
    Object v8 = ((org.joda.time.base.AbstractPeriod)v5).toString(((org.joda.time.format.PeriodFormatter)v7));
    org.junit.Assert.assertEquals((Object)("-2 milliseconds"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = new int[]{35};
    Object v7 = org.joda.time.DurationFieldType.eras();
    Object v8 = -53;
    ((org.joda.time.base.BasePeriod)v5).setFieldInto(((int[])v6),((org.joda.time.DurationFieldType)v7),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = null;
    Object v7 = new org.joda.time.MutableDateTime(((java.lang.Object)v6));
    Object v8 = ((org.joda.time.base.BasePeriod)v5).toDurationTo(((org.joda.time.ReadableInstant)v7));
    Object v9 = 3L;
    Object v10 = 1L;
    Object v11 = new org.joda.time.Duration((((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
    Object v12 = null;
    Object v13 = new org.joda.time.MutableDateTime(((java.lang.Object)v12));
    Object v14 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v11),((org.joda.time.ReadableInstant)v13));
    ((org.joda.time.base.BasePeriod)v5).setPeriod(((org.joda.time.ReadablePeriod)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.format.PeriodFormat.getDefault();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).toString(((org.joda.time.format.PeriodFormatter)v6));
    Object v8 = new int[]{0,0};
    Object v9 = 3L;
    Object v10 = 1L;
    Object v11 = new org.joda.time.Duration((((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
    Object v12 = null;
    Object v13 = new org.joda.time.MutableDateTime(((java.lang.Object)v12));
    Object v14 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v11),((org.joda.time.ReadableInstant)v13));
    Object v15 = ((org.joda.time.base.BasePeriod)v5).mergePeriodInto(((int[])v8),((org.joda.time.ReadablePeriod)v14));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = 3L;
    Object v7 = 1L;
    Object v8 = new org.joda.time.Duration((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()));
    Object v9 = null;
    Object v10 = new org.joda.time.MutableDateTime(((java.lang.Object)v9));
    Object v11 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v8),((org.joda.time.ReadableInstant)v10));
    Object v12 = org.joda.time.PeriodType.months();
    Object v13 = ((org.joda.time.base.BasePeriod)v11).checkPeriodType(((org.joda.time.PeriodType)v12));
    Object v14 = ((org.joda.time.base.BasePeriod)v5).checkPeriodType(((org.joda.time.PeriodType)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toMutablePeriod();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toMutablePeriod();
    Object v7 = null;
    Object v8 = new org.joda.time.MutableDateTime(((java.lang.Object)v7));
    Object v9 = ((org.joda.time.base.BasePeriod)v6).toDurationTo(((org.joda.time.ReadableInstant)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toMutablePeriod();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v6).getFieldTypes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toMutablePeriod();
    Object v7 = -62;
    Object v8 = ((org.joda.time.base.BasePeriod)v6).getFieldType((((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).get(((org.joda.time.DurationFieldType)v6));
    Object v8 = ((org.joda.time.base.AbstractPeriod)v5).toPeriod();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).get(((org.joda.time.DurationFieldType)v6));
    Object v8 = ((org.joda.time.base.AbstractPeriod)v5).toPeriod();
    Object v9 = org.joda.time.DurationFieldType.eras();
    Object v10 = ((org.joda.time.base.AbstractPeriod)v8).get(((org.joda.time.DurationFieldType)v9));
    Object v11 = ((org.joda.time.base.AbstractPeriod)v8).getFieldTypes();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toMutablePeriod();
    Object v7 = org.joda.time.format.PeriodFormat.getDefault();
    Object v8 = ((org.joda.time.base.AbstractPeriod)v6).toString(((org.joda.time.format.PeriodFormatter)v7));
    org.junit.Assert.assertEquals((Object)("-2 milliseconds"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toMutablePeriod();
    Object v7 = 3L;
    Object v8 = 1L;
    Object v9 = new org.joda.time.Duration((((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
    Object v10 = null;
    Object v11 = new org.joda.time.MutableDateTime(((java.lang.Object)v10));
    Object v12 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v9),((org.joda.time.ReadableInstant)v11));
    Object v13 = 1;
    Object v14 = ((org.joda.time.ReadablePeriod)v12).getFieldType((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.joda.time.base.AbstractPeriod)v12).getFieldTypes();
    Object v16 = ((org.joda.time.base.AbstractPeriod)v6).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).get(((org.joda.time.DurationFieldType)v6));
    Object v8 = ((org.joda.time.base.AbstractPeriod)v5).toPeriod();
    Object v9 = ((org.joda.time.base.AbstractPeriod)v8).getFieldTypes();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toMutablePeriod();
    Object v7 = org.joda.time.DurationFieldType.eras();
    Object v8 = ((org.joda.time.base.AbstractPeriod)v6).isSupported(((org.joda.time.DurationFieldType)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).get(((org.joda.time.DurationFieldType)v6));
    Object v8 = ((org.joda.time.base.AbstractPeriod)v5).toPeriod();
    Object v9 = org.joda.time.DurationFieldType.eras();
    Object v10 = ((org.joda.time.base.AbstractPeriod)v8).get(((org.joda.time.DurationFieldType)v9));
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).get(((org.joda.time.DurationFieldType)v6));
    Object v8 = ((org.joda.time.base.AbstractPeriod)v5).toPeriod();
    Object v9 = ((org.joda.time.base.AbstractPeriod)v8).hashCode();
    org.junit.Assert.assertEquals((Object)(-837025232), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).get(((org.joda.time.DurationFieldType)v6));
    Object v8 = ((org.joda.time.base.AbstractPeriod)v5).toPeriod();
    Object v9 = new int[]{};
    Object v10 = 3L;
    Object v11 = 1L;
    Object v12 = new org.joda.time.Duration((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()));
    Object v13 = null;
    Object v14 = new org.joda.time.MutableDateTime(((java.lang.Object)v13));
    Object v15 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v12),((org.joda.time.ReadableInstant)v14));
    Object v16 = ((org.joda.time.base.AbstractPeriod)v15).toMutablePeriod();
    Object v17 = ((org.joda.time.base.BasePeriod)v8).mergePeriodInto(((int[])v9),((org.joda.time.ReadablePeriod)v16));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).get(((org.joda.time.DurationFieldType)v6));
    Object v8 = ((org.joda.time.base.AbstractPeriod)v5).toPeriod();
    Object v9 = new int[]{0,2147483635,-19};
    Object v10 = org.joda.time.DurationFieldType.eras();
    Object v11 = 6;
    ((org.joda.time.base.BasePeriod)v8).setFieldInto(((int[])v9),((org.joda.time.DurationFieldType)v10),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toMutablePeriod();
    Object v7 = org.joda.time.DurationFieldType.eras();
    Object v8 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
    Object v9 = ((org.joda.time.DurationFieldType)v7).getField(((org.joda.time.Chronology)v8));
    Object v10 = ((org.joda.time.base.AbstractPeriod)v6).get(((org.joda.time.DurationFieldType)v7));
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).get(((org.joda.time.DurationFieldType)v6));
    Object v8 = ((org.joda.time.base.AbstractPeriod)v5).toPeriod();
    Object v9 = ((org.joda.time.base.AbstractPeriod)v8).toPeriod();
    Object v10 = ((org.joda.time.base.AbstractPeriod)v8).getValues();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).get(((org.joda.time.DurationFieldType)v6));
    Object v8 = ((org.joda.time.base.AbstractPeriod)v5).toPeriod();
    Object v9 = new int[]{0,0,0};
    Object v10 = 3L;
    Object v11 = 1L;
    Object v12 = new org.joda.time.Duration((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()));
    Object v13 = null;
    Object v14 = new org.joda.time.MutableDateTime(((java.lang.Object)v13));
    Object v15 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v12),((org.joda.time.ReadableInstant)v14));
    Object v16 = org.joda.time.DurationFieldType.eras();
    Object v17 = ((org.joda.time.base.AbstractPeriod)v15).get(((org.joda.time.DurationFieldType)v16));
    Object v18 = ((org.joda.time.base.AbstractPeriod)v15).toPeriod();
    Object v19 = ((org.joda.time.base.BasePeriod)v8).mergePeriodInto(((int[])v9),((org.joda.time.ReadablePeriod)v18));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toMutablePeriod();
    Object v7 = org.joda.time.DurationFieldType.eras();
    Object v8 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
    Object v9 = ((org.joda.time.DurationFieldType)v7).isSupported(((org.joda.time.Chronology)v8));
    Object v10 = ((org.joda.time.base.AbstractPeriod)v6).indexOf(((org.joda.time.DurationFieldType)v7));
    org.junit.Assert.assertEquals((Object)(-1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toMutablePeriod();
    Object v7 = ((org.joda.time.base.BasePeriod)v6).getPeriodType();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toMutablePeriod();
    Object v7 = org.joda.time.DurationFieldType.eras();
    Object v8 = ((org.joda.time.base.AbstractPeriod)v6).get(((org.joda.time.DurationFieldType)v7));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).get(((org.joda.time.DurationFieldType)v6));
    Object v8 = ((org.joda.time.base.AbstractPeriod)v5).toPeriod();
    Object v9 = org.joda.time.format.PeriodFormat.getDefault();
    Object v10 = ((org.joda.time.base.AbstractPeriod)v8).toString(((org.joda.time.format.PeriodFormatter)v9));
    org.junit.Assert.assertEquals((Object)("-2 milliseconds"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toMutablePeriod();
    Object v7 = 3L;
    Object v8 = 1L;
    Object v9 = new org.joda.time.Duration((((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
    Object v10 = null;
    Object v11 = new org.joda.time.MutableDateTime(((java.lang.Object)v10));
    Object v12 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v9),((org.joda.time.ReadableInstant)v11));
    Object v13 = org.joda.time.DurationFieldType.eras();
    Object v14 = ((org.joda.time.base.AbstractPeriod)v12).get(((org.joda.time.DurationFieldType)v13));
    Object v15 = ((org.joda.time.base.AbstractPeriod)v12).toPeriod();
    ((org.joda.time.base.BasePeriod)v6).mergePeriod(((org.joda.time.ReadablePeriod)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).get(((org.joda.time.DurationFieldType)v6));
    Object v8 = ((org.joda.time.base.AbstractPeriod)v5).toPeriod();
    Object v9 = new int[]{};
    Object v10 = 3L;
    Object v11 = 1L;
    Object v12 = new org.joda.time.Duration((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()));
    Object v13 = null;
    Object v14 = new org.joda.time.MutableDateTime(((java.lang.Object)v13));
    Object v15 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v12),((org.joda.time.ReadableInstant)v14));
    Object v16 = org.joda.time.DurationFieldType.eras();
    Object v17 = ((org.joda.time.base.AbstractPeriod)v15).get(((org.joda.time.DurationFieldType)v16));
    Object v18 = ((org.joda.time.base.AbstractPeriod)v15).toPeriod();
    Object v19 = ((org.joda.time.base.BasePeriod)v8).addPeriodInto(((int[])v9),((org.joda.time.ReadablePeriod)v18));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toMutablePeriod();
    Object v7 = new int[]{0};
    Object v8 = org.joda.time.DurationFieldType.eras();
    Object v9 = 0;
    ((org.joda.time.base.BasePeriod)v6).setFieldInto(((int[])v7),((org.joda.time.DurationFieldType)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = new int[]{33,2};
    Object v7 = org.joda.time.DurationFieldType.eras();
    Object v8 = 1;
    ((org.joda.time.base.BasePeriod)v5).setFieldInto(((int[])v6),((org.joda.time.DurationFieldType)v7),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = new int[]{1};
    Object v7 = org.joda.time.DurationFieldType.eras();
    Object v8 = 0;
    ((org.joda.time.base.BasePeriod)v5).setFieldInto(((int[])v6),((org.joda.time.DurationFieldType)v7),(((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toMutablePeriod();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v6).hashCode();
    Object v8 = ((org.joda.time.base.AbstractPeriod)v6).getValues();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toMutablePeriod();
    Object v7 = new int[]{39,16};
    Object v8 = org.joda.time.DurationFieldType.eras();
    Object v9 = 37;
    ((org.joda.time.base.BasePeriod)v6).addFieldInto(((int[])v7),((org.joda.time.DurationFieldType)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toMutablePeriod();
    Object v7 = null;
    Object v8 = new org.joda.time.MutableDateTime(((java.lang.Object)v7));
    Object v9 = ((org.joda.time.base.BasePeriod)v6).toDurationFrom(((org.joda.time.ReadableInstant)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).get(((org.joda.time.DurationFieldType)v6));
    Object v8 = ((org.joda.time.base.AbstractPeriod)v5).toPeriod();
    Object v9 = new int[]{1,1,0};
    Object v10 = org.joda.time.DurationFieldType.eras();
    Object v11 = -25;
    ((org.joda.time.base.BasePeriod)v8).addFieldInto(((int[])v9),((org.joda.time.DurationFieldType)v10),(((java.lang.Integer)v11).intValue()));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toMutablePeriod();
    Object v7 = new int[]{0,0,0};
    Object v8 = 3L;
    Object v9 = 1L;
    Object v10 = new org.joda.time.Duration((((java.lang.Long)v8).longValue()),(((java.lang.Long)v9).longValue()));
    Object v11 = null;
    Object v12 = new org.joda.time.MutableDateTime(((java.lang.Object)v11));
    Object v13 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v10),((org.joda.time.ReadableInstant)v12));
    Object v14 = org.joda.time.DurationFieldType.eras();
    Object v15 = ((org.joda.time.base.AbstractPeriod)v13).get(((org.joda.time.DurationFieldType)v14));
    Object v16 = ((org.joda.time.base.AbstractPeriod)v13).toPeriod();
    Object v17 = ((org.joda.time.base.BasePeriod)v6).mergePeriodInto(((int[])v7),((org.joda.time.ReadablePeriod)v16));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).get(((org.joda.time.DurationFieldType)v6));
    Object v8 = ((org.joda.time.base.AbstractPeriod)v5).toPeriod();
    Object v9 = 3L;
    Object v10 = 1L;
    Object v11 = new org.joda.time.Duration((((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
    Object v12 = null;
    Object v13 = new org.joda.time.MutableDateTime(((java.lang.Object)v12));
    Object v14 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v11),((org.joda.time.ReadableInstant)v13));
    Object v15 = org.joda.time.DurationFieldType.eras();
    Object v16 = ((org.joda.time.base.AbstractPeriod)v14).indexOf(((org.joda.time.DurationFieldType)v15));
    Object v17 = ((org.joda.time.base.AbstractPeriod)v8).equals(((java.lang.Object)v16));
    Object v18 = new int[]{0,0,0};
    Object v19 = 3L;
    Object v20 = 1L;
    Object v21 = new org.joda.time.Duration((((java.lang.Long)v19).longValue()),(((java.lang.Long)v20).longValue()));
    Object v22 = null;
    Object v23 = new org.joda.time.MutableDateTime(((java.lang.Object)v22));
    Object v24 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v21),((org.joda.time.ReadableInstant)v23));
    Object v25 = ((org.joda.time.base.BasePeriod)v8).mergePeriodInto(((int[])v18),((org.joda.time.ReadablePeriod)v24));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).get(((org.joda.time.DurationFieldType)v6));
    Object v8 = ((org.joda.time.base.AbstractPeriod)v5).toPeriod();
    Object v9 = new int[]{0};
    Object v10 = 3L;
    Object v11 = 1L;
    Object v12 = new org.joda.time.Duration((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()));
    Object v13 = null;
    Object v14 = new org.joda.time.MutableDateTime(((java.lang.Object)v13));
    Object v15 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v12),((org.joda.time.ReadableInstant)v14));
    Object v16 = ((org.joda.time.ReadablePeriod)v15).toPeriod();
    Object v17 = ((org.joda.time.base.BasePeriod)v8).addPeriodInto(((int[])v9),((org.joda.time.ReadablePeriod)v15));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).get(((org.joda.time.DurationFieldType)v6));
    Object v8 = ((org.joda.time.base.AbstractPeriod)v5).toPeriod();
    Object v9 = org.joda.time.DateTimeZone.getDefault();
    Object v10 = ((org.joda.time.base.AbstractPeriod)v8).equals(((java.lang.Object)v9));
    Object v11 = org.joda.time.format.PeriodFormat.getDefault();
    Object v12 = "\" from remaining set: ";
    Object v13 = new java.util.Locale(((java.lang.String)v12));
    Object v14 = ((org.joda.time.format.PeriodFormatter)v11).withLocale(((java.util.Locale)v13));
    Object v15 = ((org.joda.time.base.AbstractPeriod)v8).toString(((org.joda.time.format.PeriodFormatter)v11));
    org.junit.Assert.assertEquals((Object)("-2 milliseconds"), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).get(((org.joda.time.DurationFieldType)v6));
    Object v8 = ((org.joda.time.base.AbstractPeriod)v5).toPeriod();
    Object v9 = ((org.joda.time.base.AbstractPeriod)v8).getValues();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = new int[]{};
    Object v7 = org.joda.time.DurationFieldType.eras();
    Object v8 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
    Object v9 = ((org.joda.time.DurationFieldType)v7).getField(((org.joda.time.Chronology)v8));
    Object v10 = -17;
    ((org.joda.time.base.BasePeriod)v5).addFieldInto(((int[])v6),((org.joda.time.DurationFieldType)v7),(((java.lang.Integer)v10).intValue()));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = new int[]{1,2,0};
    Object v7 = 3L;
    Object v8 = 1L;
    Object v9 = new org.joda.time.Duration((((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
    Object v10 = null;
    Object v11 = new org.joda.time.MutableDateTime(((java.lang.Object)v10));
    Object v12 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v9),((org.joda.time.ReadableInstant)v11));
    Object v13 = ((org.joda.time.base.AbstractPeriod)v12).toMutablePeriod();
    Object v14 = ((org.joda.time.ReadablePeriod)v13).size();
    Object v15 = ((org.joda.time.base.BasePeriod)v5).addPeriodInto(((int[])v6),((org.joda.time.ReadablePeriod)v13));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toMutablePeriod();
    Object v7 = new int[]{};
    Object v8 = org.joda.time.DurationFieldType.eras();
    Object v9 = 1;
    ((org.joda.time.base.BasePeriod)v6).setFieldInto(((int[])v7),((org.joda.time.DurationFieldType)v8),(((java.lang.Integer)v9).intValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).get(((org.joda.time.DurationFieldType)v6));
    Object v8 = ((org.joda.time.base.AbstractPeriod)v5).toPeriod();
    Object v9 = ((org.joda.time.base.AbstractPeriod)v8).getFieldTypes();
    Object v10 = org.joda.time.DateTimeZone.getDefault();
    Object v11 = ((org.joda.time.base.AbstractPeriod)v8).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = ((org.joda.time.base.AbstractPeriod)v5).toMutablePeriod();
    Object v7 = 3L;
    Object v8 = 1L;
    Object v9 = new org.joda.time.Duration((((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
    Object v10 = null;
    Object v11 = new org.joda.time.MutableDateTime(((java.lang.Object)v10));
    Object v12 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v9),((org.joda.time.ReadableInstant)v11));
    Object v13 = ((org.joda.time.base.AbstractPeriod)v12).toMutablePeriod();
    ((org.joda.time.base.BasePeriod)v6).addPeriod(((org.joda.time.ReadablePeriod)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).get(((org.joda.time.DurationFieldType)v6));
    Object v8 = ((org.joda.time.base.AbstractPeriod)v5).toPeriod();
    Object v9 = org.joda.time.DurationFieldType.eras();
    Object v10 = ((org.joda.time.base.AbstractPeriod)v8).get(((org.joda.time.DurationFieldType)v9));
    Object v11 = 3L;
    Object v12 = 1L;
    Object v13 = new org.joda.time.Duration((((java.lang.Long)v11).longValue()),(((java.lang.Long)v12).longValue()));
    Object v14 = null;
    Object v15 = new org.joda.time.MutableDateTime(((java.lang.Object)v14));
    Object v16 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v13),((org.joda.time.ReadableInstant)v15));
    Object v17 = ((org.joda.time.base.AbstractPeriod)v16).toMutablePeriod();
    ((org.joda.time.base.BasePeriod)v8).mergePeriod(((org.joda.time.ReadablePeriod)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 3L;
    Object v1 = 1L;
    Object v2 = new org.joda.time.Duration((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = null;
    Object v4 = new org.joda.time.MutableDateTime(((java.lang.Object)v3));
    Object v5 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v2),((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DurationFieldType.eras();
    Object v7 = ((org.joda.time.base.AbstractPeriod)v5).get(((org.joda.time.DurationFieldType)v6));
    Object v8 = ((org.joda.time.base.AbstractPeriod)v5).toPeriod();
    Object v9 = org.joda.time.DurationFieldType.eras();
    Object v10 = ((org.joda.time.base.AbstractPeriod)v8).indexOf(((org.joda.time.DurationFieldType)v9));
    Object v11 = org.joda.time.format.PeriodFormat.getDefault();
    Object v12 = java.io.Writer.nullWriter();
    Object v13 = 3L;
    Object v14 = 1L;
    Object v15 = new org.joda.time.Duration((((java.lang.Long)v13).longValue()),(((java.lang.Long)v14).longValue()));
    Object v16 = null;
    Object v17 = new org.joda.time.MutableDateTime(((java.lang.Object)v16));
    Object v18 = new org.joda.time.MutablePeriod(((org.joda.time.ReadableDuration)v15),((org.joda.time.ReadableInstant)v17));
    Object v19 = ((org.joda.time.base.AbstractPeriod)v18).toMutablePeriod();
    ((org.joda.time.format.PeriodFormatter)v11).printTo(((java.io.Writer)v12),((org.joda.time.ReadablePeriod)v19));
    Object v20 = null;
    Object v21 = ((org.joda.time.base.AbstractPeriod)v8).toString(((org.joda.time.format.PeriodFormatter)v11));
    org.junit.Assert.assertEquals((Object)("-2 milliseconds"), v21);
  }
}
