package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = " ";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).html();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).text();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "tType";
    Object v5 = ((org.jsoup.nodes.Node)v3).attr(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v3).nextSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).hasText();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "CODE";
    Object v5 = ((org.jsoup.nodes.Element)v3).append(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).className();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).outerHtml();
    Object v5 = ((org.jsoup.nodes.Element)v3).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "PRL";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = "httpsb";
    Object v7 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).className();
    Object v9 = ((org.jsoup.nodes.Element)v3).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = " ";
    Object v5 = ((org.jsoup.nodes.Node)v3).hasAttr(((java.lang.String)v4));
    Object v6 = "base";
    Object v7 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).wrap(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).val();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "head";
    Object v5 = ((org.jsoup.nodes.Element)v3).wrap(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Node)v3).hasAttr(((java.lang.String)v4));
    Object v6 = "THEAD";
    Object v7 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Document)v2).head();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).nextElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "Unhandled content type \"%s\" on UL %s. Must be text/*";
    Object v4 = "FORM";
    Object v5 = ((org.jsoup.nodes.Element)v2).getElementsByAttributeValueStarting(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Document)v2).title();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Document)v2).title();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "H\\";
    Object v4 = ((org.jsoup.nodes.Node)v2).attr(((java.lang.String)v3));
    Object v5 = "title";
    Object v6 = ((org.jsoup.nodes.Node)v2).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).childNodes();
    Object v4 = " ";
    Object v5 = ((org.jsoup.nodes.Element)v2).wrap(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = "A";
    Object v6 = ((org.jsoup.nodes.Element)v3).getElementsByAttributeValueStarting(((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Node)v3).hasAttr(((java.lang.String)v4));
    Object v6 = "THEAD";
    Object v7 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v6));
    Object v8 = "code";
    Object v9 = ((org.jsoup.nodes.Node)v7).attr(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).nextElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).childNodes();
    Object v4 = " ";
    Object v5 = ((org.jsoup.nodes.Node)v2).removeAttr(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(-1185554506), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).tag();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).getAllElements();
    Object v4 = "SCRIT";
    Object v5 = ((org.jsoup.nodes.Element)v2).appendElement(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Document)v2).head();
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).text(((java.lang.String)v4));
    Object v6 = "DEL";
    Object v7 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Document)v2).head();
    Object v4 = "#";
    Object v5 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v4));
    Object v6 = "declaration";
    Object v7 = ((org.jsoup.nodes.Node)v3).attr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "\"";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Node)v3).hasAttr(((java.lang.String)v4));
    Object v6 = "THEAD";
    Object v7 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).siblingNodes();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "FRAME";
    ((org.jsoup.nodes.Document)v2).title(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).getAllElements();
    Object v4 = "SCRIT";
    Object v5 = ((org.jsoup.nodes.Element)v2).appendElement(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).hasText();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "D`EL";
    Object v4 = ((org.jsoup.nodes.Element)v2).removeClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v2).previousElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).childNodes();
    Object v4 = " ";
    Object v5 = ((org.jsoup.nodes.Node)v2).removeAttr(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "\"";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = 12;
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementsByIndexGreaterThan((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Document)v2).nodeName();
    org.junit.Assert.assertEquals((Object)("#document"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).toString();
    Object v5 = ((org.jsoup.nodes.Element)v3).hasText();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Document)v2).normalise();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "\"";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodes();
    Object v7 = "i";
    Object v8 = ((org.jsoup.nodes.Node)v5).absUrl(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).removeClass(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "\"";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "bO";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = ((org.jsoup.nodes.Node)v5).childNode((((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "\"";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "Q\\eue did not match expected sequence";
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementsByTag(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v5).classNames();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "Hg5";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementById(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = " ";
    ((org.jsoup.nodes.Document)v2).title(((java.lang.String)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Document)v2).head();
    Object v4 = 10;
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsByIndexGreaterThan((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "TEXTAREA";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "\"";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).hasText();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).childNodes();
    Object v4 = " ";
    Object v5 = ((org.jsoup.nodes.Node)v2).removeAttr(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Document)v5).outerHtml();
    org.junit.Assert.assertEquals((Object)("<html>\n<head>\n</head>\n<body>\n title\n</body>\n</html>"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "TEXTAREA";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Document)v4).normalise();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Document)v2).normalise();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "<";
    Object v4 = "'";
    Object v5 = ((org.jsoup.nodes.Element)v2).getElementsByAttributeValueEnding(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v2).id();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).getAllElements();
    Object v4 = "SCRIT";
    Object v5 = ((org.jsoup.nodes.Element)v2).appendElement(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).data();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).getAllElements();
    Object v4 = "SCRIT";
    Object v5 = ((org.jsoup.nodes.Element)v2).appendElement(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).children();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).data();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).removeClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).val();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).text();
    Object v4 = "";
    Object v5 = " ";
    Object v6 = ((org.jsoup.nodes.Element)v2).getElementsByAttributeValue(((java.lang.String)v4),((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "TEXTAREA";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Document)v4).normalise();
    Object v6 = ((org.jsoup.nodes.Element)v5).previousElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).removeClass(((java.lang.String)v4));
    Object v6 = ".";
    Object v7 = ((org.jsoup.nodes.Element)v5).toggleClass(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    ((org.jsoup.nodes.Node)v2).remove();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "http";
    Object v4 = ((org.jsoup.nodes.Document)v2).createElement(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "TEXTAREA";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "title";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "F";
    Object v8 = ((org.jsoup.nodes.Element)v4).getElementById(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).removeClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).isBlock();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "\"";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).id();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).nextSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Node)v3).hasAttr(((java.lang.String)v4));
    Object v6 = "THEAD";
    Object v7 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v6));
    Object v8 = "<";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementsByAttribute(((java.lang.String)v8));
    Object v10 = "title";
    Object v11 = "body";
    Object v12 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v7).appendChild(((org.jsoup.nodes.Node)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).removeClass(((java.lang.String)v4));
    Object v6 = ".";
    Object v7 = ((org.jsoup.nodes.Element)v5).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).classNames();
    Object v4 = ((org.jsoup.nodes.Element)v2).classNames();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).removeClass(((java.lang.String)v4));
    Object v6 = ".";
    Object v7 = ((org.jsoup.nodes.Element)v5).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "PRL";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = "httpsb";
    Object v7 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6));
    Object v8 = "title";
    Object v9 = ((org.jsoup.nodes.Element)v7).removeClass(((java.lang.String)v8));
    Object v10 = ".";
    Object v11 = ((org.jsoup.nodes.Element)v9).toggleClass(((java.lang.String)v10));
    ((org.jsoup.nodes.Node)v3).replaceWith(((org.jsoup.nodes.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = ((org.jsoup.nodes.Element)v2).hasClass(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "B|";
    Object v4 = "]src";
    Object v5 = ((org.jsoup.nodes.Element)v2).getElementsByAttributeValue(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Node)v3).hasAttr(((java.lang.String)v4));
    Object v6 = "THEAD";
    Object v7 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).children();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Node)v3).hasAttr(((java.lang.String)v4));
    Object v6 = "THEAD";
    Object v7 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).baseUri();
    org.junit.Assert.assertEquals((Object)("httpsb"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).getAllElements();
    Object v4 = "SCRIT";
    Object v5 = ((org.jsoup.nodes.Element)v2).appendElement(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).val();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).removeClass(((java.lang.String)v4));
    Object v6 = ".";
    Object v7 = ((org.jsoup.nodes.Element)v5).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodes();
    Object v9 = ((org.jsoup.nodes.Element)v7).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).childNodes();
    Object v4 = " ";
    Object v5 = ((org.jsoup.nodes.Node)v2).removeAttr(((java.lang.String)v4));
    Object v6 = "\nLinks: (%d)";
    Object v7 = ((org.jsoup.nodes.Node)v5).attr(((java.lang.String)v6));
    Object v8 = "PRL";
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8));
    Object v10 = "httpsb";
    Object v11 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v9),((java.lang.String)v10));
    Object v12 = "\"";
    Object v13 = ((org.jsoup.nodes.Element)v11).val(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v13).childNodes();
    ((org.jsoup.nodes.Node)v5).replaceWith(((org.jsoup.nodes.Node)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Node)v3).hasAttr(((java.lang.String)v4));
    Object v6 = "THEAD";
    Object v7 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v6));
    Object v8 = "<";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementsByAttribute(((java.lang.String)v8));
    Object v10 = "title";
    Object v11 = "body";
    Object v12 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v7).appendChild(((org.jsoup.nodes.Node)v12));
    Object v14 = ((org.jsoup.nodes.Element)v13).hashCode();
    org.junit.Assert.assertEquals((Object)(-2051307420), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "title";
    Object v4 = ((org.jsoup.nodes.Element)v2).getElementsByTag(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "\"";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "html";
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementById(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "PRL";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = "httpsb";
    Object v7 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6));
    Object v8 = "\"";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = "Q\\eue did not match expected sequence";
    Object v11 = ((org.jsoup.nodes.Element)v9).getElementsByTag(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v9).classNames();
    Object v13 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v12));
    Object v14 = ((org.jsoup.nodes.Element)v3).toString();
    org.junit.Assert.assertEquals((Object)("<prl class=\"\">\n</prl>"), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "\"";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "html";
    Object v7 = ((org.jsoup.nodes.Element)v5).removeClass(((java.lang.String)v6));
    Object v8 = "Queue not long enough to consume se.quence";
    Object v9 = ((org.jsoup.nodes.Element)v5).hasClass(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Document)v2).head();
    Object v4 = " ";
    Object v5 = ((org.jsoup.nodes.Node)v3).hasAttr(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v3).siblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "\"";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "head";
    Object v7 = ((org.jsoup.nodes.Node)v5).hasAttr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "y";
    Object v4 = ((org.jsoup.nodes.Element)v2).getElementById(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).removeClass(((java.lang.String)v4));
    Object v6 = ".";
    Object v7 = ((org.jsoup.nodes.Element)v5).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).tagName();
    org.junit.Assert.assertEquals((Object)("prl"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).removeClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).id();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "\"";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).data();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "TEXTAREA";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Document)v4).normalise();
    Object v6 = ((org.jsoup.nodes.Element)v5).children();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).getAllElements();
    Object v4 = "SCRIT";
    Object v5 = ((org.jsoup.nodes.Element)v2).appendElement(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).siblingNodes();
    Object v7 = "title";
    Object v8 = "body";
    Object v9 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v5).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "title";
    Object v1 = "body";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "title";
    Object v4 = ((org.jsoup.nodes.Element)v2).getElementsByClass(((java.lang.String)v3));
    Object v5 = 1;
    Object v6 = ((org.jsoup.nodes.Element)v2).getElementsByIndexLessThan((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Node)v3).hasAttr(((java.lang.String)v4));
    Object v6 = "THEAD";
    Object v7 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "dat";
    Object v5 = "TD";
    Object v6 = ((org.jsoup.nodes.Element)v3).getElementsByAttributeValueStarting(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }
}
