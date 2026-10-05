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
    Object v5 = "Scaro";
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
    Object v0 = 48;
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
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(((java.util.TimeZone)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v7));
    org.junit.Assert.assertEquals((Object)("Pacific Daylight Time"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 1;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = "Scaro";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang.time.FastDateFormat)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(797039044), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 1;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = "Scaro";
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
    Object v3 = "Scaro";
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
    Object v3 = "prim4";
    ((java.util.TimeZone)v2).setID(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = "]";
    Object v6 = "u";
    Object v7 = "Scaro";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "prim4";
    ((java.util.TimeZone)v2).setID(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = "]";
    Object v6 = "u";
    Object v7 = "Scaro";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v8));
    Object v10 = -16L;
    Object v11 = "933";
    Object v12 = new java.lang.StringBuffer(((java.lang.String)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v9).format((((java.lang.Long)v10).longValue()),((java.lang.StringBuffer)v12));
    Object v14 = java.util.TimeZone.getDefault();
    Object v15 = "]";
    Object v16 = "u";
    Object v17 = "Scaro";
    Object v18 = new java.util.Locale(((java.lang.String)v15),((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = java.util.Calendar.getInstance(((java.util.TimeZone)v14),((java.util.Locale)v18));
    Object v20 = "933";
    Object v21 = new java.lang.StringBuffer(((java.lang.String)v20));
    Object v22 = "933";
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
    Object v3 = "Scaro";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v6 = java.util.TimeZone.getDefault();
    Object v7 = "]";
    Object v8 = "u";
    Object v9 = "Scaro";
    Object v10 = new java.util.Locale(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = java.util.Calendar.getInstance(((java.util.TimeZone)v6),((java.util.Locale)v10));
    Object v12 = "933";
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
    Object v5 = "Scaro";
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
    Object v3 = "Scaro";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v6 = new java.util.Date();
    Object v7 = "933";
    Object v8 = new java.lang.StringBuffer(((java.lang.String)v7));
    Object v9 = ((org.apache.commons.lang.time.FastDateFormat)v5).format(((java.util.Date)v6),((java.lang.StringBuffer)v8));
    Object v10 = "933";
    Object v11 = new java.lang.StringBuffer(((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = "]";
    Object v14 = "u";
    Object v15 = "Scaro";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v12).intValue()),((java.util.Locale)v16));
    Object v18 = java.util.TimeZone.getDefault();
    Object v19 = "]";
    Object v20 = "u";
    Object v21 = "Scaro";
    Object v22 = new java.util.Locale(((java.lang.String)v19),((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = java.util.Calendar.getInstance(((java.util.TimeZone)v18),((java.util.Locale)v22));
    Object v24 = "933";
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
    Object v4 = "Scaro";
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
    Object v1 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "Scaro";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = java.util.Calendar.getInstance(((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = "933";
    Object v9 = new java.lang.StringBuffer(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.lang.time.FastDateFormat)v1).format(((java.util.Calendar)v7),((java.lang.StringBuffer)v9));
    org.junit.Assert.assertNotNull(v10);
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
    Object v5 = "933";
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
    Object v5 = "Scaro";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = "933";
    Object v3 = new java.lang.StringBuffer(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.lang.time.FastDateFormat)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = "Scaro";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v6 = " 0 minuSes";
    Object v7 = new int[]{};
    Object v8 = ((org.apache.commons.lang.time.FastDateFormat)v5).parseToken(((java.lang.String)v6),((int[])v7));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "Z";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "Z";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang.time.FastDateFormat)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(-81272251), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "Z";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = "]";
    Object v9 = "u";
    Object v10 = "Scaro";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = java.util.Calendar.getInstance(((java.util.TimeZone)v7),((java.util.Locale)v11));
    Object v13 = "933";
    Object v14 = new java.lang.StringBuffer(((java.lang.String)v13));
    Object v15 = ((org.apache.commons.lang.time.FastDateFormat)v6).format(((java.util.Calendar)v12),((java.lang.StringBuffer)v14));
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
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "Z";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang.time.FastDateFormat)v6).hashCode();
    Object v8 = ((org.apache.commons.lang.time.FastDateFormat)v6).parsePattern();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang.time.FastDateFormat)v6).hashCode();
    Object v8 = "getThrowable";
    Object v9 = new int[]{-1,0};
    Object v10 = ((org.apache.commons.lang.time.FastDateFormat)v6).parseToken(((java.lang.String)v8),((int[])v9));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "-";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = ((java.util.TimeZone)v1).getDisplayName();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "Scaro";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((java.text.Format)v6).clone();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang.time.FastDateFormat)v6).parsePattern();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = "S";
    Object v8 = ((java.text.Format)v6).parseObject(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = " 0 days";
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "Scaro";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v7),((java.util.TimeZone)v8),((java.util.Locale)v12));
    Object v14 = "933";
    Object v15 = new java.lang.StringBuffer(((java.lang.String)v14));
    Object v16 = 2;
    Object v17 = new java.text.FieldPosition((((java.lang.Integer)v16).intValue()));
    Object v18 = 0;
    ((java.text.FieldPosition)v17).setEndIndex((((java.lang.Integer)v18).intValue()));
    Object v19 = null;
    Object v20 = ((org.apache.commons.lang.time.FastDateFormat)v6).format(((java.lang.Object)v13),((java.lang.StringBuffer)v15),((java.text.FieldPosition)v17));
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
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((java.util.TimeZone)v1).getDisplayName((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v7));
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "Scaro";
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
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((java.util.TimeZone)v1).getDisplayName((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v7));
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "Scaro";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v12));
    Object v14 = "Array cannot be emptyt";
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
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((java.util.TimeZone)v1).getDisplayName((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v7));
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "Scaro";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v12));
    Object v14 = new java.util.Date();
    Object v15 = "933";
    Object v16 = new java.lang.StringBuffer(((java.lang.String)v15));
    Object v17 = ((org.apache.commons.lang.time.FastDateFormat)v13).format(((java.util.Date)v14),((java.lang.StringBuffer)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = "Sc*ron";
    Object v8 = 11;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang.time.FastDateFormat)v6).parseObject(((java.lang.String)v7),((java.text.ParsePosition)v9));
    Object v11 = ((org.apache.commons.lang.time.FastDateFormat)v6).getLocale();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
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
    Object v0 = "The Array must not be null";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = false;
    Object v3 = 0;
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((java.util.TimeZone)v1).getDisplayName((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v7));
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "Scaro";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v12));
    Object v14 = ((org.apache.commons.lang.time.FastDateFormat)v13).hashCode();
    org.junit.Assert.assertEquals((Object)(1863886081), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "getException";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = " 0 days";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "Sc*ron";
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
    Object v3 = " 0 days";
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = "]";
    Object v6 = "u";
    Object v7 = "Scaro";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v3),((java.util.TimeZone)v4),((java.util.Locale)v8));
    Object v10 = "Sc*ron";
    Object v11 = 11;
    Object v12 = new java.text.ParsePosition((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v9).parseObject(((java.lang.String)v10),((java.text.ParsePosition)v12));
    Object v14 = ((org.apache.commons.lang.time.FastDateFormat)v9).getLocale();
    Object v15 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "-";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = ((java.util.TimeZone)v1).getDisplayName();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "Scaro";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v6));
    Object v8 = ((java.text.Format)v7).clone();
    Object v9 = "";
    Object v10 = ((java.text.Format)v7).parseObject(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
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
    Object v0 = "Z";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    ((org.apache.commons.lang.time.FastDateFormat)v6).init();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = "]";
    Object v9 = "u";
    Object v10 = "Scaro";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = java.util.Calendar.getInstance(((java.util.TimeZone)v7),((java.util.Locale)v11));
    Object v13 = "933";
    Object v14 = new java.lang.StringBuffer(((java.lang.String)v13));
    Object v15 = ((org.apache.commons.lang.time.FastDateFormat)v6).applyRules(((java.util.Calendar)v12),((java.lang.StringBuffer)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = " 0 days";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "Sc*ron";
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v8).getLocale();
    Object v14 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
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
    Object v4 = "Scaro";
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
    Object v2 = " 0 days";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "Sc*ron";
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v8).getLocale();
    Object v14 = ((java.util.Locale)v13).getUnicodeLocaleAttributes();
    Object v15 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v13));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = " 0 days";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "";
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v8).getLocale();
    Object v14 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((java.text.Format)v6).clone();
    Object v8 = ((java.text.Format)v7).clone();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((java.text.Format)v6).clone();
    Object v8 = ((java.text.Format)v7).clone();
    Object v9 = ((org.apache.commons.lang.time.FastDateFormat)v8).hashCode();
    Object v10 = ((org.apache.commons.lang.time.FastDateFormat)v8).getTimeZoneOverridesCalendar();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = org.apache.commons.lang.time.FastDateFormat.getInstance();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang.time.FastDateFormat)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(-339097518), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((java.text.Format)v6).clone();
    Object v8 = ((java.text.Format)v7).clone();
    Object v9 = "95/3";
    Object v10 = ((java.text.Format)v8).parseObject(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "231";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = " 0 days";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "Sc*ron";
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
    Object v0 = "231";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = " 0 days";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "Sc*ron";
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
    Object v3 = " 0 days";
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = "]";
    Object v6 = "u";
    Object v7 = "Scaro";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v3),((java.util.TimeZone)v4),((java.util.Locale)v8));
    Object v10 = "Sc*ron";
    Object v11 = 11;
    Object v12 = new java.text.ParsePosition((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v9).parseObject(((java.lang.String)v10),((java.text.ParsePosition)v12));
    Object v14 = ((org.apache.commons.lang.time.FastDateFormat)v9).getLocale();
    Object v15 = ((java.util.TimeZone)v2).getDisplayName(((java.util.Locale)v14));
    Object v16 = " 0 days";
    Object v17 = java.util.TimeZone.getDefault();
    Object v18 = "]";
    Object v19 = "u";
    Object v20 = "Scaro";
    Object v21 = new java.util.Locale(((java.lang.String)v18),((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v16),((java.util.TimeZone)v17),((java.util.Locale)v21));
    Object v23 = "Sc*ron";
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
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((java.text.Format)v6).clone();
    Object v8 = " 0 days";
    Object v9 = java.util.TimeZone.getDefault();
    Object v10 = "]";
    Object v11 = "u";
    Object v12 = "Scaro";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v8),((java.util.TimeZone)v9),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.lang.time.FastDateFormat)v7).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = true;
    Object v2 = 18;
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "Scaro";
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
    Object v2 = " 0 days";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "Sc*ron";
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
    try {
    Object v0 = "curre/n";
    Object v1 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = false;
    Object v2 = 48;
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "Scaro";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).getDisplayVariant();
    Object v8 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(((java.util.TimeZone)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((java.util.Locale)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "6";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = " 0 days";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "";
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v8).getLocale();
    Object v14 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "231";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = " 0 days";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "Sc*ron";
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v8).getLocale();
    Object v14 = ((java.util.Locale)v13).getUnicodeLocaleAttributes();
    Object v15 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v13));
    Object v16 = 0;
    Object v17 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v16).intValue()));
    Object v18 = "933";
    Object v19 = new java.lang.StringBuffer(((java.lang.String)v18));
    Object v20 = ((org.apache.commons.lang.time.FastDateFormat)v17).equals(((java.lang.Object)v19));
    Object v21 = "933";
    Object v22 = new java.lang.StringBuffer(((java.lang.String)v21));
    Object v23 = 2;
    Object v24 = new java.text.FieldPosition((((java.lang.Integer)v23).intValue()));
    Object v25 = ((org.apache.commons.lang.time.FastDateFormat)v15).format(((java.lang.Object)v20),((java.lang.StringBuffer)v22),((java.text.FieldPosition)v24));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = "8";
    Object v8 = new int[]{6,-14};
    Object v9 = ((org.apache.commons.lang.time.FastDateFormat)v6).parseToken(((java.lang.String)v7),((int[])v8));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = 27;
    Object v1 = 1;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = " 0 days";
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = "]";
    Object v6 = "u";
    Object v7 = "Scaro";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v3),((java.util.TimeZone)v4),((java.util.Locale)v8));
    Object v10 = "Sc*ron";
    Object v11 = 11;
    Object v12 = new java.text.ParsePosition((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v9).parseObject(((java.lang.String)v10),((java.text.ParsePosition)v12));
    Object v14 = ((org.apache.commons.lang.time.FastDateFormat)v9).getLocale();
    Object v15 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "The Array must not be null";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = false;
    Object v3 = 0;
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((java.util.TimeZone)v1).getDisplayName((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v7));
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "Scaro";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v12));
    Object v14 = " 0 days";
    Object v15 = java.util.TimeZone.getDefault();
    Object v16 = "]";
    Object v17 = "u";
    Object v18 = "Scaro";
    Object v19 = new java.util.Locale(((java.lang.String)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v14),((java.util.TimeZone)v15),((java.util.Locale)v19));
    Object v21 = ((java.text.Format)v20).clone();
    Object v22 = " 0 days";
    Object v23 = java.util.TimeZone.getDefault();
    Object v24 = "]";
    Object v25 = "u";
    Object v26 = "Scaro";
    Object v27 = new java.util.Locale(((java.lang.String)v24),((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v22),((java.util.TimeZone)v23),((java.util.Locale)v27));
    Object v29 = ((org.apache.commons.lang.time.FastDateFormat)v21).equals(((java.lang.Object)v28));
    Object v30 = ((org.apache.commons.lang.time.FastDateFormat)v13).equals(((java.lang.Object)v29));
    org.junit.Assert.assertEquals((Object)(false), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "6";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = " 0 days";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "";
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v8).getLocale();
    Object v14 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v13));
    Object v15 = 11;
    Object v16 = new java.text.ParsePosition((((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.apache.commons.lang.time.FastDateFormat)v14).equals(((java.lang.Object)v16));
    Object v18 = java.util.TimeZone.getDefault();
    Object v19 = "]";
    Object v20 = "u";
    Object v21 = "Scaro";
    Object v22 = new java.util.Locale(((java.lang.String)v19),((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = java.util.Calendar.getInstance(((java.util.TimeZone)v18),((java.util.Locale)v22));
    Object v24 = ((org.apache.commons.lang.time.FastDateFormat)v14).format(((java.util.Calendar)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = -6;
    Object v1 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((java.text.Format)v6).clone();
    Object v8 = ((java.text.Format)v7).clone();
    Object v9 = ((org.apache.commons.lang.time.FastDateFormat)v8).hashCode();
    Object v10 = "";
    Object v11 = new int[]{};
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v8).parseToken(((java.lang.String)v10),((int[])v11));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "231";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = " 0 days";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "Sc*ron";
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v8).getLocale();
    Object v14 = ((java.util.Locale)v13).getUnicodeLocaleAttributes();
    Object v15 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v13));
    Object v16 = 1;
    Object v17 = java.util.TimeZone.getDefault();
    Object v18 = "]";
    Object v19 = "u";
    Object v20 = "Scaro";
    Object v21 = new java.util.Locale(((java.lang.String)v18),((java.lang.String)v19),((java.lang.String)v20));
    Object v22 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v16).intValue()),((java.util.TimeZone)v17),((java.util.Locale)v21));
    Object v23 = ((java.text.Format)v15).formatToCharacterIterator(((java.lang.Object)v22));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "The maximum value must not be null";
    Object v1 = " 0 days";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "Scaro";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = "Sc*ron";
    Object v9 = 11;
    Object v10 = new java.text.ParsePosition((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang.time.FastDateFormat)v7).parseObject(((java.lang.String)v8),((java.text.ParsePosition)v10));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v7).getLocale();
    Object v13 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.Locale)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "19T";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "oline";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = " 0 days";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "";
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v8).getLocale();
    Object v14 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "The numbers must not be N]aN";
    Object v1 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = 26L;
    Object v8 = ((org.apache.commons.lang.time.FastDateFormat)v6).format((((java.lang.Long)v7).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = " 0 days";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "";
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v8).getLocale();
    Object v14 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v13));
    Object v15 = " 0 days";
    Object v16 = java.util.TimeZone.getDefault();
    Object v17 = "]";
    Object v18 = "u";
    Object v19 = "Scaro";
    Object v20 = new java.util.Locale(((java.lang.String)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v15),((java.util.TimeZone)v16),((java.util.Locale)v20));
    Object v22 = ((org.apache.commons.lang.time.FastDateFormat)v14).equals(((java.lang.Object)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = " 0 days";
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "Scaro";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v7),((java.util.TimeZone)v8),((java.util.Locale)v12));
    Object v14 = ((java.text.Format)v13).clone();
    Object v15 = ((java.text.Format)v14).clone();
    Object v16 = ((java.text.Format)v6).formatToCharacterIterator(((java.lang.Object)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 0;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "231";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = " 0 days";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "Sc*ron";
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v8).getLocale();
    Object v14 = ((java.util.Locale)v13).getUnicodeLocaleAttributes();
    Object v15 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v13));
    Object v16 = new java.util.Date();
    Object v17 = ((org.apache.commons.lang.time.FastDateFormat)v15).format(((java.util.Date)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "The Array must not be null";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = false;
    Object v3 = 0;
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((java.util.TimeZone)v1).getDisplayName((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v7));
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = "Scaro";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v12));
    ((org.apache.commons.lang.time.FastDateFormat)v13).init();
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 0;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = org.apache.commons.lang.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "Scaro";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 0;
    Object v1 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((java.text.Format)v6).clone();
    Object v8 = new java.util.Date();
    Object v9 = ((org.apache.commons.lang.time.FastDateFormat)v7).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((java.text.Format)v6).clone();
    Object v8 = ((java.text.Format)v7).clone();
    Object v9 = java.util.TimeZone.getDefault();
    Object v10 = "]";
    Object v11 = "u";
    Object v12 = "Scaro";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = java.util.Calendar.getInstance(((java.util.TimeZone)v9),((java.util.Locale)v13));
    Object v15 = "933";
    Object v16 = new java.lang.StringBuffer(((java.lang.String)v15));
    Object v17 = 0;
    Object v18 = "933";
    Object v19 = new java.lang.StringBuffer(((java.lang.String)v18));
    Object v20 = ((java.lang.StringBuffer)v16).insert((((java.lang.Integer)v17).intValue()),((java.lang.Object)v19));
    Object v21 = ((org.apache.commons.lang.time.FastDateFormat)v8).format(((java.util.Calendar)v14),((java.lang.StringBuffer)v16));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = 49;
    Object v1 = 0;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = " 0 days";
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = "]";
    Object v6 = "u";
    Object v7 = "Scaro";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v3),((java.util.TimeZone)v4),((java.util.Locale)v8));
    Object v10 = "";
    Object v11 = 11;
    Object v12 = new java.text.ParsePosition((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v9).parseObject(((java.lang.String)v10),((java.text.ParsePosition)v12));
    Object v14 = ((org.apache.commons.lang.time.FastDateFormat)v9).getLocale();
    Object v15 = " 0 days";
    Object v16 = java.util.TimeZone.getDefault();
    Object v17 = "]";
    Object v18 = "u";
    Object v19 = "Scaro";
    Object v20 = new java.util.Locale(((java.lang.String)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v15),((java.util.TimeZone)v16),((java.util.Locale)v20));
    Object v22 = "Sc*ron";
    Object v23 = 11;
    Object v24 = new java.text.ParsePosition((((java.lang.Integer)v23).intValue()));
    Object v25 = ((org.apache.commons.lang.time.FastDateFormat)v21).parseObject(((java.lang.String)v22),((java.text.ParsePosition)v24));
    Object v26 = ((org.apache.commons.lang.time.FastDateFormat)v21).getLocale();
    Object v27 = ((java.util.Locale)v14).getDisplayVariant(((java.util.Locale)v26));
    Object v28 = org.apache.commons.lang.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "1.";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 0;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "[]";
    ((java.util.TimeZone)v1).setID(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = " 0 days";
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = "]";
    Object v7 = "u";
    Object v8 = "Scaro";
    Object v9 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v4),((java.util.TimeZone)v5),((java.util.Locale)v9));
    Object v11 = "Sc*ron";
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
    Object v0 = "oline";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = " 0 days";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "";
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v8).getLocale();
    Object v14 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v13));
    Object v15 = "";
    Object v16 = new int[]{};
    Object v17 = ((org.apache.commons.lang.time.FastDateFormat)v14).parseToken(((java.lang.String)v15),((int[])v16));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "oline";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = " 0 days";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "";
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v8).getLocale();
    Object v14 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.lang.time.FastDateFormat)v14).getTimeZone();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = 9;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = " 0 days";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "Sc*ron";
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v8).getLocale();
    Object v14 = org.apache.commons.lang.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((java.text.Format)v6).clone();
    Object v8 = ((java.text.Format)v7).clone();
    Object v9 = ((org.apache.commons.lang.time.FastDateFormat)v8).hashCode();
    org.junit.Assert.assertEquals((Object)(-339097518), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "oline";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = " 0 days";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = "Scaro";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = "";
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = ((org.apache.commons.lang.time.FastDateFormat)v8).getLocale();
    Object v14 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.lang.time.FastDateFormat)v14).getTimeZone();
    Object v16 = 20;
    ((java.util.TimeZone)v15).setRawOffset((((java.lang.Integer)v16).intValue()));
    Object v17 = null;
    Object v18 = true;
    Object v19 = -12;
    Object v20 = " 0 days";
    Object v21 = java.util.TimeZone.getDefault();
    Object v22 = "]";
    Object v23 = "u";
    Object v24 = "Scaro";
    Object v25 = new java.util.Locale(((java.lang.String)v22),((java.lang.String)v23),((java.lang.String)v24));
    Object v26 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v20),((java.util.TimeZone)v21),((java.util.Locale)v25));
    Object v27 = "Sc*ron";
    Object v28 = 11;
    Object v29 = new java.text.ParsePosition((((java.lang.Integer)v28).intValue()));
    Object v30 = ((org.apache.commons.lang.time.FastDateFormat)v26).parseObject(((java.lang.String)v27),((java.text.ParsePosition)v29));
    Object v31 = ((org.apache.commons.lang.time.FastDateFormat)v26).getLocale();
    Object v32 = org.apache.commons.lang.time.FastDateFormat.getTimeZoneDisplay(((java.util.TimeZone)v15),(((java.lang.Boolean)v18).booleanValue()),(((java.lang.Integer)v19).intValue()),((java.util.Locale)v31));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "`";
    Object v1 = " 0 days";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = "Scaro";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = "Sc*ron";
    Object v9 = 11;
    Object v10 = new java.text.ParsePosition((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang.time.FastDateFormat)v7).parseObject(((java.lang.String)v8),((java.text.ParsePosition)v10));
    Object v12 = ((org.apache.commons.lang.time.FastDateFormat)v7).getLocale();
    Object v13 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.Locale)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "1.";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = org.apache.commons.lang.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1));
    Object v3 = ((org.apache.commons.lang.time.FastDateFormat)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(-67189758), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = " 0 days";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = "Scaro";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((java.text.Format)v6).clone();
    Object v8 = ((java.text.Format)v7).clone();
    Object v9 = 26L;
    Object v10 = "933";
    Object v11 = new java.lang.StringBuffer(((java.lang.String)v10));
    Object v12 = 1;
    Object v13 = -32L;
    Object v14 = ((java.lang.StringBuffer)v11).insert((((java.lang.Integer)v12).intValue()),(((java.lang.Long)v13).longValue()));
    Object v15 = ((org.apache.commons.lang.time.FastDateFormat)v8).format((((java.lang.Long)v9).longValue()),((java.lang.StringBuffer)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
