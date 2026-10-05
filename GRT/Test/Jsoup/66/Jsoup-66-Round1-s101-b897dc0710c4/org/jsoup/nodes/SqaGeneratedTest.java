package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).nextElementSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = "thead";
    Object v7 = ((org.jsoup.nodes.Element)v5).tagName(((java.lang.String)v6));
    Object v8 = "ol";
    Object v9 = ((org.jsoup.nodes.Element)v5).appendText(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).html();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new java.io.StringWriter();
    Object v6 = ((org.jsoup.nodes.Element)v4).html(((java.lang.Appendable)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).cssSelector();
    org.junit.Assert.assertEquals((Object)("#root"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Element)v5).html();
    Object v7 = ((org.jsoup.nodes.Element)v5).siblingElements();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "tfoot";
    Object v6 = ((org.jsoup.nodes.Element)v4).getElementsByTag(((java.lang.String)v5));
    Object v7 = "h1";
    Object v8 = ((org.jsoup.nodes.Element)v4).hasClass(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "";
    Object v6 = new org.jsoup.nodes.Document(((java.lang.String)v5));
    Object v7 = "thea";
    Object v8 = true;
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.jsoup.nodes.Node)v9).root();
    Object v11 = ((org.jsoup.nodes.Node)v10).ownerDocument();
    Object v12 = ((org.jsoup.nodes.Node)v4).hasSameValue(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Node)v5).absUrl(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Element)v5).data();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = "hea";
    Object v8 = ((org.jsoup.nodes.Element)v6).hasClass(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v6).getAllElements();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new java.io.StringWriter();
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = "thea";
    Object v9 = true;
    Object v10 = ((org.jsoup.nodes.Element)v7).attr(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.jsoup.nodes.Node)v10).root();
    Object v12 = "colgroup";
    Object v13 = ((org.jsoup.nodes.Node)v11).absUrl(((java.lang.String)v12));
    Object v14 = ((java.lang.Appendable)v5).append(((java.lang.CharSequence)v13));
    Object v15 = 1;
    Object v16 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v4).outerHtmlHead(((java.lang.Appendable)v5),(((java.lang.Integer)v15).intValue()),((org.jsoup.nodes.Document.OutputSettings)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = "fraUmeset";
    Object v7 = ((org.jsoup.nodes.Element)v5).appendText(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v5).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Node)v6).baseUri();
    Object v8 = ((org.jsoup.nodes.Node)v6).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).hasParent();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = "tfoot";
    Object v7 = ((org.jsoup.nodes.Element)v5).before(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Element)v6).hasText();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = "track";
    Object v8 = ((org.jsoup.nodes.Node)v6).attr(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).siblingNodes();
    Object v7 = ((org.jsoup.nodes.Node)v5).nextSibling();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = "brp";
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementById(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = org.jsoup.nodes.Element.preserveWhitespace(((org.jsoup.nodes.Node)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Element)v6).cssSelector();
    org.junit.Assert.assertEquals((Object)("#root"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "option";
    Object v6 = ((org.jsoup.nodes.Element)v4).tagName(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).previousElementSibling();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependText(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v5).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Element)v5).nextElementSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Element)v6).dataNodes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Element)v5).hasAttributes();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = "?";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementsContainingOwnText(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Element)v5).dataNodes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = "PUBLIC";
    Object v9 = "tbod";
    Object v10 = ((org.jsoup.nodes.Node)v7).attr(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v7).clearAttributes();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Element)v5).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = "p";
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementById(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Element)v6).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Element)v6).html();
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Node)v6).baseUri();
    Object v8 = "";
    Object v9 = new org.jsoup.nodes.Document(((java.lang.String)v8));
    Object v10 = "thea";
    Object v11 = true;
    Object v12 = ((org.jsoup.nodes.Element)v9).attr(((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((org.jsoup.nodes.Node)v12).root();
    Object v14 = ((org.jsoup.nodes.Node)v13).ownerDocument();
    Object v15 = "track";
    Object v16 = ((org.jsoup.nodes.Node)v14).attr(((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Node)v6).hasSameValue(((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).ensureChildNodes();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = "t~";
    Object v9 = ((org.jsoup.nodes.Element)v7).appendElement(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = new java.io.StringWriter();
    Object v7 = ((org.jsoup.nodes.Node)v5).html(((java.lang.Appendable)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).childNodesCopy();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).val();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).previousSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = "t~";
    Object v9 = ((org.jsoup.nodes.Element)v7).appendElement(((java.lang.String)v8));
    Object v10 = ":tml";
    Object v11 = ((org.jsoup.nodes.Element)v9).val(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = "t~";
    Object v9 = ((org.jsoup.nodes.Element)v7).appendElement(((java.lang.String)v8));
    Object v10 = ":tml";
    Object v11 = ((org.jsoup.nodes.Element)v9).val(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).hasParent();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Element)v5).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = ((org.jsoup.nodes.Element)v8).isBlock();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = "t~";
    Object v9 = ((org.jsoup.nodes.Element)v7).appendElement(((java.lang.String)v8));
    Object v10 = ":tml";
    Object v11 = ((org.jsoup.nodes.Element)v9).val(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).childNodesCopy();
    Object v13 = "(object";
    Object v14 = ((org.jsoup.nodes.Node)v11).attr(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(""), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "";
    Object v6 = new org.jsoup.nodes.Document(((java.lang.String)v5));
    Object v7 = "thea";
    Object v8 = true;
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = "thea";
    Object v9 = true;
    Object v10 = ((org.jsoup.nodes.Element)v7).attr(((java.lang.String)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.jsoup.nodes.Node)v10).root();
    Object v12 = ((org.jsoup.nodes.Element)v11).hasAttributes();
    Object v13 = ((org.jsoup.nodes.Node)v5).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = "t~";
    Object v9 = ((org.jsoup.nodes.Element)v7).appendElement(((java.lang.String)v8));
    Object v10 = ":tml";
    Object v11 = ((org.jsoup.nodes.Element)v9).val(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).childNodeSize();
    Object v13 = "htmJ";
    Object v14 = ((org.jsoup.nodes.Element)v11).hasClass(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = "tbody";
    Object v8 = ((org.jsoup.nodes.Element)v6).prepend(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = "tabl]e";
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementById(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Node)v6).root();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Node)v6).root();
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodes();
    Object v9 = "tbody";
    Object v10 = ((org.jsoup.nodes.Element)v7).getElementsByClass(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).root();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Node)v6).root();
    Object v8 = ((org.jsoup.nodes.Node)v7).previousSibling();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Node)v6).clearAttributes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Node)v6).root();
    Object v8 = "articoe";
    Object v9 = ((org.jsoup.nodes.Element)v7).tagName(((java.lang.String)v8));
    Object v10 = 1;
    Object v11 = "";
    Object v12 = new org.jsoup.nodes.Document(((java.lang.String)v11));
    Object v13 = "thea";
    Object v14 = true;
    Object v15 = ((org.jsoup.nodes.Element)v12).attr(((java.lang.String)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((org.jsoup.nodes.Node)v15).root();
    Object v17 = ((org.jsoup.nodes.Node)v16).ownerDocument();
    Object v18 = ((org.jsoup.nodes.Element)v17).dataNodes();
    Object v19 = ((org.jsoup.nodes.Element)v7).insertChildren((((java.lang.Integer)v10).intValue()),((java.util.Collection)v18));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = "";
    Object v8 = new org.jsoup.nodes.Document(((java.lang.String)v7));
    Object v9 = "thea";
    Object v10 = true;
    Object v11 = ((org.jsoup.nodes.Element)v8).attr(((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.jsoup.nodes.Node)v11).root();
    Object v13 = "colgroup";
    Object v14 = ((org.jsoup.nodes.Node)v12).absUrl(((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Node)v6).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).childNodeSize();
    Object v9 = new java.io.StringWriter();
    Object v10 = -19;
    Object v11 = new org.jsoup.nodes.Document.OutputSettings();
    Object v12 = org.jsoup.nodes.Document.OutputSettings.Syntax.xml;
    Object v13 = ((org.jsoup.nodes.Document.OutputSettings)v11).syntax(((org.jsoup.nodes.Document.OutputSettings.Syntax)v12));
    ((org.jsoup.nodes.Element)v7).outerHtmlHead(((java.lang.Appendable)v9),(((java.lang.Integer)v10).intValue()),((org.jsoup.nodes.Document.OutputSettings)v11));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).root();
    Object v9 = "html";
    Object v10 = new org.jsoup.select.Evaluator.ContainsData(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v8).is(((org.jsoup.select.Evaluator)v10));
    Object v12 = ((org.jsoup.nodes.Element)v8).previousElementSibling();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Node)v6).clearAttributes();
    Object v8 = -11;
    Object v9 = new org.jsoup.nodes.Node[]{null};
    Object v10 = ((org.jsoup.nodes.Element)v7).insertChildren((((java.lang.Integer)v8).intValue()),((org.jsoup.nodes.Node[])v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Node)v6).clearAttributes();
    Object v8 = ((org.jsoup.nodes.Element)v7).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = "t~";
    Object v9 = ((org.jsoup.nodes.Element)v7).appendElement(((java.lang.String)v8));
    Object v10 = ":tml";
    Object v11 = ((org.jsoup.nodes.Element)v9).val(((java.lang.String)v10));
    Object v12 = "col";
    Object v13 = ((org.jsoup.nodes.Element)v11).toggleClass(((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = "PUBLIC";
    Object v9 = "tbod";
    Object v10 = ((org.jsoup.nodes.Node)v7).attr(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v7).clearAttributes();
    Object v12 = ((org.jsoup.nodes.Element)v11).hasText();
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = "t~";
    Object v9 = ((org.jsoup.nodes.Element)v7).appendElement(((java.lang.String)v8));
    Object v10 = ":tml";
    Object v11 = ((org.jsoup.nodes.Element)v9).val(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).unwrap();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Node)v6).clearAttributes();
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodesCopy();
    Object v9 = "tead";
    Object v10 = ((org.jsoup.nodes.Node)v7).absUrl(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(""), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v5).text(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).root();
    Object v9 = ((org.jsoup.nodes.Node)v8).clearAttributes();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = 1;
    Object v7 = "";
    Object v8 = new org.jsoup.nodes.Document(((java.lang.String)v7));
    Object v9 = "thea";
    Object v10 = true;
    Object v11 = ((org.jsoup.nodes.Element)v8).attr(((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.jsoup.nodes.Node)v11).root();
    Object v13 = ((org.jsoup.nodes.Element)v12).dataNodes();
    Object v14 = ((org.jsoup.nodes.Element)v5).insertChildren((((java.lang.Integer)v6).intValue()),((java.util.Collection)v13));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Node)v6).root();
    Object v8 = ":rev%s";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = "t~";
    Object v9 = ((org.jsoup.nodes.Element)v7).appendElement(((java.lang.String)v8));
    Object v10 = ":tml";
    Object v11 = ((org.jsoup.nodes.Element)v9).val(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).ownerDocument();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).root();
    Object v9 = new java.io.StringWriter();
    Object v10 = ((org.jsoup.nodes.Element)v8).html(((java.lang.Appendable)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Element)v5).clone();
    Object v7 = -22;
    Object v8 = "";
    Object v9 = new org.jsoup.nodes.Document(((java.lang.String)v8));
    Object v10 = "thea";
    Object v11 = true;
    Object v12 = ((org.jsoup.nodes.Element)v9).attr(((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((org.jsoup.nodes.Node)v12).root();
    Object v14 = ((org.jsoup.nodes.Element)v13).dataNodes();
    Object v15 = ((org.jsoup.nodes.Element)v5).insertChildren((((java.lang.Integer)v7).intValue()),((java.util.Collection)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).root();
    Object v9 = 32;
    Object v10 = "";
    Object v11 = new org.jsoup.nodes.Document(((java.lang.String)v10));
    Object v12 = "thea";
    Object v13 = true;
    Object v14 = ((org.jsoup.nodes.Element)v11).attr(((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = ((org.jsoup.nodes.Node)v14).root();
    Object v16 = ((org.jsoup.nodes.Node)v15).ownerDocument();
    Object v17 = ((org.jsoup.nodes.Element)v16).dataNodes();
    Object v18 = ((org.jsoup.nodes.Element)v8).insertChildren((((java.lang.Integer)v9).intValue()),((java.util.Collection)v17));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = new org.jsoup.nodes.Document(((java.lang.String)v8));
    Object v10 = "thea";
    Object v11 = true;
    Object v12 = ((org.jsoup.nodes.Element)v9).attr(((java.lang.String)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((org.jsoup.nodes.Node)v12).root();
    Object v14 = ((org.jsoup.nodes.Node)v13).ownerDocument();
    Object v15 = ((org.jsoup.nodes.Element)v7).doClone(((org.jsoup.nodes.Node)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Node)v6).root();
    Object v8 = ":rev%s";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).data();
    org.junit.Assert.assertEquals((Object)(""), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodesCopy();
    Object v9 = ((org.jsoup.nodes.Node)v7).hasParent();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = "";
    Object v8 = new org.jsoup.nodes.Document(((java.lang.String)v7));
    Object v9 = "thea";
    Object v10 = true;
    Object v11 = ((org.jsoup.nodes.Element)v8).attr(((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.jsoup.nodes.Element)v6).doClone(((org.jsoup.nodes.Node)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Node)v6).root();
    Object v8 = "input";
    Object v9 = ((org.jsoup.nodes.Element)v7).appendElement(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v7).textNodes();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).root();
    Object v9 = ((org.jsoup.nodes.Node)v8).parentNode();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).root();
    ((org.jsoup.nodes.Node)v8).remove();
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Element)v5).id();
    Object v7 = "";
    Object v8 = new org.jsoup.nodes.Document(((java.lang.String)v7));
    Object v9 = "thea";
    Object v10 = true;
    Object v11 = ((org.jsoup.nodes.Element)v8).attr(((java.lang.String)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.jsoup.nodes.Node)v11).root();
    Object v13 = ((org.jsoup.nodes.Node)v12).ownerDocument();
    Object v14 = ((org.jsoup.nodes.Node)v13).root();
    Object v15 = ((org.jsoup.nodes.Element)v5).before(((org.jsoup.nodes.Node)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Node)v6).clearAttributes();
    Object v8 = ((org.jsoup.nodes.Element)v7).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = new java.io.StringWriter();
    Object v8 = 0;
    Object v9 = new org.jsoup.nodes.Document.OutputSettings();
    Object v10 = true;
    Object v11 = ((org.jsoup.nodes.Document.OutputSettings)v9).outline((((java.lang.Boolean)v10).booleanValue()));
    ((org.jsoup.nodes.Element)v6).outerHtmlHead(((java.lang.Appendable)v7),(((java.lang.Integer)v8).intValue()),((org.jsoup.nodes.Document.OutputSettings)v9));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Node)v6).root();
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodesCopy();
    Object v9 = ((org.jsoup.nodes.Element)v7).id();
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Node)v6).clearAttributes();
    Object v8 = ((org.jsoup.nodes.Element)v7).val();
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = "thead";
    Object v7 = ((org.jsoup.nodes.Element)v5).tagName(((java.lang.String)v6));
    Object v8 = "ol";
    Object v9 = ((org.jsoup.nodes.Element)v5).appendText(((java.lang.String)v8));
    Object v10 = -52;
    Object v11 = ((org.jsoup.nodes.Element)v9).getElementsByIndexEquals((((java.lang.Integer)v10).intValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = "t~";
    Object v9 = ((org.jsoup.nodes.Element)v7).appendElement(((java.lang.String)v8));
    Object v10 = "";
    Object v11 = new org.jsoup.nodes.Document(((java.lang.String)v10));
    Object v12 = "thea";
    Object v13 = true;
    Object v14 = ((org.jsoup.nodes.Element)v11).attr(((java.lang.String)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new java.io.StringWriter();
    Object v16 = ((org.jsoup.nodes.Element)v14).html(((java.lang.Appendable)v15));
    Object v17 = Character.valueOf((char)2);
    Object v18 = ((java.lang.Appendable)v16).append((((java.lang.Character)v17).charValue()));
    Object v19 = 4;
    Object v20 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v9).outerHtmlTail(((java.lang.Appendable)v16),(((java.lang.Integer)v19).intValue()),((org.jsoup.nodes.Document.OutputSettings)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = "t~";
    Object v9 = ((org.jsoup.nodes.Element)v7).appendElement(((java.lang.String)v8));
    Object v10 = "html";
    Object v11 = new org.jsoup.select.Evaluator.ContainsData(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v9).is(((org.jsoup.select.Evaluator)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = 0;
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementsByIndexLessThan((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.jsoup.nodes.Element)v5).cssSelector();
    org.junit.Assert.assertEquals((Object)("#root"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new java.io.StringWriter();
    Object v6 = 0;
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    Object v8 = ((org.jsoup.nodes.Document.OutputSettings)v7).clone();
    ((org.jsoup.nodes.Element)v4).outerHtmlTail(((java.lang.Appendable)v5),(((java.lang.Integer)v6).intValue()),((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = "br";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "thea";
    Object v3 = true;
    Object v4 = ((org.jsoup.nodes.Element)v1).attr(((java.lang.String)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "\"";
    Object v7 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v6));
    Object v8 = "t~";
    Object v9 = ((org.jsoup.nodes.Element)v7).appendElement(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }
}
