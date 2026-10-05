package org.apache.commons.lang.text;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "ntilde";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = "L";
    Object v6 = 27;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = -6;
    ((java.text.ParsePosition)v7).setIndex((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
    Object v10 = ((java.text.MessageFormat)v4).parse(((java.lang.String)v5),((java.text.ParsePosition)v7));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.util.Locale)v3).getUnicodeLocaleKeys();
    Object v5 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.util.Locale)v3).getUnicodeLocaleKeys();
    Object v5 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v6 = ((java.text.MessageFormat)v5).getFormatsByArgumentIndex();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.util.Locale)v3).getUnicodeLocaleKeys();
    Object v5 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v6 = "k";
    Object v7 = 27;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.text.MessageFormat)v5).parseObject(((java.lang.String)v6),((java.text.ParsePosition)v8));
    Object v10 = ((java.text.MessageFormat)v5).getFormatsByArgumentIndex();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.util.Locale)v3).getUnicodeLocaleKeys();
    Object v5 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v6 = ((java.text.MessageFormat)v5).clone();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "ntilde";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = 1;
    Object v7 = new java.lang.StringBuffer((((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = new java.text.FieldPosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((java.text.MessageFormat)v4).format(((java.lang.Object[])v5),((java.lang.StringBuffer)v7),((java.text.FieldPosition)v9));
    Object v11 = "Oacute";
    ((org.apache.commons.lang.text.ExtendedMessageFormat)v4).applyPattern(((java.lang.String)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "setCausex";
    Object v1 = 31;
    Object v2 = new java.util.HashMap((((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = new java.lang.StringBuffer((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.util.Map)v2).get(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Map)v2));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.util.Locale)v3).getUnicodeLocaleKeys();
    Object v5 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v6 = "g";
    Object v7 = ((java.text.MessageFormat)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.util.Locale)v3).getUnicodeLocaleKeys();
    Object v5 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v6 = new java.text.Format[]{null};
    ((org.apache.commons.lang.text.ExtendedMessageFormat)v5).setFormatsByArgumentIndex(((java.text.Format[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.util.Locale)v3).getUnicodeLocaleKeys();
    Object v5 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v6 = ((java.text.MessageFormat)v5).clone();
    Object v7 = "";
    Object v8 = 27;
    Object v9 = new java.text.ParsePosition((((java.lang.Integer)v8).intValue()));
    Object v10 = ((java.text.Format)v6).parseObject(((java.lang.String)v7),((java.text.ParsePosition)v9));
    Object v11 = "";
    Object v12 = "]";
    Object v13 = "29";
    Object v14 = new java.util.Locale(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((java.util.Locale)v14).getUnicodeLocaleKeys();
    Object v16 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v11),((java.util.Locale)v14));
    Object v17 = ((java.text.MessageFormat)v16).getFormatsByArgumentIndex();
    Object v18 = ((java.text.Format)v6).format(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(""), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.util.Locale)v3).getUnicodeLocaleKeys();
    Object v5 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v6 = ((java.text.MessageFormat)v5).hashCode();
    Object v7 = 1;
    Object v8 = new java.lang.StringBuffer((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.text.MessageFormat)v5).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = ">";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.util.Locale)v3).getUnicodeLocaleKeys();
    Object v5 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v6 = "";
    Object v7 = ((java.text.Format)v5).parseObject(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = "";
    Object v6 = ((java.text.Format)v4).parseObject(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.util.Locale)v3).getUnicodeLocaleKeys();
    Object v5 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v6 = 0;
    Object v7 = new java.text.FieldPosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.MessageFormat)v5).formatToCharacterIterator(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = ">";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = ((java.text.MessageFormat)v4).clone();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = "";
    Object v6 = ((java.text.MessageFormat)v4).parse(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "";
    Object v1 = new java.lang.Object[]{null};
    Object v2 = java.text.MessageFormat.format(((java.lang.String)v0),((java.lang.Object[])v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "ntilde";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = "%";
    Object v6 = 27;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.MessageFormat)v4).parse(((java.lang.String)v5),((java.text.ParsePosition)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = ">";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = "]";
    Object v6 = "29";
    Object v7 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6));
    ((java.text.MessageFormat)v4).setLocale(((java.util.Locale)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.util.Locale)v3).getUnicodeLocaleKeys();
    Object v5 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v6 = "]";
    Object v7 = "29";
    Object v8 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7));
    ((java.text.MessageFormat)v5).setLocale(((java.util.Locale)v8));
    Object v9 = null;
    Object v10 = "u";
    Object v11 = 27;
    Object v12 = new java.text.ParsePosition((((java.lang.Integer)v11).intValue()));
    Object v13 = ((java.text.MessageFormat)v5).parseObject(((java.lang.String)v10),((java.text.ParsePosition)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.util.Locale)v3).getUnicodeLocaleKeys();
    Object v5 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v6 = "";
    Object v7 = "]";
    Object v8 = "29";
    Object v9 = new java.util.Locale(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((java.util.Locale)v9).getUnicodeLocaleKeys();
    Object v11 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v6),((java.util.Locale)v9));
    Object v12 = "k";
    Object v13 = 27;
    Object v14 = new java.text.ParsePosition((((java.lang.Integer)v13).intValue()));
    Object v15 = ((java.text.MessageFormat)v11).parseObject(((java.lang.String)v12),((java.text.ParsePosition)v14));
    Object v16 = ((java.text.MessageFormat)v11).getFormatsByArgumentIndex();
    Object v17 = ((java.text.MessageFormat)v5).formatToCharacterIterator(((java.lang.Object)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.util.Locale)v3).getUnicodeLocaleKeys();
    Object v5 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v6 = "F";
    ((org.apache.commons.lang.text.ExtendedMessageFormat)v5).applyPattern(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.util.Locale)v3).getUnicodeLocaleKeys();
    Object v5 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v6 = ((java.text.MessageFormat)v5).getFormatsByArgumentIndex();
    Object v7 = "";
    Object v8 = "]";
    Object v9 = "29";
    Object v10 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((java.util.Locale)v10).getUnicodeLocaleKeys();
    Object v12 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v7),((java.util.Locale)v10));
    Object v13 = ((java.text.MessageFormat)v12).hashCode();
    Object v14 = 1;
    Object v15 = new java.lang.StringBuffer((((java.lang.Integer)v14).intValue()));
    Object v16 = ((java.text.MessageFormat)v12).equals(((java.lang.Object)v15));
    Object v17 = ((java.text.MessageFormat)v5).equals(((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.util.Locale)v3).getUnicodeLocaleKeys();
    Object v5 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v6 = "Different enum class '";
    Object v7 = 27;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = -8;
    ((java.text.ParsePosition)v8).setErrorIndex((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    Object v11 = ((java.text.MessageFormat)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = ">";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = ((java.text.MessageFormat)v4).getFormats();
    Object v6 = "s";
    ((org.apache.commons.lang.text.ExtendedMessageFormat)v4).applyPattern(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "\"";
    Object v1 = 31;
    Object v2 = new java.util.HashMap((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.util.Map)v2).values();
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Map)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = "setCausex";
    Object v4 = 31;
    Object v5 = new java.util.HashMap((((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = new java.lang.StringBuffer((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.util.Map)v5).get(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v3),((java.util.Map)v5));
    ((org.apache.commons.lang.text.ExtendedMessageFormat)v1).setFormat((((java.lang.Integer)v2).intValue()),((java.text.Format)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = ">";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = "The date must not beZ null";
    ((org.apache.commons.lang.text.ExtendedMessageFormat)v4).applyPattern(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "1";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.util.Locale)v3).getUnicodeLocaleKeys();
    Object v5 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v6 = ((java.text.MessageFormat)v5).clone();
    Object v7 = "";
    Object v8 = "]";
    Object v9 = "29";
    Object v10 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((java.util.Locale)v10).getUnicodeLocaleKeys();
    Object v12 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v7),((java.util.Locale)v10));
    Object v13 = "k";
    Object v14 = 27;
    Object v15 = new java.text.ParsePosition((((java.lang.Integer)v14).intValue()));
    Object v16 = ((java.text.MessageFormat)v12).parseObject(((java.lang.String)v13),((java.text.ParsePosition)v15));
    Object v17 = ((java.text.MessageFormat)v12).getFormatsByArgumentIndex();
    Object v18 = 1;
    Object v19 = new java.lang.StringBuffer((((java.lang.Integer)v18).intValue()));
    Object v20 = 0;
    Object v21 = new java.text.FieldPosition((((java.lang.Integer)v20).intValue()));
    Object v22 = ((java.text.MessageFormat)v6).format(((java.lang.Object)v17),((java.lang.StringBuffer)v19),((java.text.FieldPosition)v21));
    Object v23 = new java.text.Format[]{};
    ((org.apache.commons.lang.text.ExtendedMessageFormat)v6).setFormats(((java.text.Format[])v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "ntilde";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = ((java.text.MessageFormat)v4).getFormatsByArgumentIndex();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "1";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = "'";
    Object v6 = ((java.text.Format)v4).parseObject(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = ((java.text.MessageFormat)v1).hashCode();
    Object v3 = 0;
    Object v4 = "1";
    Object v5 = "]";
    Object v6 = "29";
    Object v7 = new java.util.Locale(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v4),((java.util.Locale)v7));
    ((org.apache.commons.lang.text.ExtendedMessageFormat)v1).setFormat((((java.lang.Integer)v3).intValue()),((java.text.Format)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.lang.text.ExtendedMessageFormat)v1).toPattern();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = "";
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v3));
    Object v5 = ((java.text.Format)v4).clone();
    ((org.apache.commons.lang.text.ExtendedMessageFormat)v1).setFormat((((java.lang.Integer)v2).intValue()),((java.text.Format)v4));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v2));
    Object v4 = ((java.text.MessageFormat)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.util.Locale)v3).getUnicodeLocaleKeys();
    Object v5 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v6 = "";
    Object v7 = ((java.text.MessageFormat)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "1";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = ((java.text.MessageFormat)v4).toPattern();
    Object v6 = ((java.text.MessageFormat)v4).clone();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.util.Locale)v3).getUnicodeLocaleKeys();
    Object v5 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v6 = "The Array must nOot be null";
    Object v7 = ((java.text.MessageFormat)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = ")";
    Object v3 = 27;
    Object v4 = new java.text.ParsePosition((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    ((java.text.ParsePosition)v4).setErrorIndex((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = ((java.text.MessageFormat)v1).parse(((java.lang.String)v2),((java.text.ParsePosition)v4));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = ">";
    Object v6 = "]";
    Object v7 = "29";
    Object v8 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v5),((java.util.Locale)v8));
    Object v10 = ((java.text.MessageFormat)v4).formatToCharacterIterator(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.util.Locale)v3).getUnicodeLocaleKeys();
    Object v5 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v6 = "The Array must not be null";
    Object v7 = ((java.text.MessageFormat)v5).parse(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "?";
    ((org.apache.commons.lang.text.ExtendedMessageFormat)v1).applyPattern(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = ((java.text.Format)v4).clone();
    Object v6 = "[";
    Object v7 = ((java.text.Format)v4).parseObject(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "1";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = ((java.text.MessageFormat)v4).getLocale();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = new java.lang.Object[]{null,null};
    Object v3 = 1;
    Object v4 = new java.lang.StringBuffer((((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = new java.text.FieldPosition((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.text.MessageFormat)v1).format(((java.lang.Object[])v2),((java.lang.StringBuffer)v4),((java.text.FieldPosition)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.util.Locale)v3).getUnicodeLocaleKeys();
    Object v5 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v6 = "T;e Range must not be null";
    Object v7 = 27;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.text.MessageFormat)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "\"";
    Object v1 = 31;
    Object v2 = new java.util.HashMap((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.util.Map)v2).values();
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Map)v2));
    Object v5 = "";
    Object v6 = ((java.text.Format)v4).parseObject(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "1";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = new java.text.Format[]{null};
    ((org.apache.commons.lang.text.ExtendedMessageFormat)v4).setFormats(((java.text.Format[])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = ((java.text.Format)v1).clone();
    Object v3 = "";
    Object v4 = ((java.text.Format)v1).parseObject(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "Range0[";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = 31;
    Object v5 = new java.util.HashMap((((java.lang.Integer)v4).intValue()));
    Object v6 = 27;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.util.Map)v5).containsKey(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3),((java.util.Map)v5));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.util.Locale)v3).getUnicodeLocaleKeys();
    Object v5 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v6 = 1;
    Object v7 = ">";
    Object v8 = "]";
    Object v9 = "29";
    Object v10 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v7),((java.util.Locale)v10));
    ((org.apache.commons.lang.text.ExtendedMessageFormat)v5).setFormatByArgumentIndex((((java.lang.Integer)v6).intValue()),((java.text.Format)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "k";
    Object v3 = 27;
    Object v4 = new java.text.ParsePosition((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.text.MessageFormat)v1).parse(((java.lang.String)v2),((java.text.ParsePosition)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = "]";
    Object v4 = "29";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).getUnicodeLocaleKeys();
    Object v7 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v2),((java.util.Locale)v5));
    Object v8 = ((java.text.MessageFormat)v7).getFormatsByArgumentIndex();
    Object v9 = ((java.text.MessageFormat)v1).formatToCharacterIterator(((java.lang.Object)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.util.Locale)v3).getUnicodeLocaleKeys();
    Object v5 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v6 = "The PrintWriter must not be null";
    Object v7 = 27;
    Object v8 = new java.text.ParsePosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.text.MessageFormat)v5).parse(((java.lang.String)v6),((java.text.ParsePosition)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "1";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = ((java.text.MessageFormat)v4).hashCode();
    Object v6 = "";
    ((org.apache.commons.lang.text.ExtendedMessageFormat)v4).applyPattern(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "";
    ((org.apache.commons.lang.text.ExtendedMessageFormat)v1).applyPattern(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "1";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = new java.lang.Object[]{null,null,null};
    Object v6 = 1;
    Object v7 = new java.lang.StringBuffer((((java.lang.Integer)v6).intValue()));
    Object v8 = -54.81573326170762D;
    Object v9 = ((java.lang.StringBuffer)v7).append((((java.lang.Double)v8).doubleValue()));
    Object v10 = 0;
    Object v11 = new java.text.FieldPosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((java.text.MessageFormat)v4).format(((java.lang.Object[])v5),((java.lang.StringBuffer)v7),((java.text.FieldPosition)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "\"";
    Object v1 = 31;
    Object v2 = new java.util.HashMap((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.util.Map)v2).values();
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Map)v2));
    Object v5 = ((java.text.MessageFormat)v4).getFormatsByArgumentIndex();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = ">";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = "The Enu";
    ((org.apache.commons.lang.text.ExtendedMessageFormat)v4).applyPattern(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "\"";
    Object v1 = 31;
    Object v2 = new java.util.HashMap((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.util.Map)v2).values();
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Map)v2));
    Object v5 = "A";
    Object v6 = ((java.text.MessageFormat)v4).parse(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = new java.lang.Object[]{null,null,null};
    Object v3 = 1;
    Object v4 = new java.lang.StringBuffer((((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = new java.text.FieldPosition((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.text.MessageFormat)v1).format(((java.lang.Object[])v2),((java.lang.StringBuffer)v4),((java.text.FieldPosition)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "1";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = "";
    Object v6 = "]";
    Object v7 = "29";
    Object v8 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((java.util.Locale)v8).getUnicodeLocaleKeys();
    Object v10 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v5),((java.util.Locale)v8));
    Object v11 = "]";
    Object v12 = "29";
    Object v13 = new java.util.Locale(((java.lang.String)v11),((java.lang.String)v12));
    ((java.text.MessageFormat)v10).setLocale(((java.util.Locale)v13));
    Object v14 = null;
    Object v15 = "u";
    Object v16 = 27;
    Object v17 = new java.text.ParsePosition((((java.lang.Integer)v16).intValue()));
    Object v18 = ((java.text.MessageFormat)v10).parseObject(((java.lang.String)v15),((java.text.ParsePosition)v17));
    Object v19 = ((java.text.MessageFormat)v4).formatToCharacterIterator(((java.lang.Object)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((java.util.Locale)v3).getUnicodeLocaleKeys();
    Object v5 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v6 = 0;
    Object v7 = new java.text.FieldPosition((((java.lang.Integer)v6).intValue()));
    Object v8 = "";
    Object v9 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v8));
    Object v10 = new java.lang.Object[]{null,null};
    Object v11 = 1;
    Object v12 = new java.lang.StringBuffer((((java.lang.Integer)v11).intValue()));
    Object v13 = 0;
    Object v14 = new java.text.FieldPosition((((java.lang.Integer)v13).intValue()));
    Object v15 = ((java.text.MessageFormat)v9).format(((java.lang.Object[])v10),((java.lang.StringBuffer)v12),((java.text.FieldPosition)v14));
    Object v16 = 0;
    Object v17 = new java.text.FieldPosition((((java.lang.Integer)v16).intValue()));
    Object v18 = ((java.text.MessageFormat)v5).format(((java.lang.Object)v7),((java.lang.StringBuffer)v15),((java.text.FieldPosition)v17));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "1";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = ((java.text.MessageFormat)v4).getFormatsByArgumentIndex();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = ">";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = ((java.text.MessageFormat)v4).hashCode();
    Object v6 = "G";
    ((org.apache.commons.lang.text.ExtendedMessageFormat)v4).applyPattern(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = ">";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = 0;
    Object v6 = new java.text.FieldPosition((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.text.MessageFormat)v4).formatToCharacterIterator(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "ntilde";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = 2;
    Object v6 = "";
    Object v7 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v6));
    Object v8 = ((java.text.Format)v7).clone();
    ((org.apache.commons.lang.text.ExtendedMessageFormat)v4).setFormatByArgumentIndex((((java.lang.Integer)v5).intValue()),((java.text.Format)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "sup1";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "1";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = "sup1";
    Object v6 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v5));
    Object v7 = ((java.text.MessageFormat)v4).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "sup1";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = ((java.text.MessageFormat)v1).getFormatsByArgumentIndex();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "sup1";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "L";
    Object v3 = 27;
    Object v4 = new java.text.ParsePosition((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.text.ParsePosition)v4).toString();
    Object v6 = ((java.text.MessageFormat)v1).parse(((java.lang.String)v2),((java.text.ParsePosition)v4));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "sup1";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = ((java.text.MessageFormat)v1).getFormats();
    Object v3 = ((java.text.MessageFormat)v1).clone();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "sup1";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = ((java.text.MessageFormat)v1).getFormats();
    Object v3 = ((java.text.MessageFormat)v1).clone();
    Object v4 = "96";
    Object v5 = ((java.text.Format)v3).parseObject(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = ">";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = "*";
    Object v6 = 27;
    Object v7 = new java.text.ParsePosition((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.text.MessageFormat)v4).parseObject(((java.lang.String)v5),((java.text.ParsePosition)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "sup1";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v2));
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = 1;
    Object v6 = new java.lang.StringBuffer((((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = new java.text.FieldPosition((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.text.MessageFormat)v3).format(((java.lang.Object[])v4),((java.lang.StringBuffer)v6),((java.text.FieldPosition)v8));
    Object v10 = ((java.text.MessageFormat)v1).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "sup1";
    Object v3 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v2));
    Object v4 = ((java.text.MessageFormat)v3).getFormatsByArgumentIndex();
    Object v5 = "";
    Object v6 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v5));
    Object v7 = new java.lang.Object[]{null,null,null};
    Object v8 = 1;
    Object v9 = new java.lang.StringBuffer((((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = new java.text.FieldPosition((((java.lang.Integer)v10).intValue()));
    Object v12 = ((java.text.MessageFormat)v6).format(((java.lang.Object[])v7),((java.lang.StringBuffer)v9),((java.text.FieldPosition)v11));
    Object v13 = 0;
    Object v14 = new java.text.FieldPosition((((java.lang.Integer)v13).intValue()));
    Object v15 = ((java.text.MessageFormat)v1).format(((java.lang.Object)v4),((java.lang.StringBuffer)v12),((java.text.FieldPosition)v14));
    Object v16 = ((java.text.MessageFormat)v1).clone();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "sup1";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "223";
    Object v3 = 27;
    Object v4 = new java.text.ParsePosition((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.text.MessageFormat)v1).parse(((java.lang.String)v2),((java.text.ParsePosition)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "sup1";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "Cannot get the toString of a null identity";
    ((org.apache.commons.lang.text.ExtendedMessageFormat)v1).applyPattern(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "sup1";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = ((java.text.MessageFormat)v1).getFormats();
    Object v3 = ((java.text.MessageFormat)v1).clone();
    Object v4 = ((java.text.MessageFormat)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(3541923), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "sup1";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "T";
    Object v3 = ((java.text.MessageFormat)v1).parse(((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "sup1";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = 27;
    Object v4 = new java.text.ParsePosition((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.text.MessageFormat)v1).parse(((java.lang.String)v2),((java.text.ParsePosition)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "n";
    Object v1 = new java.lang.Object[]{null};
    Object v2 = java.text.MessageFormat.format(((java.lang.String)v0),((java.lang.Object[])v1));
    org.junit.Assert.assertEquals((Object)("n"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "1";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = "";
    Object v6 = ((java.text.MessageFormat)v4).parse(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.text.ParseException");
    } catch (java.text.ParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "sup1";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "";
    ((java.text.MessageFormat)v1).applyPattern(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = ((java.text.MessageFormat)v1).getFormatsByArgumentIndex();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "sup1";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "1";
    Object v3 = "]";
    Object v4 = "29";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v2),((java.util.Locale)v5));
    Object v7 = ((java.text.MessageFormat)v6).getLocale();
    Object v8 = "]";
    Object v9 = "29";
    Object v10 = new java.util.Locale(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((java.util.Locale)v7).getDisplayVariant(((java.util.Locale)v10));
    ((java.text.MessageFormat)v1).setLocale(((java.util.Locale)v7));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "sup1";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = ",";
    Object v3 = 27;
    Object v4 = new java.text.ParsePosition((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.text.MessageFormat)v1).parse(((java.lang.String)v2),((java.text.ParsePosition)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = ">";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = "";
    Object v6 = "]";
    Object v7 = "29";
    Object v8 = new java.util.Locale(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((java.util.Locale)v8).getUnicodeLocaleKeys();
    Object v10 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v5),((java.util.Locale)v8));
    Object v11 = ((java.text.MessageFormat)v4).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "87";
    Object v1 = new java.lang.Object[]{null,null,null};
    Object v2 = java.text.MessageFormat.format(((java.lang.String)v0),((java.lang.Object[])v1));
    org.junit.Assert.assertEquals((Object)("87"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "Q";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "Q";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = ((java.text.MessageFormat)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(81), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "Q";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = ((java.text.MessageFormat)v1).getFormatsByArgumentIndex();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = new java.text.Format[]{null,null};
    ((org.apache.commons.lang.text.ExtendedMessageFormat)v1).setFormatsByArgumentIndex(((java.text.Format[])v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "Q";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = ((org.apache.commons.lang.text.ExtendedMessageFormat)v1).toPattern();
    org.junit.Assert.assertEquals((Object)("Q"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "Q";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "Rang]e[";
    Object v3 = 27;
    Object v4 = new java.text.ParsePosition((((java.lang.Integer)v3).intValue()));
    Object v5 = -39;
    ((java.text.ParsePosition)v4).setErrorIndex((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    Object v7 = ((java.text.MessageFormat)v1).parse(((java.lang.String)v2),((java.text.ParsePosition)v4));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "sup1";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = "]";
    Object v4 = "29";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((java.util.Locale)v5).getUnicodeLocaleKeys();
    Object v7 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v2),((java.util.Locale)v5));
    Object v8 = ((java.text.MessageFormat)v7).getFormatsByArgumentIndex();
    Object v9 = ((java.text.MessageFormat)v1).formatToCharacterIterator(((java.lang.Object)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "Q";
    Object v1 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0));
    Object v2 = "sup1";
    Object v3 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v2));
    Object v4 = ((java.text.MessageFormat)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = ">";
    Object v1 = "]";
    Object v2 = "29";
    Object v3 = new java.util.Locale(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v0),((java.util.Locale)v3));
    Object v5 = "sup1";
    Object v6 = new org.apache.commons.lang.text.ExtendedMessageFormat(((java.lang.String)v5));
    Object v7 = ((java.text.MessageFormat)v6).getFormats();
    Object v8 = ((java.text.MessageFormat)v6).clone();
    Object v9 = ((java.text.MessageFormat)v8).hashCode();
    Object v10 = ((java.text.MessageFormat)v4).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }
}
