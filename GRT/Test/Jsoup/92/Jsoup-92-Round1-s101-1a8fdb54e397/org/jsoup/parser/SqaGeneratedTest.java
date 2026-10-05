package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "tile";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "b";
    Object v2 = "tr";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = new org.jsoup.parser.Token.CData(((java.lang.String)v1));
    ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Character)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.XmlTreeBuilder)v0).defaultSettings();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = new org.jsoup.parser.Token.CData(((java.lang.String)v1));
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = " ";
    Object v2 = "abbr";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "t";
    Object v5 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).getAllElements();
    Object v7 = "meta";
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = "tgd";
    Object v10 = "abbr";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "t";
    Object v13 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12));
    Object v14 = ">";
    Object v15 = ((org.jsoup.parser.Parser)v8).parseFragmentInput(((java.lang.String)v9),((org.jsoup.nodes.Element)v13),((java.lang.String)v14));
    Object v16 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v5),((java.lang.String)v7),((org.jsoup.parser.Parser)v8));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Comment();
    Object v2 = ((org.jsoup.parser.Token.Comment)v1).toString();
    ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Comment)v1));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.StartTag)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Comment();
    ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Comment)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "R";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.StartTag();
    Object v2 = ((org.jsoup.parser.XmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "o";
    Object v2 = "Vction";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = new char[]{Character.valueOf((char)0),Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v3 = java.nio.CharBuffer.wrap(((char[])v2));
    Object v4 = ((java.io.Reader)v1).read(((java.nio.CharBuffer)v3));
    Object v5 = "E";
    Object v6 = org.jsoup.parser.Parser.xmlParser();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v5),((org.jsoup.parser.Parser)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = ".";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "li";
    Object v2 = " ";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "head";
    Object v2 = "htm&";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Doctype();
    ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Doctype)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "pplet";
    Object v2 = new org.jsoup.parser.XmlTreeBuilder();
    Object v3 = "li";
    Object v4 = " ";
    Object v5 = ((org.jsoup.parser.XmlTreeBuilder)v2).parse(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).text();
    Object v7 = "O";
    Object v8 = org.jsoup.parser.Parser.xmlParser();
    Object v9 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v5),((java.lang.String)v7),((org.jsoup.parser.Parser)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "p";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = "the@d";
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Comment();
    Object v2 = ((org.jsoup.parser.XmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = "hp";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tabl";
    Object v2 = "";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Doctype();
    Object v2 = ((org.jsoup.parser.XmlTreeBuilder)v0).process(((org.jsoup.parser.Token)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = "tid";
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "thead";
    Object v2 = "a";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "able";
    Object v2 = new org.jsoup.parser.XmlTreeBuilder();
    Object v3 = "tabl";
    Object v4 = "";
    Object v5 = ((org.jsoup.parser.XmlTreeBuilder)v2).parse(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "pre";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "head";
    Object v2 = "bbsefont";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "htmT";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tfooH";
    Object v2 = "";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "br";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = "srmall";
    Object v4 = org.jsoup.parser.Parser.xmlParser();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "noresize";
    Object v2 = "5tml";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = new org.jsoup.parser.XmlTreeBuilder();
    Object v5 = ((org.jsoup.parser.XmlTreeBuilder)v4).defaultSettings();
    Object v6 = ((org.jsoup.parser.Parser)v3).settings(((org.jsoup.parser.ParseSettings)v5));
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "AfterAttribut0Name";
    Object v2 = "colgroup";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "Only http & https protocols supported";
    Object v2 = new org.jsoup.parser.XmlTreeBuilder();
    Object v3 = "head";
    Object v4 = "htm&";
    Object v5 = ((org.jsoup.parser.XmlTreeBuilder)v2).parse(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "mnu";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "head";
    Object v2 = new org.jsoup.parser.XmlTreeBuilder();
    Object v3 = "head";
    Object v4 = "bbsefont";
    Object v5 = ((org.jsoup.parser.XmlTreeBuilder)v2).parse(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "for";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "caption";
    Object v2 = "abbr";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "t";
    Object v5 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v3),((java.lang.String)v4));
    Object v6 = "";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = "H";
    Object v9 = new org.jsoup.parser.XmlTreeBuilder();
    Object v10 = "head";
    Object v11 = "htm&";
    Object v12 = ((org.jsoup.parser.XmlTreeBuilder)v9).parse(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "";
    Object v14 = ((org.jsoup.parser.Parser)v7).parseFragmentInput(((java.lang.String)v8),((org.jsoup.nodes.Element)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "7";
    Object v2 = "#r";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "!=";
    Object v2 = "h5";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = "p]";
    Object v5 = "ul";
    Object v6 = ((org.jsoup.parser.Parser)v3).parseInput(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = ":";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "colgroup";
    Object v2 = "basefont";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "hgad";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tH";
    Object v2 = "";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = "inut";
    Object v5 = "tbody";
    Object v6 = ((org.jsoup.parser.Parser)v3).parseInput(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "Attributes incorrectly present on endtag";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "tCemplate";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Doctype();
    Object v2 = ((org.jsoup.parser.Token.Doctype)v1).getSystemIdentifier();
    ((org.jsoup.parser.XmlTreeBuilder)v0).insert(((org.jsoup.parser.Token.Doctype)v1));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "abs:";
    Object v2 = "ol";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "abs:href";
    Object v2 = "html";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "2";
    Object v2 = "tdO";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "body";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = ">";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "?";
    Object v2 = "button";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "htl";
    Object v2 = "tbody";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "met";
    Object v2 = "b";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "htl";
    Object v2 = "?";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = new org.jsoup.parser.XmlTreeBuilder();
    Object v3 = "htl";
    Object v4 = "tbody";
    Object v5 = ((org.jsoup.parser.XmlTreeBuilder)v2).parse(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "thPad";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "able";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = "#C";
    Object v5 = new org.jsoup.parser.XmlTreeBuilder();
    Object v6 = "li";
    Object v7 = " ";
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v5).parse(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "tfoos";
    Object v10 = ((org.jsoup.parser.Parser)v3).parseFragmentInput(((java.lang.String)v4),((org.jsoup.nodes.Element)v8),((java.lang.String)v9));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "title";
    Object v2 = "}body";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "html";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "x=";
    Object v2 = "tabl~e";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = 3;
    Object v5 = ((org.jsoup.parser.Parser)v3).setTrackErrors((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "vead";
    Object v2 = new org.jsoup.parser.XmlTreeBuilder();
    Object v3 = "tabl";
    Object v4 = "";
    Object v5 = ((org.jsoup.parser.XmlTreeBuilder)v2).parse(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "Could not parse query '%s': unexpected token at '%s'";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "col";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = new org.jsoup.parser.XmlTreeBuilder();
    Object v5 = ((org.jsoup.parser.Parser)v3).setTreeBuilder(((org.jsoup.parser.TreeBuilder)v4));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "</";
    Object v2 = "G";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "div";
    Object v2 = "#root";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "thead";
    Object v2 = "";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tfoot";
    Object v2 = "abbr";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "t";
    Object v5 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v3),((java.lang.String)v4));
    Object v6 = "details";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = new org.jsoup.parser.XmlTreeBuilder();
    Object v3 = "head";
    Object v4 = "bbsefont";
    Object v5 = ((org.jsoup.parser.XmlTreeBuilder)v2).parse(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v5).select(((java.lang.String)v6));
    Object v8 = "K";
    Object v9 = org.jsoup.parser.Parser.xmlParser();
    Object v10 = 1;
    Object v11 = ((org.jsoup.parser.Parser)v9).setTrackErrors((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v5),((java.lang.String)v8),((org.jsoup.parser.Parser)v9));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = " ";
    Object v2 = "z";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = "hml";
    Object v4 = org.jsoup.parser.Parser.xmlParser();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "bgsound";
    Object v2 = "blockquote";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "thad";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "br";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "ht;l";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "input";
    Object v2 = "";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "div";
    Object v2 = "abbr";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "t";
    Object v5 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v3),((java.lang.String)v4));
    Object v6 = "smal";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = "+";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "body";
    Object v2 = new org.jsoup.parser.XmlTreeBuilder();
    Object v3 = "li";
    Object v4 = " ";
    Object v5 = ((org.jsoup.parser.XmlTreeBuilder)v2).parse(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "htl";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = new org.jsoup.parser.XmlTreeBuilder();
    Object v9 = ((org.jsoup.parser.XmlTreeBuilder)v8).defaultSettings();
    Object v10 = ((org.jsoup.parser.Parser)v7).settings(((org.jsoup.parser.ParseSettings)v9));
    Object v11 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "cvaption";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "basefont";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "ca@tion";
    Object v2 = "summary";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "tbody";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "<";
    Object v2 = "body";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    ((java.io.Reader)v1).close();
    Object v2 = null;
    Object v3 = "col";
    Object v4 = org.jsoup.parser.Parser.xmlParser();
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v3),((org.jsoup.parser.Parser)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "base";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = 9L;
    Object v3 = ((java.io.Reader)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = "form";
    Object v5 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.io.Reader)v1),((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "colgro#p";
    Object v2 = "link";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "noframes";
    Object v2 = "";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "t";
    Object v2 = "caption";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "mall";
    Object v2 = new org.jsoup.parser.XmlTreeBuilder();
    Object v3 = "t";
    Object v4 = "caption";
    Object v5 = ((org.jsoup.parser.XmlTreeBuilder)v2).parse(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ":matches(regex) query must not be em7ty";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = "";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = "caption";
    Object v5 = "";
    Object v6 = ((org.jsoup.parser.Parser)v3).parseInput(((java.lang.String)v4),((java.lang.String)v5));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "link";
    Object v2 = "htm";
    Object v3 = org.jsoup.parser.Parser.xmlParser();
    Object v4 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.Parser)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "sd";
    Object v2 = "abbr";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "t";
    Object v5 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v3),((java.lang.String)v4));
    Object v6 = "thead";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = -8;
    Object v9 = ((org.jsoup.parser.Parser)v7).setTrackErrors((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = java.io.Reader.nullReader();
    Object v2 = -9L;
    Object v3 = ((java.io.Reader)v1).skip((((java.lang.Long)v2).longValue()));
    Object v4 = "option";
    Object v5 = org.jsoup.parser.Parser.xmlParser();
    Object v6 = new org.jsoup.parser.XmlTreeBuilder();
    Object v7 = ((org.jsoup.parser.Parser)v5).setTreeBuilder(((org.jsoup.parser.TreeBuilder)v6));
    ((org.jsoup.parser.XmlTreeBuilder)v0).initialiseParse(((java.io.Reader)v1),((java.lang.String)v4),((org.jsoup.parser.Parser)v5));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "r`";
    Object v2 = new org.jsoup.parser.XmlTreeBuilder();
    Object v3 = "noframes";
    Object v4 = "";
    Object v5 = ((org.jsoup.parser.XmlTreeBuilder)v2).parse(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "style";
    Object v7 = org.jsoup.parser.Parser.xmlParser();
    Object v8 = ((org.jsoup.parser.XmlTreeBuilder)v0).parseFragment(((java.lang.String)v1),((org.jsoup.nodes.Element)v5),((java.lang.String)v6),((org.jsoup.parser.Parser)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "cPaption";
    Object v2 = "s";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tbody";
    Object v2 = "tab";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "dt";
    Object v2 = "inpu.t";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "option";
    Object v2 = "appet";
    Object v3 = ((org.jsoup.parser.XmlTreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }
}
