package org.apache.commons.lang3.time;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = 0;
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).adjustYear((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(2000), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ",";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).parseObject(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "w";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).parseObject(((java.lang.String)v6),((java.text.ParsePosition)v8));
    Object v10 = "Unexpected I2llegalAccessException";
    Object v11 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = 1;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.lang3.time.FastDateParser)v5).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).getFieldWidth();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).hashCode();
    Object v7 = "The date mus";
    Object v8 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "\"";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.text.ParsePosition)v8).toString();
    Object v10 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).isNextNumber();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).toString();
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).isNextNumber();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "b";
    Object v7 = java.util.Locale.forLanguageTag(((java.lang.String)v6));
    Object v8 = ((org.apache.commons.lang3.time.FastDateParser)v5).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "?";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).getPattern();
    org.junit.Assert.assertEquals((Object)("\u00d0"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "{Y";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = -8;
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).adjustYear((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(1992), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).toString();
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).getParsePattern();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "Indjex: ";
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "Array cannot be empty.";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = -64;
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).adjustYear((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(1936), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).getParsePattern();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).getTimeZone();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).getLocale();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ".";
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).hashCode();
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).getFieldWidth();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "+";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).parseObject(((java.lang.String)v6),((java.text.ParsePosition)v8));
    Object v10 = ((org.apache.commons.lang3.time.FastDateParser)v5).getFieldWidth();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "-0x";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = -19;
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).adjustYear((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(1981), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = 1;
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).adjustYear((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(2001), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "l";
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "The validated colection is empty";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    Object v10 = "Mac";
    Object v11 = ((org.apache.commons.lang3.time.FastDateParser)v5).parseObject(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = " ";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).hashCode();
    Object v7 = "";
    Object v8 = 1;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v7),((java.text.ParsePosition)v9));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "s";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "=,";
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "A";
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "&Epsilon;";
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).parseObject(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "&Delta;";
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).toString();
    Object v7 = "";
    Object v8 = 1;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v7),((java.text.ParsePosition)v9));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).hashCode();
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).isNextNumber();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = -22;
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).adjustYear((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(1978), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).toString();
    org.junit.Assert.assertEquals((Object)("FastDateParser[\u00d0,,GMT]"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "Y";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).toString();
    Object v7 = 1;
    Object v8 = ((org.apache.commons.lang3.time.FastDateParser)v5).adjustYear((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(2001), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = 1;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.lang3.time.FastDateParser)v5).equals(((java.lang.Object)v7));
    Object v9 = "";
    Object v10 = 1;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v9),((java.text.ParsePosition)v11));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).parseObject(((java.lang.String)v6),((java.text.ParsePosition)v8));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "TimedSemaphore is shut dow\"!";
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).hashCode();
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).toString();
    org.junit.Assert.assertEquals((Object)("FastDateParser[\u00d0,,GMT]"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "\u00e8a";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    Object v10 = "no";
    Object v11 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).hashCode();
    Object v7 = "\u201c";
    Object v8 = 1;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    ((java.text.ParsePosition)v9).setIndex((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    Object v12 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v7),((java.text.ParsePosition)v9));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "Invalid pattern";
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "&radic;";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = 3;
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).adjustYear((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(2003), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).toString();
    Object v7 = "+";
    Object v8 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "\u2208N";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "The Array must not be null";
    Object v1 = "\u00d0";
    Object v2 = "_";
    Object v3 = java.util.TimeZone.getTimeZone(((java.lang.String)v2));
    Object v4 = "b";
    Object v5 = java.util.Locale.forLanguageTag(((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v1),((java.util.TimeZone)v3),((java.util.Locale)v5));
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v6).getTimeZone();
    Object v8 = "b";
    Object v9 = java.util.Locale.forLanguageTag(((java.lang.String)v8));
    Object v10 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v7),((java.util.Locale)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "Exception thrown on toString(): ";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "\u00d0";
    Object v7 = "_";
    Object v8 = java.util.TimeZone.getTimeZone(((java.lang.String)v7));
    Object v9 = "b";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v6),((java.util.TimeZone)v8),((java.util.Locale)v10));
    Object v12 = 3;
    Object v13 = ((org.apache.commons.lang3.time.FastDateParser)v11).adjustYear((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.lang3.time.FastDateParser)v5).equals(((java.lang.Object)v13));
    Object v15 = "\u2220";
    Object v16 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v15));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(208), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "length must be valid";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "&rdquo;";
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "\u00d0";
    Object v7 = "_";
    Object v8 = java.util.TimeZone.getTimeZone(((java.lang.String)v7));
    Object v9 = "b";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v6),((java.util.TimeZone)v8),((java.util.Locale)v10));
    Object v12 = "b";
    Object v13 = java.util.Locale.forLanguageTag(((java.lang.String)v12));
    Object v14 = ((org.apache.commons.lang3.time.FastDateParser)v11).equals(((java.lang.Object)v13));
    Object v15 = ((org.apache.commons.lang3.time.FastDateParser)v5).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = -16;
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).adjustYear((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(1984), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = -11;
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).adjustYear((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(1989), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "P";
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = -6;
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).adjustYear((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(1994), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = 7;
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).adjustYear((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(2007), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "@";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).isNextNumber();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = 2;
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).adjustYear((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(2002), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = 1;
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).adjustYear((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(2001), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "w";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "\u00d0";
    Object v7 = "_";
    Object v8 = java.util.TimeZone.getTimeZone(((java.lang.String)v7));
    Object v9 = "b";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v6),((java.util.TimeZone)v8),((java.util.Locale)v10));
    Object v12 = 1;
    Object v13 = ((org.apache.commons.lang3.time.FastDateParser)v11).adjustYear((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.lang3.time.FastDateParser)v5).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).hashCode();
    Object v7 = "";
    Object v8 = 1;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v7),((java.text.ParsePosition)v9));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = 0;
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).adjustYear((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(2000), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).getPattern();
    org.junit.Assert.assertEquals((Object)("&"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
      org.junit.Assert.fail("Expected java.lang.StringIndexOutOfBoundsException");
    } catch (java.lang.StringIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = -8;
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).adjustYear((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(1992), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).toString();
    org.junit.Assert.assertEquals((Object)("FastDateParser[&,,GMT]"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "&";
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "m";
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).getFieldWidth();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(38), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "L";
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "&";
    Object v7 = "_";
    Object v8 = java.util.TimeZone.getTimeZone(((java.lang.String)v7));
    Object v9 = "b";
    Object v10 = java.util.Locale.forLanguageTag(((java.lang.String)v9));
    Object v11 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v6),((java.util.TimeZone)v8),((java.util.Locale)v10));
    Object v12 = -11;
    Object v13 = ((org.apache.commons.lang3.time.FastDateParser)v11).adjustYear((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.lang3.time.FastDateParser)v5).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "X";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).parseObject(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "The validated state is false";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "Unexpected generic interface type found: ";
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "s";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).parseObject(((java.lang.String)v6),((java.text.ParsePosition)v8));
    Object v10 = ((org.apache.commons.lang3.time.FastDateParser)v5).isNextNumber();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).hashCode();
    Object v7 = -92;
    Object v8 = ((org.apache.commons.lang3.time.FastDateParser)v5).adjustYear((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(1908), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = 1;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.lang3.time.FastDateParser)v5).equals(((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.lang3.time.FastDateParser)v5).isNextNumber();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).getParsePattern();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "#";
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).toString();
    Object v7 = "\u00d0";
    Object v8 = "_";
    Object v9 = java.util.TimeZone.getTimeZone(((java.lang.String)v8));
    Object v10 = "b";
    Object v11 = java.util.Locale.forLanguageTag(((java.lang.String)v10));
    Object v12 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v7),((java.util.TimeZone)v9),((java.util.Locale)v11));
    Object v13 = -19;
    Object v14 = ((org.apache.commons.lang3.time.FastDateParser)v12).adjustYear((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.apache.commons.lang3.time.FastDateParser)v5).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = "No such accessible method: ";
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "\u00d0";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = -3;
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).adjustYear((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(1997), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "&";
    Object v1 = "_";
    Object v2 = java.util.TimeZone.getTimeZone(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = java.util.Locale.forLanguageTag(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.time.FastDateParser(((java.lang.String)v0),((java.util.TimeZone)v2),((java.util.Locale)v4));
    Object v6 = ((org.apache.commons.lang3.time.FastDateParser)v5).hashCode();
    Object v7 = ((org.apache.commons.lang3.time.FastDateParser)v5).isNextNumber();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }
}
