package org.apache.commons.lang3.text;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = "%";
    Object v6 = ((java.text.Format)v4).parseObject(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = "off";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    ((java.text.MessageFormat)v4).setLocale(((java.util.Locale)v6));
    Object v7 = null;
    Object v8 = ((java.text.MessageFormat)v4).getFormatsByArgumentIndex();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((org.apache.commons.lang3.text.ExtendedMessageFormat)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(70226), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).getFormatsByArgumentIndex();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = "&a";
    ((org.apache.commons.lang3.text.ExtendedMessageFormat)v5).applyPattern(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = "OS2";
    Object v7 = ((java.text.Format)v5).parseObject(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = "\u03b8";
    ((org.apache.commons.lang3.text.ExtendedMessageFormat)v5).applyPattern(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).hashCode();
    Object v7 = "&up2;";
    Object v8 = 1;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((java.text.ParsePosition)v9).toString();
    Object v11 = ((java.text.MessageFormat)v5).parse(((java.lang.String)v7),((java.text.ParsePosition)v9));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = "B";
    Object v7 = ((java.text.MessageFormat)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = java.util.Map.of();
    Object v7 = ((org.apache.commons.lang3.text.ExtendedMessageFormat)v5).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = "";
    Object v7 = ((java.text.MessageFormat)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = "E";
    ((org.apache.commons.lang3.text.ExtendedMessageFormat)v5).applyPattern(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = "C";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.text.MessageFormat)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = "&oline;";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.text.MessageFormat)v5).parseObject(((java.lang.String)v6),((java.text.ParsePosition)v8));
    Object v10 = ((java.text.MessageFormat)v5).clone();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = "";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.text.MessageFormat)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    Object v10 = "&amp;";
    Object v11 = ((java.text.MessageFormat)v5).parse(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = "&oline;";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.text.MessageFormat)v5).parseObject(((java.lang.String)v6),((java.text.ParsePosition)v8));
    Object v10 = ((java.text.MessageFormat)v5).clone();
    Object v11 = 0;
    Object v12 = "I";
    Object v13 = "off";
    Object v14 = new java.util.Locale(((java.lang.String)v13));
    Object v15 = java.util.Map.of();
    Object v16 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v12),((java.util.Locale)v14),((java.util.Map)v15));
    Object v17 = ((java.text.MessageFormat)v16).clone();
    ((org.apache.commons.lang3.text.ExtendedMessageFormat)v10).setFormat((((java.lang.Integer)v11).intValue()),((java.text.Format)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).toPattern();
    Object v7 = ((java.text.MessageFormat)v5).clone();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = "off";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    ((java.text.MessageFormat)v5).setLocale(((java.util.Locale)v7));
    Object v8 = null;
    Object v9 = "4";
    Object v10 = 1;
    Object v11 = new java.text.ParsePosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((java.text.MessageFormat)v5).parseObject(((java.lang.String)v9),((java.text.ParsePosition)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = new java.lang.Object[]{null,null,null};
    Object v7 = 32;
    Object v8 = new java.lang.StringBuffer((((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = new java.text.FieldPosition((((java.lang.Integer)v9).intValue()));
    Object v11 = ((java.text.MessageFormat)v5).format(((java.lang.Object[])v6),((java.lang.StringBuffer)v8),((java.text.FieldPosition)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).toPattern();
    Object v7 = ((java.text.MessageFormat)v5).clone();
    Object v8 = ((java.text.Format)v7).clone();
    Object v9 = "E";
    Object v10 = ((java.text.Format)v7).parseObject(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = "&oline;";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.text.MessageFormat)v5).parseObject(((java.lang.String)v6),((java.text.ParsePosition)v8));
    Object v10 = ((java.text.MessageFormat)v5).clone();
    Object v11 = java.util.Map.of();
    Object v12 = ((java.text.MessageFormat)v10).formatToCharacterIterator(((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = new java.text.Format[]{null,null,null};
    ((org.apache.commons.lang3.text.ExtendedMessageFormat)v5).setFormatsByArgumentIndex(((java.text.Format[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "Q";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ((java.util.Locale)v2).getDisplayLanguage();
    Object v4 = java.util.Map.of();
    Object v5 = "off";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = ((java.util.Map)v4).equals(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v4));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "J";
    Object v1 = java.util.Map.of();
    Object v2 = ((java.util.Map)v1).entrySet();
    Object v3 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Map)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "Q";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2));
    Object v4 = ((java.text.MessageFormat)v3).getFormatsByArgumentIndex();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).getLocale();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = "Q";
    Object v7 = "off";
    Object v8 = new java.util.Locale(((java.lang.String)v7));
    Object v9 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v6),((java.util.Locale)v8));
    Object v10 = ((java.text.MessageFormat)v5).formatToCharacterIterator(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = "&oline;";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.text.MessageFormat)v5).parseObject(((java.lang.String)v6),((java.text.ParsePosition)v8));
    Object v10 = ((java.text.MessageFormat)v5).clone();
    Object v11 = "ensp;";
    Object v12 = 1;
    Object v13 = new java.text.ParsePosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((java.text.MessageFormat)v10).parse(((java.lang.String)v11),((java.text.ParsePosition)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).toPattern();
    Object v7 = ((java.text.MessageFormat)v5).clone();
    Object v8 = 1;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((java.text.MessageFormat)v7).formatToCharacterIterator(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).toPattern();
    Object v7 = ((java.text.MessageFormat)v5).clone();
    Object v8 = "The date must not be null";
    Object v9 = 1;
    Object v10 = new java.text.ParsePosition((((java.lang.Integer)v9).intValue()));
    Object v11 = ((java.text.MessageFormat)v7).parse(((java.lang.String)v8),((java.text.ParsePosition)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "Q";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2));
    Object v4 = ((java.text.MessageFormat)v3).getFormatsByArgumentIndex();
    Object v5 = new java.text.Format[]{null,null,null};
    ((org.apache.commons.lang3.text.ExtendedMessageFormat)v3).setFormats(((java.text.Format[])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "Q";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2));
    Object v4 = "I";
    Object v5 = "off";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = java.util.Map.of();
    Object v8 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v4),((java.util.Locale)v6),((java.util.Map)v7));
    Object v9 = ((java.text.MessageFormat)v8).clone();
    Object v10 = ((java.text.MessageFormat)v9).toPattern();
    Object v11 = ((java.text.MessageFormat)v9).clone();
    Object v12 = ((org.apache.commons.lang3.text.ExtendedMessageFormat)v3).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = "i";
    Object v7 = ((java.text.MessageFormat)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "Q";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2));
    Object v4 = "&";
    Object v5 = 1;
    Object v6 = new java.text.ParsePosition((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.text.MessageFormat)v3).parse(((java.lang.String)v4),((java.text.ParsePosition)v6));
    Object v8 = ((org.apache.commons.lang3.text.ExtendedMessageFormat)v3).toPattern();
    org.junit.Assert.assertEquals((Object)("Q"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "Q";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2));
    Object v4 = "Annotation %s with null annotationKType()";
    Object v5 = ((java.text.Format)v3).parseObject(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ((java.util.Locale)v2).getDisplayLanguage();
    Object v4 = java.util.Map.of();
    Object v5 = "off";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = ((java.util.Map)v4).equals(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v4));
    Object v9 = ((org.apache.commons.lang3.text.ExtendedMessageFormat)v8).toPattern();
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = "&Acir;";
    ((org.apache.commons.lang3.text.ExtendedMessageFormat)v5).applyPattern(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "";
    Object v1 = new java.lang.Object[]{null,null,null};
    Object v2 = java.text.MessageFormat.format(((java.lang.String)v0),((java.lang.Object[])v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).toPattern();
    Object v7 = ((java.text.MessageFormat)v5).clone();
    Object v8 = new java.text.Format[]{};
    ((org.apache.commons.lang3.text.ExtendedMessageFormat)v7).setFormatsByArgumentIndex(((java.text.Format[])v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).clone();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).toPattern();
    Object v7 = ((java.text.MessageFormat)v5).clone();
    Object v8 = java.util.Map.of();
    Object v9 = ((java.text.MessageFormat)v7).formatToCharacterIterator(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).clone();
    Object v7 = ((java.text.MessageFormat)v6).getFormatsByArgumentIndex();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "";
    Object v1 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).clone();
    Object v7 = "C";
    Object v8 = 1;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((java.text.MessageFormat)v6).parseObject(((java.lang.String)v7),((java.text.ParsePosition)v9));
    Object v11 = "off";
    Object v12 = new java.util.Locale(((java.lang.String)v11));
    ((java.text.MessageFormat)v6).setLocale(((java.util.Locale)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ((java.util.Locale)v2).getDisplayLanguage();
    Object v4 = java.util.Map.of();
    Object v5 = "off";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = ((java.util.Map)v4).equals(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v4));
    Object v9 = new java.text.Format[]{};
    ((org.apache.commons.lang3.text.ExtendedMessageFormat)v8).setFormatsByArgumentIndex(((java.text.Format[])v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).clone();
    Object v7 = "Q";
    Object v8 = "off";
    Object v9 = new java.util.Locale(((java.lang.String)v8));
    Object v10 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v7),((java.util.Locale)v9));
    Object v11 = ((java.text.MessageFormat)v10).getFormatsByArgumentIndex();
    Object v12 = 32;
    Object v13 = new java.lang.StringBuffer((((java.lang.Integer)v12).intValue()));
    Object v14 = 0;
    Object v15 = new java.text.FieldPosition((((java.lang.Integer)v14).intValue()));
    Object v16 = ((java.text.MessageFormat)v6).format(((java.lang.Object)v11),((java.lang.StringBuffer)v13),((java.text.FieldPosition)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "1";
    Object v3 = ((java.text.Format)v1).parseObject(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "J";
    Object v1 = java.util.Map.of();
    Object v2 = ((java.util.Map)v1).entrySet();
    Object v3 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Map)v1));
    Object v4 = 2;
    Object v5 = "I";
    Object v6 = "off";
    Object v7 = new java.util.Locale(((java.lang.String)v6));
    Object v8 = java.util.Map.of();
    Object v9 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v5),((java.util.Locale)v7),((java.util.Map)v8));
    Object v10 = ((java.text.MessageFormat)v9).clone();
    Object v11 = "&oline;";
    Object v12 = 1;
    Object v13 = new java.text.ParsePosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((java.text.MessageFormat)v10).parseObject(((java.lang.String)v11),((java.text.ParsePosition)v13));
    Object v15 = ((java.text.MessageFormat)v10).clone();
    Object v16 = ((java.text.Format)v15).clone();
    ((org.apache.commons.lang3.text.ExtendedMessageFormat)v3).setFormatByArgumentIndex((((java.lang.Integer)v4).intValue()),((java.text.Format)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).toPattern();
    Object v7 = "&dagge];";
    Object v8 = 1;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((java.text.MessageFormat)v5).parseObject(((java.lang.String)v7),((java.text.ParsePosition)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "J";
    Object v1 = java.util.Map.of();
    Object v2 = ((java.util.Map)v1).entrySet();
    Object v3 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Map)v1));
    Object v4 = "";
    Object v5 = ((java.text.MessageFormat)v3).parse(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = ((java.util.Locale)v2).getDisplayLanguage();
    Object v4 = java.util.Map.of();
    Object v5 = "off";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = ((java.util.Map)v4).equals(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v4));
    Object v9 = "c";
    ((java.text.MessageFormat)v8).applyPattern(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = " ";
    Object v12 = ((java.text.MessageFormat)v8).parse(((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = "";
    ((java.text.MessageFormat)v5).applyPattern(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = "&Ograve;";
    Object v9 = ((java.text.MessageFormat)v5).parse(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).toPattern();
    Object v7 = ((java.text.MessageFormat)v5).clone();
    Object v8 = "L";
    ((org.apache.commons.lang3.text.ExtendedMessageFormat)v7).applyPattern(((java.lang.String)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "J";
    Object v1 = java.util.Map.of();
    Object v2 = ((java.util.Map)v1).entrySet();
    Object v3 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Map)v1));
    Object v4 = "ah-zA-Z";
    Object v5 = ((java.text.Format)v3).parseObject(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = "&oline;";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.text.MessageFormat)v5).parseObject(((java.lang.String)v6),((java.text.ParsePosition)v8));
    Object v10 = ((java.text.MessageFormat)v5).clone();
    Object v11 = java.util.Map.of();
    Object v12 = ((org.apache.commons.lang3.text.ExtendedMessageFormat)v10).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).clone();
    Object v7 = "Range[";
    Object v8 = ((java.text.Format)v6).parseObject(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).toPattern();
    Object v7 = ((java.text.MessageFormat)v5).clone();
    Object v8 = ((java.text.MessageFormat)v7).clone();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "4";
    Object v1 = "I";
    Object v2 = "off";
    Object v3 = new java.util.Locale(((java.lang.String)v2));
    Object v4 = java.util.Map.of();
    Object v5 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v1),((java.util.Locale)v3),((java.util.Map)v4));
    Object v6 = ((java.text.MessageFormat)v5).clone();
    Object v7 = ((java.text.MessageFormat)v6).getLocale();
    Object v8 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).getFormats();
    Object v7 = "Q";
    Object v8 = "off";
    Object v9 = new java.util.Locale(((java.lang.String)v8));
    Object v10 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v7),((java.util.Locale)v9));
    Object v11 = ((java.text.MessageFormat)v10).getFormatsByArgumentIndex();
    Object v12 = ((org.apache.commons.lang3.text.ExtendedMessageFormat)v5).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = "";
    Object v7 = "off";
    Object v8 = new java.util.Locale(((java.lang.String)v7));
    Object v9 = ((java.util.Locale)v8).getDisplayLanguage();
    Object v10 = java.util.Map.of();
    Object v11 = "off";
    Object v12 = new java.util.Locale(((java.lang.String)v11));
    Object v13 = ((java.util.Map)v10).equals(((java.lang.Object)v12));
    Object v14 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v6),((java.util.Locale)v8),((java.util.Map)v10));
    Object v15 = ((org.apache.commons.lang3.text.ExtendedMessageFormat)v14).toPattern();
    Object v16 = ((java.text.MessageFormat)v5).formatToCharacterIterator(((java.lang.Object)v15));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = new java.text.FieldPosition((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.text.MessageFormat)v1).formatToCharacterIterator(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "Q";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2));
    Object v4 = java.util.Map.of();
    Object v5 = ((org.apache.commons.lang3.text.ExtendedMessageFormat)v3).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "|epsilon;";
    Object v1 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "|epsilon;";
    Object v1 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "I";
    Object v3 = "off";
    Object v4 = new java.util.Locale(((java.lang.String)v3));
    Object v5 = java.util.Map.of();
    Object v6 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v2),((java.util.Locale)v4),((java.util.Map)v5));
    Object v7 = ((java.text.MessageFormat)v6).clone();
    Object v8 = ((java.text.MessageFormat)v7).getLocale();
    ((java.text.MessageFormat)v1).setLocale(((java.util.Locale)v8));
    Object v9 = null;
    Object v10 = "S";
    Object v11 = ((java.text.MessageFormat)v1).parse(((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "|epsilon;";
    Object v1 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = "";
    Object v4 = ((java.text.Format)v1).parseObject(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "|epsilon;";
    Object v1 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "|epsilon;";
    Object v3 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v2));
    Object v4 = ((org.apache.commons.lang3.text.ExtendedMessageFormat)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "A";
    Object v1 = new java.lang.Object[]{null};
    Object v2 = java.text.MessageFormat.format(((java.lang.String)v0),((java.lang.Object[])v1));
    org.junit.Assert.assertEquals((Object)("A"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = "&oline;";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.text.MessageFormat)v5).parseObject(((java.lang.String)v6),((java.text.ParsePosition)v8));
    Object v10 = ((java.text.MessageFormat)v5).clone();
    Object v11 = "";
    Object v12 = 1;
    Object v13 = new java.text.ParsePosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((java.text.MessageFormat)v10).parseObject(((java.lang.String)v11),((java.text.ParsePosition)v13));
    Object v15 = "Z";
    Object v16 = 1;
    Object v17 = new java.text.ParsePosition((((java.lang.Integer)v16).intValue()));
    Object v18 = ((java.text.MessageFormat)v10).parse(((java.lang.String)v15),((java.text.ParsePosition)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "J";
    Object v1 = java.util.Map.of();
    Object v2 = ((java.util.Map)v1).entrySet();
    Object v3 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Map)v1));
    Object v4 = ((java.text.MessageFormat)v3).getFormatsByArgumentIndex();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).clone();
    Object v7 = ((java.text.MessageFormat)v6).clone();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "|epsilon;";
    Object v1 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((java.text.Format)v1).parseObject(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "|epsilon;";
    Object v1 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "Q";
    Object v3 = "off";
    Object v4 = new java.util.Locale(((java.lang.String)v3));
    Object v5 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v2),((java.util.Locale)v4));
    Object v6 = ((java.text.MessageFormat)v5).getFormatsByArgumentIndex();
    Object v7 = ((java.text.MessageFormat)v1).formatToCharacterIterator(((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "Q";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2));
    Object v4 = "Stopwatch must be running to suspend. ";
    ((org.apache.commons.lang3.text.ExtendedMessageFormat)v3).applyPattern(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).toPattern();
    Object v7 = ((java.text.MessageFormat)v5).clone();
    Object v8 = ((java.text.MessageFormat)v7).clone();
    Object v9 = ((java.text.MessageFormat)v8).getFormats();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = "&oline;";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.text.MessageFormat)v5).parseObject(((java.lang.String)v6),((java.text.ParsePosition)v8));
    Object v10 = ((java.text.MessageFormat)v5).clone();
    Object v11 = "off";
    Object v12 = new java.util.Locale(((java.lang.String)v11));
    ((java.text.MessageFormat)v10).setLocale(((java.util.Locale)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "J";
    Object v1 = java.util.Map.of();
    Object v2 = ((java.util.Map)v1).entrySet();
    Object v3 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Map)v1));
    Object v4 = "|epsilon;";
    Object v5 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v4));
    Object v6 = ((java.text.MessageFormat)v3).formatToCharacterIterator(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "|epsilon;";
    Object v1 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = ((java.text.MessageFormat)v1).getFormatsByArgumentIndex();
    Object v3 = ((java.text.MessageFormat)v1).getFormatsByArgumentIndex();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).clone();
    Object v7 = "\u2009";
    Object v8 = ((java.text.MessageFormat)v6).parse(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "|epsilon;";
    Object v1 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "";
    ((org.apache.commons.lang3.text.ExtendedMessageFormat)v1).applyPattern(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).clone();
    Object v7 = "The Array must not be null";
    Object v8 = ((java.text.Format)v6).parseObject(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "|epsilon;";
    Object v1 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "|epsilon;";
    Object v3 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v2));
    Object v4 = ((java.text.MessageFormat)v3).getFormatsByArgumentIndex();
    Object v5 = ((java.text.MessageFormat)v3).getFormatsByArgumentIndex();
    Object v6 = ((org.apache.commons.lang3.text.ExtendedMessageFormat)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "|epsilon;";
    Object v1 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "\u00b2";
    Object v3 = 1;
    Object v4 = new java.text.ParsePosition((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.text.MessageFormat)v1).parseObject(((java.lang.String)v2),((java.text.ParsePosition)v4));
    Object v6 = ((java.text.MessageFormat)v1).getFormatsByArgumentIndex();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "";
    Object v1 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = ((java.text.MessageFormat)v1).getFormatsByArgumentIndex();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = "&oline;";
    Object v7 = 1;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.text.MessageFormat)v5).parseObject(((java.lang.String)v6),((java.text.ParsePosition)v8));
    Object v10 = ((java.text.MessageFormat)v5).clone();
    Object v11 = "[";
    Object v12 = 1;
    Object v13 = new java.text.ParsePosition((((java.lang.Integer)v12).intValue()));
    Object v14 = ((java.text.Format)v10).parseObject(((java.lang.String)v11),((java.text.ParsePosition)v13));
    Object v15 = "Cannot locate declared field( ";
    Object v16 = ((java.text.Format)v10).parseObject(((java.lang.String)v15));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).toPattern();
    Object v7 = ((java.text.MessageFormat)v5).clone();
    Object v8 = ((java.text.MessageFormat)v7).clone();
    Object v9 = "I";
    Object v10 = "off";
    Object v11 = new java.util.Locale(((java.lang.String)v10));
    Object v12 = java.util.Map.of();
    Object v13 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v9),((java.util.Locale)v11),((java.util.Map)v12));
    Object v14 = ((java.text.MessageFormat)v13).clone();
    Object v15 = ((java.text.MessageFormat)v14).getLocale();
    ((java.text.MessageFormat)v8).setLocale(((java.util.Locale)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "|epsilon;";
    Object v1 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = ((java.text.MessageFormat)v1).getLocale();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "|epsilon;";
    Object v1 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "|epsilon;";
    Object v3 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v2));
    Object v4 = ((java.text.MessageFormat)v3).getFormatsByArgumentIndex();
    Object v5 = ((java.text.MessageFormat)v3).getFormatsByArgumentIndex();
    Object v6 = ((java.text.Format)v1).format(((java.lang.Object)v5));
    Object v7 = "The field name must not be null";
    Object v8 = ((java.text.Format)v1).parseObject(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "4";
    Object v1 = "I";
    Object v2 = "off";
    Object v3 = new java.util.Locale(((java.lang.String)v2));
    Object v4 = java.util.Map.of();
    Object v5 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v1),((java.util.Locale)v3),((java.util.Map)v4));
    Object v6 = ((java.text.MessageFormat)v5).clone();
    Object v7 = ((java.text.MessageFormat)v6).getLocale();
    Object v8 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v7));
    Object v9 = ((java.text.MessageFormat)v8).clone();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).toPattern();
    Object v7 = ((java.text.MessageFormat)v5).clone();
    Object v8 = ((java.text.MessageFormat)v7).clone();
    Object v9 = "X";
    ((org.apache.commons.lang3.text.ExtendedMessageFormat)v8).applyPattern(((java.lang.String)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = ((java.text.MessageFormat)v1).clone();
    Object v3 = "";
    Object v4 = ((java.text.MessageFormat)v1).parse(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "Q";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2));
    Object v4 = "";
    ((org.apache.commons.lang3.text.ExtendedMessageFormat)v3).applyPattern(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "Q";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2));
    Object v4 = "I";
    Object v5 = "off";
    Object v6 = new java.util.Locale(((java.lang.String)v5));
    Object v7 = java.util.Map.of();
    Object v8 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v4),((java.util.Locale)v6),((java.util.Map)v7));
    Object v9 = "off";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    ((java.text.MessageFormat)v8).setLocale(((java.util.Locale)v10));
    Object v11 = null;
    Object v12 = ((java.text.MessageFormat)v8).getFormatsByArgumentIndex();
    Object v13 = ((org.apache.commons.lang3.text.ExtendedMessageFormat)v3).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).clone();
    Object v7 = ((java.text.MessageFormat)v6).clone();
    Object v8 = "off";
    Object v9 = new java.util.Locale(((java.lang.String)v8));
    Object v10 = ((org.apache.commons.lang3.text.ExtendedMessageFormat)v7).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "|epsilon;";
    Object v1 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = -10;
    Object v3 = "";
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v3));
    ((org.apache.commons.lang3.text.ExtendedMessageFormat)v1).setFormat((((java.lang.Integer)v2).intValue()),((java.text.Format)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "I";
    Object v1 = "off";
    Object v2 = new java.util.Locale(((java.lang.String)v1));
    Object v3 = java.util.Map.of();
    Object v4 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v2),((java.util.Map)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    Object v6 = ((java.text.MessageFormat)v5).clone();
    Object v7 = ((java.text.Format)v6).clone();
    Object v8 = "";
    Object v9 = ((java.text.Format)v6).parseObject(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "|epsilon;";
    Object v1 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "|epsilon;";
    Object v3 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v2));
    Object v4 = ((java.text.MessageFormat)v3).getLocale();
    Object v5 = ((java.text.Format)v1).format(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "4";
    Object v1 = "I";
    Object v2 = "off";
    Object v3 = new java.util.Locale(((java.lang.String)v2));
    Object v4 = java.util.Map.of();
    Object v5 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v1),((java.util.Locale)v3),((java.util.Map)v4));
    Object v6 = ((java.text.MessageFormat)v5).clone();
    Object v7 = ((java.text.MessageFormat)v6).getLocale();
    Object v8 = new org.apache.commons.lang3.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v7));
    Object v9 = ((java.text.MessageFormat)v8).clone();
    Object v10 = ((java.text.MessageFormat)v9).clone();
    org.junit.Assert.assertNotNull(v10);
  }
}
