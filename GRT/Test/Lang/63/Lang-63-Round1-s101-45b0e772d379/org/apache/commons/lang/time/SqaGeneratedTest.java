package org.apache.commons.lang.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 30L;
    Object v1 = 12L;
    Object v2 = "V[";
    Object v3 = true;
    Object v4 = "25";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.util.TimeZone)v5));
    org.junit.Assert.assertEquals((Object)("V["), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[]{null,null};
    Object v1 = -5;
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = 18;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = false;
    Object v9 = org.apache.commons.lang.time.DurationFormatUtils.format(((org.apache.commons.lang.time.DurationFormatUtils.Token[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 25L;
    Object v1 = false;
    Object v2 = true;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((((java.lang.Long)v0).longValue()),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("0 days"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "plusmn";
    Object v1 = org.apache.commons.lang.time.DurationFormatUtils.lexx(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 15L;
    Object v1 = true;
    Object v2 = false;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((((java.lang.Long)v0).longValue()),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("0 seconds"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = -17L;
    Object v1 = 16L;
    Object v2 = "k";
    Object v3 = false;
    Object v4 = "25";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.util.TimeZone)v5));
    org.junit.Assert.assertEquals((Object)("k"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "O0";
    Object v1 = org.apache.commons.lang.time.DurationFormatUtils.lexx(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 22L;
    Object v1 = "";
    Object v2 = false;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((((java.lang.Long)v0).longValue()),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 1L;
    Object v1 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationISO((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)("P0Y0M0DT0H0M0.001S"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = -4L;
    Object v1 = 0L;
    Object v2 = "7";
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("7"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = -27L;
    Object v1 = true;
    Object v2 = false;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((((java.lang.Long)v0).longValue()),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("0 seconds"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.time.DurationFormatUtils.lexx(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.DurationFormatUtils();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = -1L;
    Object v1 = 1L;
    Object v2 = " is not a valid nuYmber.";
    Object v3 = false;
    Object v4 = "25";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.util.TimeZone)v5));
    org.junit.Assert.assertEquals((Object)(" i0 not a vali0 nuY0ber."), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[]{null,null,null};
    Object v1 = 1;
    Object v2 = 30;
    Object v3 = 0;
    Object v4 = 12;
    Object v5 = 0;
    Object v6 = 5;
    Object v7 = 1;
    Object v8 = false;
    Object v9 = org.apache.commons.lang.time.DurationFormatUtils.format(((org.apache.commons.lang.time.DurationFormatUtils.Token[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[]{null,null,null};
    Object v1 = 3;
    Object v2 = -4;
    Object v3 = -5;
    Object v4 = -35;
    Object v5 = 4;
    Object v6 = 0;
    Object v7 = 50;
    Object v8 = true;
    Object v9 = org.apache.commons.lang.time.DurationFormatUtils.format(((org.apache.commons.lang.time.DurationFormatUtils.Token[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 0L;
    Object v1 = 0L;
    Object v2 = "w";
    Object v3 = true;
    Object v4 = "25";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.util.TimeZone)v5));
    org.junit.Assert.assertEquals((Object)("w"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 1L;
    Object v1 = "The dat~e must not be null";
    Object v2 = false;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((((java.lang.Long)v0).longValue()),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("The 0at~e 0u0t not be null"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[]{null,null};
    Object v1 = 0;
    Object v2 = 24;
    Object v3 = -13;
    Object v4 = 30;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = true;
    Object v9 = org.apache.commons.lang.time.DurationFormatUtils.format(((org.apache.commons.lang.time.DurationFormatUtils.Token[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = -47L;
    Object v1 = false;
    Object v2 = false;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((((java.lang.Long)v0).longValue()),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("0 days 0 hours 0 minutes 0 seconds"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "(";
    Object v1 = org.apache.commons.lang.time.DurationFormatUtils.lexx(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 1L;
    Object v1 = false;
    Object v2 = true;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((((java.lang.Long)v0).longValue()),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("0 days"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 1L;
    Object v1 = 11L;
    Object v2 = "The number must not be fNaN";
    Object v3 = true;
    Object v4 = "25";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.util.TimeZone)v5));
    org.junit.Assert.assertEquals((Object)("The nu00ber u0t not be fNaN"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 1L;
    Object v1 = "AEli<g";
    Object v2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((((java.lang.Long)v0).longValue()),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("AEli<g"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[]{null,null};
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = 30;
    Object v4 = 25;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = true;
    Object v9 = org.apache.commons.lang.time.DurationFormatUtils.format(((org.apache.commons.lang.time.DurationFormatUtils.Token[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 1L;
    Object v1 = "E";
    Object v2 = true;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((((java.lang.Long)v0).longValue()),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("E"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 3L;
    Object v1 = false;
    Object v2 = true;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((((java.lang.Long)v0).longValue()),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("0 days"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 1L;
    Object v1 = 39L;
    Object v2 = "bdquo";
    Object v3 = true;
    Object v4 = "25";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.util.TimeZone)v5));
    org.junit.Assert.assertEquals((Object)("b0quo"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 1L;
    Object v1 = 0L;
    Object v2 = "oerflow: add";
    Object v3 = true;
    Object v4 = "25";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.util.TimeZone)v5));
    org.junit.Assert.assertEquals((Object)("oerflow: a00"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "zeta";
    Object v1 = org.apache.commons.lang.time.DurationFormatUtils.lexx(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[]{null,null};
    Object v1 = -70;
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = -10;
    Object v5 = 0;
    Object v6 = -31;
    Object v7 = -36;
    Object v8 = false;
    Object v9 = org.apache.commons.lang.time.DurationFormatUtils.format(((org.apache.commons.lang.time.DurationFormatUtils.Token[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 1L;
    Object v1 = 153L;
    Object v2 = "sdot";
    Object v3 = false;
    Object v4 = "25";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.util.TimeZone)v5));
    org.junit.Assert.assertEquals((Object)("00ot"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 12L;
    Object v1 = true;
    Object v2 = false;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((((java.lang.Long)v0).longValue()),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("0 seconds"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 0L;
    Object v1 = 56L;
    Object v2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)("P0Y0M0DT0H0M0.056S"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = -7L;
    Object v1 = 0L;
    Object v2 = "N";
    Object v3 = true;
    Object v4 = "25";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.util.TimeZone)v5));
    org.junit.Assert.assertEquals((Object)("N"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[]{null,null,null};
    Object v1 = -6;
    Object v2 = 27;
    Object v3 = -2;
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = 20;
    Object v7 = 1;
    Object v8 = true;
    Object v9 = org.apache.commons.lang.time.DurationFormatUtils.format(((org.apache.commons.lang.time.DurationFormatUtils.Token[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "getLinkedCause";
    Object v1 = org.apache.commons.lang.time.DurationFormatUtils.lexx(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 1L;
    Object v1 = 1L;
    Object v2 = "4";
    Object v3 = false;
    Object v4 = "25";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.util.TimeZone)v5));
    org.junit.Assert.assertEquals((Object)("4"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = -17L;
    Object v1 = "]8";
    Object v2 = true;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((((java.lang.Long)v0).longValue()),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("]8"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[]{null};
    Object v1 = 0;
    Object v2 = 38;
    Object v3 = 85;
    Object v4 = 2;
    Object v5 = 31;
    Object v6 = 0;
    Object v7 = -18;
    Object v8 = true;
    Object v9 = org.apache.commons.lang.time.DurationFormatUtils.format(((org.apache.commons.lang.time.DurationFormatUtils.Token[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[]{null,null,null};
    Object v1 = -36;
    Object v2 = 73;
    Object v3 = 0;
    Object v4 = -27;
    Object v5 = 1;
    Object v6 = 37;
    Object v7 = 1;
    Object v8 = false;
    Object v9 = org.apache.commons.lang.time.DurationFormatUtils.format(((org.apache.commons.lang.time.DurationFormatUtils.Token[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 18L;
    Object v1 = false;
    Object v2 = true;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((((java.lang.Long)v0).longValue()),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("0 days"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 0L;
    Object v1 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationISO((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)("P0Y0M0DT0H0M0.000S"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[]{};
    Object v1 = -9;
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = 123;
    Object v7 = -10;
    Object v8 = false;
    Object v9 = org.apache.commons.lang.time.DurationFormatUtils.format(((org.apache.commons.lang.time.DurationFormatUtils.Token[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 34L;
    Object v1 = false;
    Object v2 = true;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((((java.lang.Long)v0).longValue()),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("0 days"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 34L;
    Object v1 = true;
    Object v2 = true;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((((java.lang.Long)v0).longValue()),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("0 seconds"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 1L;
    Object v1 = -50L;
    Object v2 = "B";
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("B"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "The number must not be null";
    Object v1 = org.apache.commons.lang.time.DurationFormatUtils.lexx(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "OS";
    Object v1 = org.apache.commons.lang.time.DurationFormatUtils.lexx(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 0L;
    Object v1 = false;
    Object v2 = true;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((((java.lang.Long)v0).longValue()),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("0 days"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[]{null,null};
    Object v1 = 0;
    Object v2 = -10;
    Object v3 = 1;
    Object v4 = -53;
    Object v5 = 1;
    Object v6 = 51;
    Object v7 = 0;
    Object v8 = false;
    Object v9 = org.apache.commons.lang.time.DurationFormatUtils.format(((org.apache.commons.lang.time.DurationFormatUtils.Token[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "The List must not be null";
    Object v1 = org.apache.commons.lang.time.DurationFormatUtils.lexx(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "L";
    Object v1 = org.apache.commons.lang.time.DurationFormatUtils.lexx(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 0L;
    Object v1 = true;
    Object v2 = true;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((((java.lang.Long)v0).longValue()),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("0 seconds"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 1L;
    Object v1 = "K";
    Object v2 = true;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((((java.lang.Long)v0).longValue()),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("K"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 14L;
    Object v1 = "frac12";
    Object v2 = false;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((((java.lang.Long)v0).longValue()),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("frac12"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 0L;
    Object v1 = -30L;
    Object v2 = "imag";
    Object v3 = true;
    Object v4 = "25";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.util.TimeZone)v5));
    org.junit.Assert.assertEquals((Object)("i0ag"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[]{null};
    Object v1 = 46;
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = 17;
    Object v5 = -36;
    Object v6 = 1;
    Object v7 = 21;
    Object v8 = true;
    Object v9 = org.apache.commons.lang.time.DurationFormatUtils.format(((org.apache.commons.lang.time.DurationFormatUtils.Token[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "8719";
    Object v1 = org.apache.commons.lang.time.DurationFormatUtils.lexx(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 0L;
    Object v1 = "Illegal Capacity: ";
    Object v2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((((java.lang.Long)v0).longValue()),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("Illegal Capacit0: "), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[]{null};
    Object v1 = 2;
    Object v2 = 39;
    Object v3 = -17;
    Object v4 = -20;
    Object v5 = 17;
    Object v6 = -3;
    Object v7 = 18;
    Object v8 = true;
    Object v9 = org.apache.commons.lang.time.DurationFormatUtils.format(((org.apache.commons.lang.time.DurationFormatUtils.Token[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = -9L;
    Object v1 = "overflow: can't negate numerator";
    Object v2 = false;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((((java.lang.Long)v0).longValue()),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("overflow: cant negate numerator"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = -9L;
    Object v1 = -92L;
    Object v2 = "19";
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("19"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 14L;
    Object v1 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)("0:00:00.014"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = -17L;
    Object v1 = "217";
    Object v2 = false;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((((java.lang.Long)v0).longValue()),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("217"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 1L;
    Object v1 = "";
    Object v2 = false;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((((java.lang.Long)v0).longValue()),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 0L;
    Object v1 = 86L;
    Object v2 = "add() is unsupported";
    Object v3 = false;
    Object v4 = "25";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = ((java.util.TimeZone)v5).getDisplayName();
    Object v7 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.util.TimeZone)v5));
    org.junit.Assert.assertEquals((Object)("a0() i0 unupporte0"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = -12L;
    Object v1 = 0L;
    Object v2 = "7";
    Object v3 = false;
    Object v4 = "25";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.util.TimeZone)v5));
    org.junit.Assert.assertEquals((Object)("7"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 1L;
    Object v1 = -18L;
    Object v2 = "J";
    Object v3 = true;
    Object v4 = "25";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = ((java.util.TimeZone)v5).clone();
    Object v7 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.util.TimeZone)v5));
    org.junit.Assert.assertEquals((Object)("J"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 9L;
    Object v1 = 6L;
    Object v2 = "";
    Object v3 = false;
    Object v4 = "25";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.util.TimeZone)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[]{null};
    Object v1 = 39;
    Object v2 = 1;
    Object v3 = 5;
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = 24;
    Object v7 = 0;
    Object v8 = false;
    Object v9 = org.apache.commons.lang.time.DurationFormatUtils.format(((org.apache.commons.lang.time.DurationFormatUtils.Token[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = -9L;
    Object v1 = -12L;
    Object v2 = "]";
    Object v3 = false;
    Object v4 = "25";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.util.TimeZone)v5));
    org.junit.Assert.assertEquals((Object)("]"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 0L;
    Object v1 = -3L;
    Object v2 = "M";
    Object v3 = false;
    Object v4 = "25";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.util.TimeZone)v5));
    org.junit.Assert.assertEquals((Object)("0"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 66L;
    Object v1 = "]";
    Object v2 = true;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((((java.lang.Long)v0).longValue()),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 1L;
    Object v1 = " is not a valid number.";
    Object v2 = false;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((((java.lang.Long)v0).longValue()),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(" i0 not a vali0 nu0ber."), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 27L;
    Object v1 = true;
    Object v2 = true;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((((java.lang.Long)v0).longValue()),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("0 seconds"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 1L;
    Object v1 = true;
    Object v2 = true;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((((java.lang.Long)v0).longValue()),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("0 seconds"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = -19L;
    Object v1 = 5L;
    Object v2 = ":";
    Object v3 = false;
    Object v4 = "25";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.util.TimeZone)v5));
    org.junit.Assert.assertEquals((Object)(":"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 1L;
    Object v1 = false;
    Object v2 = false;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((((java.lang.Long)v0).longValue()),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("0 days 0 hours 0 minutes 0 seconds"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 8L;
    Object v1 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)("0:00:00.008"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 1L;
    Object v1 = "The String did not match any specified value";
    Object v2 = true;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((((java.lang.Long)v0).longValue()),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("The 1tring 00i not 0atch an0 0pecifie0 value"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 1L;
    Object v1 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationHMS((((java.lang.Long)v0).longValue()));
    org.junit.Assert.assertEquals((Object)("0:00:00.001"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = -54L;
    Object v1 = 22L;
    Object v2 = "";
    Object v3 = false;
    Object v4 = "25";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.util.TimeZone)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 0L;
    Object v1 = false;
    Object v2 = false;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((((java.lang.Long)v0).longValue()),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("0 days 0 hours 0 minutes 0 seconds"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 0L;
    Object v1 = " 0 seconds";
    Object v2 = true;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((((java.lang.Long)v0).longValue()),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)(" 0 0econ00"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[]{null,null,null};
    Object v1 = 1;
    Object v2 = 2;
    Object v3 = -24;
    Object v4 = 2;
    Object v5 = 0;
    Object v6 = -23;
    Object v7 = 0;
    Object v8 = false;
    Object v9 = org.apache.commons.lang.time.DurationFormatUtils.format(((org.apache.commons.lang.time.DurationFormatUtils.Token[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 26L;
    Object v1 = "Invalid locale format: ";
    Object v2 = false;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((((java.lang.Long)v0).longValue()),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("Invali0 locale for0at: "), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = -12L;
    Object v1 = 0L;
    Object v2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()));
    org.junit.Assert.assertEquals((Object)("P0Y0M0DT0H0M0.012S"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 67L;
    Object v1 = true;
    Object v2 = false;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((((java.lang.Long)v0).longValue()),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("0 seconds"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 0L;
    Object v1 = "[";
    Object v2 = true;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((((java.lang.Long)v0).longValue()),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("["), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[]{null,null};
    Object v1 = -27;
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = -23;
    Object v5 = -8;
    Object v6 = 0;
    Object v7 = 4;
    Object v8 = false;
    Object v9 = org.apache.commons.lang.time.DurationFormatUtils.format(((org.apache.commons.lang.time.DurationFormatUtils.Token[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[]{};
    Object v1 = 1;
    Object v2 = 7;
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = true;
    Object v9 = org.apache.commons.lang.time.DurationFormatUtils.format(((org.apache.commons.lang.time.DurationFormatUtils.Token[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 1L;
    Object v1 = 3L;
    Object v2 = "";
    Object v3 = false;
    Object v4 = "25";
    Object v5 = java.util.TimeZone.getTimeZone(((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((((java.lang.Long)v0).longValue()),(((java.lang.Long)v1).longValue()),((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()),((java.util.TimeZone)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[]{};
    Object v1 = 0;
    Object v2 = -35;
    Object v3 = -20;
    Object v4 = 0;
    Object v5 = 27;
    Object v6 = -6;
    Object v7 = 1;
    Object v8 = false;
    Object v9 = org.apache.commons.lang.time.DurationFormatUtils.format(((org.apache.commons.lang.time.DurationFormatUtils.Token[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 35L;
    Object v1 = false;
    Object v2 = true;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((((java.lang.Long)v0).longValue()),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("0 days"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 0L;
    Object v1 = "";
    Object v2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((((java.lang.Long)v0).longValue()),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 0L;
    Object v1 = "821";
    Object v2 = false;
    Object v3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((((java.lang.Long)v0).longValue()),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertEquals((Object)("821"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[]{null,null};
    Object v1 = 0;
    Object v2 = -37;
    Object v3 = 0;
    Object v4 = -16;
    Object v5 = 0;
    Object v6 = -1;
    Object v7 = 0;
    Object v8 = false;
    Object v9 = org.apache.commons.lang.time.DurationFormatUtils.format(((org.apache.commons.lang.time.DurationFormatUtils.Token[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.apache.commons.lang.time.DurationFormatUtils.Token[]{null,null,null};
    Object v1 = 1;
    Object v2 = 10;
    Object v3 = 0;
    Object v4 = 42;
    Object v5 = -1;
    Object v6 = 6;
    Object v7 = -22;
    Object v8 = false;
    Object v9 = org.apache.commons.lang.time.DurationFormatUtils.format(((org.apache.commons.lang.time.DurationFormatUtils.Token[])v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "DeOlta";
    Object v1 = org.apache.commons.lang.time.DurationFormatUtils.lexx(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }
}
