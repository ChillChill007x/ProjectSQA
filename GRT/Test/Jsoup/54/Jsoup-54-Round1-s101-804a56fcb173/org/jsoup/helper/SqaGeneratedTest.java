package org.jsoup.helper;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = null;
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = null;
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).hasText();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v4));
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).nextElementSibling();
    Object v9 = new org.jsoup.helper.W3CDom();
    Object v10 = "b";
    Object v11 = org.jsoup.Jsoup.parse(((java.lang.String)v10));
    Object v12 = ((org.jsoup.helper.W3CDom)v9).fromJsoup(((org.jsoup.nodes.Document)v11));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v7),((org.w3c.dom.Document)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v7 = ((org.w3c.dom.Node)v6).getNamespaceURI();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).parents();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v4));
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.w3c.dom.Node)v9).getLocalName();
    Object v11 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v9));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v4));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "html";
    Object v4 = "bJody";
    Object v5 = 1;
    Object v6 = java.util.regex.Pattern.compile(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.jsoup.nodes.Element)v2).getElementsByAttributeValueMatching(((java.lang.String)v3),((java.util.regex.Pattern)v6));
    Object v8 = new org.jsoup.helper.W3CDom();
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v8).fromJsoup(((org.jsoup.nodes.Document)v10));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).ownText();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v4));
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = "colgroup";
    Object v9 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v8));
    Object v10 = new org.jsoup.helper.W3CDom();
    Object v11 = "b";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v11));
    Object v13 = ((org.jsoup.helper.W3CDom)v10).fromJsoup(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.w3c.dom.Node)v13).getLastChild();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v7),((org.w3c.dom.Document)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v7 = ((org.w3c.dom.Node)v6).getAttributes();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v4));
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = new org.jsoup.helper.W3CDom();
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v8).fromJsoup(((org.jsoup.nodes.Document)v10));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v7),((org.w3c.dom.Document)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = true;
    ((org.jsoup.nodes.Document)v2).updateMetaCharsetElement((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v10 = "Attr0buteValue_unquoted";
    Object v11 = "frameset";
    Object v12 = ((org.w3c.dom.Node)v9).isSupported(((java.lang.String)v10),((java.lang.String)v11));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v9));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Document)v5).body();
    Object v7 = new org.jsoup.helper.W3CDom();
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = ((org.jsoup.helper.W3CDom)v7).fromJsoup(((org.jsoup.nodes.Document)v9));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Document)v2).clone();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "ttle";
    Object v4 = ((org.jsoup.nodes.Node)v2).absUrl(((java.lang.String)v3));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    Object v9 = ((org.w3c.dom.Document)v8).createDocumentFragment();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "th";
    Object v4 = "i";
    Object v5 = ((org.jsoup.nodes.Element)v2).getElementsByAttributeValueStarting(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = ((org.w3c.dom.Node)v4).getLastChild();
    Object v6 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v4));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "col";
    Object v4 = ((org.jsoup.nodes.Element)v2).getElementsContainingText(((java.lang.String)v3));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    Object v9 = ((org.w3c.dom.Node)v8).getNodeName();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ">";
    Object v4 = ((org.jsoup.nodes.Element)v2).appendText(((java.lang.String)v3));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v4));
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = "caption";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    Object v10 = new org.jsoup.helper.W3CDom();
    Object v11 = "b";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v11));
    Object v13 = ((org.jsoup.helper.W3CDom)v10).fromJsoup(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.w3c.dom.Node)v13).getAttributes();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v7),((org.w3c.dom.Document)v13));
    Object v15 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v7 = "h";
    Object v8 = ((org.w3c.dom.Document)v6).createEntityReference(((java.lang.String)v7));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v6));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v7 = ((org.w3c.dom.Node)v6).getLastChild();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).text();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.w3c.dom.Document)v7).getDocumentURI();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    ((org.w3c.dom.Node)v6).normalize();
    Object v7 = null;
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "base";
    Object v4 = ((org.jsoup.nodes.Element)v2).getElementsByAttributeStarting(((java.lang.String)v3));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v7 = ((org.w3c.dom.Document)v6).getDomConfig();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).siblingNodes();
    Object v4 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).siblingNodes();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).siblingNodes();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v8 = "colgroup";
    Object v9 = ((org.w3c.dom.Document)v7).getElementById(((java.lang.String)v8));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v7 = "td";
    Object v8 = ((org.w3c.dom.Document)v6).createAttribute(((java.lang.String)v7));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v6));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).siblingNodes();
    Object v10 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).siblingNodes();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v8 = ((org.w3c.dom.Document)v7).getDomConfig();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "html";
    Object v4 = ((org.jsoup.nodes.Element)v2).getElementsContainingText(((java.lang.String)v3));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).siblingNodes();
    Object v9 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = org.jsoup.Jsoup.parse(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v2).appendChild(((org.jsoup.nodes.Node)v4));
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).siblingNodes();
    Object v10 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).childNodesCopy();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).siblingNodes();
    Object v8 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).siblingNodes();
    Object v8 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v9 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v8));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v7 = ((org.w3c.dom.Node)v6).getBaseURI();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).siblingNodes();
    Object v5 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v6 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = new org.jsoup.helper.W3CDom();
    Object v10 = "b";
    Object v11 = org.jsoup.Jsoup.parse(((java.lang.String)v10));
    Object v12 = ((org.jsoup.helper.W3CDom)v9).fromJsoup(((org.jsoup.nodes.Document)v11));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v8),((org.w3c.dom.Document)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ":ImmediateParent%s";
    Object v4 = ((org.jsoup.nodes.Element)v2).appendText(((java.lang.String)v3));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).siblingNodes();
    Object v9 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).siblingNodes();
    Object v5 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v6 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v5));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).siblingNodes();
    Object v5 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v6 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = new org.jsoup.helper.W3CDom();
    Object v10 = "b";
    Object v11 = org.jsoup.Jsoup.parse(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).siblingNodes();
    Object v13 = ((org.jsoup.helper.W3CDom)v9).fromJsoup(((org.jsoup.nodes.Document)v11));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v8),((org.w3c.dom.Document)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "tbody";
    Object v4 = ((org.jsoup.nodes.Element)v2).tagName(((java.lang.String)v3));
    Object v5 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = "tbody";
    Object v7 = ((org.jsoup.nodes.Element)v5).tagName(((java.lang.String)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = "tbody";
    Object v7 = ((org.jsoup.nodes.Element)v5).tagName(((java.lang.String)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v9 = "thead";
    Object v10 = ((org.w3c.dom.Document)v8).createElement(((java.lang.String)v9));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "bJody";
    Object v4 = 1;
    Object v5 = java.util.regex.Pattern.compile(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jsoup.nodes.Element)v2).getElementsMatchingOwnText(((java.util.regex.Pattern)v5));
    Object v7 = new org.jsoup.helper.W3CDom();
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).siblingNodes();
    Object v11 = ((org.jsoup.helper.W3CDom)v7).fromJsoup(((org.jsoup.nodes.Document)v9));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).siblingNodes();
    Object v10 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v11 = ((org.w3c.dom.Node)v10).getBaseURI();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = "tbody";
    Object v10 = ((org.jsoup.nodes.Element)v8).tagName(((java.lang.String)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v12 = ((org.w3c.dom.Document)v11).getXmlVersion();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v10 = "tf";
    Object v11 = ((org.w3c.dom.Node)v9).getUserData(((java.lang.String)v10));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v8));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).siblingNodes();
    Object v5 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v6 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = new org.jsoup.helper.W3CDom();
    Object v10 = "b";
    Object v11 = org.jsoup.Jsoup.parse(((java.lang.String)v10));
    Object v12 = ((org.jsoup.helper.W3CDom)v9).fromJsoup(((org.jsoup.nodes.Document)v11));
    Object v13 = "b";
    Object v14 = org.jsoup.Jsoup.parse(((java.lang.String)v13));
    Object v15 = ((org.jsoup.helper.W3CDom)v9).fromJsoup(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.w3c.dom.Node)v15).getParentNode();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v8),((org.w3c.dom.Document)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).dataset();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).siblingNodes();
    Object v8 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).siblingNodes();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v8 = ((org.w3c.dom.Node)v7).getOwnerDocument();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).siblingNodes();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v8 = "u";
    Object v9 = ((org.w3c.dom.Node)v7).lookupNamespaceURI(((java.lang.String)v8));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = "tbody";
    Object v5 = ((org.jsoup.nodes.Element)v3).tagName(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v7 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v6));
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = new org.jsoup.helper.W3CDom();
    Object v11 = "b";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v12).siblingNodes();
    Object v14 = ((org.jsoup.helper.W3CDom)v10).fromJsoup(((org.jsoup.nodes.Document)v12));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v9),((org.w3c.dom.Document)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).dataset();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = "tbody";
    Object v8 = ((org.jsoup.nodes.Element)v6).tagName(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v10 = ((org.w3c.dom.Document)v9).getXmlStandalone();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Document)v2).clone();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).siblingNodes();
    Object v8 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "bJody";
    Object v4 = 1;
    Object v5 = java.util.regex.Pattern.compile(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jsoup.nodes.Element)v2).getElementsMatchingText(((java.util.regex.Pattern)v5));
    Object v7 = new org.jsoup.helper.W3CDom();
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = ((org.jsoup.helper.W3CDom)v7).fromJsoup(((org.jsoup.nodes.Document)v9));
    Object v11 = "b";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v11));
    Object v13 = ((org.jsoup.helper.W3CDom)v7).fromJsoup(((org.jsoup.nodes.Document)v12));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v10 = "[";
    Object v11 = ((org.w3c.dom.Document)v9).getElementsByTagName(((java.lang.String)v10));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "l";
    Object v4 = "colgroup";
    Object v5 = ((org.jsoup.nodes.Element)v2).getElementsByAttributeValueContaining(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).siblingNodes();
    Object v10 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "caption";
    ((org.jsoup.nodes.Document)v2).title(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = "tbody";
    Object v9 = ((org.jsoup.nodes.Element)v7).tagName(((java.lang.String)v8));
    Object v10 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).id();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v9));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = ((org.jsoup.nodes.Element)v2).getElementsByIndexLessThan((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).siblingNodes();
    Object v9 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v7 = false;
    Object v8 = ((org.w3c.dom.Node)v6).cloneNode((((java.lang.Boolean)v7).booleanValue()));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v6));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v10 = "b";
    Object v11 = org.jsoup.Jsoup.parse(((java.lang.String)v10));
    Object v12 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v11));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = "tbody";
    Object v5 = ((org.jsoup.nodes.Element)v3).tagName(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v7 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v6));
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = -20;
    Object v11 = ((org.jsoup.nodes.Element)v9).getElementsByIndexLessThan((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v9));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.w3c.dom.Node)v9).getNodeType();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).siblingNodes();
    Object v5 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v6 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexEquals((((java.lang.Integer)v9).intValue()));
    Object v11 = new org.jsoup.helper.W3CDom();
    Object v12 = "b";
    Object v13 = org.jsoup.Jsoup.parse(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v13).siblingNodes();
    Object v15 = ((org.jsoup.helper.W3CDom)v11).fromJsoup(((org.jsoup.nodes.Document)v13));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v8),((org.w3c.dom.Document)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "thead";
    Object v4 = ((org.jsoup.nodes.Element)v2).tagName(((java.lang.String)v3));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = "tbody";
    Object v10 = ((org.jsoup.nodes.Element)v8).tagName(((java.lang.String)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v12 = ((org.jsoup.helper.W3CDom)v5).asString(((org.w3c.dom.Document)v11));
    Object v13 = "b";
    Object v14 = org.jsoup.Jsoup.parse(((java.lang.String)v13));
    Object v15 = -20;
    Object v16 = ((org.jsoup.nodes.Element)v14).getElementsByIndexLessThan((((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v14));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = "tbody";
    Object v7 = ((org.jsoup.nodes.Element)v5).tagName(((java.lang.String)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v9 = ((org.w3c.dom.Node)v8).getPrefix();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = java.io.Writer.nullWriter();
    Object v4 = ((org.jsoup.nodes.Element)v2).html(((java.lang.Appendable)v3));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).siblingNodes();
    Object v9 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "html";
    Object v4 = "htmGl";
    Object v5 = ((org.jsoup.nodes.Element)v2).getElementsByAttributeValueMatching(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = "tbody";
    Object v10 = ((org.jsoup.nodes.Element)v8).tagName(((java.lang.String)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = java.nio.charset.Charset.defaultCharset();
    ((org.jsoup.nodes.Document)v2).charset(((java.nio.charset.Charset)v3));
    Object v4 = null;
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = "tbody";
    Object v9 = ((org.jsoup.nodes.Element)v7).tagName(((java.lang.String)v8));
    Object v10 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).siblingNodes();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v8 = ((org.w3c.dom.Document)v7).getDocumentURI();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).siblingNodes();
    Object v8 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v9 = ((org.w3c.dom.Node)v8).getNamespaceURI();
    Object v10 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v8));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = org.jsoup.Jsoup.parse(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v2).prependChild(((org.jsoup.nodes.Node)v4));
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v10 = "b";
    Object v11 = org.jsoup.Jsoup.parse(((java.lang.String)v10));
    Object v12 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v11));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).siblingNodes();
    Object v5 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v6 = "?";
    Object v7 = "tabl";
    Object v8 = ((org.w3c.dom.Node)v5).getFeature(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v5));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = "html";
    Object v7 = "htmGl";
    Object v8 = ((org.jsoup.nodes.Element)v5).getElementsByAttributeValueMatching(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    ((org.w3c.dom.Node)v4).normalize();
    Object v5 = null;
    Object v6 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v4));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).empty();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v9));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "Joembed";
    Object v4 = "htm";
    Object v5 = ((org.jsoup.nodes.Element)v2).getElementsByAttributeValue(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).siblingNodes();
    Object v10 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = "html";
    Object v5 = "nofram";
    Object v6 = org.jsoup.parser.Parser.parseXmlFragment(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v2).insertChildren((((java.lang.Integer)v3).intValue()),((java.util.Collection)v6));
    Object v8 = new org.jsoup.helper.W3CDom();
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = "html";
    Object v12 = "htmGl";
    Object v13 = ((org.jsoup.nodes.Element)v10).getElementsByAttributeValueMatching(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.jsoup.helper.W3CDom)v8).fromJsoup(((org.jsoup.nodes.Document)v10));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v10 = "basefont";
    Object v11 = ((org.w3c.dom.Document)v9).createAttribute(((java.lang.String)v10));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = "html";
    Object v7 = "htmGl";
    Object v8 = ((org.jsoup.nodes.Element)v5).getElementsByAttributeValueMatching(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v10 = ">";
    Object v11 = "html";
    Object v12 = ((org.w3c.dom.Node)v9).isSupported(((java.lang.String)v10),((java.lang.String)v11));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "bJody";
    Object v4 = 1;
    Object v5 = java.util.regex.Pattern.compile(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jsoup.nodes.Element)v2).getElementsMatchingText(((java.util.regex.Pattern)v5));
    Object v7 = new org.jsoup.helper.W3CDom();
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = "tbody";
    Object v11 = ((org.jsoup.nodes.Element)v9).tagName(((java.lang.String)v10));
    Object v12 = ((org.jsoup.helper.W3CDom)v7).fromJsoup(((org.jsoup.nodes.Document)v9));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = "tbody";
    Object v5 = ((org.jsoup.nodes.Element)v3).tagName(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v7 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v6));
    Object v8 = new org.jsoup.helper.W3CDom();
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v8).fromJsoup(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v11));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).siblingNodes();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v8 = "htl";
    ((org.w3c.dom.Document)v7).setDocumentURI(((java.lang.String)v8));
    Object v9 = null;
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v7));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v10));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).siblingNodes();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v8 = "frameset";
    Object v9 = ((org.w3c.dom.Document)v7).createComment(((java.lang.String)v8));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = 28;
    Object v4 = ((org.jsoup.nodes.Element)v2).getElementsByIndexLessThan((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = "html";
    Object v9 = "htmGl";
    Object v10 = ((org.jsoup.nodes.Element)v7).getElementsByAttributeValueMatching(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = "tbody";
    Object v8 = ((org.jsoup.nodes.Element)v6).tagName(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v10 = ((org.jsoup.helper.W3CDom)v3).asString(((org.w3c.dom.Document)v9));
    Object v11 = "b";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v11));
    Object v13 = -20;
    Object v14 = ((org.jsoup.nodes.Element)v12).getElementsByIndexLessThan((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v12));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }
}
