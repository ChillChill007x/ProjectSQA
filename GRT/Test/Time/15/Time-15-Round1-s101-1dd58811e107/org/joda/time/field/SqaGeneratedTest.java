package org.joda.time.field;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 30L;
    Object v1 = org.joda.time.field.FieldUtils.safeToInt((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(30), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = 1;
    Object v2 = 1;
    Object v3 = org.joda.time.field.FieldUtils.getWrappedValue((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 30L;
    Object v1 = org.joda.time.field.FieldUtils.safeToInt((((java.lang.Long)v0).longValue()));
    Object v2 = 30L;
    Object v3 = org.joda.time.field.FieldUtils.safeToInt((((java.lang.Long)v2).longValue()));
    Object v4 = org.joda.time.field.FieldUtils.equals(((java.lang.Object)v1),((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 24L;
    Object v1 = 3L;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(72L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 13L;
    Object v1 = 0;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Long)v0).longValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = -37;
    org.joda.time.field.FieldUtils.verifyValueBounds(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = "orK/joda/time/tz/data";
    Object v1 = -1;
    Object v2 = 39;
    Object v3 = 12;
    org.joda.time.field.FieldUtils.verifyValueBounds(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 0;
    Object v1 = org.joda.time.field.FieldUtils.safeNegate((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 0L;
    Object v1 = -38L;
    Object v2 = org.joda.time.field.FieldUtils.safeSubtract((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(38L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 21L;
    Object v1 = -41L;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-861L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = -2;
    Object v1 = 1;
    Object v2 = org.joda.time.field.FieldUtils.safeAdd((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 0L;
    Object v1 = 1L;
    Object v2 = org.joda.time.field.FieldUtils.safeAdd((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 12L;
    Object v1 = 0L;
    Object v2 = org.joda.time.field.FieldUtils.safeAdd((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(12L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 11;
    Object v1 = -65;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-715), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 12L;
    Object v1 = 0L;
    Object v2 = org.joda.time.field.FieldUtils.safeAdd((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = 12L;
    Object v4 = 0L;
    Object v5 = org.joda.time.field.FieldUtils.safeAdd((((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = org.joda.time.field.FieldUtils.equals(((java.lang.Object)v2),((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 0L;
    Object v1 = 0;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Long)v0).longValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "ECT";
    Object v1 = -1;
    Object v2 = 31;
    Object v3 = 1;
    org.joda.time.field.FieldUtils.verifyValueBounds(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = 1;
    Object v3 = org.joda.time.field.FieldUtils.getWrappedValue((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.weeks();
    Object v2 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v1));
    Object v3 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v2));
    Object v4 = 1;
    Object v5 = -47;
    Object v6 = 11;
    org.joda.time.field.FieldUtils.verifyValueBounds(((org.joda.time.DateTimeField)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 1;
    Object v1 = -24;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-24), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 0L;
    Object v1 = 4L;
    Object v2 = org.joda.time.field.FieldUtils.safeAdd((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(4L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = -21;
    Object v1 = 0;
    Object v2 = org.joda.time.field.FieldUtils.safeAdd((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-21), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 1;
    Object v1 = -46;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-46), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 30;
    Object v1 = org.joda.time.field.FieldUtils.safeNegate((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(-30), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 29L;
    Object v1 = 0L;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 1L;
    Object v1 = 27L;
    Object v2 = org.joda.time.field.FieldUtils.safeSubtract((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-26L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "UTq";
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = 1;
    org.joda.time.field.FieldUtils.verifyValueBounds(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = -54L;
    Object v1 = 1;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Long)v0).longValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-54L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = -19L;
    Object v1 = 0L;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiplyToInt((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.weeks();
    Object v2 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v1));
    Object v3 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v2));
    Object v4 = ((org.joda.time.DateTimeField)v3).getDurationField();
    Object v5 = -43;
    Object v6 = 3;
    Object v7 = 12;
    org.joda.time.field.FieldUtils.verifyValueBounds(((org.joda.time.DateTimeField)v3),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = -9L;
    Object v1 = 0L;
    Object v2 = org.joda.time.field.FieldUtils.safeAdd((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-9L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = -57;
    Object v1 = 5;
    Object v2 = org.joda.time.field.FieldUtils.safeAdd((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-52), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = -14L;
    Object v1 = org.joda.time.field.FieldUtils.safeToInt((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(-14), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = -35;
    Object v1 = 0;
    Object v2 = org.joda.time.field.FieldUtils.safeAdd((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-35), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 37;
    Object v1 = org.joda.time.field.FieldUtils.safeNegate((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(-37), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 7;
    Object v1 = 1;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(7), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 1L;
    Object v1 = 1L;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(1L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 1L;
    Object v1 = org.joda.time.field.FieldUtils.safeToInt((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = -35L;
    Object v1 = -30L;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(1050L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 30;
    Object v1 = org.joda.time.field.FieldUtils.safeNegate((((java.lang.Integer)v0).intValue()));
    Object v2 = org.joda.time.DateTimeFieldType.year();
    Object v3 = org.joda.time.field.FieldUtils.equals(((java.lang.Object)v1),((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 1L;
    Object v1 = 1L;
    Object v2 = org.joda.time.field.FieldUtils.safeSubtract((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = 26;
    Object v2 = -23;
    Object v3 = 1;
    org.joda.time.field.FieldUtils.verifyValueBounds(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.weeks();
    Object v2 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v1));
    Object v3 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v2));
    Object v4 = ((org.joda.time.DateTimeField)v3).getName();
    Object v5 = 0;
    Object v6 = -12;
    Object v7 = 0;
    org.joda.time.field.FieldUtils.verifyValueBounds(((org.joda.time.DateTimeField)v3),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "Pacific/Auckland";
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = 64;
    org.joda.time.field.FieldUtils.verifyValueBounds(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 0;
    Object v1 = -17;
    Object v2 = -9;
    Object v3 = org.joda.time.field.FieldUtils.getWrappedValue((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-9), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "Field must n\"t be null";
    Object v1 = 17;
    Object v2 = -36;
    Object v3 = 1;
    org.joda.time.field.FieldUtils.verifyValueBounds(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 1L;
    Object v1 = 13L;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(13L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = -11L;
    Object v1 = 0L;
    Object v2 = org.joda.time.field.FieldUtils.safeSubtract((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-11L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 0L;
    Object v1 = org.joda.time.field.FieldUtils.safeToInt((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "Field must not be nuly";
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = 6;
    org.joda.time.field.FieldUtils.verifyValueBounds(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 1L;
    Object v1 = 1L;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = -21;
    Object v4 = 0;
    Object v5 = org.joda.time.field.FieldUtils.safeAdd((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.field.FieldUtils.equals(((java.lang.Object)v2),((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 34L;
    Object v1 = 61L;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(2074L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 0;
    Object v1 = -17;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 9;
    Object v2 = -28;
    Object v3 = org.joda.time.field.FieldUtils.getWrappedValue((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 1;
    Object v1 = org.joda.time.field.FieldUtils.safeNegate((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.weeks();
    Object v2 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v1));
    Object v3 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v2));
    Object v4 = -13;
    Object v5 = 0;
    Object v6 = -47;
    org.joda.time.field.FieldUtils.verifyValueBounds(((org.joda.time.DateTimeField)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = -3L;
    Object v1 = 18;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Long)v0).longValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-54L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = -57;
    Object v1 = 5;
    Object v2 = org.joda.time.field.FieldUtils.safeAdd((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1L;
    Object v4 = 27L;
    Object v5 = org.joda.time.field.FieldUtils.safeSubtract((((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = org.joda.time.field.FieldUtils.equals(((java.lang.Object)v2),((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -38;
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = org.joda.time.field.FieldUtils.getWrappedValue((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 0;
    Object v1 = -31;
    Object v2 = org.joda.time.field.FieldUtils.safeAdd((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-31), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = 7;
    Object v2 = 1;
    Object v3 = -19;
    org.joda.time.field.FieldUtils.verifyValueBounds(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 0;
    Object v1 = 45;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = -2;
    Object v1 = 1;
    Object v2 = org.joda.time.field.FieldUtils.safeAdd((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 0L;
    Object v4 = 0;
    Object v5 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Long)v3).longValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.joda.time.field.FieldUtils.equals(((java.lang.Object)v2),((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 21L;
    Object v1 = 1;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Long)v0).longValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(21L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "PeriodFormat.milliFecond";
    Object v1 = 60;
    Object v2 = 2;
    Object v3 = 2;
    org.joda.time.field.FieldUtils.verifyValueBounds(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = -9L;
    Object v1 = -2L;
    Object v2 = org.joda.time.field.FieldUtils.safeSubtract((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-7L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = -44;
    Object v1 = 0;
    Object v2 = 40;
    Object v3 = org.joda.time.field.FieldUtils.getWrappedValue((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(38), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 24;
    Object v1 = 0;
    Object v2 = org.joda.time.field.FieldUtils.safeAdd((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(24), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 0;
    Object v1 = -23;
    Object v2 = -21;
    Object v3 = 1;
    Object v4 = org.joda.time.field.FieldUtils.getWrappedValue((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 1L;
    Object v1 = 0L;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "yearOfEra";
    Object v1 = -42;
    Object v2 = 48;
    Object v3 = 0;
    org.joda.time.field.FieldUtils.verifyValueBounds(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = -2147483692L;
    Object v1 = 27L;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-57982059684L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "Field '";
    Object v1 = 0;
    Object v2 = -21;
    Object v3 = 1;
    org.joda.time.field.FieldUtils.verifyValueBounds(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 0;
    Object v1 = 33;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = 1;
    org.joda.time.field.FieldUtils.verifyValueBounds(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 0L;
    Object v1 = 0L;
    Object v2 = org.joda.time.field.FieldUtils.safeAdd((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 1L;
    Object v1 = 53L;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(53L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 0;
    Object v1 = 50;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = -26L;
    Object v1 = 15;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Long)v0).longValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(-390L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 0L;
    Object v1 = 1L;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = -8L;
    Object v1 = 0L;
    Object v2 = org.joda.time.field.FieldUtils.safeAdd((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-8L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = -2147483692L;
    Object v1 = 27L;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    Object v3 = 1L;
    Object v4 = 27L;
    Object v5 = org.joda.time.field.FieldUtils.safeSubtract((((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = org.joda.time.field.FieldUtils.equals(((java.lang.Object)v2),((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = 1;
    Object v2 = -15;
    Object v3 = 1;
    org.joda.time.field.FieldUtils.verifyValueBounds(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = org.joda.time.DurationFieldType.weeks();
    Object v2 = org.joda.time.field.UnsupportedDurationField.getInstance(((org.joda.time.DurationFieldType)v1));
    Object v3 = org.joda.time.field.UnsupportedDateTimeField.getInstance(((org.joda.time.DateTimeFieldType)v0),((org.joda.time.DurationField)v2));
    Object v4 = ((org.joda.time.DateTimeField)v3).getLeapDurationField();
    Object v5 = -21;
    Object v6 = 51;
    Object v7 = 14;
    org.joda.time.field.FieldUtils.verifyValueBounds(((org.joda.time.DateTimeField)v3),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 0;
    Object v1 = 1;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "Rules not found: ";
    Object v1 = 1;
    Object v2 = 22;
    Object v3 = 0;
    org.joda.time.field.FieldUtils.verifyValueBounds(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = -17;
    Object v1 = -53;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(901), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = -30L;
    Object v1 = -26L;
    Object v2 = org.joda.time.field.FieldUtils.safeAdd((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-56L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = 23;
    Object v2 = -16;
    Object v3 = 32;
    org.joda.time.field.FieldUtils.verifyValueBounds(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = -34L;
    Object v1 = -2L;
    Object v2 = org.joda.time.field.FieldUtils.safeAdd((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(-36L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 28L;
    Object v1 = -5L;
    Object v2 = org.joda.time.field.FieldUtils.safeAdd((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(23L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = org.joda.time.field.FieldUtils.safeAdd((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = org.joda.time.DateTimeFieldType.year();
    Object v1 = 1;
    Object v2 = 0;
    Object v3 = -1;
    org.joda.time.field.FieldUtils.verifyValueBounds(((org.joda.time.DateTimeFieldType)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 0L;
    Object v1 = 0L;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 49;
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = org.joda.time.field.FieldUtils.getWrappedValue((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 0L;
    Object v1 = -16L;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)(0L), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 7;
    Object v1 = 1;
    Object v2 = org.joda.time.field.FieldUtils.safeMultiply((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -14L;
    Object v4 = org.joda.time.field.FieldUtils.safeToInt((((java.lang.Long)v3).longValue()));
    Object v5 = org.joda.time.field.FieldUtils.equals(((java.lang.Object)v2),((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 0;
    Object v1 = 10;
    Object v2 = org.joda.time.field.FieldUtils.safeAdd((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(10), v2);
  }
}
