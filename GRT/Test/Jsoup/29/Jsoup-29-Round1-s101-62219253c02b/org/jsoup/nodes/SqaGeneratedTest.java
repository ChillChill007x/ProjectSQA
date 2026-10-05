package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).val();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "htm{l";
    Object v4 = "head";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v2).before(((org.jsoup.nodes.Node)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).nodeName();
    Object v4 = ((org.jsoup.nodes.Node)v2).previousSibling();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(-1536090790), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).children();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).id();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).hashCode();
    Object v6 = ((org.jsoup.nodes.Node)v4).siblingNodes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).previousSibling();
    Object v6 = "caption";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "td";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = "im";
    Object v7 = ((org.jsoup.nodes.Element)v4).getElementsByAttributeValueMatching(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v4).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).dataNodes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).siblingElements();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).previousElementSibling();
    Object v8 = "htaml";
    ((org.jsoup.nodes.Document)v6).title(((java.lang.String)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).isBlock();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).nextElementSibling();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Element)v7).tagName();
    org.junit.Assert.assertEquals((Object)("#root"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = "htm{l";
    Object v9 = "head";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "blockquote";
    Object v12 = ((org.jsoup.nodes.Element)v10).toggleClass(((java.lang.String)v11));
    Object v13 = new org.jsoup.nodes.Document.OutputSettings();
    Object v14 = ((org.jsoup.nodes.Document)v12).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v13));
    Object v15 = "Or";
    Object v16 = ((org.jsoup.nodes.Node)v14).hasAttr(((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Element)v7).before(((org.jsoup.nodes.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = 0;
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementsByIndexGreaterThan((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).textNodes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Document)v7).outputSettings();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).hashCode();
    Object v8 = "input";
    Object v9 = ((org.jsoup.nodes.Node)v6).absUrl(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = "http";
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByAttribute(((java.lang.String)v9));
    Object v11 = "table";
    Object v12 = ((org.jsoup.nodes.Document)v8).text(((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).hasText();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = "http";
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByAttribute(((java.lang.String)v9));
    Object v11 = "table";
    Object v12 = ((org.jsoup.nodes.Document)v8).text(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Document)v12).title();
    org.junit.Assert.assertEquals((Object)(""), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = "t$";
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementById(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = ((org.jsoup.nodes.Element)v8).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = "http";
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByAttribute(((java.lang.String)v9));
    Object v11 = "table";
    Object v12 = ((org.jsoup.nodes.Document)v8).text(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).siblingElements();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = "caption";
    Object v9 = ((org.jsoup.nodes.Element)v7).prependText(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = "http";
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByAttribute(((java.lang.String)v9));
    Object v11 = "table";
    Object v12 = ((org.jsoup.nodes.Document)v8).text(((java.lang.String)v11));
    Object v13 = "value";
    Object v14 = ((org.jsoup.nodes.Node)v12).absUrl(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(""), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).hashCode();
    Object v8 = "noscript";
    Object v9 = ((org.jsoup.nodes.Node)v6).hasAttr(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = "caption";
    Object v9 = ((org.jsoup.nodes.Element)v7).prependText(((java.lang.String)v8));
    Object v10 = "th";
    ((org.jsoup.nodes.Document)v9).title(((java.lang.String)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = ((org.jsoup.nodes.Element)v8).hasText();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Document)v7).normalise();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = "http";
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByAttribute(((java.lang.String)v9));
    Object v11 = "table";
    Object v12 = ((org.jsoup.nodes.Document)v8).text(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v12).nextSibling();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Node)v7).previousSibling();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = ((org.jsoup.nodes.Document)v8).normalise();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "BogusDoc\"ype";
    Object v4 = ((org.jsoup.nodes.Element)v2).hasClass(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).data();
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    Object v8 = ((org.jsoup.nodes.Document)v6).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = "l";
    Object v9 = ((org.jsoup.nodes.Node)v7).attr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v7).nextSibling();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Document)v7).normalise();
    Object v9 = "cFolgroup";
    Object v10 = ((org.jsoup.nodes.Element)v8).html(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "h@3";
    Object v8 = ((org.jsoup.nodes.Document)v6).text(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = "t";
    Object v9 = "colgroup";
    Object v10 = java.util.regex.Pattern.compile(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v7).getElementsByAttributeValueMatching(((java.lang.String)v8),((java.util.regex.Pattern)v10));
    Object v12 = ((org.jsoup.nodes.Element)v7).nextElementSibling();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = "width";
    Object v8 = ((org.jsoup.nodes.Element)v6).hasClass(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "tab}le";
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementById(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "htm{l";
    Object v8 = "head";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "blockquote";
    Object v11 = ((org.jsoup.nodes.Element)v9).toggleClass(((java.lang.String)v10));
    Object v12 = new org.jsoup.nodes.Document.OutputSettings();
    Object v13 = ((org.jsoup.nodes.Document)v11).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v12));
    Object v14 = ((org.jsoup.nodes.Node)v13).hashCode();
    Object v15 = "noscript";
    Object v16 = ((org.jsoup.nodes.Node)v13).hasAttr(((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Element)v6).equals(((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    Object v8 = ((org.jsoup.nodes.Document)v6).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v9 = "co";
    Object v10 = ((org.jsoup.nodes.Node)v8).hasAttr(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = ((org.jsoup.nodes.Document)v8).normalise();
    Object v10 = "InFrameset";
    Object v11 = "\\tbody";
    Object v12 = ((org.jsoup.nodes.Element)v9).getElementsByAttributeValue(((java.lang.String)v10),((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = ((org.jsoup.nodes.Document)v8).clone();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = "ti";
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementById(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "h@3";
    Object v8 = ((org.jsoup.nodes.Document)v6).text(((java.lang.String)v7));
    Object v9 = "h3";
    Object v10 = ((org.jsoup.nodes.Node)v8).attr(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(""), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Element)v7).classNames();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = ((org.jsoup.nodes.Document)v8).normalise();
    Object v10 = ((org.jsoup.nodes.Element)v9).children();
    Object v11 = "p";
    Object v12 = ((org.jsoup.nodes.Element)v9).appendElement(((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "thead";
    Object v8 = ((org.jsoup.nodes.Node)v6).hasAttr(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).hasText();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Document)v7).normalise();
    Object v9 = ((org.jsoup.nodes.Document)v8).normalise();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = "basefont";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = ((org.jsoup.nodes.Element)v8).className();
    org.junit.Assert.assertEquals((Object)(" blockquote"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).val();
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    Object v8 = ((org.jsoup.nodes.Document)v6).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).tag();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "t";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "t";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Document)v1).title();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    Object v8 = ((org.jsoup.nodes.Document)v6).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v9 = "noscript";
    Object v10 = ((org.jsoup.nodes.Element)v8).prependText(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "t";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "td";
    Object v3 = "thea";
    Object v4 = ((org.jsoup.nodes.Element)v1).getElementsByAttributeValueStarting(((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).parents();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = "#text";
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsMatchingOwnText(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = "title";
    Object v10 = ((org.jsoup.nodes.Element)v8).prependElement(((java.lang.String)v9));
    Object v11 = "colgiroup";
    Object v12 = ((org.jsoup.nodes.Element)v8).toggleClass(((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "htm{l";
    Object v8 = "head";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "blockquote";
    Object v11 = ((org.jsoup.nodes.Element)v9).toggleClass(((java.lang.String)v10));
    Object v12 = new org.jsoup.nodes.Document.OutputSettings();
    Object v13 = ((org.jsoup.nodes.Document)v11).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v12));
    Object v14 = ((org.jsoup.nodes.Element)v6).prependChild(((org.jsoup.nodes.Node)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "body";
    Object v8 = ((org.jsoup.nodes.Node)v6).hasAttr(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = "http";
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByAttribute(((java.lang.String)v9));
    Object v11 = "table";
    Object v12 = ((org.jsoup.nodes.Document)v8).text(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = "a";
    Object v8 = ((org.jsoup.nodes.Element)v6).removeClass(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Document)v7).normalise();
    Object v9 = ((org.jsoup.nodes.Element)v8).val();
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    Object v8 = ((org.jsoup.nodes.Document)v6).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v9 = "noscript";
    Object v10 = ((org.jsoup.nodes.Element)v8).prependText(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).data();
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).classNames();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = ((org.jsoup.nodes.Document)v8).normalise();
    Object v10 = ((org.jsoup.nodes.Element)v9).hashCode();
    org.junit.Assert.assertEquals((Object)(-1504941973), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    Object v8 = ((org.jsoup.nodes.Document)v6).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v9 = "noscript";
    Object v10 = ((org.jsoup.nodes.Element)v8).prependText(((java.lang.String)v9));
    Object v11 = "caption";
    Object v12 = "</";
    Object v13 = ((org.jsoup.nodes.Element)v10).attr(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "t(h";
    Object v15 = ((org.jsoup.nodes.Element)v10).before(((java.lang.String)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Document)v7).normalise();
    Object v9 = "cFolgroup";
    Object v10 = ((org.jsoup.nodes.Element)v8).html(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).text();
    org.junit.Assert.assertEquals((Object)("cFolgroup"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    Object v8 = ((org.jsoup.nodes.Document)v6).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v9 = 3;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexLessThan((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    Object v8 = ((org.jsoup.nodes.Document)v6).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v9 = "noscript";
    Object v10 = ((org.jsoup.nodes.Element)v8).prependText(((java.lang.String)v9));
    Object v11 = "htm";
    Object v12 = ((org.jsoup.nodes.Element)v10).removeClass(((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "h@3";
    Object v8 = ((org.jsoup.nodes.Document)v6).text(((java.lang.String)v7));
    Object v9 = "h5";
    Object v10 = ((org.jsoup.nodes.Node)v8).attr(((java.lang.String)v9));
    Object v11 = "htm{l";
    Object v12 = "head";
    Object v13 = org.jsoup.Jsoup.parse(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "blockquote";
    Object v15 = ((org.jsoup.nodes.Element)v13).toggleClass(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Element)v15).classNames();
    Object v17 = ((org.jsoup.nodes.Element)v8).classNames(((java.util.Set)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = ((org.jsoup.nodes.Element)v8).text();
    Object v10 = "nav";
    Object v11 = ((org.jsoup.nodes.Element)v8).append(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = "http";
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByAttribute(((java.lang.String)v9));
    Object v11 = "table";
    Object v12 = ((org.jsoup.nodes.Document)v8).text(((java.lang.String)v11));
    Object v13 = "abs:";
    Object v14 = ((org.jsoup.nodes.Node)v12).absUrl(((java.lang.String)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Document)v7).normalise();
    Object v9 = "thea";
    Object v10 = ((org.jsoup.nodes.Element)v8).after(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "]]>";
    Object v8 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    Object v8 = ((org.jsoup.nodes.Document)v6).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v9 = "noscript";
    Object v10 = ((org.jsoup.nodes.Element)v8).prependText(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).previousElementSibling();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = "http";
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByAttribute(((java.lang.String)v9));
    Object v11 = "table";
    Object v12 = ((org.jsoup.nodes.Document)v8).text(((java.lang.String)v11));
    Object v13 = "h";
    Object v14 = ((org.jsoup.nodes.Element)v12).prependText(((java.lang.String)v13));
    Object v15 = "colgroup";
    Object v16 = java.util.regex.Pattern.compile(((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Element)v12).getElementsMatchingOwnText(((java.util.regex.Pattern)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Document)v4).outputSettings(((org.jsoup.nodes.Document.OutputSettings)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = ((org.jsoup.nodes.Document)v8).normalise();
    Object v10 = ((org.jsoup.nodes.Element)v9).children();
    Object v11 = "p";
    Object v12 = ((org.jsoup.nodes.Element)v9).appendElement(((java.lang.String)v11));
    Object v13 = "td";
    Object v14 = ((org.jsoup.nodes.Element)v12).append(((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "h@3";
    Object v8 = ((org.jsoup.nodes.Document)v6).text(((java.lang.String)v7));
    Object v9 = "h5";
    Object v10 = ((org.jsoup.nodes.Node)v8).attr(((java.lang.String)v9));
    Object v11 = "htm{l";
    Object v12 = "head";
    Object v13 = org.jsoup.Jsoup.parse(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "blockquote";
    Object v15 = ((org.jsoup.nodes.Element)v13).toggleClass(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Element)v15).classNames();
    Object v17 = ((org.jsoup.nodes.Element)v8).classNames(((java.util.Set)v16));
    Object v18 = "c9lgroup";
    Object v19 = "textTarea";
    Object v20 = ((org.jsoup.nodes.Element)v17).getElementsByAttributeValueStarting(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = "tbody";
    Object v22 = ((org.jsoup.nodes.Element)v17).getElementById(((java.lang.String)v21));
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "htm{l";
    Object v1 = "head";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "blockquote";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).textNodes();
    org.junit.Assert.assertNotNull(v7);
  }
}
