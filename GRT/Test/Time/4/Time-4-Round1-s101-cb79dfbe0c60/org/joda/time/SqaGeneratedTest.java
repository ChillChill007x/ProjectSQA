package org.joda.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 0L;
    Object v1 = new org.joda.time.LocalDateTime((((java.lang.Long)v0).longValue()));
    Object v2 = ((org.joda.time.base.AbstractPartial)v1).getValues();
    Object v3 = ((org.joda.time.base.AbstractPartial)v1).getFields();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    Object v4 = ((org.joda.time.Partial)v2).withChronologyRetainFields(((org.joda.time.Chronology)v3));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.base.AbstractPartial)v2).getFieldTypes();
    Object v4 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v5 = 0;
    Object v6 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.joda.time.base.AbstractPartial)v2).isBefore(((org.joda.time.ReadablePartial)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 0;
    Object v5 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.base.AbstractPartial)v2).compareTo(((org.joda.time.ReadablePartial)v5));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTime.now();
    Object v4 = ((org.joda.time.Partial)v2).isMatch(((org.joda.time.ReadableInstant)v3));
    Object v5 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.Partial)v2).withChronologyRetainFields(((org.joda.time.Chronology)v5));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = ((org.joda.time.DateTimeFieldType)v3).getRangeDurationType();
    Object v5 = 8;
    Object v6 = ((org.joda.time.Partial)v2).withField(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DurationFieldType.weekyears();
    Object v4 = -23;
    Object v5 = ((org.joda.time.Partial)v2).withFieldAdded(((org.joda.time.DurationFieldType)v3),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "UTC";
    Object v4 = ((org.joda.time.Partial)v2).toString(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 0;
    Object v5 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.base.AbstractPartial)v2).isEqual(((org.joda.time.ReadablePartial)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 0;
    Object v5 = ((org.joda.time.Partial)v2).withField(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v7 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.DateTimeFieldType)v6).isSupported(((org.joda.time.Chronology)v7));
    Object v9 = 0;
    Object v10 = ((org.joda.time.Partial)v2).withField(((org.joda.time.DateTimeFieldType)v6),(((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = ((org.joda.time.DateTimeFieldType)v3).getRangeDurationType();
    Object v5 = 1;
    Object v6 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = "Gield '";
    Object v2 = java.util.Locale.getDefault();
    Object v3 = ((org.joda.time.Partial)v0).toString(((java.lang.String)v1),((java.util.Locale)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = ((org.joda.time.DateTimeFieldType)v3).getRangeDurationType();
    Object v5 = 39;
    Object v6 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v2 = 0;
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v5 = ((org.joda.time.DateTimeFieldType)v4).getRangeDurationType();
    Object v6 = 8;
    Object v7 = ((org.joda.time.Partial)v3).withField(((org.joda.time.DateTimeFieldType)v4),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.ReadablePartial)v7).getChronology();
    Object v9 = ((org.joda.time.Partial)v0).isMatch(((org.joda.time.ReadablePartial)v7));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTime.now();
    Object v2 = ((org.joda.time.base.AbstractPartial)v0).toDateTime(((org.joda.time.ReadableInstant)v1));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 50;
    Object v5 = ((org.joda.time.Partial)v0).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.Partial();
    Object v4 = ((org.joda.time.base.AbstractPartial)v2).compareTo(((org.joda.time.ReadablePartial)v3));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v2 = 0;
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.joda.time.base.AbstractPartial)v0).isAfter(((org.joda.time.ReadablePartial)v3));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.joda.time.DateTimeFieldType[]{null,null};
    Object v1 = new int[]{40};
    Object v2 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType[])v0),((int[])v1),((org.joda.time.Chronology)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.util.Locale.getDefault();
    Object v4 = ((org.joda.time.base.AbstractPartial)v2).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = ((org.joda.time.DateTimeFieldType)v3).getRangeDurationType();
    Object v5 = 39;
    Object v6 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v8 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    Object v9 = ((org.joda.time.DateTimeFieldType)v7).getField(((org.joda.time.Chronology)v8));
    Object v10 = ((org.joda.time.Partial)v6).without(((org.joda.time.DateTimeFieldType)v7));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = ((org.joda.time.DateTimeFieldType)v3).getRangeDurationType();
    Object v5 = 1;
    Object v6 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.joda.time.base.AbstractPartial)v6).getFields();
    Object v8 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v9 = ((org.joda.time.base.AbstractPartial)v6).get(((org.joda.time.DateTimeFieldType)v8));
    org.junit.Assert.assertEquals((Object)(1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 0;
    Object v5 = ((org.joda.time.Partial)v2).withField(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v7 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.DateTimeFieldType)v6).isSupported(((org.joda.time.Chronology)v7));
    Object v9 = 0;
    Object v10 = ((org.joda.time.Partial)v2).withField(((org.joda.time.DateTimeFieldType)v6),(((java.lang.Integer)v9).intValue()));
    Object v11 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v12 = 0;
    Object v13 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.base.AbstractPartial)v10).isAfter(((org.joda.time.ReadablePartial)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v2 = 0;
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v5 = 0;
    Object v6 = ((org.joda.time.Partial)v3).withField(((org.joda.time.DateTimeFieldType)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v8 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    Object v9 = ((org.joda.time.DateTimeFieldType)v7).isSupported(((org.joda.time.Chronology)v8));
    Object v10 = 0;
    Object v11 = ((org.joda.time.Partial)v3).withField(((org.joda.time.DateTimeFieldType)v7),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.joda.time.base.AbstractPartial)v0).compareTo(((org.joda.time.ReadablePartial)v11));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.Partial)v2).getFormatter();
    Object v4 = ((org.joda.time.Partial)v2).toStringList();
    org.junit.Assert.assertEquals((Object)("[weekyearOfCentury=0]"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.Partial)v2).toStringList();
    org.junit.Assert.assertEquals((Object)("[weekyearOfCentury=0]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 0;
    Object v5 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.Partial();
    Object v7 = org.joda.time.DateTime.now();
    Object v8 = ((org.joda.time.base.AbstractPartial)v6).toDateTime(((org.joda.time.ReadableInstant)v7));
    Object v9 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v10 = 50;
    Object v11 = ((org.joda.time.Partial)v6).with(((org.joda.time.DateTimeFieldType)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.joda.time.PeriodType.seconds();
    Object v13 = new org.joda.time.Period(((org.joda.time.ReadablePartial)v5),((org.joda.time.ReadablePartial)v11),((org.joda.time.PeriodType)v12));
    Object v14 = ((org.joda.time.ReadablePeriod)v13).toMutablePeriod();
    Object v15 = ((org.joda.time.Partial)v2).minus(((org.joda.time.ReadablePeriod)v13));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = ((org.joda.time.Partial)v0).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.base.AbstractPartial)v2).getFields();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 53;
    Object v4 = new java.util.HashSet((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.joda.time.base.AbstractPartial)v2).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = new org.joda.time.Partial();
    Object v2 = ((org.joda.time.base.AbstractPartial)v0).equals(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = ((org.joda.time.DateTimeFieldType)v3).getRangeDurationType();
    Object v5 = 39;
    Object v6 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.Partial)v6).withChronologyRetainFields(((org.joda.time.Chronology)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.Partial();
    Object v4 = org.joda.time.DateTime.now();
    Object v5 = ((org.joda.time.base.AbstractPartial)v3).toDateTime(((org.joda.time.ReadableInstant)v4));
    Object v6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v7 = 50;
    Object v8 = ((org.joda.time.Partial)v3).with(((org.joda.time.DateTimeFieldType)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.base.AbstractPartial)v2).isBefore(((org.joda.time.ReadablePartial)v8));
    Object v10 = ((org.joda.time.Partial)v2).getChronology();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = ((org.joda.time.DateTimeFieldType)v3).getRangeDurationType();
    Object v5 = 8;
    Object v6 = ((org.joda.time.Partial)v2).withField(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v8 = ((org.joda.time.Partial)v6).without(((org.joda.time.DateTimeFieldType)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTime.now();
    Object v2 = ((org.joda.time.base.AbstractPartial)v0).toDateTime(((org.joda.time.ReadableInstant)v1));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 50;
    Object v5 = ((org.joda.time.Partial)v0).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.ReadablePartial)v5).size();
    Object v7 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v2 = ((org.joda.time.Partial)v0).without(((org.joda.time.DateTimeFieldType)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = ((org.joda.time.Partial)v0).getFormatter();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 0;
    Object v5 = ((org.joda.time.Partial)v2).withField(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v7 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.DateTimeFieldType)v6).isSupported(((org.joda.time.Chronology)v7));
    Object v9 = 0;
    Object v10 = ((org.joda.time.Partial)v2).withField(((org.joda.time.DateTimeFieldType)v6),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.joda.time.base.AbstractPartial)v10).hashCode();
    org.junit.Assert.assertEquals((Object)(968776), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = ((org.joda.time.DateTimeFieldType)v3).getRangeDurationType();
    Object v5 = 8;
    Object v6 = ((org.joda.time.Partial)v2).withField(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.Partial();
    Object v8 = org.joda.time.DateTime.now();
    Object v9 = ((org.joda.time.base.AbstractPartial)v7).toDateTime(((org.joda.time.ReadableInstant)v8));
    Object v10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v11 = 50;
    Object v12 = ((org.joda.time.Partial)v7).with(((org.joda.time.DateTimeFieldType)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.joda.time.ReadablePartial)v12).size();
    Object v14 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v12));
    Object v15 = ((org.joda.time.base.AbstractPartial)v6).isAfter(((org.joda.time.ReadablePartial)v14));
    Object v16 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v17 = ((org.joda.time.base.AbstractPartial)v6).isSupported(((org.joda.time.DateTimeFieldType)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 0;
    Object v5 = ((org.joda.time.Partial)v2).withField(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v7 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.DateTimeFieldType)v6).isSupported(((org.joda.time.Chronology)v7));
    Object v9 = 0;
    Object v10 = ((org.joda.time.Partial)v2).withField(((org.joda.time.DateTimeFieldType)v6),(((java.lang.Integer)v9).intValue()));
    Object v11 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v12 = ((org.joda.time.base.AbstractPartial)v10).indexOf(((org.joda.time.DateTimeFieldType)v11));
    Object v13 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v14 = 0;
    Object v15 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = 0;
    Object v17 = ((org.joda.time.ReadablePartial)v15).getFieldType((((java.lang.Integer)v16).intValue()));
    Object v18 = ((org.joda.time.base.AbstractPartial)v10).isEqual(((org.joda.time.ReadablePartial)v15));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = ((org.joda.time.DateTimeFieldType)v3).getRangeDurationType();
    Object v5 = 1;
    Object v6 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.DurationFieldType.weekyears();
    Object v8 = -29;
    Object v9 = ((org.joda.time.Partial)v6).withFieldAdded(((org.joda.time.DurationFieldType)v7),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = ((org.joda.time.DateTimeFieldType)v3).getRangeDurationType();
    Object v5 = 39;
    Object v6 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v8 = 0;
    Object v9 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v11 = ((org.joda.time.DateTimeFieldType)v10).getRangeDurationType();
    Object v12 = 39;
    Object v13 = ((org.joda.time.Partial)v9).with(((org.joda.time.DateTimeFieldType)v10),(((java.lang.Integer)v12).intValue()));
    Object v14 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    Object v15 = ((org.joda.time.Partial)v13).withChronologyRetainFields(((org.joda.time.Chronology)v14));
    Object v16 = ((org.joda.time.base.AbstractPartial)v6).compareTo(((org.joda.time.ReadablePartial)v15));
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 0;
    Object v5 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.joda.time.Partial();
    Object v7 = org.joda.time.DateTime.now();
    Object v8 = ((org.joda.time.base.AbstractPartial)v6).toDateTime(((org.joda.time.ReadableInstant)v7));
    Object v9 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v10 = 50;
    Object v11 = ((org.joda.time.Partial)v6).with(((org.joda.time.DateTimeFieldType)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.joda.time.PeriodType.seconds();
    Object v13 = new org.joda.time.Period(((org.joda.time.ReadablePartial)v5),((org.joda.time.ReadablePartial)v11),((org.joda.time.PeriodType)v12));
    Object v14 = 0;
    Object v15 = ((org.joda.time.Partial)v2).withPeriodAdded(((org.joda.time.ReadablePeriod)v13),(((java.lang.Integer)v14).intValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = ((org.joda.time.DateTimeFieldType)v3).getRangeDurationType();
    Object v5 = 1;
    Object v6 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v8 = ((org.joda.time.base.AbstractPartial)v6).isSupported(((org.joda.time.DateTimeFieldType)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 0;
    Object v5 = ((org.joda.time.Partial)v2).withField(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v7 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.DateTimeFieldType)v6).isSupported(((org.joda.time.Chronology)v7));
    Object v9 = 0;
    Object v10 = ((org.joda.time.Partial)v2).withField(((org.joda.time.DateTimeFieldType)v6),(((java.lang.Integer)v9).intValue()));
    Object v11 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v12 = 0;
    Object v13 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.base.AbstractPartial)v10).compareTo(((org.joda.time.ReadablePartial)v13));
    Object v15 = 53;
    Object v16 = ((org.joda.time.Partial)v10).getValue((((java.lang.Integer)v15).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v2 = ((org.joda.time.Partial)v0).without(((org.joda.time.DateTimeFieldType)v1));
    Object v3 = org.joda.time.DateTime.now();
    Object v4 = ((org.joda.time.Partial)v2).isMatch(((org.joda.time.ReadableInstant)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v2 = ((org.joda.time.Partial)v0).without(((org.joda.time.DateTimeFieldType)v1));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 0;
    Object v5 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v7 = ((org.joda.time.DateTimeFieldType)v6).getRangeDurationType();
    Object v8 = 1;
    Object v9 = ((org.joda.time.Partial)v5).with(((org.joda.time.DateTimeFieldType)v6),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.base.AbstractPartial)v2).compareTo(((org.joda.time.ReadablePartial)v9));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = -8;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.format.DateTimeFormat.longDate();
    Object v2 = ((org.joda.time.base.AbstractPartial)v0).toString(((org.joda.time.format.DateTimeFormatter)v1));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = ((org.joda.time.base.AbstractPartial)v0).indexOf(((org.joda.time.DateTimeFieldType)v3));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v2 = ((org.joda.time.Partial)v0).without(((org.joda.time.DateTimeFieldType)v1));
    Object v3 = ((org.joda.time.Partial)v2).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v2 = ((org.joda.time.Partial)v0).without(((org.joda.time.DateTimeFieldType)v1));
    Object v3 = new org.joda.time.Partial();
    Object v4 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v5 = ((org.joda.time.Partial)v3).without(((org.joda.time.DateTimeFieldType)v4));
    Object v6 = ((org.joda.time.base.AbstractPartial)v2).isEqual(((org.joda.time.ReadablePartial)v5));
    Object v7 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v8 = -14;
    Object v9 = ((org.joda.time.Partial)v2).withField(((org.joda.time.DateTimeFieldType)v7),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.joda.time.DateTimeFieldType[]{};
    Object v1 = new int[]{-33};
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType[])v0),((int[])v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DurationFieldType.weekyears();
    Object v2 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v3 = 0;
    Object v4 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.joda.time.Partial();
    Object v6 = org.joda.time.DateTime.now();
    Object v7 = ((org.joda.time.base.AbstractPartial)v5).toDateTime(((org.joda.time.ReadableInstant)v6));
    Object v8 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v9 = 50;
    Object v10 = ((org.joda.time.Partial)v5).with(((org.joda.time.DateTimeFieldType)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.joda.time.base.AbstractPartial)v4).isBefore(((org.joda.time.ReadablePartial)v10));
    Object v12 = ((org.joda.time.Partial)v4).getChronology();
    Object v13 = ((org.joda.time.DurationFieldType)v1).isSupported(((org.joda.time.Chronology)v12));
    Object v14 = 1;
    Object v15 = ((org.joda.time.Partial)v0).withFieldAddWrapped(((org.joda.time.DurationFieldType)v1),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 4;
    Object v5 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTime.now();
    Object v4 = ((org.joda.time.base.AbstractPartial)v2).toDateTime(((org.joda.time.ReadableInstant)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = ((org.joda.time.DateTimeFieldType)v3).getRangeDurationType();
    Object v5 = 1;
    Object v6 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.joda.time.Partial)v6).getFormatter();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = "";
    Object v2 = java.util.Locale.getDefault();
    Object v3 = java.util.Locale.getDefault();
    Object v4 = ((java.util.Locale)v2).getDisplayCountry(((java.util.Locale)v3));
    Object v5 = ((org.joda.time.Partial)v0).toString(((java.lang.String)v1),((java.util.Locale)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v2 = ((org.joda.time.Partial)v0).without(((org.joda.time.DateTimeFieldType)v1));
    Object v3 = org.joda.time.format.DateTimeFormat.longDate();
    Object v4 = ((org.joda.time.base.AbstractPartial)v2).toString(((org.joda.time.format.DateTimeFormatter)v3));
    org.junit.Assert.assertEquals((Object)("\ufffd \ufffd, \ufffd"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v2 = 0;
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.joda.time.Partial)v0).isMatch(((org.joda.time.ReadablePartial)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTime.now();
    Object v2 = ((org.joda.time.base.AbstractPartial)v0).toDateTime(((org.joda.time.ReadableInstant)v1));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 50;
    Object v5 = ((org.joda.time.Partial)v0).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.base.AbstractPartial)v5).hashCode();
    Object v7 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v8 = 0;
    Object v9 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v11 = ((org.joda.time.DateTimeFieldType)v10).getRangeDurationType();
    Object v12 = 1;
    Object v13 = ((org.joda.time.Partial)v9).with(((org.joda.time.DateTimeFieldType)v10),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.base.AbstractPartial)v5).isBefore(((org.joda.time.ReadablePartial)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v2 = ((org.joda.time.base.AbstractPartial)v0).indexOf(((org.joda.time.DateTimeFieldType)v1));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v3 = 0;
    Object v4 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.joda.time.Partial();
    Object v6 = org.joda.time.DateTime.now();
    Object v7 = ((org.joda.time.base.AbstractPartial)v5).toDateTime(((org.joda.time.ReadableInstant)v6));
    Object v8 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v9 = 50;
    Object v10 = ((org.joda.time.Partial)v5).with(((org.joda.time.DateTimeFieldType)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.joda.time.base.AbstractPartial)v4).isBefore(((org.joda.time.ReadablePartial)v10));
    Object v12 = ((org.joda.time.Partial)v4).getChronology();
    Object v13 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v2 = ((org.joda.time.Partial)v0).property(((org.joda.time.DateTimeFieldType)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = ((org.joda.time.DateTimeFieldType)v3).getRangeDurationType();
    Object v5 = 1;
    Object v6 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.joda.time.Partial)v6).toStringList();
    org.junit.Assert.assertEquals((Object)("[weekyearOfCentury=1]"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = ((org.joda.time.DateTimeFieldType)v3).getRangeDurationType();
    Object v5 = 39;
    Object v6 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v8 = 0;
    Object v9 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = new org.joda.time.Partial();
    Object v11 = org.joda.time.DateTime.now();
    Object v12 = ((org.joda.time.base.AbstractPartial)v10).toDateTime(((org.joda.time.ReadableInstant)v11));
    Object v13 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v14 = 50;
    Object v15 = ((org.joda.time.Partial)v10).with(((org.joda.time.DateTimeFieldType)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = org.joda.time.PeriodType.seconds();
    Object v17 = new org.joda.time.Period(((org.joda.time.ReadablePartial)v9),((org.joda.time.ReadablePartial)v15),((org.joda.time.PeriodType)v16));
    Object v18 = 2;
    Object v19 = ((org.joda.time.Partial)v6).withPeriodAdded(((org.joda.time.ReadablePeriod)v17),(((java.lang.Integer)v18).intValue()));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = "%s ";
    Object v2 = java.util.Locale.getDefault();
    Object v3 = ((org.joda.time.Partial)v0).toString(((java.lang.String)v1),((java.util.Locale)v2));
    org.junit.Assert.assertEquals((Object)("%\ufffd "), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 0;
    Object v5 = ((org.joda.time.Partial)v2).withField(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v7 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.DateTimeFieldType)v6).isSupported(((org.joda.time.Chronology)v7));
    Object v9 = 0;
    Object v10 = ((org.joda.time.Partial)v2).withField(((org.joda.time.DateTimeFieldType)v6),(((java.lang.Integer)v9).intValue()));
    Object v11 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v12 = 0;
    Object v13 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = new org.joda.time.Partial();
    Object v15 = org.joda.time.DateTime.now();
    Object v16 = ((org.joda.time.base.AbstractPartial)v14).toDateTime(((org.joda.time.ReadableInstant)v15));
    Object v17 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v18 = 50;
    Object v19 = ((org.joda.time.Partial)v14).with(((org.joda.time.DateTimeFieldType)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((org.joda.time.base.AbstractPartial)v13).isBefore(((org.joda.time.ReadablePartial)v19));
    Object v21 = ((org.joda.time.Partial)v13).getChronology();
    Object v22 = ((org.joda.time.Chronology)v21).minutes();
    Object v23 = ((org.joda.time.Partial)v10).withChronologyRetainFields(((org.joda.time.Chronology)v21));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTime.now();
    Object v2 = ((org.joda.time.Partial)v0).isMatch(((org.joda.time.ReadableInstant)v1));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = ((org.joda.time.DateTimeFieldType)v3).getDurationType();
    Object v5 = 0;
    Object v6 = ((org.joda.time.Partial)v0).withField(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 4;
    Object v5 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTime.now();
    Object v7 = ((org.joda.time.Partial)v5).isMatch(((org.joda.time.ReadableInstant)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = ((org.joda.time.DateTimeFieldType)v3).getRangeDurationType();
    Object v5 = 1;
    Object v6 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = "Field must not be null";
    Object v8 = ((org.joda.time.Partial)v6).toString(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.Partial)v2).toString();
    org.junit.Assert.assertEquals((Object)("[weekyearOfCentury=0]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = ((org.joda.time.DateTimeFieldType)v3).getRangeDurationType();
    Object v5 = 39;
    Object v6 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.Partial)v6).withChronologyRetainFields(((org.joda.time.Chronology)v7));
    Object v9 = org.joda.time.DurationFieldType.weekyears();
    Object v10 = -1100888465;
    Object v11 = ((org.joda.time.Partial)v8).withFieldAddWrapped(((org.joda.time.DurationFieldType)v9),(((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.Partial)v2).toString();
    Object v4 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v5 = 0;
    Object v6 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v8 = 4;
    Object v9 = ((org.joda.time.Partial)v6).with(((org.joda.time.DateTimeFieldType)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.Partial)v2).isMatch(((org.joda.time.ReadablePartial)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = ((org.joda.time.Partial)v0).toStringList();
    Object v2 = org.joda.time.DurationFieldType.weekyears();
    Object v3 = 0;
    Object v4 = ((org.joda.time.Partial)v0).withFieldAddWrapped(((org.joda.time.DurationFieldType)v2),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v2 = ((org.joda.time.DateTimeFieldType)v1).getRangeDurationType();
    Object v3 = ((org.joda.time.base.AbstractPartial)v0).isSupported(((org.joda.time.DateTimeFieldType)v1));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.Partial)v2).getValues();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = ((org.joda.time.DateTimeFieldType)v3).getRangeDurationType();
    Object v5 = 39;
    Object v6 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v8 = 0;
    Object v9 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v11 = ((org.joda.time.DateTimeFieldType)v10).getRangeDurationType();
    Object v12 = 39;
    Object v13 = ((org.joda.time.Partial)v9).with(((org.joda.time.DateTimeFieldType)v10),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.joda.time.base.AbstractPartial)v6).isBefore(((org.joda.time.ReadablePartial)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 0;
    Object v5 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v7 = 4;
    Object v8 = ((org.joda.time.Partial)v5).with(((org.joda.time.DateTimeFieldType)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v10 = ((org.joda.time.ReadablePartial)v8).get(((org.joda.time.DateTimeFieldType)v9));
    Object v11 = ((org.joda.time.base.AbstractPartial)v2).isEqual(((org.joda.time.ReadablePartial)v8));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.format.DateTimeFormat.longDate();
    Object v2 = ((org.joda.time.base.AbstractPartial)v0).toString(((org.joda.time.format.DateTimeFormatter)v1));
    org.junit.Assert.assertEquals((Object)("\ufffd \ufffd, \ufffd"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 8;
    Object v5 = ((org.joda.time.Partial)v2).withField(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v7 = 0;
    Object v8 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new org.joda.time.Partial();
    Object v10 = org.joda.time.DateTime.now();
    Object v11 = ((org.joda.time.base.AbstractPartial)v9).toDateTime(((org.joda.time.ReadableInstant)v10));
    Object v12 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v13 = 50;
    Object v14 = ((org.joda.time.Partial)v9).with(((org.joda.time.DateTimeFieldType)v12),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.joda.time.base.AbstractPartial)v8).isBefore(((org.joda.time.ReadablePartial)v14));
    Object v16 = ((org.joda.time.Partial)v8).getChronology();
    Object v17 = ((org.joda.time.Partial)v2).withChronologyRetainFields(((org.joda.time.Chronology)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTime.now();
    Object v2 = ((org.joda.time.base.AbstractPartial)v0).toDateTime(((org.joda.time.ReadableInstant)v1));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 50;
    Object v5 = ((org.joda.time.Partial)v0).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.joda.time.ReadablePartial)v5).size();
    Object v7 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v5));
    Object v8 = org.joda.time.format.DateTimeFormat.longDate();
    Object v9 = ((org.joda.time.base.AbstractPartial)v7).toString(((org.joda.time.format.DateTimeFormatter)v8));
    org.junit.Assert.assertEquals((Object)("\ufffd \ufffd, \ufffd"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 8;
    Object v5 = ((org.joda.time.Partial)v2).withField(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v7 = 0;
    Object v8 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new org.joda.time.Partial();
    Object v10 = org.joda.time.DateTime.now();
    Object v11 = ((org.joda.time.base.AbstractPartial)v9).toDateTime(((org.joda.time.ReadableInstant)v10));
    Object v12 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v13 = 50;
    Object v14 = ((org.joda.time.Partial)v9).with(((org.joda.time.DateTimeFieldType)v12),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.joda.time.base.AbstractPartial)v8).isBefore(((org.joda.time.ReadablePartial)v14));
    Object v16 = ((org.joda.time.Partial)v8).getChronology();
    Object v17 = ((org.joda.time.Partial)v2).withChronologyRetainFields(((org.joda.time.Chronology)v16));
    Object v18 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v19 = 0;
    Object v20 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.joda.time.base.AbstractPartial)v17).compareTo(((org.joda.time.ReadablePartial)v20));
    Object v22 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v23 = 0;
    Object v24 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = new org.joda.time.Partial();
    Object v26 = org.joda.time.DateTime.now();
    Object v27 = ((org.joda.time.base.AbstractPartial)v25).toDateTime(((org.joda.time.ReadableInstant)v26));
    Object v28 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v29 = 50;
    Object v30 = ((org.joda.time.Partial)v25).with(((org.joda.time.DateTimeFieldType)v28),(((java.lang.Integer)v29).intValue()));
    Object v31 = org.joda.time.PeriodType.seconds();
    Object v32 = new org.joda.time.Period(((org.joda.time.ReadablePartial)v24),((org.joda.time.ReadablePartial)v30),((org.joda.time.PeriodType)v31));
    Object v33 = -22;
    Object v34 = ((org.joda.time.Partial)v17).withPeriodAdded(((org.joda.time.ReadablePeriod)v32),(((java.lang.Integer)v33).intValue()));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTime.now();
    Object v2 = ((org.joda.time.base.AbstractPartial)v0).toDateTime(((org.joda.time.ReadableInstant)v1));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 50;
    Object v5 = ((org.joda.time.Partial)v0).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v7 = ((org.joda.time.base.AbstractPartial)v5).indexOf(((org.joda.time.DateTimeFieldType)v6));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 1;
    Object v5 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v7 = -19;
    Object v8 = ((org.joda.time.Partial)v2).withField(((org.joda.time.DateTimeFieldType)v6),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.joda.time.base.AbstractPartial)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(968776), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = ((org.joda.time.DateTimeFieldType)v3).getRangeDurationType();
    Object v5 = 39;
    Object v6 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.joda.time.base.AbstractPartial)v6).getFields();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v2 = ((org.joda.time.Partial)v0).without(((org.joda.time.DateTimeFieldType)v1));
    Object v3 = "The DateTimeFieldType must not be null";
    Object v4 = java.util.Locale.getDefault();
    Object v5 = ((org.joda.time.Partial)v2).toString(((java.lang.String)v3),((java.util.Locale)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v2 = ((org.joda.time.DateTimeFieldType)v1).getRangeDurationType();
    Object v3 = 0;
    Object v4 = ((org.joda.time.Partial)v0).withField(((org.joda.time.DateTimeFieldType)v1),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v5 = 0;
    Object v6 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.Partial();
    Object v8 = org.joda.time.DateTime.now();
    Object v9 = ((org.joda.time.base.AbstractPartial)v7).toDateTime(((org.joda.time.ReadableInstant)v8));
    Object v10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v11 = 50;
    Object v12 = ((org.joda.time.Partial)v7).with(((org.joda.time.DateTimeFieldType)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.joda.time.base.AbstractPartial)v6).isBefore(((org.joda.time.ReadablePartial)v12));
    Object v14 = ((org.joda.time.Partial)v6).getChronology();
    Object v15 = ((org.joda.time.DateTimeFieldType)v3).isSupported(((org.joda.time.Chronology)v14));
    Object v16 = 3;
    Object v17 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v16).intValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 0;
    Object v5 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v7 = 4;
    Object v8 = ((org.joda.time.Partial)v5).with(((org.joda.time.DateTimeFieldType)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.joda.time.base.AbstractPartial)v2).isAfter(((org.joda.time.ReadablePartial)v8));
    Object v10 = "WET";
    Object v11 = ((org.joda.time.Partial)v2).toString(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.joda.time.Partial();
    Object v1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v2 = ((org.joda.time.base.AbstractPartial)v0).indexOf(((org.joda.time.DateTimeFieldType)v1));
    Object v3 = ((org.joda.time.Partial)v0).getFormatter();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.format.DateTimeFormat.longDate();
    Object v4 = ((org.joda.time.base.AbstractPartial)v2).toString(((org.joda.time.format.DateTimeFormatter)v3));
    Object v5 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v6 = 0;
    Object v7 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.joda.time.base.AbstractPartial)v2).isAfter(((org.joda.time.ReadablePartial)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.joda.time.DateTimeFieldType[]{};
    Object v1 = new int[]{21,0,1};
    Object v2 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v3 = 0;
    Object v4 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.joda.time.Partial();
    Object v6 = org.joda.time.DateTime.now();
    Object v7 = ((org.joda.time.base.AbstractPartial)v5).toDateTime(((org.joda.time.ReadableInstant)v6));
    Object v8 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v9 = 50;
    Object v10 = ((org.joda.time.Partial)v5).with(((org.joda.time.DateTimeFieldType)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.joda.time.base.AbstractPartial)v4).isBefore(((org.joda.time.ReadablePartial)v10));
    Object v12 = ((org.joda.time.Partial)v4).getChronology();
    Object v13 = new org.joda.time.Partial();
    Object v14 = 1L;
    Object v15 = ((org.joda.time.Chronology)v12).set(((org.joda.time.ReadablePartial)v13),(((java.lang.Long)v14).longValue()));
    Object v16 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType[])v0),((int[])v1),((org.joda.time.Chronology)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 0;
    Object v5 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v7 = ((org.joda.time.DateTimeFieldType)v6).getRangeDurationType();
    Object v8 = 8;
    Object v9 = ((org.joda.time.Partial)v5).withField(((org.joda.time.DateTimeFieldType)v6),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.joda.time.ReadablePartial)v9).hashCode();
    Object v11 = ((org.joda.time.base.AbstractPartial)v2).compareTo(((org.joda.time.ReadablePartial)v9));
    org.junit.Assert.assertEquals((Object)(-1), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.joda.time.Partial(((org.joda.time.ReadablePartial)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = ((org.joda.time.DateTimeFieldType)v3).getRangeDurationType();
    Object v5 = 8;
    Object v6 = ((org.joda.time.Partial)v2).withField(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.joda.time.Partial)v6).toStringList();
    org.junit.Assert.assertEquals((Object)("[weekyearOfCentury=8]"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v5 = 0;
    Object v6 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.Partial();
    Object v8 = org.joda.time.DateTime.now();
    Object v9 = ((org.joda.time.base.AbstractPartial)v7).toDateTime(((org.joda.time.ReadableInstant)v8));
    Object v10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v11 = 50;
    Object v12 = ((org.joda.time.Partial)v7).with(((org.joda.time.DateTimeFieldType)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.joda.time.base.AbstractPartial)v6).isBefore(((org.joda.time.ReadablePartial)v12));
    Object v14 = ((org.joda.time.Partial)v6).getChronology();
    Object v15 = ((org.joda.time.DateTimeFieldType)v3).isSupported(((org.joda.time.Chronology)v14));
    Object v16 = 3;
    Object v17 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v16).intValue()));
    Object v18 = org.joda.time.format.DateTimeFormat.longDate();
    Object v19 = ((org.joda.time.base.AbstractPartial)v17).toString(((org.joda.time.format.DateTimeFormatter)v18));
    org.junit.Assert.assertEquals((Object)("\ufffd \ufffd, \ufffd"), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = org.joda.time.chrono.JulianChronology.getInstanceUTC();
    Object v3 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),((org.joda.time.Chronology)v2));
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v5 = 0;
    Object v6 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.joda.time.Partial();
    Object v8 = org.joda.time.DateTime.now();
    Object v9 = ((org.joda.time.base.AbstractPartial)v7).toDateTime(((org.joda.time.ReadableInstant)v8));
    Object v10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v11 = 50;
    Object v12 = ((org.joda.time.Partial)v7).with(((org.joda.time.DateTimeFieldType)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.joda.time.base.AbstractPartial)v6).isBefore(((org.joda.time.ReadablePartial)v12));
    Object v14 = ((org.joda.time.Partial)v6).getChronology();
    Object v15 = ((org.joda.time.DateTimeFieldType)v3).isSupported(((org.joda.time.Chronology)v14));
    Object v16 = 3;
    Object v17 = ((org.joda.time.Partial)v2).with(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v16).intValue()));
    Object v18 = ((org.joda.time.Partial)v17).getFormatter();
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v1 = 0;
    Object v2 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v4 = 0;
    Object v5 = new org.joda.time.Partial(((org.joda.time.DateTimeFieldType)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v7 = ((org.joda.time.DateTimeFieldType)v6).getRangeDurationType();
    Object v8 = 39;
    Object v9 = ((org.joda.time.Partial)v5).with(((org.joda.time.DateTimeFieldType)v6),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
    Object v11 = ((org.joda.time.ReadablePartial)v9).isSupported(((org.joda.time.DateTimeFieldType)v10));
    Object v12 = ((org.joda.time.base.AbstractPartial)v2).compareTo(((org.joda.time.ReadablePartial)v9));
    org.junit.Assert.assertEquals((Object)(-1), v12);
  }
}
