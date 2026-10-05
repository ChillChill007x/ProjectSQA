package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = "thead";
    Object v3 = "_frame";
    Object v4 = ((org.jsoup.parser.Parser)v1).parseInput(((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "lib";
    Object v1 = "html";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = "DoctypePublicIdentifier_singleQuoted";
    Object v3 = "satyle";
    Object v4 = ((org.jsoup.parser.Parser)v1).parseInput(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.parser.Parser)v1).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = -17;
    Object v3 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "p>";
    Object v1 = "htm}";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "body";
    Object v1 = "command";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "caption";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = -17;
    Object v3 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v4).intValue()));
    Object v6 = "nav";
    Object v7 = "";
    Object v8 = ((org.jsoup.parser.Parser)v5).parseInput(((java.lang.String)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = ((org.jsoup.parser.Parser)v0).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "html";
    Object v1 = new org.jsoup.parser.XmlTreeBuilder();
    Object v2 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v1));
    Object v3 = -17;
    Object v4 = ((org.jsoup.parser.Parser)v2).setTrackErrors((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = ((org.jsoup.parser.Parser)v2).setTrackErrors((((java.lang.Integer)v5).intValue()));
    Object v7 = "nav";
    Object v8 = "";
    Object v9 = ((org.jsoup.parser.Parser)v6).parseInput(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "buttonO";
    Object v11 = org.jsoup.parser.Parser.parseFragment(((java.lang.String)v0),((org.jsoup.nodes.Element)v9),((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "hea\"";
    Object v1 = "t~";
    Object v2 = org.jsoup.parser.Parser.parse(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = 0;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.parser.Parser)v0).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "Vhtml";
    Object v1 = "httml";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = ((org.jsoup.parser.Parser)v0).getErrors();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = " ";
    Object v2 = "html";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = -17;
    Object v3 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v4).intValue()));
    Object v6 = "b";
    Object v7 = "E";
    Object v8 = ((org.jsoup.parser.Parser)v5).parseInput(((java.lang.String)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "t8h";
    Object v1 = "Vhtml";
    Object v2 = "httml";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "nofram";
    Object v5 = org.jsoup.parser.Parser.parseFragment(((java.lang.String)v0),((org.jsoup.nodes.Element)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = -17;
    Object v3 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v4).intValue()));
    Object v6 = "body";
    Object v7 = "</";
    Object v8 = ((org.jsoup.parser.Parser)v5).parseInput(((java.lang.String)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "-";
    Object v1 = "col}roup";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = "button";
    Object v2 = "y";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = "details";
    Object v2 = "html";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "noframes";
    Object v1 = "</";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "wbr";
    Object v1 = "t";
    Object v2 = org.jsoup.parser.Parser.parse(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = "seleact";
    Object v2 = "thead";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "thead";
    Object v1 = "td";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = 1;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    Object v3 = "i";
    Object v4 = "data-";
    Object v5 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = -18;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    Object v3 = "";
    Object v4 = "t";
    Object v5 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = 65531;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.parser.Parser)v0).getTreeBuilder();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "captio";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = ((org.jsoup.parser.Parser)v0).getTreeBuilder();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = -17;
    Object v3 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v4).intValue()));
    Object v6 = 27;
    Object v7 = ((org.jsoup.parser.Parser)v5).setTrackErrors((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "ol";
    Object v1 = "br";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "hUtml";
    Object v1 = "html";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = new org.jsoup.parser.XmlTreeBuilder();
    Object v2 = ((org.jsoup.parser.Parser)v0).setTreeBuilder(((org.jsoup.parser.TreeBuilder)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = -17;
    Object v3 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jsoup.parser.Parser)v5).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = new org.jsoup.parser.XmlTreeBuilder();
    Object v2 = ((org.jsoup.parser.Parser)v0).setTreeBuilder(((org.jsoup.parser.TreeBuilder)v1));
    Object v3 = ((org.jsoup.parser.Parser)v2).getTreeBuilder();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = ((org.jsoup.parser.Parser)v0).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = -17;
    Object v3 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v4).intValue()));
    Object v6 = "caption";
    Object v7 = "G";
    Object v8 = ((org.jsoup.parser.Parser)v5).parseInput(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.parser.Parser)v5).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = " ";
    Object v2 = "";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = 0;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = -70;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "htm";
    Object v1 = "RCDATAEndTagNa";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "cap";
    Object v1 = "xh";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = org.jsoup.parser.Parser.xmlParser();
    Object v2 = ((org.jsoup.parser.Parser)v1).getTreeBuilder();
    Object v3 = ((org.jsoup.parser.Parser)v0).setTreeBuilder(((org.jsoup.parser.TreeBuilder)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "Could not parse attribute qery '%s': unexpected token at '%s'";
    Object v1 = true;
    Object v2 = org.jsoup.parser.Parser.unescapeEntities(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)("Could not parse attribute qery '%s': unexpected token at '%s'"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "Referrer mustvnot be null";
    Object v1 = "tbody";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "d+";
    Object v1 = true;
    Object v2 = org.jsoup.parser.Parser.unescapeEntities(((java.lang.String)v0),(((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)("d+"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = -17;
    Object v3 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v4).intValue()));
    Object v6 = 27;
    Object v7 = ((org.jsoup.parser.Parser)v5).setTrackErrors((((java.lang.Integer)v6).intValue()));
    Object v8 = 41;
    Object v9 = ((org.jsoup.parser.Parser)v7).setTrackErrors((((java.lang.Integer)v8).intValue()));
    Object v10 = "tfot";
    Object v11 = "h6_";
    Object v12 = ((org.jsoup.parser.Parser)v7).parseInput(((java.lang.String)v10),((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = -17;
    Object v3 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v4).intValue()));
    Object v6 = 27;
    Object v7 = ((org.jsoup.parser.Parser)v5).setTrackErrors((((java.lang.Integer)v6).intValue()));
    Object v8 = "usage: supply url to fetch";
    Object v9 = "td";
    Object v10 = ((org.jsoup.parser.Parser)v7).parseInput(((java.lang.String)v8),((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = org.jsoup.parser.Parser.xmlParser();
    Object v2 = ((org.jsoup.parser.Parser)v1).getTreeBuilder();
    Object v3 = ((org.jsoup.parser.Parser)v0).setTreeBuilder(((org.jsoup.parser.TreeBuilder)v2));
    Object v4 = "frame";
    Object v5 = "[";
    Object v6 = ((org.jsoup.parser.Parser)v3).parseInput(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "div";
    Object v1 = "html";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "br";
    Object v1 = "|";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = -70;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.parser.Parser)v2).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = -70;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    Object v3 = "track";
    Object v4 = "html";
    Object v5 = ((org.jsoup.parser.Parser)v2).parseInput(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = org.jsoup.parser.Parser.xmlParser();
    Object v2 = ((org.jsoup.parser.Parser)v1).getTreeBuilder();
    Object v3 = ((org.jsoup.parser.Parser)v0).setTreeBuilder(((org.jsoup.parser.TreeBuilder)v2));
    Object v4 = "me";
    Object v5 = ">";
    Object v6 = ((org.jsoup.parser.Parser)v3).parseInput(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "tablF";
    Object v1 = "</";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "2olgroup";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = org.jsoup.parser.Parser.htmlParser();
    Object v2 = 65531;
    Object v3 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.jsoup.parser.Parser)v1).getTreeBuilder();
    Object v5 = ((org.jsoup.parser.Parser)v0).setTreeBuilder(((org.jsoup.parser.TreeBuilder)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "tr";
    Object v1 = "strong";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "html";
    Object v1 = "figcaption";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = -17;
    Object v3 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v4).intValue()));
    Object v6 = 27;
    Object v7 = ((org.jsoup.parser.Parser)v5).setTrackErrors((((java.lang.Integer)v6).intValue()));
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = ((org.jsoup.parser.Parser)v8).getTreeBuilder();
    Object v10 = ((org.jsoup.parser.Parser)v7).setTreeBuilder(((org.jsoup.parser.TreeBuilder)v9));
    Object v11 = ((org.jsoup.parser.Parser)v7).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "style";
    Object v1 = "tfoot";
    Object v2 = "caption";
    Object v3 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "thead";
    Object v5 = org.jsoup.parser.Parser.parseFragment(((java.lang.String)v0),((org.jsoup.nodes.Element)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "option";
    Object v1 = "tbody";
    Object v2 = org.jsoup.parser.Parser.parse(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = -70;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = ((org.jsoup.parser.Parser)v3).getTreeBuilder();
    Object v5 = ((org.jsoup.parser.Parser)v2).setTreeBuilder(((org.jsoup.parser.TreeBuilder)v4));
    Object v6 = ((org.jsoup.parser.Parser)v2).getErrors();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "p";
    Object v1 = "htm";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "th";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = 0;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    Object v3 = org.jsoup.parser.Parser.htmlParser();
    Object v4 = 65531;
    Object v5 = ((org.jsoup.parser.Parser)v3).setTrackErrors((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jsoup.parser.Parser)v3).getTreeBuilder();
    Object v7 = ((org.jsoup.parser.Parser)v2).setTreeBuilder(((org.jsoup.parser.TreeBuilder)v6));
    Object v8 = ((org.jsoup.parser.Parser)v2).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = org.jsoup.parser.Parser.xmlParser();
    Object v2 = ((org.jsoup.parser.Parser)v1).getTreeBuilder();
    Object v3 = ((org.jsoup.parser.Parser)v0).setTreeBuilder(((org.jsoup.parser.TreeBuilder)v2));
    Object v4 = "pre";
    Object v5 = "heaG";
    Object v6 = ((org.jsoup.parser.Parser)v3).parseInput(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "dVir";
    Object v1 = "co";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "";
    Object v1 = "thead";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "";
    Object v1 = "tr";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = -70;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    Object v3 = "figcaptionZ";
    Object v4 = "Lol";
    Object v5 = ((org.jsoup.parser.Parser)v2).parseInput(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.parser.Parser)v2).getTreeBuilder();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = 0;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jsoup.parser.Parser)v2).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = -70;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    Object v3 = "td";
    Object v4 = "code";
    Object v5 = ((org.jsoup.parser.Parser)v2).parseInput(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "tbody";
    Object v1 = "{base";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = org.jsoup.parser.Parser.xmlParser();
    Object v2 = ((org.jsoup.parser.Parser)v1).getTreeBuilder();
    Object v3 = ((org.jsoup.parser.Parser)v0).setTreeBuilder(((org.jsoup.parser.TreeBuilder)v2));
    Object v4 = "option";
    Object v5 = "tr";
    Object v6 = ((org.jsoup.parser.Parser)v3).parseInput(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = -70;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    Object v3 = 2;
    Object v4 = ((org.jsoup.parser.Parser)v2).setTrackErrors((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.jsoup.parser.Parser)v2).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = -17;
    Object v3 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v4).intValue()));
    Object v6 = 27;
    Object v7 = ((org.jsoup.parser.Parser)v5).setTrackErrors((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.jsoup.parser.Parser)v7).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = "captin";
    Object v2 = "tr";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = "h4";
    Object v5 = "html";
    Object v6 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "hed";
    Object v1 = "t";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = "table";
    Object v2 = "title";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = "tfo";
    Object v2 = "noscript";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "object";
    Object v1 = "wbr";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = -17;
    Object v3 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v4).intValue()));
    Object v6 = 27;
    Object v7 = ((org.jsoup.parser.Parser)v5).setTrackErrors((((java.lang.Integer)v6).intValue()));
    Object v8 = "col";
    Object v9 = "</";
    Object v10 = ((org.jsoup.parser.Parser)v7).parseInput(((java.lang.String)v8),((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = org.jsoup.parser.Parser.xmlParser();
    Object v2 = ((org.jsoup.parser.Parser)v1).getTreeBuilder();
    Object v3 = ((org.jsoup.parser.Parser)v0).setTreeBuilder(((org.jsoup.parser.TreeBuilder)v2));
    Object v4 = "colgroup";
    Object v5 = "blody";
    Object v6 = ((org.jsoup.parser.Parser)v3).parseInput(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = -17;
    Object v3 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v4).intValue()));
    Object v6 = 27;
    Object v7 = ((org.jsoup.parser.Parser)v5).setTrackErrors((((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = ((org.jsoup.parser.Parser)v7).setTrackErrors((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.htmlParser();
    Object v1 = "\"";
    Object v2 = "label";
    Object v3 = ((org.jsoup.parser.Parser)v0).parseInput(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = -17;
    Object v3 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v4).intValue()));
    Object v6 = 27;
    Object v7 = ((org.jsoup.parser.Parser)v5).setTrackErrors((((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = ((org.jsoup.parser.Parser)v7).setTrackErrors((((java.lang.Integer)v8).intValue()));
    Object v10 = "noframes";
    Object v11 = "textarea";
    Object v12 = ((org.jsoup.parser.Parser)v9).parseInput(((java.lang.String)v10),((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "lx";
    Object v1 = "p";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Parser(((org.jsoup.parser.TreeBuilder)v0));
    Object v2 = -17;
    Object v3 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = ((org.jsoup.parser.Parser)v1).setTrackErrors((((java.lang.Integer)v4).intValue()));
    Object v6 = 27;
    Object v7 = ((org.jsoup.parser.Parser)v5).setTrackErrors((((java.lang.Integer)v6).intValue()));
    Object v8 = 0;
    Object v9 = ((org.jsoup.parser.Parser)v7).setTrackErrors((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.jsoup.parser.Parser)v9).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "frameset";
    Object v1 = "sh3";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "stNyle";
    Object v1 = "co%";
    Object v2 = org.jsoup.parser.Parser.parse(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = new org.jsoup.parser.XmlTreeBuilder();
    Object v2 = ((org.jsoup.parser.Parser)v0).setTreeBuilder(((org.jsoup.parser.TreeBuilder)v1));
    Object v3 = ((org.jsoup.parser.Parser)v2).isTrackErrors();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "th";
    Object v1 = "captio";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = org.jsoup.parser.Parser.xmlParser();
    Object v1 = -70;
    Object v2 = ((org.jsoup.parser.Parser)v0).setTrackErrors((((java.lang.Integer)v1).intValue()));
    Object v3 = "html";
    Object v4 = "i2mg";
    Object v5 = ((org.jsoup.parser.Parser)v2).parseInput(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "";
    Object v1 = "DoctypeName";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }
}
