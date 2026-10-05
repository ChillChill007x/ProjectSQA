package org.apache.commons.lang3.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = true;
    Object v2 = -11;
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = ":";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(((java.util.TimeZone)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((java.util.Locale)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "i";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = ((java.util.TimeZone)v1).useDaylightTime();
    Object v3 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = 48;
    Object v1 = -25;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2));
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
    Object v6 = ":";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(((java.util.TimeZone)v0),(((java.lang.Boolean)v2).booleanValue()),(((java.lang.Integer)v3).intValue()),((java.util.Locale)v7));
    org.junit.Assert.assertEquals((Object)("Pacific Daylight Time"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 1;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = ":";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateFormat)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(717340688), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 1;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = ":";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = 11;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v5).parseObject(((java.lang.String)v6),((java.text.ParsePosition)v8));
    ((org.apache.commons.lang3.time.FastDateFormat)v5).init();
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = ":";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = new int[]{0,21};
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v5).parseToken(((java.lang.String)v6),((int[])v7));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "os.4rch";
    ((java.util.TimeZone)v2).setID(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = "]";
    Object v6 = "u";
    Object v7 = ":";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "os.4rch";
    ((java.util.TimeZone)v2).setID(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = "]";
    Object v6 = "u";
    Object v7 = ":";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v8));
    Object v10 = -16L;
    Object v11 = 1;
    Object v12 = new java.lang.StringBuffer((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.lang3.time.FastDateFormat)v9).format((((java.lang.Long)v10).longValue()),((java.lang.StringBuffer)v12));
    Object v14 = java.util.TimeZone.getDefault();
    Object v15 = "]";
    Object v16 = "u";
    Object v17 = ":";
    Object v18 = new java.util.Locale(((java.lang.String)v15),((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = java.util.Calendar.getInstance(((java.util.TimeZone)v14),((java.util.Locale)v18));
    Object v20 = 1;
    Object v21 = new java.lang.StringBuffer((((java.lang.Integer)v20).intValue()));
    Object v22 = 1;
    Object v23 = new java.lang.StringBuffer((((java.lang.Integer)v22).intValue()));
    Object v24 = ((java.lang.StringBuffer)v21).append(((java.lang.StringBuffer)v23));
    Object v25 = ((org.apache.commons.lang3.time.FastDateFormat)v9).applyRules(((java.util.Calendar)v19),((java.lang.StringBuffer)v21));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 1;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = ":";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v6 = java.util.TimeZone.getDefault();
    Object v7 = "]";
    Object v8 = "u";
    Object v9 = ":";
    Object v10 = new java.util.Locale(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = java.util.Calendar.getInstance(((java.util.TimeZone)v6),((java.util.Locale)v10));
    Object v12 = 1;
    Object v13 = new java.lang.StringBuffer((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.lang3.time.FastDateFormat)v5).applyRules(((java.util.Calendar)v11),((java.lang.StringBuffer)v13));
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
    Object v5 = ":";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((java.util.Locale)v6).getDisplayName();
    Object v8 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = ":";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v6 = new java.util.Date();
    Object v7 = 1;
    Object v8 = new java.lang.StringBuffer((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v5).format(((java.util.Date)v6),((java.lang.StringBuffer)v8));
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = 1;
    Object v13 = "]";
    Object v14 = "u";
    Object v15 = ":";
    Object v16 = new java.util.Locale(((java.lang.String)v13),((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v12).intValue()),((java.util.Locale)v16));
    Object v18 = java.util.TimeZone.getDefault();
    Object v19 = "]";
    Object v20 = "u";
    Object v21 = ":";
    Object v22 = new java.util.Locale(((java.lang.String)v19),((java.lang.String)v20),((java.lang.String)v21));
    Object v23 = java.util.Calendar.getInstance(((java.util.TimeZone)v18),((java.util.Locale)v22));
    Object v24 = 1;
    Object v25 = new java.lang.StringBuffer((((java.lang.Integer)v24).intValue()));
    Object v26 = ((org.apache.commons.lang3.time.FastDateFormat)v17).applyRules(((java.util.Calendar)v23),((java.lang.StringBuffer)v25));
    Object v27 = 23;
    Object v28 = new java.text.FieldPosition((((java.lang.Integer)v27).intValue()));
    Object v29 = ((org.apache.commons.lang3.time.FastDateFormat)v5).format(((java.lang.Object)v11),((java.lang.StringBuffer)v26),((java.text.FieldPosition)v28));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "os.4rch";
    ((java.util.TimeZone)v2).setID(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = "]";
    Object v6 = "u";
    Object v7 = ":";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v8));
    Object v10 = new java.util.Date();
    Object v11 = ((org.apache.commons.lang3.time.FastDateFormat)v9).equals(((java.lang.Object)v10));
    Object v12 = 23;
    Object v13 = new java.text.FieldPosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.lang3.time.FastDateFormat)v9).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "os.4rch";
    ((java.util.TimeZone)v2).setID(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = "]";
    Object v6 = "u";
    Object v7 = ":";
    Object v8 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v8));
    Object v10 = ((org.apache.commons.lang3.time.FastDateFormat)v9).parsePattern();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = -23;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).hashCode();
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = 9;
    Object v1 = -31;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = ":";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v2),((java.util.Locale)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).parsePattern();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = "m'\"";
    Object v8 = ((java.text.Format)v6).parseObject(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).getPattern();
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = -25;
    Object v2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = 49;
    ((java.util.TimeZone)v1).setRawOffset((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = ":";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = false;
    Object v2 = 1;
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = ":";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(((java.util.TimeZone)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((java.util.Locale)v6));
    org.junit.Assert.assertEquals((Object)("Pacific Standard Time"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = 11;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new java.lang.StringBuffer((((java.lang.Integer)v9).intValue()));
    Object v11 = 23;
    Object v12 = new java.text.FieldPosition((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.apache.commons.lang3.time.FastDateFormat)v6).format(((java.lang.Object)v8),((java.lang.StringBuffer)v10),((java.text.FieldPosition)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "Xdeg;";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).toString();
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    ((org.apache.commons.lang3.time.FastDateFormat)v6).init();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = 49;
    ((java.util.TimeZone)v1).setRawOffset((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = ":";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v7));
    Object v9 = "";
    Object v10 = 11;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang3.time.FastDateFormat)v8).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    Object v13 = java.util.TimeZone.getDefault();
    Object v14 = "]";
    Object v15 = "u";
    Object v16 = ":";
    Object v17 = new java.util.Locale(((java.lang.String)v14),((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = java.util.Calendar.getInstance(((java.util.TimeZone)v13),((java.util.Locale)v17));
    Object v19 = ((java.util.Calendar)v18).getWeeksInWeekYear();
    Object v20 = 1;
    Object v21 = new java.lang.StringBuffer((((java.lang.Integer)v20).intValue()));
    Object v22 = ((org.apache.commons.lang3.time.FastDateFormat)v8).format(((java.util.Calendar)v18),((java.lang.StringBuffer)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).clone();
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "&upsilon;";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = java.util.TimeZone.getDefault();
    Object v1 = true;
    Object v2 = -2;
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = ":";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(((java.util.TimeZone)v0),(((java.lang.Boolean)v1).booleanValue()),(((java.lang.Integer)v2).intValue()),((java.util.Locale)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "F";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "F";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = "The Array must not be null";
    Object v8 = 11;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang3.time.FastDateFormat)v6).parseObject(((java.lang.String)v7),((java.text.ParsePosition)v9));
    Object v11 = new java.util.Date();
    Object v12 = ((org.apache.commons.lang3.time.FastDateFormat)v6).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "F";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(-160970627), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = org.apache.commons.lang3.time.FastDateFormat.getInstance();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).clone();
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = "]";
    Object v10 = "u";
    Object v11 = ":";
    Object v12 = new java.util.Locale(((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = java.util.Calendar.getInstance(((java.util.TimeZone)v8),((java.util.Locale)v12));
    Object v14 = 1;
    Object v15 = "]";
    Object v16 = "u";
    Object v17 = ":";
    Object v18 = new java.util.Locale(((java.lang.String)v15),((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v14).intValue()),((java.util.Locale)v18));
    Object v20 = java.util.TimeZone.getDefault();
    Object v21 = "]";
    Object v22 = "u";
    Object v23 = ":";
    Object v24 = new java.util.Locale(((java.lang.String)v21),((java.lang.String)v22),((java.lang.String)v23));
    Object v25 = java.util.Calendar.getInstance(((java.util.TimeZone)v20),((java.util.Locale)v24));
    Object v26 = 1;
    Object v27 = new java.lang.StringBuffer((((java.lang.Integer)v26).intValue()));
    Object v28 = ((org.apache.commons.lang3.time.FastDateFormat)v19).applyRules(((java.util.Calendar)v25),((java.lang.StringBuffer)v27));
    Object v29 = "f";
    Object v30 = 2;
    Object v31 = ((java.lang.StringBuffer)v28).indexOf(((java.lang.String)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((org.apache.commons.lang3.time.FastDateFormat)v7).applyRules(((java.util.Calendar)v13),((java.lang.StringBuffer)v28));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "F";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).getTimeZoneOverridesCalendar();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 2;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = 0;
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.Locale)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "F";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = "&divide";
    Object v8 = 11;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang3.time.FastDateFormat)v6).parseObject(((java.lang.String)v7),((java.text.ParsePosition)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "F";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = "]";
    Object v9 = "u";
    Object v10 = ":";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = java.util.Calendar.getInstance(((java.util.TimeZone)v7),((java.util.Locale)v11));
    Object v13 = 1;
    Object v14 = "]";
    Object v15 = "u";
    Object v16 = ":";
    Object v17 = new java.util.Locale(((java.lang.String)v14),((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v13).intValue()),((java.util.Locale)v17));
    Object v19 = java.util.TimeZone.getDefault();
    Object v20 = "]";
    Object v21 = "u";
    Object v22 = ":";
    Object v23 = new java.util.Locale(((java.lang.String)v20),((java.lang.String)v21),((java.lang.String)v22));
    Object v24 = java.util.Calendar.getInstance(((java.util.TimeZone)v19),((java.util.Locale)v23));
    Object v25 = 1;
    Object v26 = new java.lang.StringBuffer((((java.lang.Integer)v25).intValue()));
    Object v27 = ((org.apache.commons.lang3.time.FastDateFormat)v18).applyRules(((java.util.Calendar)v24),((java.lang.StringBuffer)v26));
    Object v28 = ((org.apache.commons.lang3.time.FastDateFormat)v6).format(((java.util.Calendar)v12),((java.lang.StringBuffer)v27));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 2;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = new java.util.Date();
    Object v8 = 1;
    Object v9 = new java.lang.StringBuffer((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang3.time.FastDateFormat)v6).format(((java.util.Date)v7),((java.lang.StringBuffer)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = "";
    Object v8 = new int[]{0,0,0};
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v6).parseToken(((java.lang.String)v7),((int[])v8));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "F";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = "";
    Object v8 = ((java.text.Format)v6).parseObject(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 0;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 2;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = 33L;
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v6).format((((java.lang.Long)v7).longValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(842405249), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 2;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(842405249), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).toString();
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).toString();
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v8 = 0L;
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v7).format((((java.lang.Long)v8).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "F";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).hashCode();
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v6).getTimeZone();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 2;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((java.text.Format)v6).clone();
    ((org.apache.commons.lang3.time.FastDateFormat)v6).init();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 1;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = ":";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((java.util.Locale)v4).getDisplayScript();
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 1;
    Object v1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = ":";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((java.util.Locale)v4).getDisplayScript();
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v7 = ((java.text.Format)v6).clone();
    Object v8 = "";
    Object v9 = ((java.text.Format)v6).parseObject(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 1;
    Object v1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()));
    ((org.apache.commons.lang3.time.FastDateFormat)v1).init();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 1;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = ":";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((java.util.Locale)v4).getDisplayScript();
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).getMaxLengthEstimate();
    org.junit.Assert.assertEquals((Object)(13), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = " ";
    Object v1 = "F";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = ":";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).hashCode();
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v10 = "]";
    Object v11 = "u";
    Object v12 = ":";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((java.util.Locale)v13).getUnicodeLocaleAttributes();
    Object v15 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v9),((java.util.Locale)v13));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = -14;
    Object v1 = 25;
    Object v2 = "F";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = ":";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v8).hashCode();
    Object v10 = ((org.apache.commons.lang3.time.FastDateFormat)v8).getTimeZone();
    Object v11 = "]";
    Object v12 = "u";
    Object v13 = ":";
    Object v14 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((java.util.TimeZone)v10).getDisplayName(((java.util.Locale)v14));
    Object v16 = "]";
    Object v17 = "u";
    Object v18 = ":";
    Object v19 = new java.util.Locale(((java.lang.String)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v10),((java.util.Locale)v19));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).toString();
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v8 = 18L;
    Object v9 = 1;
    Object v10 = new java.lang.StringBuffer((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.lang3.time.FastDateFormat)v7).format((((java.lang.Long)v8).longValue()),((java.lang.StringBuffer)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = 86;
    Object v1 = "F";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = ":";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).hashCode();
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v10 = "]";
    Object v11 = "u";
    Object v12 = ":";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v9),((java.util.Locale)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = 1;
    Object v8 = "]";
    Object v9 = "u";
    Object v10 = ":";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((java.util.Locale)v11).getDisplayScript();
    Object v13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v7).intValue()),((java.util.Locale)v11));
    Object v14 = ((java.text.Format)v6).format(((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = 1;
    Object v8 = "]";
    Object v9 = "u";
    Object v10 = ":";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((java.util.Locale)v11).getDisplayScript();
    Object v13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v7).intValue()),((java.util.Locale)v11));
    Object v14 = ((org.apache.commons.lang3.time.FastDateFormat)v13).getMaxLengthEstimate();
    Object v15 = ((org.apache.commons.lang3.time.FastDateFormat)v6).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "";
    Object v1 = "F";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = ":";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).hashCode();
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v10 = "]";
    Object v11 = "u";
    Object v12 = ":";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v9),((java.util.Locale)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "F";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).hashCode();
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v6).getTimeZone();
    Object v9 = false;
    Object v10 = 1;
    Object v11 = "]";
    Object v12 = "u";
    Object v13 = ":";
    Object v14 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(((java.util.TimeZone)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Integer)v10).intValue()),((java.util.Locale)v14));
    org.junit.Assert.assertEquals((Object)("Pacific Standard Time"), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "&macr;";
    Object v1 = "F";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = ":";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).hashCode();
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v10 = new java.util.Date();
    Object v11 = ((java.util.TimeZone)v9).inDaylightTime(((java.util.Date)v10));
    Object v12 = "]";
    Object v13 = "u";
    Object v14 = ":";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "]";
    Object v17 = "u";
    Object v18 = ":";
    Object v19 = new java.util.Locale(((java.lang.String)v16),((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = ((java.util.Locale)v15).getDisplayName(((java.util.Locale)v19));
    Object v21 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v9),((java.util.Locale)v15));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "F";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).getPattern();
    org.junit.Assert.assertEquals((Object)("F"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "&Qacute;";
    Object v1 = "F";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = ":";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).hashCode();
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v10 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = -10;
    Object v1 = 1;
    Object v2 = "F";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = ":";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v8).hashCode();
    Object v10 = ((org.apache.commons.lang3.time.FastDateFormat)v8).getTimeZone();
    Object v11 = "]";
    Object v12 = "u";
    Object v13 = ":";
    Object v14 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v10),((java.util.Locale)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 1;
    Object v1 = 0;
    Object v2 = "F";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = ":";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v8).hashCode();
    Object v10 = ((org.apache.commons.lang3.time.FastDateFormat)v8).getTimeZone();
    Object v11 = ((java.util.TimeZone)v10).getDSTSavings();
    Object v12 = "]";
    Object v13 = "u";
    Object v14 = ":";
    Object v15 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v10),((java.util.Locale)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 1;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).clone();
    Object v7 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).toString();
    org.junit.Assert.assertEquals((Object)("FastDateFormat[y MMMM d]"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "F";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).hashCode();
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v6).getTimeZone();
    Object v9 = false;
    Object v10 = -3;
    Object v11 = "]";
    Object v12 = "u";
    Object v13 = ":";
    Object v14 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = org.apache.commons.lang3.time.FastDateFormat.getTimeZoneDisplay(((java.util.TimeZone)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Integer)v10).intValue()),((java.util.Locale)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "";
    Object v1 = "F";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = ":";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).hashCode();
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v10 = "]";
    Object v11 = "u";
    Object v12 = ":";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v9),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.lang3.time.FastDateFormat)v14).parsePattern();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "F";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((java.text.Format)v6).clone();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = 67;
    Object v1 = "F";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = ":";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).hashCode();
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v10 = ((java.util.TimeZone)v9).getRawOffset();
    Object v11 = "]";
    Object v12 = "u";
    Object v13 = ":";
    Object v14 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v9),((java.util.Locale)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 2;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).getTimeZoneOverridesCalendar();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "T";
    Object v1 = "F";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = ":";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).hashCode();
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v10 = "]";
    Object v11 = "u";
    Object v12 = ":";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v9),((java.util.Locale)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "user.country";
    Object v1 = "F";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = ":";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).hashCode();
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v10 = "]";
    Object v11 = "u";
    Object v12 = ":";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v9),((java.util.Locale)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "&su]m;";
    Object v1 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "F";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = -39L;
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v6).format((((java.lang.Long)v7).longValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).toString();
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v8 = new java.util.Date();
    Object v9 = ((java.util.Date)v8).toLocaleString();
    Object v10 = ((org.apache.commons.lang3.time.FastDateFormat)v7).format(((java.util.Date)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 2;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = "]";
    Object v9 = "u";
    Object v10 = ":";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = java.util.Calendar.getInstance(((java.util.TimeZone)v7),((java.util.Locale)v11));
    Object v13 = 1;
    Object v14 = new java.lang.StringBuffer((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.lang3.time.FastDateFormat)v6).format(((java.util.Calendar)v12),((java.lang.StringBuffer)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "F";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((java.text.Format)v6).clone();
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(-160970627), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).getMaxLengthEstimate();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "F";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).parsePattern();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 1;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = ":";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((java.util.Locale)v4).getDisplayScript();
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v7 = ((org.apache.commons.lang3.time.FastDateFormat)v6).parsePattern();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 0;
    Object v1 = "F";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = ":";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).hashCode();
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v10 = "]";
    Object v11 = "u";
    Object v12 = ":";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v9),((java.util.Locale)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = "";
    Object v8 = "F";
    Object v9 = java.util.TimeZone.getDefault();
    Object v10 = "]";
    Object v11 = "u";
    Object v12 = ":";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v8),((java.util.TimeZone)v9),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.lang3.time.FastDateFormat)v14).hashCode();
    Object v16 = ((org.apache.commons.lang3.time.FastDateFormat)v14).getTimeZone();
    Object v17 = "]";
    Object v18 = "u";
    Object v19 = ":";
    Object v20 = new java.util.Locale(((java.lang.String)v17),((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v7),((java.util.TimeZone)v16),((java.util.Locale)v20));
    Object v22 = ((org.apache.commons.lang3.time.FastDateFormat)v6).equals(((java.lang.Object)v21));
    Object v23 = 1;
    Object v24 = java.util.TimeZone.getDefault();
    Object v25 = "]";
    Object v26 = "u";
    Object v27 = ":";
    Object v28 = new java.util.Locale(((java.lang.String)v25),((java.lang.String)v26),((java.lang.String)v27));
    Object v29 = ((java.util.Locale)v28).clone();
    Object v30 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v23).intValue()),((java.util.TimeZone)v24),((java.util.Locale)v28));
    Object v31 = 1;
    Object v32 = new java.lang.StringBuffer((((java.lang.Integer)v31).intValue()));
    Object v33 = 1.0D;
    Object v34 = ((java.lang.StringBuffer)v32).append((((java.lang.Double)v33).doubleValue()));
    Object v35 = 23;
    Object v36 = new java.text.FieldPosition((((java.lang.Integer)v35).intValue()));
    Object v37 = ((org.apache.commons.lang3.time.FastDateFormat)v6).format(((java.lang.Object)v30),((java.lang.StringBuffer)v32),((java.text.FieldPosition)v36));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = -5;
    Object v1 = "F";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = ":";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).hashCode();
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v10 = "]";
    Object v11 = "u";
    Object v12 = ":";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v9),((java.util.Locale)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = ":";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((java.util.Locale)v4).getDisplayScript();
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v7 = 0L;
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v6).format((((java.lang.Long)v7).longValue()));
    Object v9 = "";
    Object v10 = new int[]{0,30};
    Object v11 = ((org.apache.commons.lang3.time.FastDateFormat)v6).parseToken(((java.lang.String)v9),((int[])v10));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "F";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = "Ar-ay cannot be empty.";
    Object v8 = ((java.text.Format)v6).parseObject(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "user.country";
    Object v1 = "F";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = ":";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).hashCode();
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v10 = "]";
    Object v11 = "u";
    Object v12 = ":";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v9),((java.util.Locale)v13));
    Object v15 = "?";
    Object v16 = 11;
    Object v17 = new java.text.ParsePosition((((java.lang.Integer)v16).intValue()));
    Object v18 = ((org.apache.commons.lang3.time.FastDateFormat)v14).parseObject(((java.lang.String)v15),((java.text.ParsePosition)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = 7;
    Object v1 = -102;
    Object v2 = "F";
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "]";
    Object v5 = "u";
    Object v6 = ":";
    Object v7 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v2),((java.util.TimeZone)v3),((java.util.Locale)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v8).hashCode();
    Object v10 = ((org.apache.commons.lang3.time.FastDateFormat)v8).getTimeZone();
    Object v11 = "]";
    Object v12 = "u";
    Object v13 = ":";
    Object v14 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),((java.util.TimeZone)v10),((java.util.Locale)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 2;
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v7 = new java.util.Date();
    Object v8 = 1;
    Object v9 = new java.lang.StringBuffer((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang3.time.FastDateFormat)v6).format(((java.util.Date)v7),((java.lang.StringBuffer)v9));
    Object v11 = ((org.apache.commons.lang3.time.FastDateFormat)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(842405249), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = 22;
    Object v1 = 2;
    Object v2 = org.apache.commons.lang3.time.FastDateFormat.getDateTimeInstance((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = "]";
    Object v2 = "u";
    Object v3 = ":";
    Object v4 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((java.util.Locale)v4).getDisplayScript();
    Object v6 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v0).intValue()),((java.util.Locale)v4));
    Object v7 = 1;
    Object v8 = "]";
    Object v9 = "u";
    Object v10 = ":";
    Object v11 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((java.util.Locale)v11).getDisplayScript();
    Object v13 = org.apache.commons.lang3.time.FastDateFormat.getTimeInstance((((java.lang.Integer)v7).intValue()),((java.util.Locale)v11));
    Object v14 = ((org.apache.commons.lang3.time.FastDateFormat)v13).getMaxLengthEstimate();
    Object v15 = 1;
    Object v16 = new java.lang.StringBuffer((((java.lang.Integer)v15).intValue()));
    Object v17 = 23;
    Object v18 = new java.text.FieldPosition((((java.lang.Integer)v17).intValue()));
    Object v19 = ((java.text.FieldPosition)v18).toString();
    Object v20 = ((org.apache.commons.lang3.time.FastDateFormat)v6).format(((java.lang.Object)v14),((java.lang.StringBuffer)v16),((java.text.FieldPosition)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).toString();
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    ((org.apache.commons.lang3.time.FastDateFormat)v7).init();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "";
    Object v1 = "F";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = ":";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).hashCode();
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v10 = "]";
    Object v11 = "u";
    Object v12 = ":";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.lang3.time.FastDateFormat.getInstance(((java.lang.String)v0),((java.util.TimeZone)v9),((java.util.Locale)v13));
    ((org.apache.commons.lang3.time.FastDateFormat)v14).init();
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 1;
    Object v1 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.lang3.time.FastDateFormat)v1).getTimeZone();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = "F";
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = "]";
    Object v4 = "u";
    Object v5 = ":";
    Object v6 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v1),((java.util.TimeZone)v2),((java.util.Locale)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateFormat)v7).hashCode();
    Object v9 = ((org.apache.commons.lang3.time.FastDateFormat)v7).getTimeZone();
    Object v10 = "]";
    Object v11 = "u";
    Object v12 = ":";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.lang3.time.FastDateFormat.getDateInstance((((java.lang.Integer)v0).intValue()),((java.util.TimeZone)v9),((java.util.Locale)v13));
    Object v15 = "";
    Object v16 = ((java.text.Format)v14).parseObject(((java.lang.String)v15));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = "]";
    Object v3 = "u";
    Object v4 = ":";
    Object v5 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).toString();
    Object v7 = new org.apache.commons.lang3.time.FastDateFormat(((java.lang.String)v0),((java.util.TimeZone)v1),((java.util.Locale)v5));
    Object v8 = ((java.text.Format)v7).clone();
    Object v9 = java.util.TimeZone.getDefault();
    Object v10 = "]";
    Object v11 = "u";
    Object v12 = ":";
    Object v13 = new java.util.Locale(((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = java.util.Calendar.getInstance(((java.util.TimeZone)v9),((java.util.Locale)v13));
    Object v15 = ((org.apache.commons.lang3.time.FastDateFormat)v7).format(((java.util.Calendar)v14));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
