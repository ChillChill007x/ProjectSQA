package org.jsoup.helper;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
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
  public void test3() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v4));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
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
  public void test5() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v4));
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).className();
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
  public void test6() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v7 = false;
    ((org.w3c.dom.Document)v6).setStrictErrorChecking((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v6));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
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
    Object v7 = "td";
    Object v8 = "li";
    Object v9 = ((org.w3c.dom.Document)v6).createElementNS(((java.lang.String)v7),((java.lang.String)v8));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v6));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
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
  public void test9() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v4));
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v3).asString(((org.w3c.dom.Document)v7));
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v10));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = new org.jsoup.helper.W3CDom();
    Object v3 = "b";
    Object v4 = org.jsoup.Jsoup.parse(((java.lang.String)v3));
    Object v5 = ((org.jsoup.helper.W3CDom)v2).fromJsoup(((org.jsoup.nodes.Document)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v1).asString(((org.w3c.dom.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v9));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "thead";
    Object v4 = ((org.jsoup.nodes.Element)v2).prependText(((java.lang.String)v3));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.helper.W3CDom)v5).asString(((org.w3c.dom.Document)v9));
    Object v11 = "b";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v11));
    Object v13 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v12));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = 0;
    Object v4 = "\\select";
    Object v5 = new org.jsoup.select.Evaluator.Attribute(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = org.jsoup.select.Selector.select(((org.jsoup.select.Evaluator)v5),((org.jsoup.nodes.Element)v7));
    Object v9 = ((org.jsoup.nodes.Element)v2).insertChildren((((java.lang.Integer)v3).intValue()),((java.util.Collection)v8));
    Object v10 = new org.jsoup.helper.W3CDom();
    Object v11 = new org.jsoup.helper.W3CDom();
    Object v12 = "b";
    Object v13 = org.jsoup.Jsoup.parse(((java.lang.String)v12));
    Object v14 = ((org.jsoup.helper.W3CDom)v11).fromJsoup(((org.jsoup.nodes.Document)v13));
    Object v15 = ((org.jsoup.helper.W3CDom)v10).asString(((org.w3c.dom.Document)v14));
    Object v16 = "b";
    Object v17 = org.jsoup.Jsoup.parse(((java.lang.String)v16));
    Object v18 = ((org.jsoup.helper.W3CDom)v10).fromJsoup(((org.jsoup.nodes.Document)v17));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v3).asString(((org.w3c.dom.Document)v7));
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v10));
    ((org.w3c.dom.Document)v11).normalizeDocument();
    Object v12 = null;
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v11));
    Object v13 = null;
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
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v3).asString(((org.w3c.dom.Document)v7));
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v10));
    Object v12 = "UTF-8";
    Object v13 = ((org.w3c.dom.Node)v11).lookupPrefix(((java.lang.String)v12));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v11));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v3).asString(((org.w3c.dom.Document)v7));
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.w3c.dom.Node)v11).getOwnerDocument();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clearAttributes();
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
  public void test18() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v7 = ((org.w3c.dom.Document)v6).createDocumentFragment();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = new org.jsoup.helper.W3CDom();
    Object v3 = "b";
    Object v4 = org.jsoup.Jsoup.parse(((java.lang.String)v3));
    Object v5 = ((org.jsoup.helper.W3CDom)v2).fromJsoup(((org.jsoup.nodes.Document)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v1).asString(((org.w3c.dom.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v9));
    Object v11 = new org.jsoup.helper.W3CDom();
    Object v12 = new org.jsoup.helper.W3CDom();
    Object v13 = "b";
    Object v14 = org.jsoup.Jsoup.parse(((java.lang.String)v13));
    Object v15 = ((org.jsoup.helper.W3CDom)v12).fromJsoup(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.helper.W3CDom)v11).asString(((org.w3c.dom.Document)v15));
    Object v17 = "b";
    Object v18 = org.jsoup.Jsoup.parse(((java.lang.String)v17));
    Object v19 = ((org.jsoup.helper.W3CDom)v11).fromJsoup(((org.jsoup.nodes.Document)v18));
    Object v20 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v19));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).childNodesCopy();
    Object v4 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "Rhtml";
    Object v4 = ((org.jsoup.nodes.Element)v2).getElementById(((java.lang.String)v3));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodesCopy();
    Object v9 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
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
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodesCopy();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodesCopy();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v8 = "rp";
    Object v9 = "";
    Object v10 = ((org.w3c.dom.Node)v7).getFeature(((java.lang.String)v8),((java.lang.String)v9));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    Object v5 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v6 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v5));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = new org.jsoup.helper.W3CDom();
    Object v3 = "b";
    Object v4 = org.jsoup.Jsoup.parse(((java.lang.String)v3));
    Object v5 = ((org.jsoup.helper.W3CDom)v2).fromJsoup(((org.jsoup.nodes.Document)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v1).asString(((org.w3c.dom.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v9));
    Object v11 = "b";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v11));
    Object v13 = new org.jsoup.helper.W3CDom();
    Object v14 = "b";
    Object v15 = org.jsoup.Jsoup.parse(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Node)v15).childNodesCopy();
    Object v17 = ((org.jsoup.helper.W3CDom)v13).fromJsoup(((org.jsoup.nodes.Document)v15));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v12),((org.w3c.dom.Document)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
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
    Object v9 = ((org.jsoup.nodes.Node)v8).childNodesCopy();
    Object v10 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v10));
    Object v11 = null;
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
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodesCopy();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v8 = ((org.w3c.dom.Node)v7).getPreviousSibling();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
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
    Object v3 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Document)v5).body();
    Object v7 = new org.jsoup.helper.W3CDom();
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).childNodesCopy();
    Object v11 = ((org.jsoup.helper.W3CDom)v7).fromJsoup(((org.jsoup.nodes.Document)v9));
    Object v12 = "colgroup";
    ((org.w3c.dom.Document)v11).setDocumentURI(((java.lang.String)v12));
    Object v13 = null;
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v11));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Document)v2).clone();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).childNodesCopy();
    Object v8 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v8));
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
    Object v3 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = new org.jsoup.helper.W3CDom();
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = ((org.jsoup.helper.W3CDom)v7).fromJsoup(((org.jsoup.nodes.Document)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v6).asString(((org.w3c.dom.Document)v10));
    Object v12 = "b";
    Object v13 = org.jsoup.Jsoup.parse(((java.lang.String)v12));
    Object v14 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v13));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = -14;
    Object v4 = ((org.jsoup.nodes.Element)v2).getElementsByIndexGreaterThan((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodesCopy();
    Object v9 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).nextSibling();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).childNodesCopy();
    Object v8 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v9 = new org.jsoup.helper.W3CDom();
    Object v10 = "b";
    Object v11 = org.jsoup.Jsoup.parse(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).childNodesCopy();
    Object v13 = ((org.jsoup.helper.W3CDom)v9).fromJsoup(((org.jsoup.nodes.Document)v11));
    Object v14 = ((org.w3c.dom.Node)v8).isSameNode(((org.w3c.dom.Node)v13));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v8));
    Object v15 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).dataset();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).childNodesCopy();
    Object v8 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
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
    Object v9 = ((org.jsoup.nodes.Node)v8).childNodesCopy();
    Object v10 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v11 = ((org.w3c.dom.Node)v10).hasChildNodes();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "html";
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
  public void test36() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).textNodes();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).childNodesCopy();
    Object v8 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v9 = "AfterDoctypeName";
    Object v10 = ((org.w3c.dom.Document)v8).createAttribute(((java.lang.String)v9));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).nextElementSibling();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).childNodesCopy();
    Object v8 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "Mozilla/5.0 (jsoup)";
    Object v4 = ((org.jsoup.nodes.Node)v2).attr(((java.lang.String)v3));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.helper.W3CDom)v5).asString(((org.w3c.dom.Document)v9));
    Object v11 = "b";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v11));
    Object v13 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v12));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    Object v5 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v6 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = new org.jsoup.helper.W3CDom();
    Object v10 = "b";
    Object v11 = org.jsoup.Jsoup.parse(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).childNodesCopy();
    Object v13 = ((org.jsoup.helper.W3CDom)v9).fromJsoup(((org.jsoup.nodes.Document)v11));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v8),((org.w3c.dom.Document)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
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
    Object v9 = ((org.jsoup.nodes.Node)v8).childNodesCopy();
    Object v10 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v11 = ((org.w3c.dom.Node)v10).getBaseURI();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodesCopy();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v8 = ((org.w3c.dom.Document)v7).getXmlStandalone();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "`";
    Object v4 = "sco";
    Object v5 = ((org.jsoup.nodes.Element)v2).getElementsByAttributeValueContaining(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).childNodesCopy();
    Object v10 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    Object v5 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v6 = "i$g";
    Object v7 = ((org.w3c.dom.Document)v5).getElementById(((java.lang.String)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v5));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = org.jsoup.Jsoup.parse(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v2).appendTo(((org.jsoup.nodes.Element)v4));
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).childNodesCopy();
    Object v10 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
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
  public void test46() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v7));
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = new org.jsoup.helper.W3CDom();
    Object v12 = "b";
    Object v13 = org.jsoup.Jsoup.parse(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v13).childNodesCopy();
    Object v15 = ((org.jsoup.helper.W3CDom)v11).fromJsoup(((org.jsoup.nodes.Document)v13));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v10),((org.w3c.dom.Document)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
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
  public void test48() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "";
    Object v4 = ((org.jsoup.nodes.Node)v2).attr(((java.lang.String)v3));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v10));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
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
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v10 = new org.jsoup.helper.W3CDom();
    Object v11 = "b";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v11));
    Object v13 = ((org.jsoup.helper.W3CDom)v10).fromJsoup(((org.jsoup.nodes.Document)v12));
    Object v14 = "b";
    Object v15 = org.jsoup.Jsoup.parse(((java.lang.String)v14));
    Object v16 = ((org.jsoup.helper.W3CDom)v10).fromJsoup(((org.jsoup.nodes.Document)v15));
    Object v17 = ((org.w3c.dom.Node)v9).compareDocumentPosition(((org.w3c.dom.Node)v16));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v18 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
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
  public void test51() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).getAllElements();
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
  public void test52() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v7));
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = new org.jsoup.helper.W3CDom();
    Object v12 = "b";
    Object v13 = org.jsoup.Jsoup.parse(((java.lang.String)v12));
    Object v14 = ((org.jsoup.helper.W3CDom)v11).fromJsoup(((org.jsoup.nodes.Document)v13));
    Object v15 = "b";
    Object v16 = org.jsoup.Jsoup.parse(((java.lang.String)v15));
    Object v17 = ((org.jsoup.helper.W3CDom)v11).fromJsoup(((org.jsoup.nodes.Document)v16));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v10),((org.w3c.dom.Document)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "Children collection to be inserted must not be null.";
    Object v4 = ((org.jsoup.nodes.Element)v2).addClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodesCopy();
    Object v9 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
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
  public void test55() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "?";
    Object v4 = ((org.jsoup.nodes.Element)v2).getElementsByClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v10));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.w3c.dom.Node)v7).getParentNode();
    Object v9 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v7));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "basv";
    Object v4 = ((org.jsoup.nodes.Element)v2).getElementsContainingOwnText(((java.lang.String)v3));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodesCopy();
    Object v9 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
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
    Object v10 = "thead";
    Object v11 = ((org.w3c.dom.Document)v9).createElement(((java.lang.String)v10));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = 0;
    Object v4 = "\\select";
    Object v5 = new org.jsoup.select.Evaluator.Attribute(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = org.jsoup.select.Selector.select(((org.jsoup.select.Evaluator)v5),((org.jsoup.nodes.Element)v7));
    Object v9 = ((org.jsoup.nodes.Element)v2).insertChildren((((java.lang.Integer)v3).intValue()),((java.util.Collection)v8));
    Object v10 = new org.jsoup.helper.W3CDom();
    Object v11 = "b";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v11));
    Object v13 = ((org.jsoup.helper.W3CDom)v10).fromJsoup(((org.jsoup.nodes.Document)v12));
    Object v14 = "b";
    Object v15 = org.jsoup.Jsoup.parse(((java.lang.String)v14));
    Object v16 = ((org.jsoup.helper.W3CDom)v10).fromJsoup(((org.jsoup.nodes.Document)v15));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v7));
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = new org.jsoup.helper.W3CDom();
    Object v12 = "b";
    Object v13 = org.jsoup.Jsoup.parse(((java.lang.String)v12));
    Object v14 = ((org.jsoup.helper.W3CDom)v11).fromJsoup(((org.jsoup.nodes.Document)v13));
    Object v15 = "b";
    Object v16 = org.jsoup.Jsoup.parse(((java.lang.String)v15));
    Object v17 = ((org.jsoup.helper.W3CDom)v11).fromJsoup(((org.jsoup.nodes.Document)v16));
    Object v18 = ((org.w3c.dom.Document)v17).getInputEncoding();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v10),((org.w3c.dom.Document)v17));
    Object v19 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodesCopy();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v8 = ((org.w3c.dom.Node)v7).getLastChild();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).text();
    Object v7 = new org.jsoup.helper.W3CDom();
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = ((org.jsoup.helper.W3CDom)v7).fromJsoup(((org.jsoup.nodes.Document)v9));
    Object v11 = "b";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v11));
    Object v13 = ((org.jsoup.helper.W3CDom)v7).fromJsoup(((org.jsoup.nodes.Document)v12));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
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
  public void test64() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v7));
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = "X";
    Object v12 = "html";
    Object v13 = ((org.jsoup.nodes.Element)v10).getElementsByAttributeValue(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = new org.jsoup.helper.W3CDom();
    Object v15 = "b";
    Object v16 = org.jsoup.Jsoup.parse(((java.lang.String)v15));
    Object v17 = ((org.jsoup.helper.W3CDom)v14).fromJsoup(((org.jsoup.nodes.Document)v16));
    Object v18 = "b";
    Object v19 = org.jsoup.Jsoup.parse(((java.lang.String)v18));
    Object v20 = ((org.jsoup.helper.W3CDom)v14).fromJsoup(((org.jsoup.nodes.Document)v19));
    ((org.w3c.dom.Document)v20).normalizeDocument();
    Object v21 = null;
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v10),((org.w3c.dom.Document)v20));
    Object v22 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
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
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v8),((org.w3c.dom.Document)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).text();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v4).asString(((org.w3c.dom.Document)v8));
    Object v10 = "b";
    Object v11 = org.jsoup.Jsoup.parse(((java.lang.String)v10));
    Object v12 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v11));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "~:";
    Object v4 = "head";
    Object v5 = ((org.jsoup.nodes.Element)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).childNodesCopy();
    Object v10 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
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
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.w3c.dom.Document)v9).getXmlEncoding();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
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
    Object v3 = "tr";
    Object v4 = ((org.jsoup.nodes.Element)v2).selectFirst(((java.lang.String)v3));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodesCopy();
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
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodesCopy();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v8 = "frameset";
    Object v9 = ((org.w3c.dom.Document)v7).createElement(((java.lang.String)v8));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "[%s^";
    Object v4 = ((org.jsoup.nodes.Document)v2).text(((java.lang.String)v3));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v10));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "t";
    Object v4 = "col";
    Object v5 = ((org.jsoup.nodes.Element)v2).getElementsByAttributeValueMatching(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).childNodesCopy();
    Object v10 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v3).asString(((org.w3c.dom.Document)v7));
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v10));
    Object v12 = false;
    Object v13 = ((org.w3c.dom.Node)v11).cloneNode((((java.lang.Boolean)v12).booleanValue()));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v11));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v7));
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = "Queue not long enough to consume sequence";
    Object v12 = ((org.jsoup.nodes.Element)v10).hasClass(((java.lang.String)v11));
    Object v13 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v10));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).childNodesCopy();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v9));
    Object v11 = ((org.w3c.dom.Node)v10).getAttributes();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
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
    Object v13 = "prompt";
    Object v14 = ((org.w3c.dom.Document)v12).getElementById(((java.lang.String)v13));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v12));
    Object v15 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "colgroup";
    Object v4 = "h7tml";
    Object v5 = ((org.jsoup.nodes.Element)v2).getElementsByAttributeValueStarting(((java.lang.String)v3),((java.lang.String)v4));
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
  public void test78() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v7));
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = new org.jsoup.helper.W3CDom();
    Object v12 = "b";
    Object v13 = org.jsoup.Jsoup.parse(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v13).childNodesCopy();
    Object v15 = ((org.jsoup.helper.W3CDom)v11).fromJsoup(((org.jsoup.nodes.Document)v13));
    Object v16 = ((org.w3c.dom.Node)v15).getParentNode();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v10),((org.w3c.dom.Document)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
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
    Object v10 = "select";
    Object v11 = ((org.w3c.dom.Document)v9).createComment(((java.lang.String)v10));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v7));
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = "htm";
    Object v12 = "body";
    Object v13 = java.util.regex.Pattern.compile(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Element)v10).getElementsByAttributeValueMatching(((java.lang.String)v11),((java.util.regex.Pattern)v13));
    Object v15 = new org.jsoup.helper.W3CDom();
    Object v16 = new org.jsoup.helper.W3CDom();
    Object v17 = "b";
    Object v18 = org.jsoup.Jsoup.parse(((java.lang.String)v17));
    Object v19 = ((org.jsoup.helper.W3CDom)v16).fromJsoup(((org.jsoup.nodes.Document)v18));
    Object v20 = ((org.jsoup.helper.W3CDom)v15).asString(((org.w3c.dom.Document)v19));
    Object v21 = "b";
    Object v22 = org.jsoup.Jsoup.parse(((java.lang.String)v21));
    Object v23 = ((org.jsoup.helper.W3CDom)v15).fromJsoup(((org.jsoup.nodes.Document)v22));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v10),((org.w3c.dom.Document)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "body";
    Object v4 = ((org.jsoup.nodes.Element)v2).selectFirst(((java.lang.String)v3));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.helper.W3CDom)v5).asString(((org.w3c.dom.Document)v9));
    Object v11 = "b";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v11));
    Object v13 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v12));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
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
    Object v10 = "tbo";
    Object v11 = ((org.w3c.dom.Document)v9).getElementById(((java.lang.String)v10));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.w3c.dom.Node)v7).getFirstChild();
    Object v9 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v7));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
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
    Object v13 = "";
    Object v14 = ((org.w3c.dom.Node)v12).getUserData(((java.lang.String)v13));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v12));
    Object v15 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "K";
    Object v4 = ((org.jsoup.nodes.Node)v2).attr(((java.lang.String)v3));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.jsoup.helper.W3CDom)v5).asString(((org.w3c.dom.Document)v9));
    Object v11 = "b";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v11));
    Object v13 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v12));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v7));
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = "body";
    Object v12 = ((org.jsoup.nodes.Document)v10).text(((java.lang.String)v11));
    Object v13 = new org.jsoup.helper.W3CDom();
    Object v14 = "b";
    Object v15 = org.jsoup.Jsoup.parse(((java.lang.String)v14));
    Object v16 = ((org.jsoup.helper.W3CDom)v13).fromJsoup(((org.jsoup.nodes.Document)v15));
    Object v17 = "b";
    Object v18 = org.jsoup.Jsoup.parse(((java.lang.String)v17));
    Object v19 = ((org.jsoup.helper.W3CDom)v13).fromJsoup(((org.jsoup.nodes.Document)v18));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v10),((org.w3c.dom.Document)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
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
    Object v10 = ((org.w3c.dom.Node)v9).getChildNodes();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    Object v5 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v6 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v8).appendTo(((org.jsoup.nodes.Element)v10));
    Object v12 = new org.jsoup.helper.W3CDom();
    Object v13 = "b";
    Object v14 = org.jsoup.Jsoup.parse(((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Node)v14).childNodesCopy();
    Object v16 = ((org.jsoup.helper.W3CDom)v12).fromJsoup(((org.jsoup.nodes.Document)v14));
    Object v17 = ((org.w3c.dom.Node)v16).getLastChild();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v8),((org.w3c.dom.Document)v16));
    Object v18 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
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
    Object v9 = ((org.jsoup.nodes.Node)v8).childNodesCopy();
    Object v10 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v11 = "prMmpt";
    Object v12 = ((org.w3c.dom.Document)v10).getElementById(((java.lang.String)v11));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v10));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
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
    Object v13 = "body";
    Object v14 = ((org.w3c.dom.Document)v12).createEntityReference(((java.lang.String)v13));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v12));
    Object v15 = null;
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
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodesCopy();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v8 = "html";
    Object v9 = ((org.w3c.dom.Document)v7).createCDATASection(((java.lang.String)v8));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    Object v5 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v6 = "tbod";
    ((org.w3c.dom.Node)v5).setTextContent(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v5));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
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
    Object v10 = "ta";
    Object v11 = "th";
    Object v12 = ((org.w3c.dom.Node)v9).isSupported(((java.lang.String)v10),((java.lang.String)v11));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v7));
    Object v9 = new org.jsoup.helper.W3CDom();
    Object v10 = "b";
    Object v11 = org.jsoup.Jsoup.parse(((java.lang.String)v10));
    Object v12 = ((org.jsoup.helper.W3CDom)v9).fromJsoup(((org.jsoup.nodes.Document)v11));
    Object v13 = "b";
    Object v14 = org.jsoup.Jsoup.parse(((java.lang.String)v13));
    Object v15 = ((org.jsoup.helper.W3CDom)v9).fromJsoup(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v15));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "bod+y";
    Object v4 = ((org.jsoup.nodes.Element)v2).toggleClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodesCopy();
    Object v9 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    Object v5 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v6 = ((org.w3c.dom.Node)v5).getPrefix();
    Object v7 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v5));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v7);
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
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v10 = "html";
    Object v11 = ((org.w3c.dom.Node)v9).lookupNamespaceURI(((java.lang.String)v10));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = new org.jsoup.helper.W3CDom();
    Object v3 = "b";
    Object v4 = org.jsoup.Jsoup.parse(((java.lang.String)v3));
    Object v5 = ((org.jsoup.helper.W3CDom)v2).fromJsoup(((org.jsoup.nodes.Document)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v1).asString(((org.w3c.dom.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v10 = ((org.w3c.dom.Node)v9).getChildNodes();
    Object v11 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v9));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
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
    Object v9 = ((org.jsoup.nodes.Node)v8).childNodesCopy();
    Object v10 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v11 = "html";
    Object v12 = ((org.w3c.dom.Document)v10).getElementsByTagName(((java.lang.String)v11));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v10));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }
}
