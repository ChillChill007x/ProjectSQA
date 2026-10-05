package org.apache.commons.lang;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "I";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeHtml(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("I"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "_";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeSql(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("_"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "";
    org.apache.commons.lang.StringEscapeUtils.unescapeHtml(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "[";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeSql(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("["), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "RVange[";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeXml(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("RVange["), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "RVange[";
    Object v2 = org.apache.commons.lang.StringEscapeUtils.unescapeXml(((java.lang.String)v1));
    Object v3 = ((java.io.Writer)v0).append(((java.lang.CharSequence)v2));
    Object v4 = "sube";
    org.apache.commons.lang.StringEscapeUtils.escapeHtml(((java.io.Writer)v0),((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "?";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeHtml(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("?"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "}";
    org.apache.commons.lang.StringEscapeUtils.escapeHtml(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "";
    org.apache.commons.lang.StringEscapeUtils.unescapeCsv(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    ((java.io.Writer)v0).flush();
    Object v1 = null;
    Object v2 = "]-";
    org.apache.commons.lang.StringEscapeUtils.escapeCsv(((java.io.Writer)v0),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "l";
    org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeHtml(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "";
    org.apache.commons.lang.StringEscapeUtils.escapeXml(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "7";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeCsv(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("7"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "";
    org.apache.commons.lang.StringEscapeUtils.unescapeJava(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = Character.valueOf((char)1);
    Object v2 = ((java.io.Writer)v0).append((((java.lang.Character)v1).charValue()));
    Object v3 = "i";
    org.apache.commons.lang.StringEscapeUtils.escapeXml(((java.io.Writer)v0),((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeJava(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    ((java.io.Writer)v0).close();
    Object v1 = null;
    Object v2 = "Unexpected IllegalAcessException";
    org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(((java.io.Writer)v0),((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "";
    org.apache.commons.lang.StringEscapeUtils.escapeHtml(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "1";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeCsv(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("1"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "The byte[]Amust not be null";
    org.apache.commons.lang.StringEscapeUtils.escapeJava(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "y";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeCsv(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("y"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = ")";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeJava(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(")"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "";
    org.apache.commons.lang.StringEscapeUtils.unescapeXml(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeCsv(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = " ";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeXml(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(" "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "8212";
    org.apache.commons.lang.StringEscapeUtils.unescapeHtml(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "=";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeSql(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("="), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "=";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeXml(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("="), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "18";
    org.apache.commons.lang.StringEscapeUtils.unescapeHtml(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeHtml(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "w";
    org.apache.commons.lang.StringEscapeUtils.unescapeJava(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "The Enum Class must not be null";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("The Enum Class must not be null"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "macT";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeCsv(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("macT"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "f";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeXml(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("f"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "S";
    org.apache.commons.lang.StringEscapeUtils.unescapeJava(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "EOa";
    org.apache.commons.lang.StringEscapeUtils.escapeCsv(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "F<";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeXml(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("F&lt;"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = "'953";
    org.apache.commons.lang.StringEscapeUtils.escapeHtml(((java.io.Writer)v0),((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "macr";
    org.apache.commons.lang.StringEscapeUtils.escapeHtml(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "Z";
    org.apache.commons.lang.StringEscapeUtils.unescapeXml(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = ":]";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeCsv(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(":]"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "d";
    org.apache.commons.lang.StringEscapeUtils.escapeJava(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "J";
    org.apache.commons.lang.StringEscapeUtils.unescapeJava(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "9";
    org.apache.commons.lang.StringEscapeUtils.unescapeXml(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "!";
    org.apache.commons.lang.StringEscapeUtils.escapeXml(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "clubs";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeCsv(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("clubs"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "The date must";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeSql(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("The date must"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "Array cannot be mpty.";
    org.apache.commons.lang.StringEscapeUtils.unescapeCsv(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeXml(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "RangeS";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeCsv(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("RangeS"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "X'";
    org.apache.commons.lang.StringEscapeUtils.unescapeJava(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "8756";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeHtml(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("8756"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "Zet";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeJava(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Zet"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "use,.home";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeSql(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("use,.home"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeXml(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    ((java.io.Writer)v0).flush();
    Object v1 = null;
    Object v2 = ":";
    org.apache.commons.lang.StringEscapeUtils.escapeHtml(((java.io.Writer)v0),((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "A+rray cannot be empty.";
    org.apache.commons.lang.StringEscapeUtils.escapeHtml(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "/";
    ((java.io.Writer)v0).write(((java.lang.String)v1));
    Object v2 = null;
    Object v3 = ";";
    org.apache.commons.lang.StringEscapeUtils.unescapeCsv(((java.io.Writer)v0),((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "Range[";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeCsv(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Range["), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "The numbers must not be null";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeCsv(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("The numbers must not be null"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "startIndex \"ust be valid";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeXml(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("startIndex \"ust be valid"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "\\F";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeCsv(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("\\F"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "Different enum class '";
    org.apache.commons.lang.StringEscapeUtils.unescapeCsv(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "\"";
    org.apache.commons.lang.StringEscapeUtils.escapeCsv(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = -8;
    ((java.io.Writer)v0).write((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = "The Array must not be null";
    org.apache.commons.lang.StringEscapeUtils.escapeCsv(((java.io.Writer)v0),((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "Range[";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeHtml(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Range["), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "icirc";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeHtml(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("icirc"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "914";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeSql(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("914"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    ((java.io.Writer)v0).close();
    Object v1 = null;
    Object v2 = "user.dir";
    org.apache.commons.lang.StringEscapeUtils.unescapeXml(((java.io.Writer)v0),((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "Z";
    org.apache.commons.lang.StringEscapeUtils.unescapeCsv(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "";
    org.apache.commons.lang.StringEscapeUtils.escapeCsv(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "igravve";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeJava(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("igravve"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = java.io.Writer.nullWriter();
    ((java.io.Writer)v0).close();
    Object v1 = null;
    Object v2 = "880*";
    org.apache.commons.lang.StringEscapeUtils.unescapeCsv(((java.io.Writer)v0),((java.lang.String)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.io.IOException");
    } catch (java.io.IOException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "Uacu";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeCsv(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Uacu"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "Range[";
    org.apache.commons.lang.StringEscapeUtils.escapeXml(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "[";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeHtml(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("["), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "B";
    org.apache.commons.lang.StringEscapeUtils.escapeXml(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "The nu0mbers must not be null";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeJava(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("The nu0mbers must not be null"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "[";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeJava(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("["), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = Character.valueOf((char)0);
    Object v2 = ((java.io.Writer)v0).append((((java.lang.Character)v1).charValue()));
    Object v3 = "''";
    org.apache.commons.lang.StringEscapeUtils.escapeHtml(((java.io.Writer)v0),((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "u";
    org.apache.commons.lang.StringEscapeUtils.escapeHtml(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "The validated map ks empty";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("The validated map ks empty"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "alpha";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeHtml(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("alpha"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "=\\";
    org.apache.commons.lang.StringEscapeUtils.escapeXml(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "8";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeCsv(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("8"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "Phi";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeHtml(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Phi"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "Windows";
    org.apache.commons.lang.StringEscapeUtils.unescapeHtml(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "Y";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("Y"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "~";
    org.apache.commons.lang.StringEscapeUtils.escapeJavaScript(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "Windows 96";
    org.apache.commons.lang.StringEscapeUtils.unescapeJava(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "The Enm Class must not be null";
    org.apache.commons.lang.StringEscapeUtils.unescapeXml(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "~ ";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeHtml(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("~ "), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = "w";
    org.apache.commons.lang.StringEscapeUtils.unescapeXml(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "25/3";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeXml(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("25/3"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "186";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeCsv(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("186"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "932";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.escapeCsv(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("932"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = new char[]{Character.valueOf((char)0)};
    ((java.io.Writer)v0).write(((char[])v1));
    Object v2 = null;
    Object v3 = "8855";
    org.apache.commons.lang.StringEscapeUtils.unescapeJavaScript(((java.io.Writer)v0),((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "\\u000";
    Object v1 = org.apache.commons.lang.StringEscapeUtils.unescapeXml(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("\\u000"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = java.io.Writer.nullWriter();
    Object v1 = " is not su&ported";
    org.apache.commons.lang.StringEscapeUtils.escapeXml(((java.io.Writer)v0),((java.lang.String)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }
}
