package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).val();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).dataNodes();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).previousElementSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).data();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "td";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "2col";
    Object v6 = ((org.jsoup.nodes.Element)v4).select(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).classNames();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = ((org.jsoup.nodes.Node)v4).childNode((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = "SucceedLsTilde";
    Object v7 = ((org.jsoup.nodes.Element)v4).getElementsByAttributeValueMatching(((java.lang.String)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = ((org.jsoup.nodes.Node)v4).childNode((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Element)v7).nextElementSibling();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "menu";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = ((org.jsoup.nodes.Node)v4).childNode((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Element)v7).children();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).classNames();
    Object v6 = ((org.jsoup.nodes.Element)v4).val();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = ((org.jsoup.nodes.Node)v4).childNode((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v8 = "tabl";
    Object v9 = ((org.jsoup.nodes.Element)v7).prependElement(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v7).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).preserveWhitespace();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(2088227083), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).tagName();
    org.junit.Assert.assertEquals((Object)("#root"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "<";
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementsByClass(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(2088227083), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = ((org.jsoup.nodes.Node)v4).childNode((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Element)v7).hasText();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "bod{y";
    Object v8 = "d";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "h34";
    Object v11 = ((org.jsoup.nodes.Element)v9).prependText(((java.lang.String)v10));
    Object v12 = "Union";
    Object v13 = ((org.jsoup.nodes.Element)v11).val(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Element)v6).appendChild(((org.jsoup.nodes.Node)v13));
    Object v15 = ((org.jsoup.nodes.Element)v6).nextElementSibling();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "html";
    Object v8 = "reals";
    Object v9 = ((org.jsoup.nodes.Element)v6).getElementsByAttributeValueStarting(((java.lang.String)v7),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "e";
    Object v6 = new java.lang.StringBuilder(((java.lang.String)v5));
    Object v7 = 2;
    Object v8 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v4).outerHtmlHead(((java.lang.StringBuilder)v6),(((java.lang.Integer)v7).intValue()),((org.jsoup.nodes.Document.OutputSettings)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).preserveWhitespace();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).textNodes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "thead";
    Object v8 = ((org.jsoup.nodes.Element)v6).select(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "script";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).nextSibling();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = "_col";
    Object v10 = ((org.jsoup.nodes.Element)v8).removeClass(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).nextSibling();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).previousSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = ((org.jsoup.nodes.Node)v4).childNode((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v8 = "c";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v7).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = ((org.jsoup.nodes.Node)v4).childNode((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Element)v7).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Element)v5).preserveWhitespace();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).parent();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = ((org.jsoup.nodes.Node)v4).childNode((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Element)v7).data();
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = ((org.jsoup.nodes.Node)v4).childNode((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v8 = "cite";
    Object v9 = "caption";
    Object v10 = ((org.jsoup.nodes.Element)v7).getElementsByAttributeValueStarting(((java.lang.String)v8),((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h";
    Object v4 = ((org.jsoup.nodes.Node)v2).absUrl(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v2).textNodes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "TORN";
    Object v7 = ((org.jsoup.nodes.Element)v5).hasClass(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexEquals((((java.lang.Integer)v9).intValue()));
    Object v11 = "-";
    Object v12 = ((org.jsoup.nodes.Element)v8).text(((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = -13;
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementsByIndexEquals((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexEquals((((java.lang.Integer)v9).intValue()));
    Object v11 = "-";
    Object v12 = ((org.jsoup.nodes.Element)v8).text(((java.lang.String)v11));
    Object v13 = " ";
    Object v14 = ((org.jsoup.nodes.Node)v12).hasAttr(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "bod{y";
    Object v8 = "d";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "h34";
    Object v11 = ((org.jsoup.nodes.Element)v9).prependText(((java.lang.String)v10));
    Object v12 = "";
    Object v13 = "SucceedLsTilde";
    Object v14 = ((org.jsoup.nodes.Element)v11).getElementsByAttributeValueMatching(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Element)v6).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexEquals((((java.lang.Integer)v9).intValue()));
    Object v11 = "-";
    Object v12 = ((org.jsoup.nodes.Element)v8).text(((java.lang.String)v11));
    Object v13 = "bod{y";
    Object v14 = "d";
    Object v15 = org.jsoup.Jsoup.parse(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "h34";
    Object v17 = ((org.jsoup.nodes.Element)v15).prependText(((java.lang.String)v16));
    Object v18 = ((org.jsoup.nodes.Node)v17).ownerDocument();
    Object v19 = ((org.jsoup.nodes.Element)v12).appendChild(((org.jsoup.nodes.Node)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexEquals((((java.lang.Integer)v9).intValue()));
    Object v11 = "-";
    Object v12 = ((org.jsoup.nodes.Element)v8).text(((java.lang.String)v11));
    Object v13 = "planck";
    Object v14 = ((org.jsoup.nodes.Element)v12).toggleClass(((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexEquals((((java.lang.Integer)v9).intValue()));
    Object v11 = "-";
    Object v12 = ((org.jsoup.nodes.Element)v8).text(((java.lang.String)v11));
    Object v13 = "planck";
    Object v14 = ((org.jsoup.nodes.Element)v12).toggleClass(((java.lang.String)v13));
    Object v15 = "p";
    Object v16 = ((org.jsoup.nodes.Element)v14).appendText(((java.lang.String)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Element)v5).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.jsoup.nodes.Element)v8).data();
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexEquals((((java.lang.Integer)v9).intValue()));
    Object v11 = "-";
    Object v12 = ((org.jsoup.nodes.Element)v8).text(((java.lang.String)v11));
    Object v13 = "planck";
    Object v14 = ((org.jsoup.nodes.Element)v12).toggleClass(((java.lang.String)v13));
    Object v15 = "bod{y";
    Object v16 = "d";
    Object v17 = org.jsoup.Jsoup.parse(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "h34";
    Object v19 = ((org.jsoup.nodes.Element)v17).prependText(((java.lang.String)v18));
    Object v20 = "2col";
    Object v21 = ((org.jsoup.nodes.Element)v19).select(((java.lang.String)v20));
    Object v22 = ((org.jsoup.nodes.Element)v19).classNames();
    Object v23 = ((org.jsoup.nodes.Element)v14).classNames(((java.util.Set)v22));
    Object v24 = ((org.jsoup.nodes.Element)v14).id();
    org.junit.Assert.assertEquals((Object)(""), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "bod{y";
    Object v8 = "d";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "h34";
    Object v11 = ((org.jsoup.nodes.Element)v9).prependText(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).ownerDocument();
    Object v13 = ((org.jsoup.nodes.Element)v12).elementSiblingIndex();
    Object v14 = ((org.jsoup.nodes.Element)v6).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexEquals((((java.lang.Integer)v9).intValue()));
    Object v11 = "-";
    Object v12 = ((org.jsoup.nodes.Element)v8).text(((java.lang.String)v11));
    Object v13 = "9";
    Object v14 = ((org.jsoup.nodes.Element)v12).getElementsByAttributeStarting(((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexEquals((((java.lang.Integer)v9).intValue()));
    Object v11 = "-";
    Object v12 = ((org.jsoup.nodes.Element)v8).text(((java.lang.String)v11));
    Object v13 = "bod{y";
    Object v14 = "d";
    Object v15 = org.jsoup.Jsoup.parse(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "h34";
    Object v17 = ((org.jsoup.nodes.Element)v15).prependText(((java.lang.String)v16));
    Object v18 = ((org.jsoup.nodes.Node)v17).ownerDocument();
    Object v19 = ((org.jsoup.nodes.Element)v12).appendChild(((org.jsoup.nodes.Node)v18));
    Object v20 = "thead";
    Object v21 = ((org.jsoup.nodes.Node)v19).removeAttr(((java.lang.String)v20));
    Object v22 = ((org.jsoup.nodes.Node)v19).childNodes();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "fflig";
    Object v8 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "fflig";
    Object v8 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).children();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexEquals((((java.lang.Integer)v9).intValue()));
    Object v11 = "-";
    Object v12 = ((org.jsoup.nodes.Element)v8).text(((java.lang.String)v11));
    Object v13 = "bod{y";
    Object v14 = "d";
    Object v15 = org.jsoup.Jsoup.parse(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "h34";
    Object v17 = ((org.jsoup.nodes.Element)v15).prependText(((java.lang.String)v16));
    Object v18 = ((org.jsoup.nodes.Node)v17).ownerDocument();
    Object v19 = ((org.jsoup.nodes.Element)v12).appendChild(((org.jsoup.nodes.Node)v18));
    Object v20 = ((org.jsoup.nodes.Node)v19).siblingNodes();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = ((org.jsoup.nodes.Node)v4).childNode((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v8 = "l_sh";
    Object v9 = ((org.jsoup.nodes.Element)v7).prependElement(((java.lang.String)v8));
    Object v10 = "table";
    Object v11 = ((org.jsoup.nodes.Element)v7).getElementById(((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Element)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(-1536090790), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = "co#";
    Object v10 = ((org.jsoup.nodes.Node)v8).attr(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(""), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "bod{y";
    Object v6 = "d";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "h34";
    Object v9 = ((org.jsoup.nodes.Element)v7).prependText(((java.lang.String)v8));
    Object v10 = "Union";
    Object v11 = ((org.jsoup.nodes.Element)v9).val(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v4).prependChild(((org.jsoup.nodes.Node)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = 0;
    Object v6 = ((org.jsoup.nodes.Node)v4).childNode((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Element)v7).siblingElements();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).previousSibling();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "bod{y";
    Object v6 = "d";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "h34";
    Object v9 = ((org.jsoup.nodes.Element)v7).prependText(((java.lang.String)v8));
    Object v10 = "Union";
    Object v11 = ((org.jsoup.nodes.Element)v9).val(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v4).prependChild(((org.jsoup.nodes.Node)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).siblingElements();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "optgoup";
    Object v7 = ((org.jsoup.nodes.Element)v5).wrap(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.jsoup.nodes.Element)v8).firstElementSibling();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "fflig";
    Object v8 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).html();
    org.junit.Assert.assertEquals((Object)("h34\n<html>\n <head></head>\n <body>\n  bod{y\n </body>\n</html>"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "bod{y";
    Object v6 = "d";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "h34";
    Object v9 = ((org.jsoup.nodes.Element)v7).prependText(((java.lang.String)v8));
    Object v10 = "Union";
    Object v11 = ((org.jsoup.nodes.Element)v9).val(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v4).prependChild(((org.jsoup.nodes.Node)v11));
    Object v13 = "bod{y";
    Object v14 = "d";
    Object v15 = org.jsoup.Jsoup.parse(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "h34";
    Object v17 = ((org.jsoup.nodes.Element)v15).prependText(((java.lang.String)v16));
    Object v18 = "bod{y";
    Object v19 = "d";
    Object v20 = org.jsoup.Jsoup.parse(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = "h34";
    Object v22 = ((org.jsoup.nodes.Element)v20).prependText(((java.lang.String)v21));
    Object v23 = "Union";
    Object v24 = ((org.jsoup.nodes.Element)v22).val(((java.lang.String)v23));
    Object v25 = ((org.jsoup.nodes.Element)v17).prependChild(((org.jsoup.nodes.Node)v24));
    Object v26 = ((org.jsoup.nodes.Element)v12).prependChild(((org.jsoup.nodes.Node)v25));
    Object v27 = "tbody";
    Object v28 = ((org.jsoup.nodes.Element)v12).toggleClass(((java.lang.String)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "e";
    Object v8 = new java.lang.StringBuilder(((java.lang.String)v7));
    Object v9 = 1.0F;
    Object v10 = ((java.lang.StringBuilder)v8).append((((java.lang.Float)v9).floatValue()));
    Object v11 = 0;
    Object v12 = new org.jsoup.nodes.Document.OutputSettings();
    Object v13 = ((org.jsoup.nodes.Document.OutputSettings)v12).clone();
    ((org.jsoup.nodes.Element)v6).outerHtmlHead(((java.lang.StringBuilder)v8),(((java.lang.Integer)v11).intValue()),((org.jsoup.nodes.Document.OutputSettings)v12));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexEquals((((java.lang.Integer)v9).intValue()));
    Object v11 = "-";
    Object v12 = ((org.jsoup.nodes.Element)v8).text(((java.lang.String)v11));
    Object v13 = "bod{y";
    Object v14 = "d";
    Object v15 = org.jsoup.Jsoup.parse(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "h34";
    Object v17 = ((org.jsoup.nodes.Element)v15).prependText(((java.lang.String)v16));
    Object v18 = ((org.jsoup.nodes.Node)v17).ownerDocument();
    Object v19 = ((org.jsoup.nodes.Element)v12).appendChild(((org.jsoup.nodes.Node)v18));
    Object v20 = "e";
    Object v21 = new java.lang.StringBuilder(((java.lang.String)v20));
    Object v22 = 0;
    Object v23 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v19).outerHtmlHead(((java.lang.StringBuilder)v21),(((java.lang.Integer)v22).intValue()),((org.jsoup.nodes.Document.OutputSettings)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexEquals((((java.lang.Integer)v9).intValue()));
    Object v11 = "-";
    Object v12 = ((org.jsoup.nodes.Element)v8).text(((java.lang.String)v11));
    Object v13 = "planck";
    Object v14 = ((org.jsoup.nodes.Element)v12).toggleClass(((java.lang.String)v13));
    Object v15 = "p";
    Object v16 = ((org.jsoup.nodes.Element)v14).appendText(((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Element)v16).html();
    org.junit.Assert.assertEquals((Object)("-p"), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).textNodes();
    Object v8 = ((org.jsoup.nodes.Element)v6).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "tjody";
    Object v7 = ((org.jsoup.nodes.Node)v5).attr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexEquals((((java.lang.Integer)v9).intValue()));
    Object v11 = "-";
    Object v12 = ((org.jsoup.nodes.Element)v8).text(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).siblingElements();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "bod{y";
    Object v6 = "d";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "h34";
    Object v9 = ((org.jsoup.nodes.Element)v7).prependText(((java.lang.String)v8));
    Object v10 = "Union";
    Object v11 = ((org.jsoup.nodes.Element)v9).val(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v4).prependChild(((org.jsoup.nodes.Node)v11));
    Object v13 = "bod{y";
    Object v14 = "d";
    Object v15 = org.jsoup.Jsoup.parse(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "h34";
    Object v17 = ((org.jsoup.nodes.Element)v15).prependText(((java.lang.String)v16));
    Object v18 = "bod{y";
    Object v19 = "d";
    Object v20 = org.jsoup.Jsoup.parse(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = "h34";
    Object v22 = ((org.jsoup.nodes.Element)v20).prependText(((java.lang.String)v21));
    Object v23 = "Union";
    Object v24 = ((org.jsoup.nodes.Element)v22).val(((java.lang.String)v23));
    Object v25 = ((org.jsoup.nodes.Element)v17).prependChild(((org.jsoup.nodes.Node)v24));
    Object v26 = ((org.jsoup.nodes.Element)v12).prependChild(((org.jsoup.nodes.Node)v25));
    Object v27 = "tbody";
    Object v28 = ((org.jsoup.nodes.Element)v12).toggleClass(((java.lang.String)v27));
    Object v29 = "command";
    Object v30 = ((org.jsoup.nodes.Node)v28).hasAttr(((java.lang.String)v29));
    Object v31 = ((org.jsoup.nodes.Node)v28).siblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).previousElementSibling();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "BeforeDoctypeName";
    Object v7 = 1;
    Object v8 = java.util.regex.Pattern.compile(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.jsoup.nodes.Element)v5).getElementsMatchingOwnText(((java.util.regex.Pattern)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexEquals((((java.lang.Integer)v9).intValue()));
    Object v11 = "-";
    Object v12 = ((org.jsoup.nodes.Element)v8).text(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).className();
    Object v14 = "tfoot";
    Object v15 = ((org.jsoup.nodes.Element)v12).append(((java.lang.String)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexEquals((((java.lang.Integer)v9).intValue()));
    Object v11 = "-";
    Object v12 = ((org.jsoup.nodes.Element)v8).text(((java.lang.String)v11));
    Object v13 = "planck";
    Object v14 = ((org.jsoup.nodes.Element)v12).toggleClass(((java.lang.String)v13));
    Object v15 = "p";
    Object v16 = ((org.jsoup.nodes.Element)v14).appendText(((java.lang.String)v15));
    Object v17 = "he";
    Object v18 = ((org.jsoup.nodes.Node)v16).wrap(((java.lang.String)v17));
    Object v19 = ((org.jsoup.nodes.Node)v16).previousSibling();
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Element)v5).dataset();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v5).hasClass(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "bod{y";
    Object v6 = "d";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "h34";
    Object v9 = ((org.jsoup.nodes.Element)v7).prependText(((java.lang.String)v8));
    Object v10 = "Union";
    Object v11 = ((org.jsoup.nodes.Element)v9).val(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v4).prependChild(((org.jsoup.nodes.Node)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).id();
    org.junit.Assert.assertEquals((Object)(""), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "bod{y";
    Object v6 = "d";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "h34";
    Object v9 = ((org.jsoup.nodes.Element)v7).prependText(((java.lang.String)v8));
    Object v10 = "Union";
    Object v11 = ((org.jsoup.nodes.Element)v9).val(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v4).prependChild(((org.jsoup.nodes.Node)v11));
    Object v13 = "td";
    Object v14 = ((org.jsoup.nodes.Node)v12).attr(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(""), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "bod{y";
    Object v6 = "d";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "h34";
    Object v9 = ((org.jsoup.nodes.Element)v7).prependText(((java.lang.String)v8));
    Object v10 = "Union";
    Object v11 = ((org.jsoup.nodes.Element)v9).val(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v4).prependChild(((org.jsoup.nodes.Node)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).data();
    org.junit.Assert.assertEquals((Object)(""), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "fflig";
    Object v8 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v7));
    Object v9 = "rt";
    Object v10 = "br";
    Object v11 = ((org.jsoup.nodes.Element)v8).getElementsByAttributeValueContaining(((java.lang.String)v9),((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).hashCode();
    Object v8 = "XX";
    Object v9 = ((org.jsoup.nodes.Element)v6).getElementsMatchingText(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexEquals((((java.lang.Integer)v9).intValue()));
    Object v11 = "-";
    Object v12 = ((org.jsoup.nodes.Element)v8).text(((java.lang.String)v11));
    Object v13 = "bod{y";
    Object v14 = "d";
    Object v15 = org.jsoup.Jsoup.parse(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "h34";
    Object v17 = ((org.jsoup.nodes.Element)v15).prependText(((java.lang.String)v16));
    Object v18 = ((org.jsoup.nodes.Node)v17).ownerDocument();
    Object v19 = ((org.jsoup.nodes.Element)v12).appendChild(((org.jsoup.nodes.Node)v18));
    Object v20 = ((org.jsoup.nodes.Element)v19).children();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "fflig";
    Object v8 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).siblingNodes();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "html";
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementsByTag(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexEquals((((java.lang.Integer)v9).intValue()));
    Object v11 = "-";
    Object v12 = ((org.jsoup.nodes.Element)v8).text(((java.lang.String)v11));
    Object v13 = "planck";
    Object v14 = ((org.jsoup.nodes.Element)v12).toggleClass(((java.lang.String)v13));
    Object v15 = "p";
    Object v16 = ((org.jsoup.nodes.Element)v14).appendText(((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Node)v16).previousSibling();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexEquals((((java.lang.Integer)v9).intValue()));
    Object v11 = "-";
    Object v12 = ((org.jsoup.nodes.Element)v8).text(((java.lang.String)v11));
    Object v13 = "planck";
    Object v14 = ((org.jsoup.nodes.Element)v12).toggleClass(((java.lang.String)v13));
    Object v15 = "p";
    Object v16 = ((org.jsoup.nodes.Element)v14).appendText(((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Element)v16).dataNodes();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "fflig";
    Object v8 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).val();
    org.junit.Assert.assertEquals((Object)("fflig"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexEquals((((java.lang.Integer)v9).intValue()));
    Object v11 = "-";
    Object v12 = ((org.jsoup.nodes.Element)v8).text(((java.lang.String)v11));
    Object v13 = "planck";
    Object v14 = ((org.jsoup.nodes.Element)v12).toggleClass(((java.lang.String)v13));
    Object v15 = "p";
    Object v16 = ((org.jsoup.nodes.Element)v14).appendText(((java.lang.String)v15));
    Object v17 = "e";
    Object v18 = new java.lang.StringBuilder(((java.lang.String)v17));
    Object v19 = -21;
    Object v20 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v16).outerHtmlTail(((java.lang.StringBuilder)v18),(((java.lang.Integer)v19).intValue()),((org.jsoup.nodes.Document.OutputSettings)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "html";
    Object v6 = ((org.jsoup.nodes.Element)v4).before(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "fllic";
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementsByClass(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexEquals((((java.lang.Integer)v9).intValue()));
    Object v11 = "-";
    Object v12 = ((org.jsoup.nodes.Element)v8).text(((java.lang.String)v11));
    Object v13 = "bod{y";
    Object v14 = "d";
    Object v15 = org.jsoup.Jsoup.parse(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "h34";
    Object v17 = ((org.jsoup.nodes.Element)v15).prependText(((java.lang.String)v16));
    Object v18 = ((org.jsoup.nodes.Node)v17).ownerDocument();
    Object v19 = ((org.jsoup.nodes.Element)v12).appendChild(((org.jsoup.nodes.Node)v18));
    Object v20 = ((org.jsoup.nodes.Element)v19).id();
    org.junit.Assert.assertEquals((Object)(""), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "bod{y";
    Object v1 = "d";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h34";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = "Union";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v6).childNode((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexEquals((((java.lang.Integer)v9).intValue()));
    Object v11 = "-";
    Object v12 = ((org.jsoup.nodes.Element)v8).text(((java.lang.String)v11));
    Object v13 = "planck";
    Object v14 = ((org.jsoup.nodes.Element)v12).toggleClass(((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Element)v14).preserveWhitespace();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }
}
