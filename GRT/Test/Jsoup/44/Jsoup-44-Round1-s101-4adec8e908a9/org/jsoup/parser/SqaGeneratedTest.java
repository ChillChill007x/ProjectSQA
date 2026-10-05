package org.jsoup.parser;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "bgQsound";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "htm{l";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "option";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = ((org.jsoup.parser.TreeBuilder)v0).currentElement();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "d";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    ((org.jsoup.parser.TreeBuilder)v0).runParser();
    Object v1 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = "hb";
    Object v3 = 0;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.jsoup.parser.TreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "section";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = new org.jsoup.parser.Token.Character();
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).process(((org.jsoup.parser.Token)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "2fieldset";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "base";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.nodes.Attributes)v2).dataset();
    Object v4 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "?able";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "basefont";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "br";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "body";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "DELET7E";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = ">";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "htts";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "head";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "\n";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.nodes.Attributes)v2).dataset();
    Object v4 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "trE";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = "option";
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "=td";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "td";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = "data";
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "Could not parse nth-inde '%s': unexpected format";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "scrip";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "thead";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.nodes.Attributes)v2).size();
    Object v4 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = ":has";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = " ";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tr'";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "optiFn";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "7";
    Object v2 = "h@4";
    Object v3 = 0;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.jsoup.parser.TreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = ":last-child";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "body";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.nodes.Attributes)v2).asList();
    Object v4 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "thHead";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "noscript";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "actio7";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "cVol";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "htm";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "eta";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "version";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "th";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "strong";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tr";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "Doctye";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "co\\l";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "tfoot";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = "detai(ls";
    Object v4 = ((org.jsoup.nodes.Attributes)v2).get(((java.lang.String)v3));
    Object v5 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "colgroup";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "li";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "textarea";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "</";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "r";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "option";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "th";
    Object v2 = "tdL";
    Object v3 = 0;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.util.ArrayList)v4).retainAll(((java.util.Collection)v6));
    ((org.jsoup.parser.TreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "thtml";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "fr";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "table";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "colgroup";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "th";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "UT";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "selecA";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "aption";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "colgrou";
    Object v2 = "ption";
    Object v3 = 0;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.jsoup.parser.TreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "htmJ";
    Object v2 = "";
    Object v3 = 0;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    ((org.jsoup.parser.TreeBuilder)v0).initialiseParse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "met[";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "r";
    Object v2 = "li";
    Object v3 = 0;
    Object v4 = org.jsoup.parser.ParseErrorList.tracking((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.jsoup.parser.TreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2),((org.jsoup.parser.ParseErrorList)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "theaH";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.nodes.Attributes)v2).clone();
    Object v4 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "htm";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "body";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "title";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "td";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "body";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "head";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "htm ";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.nodes.Attributes)v2).html();
    Object v4 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "selec";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "herd";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "br";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "a";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.nodes.Attributes)v2).hashCode();
    Object v4 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "captin";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "u<";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "titl)";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "menu";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = " :empty";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "thead";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "q";
    Object v2 = "tbody";
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).parse(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = ":rev%s";
    Object v2 = new org.jsoup.nodes.Attributes();
    Object v3 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1),((org.jsoup.nodes.Attributes)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "a`";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "e";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "?html";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "^=";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "bo[dy";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "command";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "nof";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processEndTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.jsoup.parser.XmlTreeBuilder();
    Object v1 = "html";
    Object v2 = ((org.jsoup.parser.TreeBuilder)v0).processStartTag(((java.lang.String)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
