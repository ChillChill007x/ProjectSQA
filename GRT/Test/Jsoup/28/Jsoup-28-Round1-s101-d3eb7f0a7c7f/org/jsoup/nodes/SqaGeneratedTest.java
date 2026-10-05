package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "htm";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "buody";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "DoctypePublicIdentifier_singleQuoted";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "table";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("table"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "select";
    Object v1 = new org.jsoup.nodes.Document.OutputSettings();
    Object v2 = ((org.jsoup.nodes.Document.OutputSettings)v1).clone();
    Object v3 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
    org.junit.Assert.assertEquals((Object)("select"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "tr";
    Object v1 = org.jsoup.nodes.Entities.isNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "K";
    Object v1 = org.jsoup.nodes.Entities.isNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "r";
    Object v1 = new org.jsoup.nodes.Document.OutputSettings();
    Object v2 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
    org.junit.Assert.assertEquals((Object)("r"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(""), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "html";
    Object v1 = true;
    Object v2 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)("html"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "cde";
    Object v1 = null;
    Object v2 = org.jsoup.nodes.Entities.EscapeMode.base;
    Object v3 = ((java.lang.Enum)v2).getDeclaringClass();
    Object v4 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1),((org.jsoup.nodes.Entities.EscapeMode)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "table";
    Object v1 = org.jsoup.nodes.Entities.isNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "head";
    Object v1 = org.jsoup.nodes.Entities.isNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = null;
    Object v2 = org.jsoup.nodes.Entities.EscapeMode.extended;
    Object v3 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1),((org.jsoup.nodes.Entities.EscapeMode)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "optgroup";
    Object v1 = new org.jsoup.nodes.Document.OutputSettings();
    Object v2 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
    org.junit.Assert.assertEquals((Object)("optgroup"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "=";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "tm";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "button";
    Object v1 = null;
    Object v2 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
    Object v3 = ((java.lang.Enum)v2).getDeclaringClass();
    Object v4 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1),((org.jsoup.nodes.Entities.EscapeMode)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "";
    Object v1 = null;
    Object v2 = org.jsoup.nodes.Entities.EscapeMode.extended;
    Object v3 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1),((org.jsoup.nodes.Entities.EscapeMode)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "h";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("h"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "th";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "a";
    Object v1 = null;
    Object v2 = org.jsoup.nodes.Entities.EscapeMode.base;
    Object v3 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1),((org.jsoup.nodes.Entities.EscapeMode)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "co";
    Object v1 = null;
    Object v2 = org.jsoup.nodes.Entities.EscapeMode.extended;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1),((org.jsoup.nodes.Entities.EscapeMode)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Entities.isNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "nobr";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "colgroup";
    Object v1 = false;
    Object v2 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)("colgroup"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "thead";
    Object v1 = org.jsoup.nodes.Entities.isNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "trike";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "head";
    Object v1 = true;
    Object v2 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)("head"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("tfoot"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "thead";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "usage: supply url to fetch";
    Object v1 = null;
    Object v2 = org.jsoup.nodes.Entities.EscapeMode.extended;
    Object v3 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1),((org.jsoup.nodes.Entities.EscapeMode)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Entities.isNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "c]olgroup";
    Object v1 = new org.jsoup.nodes.Document.OutputSettings();
    Object v2 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
    org.junit.Assert.assertEquals((Object)("c]olgroup"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "hea-";
    Object v1 = org.jsoup.nodes.Entities.isNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "footer";
    Object v1 = null;
    Object v2 = org.jsoup.nodes.Entities.EscapeMode.extended;
    Object v3 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1),((org.jsoup.nodes.Entities.EscapeMode)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "h@3";
    Object v1 = org.jsoup.nodes.Entities.isNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "td";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "wid?h";
    Object v1 = new org.jsoup.nodes.Document.OutputSettings();
    Object v2 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
    org.junit.Assert.assertEquals((Object)("wid?h"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document.OutputSettings();
    Object v2 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "hgroup";
    Object v1 = new org.jsoup.nodes.Document.OutputSettings();
    Object v2 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
    org.junit.Assert.assertEquals((Object)("hgroup"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "tbody";
    Object v1 = new org.jsoup.nodes.Document.OutputSettings();
    Object v2 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
    org.junit.Assert.assertEquals((Object)("tbody"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "h4";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("h4"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "html";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("html"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "tab";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "td";
    Object v1 = null;
    Object v2 = org.jsoup.nodes.Entities.EscapeMode.base;
    Object v3 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1),((org.jsoup.nodes.Entities.EscapeMode)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "UTS-8";
    Object v1 = org.jsoup.nodes.Entities.isNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "select";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "the4d";
    Object v1 = new org.jsoup.nodes.Document.OutputSettings();
    Object v2 = ((org.jsoup.nodes.Document.OutputSettings)v1).clone();
    Object v3 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
    org.junit.Assert.assertEquals((Object)("the4d"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "wbr";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "th";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "miter";
    Object v1 = org.jsoup.nodes.Entities.isNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "Ocol";
    Object v1 = new org.jsoup.nodes.Document.OutputSettings();
    Object v2 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
    org.junit.Assert.assertEquals((Object)("Ocol"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "bodHy";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "head";
    Object v1 = new org.jsoup.nodes.Document.OutputSettings();
    Object v2 = org.jsoup.nodes.Entities.EscapeMode.xhtml;
    Object v3 = ((org.jsoup.nodes.Document.OutputSettings)v1).escapeMode(((org.jsoup.nodes.Entities.EscapeMode)v2));
    Object v4 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
    org.junit.Assert.assertEquals((Object)("head"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "atml";
    Object v1 = true;
    Object v2 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)("atml"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "ht";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("ht"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = ":ody";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "strike";
    Object v1 = true;
    Object v2 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)("strike"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "tbody";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "tX";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("tX"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = ":noscript";
    Object v1 = true;
    Object v2 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(":noscript"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "t(h";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "colgroup";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "cob";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "caption";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "ol";
    Object v1 = new org.jsoup.nodes.Document.OutputSettings();
    Object v2 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
    org.junit.Assert.assertEquals((Object)("ol"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "input";
    Object v1 = new org.jsoup.nodes.Document.OutputSettings();
    Object v2 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
    org.junit.Assert.assertEquals((Object)("input"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "";
    Object v1 = false;
    Object v2 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "captio";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "hgrouDp";
    Object v1 = new org.jsoup.nodes.Document.OutputSettings();
    Object v2 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
    org.junit.Assert.assertEquals((Object)("hgrouDp"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "]]>";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = ">";
    Object v1 = null;
    Object v2 = org.jsoup.nodes.Entities.EscapeMode.extended;
    Object v3 = ((java.lang.Enum)v2).getDeclaringClass();
    Object v4 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1),((org.jsoup.nodes.Entities.EscapeMode)v2));
    org.junit.Assert.assertEquals((Object)("&gt;"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "fiBure";
    Object v1 = new org.jsoup.nodes.Document.OutputSettings();
    Object v2 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
    org.junit.Assert.assertEquals((Object)("fiBure"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "htm";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("htm"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "http";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = new org.jsoup.nodes.Document.OutputSettings();
    Object v2 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
    org.junit.Assert.assertEquals((Object)("tfoot"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "td";
    Object v1 = org.jsoup.nodes.Entities.isNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "bod";
    Object v1 = org.jsoup.nodes.Entities.isNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "tabl";
    Object v1 = new org.jsoup.nodes.Document.OutputSettings();
    Object v2 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
    org.junit.Assert.assertEquals((Object)("tabl"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "class";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("class"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "   ";
    Object v1 = null;
    Object v2 = org.jsoup.nodes.Entities.EscapeMode.base;
    Object v3 = ((java.lang.Enum)v2).hashCode();
    Object v4 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((java.nio.charset.CharsetEncoder)v1),((org.jsoup.nodes.Entities.EscapeMode)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "body";
    Object v1 = true;
    Object v2 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)("body"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "b";
    Object v1 = new org.jsoup.nodes.Document.OutputSettings();
    Object v2 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
    org.junit.Assert.assertEquals((Object)("b"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "option";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("option"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "summar{";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "p";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("p"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "c";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("c"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "device";
    Object v1 = org.jsoup.nodes.Entities.getCharacterByName(((java.lang.String)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "ix";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "html";
    Object v1 = new org.jsoup.nodes.Document.OutputSettings();
    Object v2 = org.jsoup.nodes.Entities.escape(((java.lang.String)v0),((org.jsoup.nodes.Document.OutputSettings)v1));
    org.junit.Assert.assertEquals((Object)("html"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "h";
    Object v1 = org.jsoup.nodes.Entities.isNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "htm";
    Object v1 = org.jsoup.nodes.Entities.isNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "col";
    Object v1 = org.jsoup.nodes.Entities.isBaseNamedEntity(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "N";
    Object v1 = false;
    Object v2 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)("N"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "br";
    Object v1 = org.jsoup.nodes.Entities.unescape(((java.lang.String)v0));
    org.junit.Assert.assertEquals((Object)("br"), v1);
  }
}
