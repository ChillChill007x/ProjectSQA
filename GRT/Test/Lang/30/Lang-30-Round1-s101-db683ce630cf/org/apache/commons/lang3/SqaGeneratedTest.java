package org.apache.commons.lang3;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "I";
    Object v1 = Character.valueOf((char)1);
    Object v2 = Character.valueOf((char)1);
    Object v3 = org.apache.commons.lang3.StringUtils.replaceChars(((java.lang.String)v0),(((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)("I"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    Object v1 = "{";
    Object v2 = -9;
    Object v3 = -22;
    Object v4 = org.apache.commons.lang3.StringUtils.join(((java.lang.Object[])v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "S";
    Object v1 = Character.valueOf((char)0);
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.lang3.StringUtils.replaceChars(((java.lang.String)v0),(((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)("S"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "L";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.lang3.StringUtils.lastIndexOf(((java.lang.String)v0),(((java.lang.Character)v1).charValue()));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "S";
    Object v1 = Character.valueOf((char)0);
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.lang3.StringUtils.replaceChars(((java.lang.String)v0),(((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = "{";
    Object v6 = -9;
    Object v7 = -22;
    Object v8 = org.apache.commons.lang3.StringUtils.join(((java.lang.Object[])v4),((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.lang3.StringUtils.equals(((java.lang.CharSequence)v3),((java.lang.CharSequence)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "The date must not be null";
    Object v1 = org.apache.commons.lang3.StringUtils.trimToNull(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("The date must not be null"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "]";
    Object v1 = "";
    Object v2 = org.apache.commons.lang3.StringUtils.chomp(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("]"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "S";
    Object v1 = Character.valueOf((char)0);
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.lang3.StringUtils.replaceChars(((java.lang.String)v0),(((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "S";
    Object v5 = Character.valueOf((char)0);
    Object v6 = Character.valueOf((char)0);
    Object v7 = org.apache.commons.lang3.StringUtils.replaceChars(((java.lang.String)v4),(((java.lang.Character)v5).charValue()),(((java.lang.Character)v6).charValue()));
    Object v8 = ((java.lang.CharSequence)v7).toString();
    Object v9 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(((java.lang.CharSequence)v3),((java.lang.CharSequence)v7));
    org.junit.Assert.assertEquals((Object)("S"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "]";
    Object v1 = "";
    Object v2 = org.apache.commons.lang3.StringUtils.chomp(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang3.StringUtils.isEmpty(((java.lang.CharSequence)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "7";
    Object v1 = Character.valueOf((char)2);
    Object v2 = 29;
    Object v3 = org.apache.commons.lang3.StringUtils.indexOf(((java.lang.String)v0),(((java.lang.Character)v1).charValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "S";
    Object v1 = Character.valueOf((char)0);
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.lang3.StringUtils.replaceChars(((java.lang.String)v0),(((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = org.apache.commons.lang3.StringUtils.isAlphaSpace(((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "&aelig";
    Object v1 = "\u2190";
    Object v2 = "";
    Object v3 = org.apache.commons.lang3.StringUtils.replaceChars(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("&aelig"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = " ";
    Object v1 = "";
    Object v2 = 53;
    Object v3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "";
    Object v1 = "oO";
    Object v2 = "";
    Object v3 = org.apache.commons.lang3.StringUtils.substringsBetween(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "]";
    Object v1 = new java.lang.String[]{"","float"};
    Object v2 = org.apache.commons.lang3.StringUtils.indexOfAny(((java.lang.String)v0),((java.lang.String[])v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new java.lang.String[]{""};
    Object v1 = org.apache.commons.lang3.StringUtils.getCommonPrefix(((java.lang.String[])v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new java.lang.String[]{""};
    Object v1 = org.apache.commons.lang3.StringUtils.getCommonPrefix(((java.lang.String[])v0));
    Object v2 = org.apache.commons.lang3.StringUtils.capitalize(((java.lang.CharSequence)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "S";
    Object v1 = Character.valueOf((char)0);
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.lang3.StringUtils.replaceChars(((java.lang.String)v0),(((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = "S";
    Object v5 = Character.valueOf((char)0);
    Object v6 = Character.valueOf((char)0);
    Object v7 = org.apache.commons.lang3.StringUtils.replaceChars(((java.lang.String)v4),(((java.lang.Character)v5).charValue()),(((java.lang.Character)v6).charValue()));
    Object v8 = "S";
    Object v9 = Character.valueOf((char)0);
    Object v10 = Character.valueOf((char)0);
    Object v11 = org.apache.commons.lang3.StringUtils.replaceChars(((java.lang.String)v8),(((java.lang.Character)v9).charValue()),(((java.lang.Character)v10).charValue()));
    Object v12 = ((java.lang.CharSequence)v11).toString();
    Object v13 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(((java.lang.CharSequence)v7),((java.lang.CharSequence)v11));
    Object v14 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(((java.lang.CharSequence)v3),((java.lang.CharSequence)v13));
    org.junit.Assert.assertEquals((Object)(0), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "";
    Object v1 = new java.lang.String[]{"","t","R"};
    Object v2 = new java.lang.String[]{"() 8on class: ",";","Cannot locate field "};
    Object v3 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(((java.lang.String)v0),((java.lang.String[])v1),((java.lang.String[])v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "/";
    Object v1 = org.apache.commons.lang3.StringUtils.stripToNull(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("/"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "S";
    Object v1 = Character.valueOf((char)0);
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.lang3.StringUtils.replaceChars(((java.lang.String)v0),(((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = org.apache.commons.lang3.StringUtils.isAlphanumeric(((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "S";
    Object v1 = Character.valueOf((char)0);
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.lang3.StringUtils.replaceChars(((java.lang.String)v0),(((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace(((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "";
    Object v1 = "(";
    Object v2 = org.apache.commons.lang3.StringUtils.substringAfter(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "";
    Object v1 = "&sup2;";
    Object v2 = org.apache.commons.lang3.StringUtils.contains(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "";
    Object v1 = ")";
    Object v2 = 3;
    Object v3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = ",";
    Object v1 = " 1 minutes";
    Object v2 = 32;
    Object v3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(","), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "&permil;";
    Object v1 = new char[]{};
    Object v2 = org.apache.commons.lang3.StringUtils.containsAny(((java.lang.String)v0),((char[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v0));
    Object v2 = ((java.lang.CharSequence)v1).chars();
    Object v3 = org.apache.commons.lang3.StringUtils.isAllLowerCase(((java.lang.CharSequence)v1));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.lang3.StringUtils();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "Unable to convert ";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.lang3.StringUtils.remove(((java.lang.String)v0),(((java.lang.Character)v1).charValue()));
    org.junit.Assert.assertEquals((Object)("Unable to convert "), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "'";
    Object v1 = " ";
    Object v2 = org.apache.commons.lang3.StringUtils.substringAfter(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "";
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.lang3.StringUtils.reverseDelimited(((java.lang.String)v0),(((java.lang.Character)v1).charValue()));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "";
    Object v1 = "(";
    Object v2 = org.apache.commons.lang3.StringUtils.substringAfter(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.CharSequence)v2).chars();
    Object v4 = org.apache.commons.lang3.StringUtils.isNotEmpty(((java.lang.CharSequence)v2));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "";
    Object v1 = "(";
    Object v2 = org.apache.commons.lang3.StringUtils.removeStart(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "\\";
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.StringUtils.left(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "";
    Object v1 = "Z";
    Object v2 = org.apache.commons.lang3.StringUtils.remove(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.StringUtils.swapCase(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "Q";
    Object v1 = "W";
    Object v2 = org.apache.commons.lang3.StringUtils.substringBefore(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("Q"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "Array cannot be e\\pty.";
    Object v1 = "";
    Object v2 = "\u00fd";
    Object v3 = org.apache.commons.lang3.StringUtils.substringsBetween(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "The validated map is empty";
    Object v1 = "q";
    Object v2 = org.apache.commons.lang3.StringUtils.substringAfterLast(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "";
    Object v1 = new java.lang.String[]{"h"};
    Object v2 = org.apache.commons.lang3.StringUtils.startsWithAny(((java.lang.String)v0),((java.lang.String[])v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "&upsilon;";
    Object v1 = 0;
    Object v2 = org.apache.commons.lang3.StringUtils.left(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "H";
    Object v1 = "";
    Object v2 = 1;
    Object v3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "U";
    Object v1 = new java.lang.String[]{"","getCau=se"};
    Object v2 = org.apache.commons.lang3.StringUtils.indexOfAny(((java.lang.String)v0),((java.lang.String[])v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "J";
    Object v1 = "s";
    Object v2 = "&wj;";
    Object v3 = org.apache.commons.lang3.StringUtils.replaceChars(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("J"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "";
    Object v1 = "6";
    Object v2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "r";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.lang3.StringUtils.lastIndexOf(((java.lang.String)v0),(((java.lang.Character)v1).charValue()));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 54;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = "Date and Patterns";
    Object v3 = org.apache.commons.lang3.StringUtils.join(((java.lang.Iterable)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "";
    Object v1 = "6";
    Object v2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang3.StringUtils.isBlank(((java.lang.CharSequence)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "&ordf;";
    Object v1 = "";
    Object v2 = org.apache.commons.lang3.StringUtils.lastIndexOf(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(6), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = org.apache.commons.lang3.StringUtils.stripEnd(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "The validated collection index is invalid: %d";
    Object v1 = org.apache.commons.lang3.StringUtils.stripToNull(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("The validated collection index is invalid: %d"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
    Object v1 = ((java.util.Iterator)v0).hasNext();
    Object v2 = Character.valueOf((char)1);
    Object v3 = org.apache.commons.lang3.StringUtils.join(((java.util.Iterator)v0),(((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = " is not valid.a";
    Object v1 = "";
    Object v2 = org.apache.commons.lang3.StringUtils.stripEnd(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(" is not valid.a"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "";
    Object v1 = "L";
    Object v2 = org.apache.commons.lang3.StringUtils.strip(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = " is not valid.a";
    Object v1 = "";
    Object v2 = org.apache.commons.lang3.StringUtils.stripEnd(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ".";
    Object v4 = org.apache.commons.lang3.StringUtils.containsNone(((java.lang.CharSequence)v2),((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'\"'";
    Object v1 = org.apache.commons.lang3.StringUtils.stripToEmpty(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'\"'"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = ":";
    Object v1 = 0;
    Object v2 = Character.valueOf((char)1);
    Object v3 = org.apache.commons.lang3.StringUtils.rightPad(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)(":"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "\\u";
    Object v1 = Character.valueOf((char)0);
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.lang3.StringUtils.replaceChars(((java.lang.String)v0),(((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    org.junit.Assert.assertEquals((Object)("\\u"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "Array annot be empty.";
    Object v1 = Character.valueOf((char)1);
    Object v2 = 44;
    Object v3 = org.apache.commons.lang3.StringUtils.indexOf(((java.lang.String)v0),(((java.lang.Character)v1).charValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "[";
    Object v1 = org.apache.commons.lang3.StringUtils.swapCase(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("["), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = " is not valid.a";
    Object v1 = "";
    Object v2 = org.apache.commons.lang3.StringUtils.stripEnd(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = new char[]{};
    Object v4 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(((java.lang.CharSequence)v2),((char[])v3));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "I";
    Object v1 = Character.valueOf((char)0);
    Object v2 = -46;
    Object v3 = org.apache.commons.lang3.StringUtils.lastIndexOf(((java.lang.String)v0),(((java.lang.Character)v1).charValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = org.apache.commons.lang3.StringUtils.contains(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "\\p{InCombiningD<iacriticalMarks}+";
    Object v1 = "(";
    Object v2 = "&and;";
    Object v3 = org.apache.commons.lang3.StringUtils.replaceChars(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)("\\p{InCombiningD<iacriticalMarks}+"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "^";
    Object v1 = "|";
    Object v2 = ">";
    Object v3 = org.apache.commons.lang3.StringUtils.substringBetween(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = -39;
    Object v2 = 1;
    Object v3 = org.apache.commons.lang3.StringUtils.abbreviate(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = org.apache.commons.lang3.StringUtils.removeEnd(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.StringUtils.deleteWhitespace(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = "Z";
    Object v4 = org.apache.commons.lang3.StringUtils.remove(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(((java.lang.CharSequence)v1),((java.lang.CharSequence)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = -1;
    Object v3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "u";
    Object v1 = "\u2033";
    Object v2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("u"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.StringUtils.stripAccents(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "&PhiV;";
    Object v1 = "";
    Object v2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(6), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "The validated map is empty";
    Object v1 = "q";
    Object v2 = org.apache.commons.lang3.StringUtils.substringAfterLast(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang3.StringUtils.isAlphaSpace(((java.lang.CharSequence)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "r";
    Object v1 = 13;
    Object v2 = 1;
    Object v3 = org.apache.commons.lang3.StringUtils.mid(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "The validated collection index is invalid: %d";
    Object v1 = org.apache.commons.lang3.StringUtils.stripToNull(((java.lang.String)v0));
    Object v2 = "\\p{InCombiningD<iacriticalMarks}+";
    Object v3 = "(";
    Object v4 = "&and;";
    Object v5 = org.apache.commons.lang3.StringUtils.replaceChars(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.apache.commons.lang3.StringUtils.indexOfDifference(((java.lang.CharSequence)v1),((java.lang.CharSequence)v5));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.StringUtils.reverse(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "0&ang;";
    Object v1 = "";
    Object v2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "u";
    Object v1 = "&Feg;";
    Object v2 = org.apache.commons.lang3.StringUtils.indexOf(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "";
    Object v1 = " vs ";
    Object v2 = "";
    Object v3 = 0;
    Object v4 = org.apache.commons.lang3.StringUtils.replace(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "\u2014";
    Object v1 = "The Array must not be null";
    Object v2 = org.apache.commons.lang3.StringUtils.countMatches(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "\\u";
    Object v1 = Character.valueOf((char)0);
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.lang3.StringUtils.replaceChars(((java.lang.String)v0),(((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = ((java.lang.CharSequence)v3).codePoints();
    Object v5 = org.apache.commons.lang3.StringUtils.isNumeric(((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "";
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.StringUtils.repeat(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "The date mus not be null";
    Object v1 = "&rfloor;";
    Object v2 = org.apache.commons.lang3.StringUtils.difference(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("&rfloor;"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new java.lang.CharSequence[]{null,null};
    Object v1 = org.apache.commons.lang3.StringUtils.indexOfDifference(((java.lang.CharSequence[])v0));
    org.junit.Assert.assertEquals((Object)(-1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang3.StringUtils.stripToEmpty(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "`";
    Object v1 = org.apache.commons.lang3.StringUtils.stripToNull(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("`"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f";
    Object v1 = "";
    Object v2 = org.apache.commons.lang3.StringUtils.countMatches(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "";
    Object v1 = "";
    Object v2 = org.apache.commons.lang3.StringUtils.stripStart(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "&eta;(";
    Object v1 = "";
    Object v2 = org.apache.commons.lang3.StringUtils.defaultString(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("&eta;("), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "Unexpected IllegalAccessException";
    Object v1 = "The validated array contains null eleme";
    Object v2 = "Cannot pad a negative ";
    Object v3 = 2;
    Object v4 = org.apache.commons.lang3.StringUtils.replace(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)("Unexpected IllegalAccessException"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "\\\\";
    Object v1 = org.apache.commons.lang3.StringUtils.lowerCase(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("\\\\"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = org.apache.commons.lang3.text.StrTokenizer.getCSVInstance();
    Object v1 = Character.valueOf((char)1);
    Object v2 = org.apache.commons.lang3.StringUtils.join(((java.util.Iterator)v0),(((java.lang.Character)v1).charValue()));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "p";
    Object v1 = "[";
    Object v2 = org.apache.commons.lang3.StringUtils.chomp(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertEquals((Object)("p"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "";
    Object v1 = "L";
    Object v2 = org.apache.commons.lang3.StringUtils.strip(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.CharSequence)v2).chars();
    Object v4 = "[";
    Object v5 = org.apache.commons.lang3.StringUtils.swapCase(((java.lang.String)v4));
    Object v6 = ((java.lang.CharSequence)v5).chars();
    Object v7 = org.apache.commons.lang3.StringUtils.equals(((java.lang.CharSequence)v2),((java.lang.CharSequence)v5));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "\u0393";
    Object v1 = Character.valueOf((char)0);
    Object v2 = org.apache.commons.lang3.StringUtils.indexOf(((java.lang.String)v0),(((java.lang.Character)v1).charValue()));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "t";
    Object v1 = 1;
    Object v2 = org.apache.commons.lang3.StringUtils.substring(((java.lang.String)v0),(((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new java.lang.CharSequence[]{null};
    Object v1 = org.apache.commons.lang3.StringUtils.indexOfDifference(((java.lang.CharSequence[])v0));
    org.junit.Assert.assertEquals((Object)(-1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "S";
    Object v1 = Character.valueOf((char)0);
    Object v2 = Character.valueOf((char)0);
    Object v3 = org.apache.commons.lang3.StringUtils.replaceChars(((java.lang.String)v0),(((java.lang.Character)v1).charValue()),(((java.lang.Character)v2).charValue()));
    Object v4 = org.apache.commons.lang3.StringUtils.isEmpty(((java.lang.CharSequence)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }
}
