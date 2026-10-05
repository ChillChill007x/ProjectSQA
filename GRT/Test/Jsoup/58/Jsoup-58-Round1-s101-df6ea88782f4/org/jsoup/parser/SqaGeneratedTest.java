package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = "tbody";
    Object v3 = "b_dy";
    Object v4 = ((org.jsoup.parser.Parser)v1).parseInput(((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "b";
    Object v1 = "br";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = ">";
    Object v3 = "option";
    Object v4 = ((org.jsoup.parser.Parser)v1).parseInput(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.parser.Parser)v1).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = ((org.jsoup.parser.Parser)v1).getTreeBuilder();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = ((org.jsoup.parser.Parser)v1).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "p";
    Object v1 = false;
    Object v2 = org.jsoup.parser.Parser.unescapeEntities(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)("p"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "titl2";
    Object v1 = false;
    Object v2 = org.jsoup.parser.Parser.unescapeEntities(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)("titl2"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = ((org.jsoup.parser.Parser)v1).getErrors();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "radio";
    Object v1 = ">";
    Object v2 = org.jsoup.parser.Parser.parseXmlFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = "td";
    Object v2 = "";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = new org.jsoup.parser.XmlTreeBuilder();
    Object v2 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v1));
    Object v3 = ((org.jsoup.parser.Parser)v2).getTreeBuilder();
    Object v4 = ((org.jsoup.parser.Parser)v0).setTreeBuilder(((org.jsoup.parser.TreeBuilder)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "html";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseXmlFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "Content-";
    Object v1 = org.jsoup.parser.Parser.htmlParser();
    Object v2 = "td";
    Object v3 = "";
    Object v4 = ((org.jsoup.parser.Parser)v1).parseInput(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "html";
    Object v6 = ((org.jsoup.nodes.Element)v4).getElementById(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = org.jsoup.parser.Parser.parseFragment(((java.lang.String)v0),((org.jsoup.nodes.Element)v4),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = "codE";
    Object v2 = "h";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = ((org.jsoup.parser.Parser)v1).getTreeBuilder();
    Object v3 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "basefon-";
    Object v1 = "(";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "h2";
    Object v1 = "h";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = " ";
    Object v1 = "h2";
    Object v2 = "h";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "</";
    Object v5 = 0;
    Object v6 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v5).intValue()));
    ((java.util.ArrayList)v6).clear();
    Object v7 = null;
    Object v8 = org.jsoup.parser.Parser.parseFragment(((java.lang.String)v0),((org.jsoup.nodes.Element)v3),((java.lang.String)v4),((org.jsoup.parser.ParseErrorList)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = ((org.jsoup.parser.Parser)v0).getTreeBuilder();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "InTable";
    Object v1 = "tfoo";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = "tahead";
    Object v2 = "tbody";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "tbody";
    Object v1 = "basefon-";
    Object v2 = "(";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "bgsoun";
    Object v5 = org.jsoup.parser.Parser.parseFragment(((java.lang.String)v0),((org.jsoup.nodes.Element)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = "<";
    Object v2 = "C";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "colgrou^";
    Object v1 = "table";
    Object v2 = org.jsoup.parser.Parser.parse(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = ((org.jsoup.parser.Parser)v0).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "label";
    Object v1 = "InTable";
    Object v2 = "tfoo";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "AfterBody";
    Object v5 = 0;
    Object v6 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v5).intValue()));
    Object v7 = org.jsoup.parser.Parser.parseFragment(((java.lang.String)v0),((org.jsoup.nodes.Element)v3),((java.lang.String)v4),((org.jsoup.parser.ParseErrorList)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = ((org.jsoup.parser.Parser)v1).getTreeBuilder();
    Object v3 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v2));
    Object v4 = "z";
    Object v5 = "tQr";
    Object v6 = ((org.jsoup.parser.Parser)v3).parseInput(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "co@l";
    Object v8 = "t1";
    Object v9 = ((org.jsoup.parser.Parser)v3).parseInput(((java.lang.String)v7),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "tf'oot";
    Object v1 = "li";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = true;
    Object v2 = false;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jsoup.parser.Parser)v0).settings(((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Parser)v0).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "script";
    Object v1 = "h6";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = "tfoHt";
    Object v2 = "abs:href";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = true;
    Object v5 = false;
    Object v6 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jsoup.parser.Parser)v0).settings(((org.jsoup.parser.ParseSettings)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "td";
    Object v1 = "Yhead";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = 0;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = ((org.jsoup.parser.Parser)v3).getTreeBuilder();
    Object v5 = ((org.jsoup.parser.Parser)v0).setTreeBuilder(((org.jsoup.parser.TreeBuilder)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = "ralue";
    Object v2 = "=";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "BeforeAttributeValue";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parse(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = 0;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = ((org.jsoup.parser.Parser)v3).getTreeBuilder();
    Object v5 = ((org.jsoup.parser.Parser)v0).setTreeBuilder(((org.jsoup.parser.TreeBuilder)v4));
    Object v6 = true;
    Object v7 = false;
    Object v8 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.jsoup.parser.Parser)v5).settings(((org.jsoup.parser.ParseSettings)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "captio";
    Object v1 = "head";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "coM";
    Object v1 = "thead";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "colgro;p";
    Object v1 = "html";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = "Ktml";
    Object v2 = "boy";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = 34;
    Object v5 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = ((org.jsoup.parser.Parser)v0).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = 0;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = ((org.jsoup.parser.Parser)v3).getTreeBuilder();
    Object v5 = ((org.jsoup.parser.Parser)v0).setTreeBuilder(((org.jsoup.parser.TreeBuilder)v4));
    Object v6 = "_form";
    Object v7 = "titl";
    Object v8 = ((org.jsoup.parser.Parser)v5).parseInput(((java.lang.String)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = ((org.jsoup.parser.Parser)v1).getTreeBuilder();
    Object v3 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v2));
    Object v4 = ((org.jsoup.parser.Parser)v3).getErrors();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = "tfoHt";
    Object v2 = "abs:href";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = true;
    Object v5 = false;
    Object v6 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jsoup.parser.Parser)v0).settings(((org.jsoup.parser.ParseSettings)v6));
    Object v8 = ((org.jsoup.parser.Parser)v7).settings();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = ((org.jsoup.parser.Parser)v0).settings();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = ((org.jsoup.parser.Parser)v0).getErrors();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "col";
    Object v1 = "br";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "";
    Object v1 = "t|";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "t";
    Object v1 = "Iyndex must be numeric";
    Object v2 = org.jsoup.parser.Parser.parse(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = 0;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = ((org.jsoup.parser.Parser)v3).getTreeBuilder();
    Object v5 = ((org.jsoup.parser.Parser)v0).setTreeBuilder(((org.jsoup.parser.TreeBuilder)v4));
    Object v6 = ((org.jsoup.parser.Parser)v5).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "c\"te";
    Object v1 = false;
    Object v2 = org.jsoup.parser.Parser.unescapeEntities(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)("c\"te"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = true;
    Object v2 = false;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jsoup.parser.Parser)v0).settings(((org.jsoup.parser.ParseSettings)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "html";
    Object v1 = "brp";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "br";
    Object v1 = "small";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = org.jsoup.parser.Parser.htmlParser();
    Object v2 = ((org.jsoup.parser.Parser)v1).settings();
    Object v3 = ((org.jsoup.parser.Parser)v0).settings(((org.jsoup.parser.ParseSettings)v2));
    Object v4 = ((org.jsoup.parser.Parser)v0).getErrors();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = ":last-child";
    Object v2 = "+ ";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = 1;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "html";
    Object v1 = "1";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = "-";
    Object v2 = "samp";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "";
    Object v1 = "readonl";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "caption";
    Object v1 = "html";
    Object v2 = "brp";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "menu0";
    Object v5 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v4));
    Object v6 = " ";
    Object v7 = org.jsoup.parser.Parser.parseFragment(((java.lang.String)v0),((org.jsoup.nodes.Element)v3),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = true;
    Object v2 = false;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jsoup.parser.Parser)v0).settings(((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Parser)v0).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "l";
    Object v1 = ")";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = org.jsoup.parser.Parser.htmlParser();
    Object v2 = ((org.jsoup.parser.Parser)v1).settings();
    Object v3 = ((org.jsoup.parser.Parser)v0).settings(((org.jsoup.parser.ParseSettings)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = "";
    Object v2 = "d";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "tbody";
    Object v5 = "Gr";
    Object v6 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "span";
    Object v1 = "K";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = 1;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    Object v3 = "basefon4t";
    Object v4 = "noframes";
    Object v5 = ((org.jsoup.parser.Parser)v2).parseInput(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "htl";
    Object v1 = "tfoo";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = ((org.jsoup.parser.Parser)v1).getTreeBuilder();
    Object v3 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v2));
    Object v4 = "t";
    Object v5 = "html";
    Object v6 = ((org.jsoup.parser.Parser)v3).parseInput(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = "tab";
    Object v2 = "title";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "caption";
    Object v1 = "InColumnGroup";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = "col";
    Object v2 = "head";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "i";
    Object v1 = "li";
    Object v2 = org.jsoup.parser.Parser.parseXmlFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = "Ocol";
    Object v2 = "html";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "#";
    Object v5 = "'";
    Object v6 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = ((org.jsoup.parser.Parser)v1).getTreeBuilder();
    Object v3 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v2));
    Object v4 = ((org.jsoup.parser.Parser)v3).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = true;
    Object v2 = false;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jsoup.parser.Parser)v0).settings(((org.jsoup.parser.ParseSettings)v3));
    Object v5 = ((org.jsoup.parser.Parser)v4).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = "tfoHt";
    Object v2 = "abs:href";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = true;
    Object v5 = false;
    Object v6 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jsoup.parser.Parser)v0).settings(((org.jsoup.parser.ParseSettings)v6));
    Object v8 = "height";
    Object v9 = "colgroup";
    Object v10 = ((org.jsoup.parser.Parser)v7).parseInput(((java.lang.String)v8),((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = 0;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = ((org.jsoup.parser.Parser)v3).getTreeBuilder();
    Object v5 = ((org.jsoup.parser.Parser)v0).setTreeBuilder(((org.jsoup.parser.TreeBuilder)v4));
    Object v6 = ((org.jsoup.parser.Parser)v5).getErrors();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = 0;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.parser.Parser)v0).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "thead";
    Object v1 = ":matches(regex) query must not be empty";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "bodyN";
    Object v1 = "basefon%";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "caption";
    Object v1 = "thea";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = "tfoHt";
    Object v2 = "abs:href";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = true;
    Object v5 = false;
    Object v6 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jsoup.parser.Parser)v0).settings(((org.jsoup.parser.ParseSettings)v6));
    Object v8 = "=\"";
    Object v9 = "2h5";
    Object v10 = ((org.jsoup.parser.Parser)v7).parseInput(((java.lang.String)v8),((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "";
    Object v1 = "basefon-";
    Object v2 = "(";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "bodty";
    Object v5 = 0;
    Object v6 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v5).intValue()));
    Object v7 = org.jsoup.parser.Parser.parseFragment(((java.lang.String)v0),((org.jsoup.nodes.Element)v3),((java.lang.String)v4),((org.jsoup.parser.ParseErrorList)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = "tfoHt";
    Object v2 = "abs:href";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = true;
    Object v5 = false;
    Object v6 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jsoup.parser.Parser)v0).settings(((org.jsoup.parser.ParseSettings)v6));
    Object v8 = "th";
    Object v9 = "{";
    Object v10 = ((org.jsoup.parser.Parser)v7).parseInput(((java.lang.String)v8),((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = "ScriptDataEndTagName";
    Object v2 = "html";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = org.jsoup.parser.Parser.htmlParser();
    Object v2 = ((org.jsoup.parser.Parser)v1).settings();
    Object v3 = ((org.jsoup.parser.Parser)v0).settings(((org.jsoup.parser.ParseSettings)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.parser.Parser)v3).setTrackErrors((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jsoup.parser.Parser)v3).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "thead";
    Object v1 = "base";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = "tfoHt";
    Object v2 = "abs:href";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = true;
    Object v5 = false;
    Object v6 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jsoup.parser.Parser)v0).settings(((org.jsoup.parser.ParseSettings)v6));
    Object v8 = "body";
    Object v9 = "t";
    Object v10 = ((org.jsoup.parser.Parser)v7).parseInput(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "th";
    Object v12 = "caption";
    Object v13 = ((org.jsoup.parser.Parser)v7).parseInput(((java.lang.String)v11),((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "capt";
    Object v1 = ">";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "al";
    Object v1 = "basefo`t";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = "tfoot";
    Object v2 = "htmJ";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "g";
    Object v1 = "b$dy";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = "tr";
    Object v2 = "`img";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "caption";
    Object v1 = "colgroup";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = org.jsoup.parser.Parser.htmlParser();
    Object v2 = ((org.jsoup.parser.Parser)v1).settings();
    Object v3 = ((org.jsoup.parser.Parser)v0).settings(((org.jsoup.parser.ParseSettings)v2));
    Object v4 = "smalVl";
    Object v5 = "AfIerBody";
    Object v6 = ((org.jsoup.parser.Parser)v3).parseInput(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = 1;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    Object v3 = "tr";
    Object v4 = "";
    Object v5 = ((org.jsoup.parser.Parser)v2).parseInput(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }
}
