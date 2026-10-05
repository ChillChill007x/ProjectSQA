package org.joda.time.field;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = -29L;
    Object v3 = 1;
    Object v4 = ((org.joda.time.DurationField)v1).subtract((((java.lang.Long)v2).longValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = org.joda.time.DurationFieldType.years();
    Object v3 = ((org.joda.time.field.UnsupportedDurationField)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = org.joda.time.DurationFieldType.years();
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v2));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v1).compareTo(((org.joda.time.DurationField)v3));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = 1L;
    Object v3 = -17;
    Object v4 = ((org.joda.time.DurationField)v1).subtract((((java.lang.Long)v2).longValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = 0L;
    Object v3 = 1L;
    Object v4 = ((org.joda.time.DurationField)v1).subtract((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = -1L;
    Object v3 = -11L;
    Object v4 = ((org.joda.time.DurationField)v1).subtract((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = ((org.joda.time.field.UnsupportedDurationField)v1).getName();
    org.junit.Assert.assertEquals((Object)("years"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = 44L;
    Object v3 = -36L;
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v1).add((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = -38L;
    Object v3 = ((org.joda.time.field.UnsupportedDurationField)v1).getValue((((java.lang.Long)v2).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = ((org.joda.time.field.UnsupportedDurationField)v1).isSupported();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = 22L;
    Object v3 = 0L;
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v1).getValueAsLong((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = -4;
    Object v3 = 0L;
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v1).getMillis((((java.lang.Integer)v2).intValue()),(((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = 21L;
    Object v3 = -17L;
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v1).getDifference((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = ((org.joda.time.field.UnsupportedDurationField)v1).hashCode();
    Object v3 = 42;
    Object v4 = 24L;
    Object v5 = ((org.joda.time.field.UnsupportedDurationField)v1).getMillis((((java.lang.Integer)v3).intValue()),(((java.lang.Long)v4).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = 11;
    Object v3 = ((org.joda.time.field.UnsupportedDurationField)v1).getMillis((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = ((org.joda.time.field.UnsupportedDurationField)v1).toString();
    org.junit.Assert.assertEquals((Object)("UnsupportedDurationField[years]"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = -19L;
    Object v3 = 1L;
    Object v4 = ((org.joda.time.DurationField)v1).subtract((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = org.joda.time.DurationFieldType.years();
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v2));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).toString();
    Object v5 = ((org.joda.time.field.UnsupportedDurationField)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = ((org.joda.time.field.UnsupportedDurationField)v1).getUnitMillis();
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v2 = ((org.joda.time.DurationField)v1).getName();
    Object v3 = 29L;
    Object v4 = 0L;
    Object v5 = ((org.joda.time.DurationField)v1).subtract((((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = org.joda.time.DurationFieldType.years();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.DurationFieldType)v4).getField(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v3).compareTo(((org.joda.time.DurationField)v7));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = 26L;
    Object v5 = 1;
    Object v6 = ((org.joda.time.DurationField)v3).subtract((((java.lang.Long)v4).longValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = -5L;
    Object v5 = ((org.joda.time.field.UnsupportedDurationField)v3).getMillis((((java.lang.Long)v4).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).isPrecise();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = -33L;
    Object v5 = ((org.joda.time.field.UnsupportedDurationField)v3).getMillis((((java.lang.Long)v4).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getType();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = org.joda.time.DurationFieldType.years();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.DurationFieldType)v4).getField(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v8 = org.joda.time.DurationFieldType.years();
    Object v9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v10 = ((org.joda.time.DurationFieldType)v8).getField(((org.joda.time.Chronology)v9));
    Object v11 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v12 = ((org.joda.time.field.UnsupportedDurationField)v7).compareTo(((org.joda.time.DurationField)v11));
    Object v13 = ((org.joda.time.field.UnsupportedDurationField)v3).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = 1L;
    Object v5 = 0L;
    Object v6 = ((org.joda.time.DurationField)v3).subtract((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = 1L;
    Object v5 = 2L;
    Object v6 = ((org.joda.time.field.UnsupportedDurationField)v3).getValueAsLong((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = 7L;
    Object v5 = -30;
    Object v6 = ((org.joda.time.DurationField)v3).subtract((((java.lang.Long)v4).longValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = org.joda.time.DurationFieldType.years();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.DurationFieldType)v4).getField(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v3).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getName();
    org.junit.Assert.assertEquals((Object)("years"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = 18L;
    Object v5 = 1;
    Object v6 = ((org.joda.time.DurationField)v3).subtract((((java.lang.Long)v4).longValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getType();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = 13L;
    Object v5 = 1L;
    Object v6 = ((org.joda.time.field.UnsupportedDurationField)v3).getMillis((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = org.joda.time.DurationFieldType.years();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v6 = org.joda.time.DurationFieldType.years();
    Object v7 = ((org.joda.time.field.UnsupportedDurationField)v5).equals(((java.lang.Object)v6));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v3).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = 1L;
    Object v5 = 10L;
    Object v6 = ((org.joda.time.field.UnsupportedDurationField)v3).getDifference((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getUnitMillis();
    org.junit.Assert.assertEquals((Object)(0L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = 29L;
    Object v5 = ((org.joda.time.field.UnsupportedDurationField)v3).getMillis((((java.lang.Long)v4).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = 8L;
    Object v5 = 29;
    Object v6 = ((org.joda.time.DurationField)v3).subtract((((java.lang.Long)v4).longValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = org.joda.time.DurationFieldType.years();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v6 = ((org.joda.time.field.UnsupportedDurationField)v5).getName();
    Object v7 = ((org.joda.time.field.UnsupportedDurationField)v3).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = 40L;
    Object v5 = -2L;
    Object v6 = ((org.joda.time.field.UnsupportedDurationField)v3).getValue((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getType();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v6 = org.joda.time.DurationFieldType.years();
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v6));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).toString();
    Object v9 = ((org.joda.time.field.UnsupportedDurationField)v5).equals(((java.lang.Object)v8));
    Object v10 = 17L;
    Object v11 = ((org.joda.time.field.UnsupportedDurationField)v5).getValue((((java.lang.Long)v10).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getType();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v6 = -25L;
    Object v7 = -31;
    Object v8 = ((org.joda.time.DurationField)v5).subtract((((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getType();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v6 = -36;
    Object v7 = ((org.joda.time.field.UnsupportedDurationField)v5).getMillis((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = 1L;
    Object v5 = 0L;
    Object v6 = ((org.joda.time.DurationField)v3).subtract((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = -10L;
    Object v5 = -43;
    Object v6 = ((org.joda.time.DurationField)v3).subtract((((java.lang.Long)v4).longValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getType();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v6 = 0L;
    Object v7 = 11;
    Object v8 = ((org.joda.time.DurationField)v5).subtract((((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = 1L;
    Object v5 = ((org.joda.time.field.UnsupportedDurationField)v3).getValueAsLong((((java.lang.Long)v4).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = org.joda.time.DurationFieldType.years();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v6 = ((org.joda.time.field.UnsupportedDurationField)v5).getUnitMillis();
    Object v7 = ((org.joda.time.field.UnsupportedDurationField)v3).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getType();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v6 = org.joda.time.DurationFieldType.years();
    Object v7 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.DurationFieldType)v6).isSupported(((org.joda.time.Chronology)v7));
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v6));
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v5).compareTo(((org.joda.time.DurationField)v9));
    Object v11 = ((org.joda.time.field.UnsupportedDurationField)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(114851798), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).toString();
    Object v5 = org.joda.time.DurationFieldType.years();
    Object v6 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v7 = ((org.joda.time.DurationFieldType)v5).getField(((org.joda.time.Chronology)v6));
    Object v8 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v5));
    Object v9 = ((org.joda.time.field.UnsupportedDurationField)v8).getType();
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v3).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getType();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v6 = 35L;
    Object v7 = 34L;
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v5).getValue((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getType();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v6 = org.joda.time.DurationFieldType.years();
    Object v7 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.DurationFieldType)v6).isSupported(((org.joda.time.Chronology)v7));
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v6));
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v5).compareTo(((org.joda.time.DurationField)v9));
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getType();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v6 = org.joda.time.DurationFieldType.years();
    Object v7 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.DurationFieldType)v6).isSupported(((org.joda.time.Chronology)v7));
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v6));
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v5).compareTo(((org.joda.time.DurationField)v9));
    Object v11 = ((org.joda.time.field.UnsupportedDurationField)v5).toString();
    org.junit.Assert.assertEquals((Object)("UnsupportedDurationField[years]"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getType();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v6 = 1L;
    Object v7 = -11;
    Object v8 = ((org.joda.time.DurationField)v5).subtract((((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = 23L;
    Object v5 = -1L;
    Object v6 = ((org.joda.time.DurationField)v3).subtract((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = org.joda.time.DurationFieldType.years();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.DurationFieldType)v4).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v3).compareTo(((org.joda.time.DurationField)v7));
    Object v9 = -7L;
    Object v10 = 1L;
    Object v11 = ((org.joda.time.field.UnsupportedDurationField)v3).getDifference((((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = 0L;
    Object v5 = 56L;
    Object v6 = ((org.joda.time.field.UnsupportedDurationField)v3).getDifferenceAsLong((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).toString();
    Object v5 = 4L;
    Object v6 = 26;
    Object v7 = ((org.joda.time.field.UnsupportedDurationField)v3).add((((java.lang.Long)v5).longValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getType();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v6 = 1L;
    Object v7 = -8L;
    Object v8 = ((org.joda.time.DurationField)v5).subtract((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).toString();
    Object v5 = -38;
    Object v6 = 0L;
    Object v7 = ((org.joda.time.field.UnsupportedDurationField)v3).getMillis((((java.lang.Integer)v5).intValue()),(((java.lang.Long)v6).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = org.joda.time.DurationFieldType.years();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.DurationFieldType)v4).getField(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).getType();
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v3).compareTo(((org.joda.time.DurationField)v9));
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = org.joda.time.DurationFieldType.years();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.DurationFieldType)v4).getField(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).getName();
    Object v9 = ((org.joda.time.field.UnsupportedDurationField)v3).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = 4L;
    Object v5 = -21;
    Object v6 = ((org.joda.time.DurationField)v3).subtract((((java.lang.Long)v4).longValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = 1L;
    Object v5 = 7;
    Object v6 = ((org.joda.time.DurationField)v3).subtract((((java.lang.Long)v4).longValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = org.joda.time.DurationFieldType.years();
    Object v5 = ((org.joda.time.field.UnsupportedDurationField)v3).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getType();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v6 = org.joda.time.DurationFieldType.years();
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v6));
    Object v8 = org.joda.time.DurationFieldType.years();
    Object v9 = ((org.joda.time.field.UnsupportedDurationField)v7).equals(((java.lang.Object)v8));
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v5).equals(((java.lang.Object)v9));
    Object v11 = ((org.joda.time.field.UnsupportedDurationField)v5).getType();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).toString();
    Object v5 = -4L;
    Object v6 = ((org.joda.time.field.UnsupportedDurationField)v3).getMillis((((java.lang.Long)v5).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).hashCode();
    Object v5 = org.joda.time.DurationFieldType.years();
    Object v6 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v5));
    Object v7 = org.joda.time.DurationFieldType.years();
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v6).equals(((java.lang.Object)v7));
    Object v9 = ((org.joda.time.field.UnsupportedDurationField)v3).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = 0L;
    Object v5 = 33L;
    Object v6 = ((org.joda.time.field.UnsupportedDurationField)v3).getValueAsLong((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getType();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v6 = ((org.joda.time.field.UnsupportedDurationField)v5).hashCode();
    Object v7 = ((org.joda.time.field.UnsupportedDurationField)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(114851798), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getType();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v6 = org.joda.time.DurationFieldType.years();
    Object v7 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.DurationFieldType)v6).isSupported(((org.joda.time.Chronology)v7));
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v6));
    Object v10 = ((org.joda.time.DurationField)v9).isSupported();
    Object v11 = ((org.joda.time.field.UnsupportedDurationField)v5).compareTo(((org.joda.time.DurationField)v9));
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).isSupported();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getType();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v6 = ((org.joda.time.DurationField)v5).toString();
    Object v7 = 0L;
    Object v8 = 1;
    Object v9 = ((org.joda.time.DurationField)v5).subtract((((java.lang.Long)v7).longValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = org.joda.time.DurationFieldType.years();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.DurationFieldType)v4).getField(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).hashCode();
    Object v9 = org.joda.time.DurationFieldType.years();
    Object v10 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v9));
    Object v11 = org.joda.time.DurationFieldType.years();
    Object v12 = ((org.joda.time.field.UnsupportedDurationField)v10).equals(((java.lang.Object)v11));
    Object v13 = ((org.joda.time.field.UnsupportedDurationField)v7).equals(((java.lang.Object)v12));
    Object v14 = ((org.joda.time.field.UnsupportedDurationField)v3).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = org.joda.time.DurationFieldType.years();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.DurationFieldType)v4).getField(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).getType();
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v3).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = org.joda.time.DurationFieldType.years();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.DurationFieldType)v4).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v8 = ((org.joda.time.DurationField)v7).isPrecise();
    Object v9 = ((org.joda.time.field.UnsupportedDurationField)v3).compareTo(((org.joda.time.DurationField)v7));
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getType();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v6 = org.joda.time.DurationFieldType.years();
    Object v7 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.DurationFieldType)v6).getField(((org.joda.time.Chronology)v7));
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v6));
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v9).getType();
    Object v11 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v10));
    Object v12 = ((org.joda.time.field.UnsupportedDurationField)v5).compareTo(((org.joda.time.DurationField)v11));
    Object v13 = org.joda.time.DurationFieldType.years();
    Object v14 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v15 = ((org.joda.time.DurationFieldType)v13).getField(((org.joda.time.Chronology)v14));
    Object v16 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v13));
    Object v17 = ((org.joda.time.field.UnsupportedDurationField)v16).getType();
    Object v18 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v17));
    Object v19 = ((org.joda.time.field.UnsupportedDurationField)v5).equals(((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.DurationField)v3).toString();
    Object v5 = 17L;
    Object v6 = -26L;
    Object v7 = ((org.joda.time.DurationField)v3).subtract((((java.lang.Long)v5).longValue()),(((java.lang.Long)v6).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = -22L;
    Object v5 = 12;
    Object v6 = ((org.joda.time.DurationField)v3).subtract((((java.lang.Long)v4).longValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = 39L;
    Object v5 = 1;
    Object v6 = ((org.joda.time.DurationField)v3).subtract((((java.lang.Long)v4).longValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = 1L;
    Object v5 = -25L;
    Object v6 = ((org.joda.time.DurationField)v3).subtract((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getType();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v6 = 1L;
    Object v7 = 0L;
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v5).getMillis((((java.lang.Long)v6).longValue()),(((java.lang.Long)v7).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = 0;
    Object v5 = 3L;
    Object v6 = ((org.joda.time.field.UnsupportedDurationField)v3).getMillis((((java.lang.Integer)v4).intValue()),(((java.lang.Long)v5).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = org.joda.time.DurationFieldType.years();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.DurationFieldType)v4).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).toString();
    Object v9 = org.joda.time.DurationFieldType.years();
    Object v10 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v11 = ((org.joda.time.DurationFieldType)v9).getField(((org.joda.time.Chronology)v10));
    Object v12 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v9));
    Object v13 = ((org.joda.time.field.UnsupportedDurationField)v12).getType();
    Object v14 = ((org.joda.time.field.UnsupportedDurationField)v7).equals(((java.lang.Object)v13));
    Object v15 = ((org.joda.time.field.UnsupportedDurationField)v3).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = 1L;
    Object v5 = -46L;
    Object v6 = ((org.joda.time.DurationField)v3).subtract((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = -21L;
    Object v5 = 1L;
    Object v6 = ((org.joda.time.field.UnsupportedDurationField)v3).getDifference((((java.lang.Long)v4).longValue()),(((java.lang.Long)v5).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getType();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v6 = ((org.joda.time.field.UnsupportedDurationField)v5).toString();
    Object v7 = -48L;
    Object v8 = -27L;
    Object v9 = ((org.joda.time.field.UnsupportedDurationField)v5).getValueAsLong((((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = org.joda.time.DurationFieldType.years();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.DurationFieldType)v4).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).isSupported();
    Object v9 = ((org.joda.time.field.UnsupportedDurationField)v3).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = 1L;
    Object v5 = 3;
    Object v6 = ((org.joda.time.field.UnsupportedDurationField)v3).add((((java.lang.Long)v4).longValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = org.joda.time.DurationFieldType.years();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.DurationFieldType)v4).getField(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v8 = ((org.joda.time.field.UnsupportedDurationField)v7).getType();
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v3).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = 1L;
    Object v5 = 53;
    Object v6 = ((org.joda.time.DurationField)v3).subtract((((java.lang.Long)v4).longValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.DurationField)v3).toString();
    Object v5 = -21L;
    Object v6 = 1L;
    Object v7 = ((org.joda.time.DurationField)v3).subtract((((java.lang.Long)v5).longValue()),(((java.lang.Long)v6).longValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).isSupported(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = org.joda.time.DurationFieldType.years();
    Object v5 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v6 = ((org.joda.time.DurationFieldType)v4).isSupported(((org.joda.time.Chronology)v5));
    Object v7 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v8 = org.joda.time.DurationFieldType.years();
    Object v9 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v10 = ((org.joda.time.DurationFieldType)v8).getField(((org.joda.time.Chronology)v9));
    Object v11 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v8));
    Object v12 = ((org.joda.time.field.UnsupportedDurationField)v11).getType();
    Object v13 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v12));
    Object v14 = ((org.joda.time.field.UnsupportedDurationField)v7).compareTo(((org.joda.time.DurationField)v13));
    Object v15 = ((org.joda.time.field.UnsupportedDurationField)v3).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getType();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v6 = 0L;
    Object v7 = 0;
    Object v8 = ((org.joda.time.DurationField)v5).subtract((((java.lang.Long)v6).longValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = org.joda.time.DurationFieldType.years();
    Object v1 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v2 = ((org.joda.time.DurationFieldType)v0).getField(((org.joda.time.Chronology)v1));
    Object v3 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v0));
    Object v4 = ((org.joda.time.field.UnsupportedDurationField)v3).getType();
    Object v5 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v4));
    Object v6 = org.joda.time.DurationFieldType.years();
    Object v7 = org.joda.time.chrono.GJChronology.getInstanceUTC();
    Object v8 = ((org.joda.time.DurationFieldType)v6).getField(((org.joda.time.Chronology)v7));
    Object v9 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v6));
    Object v10 = ((org.joda.time.field.UnsupportedDurationField)v9).getType();
    Object v11 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v10));
    Object v12 = org.joda.time.DurationFieldType.years();
    Object v13 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v12));
    Object v14 = org.joda.time.DurationFieldType.years();
    Object v15 = ((org.joda.time.field.UnsupportedDurationField)v13).equals(((java.lang.Object)v14));
    Object v16 = ((org.joda.time.field.UnsupportedDurationField)v11).equals(((java.lang.Object)v15));
    Object v17 = ((org.joda.time.field.UnsupportedDurationField)v11).getType();
    Object v18 = ((org.joda.time.field.UnsupportedDurationField)v5).equals(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }
}
