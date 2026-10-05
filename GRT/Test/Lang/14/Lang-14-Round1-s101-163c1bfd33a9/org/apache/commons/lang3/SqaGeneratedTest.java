package org.apache.commons.lang3;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "I";
    Object v1 = "&sup3;";
    Object v2 = "The value %s is not in the specified exclAusive range of %s to %s";
    Object v3 = 0;
    Object v4 = org.apache.commons.lang3.StringUtils.replace(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)("I"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = "[O";
    Object v3 = org.apache.commons.lang3.StringUtils.center(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = "[O";
    Object v3 = org.apache.commons.lang3.StringUtils.center(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = org.apache.commons.lang3.StringUtils.isNotBlank(((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = "[O";
    Object v3 = org.apache.commons.lang3.StringUtils.center(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = 0;
    Object v6 = "[O";
    Object v7 = org.apache.commons.lang3.StringUtils.center(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = org.apache.commons.lang3.StringUtils.contains(((java.lang.CharSequence)v3),((java.lang.CharSequence)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "user.country";
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.StringUtils.left(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)("u"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "2";
    Object v1 = org.apache.commons.lang3.StringUtils.trimToNull(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("2"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = ">";
    Object v1 = org.apache.commons.lang3.StringUtils.trimToNull(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(">"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.StringUtils.repeat((((java.lang.Character)v0).charValue()),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "_";
    Object v1 = org.apache.commons.lang3.StringUtils.defaultString(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("_"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "_";
    Object v1 = org.apache.commons.lang3.StringUtils.defaultString(((java.lang.String)v0));
    Object v2 = -9;
    Object v3 = org.apache.commons.lang3.StringUtils.lastIndexOf(((java.lang.CharSequence)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "_";
    Object v1 = org.apache.commons.lang3.StringUtils.defaultString(((java.lang.String)v0));
    Object v2 = Character.valueOf((char)1);
    Object v3 = 0;
    Object v4 = org.apache.commons.lang3.StringUtils.repeat((((java.lang.Character)v2).charValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.apache.commons.lang3.StringUtils.equals(((java.lang.CharSequence)v1),((java.lang.CharSequence)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "\u2227";
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.lang3.StringUtils.remove(((java.lang.String)v0),(((java.lang.Character)v1).charValue()));
    org.junit.Assert.assertEquals((Object)("\u2227"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "2";
    Object v1 = org.apache.commons.lang3.StringUtils.trimToNull(((java.lang.String)v0));
    Object v2 = "&Ntild";
    Object v3 = org.apache.commons.lang3.StringUtils.containsNone(((java.lang.CharSequence)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = 0;
    Object v3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "user.country";
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.StringUtils.left(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "user.country";
    Object v4 = 1;
    Object v5 = org.apache.commons.lang3.StringUtils.left(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.lang3.StringUtils.equals(((java.lang.CharSequence)v2),((java.lang.CharSequence)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.StringUtils.swapCase(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = "[O";
    Object v3 = org.apache.commons.lang3.StringUtils.center(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = org.apache.commons.lang3.StringUtils.isEmpty(((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "The Array must not be null";
    Object v1 = org.apache.commons.lang3.StringUtils.lowerCase(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("the array must not be null"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "_";
    Object v1 = org.apache.commons.lang3.StringUtils.defaultString(((java.lang.String)v0));
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1)};
    Object v3 = org.apache.commons.lang3.StringUtils.indexOfAny(((java.lang.CharSequence)v1),((char[])v2));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "user.country";
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.StringUtils.left(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "2";
    Object v4 = org.apache.commons.lang3.StringUtils.trimToNull(((java.lang.String)v3));
    Object v5 = org.apache.commons.lang3.StringUtils.contains(((java.lang.CharSequence)v2),((java.lang.CharSequence)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new java.util.HashSet();
    Object v1 = ((java.lang.Iterable)v0).iterator();
    Object v2 = "1.3";
    Object v3 = org.apache.commons.lang3.StringUtils.join(((java.lang.Iterable)v0),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "\u2227";
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.lang3.StringUtils.remove(((java.lang.String)v0),(((java.lang.Character)v1).charValue()));
    Object v3 = ">";
    Object v4 = org.apache.commons.lang3.StringUtils.trimToNull(((java.lang.String)v3));
    Object v5 = org.apache.commons.lang3.StringUtils.containsAny(((java.lang.CharSequence)v2),((java.lang.CharSequence)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "2";
    Object v1 = org.apache.commons.lang3.StringUtils.trimToNull(((java.lang.String)v0));
    Object v2 = org.apache.commons.lang3.StringUtils.isBlank(((java.lang.CharSequence)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.lang3.StringUtils.join(((java.lang.Object[])v0),(((java.lang.Character)v1).charValue()));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "";
    Object v1 = java.util.Locale.Category.FORMAT;
    Object v2 = java.util.Locale.getDefault(((java.util.Locale.Category)v1));
    Object v3 = org.apache.commons.lang3.StringUtils.upperCase(((java.lang.String)v0),((java.util.Locale)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "";
    Object v1 = new java.lang.String[]{};
    Object v2 = new java.lang.String[]{"overflow: can't negate nume"};
    Object v3 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(((java.lang.String)v0),((java.lang.String[])v1),((java.lang.String[])v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "g";
    Object v1 = 15;
    Object v2 = Character.valueOf((char)1);
    Object v3 = org.apache.commons.lang3.StringUtils.leftPad(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001g"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "patV.separator";
    Object v1 = "\u0394";
    Object v2 = org.apache.commons.lang3.StringUtils.stripStart(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("patV.separator"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "2";
    Object v1 = org.apache.commons.lang3.StringUtils.trimToNull(((java.lang.String)v0));
    Object v2 = org.apache.commons.lang3.StringUtils.isAlpha(((java.lang.CharSequence)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new java.lang.CharSequence[]{null,null,null};
    Object v1 = org.apache.commons.lang3.StringUtils.indexOfDifference(((java.lang.CharSequence[])v0));
    org.junit.Assert.assertEquals((Object)(-1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "user.country";
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.StringUtils.left(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.lang.CharSequence)v2).codePoints();
    Object v4 = org.apache.commons.lang3.StringUtils.isWhitespace(((java.lang.CharSequence)v2));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "patV.separator";
    Object v1 = "\u0394";
    Object v2 = org.apache.commons.lang3.StringUtils.stripStart(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.CharSequence)v2).chars();
    Object v4 = "A blank string is not a valid number";
    Object v5 = org.apache.commons.lang3.StringUtils.containsNone(((java.lang.CharSequence)v2),((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "_";
    Object v1 = org.apache.commons.lang3.StringUtils.defaultString(((java.lang.String)v0));
    Object v2 = ((java.lang.CharSequence)v1).codePoints();
    Object v3 = new char[]{};
    Object v4 = org.apache.commons.lang3.StringUtils.containsNone(((java.lang.CharSequence)v1),((char[])v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = ">";
    Object v1 = org.apache.commons.lang3.StringUtils.trimToNull(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = org.apache.commons.lang3.StringUtils.trimToNull(((java.lang.String)v2));
    Object v4 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(((java.lang.CharSequence)v1),((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.StringUtils.swapCase(((java.lang.String)v0));
    Object v2 = org.apache.commons.lang3.StringUtils.isNumericSpace(((java.lang.CharSequence)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "\\u00";
    Object v1 = 0;
    Object v2 = Character.valueOf((char)1);
    Object v3 = org.apache.commons.lang3.StringUtils.rightPad(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)("\\u00"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.StringUtils.reverse(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "No suc";
    Object v1 = "J";
    Object v2 = org.apache.commons.lang3.StringUtils.stripStart(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("No suc"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "\\u00";
    Object v1 = 0;
    Object v2 = Character.valueOf((char)1);
    Object v3 = org.apache.commons.lang3.StringUtils.rightPad(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ">";
    Object v5 = org.apache.commons.lang3.StringUtils.trimToNull(((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.StringUtils.equals(((java.lang.CharSequence)v3),((java.lang.CharSequence)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "2";
    Object v1 = org.apache.commons.lang3.StringUtils.trimToNull(((java.lang.String)v0));
    Object v2 = "No suc";
    Object v3 = "J";
    Object v4 = org.apache.commons.lang3.StringUtils.stripStart(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(((java.lang.CharSequence)v1),((java.lang.CharSequence)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = ">";
    Object v1 = org.apache.commons.lang3.StringUtils.trimToNull(((java.lang.String)v0));
    Object v2 = org.apache.commons.lang3.StringUtils.containsWhitespace(((java.lang.CharSequence)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "\u2309";
    Object v1 = 3;
    Object v2 = org.apache.commons.lang3.StringUtils.left(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)("\u2309"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "_";
    Object v1 = org.apache.commons.lang3.StringUtils.defaultString(((java.lang.String)v0));
    Object v2 = org.apache.commons.lang3.StringUtils.isBlank(((java.lang.CharSequence)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = Character.valueOf((char)0);
    Object v2 = 27;
    Object v3 = -30;
    Object v4 = org.apache.commons.lang3.StringUtils.join(((java.lang.Object[])v0),(((java.lang.Character)v1).charValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "\u00f6@";
    Object v1 = org.apache.commons.lang3.StringUtils.chop(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("\u00f6"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "The denominator must not benegative";
    Object v1 = 16;
    Object v2 = org.apache.commons.lang3.StringUtils.left(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)("The denominator "), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "The Array must not be null";
    Object v1 = -28;
    Object v2 = "";
    Object v3 = org.apache.commons.lang3.StringUtils.center(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("The Array must not be null"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.StringUtils.reverse(((java.lang.String)v0));
    Object v2 = ((java.lang.CharSequence)v1).chars();
    Object v3 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v4 = org.apache.commons.lang3.StringUtils.containsOnly(((java.lang.CharSequence)v1),((char[])v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.StringUtils.stripAccents(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "\\u00";
    Object v1 = 0;
    Object v2 = Character.valueOf((char)1);
    Object v3 = org.apache.commons.lang3.StringUtils.rightPad(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = org.apache.commons.lang3.StringUtils.length(((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(4), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.lang3.StringUtils.join(((java.lang.Object[])v0),(((java.lang.Character)v1).charValue()));
    Object v3 = ((java.lang.CharSequence)v2).chars();
    Object v4 = "";
    Object v5 = 0;
    Object v6 = "[O";
    Object v7 = org.apache.commons.lang3.StringUtils.center(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),((java.lang.String)v6));
    Object v8 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(((java.lang.CharSequence)v2),((java.lang.CharSequence)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)0)};
    Object v1 = "s";
    Object v2 = org.apache.commons.lang3.StringUtils.toString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "&Delta;";
    Object v1 = "";
    Object v2 = org.apache.commons.lang3.StringUtils.removeStart(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("&Delta;"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "The Abrray must not be null";
    Object v1 = org.apache.commons.lang3.StringUtils.defaultString(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("The Abrray must not be null"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = " ";
    Object v1 = org.apache.commons.lang3.StringUtils.chomp(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(" "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.lang3.StringUtils.join(((java.lang.Object[])v0),(((java.lang.Character)v1).charValue()));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = "";
    Object v3 = org.apache.commons.lang3.StringUtils.leftPad(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new byte[]{Byte.valueOf((byte)2),Byte.valueOf((byte)1),Byte.valueOf((byte)-22)};
    Object v1 = "Array is empty";
    Object v2 = org.apache.commons.lang3.StringUtils.toString(((byte[])v0),((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "2.0";
    Object v1 = 20;
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.lang3.StringUtils.rightPad(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)("2.0\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = " 1 minute";
    Object v1 = org.apache.commons.lang3.StringUtils.stripAccents(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(" 1 minute"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.StringUtils.trim(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.StringUtils.trim(((java.lang.String)v0));
    Object v2 = new java.lang.CharSequence[]{null};
    Object v3 = org.apache.commons.lang3.StringUtils.startsWithAny(((java.lang.CharSequence)v1),((java.lang.CharSequence[])v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "user.language";
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.StringUtils.substring(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)("user.language"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = Character.valueOf((char)1);
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.StringUtils.repeat((((java.lang.Character)v0).charValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new char[]{};
    Object v4 = org.apache.commons.lang3.StringUtils.containsNone(((java.lang.CharSequence)v2),((char[])v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = Character.valueOf((char)0);
    Object v2 = 27;
    Object v3 = -30;
    Object v4 = org.apache.commons.lang3.StringUtils.join(((java.lang.Object[])v0),(((java.lang.Character)v1).charValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.lang.CharSequence)v4).chars();
    Object v6 = ">";
    Object v7 = org.apache.commons.lang3.StringUtils.trimToNull(((java.lang.String)v6));
    Object v8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(((java.lang.CharSequence)v4),((java.lang.CharSequence)v7));
    org.junit.Assert.assertEquals((Object)(-1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "\u00f0";
    Object v1 = org.apache.commons.lang3.StringUtils.upperCase(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("\u00d0"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "\u0160";
    Object v1 = "";
    Object v2 = org.apache.commons.lang3.StringUtils.difference(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "+\u201d";
    Object v1 = "(";
    Object v2 = "!";
    Object v3 = org.apache.commons.lang3.StringUtils.substringBetween(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "|";
    Object v1 = "Unterminated format element at po/ition ";
    Object v2 = org.apache.commons.lang3.StringUtils.substringAfter(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "Stopwatch alreaydy started. ";
    Object v1 = Character.valueOf((char)65535);
    Object v2 = org.apache.commons.lang3.StringUtils.reverseDelimited(((java.lang.String)v0),(((java.lang.Character)v1).charValue()));
    org.junit.Assert.assertEquals((Object)("Stopwatch alreaydy started. "), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new java.lang.Object[]{null};
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.lang3.StringUtils.join(((java.lang.Object[])v0),(((java.lang.Character)v1).charValue()));
    Object v3 = new char[]{Character.valueOf((char)0),Character.valueOf((char)0)};
    Object v4 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(((java.lang.CharSequence)v2),((char[])v3));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.lang3.StringUtils();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.StringUtils.trim(((java.lang.String)v0));
    Object v2 = org.apache.commons.lang3.StringUtils.isBlank(((java.lang.CharSequence)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "`";
    Object v1 = "";
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.StringUtils.overlay(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.lang3.StringUtils.join(((java.lang.Object[])v0),(((java.lang.Character)v1).charValue()));
    Object v3 = ">";
    Object v4 = org.apache.commons.lang3.StringUtils.trimToNull(((java.lang.String)v3));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.StringUtils.lastIndexOf(((java.lang.CharSequence)v2),((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = ">";
    Object v1 = org.apache.commons.lang3.StringUtils.trimToNull(((java.lang.String)v0));
    Object v2 = "\u2309";
    Object v3 = 3;
    Object v4 = org.apache.commons.lang3.StringUtils.left(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(((java.lang.CharSequence)v1),((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "\u00f6@";
    Object v1 = org.apache.commons.lang3.StringUtils.chop(((java.lang.String)v0));
    Object v2 = ((java.lang.CharSequence)v1).chars();
    Object v3 = org.apache.commons.lang3.StringUtils.isAllUpperCase(((java.lang.CharSequence)v1));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "^";
    Object v1 = "|";
    Object v2 = org.apache.commons.lang3.StringUtils.substringBeforeLast(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("^"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new java.util.HashSet();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.lang3.StringUtils.join(((java.lang.Iterable)v0),(((java.lang.Character)v1).charValue()));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "\\u00";
    Object v1 = 0;
    Object v2 = Character.valueOf((char)1);
    Object v3 = org.apache.commons.lang3.StringUtils.rightPad(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new java.lang.Object[]{};
    Object v5 = Character.valueOf((char)0);
    Object v6 = org.apache.commons.lang3.StringUtils.join(((java.lang.Object[])v4),(((java.lang.Character)v5).charValue()));
    Object v7 = org.apache.commons.lang3.StringUtils.indexOf(((java.lang.CharSequence)v3),((java.lang.CharSequence)v6));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new java.lang.String[]{"\u2039",""};
    Object v1 = org.apache.commons.lang3.StringUtils.getCommonPrefix(((java.lang.String[])v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "ClassNotFoundException while reading cloned object data";
    Object v1 = org.apache.commons.lang3.StringUtils.chop(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("ClassNotFoundException while reading cloned object dat"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = Character.valueOf((char)0);
    Object v2 = 27;
    Object v3 = -30;
    Object v4 = org.apache.commons.lang3.StringUtils.join(((java.lang.Object[])v0),(((java.lang.Character)v1).charValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = "The Array must not be null";
    Object v6 = -28;
    Object v7 = "";
    Object v8 = org.apache.commons.lang3.StringUtils.center(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),((java.lang.String)v7));
    Object v9 = org.apache.commons.lang3.StringUtils.contains(((java.lang.CharSequence)v4),((java.lang.CharSequence)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "_";
    Object v1 = org.apache.commons.lang3.StringUtils.defaultString(((java.lang.String)v0));
    Object v2 = new java.lang.Object[]{};
    Object v3 = Character.valueOf((char)0);
    Object v4 = org.apache.commons.lang3.StringUtils.join(((java.lang.Object[])v2),(((java.lang.Character)v3).charValue()));
    Object v5 = ((java.lang.CharSequence)v4).length();
    Object v6 = 1;
    Object v7 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(((java.lang.CharSequence)v1),((java.lang.CharSequence)v4),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "The Array must not be null";
    Object v1 = -28;
    Object v2 = "";
    Object v3 = org.apache.commons.lang3.StringUtils.center(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    Object v4 = org.apache.commons.lang3.StringUtils.isAlphanumeric(((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    Object v1 = Character.valueOf((char)0);
    Object v2 = 27;
    Object v3 = -30;
    Object v4 = org.apache.commons.lang3.StringUtils.join(((java.lang.Object[])v0),(((java.lang.Character)v1).charValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = org.apache.commons.lang3.StringUtils.lastIndexOf(((java.lang.CharSequence)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "\\'";
    Object v1 = "3";
    Object v2 = org.apache.commons.lang3.StringUtils.stripStart(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("\\'"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "r";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.lang3.StringUtils.remove(((java.lang.String)v0),(((java.lang.Character)v1).charValue()));
    org.junit.Assert.assertEquals((Object)("r"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "java.vendor.url";
    Object v1 = org.apache.commons.lang3.StringUtils.swapCase(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("JAVA.VENDOR.URL"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "2.0";
    Object v1 = 20;
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.lang3.StringUtils.rightPad(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = 0;
    Object v5 = ((java.lang.CharSequence)v3).charAt((((java.lang.Integer)v4).intValue()));
    Object v6 = -35;
    Object v7 = org.apache.commons.lang3.StringUtils.contains(((java.lang.CharSequence)v3),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "\u2309";
    Object v1 = 3;
    Object v2 = org.apache.commons.lang3.StringUtils.left(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = "ClassNotFoundException while reading cloned object data";
    Object v4 = org.apache.commons.lang3.StringUtils.chop(((java.lang.String)v3));
    Object v5 = ((java.lang.CharSequence)v4).length();
    Object v6 = org.apache.commons.lang3.StringUtils.defaultIfBlank(((java.lang.CharSequence)v2),((java.lang.CharSequence)v4));
    org.junit.Assert.assertEquals((Object)("\u2309"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "/";
    Object v1 = 3;
    Object v2 = "\u00d3H";
    Object v3 = org.apache.commons.lang3.StringUtils.rightPad(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("/\u00d3H"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "\u00f6@";
    Object v1 = org.apache.commons.lang3.StringUtils.chop(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = org.apache.commons.lang3.StringUtils.indexOf(((java.lang.CharSequence)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "\u0392";
    Object v1 = "-";
    Object v2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("\u0392"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "I";
    Object v1 = "G";
    Object v2 = "4";
    Object v3 = org.apache.commons.lang3.StringUtils.substringBetween(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "user.language";
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.StringUtils.substring(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = org.apache.commons.lang3.StringUtils.indexOf(((java.lang.CharSequence)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "";
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)1);
    Object v3 = org.apache.commons.lang3.StringUtils.replaceChars(((java.lang.String)v0),(((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.StringUtils.normalizeSpace(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "\u03a0(";
    Object v1 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("\u03a0("), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "";
    Object v1 = 0;
    Object v2 = "java";
    Object v3 = org.apache.commons.lang3.StringUtils.rightPad(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }
}
