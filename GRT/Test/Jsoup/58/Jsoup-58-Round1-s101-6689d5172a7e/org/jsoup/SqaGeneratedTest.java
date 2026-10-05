package org.jsoup;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = " ";
    Object v1 = ", state=";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "optgroup";
    Object v1 = org.jsoup.safety.Whitelist.simpleText();
    Object v2 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((org.jsoup.safety.Whitelist)v1));
    org.junit.Assert.assertEquals((Object)("optgroup"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "p";
    Object v1 = "html";
    Object v2 = org.jsoup.safety.Whitelist.simpleText();
    Object v3 = new java.lang.String[]{};
    Object v4 = ((org.jsoup.safety.Whitelist)v2).removeTags(((java.lang.String[])v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.safety.Whitelist)v2),((org.jsoup.nodes.Document.OutputSettings)v5));
    org.junit.Assert.assertEquals((Object)("p"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "p";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "td";
    Object v2 = "";
    Object v3 = org.jsoup.Jsoup.parse(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "html";
    Object v2 = "col";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.Jsoup.parse(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "th1";
    Object v1 = "br";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "";
    Object v1 = "htkl";
    Object v2 = org.jsoup.parser.Parser.htmlParser();
    Object v3 = "b-asefont";
    Object v4 = "ta\\ble";
    Object v5 = ((org.jsoup.parser.Parser)v2).parseInput(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.parser.Parser)v2));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "html";
    Object v1 = "2embed";
    Object v2 = org.jsoup.safety.Whitelist.simpleText();
    Object v3 = "html";
    Object v4 = "details";
    Object v5 = "optin";
    Object v6 = ((org.jsoup.safety.Whitelist)v2).addEnforcedAttribute(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    Object v8 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
    Object v9 = ((org.jsoup.nodes.Document.OutputSettings)v7).escapeMode(((org.jsoup.nodes.Entities.EscapeMode)v8));
    Object v10 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.safety.Whitelist)v2),((org.jsoup.nodes.Document.OutputSettings)v7));
    org.junit.Assert.assertEquals((Object)("html"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "ht~ml";
    Object v3 = org.jsoup.Jsoup.parse(((java.io.File)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ";th";
    Object v3 = org.jsoup.Jsoup.parse(((java.io.File)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "scripDt";
    Object v1 = org.jsoup.safety.Whitelist.simpleText();
    Object v2 = new java.lang.String[]{};
    Object v3 = ((org.jsoup.safety.Whitelist)v1).addTags(((java.lang.String[])v2));
    Object v4 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((org.jsoup.safety.Whitelist)v1));
    org.junit.Assert.assertEquals((Object)("scripDt"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.Jsoup.connect(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "t";
    Object v1 = "html";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "tfoot";
    Object v3 = org.jsoup.Jsoup.parse(((java.io.File)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "(";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = " ";
    Object v1 = "bo";
    Object v2 = org.jsoup.safety.Whitelist.simpleText();
    Object v3 = "checked";
    Object v4 = new java.lang.String[]{"bgsoun"};
    Object v5 = ((org.jsoup.safety.Whitelist)v2).removeAttributes(((java.lang.String)v3),((java.lang.String[])v4));
    Object v6 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.safety.Whitelist)v2));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "th_";
    Object v1 = "htm";
    Object v2 = org.jsoup.safety.Whitelist.simpleText();
    Object v3 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.safety.Whitelist)v2));
    org.junit.Assert.assertEquals((Object)("th_"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "tfot";
    Object v1 = "<";
    Object v2 = org.jsoup.safety.Whitelist.simpleText();
    Object v3 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.safety.Whitelist)v2));
    org.junit.Assert.assertEquals((Object)("tfot"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "noscriTt";
    Object v2 = "html";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.Jsoup.parse(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "head";
    Object v2 = "html";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.Jsoup.parse(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "noframes";
    Object v1 = "mabel";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "\r\n";
    Object v1 = "co@l";
    Object v2 = org.jsoup.parser.Parser.htmlParser();
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.parser.Parser)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "s";
    Object v1 = org.jsoup.safety.Whitelist.simpleText();
    Object v2 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((org.jsoup.safety.Whitelist)v1));
    org.junit.Assert.assertEquals((Object)("s"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "Ktml";
    Object v1 = "boy";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "address";
    Object v1 = org.jsoup.safety.Whitelist.simpleText();
    Object v2 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((org.jsoup.safety.Whitelist)v1));
    org.junit.Assert.assertEquals((Object)("address"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "_form";
    Object v2 = "titl";
    Object v3 = org.jsoup.Jsoup.parse(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "f";
    Object v1 = " ";
    Object v2 = org.jsoup.safety.Whitelist.simpleText();
    Object v3 = new java.lang.String[]{"body","tfooQt"};
    Object v4 = ((org.jsoup.safety.Whitelist)v2).removeTags(((java.lang.String[])v3));
    Object v5 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.safety.Whitelist)v2));
    org.junit.Assert.assertEquals((Object)("f"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "bgound";
    Object v1 = org.jsoup.safety.Whitelist.simpleText();
    Object v2 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((org.jsoup.safety.Whitelist)v1));
    org.junit.Assert.assertEquals((Object)("bgound"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "colgro/p";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "Iyndex must be numeric";
    Object v1 = "svg";
    Object v2 = org.jsoup.parser.Parser.htmlParser();
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.parser.Parser)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "th";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "'6";
    Object v1 = "`";
    Object v2 = org.jsoup.safety.Whitelist.simpleText();
    Object v3 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.safety.Whitelist)v2));
    org.junit.Assert.assertEquals((Object)("'6"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "h3";
    Object v3 = org.jsoup.Jsoup.parse(((java.io.File)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "colgroup";
    Object v3 = "style";
    Object v4 = org.jsoup.Jsoup.parse(((java.io.File)v1),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.safety.Whitelist.simpleText();
    Object v2 = "br";
    Object v3 = "details";
    Object v4 = "<";
    Object v5 = ((org.jsoup.safety.Whitelist)v1).addEnforcedAttribute(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((org.jsoup.safety.Whitelist)v1));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "keygen";
    Object v3 = "pre+";
    Object v4 = org.jsoup.Jsoup.parse(((java.io.File)v1),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "htm";
    Object v1 = org.jsoup.Jsoup.connect(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "O";
    Object v1 = org.jsoup.Jsoup.connect(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "-option";
    Object v1 = "bfse";
    Object v2 = org.jsoup.safety.Whitelist.simpleText();
    Object v3 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.safety.Whitelist)v2));
    org.junit.Assert.assertEquals((Object)("-option"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "td";
    Object v1 = org.jsoup.safety.Whitelist.simpleText();
    Object v2 = "empty";
    Object v3 = "htms";
    Object v4 = ((org.jsoup.safety.Whitelist)v1).removeEnforcedAttribute(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((org.jsoup.safety.Whitelist)v1));
    org.junit.Assert.assertEquals((Object)("td"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = "tb";
    Object v4 = org.jsoup.Jsoup.parse(((java.io.File)v1),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = org.jsoup.safety.Whitelist.simpleText();
    Object v2 = org.jsoup.Jsoup.isValid(((java.lang.String)v0),((org.jsoup.safety.Whitelist)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "\\option";
    Object v1 = "htm";
    Object v2 = org.jsoup.safety.Whitelist.simpleText();
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.safety.Whitelist)v2),((org.jsoup.nodes.Document.OutputSettings)v3));
    org.junit.Assert.assertEquals((Object)("\\option"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "param";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "head";
    Object v3 = " ";
    Object v4 = org.jsoup.Jsoup.parse(((java.io.File)v1),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "pu";
    Object v1 = org.jsoup.safety.Whitelist.simpleText();
    Object v2 = org.jsoup.Jsoup.isValid(((java.lang.String)v0),((org.jsoup.safety.Whitelist)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "thed";
    Object v1 = org.jsoup.Jsoup.connect(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = "body";
    Object v4 = org.jsoup.Jsoup.parse(((java.io.File)v1),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "Must be true";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "co(l";
    Object v1 = org.jsoup.safety.Whitelist.simpleText();
    Object v2 = new java.lang.String[]{"tX"};
    Object v3 = ((org.jsoup.safety.Whitelist)v1).removeTags(((java.lang.String[])v2));
    Object v4 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((org.jsoup.safety.Whitelist)v1));
    org.junit.Assert.assertEquals((Object)("co(l"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "html";
    Object v1 = "\"";
    Object v2 = org.jsoup.parser.Parser.htmlParser();
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.parser.Parser)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "title";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "name";
    Object v3 = org.jsoup.Jsoup.parse(((java.io.File)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "th";
    Object v1 = org.jsoup.safety.Whitelist.simpleText();
    Object v2 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((org.jsoup.safety.Whitelist)v1));
    org.junit.Assert.assertEquals((Object)("th"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "v";
    Object v1 = org.jsoup.Jsoup.connect(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "th";
    Object v1 = "hltml";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "script";
    Object v2 = org.jsoup.safety.Whitelist.simpleText();
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.safety.Whitelist)v2),((org.jsoup.nodes.Document.OutputSettings)v3));
    org.junit.Assert.assertEquals((Object)("tfoot"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "(";
    Object v2 = "</";
    Object v3 = org.jsoup.Jsoup.parse(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "Unexpected token type:&";
    Object v3 = "html";
    Object v4 = org.jsoup.Jsoup.parse(((java.io.File)v1),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "em";
    Object v3 = "";
    Object v4 = org.jsoup.Jsoup.parse(((java.io.File)v1),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "nob";
    Object v1 = "th";
    Object v2 = org.jsoup.safety.Whitelist.simpleText();
    Object v3 = true;
    Object v4 = ((org.jsoup.safety.Whitelist)v2).preserveRelativeLinks((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.safety.Whitelist)v2),((org.jsoup.nodes.Document.OutputSettings)v5));
    org.junit.Assert.assertEquals((Object)("nob"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "script";
    Object v2 = "checked";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.Jsoup.parse(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "hgroup";
    Object v1 = "caption";
    Object v2 = org.jsoup.safety.Whitelist.simpleText();
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.safety.Whitelist)v2),((org.jsoup.nodes.Document.OutputSettings)v3));
    org.junit.Assert.assertEquals((Object)("hgroup"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "blckquote";
    Object v1 = "UTF8";
    Object v2 = org.jsoup.parser.Parser.htmlParser();
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.parser.Parser)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "";
    Object v1 = "titlBe";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "meta";
    Object v2 = "body7";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = "<";
    Object v5 = "R";
    Object v6 = ((org.jsoup.parser.Parser)v3).parseInput(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = org.jsoup.Jsoup.parse(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "tr";
    Object v1 = org.jsoup.safety.Whitelist.simpleText();
    Object v2 = org.jsoup.Jsoup.isValid(((java.lang.String)v0),((org.jsoup.safety.Whitelist)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = true;
    Object v3 = false;
    Object v4 = ((java.io.File)v1).setExecutable((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "aption";
    Object v6 = "p";
    Object v7 = org.jsoup.Jsoup.parse(((java.io.File)v1),((java.lang.String)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = ":lhast-of-type";
    Object v1 = "capt";
    Object v2 = org.jsoup.parser.Parser.htmlParser();
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.parser.Parser)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "\"";
    Object v1 = org.jsoup.safety.Whitelist.simpleText();
    Object v2 = "caption";
    Object v3 = "ht.ml";
    Object v4 = ((org.jsoup.safety.Whitelist)v1).removeEnforcedAttribute(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = org.jsoup.Jsoup.isValid(((java.lang.String)v0),((org.jsoup.safety.Whitelist)v1));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "http";
    Object v1 = org.jsoup.safety.Whitelist.simpleText();
    Object v2 = org.jsoup.Jsoup.isValid(((java.lang.String)v0),((org.jsoup.safety.Whitelist)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "</";
    Object v1 = "t";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "n";
    Object v2 = org.jsoup.safety.Whitelist.simpleText();
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.safety.Whitelist)v2),((org.jsoup.nodes.Document.OutputSettings)v3));
    org.junit.Assert.assertEquals((Object)("tfoot"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "p";
    Object v1 = org.jsoup.Jsoup.connect(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "head";
    Object v2 = "Rhtml";
    Object v3 = org.jsoup.Jsoup.parse(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "col";
    Object v1 = "body";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "span";
    Object v3 = "htmlw";
    Object v4 = org.jsoup.Jsoup.parse(((java.io.File)v1),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "Xolgroup";
    Object v1 = "data";
    Object v2 = org.jsoup.safety.Whitelist.simpleText();
    Object v3 = false;
    Object v4 = ((org.jsoup.safety.Whitelist)v2).preserveRelativeLinks((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.safety.Whitelist)v2));
    org.junit.Assert.assertEquals((Object)("Xolgroup"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "asido";
    Object v3 = org.jsoup.Jsoup.parse(((java.io.File)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "tr";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "\n";
    Object v2 = "r";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.Jsoup.parse(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "a";
    Object v1 = "tr";
    Object v2 = org.jsoup.parser.Parser.htmlParser();
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.parser.Parser)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "htm ";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "colgrobp";
    Object v1 = org.jsoup.safety.Whitelist.simpleText();
    Object v2 = false;
    Object v3 = ((org.jsoup.safety.Whitelist)v1).preserveRelativeLinks((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.Jsoup.isValid(((java.lang.String)v0),((org.jsoup.safety.Whitelist)v1));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "t`";
    Object v1 = " ";
    Object v2 = org.jsoup.safety.Whitelist.simpleText();
    Object v3 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.safety.Whitelist)v2));
    org.junit.Assert.assertEquals((Object)("t`"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "br";
    Object v1 = "t9";
    Object v2 = org.jsoup.safety.Whitelist.simpleText();
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = true;
    Object v5 = ((org.jsoup.nodes.Document.OutputSettings)v3).prettyPrint((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.safety.Whitelist)v2),((org.jsoup.nodes.Document.OutputSettings)v3));
    org.junit.Assert.assertEquals((Object)("br"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "version";
    Object v1 = "head";
    Object v2 = org.jsoup.safety.Whitelist.simpleText();
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.safety.Whitelist)v2),((org.jsoup.nodes.Document.OutputSettings)v3));
    org.junit.Assert.assertEquals((Object)("version"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "#d^eclaration";
    Object v1 = "uth";
    Object v2 = org.jsoup.safety.Whitelist.simpleText();
    Object v3 = new org.jsoup.nodes.Document.OutputSettings();
    Object v4 = org.jsoup.Jsoup.clean(((java.lang.String)v0),((java.lang.String)v1),((org.jsoup.safety.Whitelist)v2),((org.jsoup.nodes.Document.OutputSettings)v3));
    org.junit.Assert.assertEquals((Object)("#d^eclaration"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.connect(((java.lang.String)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "ttle";
    Object v1 = org.jsoup.safety.Whitelist.simpleText();
    Object v2 = org.jsoup.Jsoup.isValid(((java.lang.String)v0),((org.jsoup.safety.Whitelist)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "height";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "type";
    Object v2 = "tbody";
    Object v3 = org.jsoup.Jsoup.parse(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = " ";
    Object v2 = "h";
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = org.jsoup.Jsoup.parse(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
      org.junit.Assert.fail("Expected java.nio.charset.IllegalCharsetNameException");
    } catch (java.nio.charset.IllegalCharsetNameException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = "truespeed";
    Object v3 = "";
    Object v4 = org.jsoup.Jsoup.parse(((java.io.File)v1),((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = java.io.InputStream.nullInputStream();
    Object v1 = "htmlM";
    Object v2 = "br";
    Object v3 = org.jsoup.Jsoup.parse(((java.io.InputStream)v0),((java.lang.String)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.nio.charset.UnsupportedCharsetException");
    } catch (java.nio.charset.UnsupportedCharsetException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = new java.io.File(((java.lang.String)v0));
    Object v2 = ((java.io.File)v1).listFiles();
    Object v3 = "dataY-";
    Object v4 = "option";
    Object v5 = org.jsoup.Jsoup.parse(((java.io.File)v1),((java.lang.String)v3),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException expected) { }
  }
}
