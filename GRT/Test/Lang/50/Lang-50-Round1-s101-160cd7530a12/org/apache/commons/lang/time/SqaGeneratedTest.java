package org.apache.commons.lang.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = true;
    Object v2 = -11;
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "prt";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(((java.util.TimeZone)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((java.util.Locale)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "i";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = ((java.util.TimeZone)v1).useDaylightTime();
    Object v3 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = 49;
    Object v1 = -25;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = ((java.util.TimeZone)v0).useDaylightTime();
    Object v2 = true;
    Object v3 = 1;
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "prt";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(((java.util.TimeZone)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v7));
    org.junit.Assert.assertEquals((Object)("Pacific Daylight Time"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 1;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = "prt";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang.time.FastDateFormat)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(717451912), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 1;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = "prt";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = 11;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang.time.FastDateFormat)v5).parseObject(((java.lang.String)v6),((java.text.ParsePosition)v8));
    ((org.apache.commons.lang.time.FastDateFormat)v5).init();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = "prt";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = new int[]{0,21};
    Object v8 = ((org.apache.commons.lang.time.FastDateFormat)v5).parseToken(((java.lang.String)v6),((int[])v7));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "247";
    ((java.util.TimeZone)v2).setID(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = "]";
    Object v6 = "u";
    Object v7 = "prt";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "247";
    ((java.util.TimeZone)v2).setID(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = "]";
    Object v6 = "u";
    Object v7 = "prt";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v8));
    Object v10 = -16L;
    Object v11 = "205";
    Object v12 = new java.lang.StringBuffer(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v9).format((((java.lang.Long)v10).longValue()),((java.lang.StringBuffer)v12));
    Object v14 = java.util.TimeZone.getDefault();
    Object v15 = "]";
    Object v16 = "u";
    Object v17 = "prt";
    Object v18 = new java.util.Locale(((java.lang.String)v15),((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = java.util.Calendar.getInstance(((java.util.TimeZone)v14),((java.util.Locale)v18));
    Object v20 = "205";
    Object v21 = new java.lang.StringBuffer(((java.lang.String)v20));
    Object v22 = "205";
    Object v23 = new java.lang.StringBuffer(((java.lang.String)v22));
    Object v24 = ((java.lang.StringBuffer)v21).append(((java.lang.StringBuffer)v23));
    Object v25 = ((org.apache.commons.lang.time.FastDateFormat)v9).applyRules(((java.util.Calendar)v19),((java.lang.StringBuffer)v21));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 1;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = "prt";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v6 = java.util.TimeZone.getDefault();
    Object v7 = "]";
    Object v8 = "u";
    Object v9 = "prt";
    Object v10 = new java.util.Locale(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = java.util.Calendar.getInstance(((java.util.TimeZone)v6),((java.util.Locale)v10));
    Object v12 = "205";
    Object v13 = new java.lang.StringBuffer(((java.lang.String)v12));
    Object v14 = ((org.apache.commons.lang.time.FastDateFormat)v5).applyRules(((java.util.Calendar)v11),((java.lang.StringBuffer)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = -1;
    Object v1 = 0;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "prt";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).getDisplayName();
    Object v8 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = "prt";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v6 = new java.util.Date();
    Object v7 = "205";
    Object v8 = new java.lang.StringBuffer(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.lang.time.FastDateFormat)v5).format(((java.util.Date)v6),((java.lang.StringBuffer)v8));
    Object v10 = "205";
    Object v11 = new java.lang.StringBuffer(((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "]";
    Object v14 = "u";
    Object v15 = "prt";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v12).intValue()),((java.util.Locale)v16));
    Object v18 = java.util.TimeZone.getDefault();
    Object v19 = "]";
    Object v20 = "u";
    Object v21 = "prt";
    Object v22 = new java.util.Locale(((java.lang.String)v19),((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = java.util.Calendar.getInstance(((java.util.TimeZone)v18),((java.util.Locale)v22));
    Object v24 = "205";
    Object v25 = new java.lang.StringBuffer(((java.lang.String)v24));
    Object v26 = ((org.apache.commons.lang.time.FastDateFormat)v17).applyRules(((java.util.Calendar)v23),((java.lang.StringBuffer)v25));
    Object v27 = 51L;
    Object v28 = ((java.lang.StringBuffer)v26).append((((java.lang.Long)v27).longValue()));
    Object v29 = 2;
    Object v30 = new java.text.FieldPosition((((java.lang.Integer)v29).intValue()));
    Object v31 = ((org.apache.commons.lang.time.FastDateFormat)v5).format(((java.lang.Object)v11),((java.lang.StringBuffer)v26),((java.text.FieldPosition)v30));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 0;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = 0L;
    Object v3 = ((org.apache.commons.lang.time.FastDateFormat)v1).format((((java.lang.Long)v2).longValue()));
    ((org.apache.commons.lang.time.FastDateFormat)v1).init();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 0;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = "]";
    Object v9 = "u";
    Object v10 = "prt";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = java.util.Calendar.getInstance(((java.util.TimeZone)v7),((java.util.Locale)v11));
    Object v13 = "205";
    Object v14 = new java.lang.StringBuffer(((java.lang.String)v13));
    Object v15 = ((org.apache.commons.lang.time.FastDateFormat)v6).format(((java.util.Calendar)v12),((java.lang.StringBuffer)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.lang.time.FastDateFormat)v1).parsePattern();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = new java.util.Date();
    Object v3 = -4;
    ((java.util.Date)v2).setSeconds((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    Object v5 = "205";
    Object v6 = new java.lang.StringBuffer(((java.lang.String)v5));
    ((java.lang.StringBuffer)v6).trimToSize();
    Object v7 = null;
    Object v8 = ((org.apache.commons.lang.time.FastDateFormat)v1).format(((java.util.Date)v2),((java.lang.StringBuffer)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 0;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = ((java.util.TimeZone)v1).clone();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "prt";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 0;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = ((java.util.TimeZone)v1).clone();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "prt";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v6));
    Object v8 = new java.util.Date();
    Object v9 = ((org.apache.commons.lang.time.FastDateFormat)v7).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = "prt";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v6 = "d' days 'H' hours 'm' minutes 's' seconSs'";
    Object v7 = new int[]{};
    Object v8 = ((org.apache.commons.lang.time.FastDateFormat)v5).parseToken(((java.lang.String)v6),((int[])v7));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang.time.FastDateFormat)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(-160859473), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = "]";
    Object v9 = "u";
    Object v10 = "prt";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = java.util.Calendar.getInstance(((java.util.TimeZone)v7),((java.util.Locale)v11));
    Object v13 = 1;
    Object v14 = "]";
    Object v15 = "u";
    Object v16 = "prt";
    Object v17 = new java.util.Locale(((java.lang.String)v14),((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v13).intValue()),((java.util.Locale)v17));
    Object v19 = java.util.TimeZone.getDefault();
    Object v20 = "]";
    Object v21 = "u";
    Object v22 = "prt";
    Object v23 = new java.util.Locale(((java.lang.String)v20),((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = java.util.Calendar.getInstance(((java.util.TimeZone)v19),((java.util.Locale)v23));
    Object v25 = "205";
    Object v26 = new java.lang.StringBuffer(((java.lang.String)v25));
    Object v27 = ((org.apache.commons.lang.time.FastDateFormat)v18).applyRules(((java.util.Calendar)v24),((java.lang.StringBuffer)v26));
    Object v28 = ((org.apache.commons.lang.time.FastDateFormat)v6).format(((java.util.Calendar)v12),((java.lang.StringBuffer)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = -39;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "Could not iterate based on ";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang.time.FastDateFormat)v6).hashCode();
    Object v8 = ((org.apache.commons.lang.time.FastDateFormat)v6).parsePattern();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "Could not iterate based on ";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang.time.FastDateFormat)v6).hashCode();
    Object v8 = ": ";
    Object v9 = new int[]{-1,0};
    Object v10 = ((org.apache.commons.lang.time.FastDateFormat)v6).parseToken(((java.lang.String)v8),((int[])v9));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "nu";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = ((java.util.TimeZone)v1).getDisplayName();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "prt";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "Could not iterate based on ";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((java.text.Format)v6).clone();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "Could not iterate based on ";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang.time.FastDateFormat)v6).parsePattern();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "Could not iterate based on ";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = "";
    Object v8 = ((java.text.Format)v6).parseObject(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "Could not iterate based on ";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = "Could not iterate based on ";
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "prt";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v7),((java.util.TimeZone)v8),((java.util.Locale)v12));
    Object v14 = 0;
    Object v15 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v14).intValue()));
    Object v16 = new java.util.Date();
    Object v17 = -4;
    ((java.util.Date)v16).setSeconds((((java.lang.Integer)v17).intValue()));
    Object v18 = null;
    Object v19 = "205";
    Object v20 = new java.lang.StringBuffer(((java.lang.String)v19));
    ((java.lang.StringBuffer)v20).trimToSize();
    Object v21 = null;
    Object v22 = ((org.apache.commons.lang.time.FastDateFormat)v15).format(((java.util.Date)v16),((java.lang.StringBuffer)v20));
    Object v23 = 2;
    Object v24 = new java.text.FieldPosition((((java.lang.Integer)v23).intValue()));
    Object v25 = 0;
    ((java.text.FieldPosition)v24).setEndIndex((((java.lang.Integer)v25).intValue()));
    Object v26 = null;
    Object v27 = ((org.apache.commons.lang.time.FastDateFormat)v6).format(((java.lang.Object)v13),((java.lang.StringBuffer)v22),((java.text.FieldPosition)v24));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "The Array must not be null";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = false;
    Object v3 = 0;
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "prt";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((java.util.TimeZone)v1).getDisplayName((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v7));
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "prt";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "The Array must not be null";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = false;
    Object v3 = 0;
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "prt";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((java.util.TimeZone)v1).getDisplayName((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v7));
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "prt";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v12));
    Object v14 = "futl";
    Object v15 = 11;
    Object v16 = new java.text.ParsePosition((((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.apache.commons.lang.time.FastDateFormat)v13).parseObject(((java.lang.String)v14),((java.text.ParsePosition)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "The Array must not be null";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = false;
    Object v3 = 0;
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "prt";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((java.util.TimeZone)v1).getDisplayName((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v7));
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "prt";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v12));
    Object v14 = new java.util.Date();
    Object v15 = "205";
    Object v16 = new java.lang.StringBuffer(((java.lang.String)v15));
    Object v17 = ((org.apache.commons.lang.time.FastDateFormat)v13).format(((java.util.Date)v14),((java.lang.StringBuffer)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "Could not iterate based on ";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = "par*";
    Object v8 = 11;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang.time.FastDateFormat)v6).parseObject(((java.lang.String)v7),((java.text.ParsePosition)v9));
    Object v11 = ((org.apache.commons.lang.time.FastDateFormat)v6).getLocale();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "Could not iterate based on ";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = "";
    Object v8 = 11;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang.time.FastDateFormat)v6).parseObject(((java.lang.String)v7),((java.text.ParsePosition)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "Could not iterate based on ";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((java.text.Format)v6).clone();
    Object v8 = ((org.apache.commons.lang.time.FastDateFormat)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(-226039695), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "detail";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "Could not iterate based on ";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "prt";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "par*";
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v8).getLocale();
    Object v14 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = 53;
    Object v1 = 1;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "prt";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "Could not iterate based on ";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((java.text.Format)v6).clone();
    Object v8 = "";
    Object v9 = ((java.text.Format)v6).parseObject(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "Could not iterate based on ";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((java.text.Format)v6).clone();
    Object v8 = ((org.apache.commons.lang.time.FastDateFormat)v7).getTimeZoneOverridesCalendar();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    ((org.apache.commons.lang.time.FastDateFormat)v6).init();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "Could not iterate based on ";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = "]";
    Object v9 = "u";
    Object v10 = "prt";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = java.util.Calendar.getInstance(((java.util.TimeZone)v7),((java.util.Locale)v11));
    Object v13 = "205";
    Object v14 = new java.lang.StringBuffer(((java.lang.String)v13));
    Object v15 = ((org.apache.commons.lang.time.FastDateFormat)v6).applyRules(((java.util.Calendar)v12),((java.lang.StringBuffer)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "The deno";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "Could not iterate based on ";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "prt";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "par*";
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v8).getLocale();
    Object v14 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "Could not iterate based on ";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = "";
    Object v8 = 11;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang.time.FastDateFormat)v6).parseObject(((java.lang.String)v7),((java.text.ParsePosition)v9));
    Object v11 = ((org.apache.commons.lang.time.FastDateFormat)v6).getLocale();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "o";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).stripExtensions();
    Object v7 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 0;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).getUnicodeLocaleAttributes();
    Object v7 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "The Array must not be null";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = false;
    Object v3 = 0;
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "prt";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((java.util.TimeZone)v1).getDisplayName((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v7));
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "prt";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v12));
    Object v14 = ((java.text.Format)v13).clone();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 0;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).getUnicodeLocaleAttributes();
    Object v7 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "prt";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = java.util.Calendar.getInstance(((java.util.TimeZone)v8),((java.util.Locale)v12));
    Object v14 = "205";
    Object v15 = new java.lang.StringBuffer(((java.lang.String)v14));
    Object v16 = ((org.apache.commons.lang.time.FastDateFormat)v7).format(((java.util.Calendar)v13),((java.lang.StringBuffer)v15));
    Object v17 = ((org.apache.commons.lang.time.FastDateFormat)v7).getTimeZoneOverridesCalendar();
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = org.apache.commons.lang.time.FastDateFormat.getInstance();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "Could not iterate based on ";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang.time.FastDateFormat)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(-226039695), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "The Array must not be null";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = false;
    Object v3 = 0;
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "prt";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((java.util.TimeZone)v1).getDisplayName((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v7));
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "prt";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v12));
    Object v14 = ((java.text.Format)v13).clone();
    Object v15 = "Ya/cute";
    Object v16 = ((java.text.Format)v14).parseObject(((java.lang.String)v15));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "S";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "Could not iterate based on ";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "prt";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "par*";
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v8).getLocale();
    Object v14 = ((java.util.Locale)v13).getUnicodeLocaleAttributes();
    Object v15 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v13));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "S";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "Could not iterate based on ";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "prt";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "par*";
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v8).getLocale();
    Object v14 = ((java.util.Locale)v13).getUnicodeLocaleAttributes();
    Object v15 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v13));
    ((org.apache.commons.lang.time.FastDateFormat)v15).init();
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = -14;
    Object v1 = 25;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "Could not iterate based on ";
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = "]";
    Object v6 = "u";
    Object v7 = "prt";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v3),((java.util.TimeZone)v4),((java.util.Locale)v8));
    Object v10 = "par*";
    Object v11 = 11;
    Object v12 = new java.text.ParsePosition((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v9).parseObject(((java.lang.String)v10),((java.text.ParsePosition)v12));
    Object v14 = ((org.apache.commons.lang.time.FastDateFormat)v9).getLocale();
    Object v15 = ((java.util.TimeZone)v2).getDisplayName(((java.util.Locale)v14));
    Object v16 = "Could not iterate based on ";
    Object v17 = java.util.TimeZone.getDefault();
    Object v18 = "]";
    Object v19 = "u";
    Object v20 = "prt";
    Object v21 = new java.util.Locale(((java.lang.String)v18),((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v16),((java.util.TimeZone)v17),((java.util.Locale)v21));
    Object v23 = "par*";
    Object v24 = 11;
    Object v25 = new java.text.ParsePosition((((java.lang.Integer)v24).intValue()));
    Object v26 = ((org.apache.commons.lang.time.FastDateFormat)v22).parseObject(((java.lang.String)v23),((java.text.ParsePosition)v25));
    Object v27 = ((org.apache.commons.lang.time.FastDateFormat)v22).getLocale();
    Object v28 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v27));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "Could not iterate based on ";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((java.text.Format)v6).clone();
    Object v8 = "";
    Object v9 = java.util.TimeZone.getDefault();
    Object v10 = "]";
    Object v11 = "u";
    Object v12 = "prt";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v8),((java.util.TimeZone)v9),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.lang.time.FastDateFormat)v14).hashCode();
    Object v16 = ((org.apache.commons.lang.time.FastDateFormat)v14).parsePattern();
    Object v17 = ((org.apache.commons.lang.time.FastDateFormat)v7).equals(((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = true;
    Object v2 = 18;
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "prt";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(((java.util.TimeZone)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((java.util.Locale)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = -21;
    Object v2 = "Could not iterate based on ";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "prt";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "par*";
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v8).getLocale();
    Object v14 = ((java.util.Locale)v13).clone();
    Object v15 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.Locale)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "/";
    Object v1 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = false;
    Object v2 = 48;
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "prt";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).getDisplayVariant();
    Object v8 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(((java.util.TimeZone)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((java.util.Locale)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "6";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "/";
    Object v1 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = ((java.util.TimeZone)v3).clone();
    Object v5 = "]";
    Object v6 = "u";
    Object v7 = "prt";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((((java.lang.Integer)v2).intValue()),((java.util.TimeZone)v3),((java.util.Locale)v8));
    Object v10 = "205";
    Object v11 = new java.lang.StringBuffer(((java.lang.String)v10));
    Object v12 = 2;
    Object v13 = new java.text.FieldPosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.lang.time.FastDateFormat)v1).format(((java.lang.Object)v9),((java.lang.StringBuffer)v11),((java.text.FieldPosition)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "Could not iterate based on ";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = "8";
    Object v8 = new int[]{6,-14};
    Object v9 = ((org.apache.commons.lang.time.FastDateFormat)v6).parseToken(((java.lang.String)v7),((int[])v8));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = 27;
    Object v1 = 1;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "Could not iterate based on ";
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = "]";
    Object v6 = "u";
    Object v7 = "prt";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v3),((java.util.TimeZone)v4),((java.util.Locale)v8));
    Object v10 = "par*";
    Object v11 = 11;
    Object v12 = new java.text.ParsePosition((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v9).parseObject(((java.lang.String)v10),((java.text.ParsePosition)v12));
    Object v14 = ((org.apache.commons.lang.time.FastDateFormat)v9).getLocale();
    Object v15 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 0;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).getUnicodeLocaleAttributes();
    Object v7 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v8 = "/";
    Object v9 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.lang.time.FastDateFormat)v7).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "6";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = 11;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang.time.FastDateFormat)v6).equals(((java.lang.Object)v8));
    Object v10 = java.util.TimeZone.getDefault();
    Object v11 = "]";
    Object v12 = "u";
    Object v13 = "prt";
    Object v14 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = java.util.Calendar.getInstance(((java.util.TimeZone)v10),((java.util.Locale)v14));
    Object v16 = ((org.apache.commons.lang.time.FastDateFormat)v6).format(((java.util.Calendar)v15));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = -6;
    Object v1 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).getUnicodeLocaleAttributes();
    Object v7 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v8 = 0L;
    Object v9 = ((org.apache.commons.lang.time.FastDateFormat)v7).format((((java.lang.Long)v8).longValue()));
    Object v10 = "";
    Object v11 = new int[]{};
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v7).parseToken(((java.lang.String)v10),((int[])v11));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "/";
    Object v1 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0));
    Object v2 = "/";
    Object v3 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v2));
    Object v4 = ((java.text.Format)v1).formatToCharacterIterator(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "8240";
    Object v1 = "Could not iterate based on ";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "prt";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = "par*";
    Object v9 = 11;
    Object v10 = new java.text.ParsePosition((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang.time.FastDateFormat)v7).parseObject(((java.lang.String)v8),((java.text.ParsePosition)v10));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v7).getLocale();
    Object v13 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.Locale)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "uacute";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "The numbe]r must not be NaN";
    Object v1 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "Could not iterate based on ";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = 26L;
    Object v8 = ((org.apache.commons.lang.time.FastDateFormat)v6).format((((java.lang.Long)v7).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "The Array must not be null";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = false;
    Object v3 = 0;
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "prt";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((java.util.TimeZone)v1).getDisplayName((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v7));
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "prt";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v12));
    Object v14 = ((java.text.Format)v13).clone();
    Object v15 = "Could not iterate based on ";
    Object v16 = java.util.TimeZone.getDefault();
    Object v17 = "]";
    Object v18 = "u";
    Object v19 = "prt";
    Object v20 = new java.util.Locale(((java.lang.String)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v15),((java.util.TimeZone)v16),((java.util.Locale)v20));
    Object v22 = ((java.text.Format)v21).clone();
    Object v23 = ((org.apache.commons.lang.time.FastDateFormat)v14).equals(((java.lang.Object)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "Could not iterate based on ";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = "S";
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = "Could not iterate based on ";
    Object v10 = java.util.TimeZone.getDefault();
    Object v11 = "]";
    Object v12 = "u";
    Object v13 = "prt";
    Object v14 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v9),((java.util.TimeZone)v10),((java.util.Locale)v14));
    Object v16 = "par*";
    Object v17 = 11;
    Object v18 = new java.text.ParsePosition((((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.lang.time.FastDateFormat)v15).parseObject(((java.lang.String)v16),((java.text.ParsePosition)v18));
    Object v20 = ((org.apache.commons.lang.time.FastDateFormat)v15).getLocale();
    Object v21 = ((java.util.Locale)v20).getUnicodeLocaleAttributes();
    Object v22 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v7),((java.util.TimeZone)v8),((java.util.Locale)v20));
    Object v23 = ((java.text.Format)v6).formatToCharacterIterator(((java.lang.Object)v22));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 0;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "8240";
    Object v1 = "Could not iterate based on ";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "prt";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = "par*";
    Object v9 = 11;
    Object v10 = new java.text.ParsePosition((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang.time.FastDateFormat)v7).parseObject(((java.lang.String)v8),((java.text.ParsePosition)v10));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v7).getLocale();
    Object v13 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.Locale)v12));
    Object v14 = new java.util.Date();
    Object v15 = ((org.apache.commons.lang.time.FastDateFormat)v13).format(((java.util.Date)v14));
    org.junit.Assert.assertEquals((Object)("8240"), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "The Array must not be null";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = false;
    Object v3 = 0;
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "prt";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((java.util.TimeZone)v1).getDisplayName((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v7));
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "prt";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v12));
    Object v14 = ((java.text.Format)v13).clone();
    ((org.apache.commons.lang.time.FastDateFormat)v14).init();
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 0;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "prt";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "The Array must not be null";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = false;
    Object v3 = 0;
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "prt";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((java.util.TimeZone)v1).getDisplayName((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v7));
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "prt";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v12));
    Object v14 = 2;
    Object v15 = new java.text.FieldPosition((((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.apache.commons.lang.time.FastDateFormat)v13).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "S";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "Could not iterate based on ";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "prt";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "par*";
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v8).getLocale();
    Object v14 = ((java.util.Locale)v13).getUnicodeLocaleAttributes();
    Object v15 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v13));
    Object v16 = java.util.TimeZone.getDefault();
    Object v17 = "]";
    Object v18 = "u";
    Object v19 = "prt";
    Object v20 = new java.util.Locale(((java.lang.String)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = java.util.Calendar.getInstance(((java.util.TimeZone)v16),((java.util.Locale)v20));
    Object v22 = "205";
    Object v23 = new java.lang.StringBuffer(((java.lang.String)v22));
    Object v24 = 0;
    Object v25 = 2;
    Object v26 = new java.text.FieldPosition((((java.lang.Integer)v25).intValue()));
    Object v27 = ((java.lang.StringBuffer)v23).insert((((java.lang.Integer)v24).intValue()),((java.lang.Object)v26));
    Object v28 = ((org.apache.commons.lang.time.FastDateFormat)v15).format(((java.util.Calendar)v21),((java.lang.StringBuffer)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = 49;
    Object v1 = 0;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "prt";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "Could not iterate based on ";
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "prt";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v7),((java.util.TimeZone)v8),((java.util.Locale)v12));
    Object v14 = "par*";
    Object v15 = 11;
    Object v16 = new java.text.ParsePosition((((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.apache.commons.lang.time.FastDateFormat)v13).parseObject(((java.lang.String)v14),((java.text.ParsePosition)v16));
    Object v18 = ((org.apache.commons.lang.time.FastDateFormat)v13).getLocale();
    Object v19 = ((java.util.Locale)v6).getDisplayVariant(((java.util.Locale)v18));
    Object v20 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "Could not iterate based on ";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "prt";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "par*";
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v8).getLocale();
    Object v14 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 0;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "";
    ((java.util.TimeZone)v1).setID(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = "Could not iterate based on ";
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = "]";
    Object v7 = "u";
    Object v8 = "prt";
    Object v9 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v4),((java.util.TimeZone)v5),((java.util.Locale)v9));
    Object v11 = "par*";
    Object v12 = 11;
    Object v13 = new java.text.ParsePosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.lang.time.FastDateFormat)v10).parseObject(((java.lang.String)v11),((java.text.ParsePosition)v13));
    Object v15 = ((org.apache.commons.lang.time.FastDateFormat)v10).getLocale();
    Object v16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = "";
    Object v8 = new int[]{};
    Object v9 = ((org.apache.commons.lang.time.FastDateFormat)v6).parseToken(((java.lang.String)v7),((int[])v8));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "uacute";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang.time.FastDateFormat)v6).getTimeZone();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = 9;
    Object v1 = "uacute";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "prt";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang.time.FastDateFormat)v7).getTimeZone();
    Object v9 = "Could not iterate based on ";
    Object v10 = java.util.TimeZone.getDefault();
    Object v11 = "]";
    Object v12 = "u";
    Object v13 = "prt";
    Object v14 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v9),((java.util.TimeZone)v10),((java.util.Locale)v14));
    Object v16 = "par*";
    Object v17 = 11;
    Object v18 = new java.text.ParsePosition((((java.lang.Integer)v17).intValue()));
    Object v19 = ((org.apache.commons.lang.time.FastDateFormat)v15).parseObject(((java.lang.String)v16),((java.text.ParsePosition)v18));
    Object v20 = ((org.apache.commons.lang.time.FastDateFormat)v15).getLocale();
    Object v21 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v8),((java.util.Locale)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "S";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "Could not iterate based on ";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "prt";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "par*";
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v8).getLocale();
    Object v14 = ((java.util.Locale)v13).getUnicodeLocaleAttributes();
    Object v15 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v13));
    Object v16 = ((org.apache.commons.lang.time.FastDateFormat)v15).hashCode();
    org.junit.Assert.assertEquals((Object)(-160859390), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "uacute";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "prt";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang.time.FastDateFormat)v6).getTimeZone();
    Object v8 = 20;
    ((java.util.TimeZone)v7).setRawOffset((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = true;
    Object v11 = -12;
    Object v12 = "Could not iterate based on ";
    Object v13 = java.util.TimeZone.getDefault();
    Object v14 = "]";
    Object v15 = "u";
    Object v16 = "prt";
    Object v17 = new java.util.Locale(((java.lang.String)v14),((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v12),((java.util.TimeZone)v13),((java.util.Locale)v17));
    Object v19 = "par*";
    Object v20 = 11;
    Object v21 = new java.text.ParsePosition((((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.apache.commons.lang.time.FastDateFormat)v18).parseObject(((java.lang.String)v19),((java.text.ParsePosition)v21));
    Object v23 = ((org.apache.commons.lang.time.FastDateFormat)v18).getLocale();
    Object v24 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(((java.util.TimeZone)v7),(((java.lang.Boolean)v10).booleanValue()),(((java.lang.Integer)v11).intValue()),((java.util.Locale)v23));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "`";
    Object v1 = "Could not iterate based on ";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "prt";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = "par*";
    Object v9 = 11;
    Object v10 = new java.text.ParsePosition((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang.time.FastDateFormat)v7).parseObject(((java.lang.String)v8),((java.text.ParsePosition)v10));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v7).getLocale();
    Object v13 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.Locale)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 0;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "";
    ((java.util.TimeZone)v1).setID(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = "Could not iterate based on ";
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = "]";
    Object v7 = "u";
    Object v8 = "prt";
    Object v9 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v4),((java.util.TimeZone)v5),((java.util.Locale)v9));
    Object v11 = "par*";
    Object v12 = 11;
    Object v13 = new java.text.ParsePosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.lang.time.FastDateFormat)v10).parseObject(((java.lang.String)v11),((java.text.ParsePosition)v13));
    Object v15 = ((org.apache.commons.lang.time.FastDateFormat)v10).getLocale();
    Object v16 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v15));
    Object v17 = ((org.apache.commons.lang.time.FastDateFormat)v16).hashCode();
    org.junit.Assert.assertEquals((Object)(-1483679698), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "/";
    Object v1 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0));
    Object v2 = 26L;
    Object v3 = "205";
    Object v4 = new java.lang.StringBuffer(((java.lang.String)v3));
    Object v5 = 1;
    Object v6 = -32L;
    Object v7 = ((java.lang.StringBuffer)v4).insert((((java.lang.Integer)v5).intValue()),(((java.lang.Long)v6).longValue()));
    Object v8 = ((org.apache.commons.lang.time.FastDateFormat)v1).format((((java.lang.Long)v2).longValue()),((java.lang.StringBuffer)v4));
    org.junit.Assert.assertNotNull(v8);
  }
}
