package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "rowspan";
    Object v1 = "meta";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "src";
    Object v4 = ((org.jsoup.nodes.Node)v2).attr(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).children();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "are";
    Object v6 = ((org.jsoup.nodes.Element)v4).is(((java.lang.String)v5));
    Object v7 = "html";
    Object v8 = ((org.jsoup.nodes.Element)v4).getElementById(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = 58;
    Object v6 = new java.io.StringWriter((((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v4).outerHtmlHead(((java.lang.Appendable)v6),(((java.lang.Integer)v7).intValue()),((org.jsoup.nodes.Document.OutputSettings)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "cAption";
    Object v6 = ((org.jsoup.nodes.Element)v4).getElementsContainingText(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "td5";
    Object v6 = ((org.jsoup.nodes.Element)v4).getElementsByClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "th";
    Object v6 = ((org.jsoup.nodes.Element)v4).getElementsByAttribute(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).hasText();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "Data map must not be null";
    Object v6 = ((org.jsoup.nodes.Element)v4).after(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = 58;
    Object v6 = new java.io.StringWriter((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.jsoup.nodes.Element)v4).html(((java.lang.Appendable)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).cssSelector();
    org.junit.Assert.assertEquals((Object)("#root.body"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).textNodes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "rowspan";
    Object v1 = "meta";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).siblingNodes();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "rowspan";
    Object v1 = "meta";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "UTF-8";
    Object v4 = ((org.jsoup.nodes.Node)v2).absUrl(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "rowspan";
    Object v1 = "meta";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "h4";
    Object v4 = ((org.jsoup.nodes.Node)v2).attr(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v2).previousSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "rowspan";
    Object v1 = "meta";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).nextSibling();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "rowspan";
    Object v1 = "meta";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).childNodesCopy();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "rowspan";
    Object v1 = "meta";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).siblingNodes();
    Object v4 = "captiomn";
    Object v5 = ((org.jsoup.nodes.Node)v2).hasAttr(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).html();
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = 58;
    Object v8 = new java.io.StringWriter((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.jsoup.nodes.Node)v6).html(((java.lang.Appendable)v8));
    Object v10 = "srQc";
    Object v11 = ((org.jsoup.nodes.Node)v6).attr(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "ralue";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "br";
    Object v8 = new org.jsoup.nodes.Document(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).toString();
    Object v10 = "body";
    Object v11 = ((org.jsoup.nodes.Element)v8).toggleClass(((java.lang.String)v10));
    Object v12 = 58;
    Object v13 = new java.io.StringWriter((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.jsoup.nodes.Element)v11).html(((java.lang.Appendable)v13));
    Object v15 = 6;
    Object v16 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v6).outerHtmlHead(((java.lang.Appendable)v14),(((java.lang.Integer)v15).intValue()),((org.jsoup.nodes.Document.OutputSettings)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "rowspan";
    Object v1 = "meta";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "rowspan";
    Object v1 = "meta";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).siblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).hasText();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = ((org.jsoup.nodes.Element)v6).hasClass(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "rowspan";
    Object v1 = "meta";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).siblingNodes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "rowspan";
    Object v1 = "meta";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = 58;
    Object v5 = new java.io.StringWriter((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jsoup.nodes.Node)v3).html(((java.lang.Appendable)v5));
    Object v7 = "rowspan";
    Object v8 = "meta";
    Object v9 = new org.jsoup.nodes.Comment(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).root();
    ((org.jsoup.nodes.Node)v3).replaceWith(((org.jsoup.nodes.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = -50;
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementsByIndexGreaterThan((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.jsoup.nodes.Element)v6).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "rowspan";
    Object v1 = "meta";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = "br";
    Object v5 = new org.jsoup.nodes.Document(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).toString();
    Object v7 = "body";
    Object v8 = ((org.jsoup.nodes.Element)v5).toggleClass(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).cssSelector();
    Object v10 = ((org.jsoup.nodes.Node)v3).hasSameValue(((java.lang.Object)v9));
    Object v11 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "rowspan";
    Object v1 = "meta";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = "rowspan";
    Object v5 = "meta";
    Object v6 = new org.jsoup.nodes.Comment(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).siblingNodes();
    Object v8 = "captiomn";
    Object v9 = ((org.jsoup.nodes.Node)v6).hasAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v3).hasSameValue(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).siblingElements();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = false;
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "tfoot";
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementById(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = false;
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "br";
    Object v11 = new org.jsoup.nodes.Document(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).children();
    Object v13 = new java.util.TreeSet(((java.util.Collection)v12));
    Object v14 = ((org.jsoup.nodes.Element)v9).classNames(((java.util.Set)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = false;
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "br";
    Object v11 = new org.jsoup.nodes.Document(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).children();
    Object v13 = new java.util.TreeSet(((java.util.Collection)v12));
    Object v14 = ((org.jsoup.nodes.Element)v9).classNames(((java.util.Set)v13));
    Object v15 = 12;
    Object v16 = "br";
    Object v17 = new org.jsoup.nodes.Document(((java.lang.String)v16));
    Object v18 = ((org.jsoup.nodes.Element)v17).children();
    Object v19 = ((org.jsoup.nodes.Element)v14).insertChildren((((java.lang.Integer)v15).intValue()),((java.util.Collection)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "]";
    Object v8 = ((org.jsoup.nodes.Element)v6).removeClass(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v6).previousElementSibling();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "ralue";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = -30;
    Object v8 = "rowspan";
    Object v9 = "meta";
    Object v10 = new org.jsoup.nodes.Comment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).siblingNodes();
    Object v12 = ((org.jsoup.nodes.Element)v6).insertChildren((((java.lang.Integer)v7).intValue()),((java.util.Collection)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).dataNodes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementsByTag(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "rowspan";
    Object v1 = "meta";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = org.jsoup.nodes.Element.preserveWhitespace(((org.jsoup.nodes.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "colgroup";
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementById(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = "html";
    Object v9 = "thead";
    Object v10 = ((org.jsoup.nodes.Node)v7).attr(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "html";
    Object v12 = ((org.jsoup.nodes.Node)v7).hasAttr(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).nextSibling();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Element)v7).ownText();
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = "rowspan";
    Object v9 = "meta";
    Object v10 = new org.jsoup.nodes.Comment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).root();
    Object v12 = ((org.jsoup.nodes.Node)v7).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).textNodes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "thead";
    Object v8 = ((org.jsoup.nodes.Node)v6).removeAttr(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v6).previousElementSibling();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).nextElementSibling();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "ralue";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).data();
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).children();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).val();
    org.junit.Assert.assertEquals((Object)("abs:href"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "parm";
    Object v8 = "Header name must not be null";
    Object v9 = ((org.jsoup.nodes.Element)v6).getElementsByAttributeValue(((java.lang.String)v7),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "rowspan";
    Object v1 = "meta";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = "t";
    Object v9 = ((org.jsoup.nodes.Node)v7).hasAttr(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = "br";
    Object v9 = new org.jsoup.nodes.Document(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).toString();
    Object v11 = "body";
    Object v12 = ((org.jsoup.nodes.Element)v9).toggleClass(((java.lang.String)v11));
    Object v13 = "abs:href";
    Object v14 = ((org.jsoup.nodes.Element)v12).val(((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Node)v14).ownerDocument();
    Object v16 = ((org.jsoup.nodes.Node)v15).childNodes();
    Object v17 = ((org.jsoup.nodes.Element)v7).after(((org.jsoup.nodes.Node)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Element)v7).html();
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "rowspan";
    Object v1 = "meta";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = new org.jsoup.nodes.Document.OutputSettings();
    Object v5 = ((org.jsoup.nodes.Node)v3).hasSameValue(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementsByClass(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Element)v7).textNodes();
    Object v9 = 58;
    Object v10 = new java.io.StringWriter((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.jsoup.nodes.Element)v7).html(((java.lang.Appendable)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "rowspan";
    Object v1 = "meta";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "html";
    Object v8 = ((org.jsoup.nodes.Element)v6).removeClass(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v6).dataNodes();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = false;
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.jsoup.nodes.Element)v9).dataNodes();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Element)v7).data();
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "rowspan";
    Object v6 = "meta";
    Object v7 = new org.jsoup.nodes.Comment(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).siblingNodes();
    Object v9 = ((org.jsoup.nodes.Node)v4).hasSameValue(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Element)v7).nodeName();
    org.junit.Assert.assertEquals((Object)("#document"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).dataNodes();
    Object v8 = "ScrptDataEscapedEndTagOpen";
    Object v9 = "</";
    Object v10 = ((org.jsoup.nodes.Element)v6).getElementsByAttributeValueMatching(((java.lang.String)v8),((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = ((org.jsoup.nodes.Element)v6).toggleClass(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).previousSibling();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "rowspan";
    Object v1 = "meta";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = ((org.jsoup.nodes.Element)v6).toggleClass(((java.lang.String)v7));
    Object v9 = "d-t";
    Object v10 = ((org.jsoup.nodes.Element)v8).removeClass(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = ((org.jsoup.nodes.Element)v8).html(((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = false;
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "br";
    Object v11 = new org.jsoup.nodes.Document(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).children();
    Object v13 = new java.util.TreeSet(((java.util.Collection)v12));
    Object v14 = ((org.jsoup.nodes.Element)v9).classNames(((java.util.Set)v13));
    Object v15 = ((org.jsoup.nodes.Element)v14).textNodes();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Element)v7).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Element)v7).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "ralue";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = 11;
    Object v8 = "rowspan";
    Object v9 = "meta";
    Object v10 = new org.jsoup.nodes.Comment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).root();
    Object v12 = ((org.jsoup.nodes.Node)v11).siblingNodes();
    Object v13 = ((org.jsoup.nodes.Element)v6).insertChildren((((java.lang.Integer)v7).intValue()),((java.util.Collection)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = "co";
    Object v9 = ((org.jsoup.nodes.Element)v7).hasClass(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Node)v7).outerHtml();
    Object v9 = "br";
    Object v10 = new org.jsoup.nodes.Document(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).toString();
    Object v12 = "body";
    Object v13 = ((org.jsoup.nodes.Element)v10).toggleClass(((java.lang.String)v12));
    Object v14 = "abs:href";
    Object v15 = ((org.jsoup.nodes.Element)v13).val(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Node)v15).ownerDocument();
    Object v17 = ((org.jsoup.nodes.Element)v16).textNodes();
    Object v18 = 58;
    Object v19 = new java.io.StringWriter((((java.lang.Integer)v18).intValue()));
    Object v20 = ((org.jsoup.nodes.Element)v16).html(((java.lang.Appendable)v19));
    Object v21 = 0;
    Object v22 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v7).outerHtmlHead(((java.lang.Appendable)v20),(((java.lang.Integer)v21).intValue()),((org.jsoup.nodes.Document.OutputSettings)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "ScriptDataDoubleEscapedLessthanSign";
    Object v8 = ((org.jsoup.nodes.Element)v6).append(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).html();
    Object v8 = "ifram";
    Object v9 = "bod)";
    Object v10 = ((org.jsoup.nodes.Element)v6).getElementsByAttributeValueEnding(((java.lang.String)v8),((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = "listing";
    Object v9 = ((org.jsoup.nodes.Element)v7).prepend(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = false;
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = "br";
    Object v11 = new org.jsoup.nodes.Document(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).children();
    Object v13 = new java.util.TreeSet(((java.util.Collection)v12));
    Object v14 = ((org.jsoup.nodes.Element)v9).classNames(((java.util.Set)v13));
    Object v15 = 58;
    Object v16 = new java.io.StringWriter((((java.lang.Integer)v15).intValue()));
    Object v17 = 0;
    Object v18 = new org.jsoup.nodes.Document.OutputSettings();
    Object v19 = false;
    Object v20 = ((org.jsoup.nodes.Document.OutputSettings)v18).outline((((java.lang.Boolean)v19).booleanValue()));
    ((org.jsoup.nodes.Element)v14).outerHtmlHead(((java.lang.Appendable)v16),(((java.lang.Integer)v17).intValue()),((org.jsoup.nodes.Document.OutputSettings)v18));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = false;
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.jsoup.nodes.Element)v9).empty();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = "textarea";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementsMatchingText(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "br";
    Object v8 = new org.jsoup.nodes.Document(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).children();
    Object v10 = new java.util.TreeSet(((java.util.Collection)v9));
    Object v11 = ((org.jsoup.nodes.Element)v6).classNames(((java.util.Set)v10));
    Object v12 = ((org.jsoup.nodes.Element)v6).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = ((org.jsoup.nodes.Element)v6).toggleClass(((java.lang.String)v7));
    Object v9 = -70;
    Object v10 = ((org.jsoup.nodes.Element)v8).child((((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Element)v7).children();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = false;
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.jsoup.nodes.Element)v9).empty();
    Object v11 = "<";
    Object v12 = ((org.jsoup.nodes.Element)v10).getElementsByAttributeStarting(((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).tag();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = ((org.jsoup.nodes.Element)v6).toggleClass(((java.lang.String)v7));
    Object v9 = 58;
    Object v10 = new java.io.StringWriter((((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    Object v12 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v8).outerHtmlHead(((java.lang.Appendable)v10),(((java.lang.Integer)v11).intValue()),((org.jsoup.nodes.Document.OutputSettings)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = ((org.jsoup.nodes.Element)v6).toggleClass(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).toggleClass(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Element)v7).nextElementSibling();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "br";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v3));
    Object v5 = "abs:href";
    Object v6 = ((org.jsoup.nodes.Element)v4).val(((java.lang.String)v5));
    Object v7 = "\"";
    Object v8 = false;
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.jsoup.nodes.Element)v9).empty();
    Object v11 = ((org.jsoup.nodes.Node)v10).ownerDocument();
    org.junit.Assert.assertNotNull(v11);
  }
}
