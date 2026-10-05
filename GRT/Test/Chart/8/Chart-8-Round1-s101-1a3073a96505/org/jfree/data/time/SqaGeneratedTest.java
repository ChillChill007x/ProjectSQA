package org.jfree.data.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = "SansSerif";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = new org.jfree.data.time.Week(((java.util.Date)v3),((java.util.TimeZone)v4),((java.util.Locale)v6));
    Object v8 = "SansSerif";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = ((org.jfree.data.time.Week)v7).compareTo(((java.lang.Object)v9));
    Object v11 = ((org.jfree.data.time.Week)v7).next();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = "SansSerif";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = new org.jfree.data.time.Week(((java.util.Date)v3),((java.util.TimeZone)v4),((java.util.Locale)v6));
    Object v8 = "SansSerif";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = ((org.jfree.data.time.Week)v7).compareTo(((java.lang.Object)v9));
    Object v11 = ((org.jfree.data.time.Week)v7).next();
    Object v12 = ((org.jfree.data.time.Week)v11).previous();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = "SansSerif";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = new org.jfree.data.time.Week(((java.util.Date)v3),((java.util.TimeZone)v4),((java.util.Locale)v6));
    Object v8 = "SansSerif";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = ((org.jfree.data.time.Week)v7).compareTo(((java.lang.Object)v9));
    Object v11 = ((org.jfree.data.time.Week)v7).next();
    Object v12 = ((org.jfree.data.time.Week)v11).previous();
    Object v13 = ((org.jfree.data.time.Week)v12).next();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 5;
    Object v1 = -42;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = "SansSerif";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = new org.jfree.data.time.Week(((java.util.Date)v3),((java.util.TimeZone)v4),((java.util.Locale)v6));
    Object v8 = "SansSerif";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = ((org.jfree.data.time.Week)v7).compareTo(((java.lang.Object)v9));
    Object v11 = ((org.jfree.data.time.Week)v7).next();
    Object v12 = java.util.TimeZone.getDefault();
    Object v13 = "SansSerif";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = java.util.Calendar.getInstance(((java.util.TimeZone)v12),((java.util.Locale)v14));
    Object v16 = ((org.jfree.data.time.Week)v11).getLastMillisecond(((java.util.Calendar)v15));
    Object v17 = java.lang.ClassLoader.getSystemClassLoader();
    Object v18 = ((org.jfree.data.time.Week)v11).equals(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 0;
    Object v1 = -38;
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = new org.jfree.data.time.Year(((java.util.Date)v4),((java.util.TimeZone)v5));
    Object v7 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Year)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 0;
    Object v1 = -38;
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = new org.jfree.data.time.Year(((java.util.Date)v4),((java.util.TimeZone)v5));
    Object v7 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Year)v6));
    Object v8 = ((org.jfree.data.time.Week)v7).getLastMillisecond();
    org.junit.Assert.assertEquals((Object)(-3408364800001L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 5;
    Object v1 = -42;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.RegularTimePeriod)v2).getEnd();
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = "SansSerif";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = java.util.Calendar.getInstance(((java.util.TimeZone)v4),((java.util.Locale)v6));
    Object v8 = ((org.jfree.data.time.Week)v2).getFirstMillisecond(((java.util.Calendar)v7));
    org.junit.Assert.assertEquals((Object)(-63490406400000L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = true;
    Object v6 = 1;
    Object v7 = "SansSerif";
    Object v8 = java.util.Locale.forLanguageTag(((java.lang.String)v7));
    Object v9 = ((java.util.TimeZone)v4).getDisplayName((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((java.util.Locale)v8));
    Object v10 = "SansSerif";
    Object v11 = java.util.Locale.forLanguageTag(((java.lang.String)v10));
    Object v12 = new org.jfree.data.time.Week(((java.util.Date)v3),((java.util.TimeZone)v4),((java.util.Locale)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = true;
    Object v6 = 1;
    Object v7 = "SansSerif";
    Object v8 = java.util.Locale.forLanguageTag(((java.lang.String)v7));
    Object v9 = ((java.util.TimeZone)v4).getDisplayName((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((java.util.Locale)v8));
    Object v10 = "SansSerif";
    Object v11 = java.util.Locale.forLanguageTag(((java.lang.String)v10));
    Object v12 = new org.jfree.data.time.Week(((java.util.Date)v3),((java.util.TimeZone)v4),((java.util.Locale)v11));
    Object v13 = ((org.jfree.data.time.Week)v12).next();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 0;
    Object v1 = -38;
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = new org.jfree.data.time.Year(((java.util.Date)v4),((java.util.TimeZone)v5));
    Object v7 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Year)v6));
    Object v8 = ((org.jfree.data.time.RegularTimePeriod)v7).getMiddleMillisecond();
    Object v9 = java.util.TimeZone.getDefault();
    Object v10 = ((org.jfree.data.time.Week)v7).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = true;
    Object v6 = 1;
    Object v7 = "SansSerif";
    Object v8 = java.util.Locale.forLanguageTag(((java.lang.String)v7));
    Object v9 = ((java.util.TimeZone)v4).getDisplayName((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((java.util.Locale)v8));
    Object v10 = "SansSerif";
    Object v11 = java.util.Locale.forLanguageTag(((java.lang.String)v10));
    Object v12 = new org.jfree.data.time.Week(((java.util.Date)v3),((java.util.TimeZone)v4),((java.util.Locale)v11));
    Object v13 = ((org.jfree.data.time.Week)v12).next();
    Object v14 = ((org.jfree.data.time.RegularTimePeriod)v13).getMiddleMillisecond();
    org.junit.Assert.assertEquals((Object)(-3402619200001L), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 0;
    Object v1 = -38;
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = new org.jfree.data.time.Year(((java.util.Date)v4),((java.util.TimeZone)v5));
    Object v7 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Year)v6));
    Object v8 = ((org.jfree.data.time.Week)v7).getFirstMillisecond();
    org.junit.Assert.assertEquals((Object)(-3408969600000L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "Null 'pain";
    Object v1 = org.jfree.data.time.Week.parseWeek(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 5;
    Object v1 = -42;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).toString();
    Object v4 = ((org.jfree.data.time.Week)v2).getFirstMillisecond();
    org.junit.Assert.assertEquals((Object)(-63490406400000L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 0;
    Object v1 = -38;
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = new org.jfree.data.time.Year(((java.util.Date)v4),((java.util.TimeZone)v5));
    Object v7 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Year)v6));
    Object v8 = ((org.jfree.data.time.Week)v7).next();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 0;
    Object v1 = 1;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = true;
    Object v6 = 1;
    Object v7 = "SansSerif";
    Object v8 = java.util.Locale.forLanguageTag(((java.lang.String)v7));
    Object v9 = ((java.util.TimeZone)v4).getDisplayName((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((java.util.Locale)v8));
    Object v10 = "SansSerif";
    Object v11 = java.util.Locale.forLanguageTag(((java.lang.String)v10));
    Object v12 = new org.jfree.data.time.Week(((java.util.Date)v3),((java.util.TimeZone)v4),((java.util.Locale)v11));
    Object v13 = java.util.TimeZone.getDefault();
    Object v14 = "SansSerif";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = java.util.Calendar.getInstance(((java.util.TimeZone)v13),((java.util.Locale)v15));
    Object v17 = ((org.jfree.data.time.Week)v12).getLastMillisecond(((java.util.Calendar)v16));
    Object v18 = java.util.TimeZone.getDefault();
    Object v19 = "SansSerif";
    Object v20 = java.util.Locale.forLanguageTag(((java.lang.String)v19));
    Object v21 = java.util.Calendar.getInstance(((java.util.TimeZone)v18),((java.util.Locale)v20));
    ((org.jfree.data.time.Week)v12).peg(((java.util.Calendar)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 0;
    Object v1 = 1;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).toString();
    Object v4 = ((org.jfree.data.time.Week)v2).previous();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 0;
    Object v1 = 1;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).toString();
    Object v4 = ((org.jfree.data.time.Week)v2).previous();
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = "SansSerif";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = java.util.Calendar.getInstance(((java.util.TimeZone)v5),((java.util.Locale)v7));
    Object v9 = ((org.jfree.data.time.Week)v4).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 0;
    Object v1 = 1;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = ((org.jfree.data.time.Week)v2).compareTo(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 0;
    Object v1 = -38;
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = new org.jfree.data.time.Year(((java.util.Date)v4),((java.util.TimeZone)v5));
    Object v7 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Year)v6));
    Object v8 = ((org.jfree.data.time.Week)v7).next();
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = new org.jfree.data.time.Week((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.jfree.data.time.Week)v11).toString();
    Object v13 = ((org.jfree.data.time.Week)v11).previous();
    Object v14 = ((org.jfree.data.time.Week)v8).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "Null 'prefix' argument.";
    Object v1 = org.jfree.data.time.Week.parseWeek(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = new org.jfree.data.time.Year(((java.util.Date)v3),((java.util.TimeZone)v4));
    Object v6 = ((org.jfree.data.time.RegularTimePeriod)v5).getEnd();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 1;
    Object v1 = 22;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 1;
    Object v1 = 22;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).getFirstMillisecond();
    org.junit.Assert.assertEquals((Object)(-61473398400000L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = new org.jfree.data.time.Year(((java.util.Date)v3),((java.util.TimeZone)v4));
    Object v6 = ((org.jfree.data.time.RegularTimePeriod)v5).getEnd();
    Object v7 = new org.jfree.data.time.Week(((java.util.Date)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 1;
    Object v1 = 22;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.RegularTimePeriod)v2).getStart();
    Object v4 = ((org.jfree.data.time.Week)v2).getWeek();
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.jfree.data.time.Week();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 0;
    Object v1 = 1;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "SansSerif";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = ((org.jfree.data.time.RegularTimePeriod)v2).getMiddleMillisecond(((java.util.Calendar)v6));
    org.junit.Assert.assertEquals((Object)(-62136561600001L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "SansSerif";
    Object v1 = org.jfree.data.time.Week.parseWeek(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 7;
    Object v1 = -20;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 0;
    Object v1 = 1;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.lang.ClassLoader.getSystemClassLoader();
    Object v4 = ((org.jfree.data.time.Week)v2).compareTo(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = -15;
    Object v1 = -38;
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = new org.jfree.data.time.Year(((java.util.Date)v4),((java.util.TimeZone)v5));
    Object v7 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Year)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 42;
    Object v1 = -58;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 7;
    Object v1 = -20;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 42;
    Object v4 = -58;
    Object v5 = new org.jfree.data.time.Week((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jfree.data.time.Week)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = new org.jfree.data.time.Year(((java.util.Date)v3),((java.util.TimeZone)v4));
    Object v6 = ((org.jfree.data.time.RegularTimePeriod)v5).getEnd();
    Object v7 = new org.jfree.data.time.Week(((java.util.Date)v6));
    Object v8 = ((org.jfree.data.time.Week)v7).next();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "Null 'paint' argument ";
    Object v1 = org.jfree.data.time.Week.parseWeek(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = new org.jfree.data.time.Year(((java.util.Date)v3),((java.util.TimeZone)v4));
    Object v6 = ((org.jfree.data.time.RegularTimePeriod)v5).getEnd();
    Object v7 = ((java.util.Date)v6).toString();
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = "SansSerif";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = new org.jfree.data.time.Week(((java.util.Date)v6),((java.util.TimeZone)v8),((java.util.Locale)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = true;
    Object v6 = 1;
    Object v7 = "SansSerif";
    Object v8 = java.util.Locale.forLanguageTag(((java.lang.String)v7));
    Object v9 = ((java.util.TimeZone)v4).getDisplayName((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((java.util.Locale)v8));
    Object v10 = "SansSerif";
    Object v11 = java.util.Locale.forLanguageTag(((java.lang.String)v10));
    Object v12 = new org.jfree.data.time.Week(((java.util.Date)v3),((java.util.TimeZone)v4),((java.util.Locale)v11));
    Object v13 = ((org.jfree.data.time.Week)v12).getLastMillisecond();
    org.junit.Assert.assertEquals((Object)(-3402921600001L), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 0;
    Object v1 = 1;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).next();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = true;
    Object v6 = 1;
    Object v7 = "SansSerif";
    Object v8 = java.util.Locale.forLanguageTag(((java.lang.String)v7));
    Object v9 = ((java.util.TimeZone)v4).getDisplayName((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((java.util.Locale)v8));
    Object v10 = "SansSerif";
    Object v11 = java.util.Locale.forLanguageTag(((java.lang.String)v10));
    Object v12 = new org.jfree.data.time.Week(((java.util.Date)v3),((java.util.TimeZone)v4),((java.util.Locale)v11));
    Object v13 = java.util.TimeZone.getDefault();
    Object v14 = ((org.jfree.data.time.Week)v12).compareTo(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(1), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 0;
    Object v1 = 1;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).next();
    Object v4 = ((org.jfree.data.time.Week)v3).previous();
    Object v5 = ((org.jfree.data.time.Week)v3).toString();
    org.junit.Assert.assertEquals((Object)("Week 1, 1"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 2;
    Object v1 = 1;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 1;
    Object v1 = 22;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -38;
    Object v4 = 2;
    Object v5 = 0;
    Object v6 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.jfree.data.time.Week)v2).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 1;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "SansSerif";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = ((org.jfree.data.time.RegularTimePeriod)v2).getMiddleMillisecond(((java.util.Calendar)v6));
    Object v8 = ((org.jfree.data.time.Week)v2).getYear();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.jfree.data.time.Week();
    Object v1 = 2;
    Object v2 = 1;
    Object v3 = new org.jfree.data.time.Week((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.jfree.data.time.Week)v0).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = new org.jfree.data.time.Year(((java.util.Date)v3),((java.util.TimeZone)v4));
    Object v6 = ((org.jfree.data.time.RegularTimePeriod)v5).getStart();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "S@ansSerif";
    Object v1 = org.jfree.data.time.Week.parseWeek(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 0;
    Object v1 = 1;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).toString();
    Object v4 = ((org.jfree.data.time.Week)v2).previous();
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = "SansSerif";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = java.util.Calendar.getInstance(((java.util.TimeZone)v5),((java.util.Locale)v7));
    ((org.jfree.data.time.Week)v4).peg(((java.util.Calendar)v8));
    Object v9 = null;
    Object v10 = -38;
    Object v11 = 2;
    Object v12 = 0;
    Object v13 = new java.util.Date((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = java.util.TimeZone.getDefault();
    Object v15 = true;
    Object v16 = 1;
    Object v17 = "SansSerif";
    Object v18 = java.util.Locale.forLanguageTag(((java.lang.String)v17));
    Object v19 = ((java.util.TimeZone)v14).getDisplayName((((java.lang.Boolean)v15).booleanValue()),(((java.lang.Integer)v16).intValue()),((java.util.Locale)v18));
    Object v20 = "SansSerif";
    Object v21 = java.util.Locale.forLanguageTag(((java.lang.String)v20));
    Object v22 = new org.jfree.data.time.Week(((java.util.Date)v13),((java.util.TimeZone)v14),((java.util.Locale)v21));
    Object v23 = ((org.jfree.data.time.Week)v22).getLastMillisecond();
    Object v24 = ((org.jfree.data.time.Week)v4).equals(((java.lang.Object)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = -9;
    Object v1 = 0;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = -57;
    Object v1 = 5;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = -15;
    Object v1 = -38;
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = new org.jfree.data.time.Year(((java.util.Date)v4),((java.util.TimeZone)v5));
    Object v7 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Year)v6));
    Object v8 = ((org.jfree.data.time.Week)v7).getSerialIndex();
    org.junit.Assert.assertEquals((Object)(98671L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = new org.jfree.data.time.Year(((java.util.Date)v3),((java.util.TimeZone)v4));
    Object v6 = ((org.jfree.data.time.RegularTimePeriod)v5).getEnd();
    Object v7 = ((java.util.Date)v6).toString();
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = "SansSerif";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = new org.jfree.data.time.Week(((java.util.Date)v6),((java.util.TimeZone)v8),((java.util.Locale)v10));
    Object v12 = java.util.TimeZone.getDefault();
    Object v13 = "SansSerif";
    Object v14 = java.util.Locale.forLanguageTag(((java.lang.String)v13));
    Object v15 = java.util.Calendar.getInstance(((java.util.TimeZone)v12),((java.util.Locale)v14));
    Object v16 = ((org.jfree.data.time.Week)v11).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 0;
    Object v1 = 1;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).next();
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = "SansSerif";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = java.util.Calendar.getInstance(((java.util.TimeZone)v4),((java.util.Locale)v6));
    Object v8 = ((org.jfree.data.time.Week)v3).getFirstMillisecond(((java.util.Calendar)v7));
    Object v9 = ((org.jfree.data.time.Week)v3).getWeek();
    org.junit.Assert.assertEquals((Object)(1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = new org.jfree.data.time.Year(((java.util.Date)v3),((java.util.TimeZone)v4));
    Object v6 = ((org.jfree.data.time.RegularTimePeriod)v5).getEnd();
    Object v7 = ((java.util.Date)v6).toString();
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = "SansSerif";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = new org.jfree.data.time.Week(((java.util.Date)v6),((java.util.TimeZone)v8),((java.util.Locale)v10));
    Object v12 = ((org.jfree.data.time.RegularTimePeriod)v11).getStart();
    Object v13 = java.util.TimeZone.getDefault();
    Object v14 = "SansSerif";
    Object v15 = java.util.Locale.forLanguageTag(((java.lang.String)v14));
    Object v16 = java.util.Calendar.getInstance(((java.util.TimeZone)v13),((java.util.Locale)v15));
    Object v17 = -10;
    Object v18 = 0;
    Object v19 = 5;
    ((java.util.Calendar)v16).set((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v20 = null;
    Object v21 = ((org.jfree.data.time.Week)v11).getLastMillisecond(((java.util.Calendar)v16));
    org.junit.Assert.assertEquals((Object)(-3376310400001L), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 7;
    Object v1 = -20;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "SansSerif";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = ((org.jfree.data.time.Week)v2).getLastMillisecond(((java.util.Calendar)v6));
    Object v8 = ((org.jfree.data.time.Week)v2).next();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 42;
    Object v1 = -58;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.lang.ClassLoader.getSystemClassLoader();
    Object v4 = ((org.jfree.data.time.Week)v2).compareTo(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = new org.jfree.data.time.Year(((java.util.Date)v3),((java.util.TimeZone)v4));
    Object v6 = ((org.jfree.data.time.RegularTimePeriod)v5).getStart();
    Object v7 = ((java.util.Date)v6).getDay();
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = "SansSerif";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = new org.jfree.data.time.Week(((java.util.Date)v6),((java.util.TimeZone)v8),((java.util.Locale)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.jfree.data.time.Week.parseWeek(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = -57;
    Object v1 = 5;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).next();
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = "SansSerif";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = java.util.Calendar.getInstance(((java.util.TimeZone)v4),((java.util.Locale)v6));
    Object v8 = ((org.jfree.data.time.Week)v2).getFirstMillisecond(((java.util.Calendar)v7));
    org.junit.Assert.assertEquals((Object)(-62044934400000L), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = -57;
    Object v1 = 5;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(21169), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = new org.jfree.data.time.Year(((java.util.Date)v3),((java.util.TimeZone)v4));
    Object v6 = ((org.jfree.data.time.RegularTimePeriod)v5).getStart();
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = ((java.util.TimeZone)v7).hasSameRules(((java.util.TimeZone)v8));
    Object v10 = new org.jfree.data.time.Week(((java.util.Date)v6),((java.util.TimeZone)v7));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = -57;
    Object v1 = 5;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).getYearValue();
    org.junit.Assert.assertEquals((Object)(5), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 42;
    Object v1 = -58;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "SansSerif";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = 1;
    ((java.util.Calendar)v6).setFirstDayOfWeek((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    Object v9 = ((org.jfree.data.time.Week)v2).getLastMillisecond(((java.util.Calendar)v6));
    org.junit.Assert.assertEquals((Object)(-63972432000001L), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 46;
    Object v1 = -38;
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = new org.jfree.data.time.Year(((java.util.Date)v4),((java.util.TimeZone)v5));
    Object v7 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Year)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 2;
    Object v1 = 1;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "SansSerif";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = ((org.jfree.data.time.RegularTimePeriod)v2).getMiddleMillisecond(((java.util.Calendar)v6));
    org.junit.Assert.assertEquals((Object)(-62135352000001L), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 42;
    Object v1 = -58;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).next();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = new org.jfree.data.time.Year(((java.util.Date)v3),((java.util.TimeZone)v4));
    Object v6 = ((org.jfree.data.time.RegularTimePeriod)v5).getEnd();
    Object v7 = new org.jfree.data.time.Week(((java.util.Date)v6));
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = new org.jfree.data.time.Week((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.jfree.data.time.Week)v7).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "Not yet implemente.";
    Object v1 = org.jfree.data.time.Week.parseWeek(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = new org.jfree.data.time.Year(((java.util.Date)v3),((java.util.TimeZone)v4));
    Object v6 = ((org.jfree.data.time.RegularTimePeriod)v5).getEnd();
    Object v7 = new org.jfree.data.time.Week(((java.util.Date)v6));
    Object v8 = ((org.jfree.data.time.Week)v7).previous();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 0;
    Object v1 = 1;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).toString();
    Object v4 = ((org.jfree.data.time.Week)v2).previous();
    Object v5 = "SansSerif";
    Object v6 = java.util.Locale.forLanguageTag(((java.lang.String)v5));
    Object v7 = ((org.jfree.data.time.Week)v4).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = new org.jfree.data.time.Year(((java.util.Date)v3),((java.util.TimeZone)v4));
    Object v6 = ((org.jfree.data.time.RegularTimePeriod)v5).getEnd();
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = "SansSerif";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = new org.jfree.data.time.Week(((java.util.Date)v6),((java.util.TimeZone)v7),((java.util.Locale)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = new org.jfree.data.time.Year(((java.util.Date)v3),((java.util.TimeZone)v4));
    Object v6 = ((org.jfree.data.time.RegularTimePeriod)v5).getStart();
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = "SansSerif";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = new org.jfree.data.time.Week(((java.util.Date)v6),((java.util.TimeZone)v7),((java.util.Locale)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = "SansSerif";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = java.util.Calendar.getInstance(((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = -38;
    Object v8 = 2;
    Object v9 = 0;
    Object v10 = new java.util.Date((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.TimeZone.getDefault();
    Object v12 = new org.jfree.data.time.Year(((java.util.Date)v10),((java.util.TimeZone)v11));
    Object v13 = ((org.jfree.data.time.RegularTimePeriod)v12).getEnd();
    ((java.util.Calendar)v6).setTime(((java.util.Date)v13));
    Object v14 = null;
    ((org.jfree.data.time.Week)v2).peg(((java.util.Calendar)v6));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = -21;
    Object v1 = -38;
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = new org.jfree.data.time.Year(((java.util.Date)v4),((java.util.TimeZone)v5));
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = "SansSerif";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = java.util.Calendar.getInstance(((java.util.TimeZone)v7),((java.util.Locale)v9));
    Object v11 = ((org.jfree.data.time.RegularTimePeriod)v6).getMiddleMillisecond(((java.util.Calendar)v10));
    Object v12 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Year)v6));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).next();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).previous();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = -57;
    Object v1 = 5;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).next();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = org.jfree.data.time.RegularTimePeriod.downsize(((java.lang.Class)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).getYearValue();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 46;
    Object v1 = -38;
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = new org.jfree.data.time.Year(((java.util.Date)v4),((java.util.TimeZone)v5));
    Object v7 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Year)v6));
    Object v8 = ((org.jfree.data.time.Week)v7).next();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = -15;
    Object v1 = -38;
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = new org.jfree.data.time.Year(((java.util.Date)v4),((java.util.TimeZone)v5));
    Object v7 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Year)v6));
    Object v8 = ((org.jfree.data.time.Week)v7).previous();
    Object v9 = ((org.jfree.data.time.Week)v7).previous();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 42;
    Object v1 = -58;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).toString();
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = ((org.jfree.data.time.Week)v2).compareTo(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 1;
    Object v1 = 1;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).getSerialIndex();
    org.junit.Assert.assertEquals((Object)(54L), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 37;
    Object v1 = 0;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = 37;
    Object v1 = 0;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = -57;
    Object v4 = 5;
    Object v5 = new org.jfree.data.time.Week((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jfree.data.time.Week)v2).compareTo(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 46;
    Object v1 = -38;
    Object v2 = 2;
    Object v3 = 0;
    Object v4 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = new org.jfree.data.time.Year(((java.util.Date)v4),((java.util.TimeZone)v5));
    Object v7 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),((org.jfree.data.time.Year)v6));
    Object v8 = ((org.jfree.data.time.Week)v7).previous();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = -57;
    Object v1 = 5;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).next();
    Object v4 = ((org.jfree.data.time.Week)v3).previous();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 6;
    Object v1 = 1;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = ", ";
    Object v1 = org.jfree.data.time.Week.parseWeek(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = -38;
    Object v1 = 2;
    Object v2 = 0;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = true;
    Object v6 = 1;
    Object v7 = "SansSerif";
    Object v8 = java.util.Locale.forLanguageTag(((java.lang.String)v7));
    Object v9 = ((java.util.TimeZone)v4).getDisplayName((((java.lang.Boolean)v5).booleanValue()),(((java.lang.Integer)v6).intValue()),((java.util.Locale)v8));
    Object v10 = "SansSerif";
    Object v11 = java.util.Locale.forLanguageTag(((java.lang.String)v10));
    Object v12 = new org.jfree.data.time.Week(((java.util.Date)v3),((java.util.TimeZone)v4),((java.util.Locale)v11));
    Object v13 = ((org.jfree.data.time.RegularTimePeriod)v12).getEnd();
    Object v14 = java.util.TimeZone.getDefault();
    Object v15 = "SansSerif";
    Object v16 = java.util.Locale.forLanguageTag(((java.lang.String)v15));
    Object v17 = java.util.Calendar.getInstance(((java.util.TimeZone)v14),((java.util.Locale)v16));
    Object v18 = ((org.jfree.data.time.Week)v12).getFirstMillisecond(((java.util.Calendar)v17));
    org.junit.Assert.assertEquals((Object)(-3403526400000L), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 6;
    Object v1 = 1;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).previous();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = 2;
    Object v1 = 1;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).getYear();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = -57;
    Object v1 = 5;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).next();
    Object v4 = ((org.jfree.data.time.Week)v3).previous();
    Object v5 = ((org.jfree.data.time.Week)v4).next();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 0;
    Object v1 = 0;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).next();
    Object v4 = ((org.jfree.data.time.Week)v3).getSerialIndex();
    org.junit.Assert.assertEquals((Object)(1L), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "Null 'stroke' argument.";
    Object v1 = org.jfree.data.time.Week.parseWeek(((java.lang.String)v0));
      org.junit.Assert.fail("Expected org.jfree.data.time.TimePeriodFormatException");
    } catch (org.jfree.data.time.TimePeriodFormatException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 42;
    Object v1 = -58;
    Object v2 = new org.jfree.data.time.Week((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.time.Week)v2).next();
    Object v4 = ((org.jfree.data.time.Week)v3).previous();
    org.junit.Assert.assertNotNull(v4);
  }
}
