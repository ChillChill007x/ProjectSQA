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
    Object v3 = null;
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
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
    Object v8 = ((org.jsoup.nodes.Document)v7).normalise();
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
  public void test5() throws Throwable {
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
  public void test7() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).siblingNodes();
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
  public void test8() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v4));
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = "html";
    Object v9 = ((org.jsoup.nodes.Element)v7).appendText(((java.lang.String)v8));
    Object v10 = new org.jsoup.helper.W3CDom();
    Object v11 = "b";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v11));
    Object v13 = ((org.jsoup.helper.W3CDom)v10).fromJsoup(((org.jsoup.nodes.Document)v12));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v7),((org.w3c.dom.Document)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "capt";
    Object v4 = ((org.jsoup.nodes.Node)v2).absUrl(((java.lang.String)v3));
    Object v5 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v7 = ((org.w3c.dom.Node)v6).getPreviousSibling();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = "capt";
    Object v7 = ((org.jsoup.nodes.Node)v5).absUrl(((java.lang.String)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).className();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = "capt";
    Object v8 = ((org.jsoup.nodes.Node)v6).absUrl(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).empty();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = "capt";
    Object v8 = ((org.jsoup.nodes.Node)v6).absUrl(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = "capt";
    Object v7 = ((org.jsoup.nodes.Node)v5).absUrl(((java.lang.String)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    ((org.w3c.dom.Document)v8).normalizeDocument();
    Object v9 = null;
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v8));
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
    Object v3 = ((org.jsoup.nodes.Element)v2).nextElementSibling();
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
  public void test16() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).shallowClone();
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
  public void test17() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = "capt";
    Object v5 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v7 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v6));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v7);
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
    Object v6 = "capt";
    Object v7 = ((org.jsoup.nodes.Node)v5).absUrl(((java.lang.String)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v9 = ((org.w3c.dom.Document)v8).getXmlEncoding();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v8));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = ((org.w3c.dom.Document)v4).getDocumentURI();
    Object v6 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v4));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = 17;
    Object v4 = ((org.jsoup.nodes.Element)v2).getElementsByIndexLessThan((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    Object v9 = "body";
    Object v10 = ((org.w3c.dom.Node)v8).isDefaultNamespace(((java.lang.String)v9));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
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
  public void test22() throws Throwable {
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
    Object v10 = "h";
    ((org.w3c.dom.Node)v9).setNodeValue(((java.lang.String)v10));
    Object v11 = null;
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = "capt";
    Object v5 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v7 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v6));
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = new org.jsoup.helper.W3CDom();
    Object v11 = "b";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v11));
    Object v13 = ((org.jsoup.helper.W3CDom)v10).fromJsoup(((org.jsoup.nodes.Document)v12));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v9),((org.w3c.dom.Document)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
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
  public void test25() throws Throwable {
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
  public void test26() throws Throwable {
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
    Object v13 = ((org.jsoup.nodes.Element)v12).nextElementSibling();
    Object v14 = new org.jsoup.helper.W3CDom();
    Object v15 = "b";
    Object v16 = org.jsoup.Jsoup.parse(((java.lang.String)v15));
    Object v17 = ((org.jsoup.helper.W3CDom)v14).fromJsoup(((org.jsoup.nodes.Document)v16));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v12),((org.w3c.dom.Document)v17));
    Object v18 = null;
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
  public void test28() throws Throwable {
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
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v10),((org.w3c.dom.Document)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
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
  public void test30() throws Throwable {
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
    Object v10 = ((org.w3c.dom.Node)v9).getLocalName();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).attributes();
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
  public void test32() throws Throwable {
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
    Object v10 = ((org.w3c.dom.Node)v9).getNextSibling();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).children();
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
  public void test34() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).empty();
    Object v4 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
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
    Object v12 = new org.jsoup.helper.W3CDom();
    Object v13 = "b";
    Object v14 = org.jsoup.Jsoup.parse(((java.lang.String)v13));
    Object v15 = ((org.jsoup.helper.W3CDom)v12).fromJsoup(((org.jsoup.nodes.Document)v14));
    Object v16 = ((org.jsoup.helper.W3CDom)v11).asString(((org.w3c.dom.Document)v15));
    Object v17 = "b";
    Object v18 = org.jsoup.Jsoup.parse(((java.lang.String)v17));
    Object v19 = ((org.jsoup.helper.W3CDom)v11).fromJsoup(((org.jsoup.nodes.Document)v18));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v10),((org.w3c.dom.Document)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
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
  public void test37() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).cssSelector();
    Object v4 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = new org.jsoup.helper.W3CDom();
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v8).fromJsoup(((org.jsoup.nodes.Document)v10));
    Object v12 = "b";
    Object v13 = org.jsoup.Jsoup.parse(((java.lang.String)v12));
    Object v14 = ((org.jsoup.helper.W3CDom)v8).fromJsoup(((org.jsoup.nodes.Document)v13));
    Object v15 = ((org.w3c.dom.Node)v7).isEqualNode(((org.w3c.dom.Node)v14));
    Object v16 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v7));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
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
    Object v11 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
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
    Object v16 = ((org.jsoup.nodes.Element)v15).cssSelector();
    Object v17 = ((org.jsoup.helper.W3CDom)v13).fromJsoup(((org.jsoup.nodes.Document)v15));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v12),((org.w3c.dom.Document)v17));
    Object v18 = null;
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
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v3).asString(((org.w3c.dom.Document)v10));
    Object v12 = "b";
    Object v13 = org.jsoup.Jsoup.parse(((java.lang.String)v12));
    Object v14 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v13));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).empty();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.helper.W3CDom)v4).asString(((org.w3c.dom.Document)v11));
    Object v13 = "b";
    Object v14 = org.jsoup.Jsoup.parse(((java.lang.String)v13));
    Object v15 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v14));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
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
  public void test44() throws Throwable {
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
  public void test45() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).cssSelector();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    ((org.w3c.dom.Document)v7).normalizeDocument();
    Object v8 = null;
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
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
  public void test47() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).cssSelector();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v8 = "";
    Object v9 = ((org.w3c.dom.Document)v7).createComment(((java.lang.String)v8));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
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
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).cssSelector();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clearAttributes();
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
  public void test50() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ":all";
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementsContainingOwnText(((java.lang.String)v6));
    Object v8 = new org.jsoup.helper.W3CDom();
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).cssSelector();
    Object v12 = ((org.jsoup.helper.W3CDom)v8).fromJsoup(((org.jsoup.nodes.Document)v10));
    Object v13 = ((org.w3c.dom.Document)v12).getStrictErrorChecking();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "br";
    Object v4 = "thedad";
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
  public void test52() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v5 = "th";
    Object v6 = ((org.w3c.dom.Document)v4).createAttribute(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v4));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).cssSelector();
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
  public void test54() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v7 = "sorce";
    Object v8 = ((org.w3c.dom.Document)v6).getElementById(((java.lang.String)v7));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v6));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
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
  public void test56() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).cssSelector();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v8 = ((org.w3c.dom.Document)v7).getDomConfig();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
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
    Object v10 = "rection";
    Object v11 = ((org.w3c.dom.Document)v9).getElementsByTagName(((java.lang.String)v10));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ".";
    Object v4 = ((org.jsoup.nodes.Element)v2).getElementsByAttribute(((java.lang.String)v3));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).cssSelector();
    Object v9 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v10 = null;
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
    Object v6 = ((org.jsoup.nodes.Element)v5).cssSelector();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v8 = "tb";
    Object v9 = ((org.w3c.dom.Node)v7).getUserData(((java.lang.String)v8));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v10 = null;
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
    Object v5 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v4));
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = new org.jsoup.helper.W3CDom();
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).cssSelector();
    Object v12 = ((org.jsoup.helper.W3CDom)v8).fromJsoup(((org.jsoup.nodes.Document)v10));
    Object v13 = ((org.w3c.dom.Node)v12).getParentNode();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v7),((org.w3c.dom.Document)v12));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "thead";
    Object v4 = ((org.jsoup.nodes.Element)v2).getElementsByAttribute(((java.lang.String)v3));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).cssSelector();
    Object v9 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    ((org.w3c.dom.Document)v6).normalizeDocument();
    Object v7 = null;
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
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
    Object v12 = "tbod";
    Object v13 = ((org.w3c.dom.Document)v11).getElementsByTagName(((java.lang.String)v12));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v11));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
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
    Object v9 = ((org.jsoup.nodes.Element)v8).cssSelector();
    Object v10 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v10));
    Object v11 = null;
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
    Object v4 = ((org.jsoup.nodes.Element)v3).cssSelector();
    Object v5 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v6 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = new org.jsoup.helper.W3CDom();
    Object v10 = "b";
    Object v11 = org.jsoup.Jsoup.parse(((java.lang.String)v10));
    Object v12 = "capt";
    Object v13 = ((org.jsoup.nodes.Node)v11).absUrl(((java.lang.String)v12));
    Object v14 = ((org.jsoup.helper.W3CDom)v9).fromJsoup(((org.jsoup.nodes.Document)v11));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v8),((org.w3c.dom.Document)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).childNodeSize();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = "capt";
    Object v8 = ((org.jsoup.nodes.Node)v6).absUrl(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).childNodes();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.helper.W3CDom)v4).asString(((org.w3c.dom.Document)v11));
    Object v13 = "b";
    Object v14 = org.jsoup.Jsoup.parse(((java.lang.String)v13));
    Object v15 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v14));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
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
    Object v12 = ((org.jsoup.nodes.Element)v11).cssSelector();
    Object v13 = ((org.jsoup.helper.W3CDom)v9).fromJsoup(((org.jsoup.nodes.Document)v11));
    Object v14 = "option";
    Object v15 = ((org.w3c.dom.Document)v13).createAttribute(((java.lang.String)v14));
    Object v16 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v13));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v3).asString(((org.w3c.dom.Document)v10));
    Object v12 = "b";
    Object v13 = org.jsoup.Jsoup.parse(((java.lang.String)v12));
    Object v14 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v13));
    Object v15 = "[";
    Object v16 = ((org.w3c.dom.Document)v14).getElementsByTagName(((java.lang.String)v15));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v14));
    Object v17 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).elementSiblingIndex();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).cssSelector();
    Object v8 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v8));
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
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = "capt";
    Object v7 = ((org.jsoup.nodes.Node)v5).absUrl(((java.lang.String)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v9 = "colgroup";
    Object v10 = ((org.w3c.dom.Document)v8).getElementsByTagName(((java.lang.String)v9));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v8));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).cssSelector();
    Object v5 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v6 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = new org.jsoup.helper.W3CDom();
    Object v10 = "b";
    Object v11 = org.jsoup.Jsoup.parse(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).cssSelector();
    Object v13 = ((org.jsoup.helper.W3CDom)v9).fromJsoup(((org.jsoup.nodes.Document)v11));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v8),((org.w3c.dom.Document)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).cssSelector();
    Object v5 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v6 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v5));
    org.junit.Assert.assertEquals((Object)("<html>\n    <head>\n        <META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n    </head>\n    <body>b</body>\n</html>\n"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v7 = ((org.w3c.dom.Node)v6).getOwnerDocument();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v6));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).hasText();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.helper.W3CDom)v4).asString(((org.w3c.dom.Document)v11));
    Object v13 = "b";
    Object v14 = org.jsoup.Jsoup.parse(((java.lang.String)v13));
    Object v15 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v14));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v15));
    Object v16 = null;
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
    Object v6 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v10 = "(application|text)/\\w*\\+?xml.*";
    ((org.w3c.dom.Document)v9).setDocumentURI(((java.lang.String)v10));
    Object v11 = null;
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v3).asString(((org.w3c.dom.Document)v10));
    Object v12 = "b";
    Object v13 = org.jsoup.Jsoup.parse(((java.lang.String)v12));
    Object v14 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v13));
    Object v15 = "oUtion";
    Object v16 = "caption";
    Object v17 = ((org.w3c.dom.Node)v14).isSupported(((java.lang.String)v15),((java.lang.String)v16));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v14));
    Object v18 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).cssSelector();
    Object v5 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v6 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).siblingNodes();
    Object v10 = ((org.jsoup.helper.W3CDom)v0).fromJsoup(((org.jsoup.nodes.Document)v8));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Document)v2).title();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v9));
    ((org.w3c.dom.Node)v10).normalize();
    Object v11 = null;
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v10));
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
    Object v3 = "form";
    ((org.jsoup.nodes.Node)v2).setBaseUri(((java.lang.String)v3));
    Object v4 = null;
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
  public void test81() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).cssSelector();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v8 = "?";
    Object v9 = "thad";
    Object v10 = ((org.w3c.dom.Document)v7).createElementNS(((java.lang.String)v8),((java.lang.String)v9));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).nextElementSibling();
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
  public void test83() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = new org.jsoup.helper.W3CDom();
    Object v3 = "b";
    Object v4 = org.jsoup.Jsoup.parse(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).cssSelector();
    Object v6 = ((org.jsoup.helper.W3CDom)v2).fromJsoup(((org.jsoup.nodes.Document)v4));
    Object v7 = ((org.jsoup.helper.W3CDom)v1).asString(((org.w3c.dom.Document)v6));
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).siblingNodes();
    Object v11 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v9));
    Object v12 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v11));
    Object v13 = "b";
    Object v14 = org.jsoup.Jsoup.parse(((java.lang.String)v13));
    Object v15 = new org.jsoup.helper.W3CDom();
    Object v16 = "b";
    Object v17 = org.jsoup.Jsoup.parse(((java.lang.String)v16));
    Object v18 = "capt";
    Object v19 = ((org.jsoup.nodes.Node)v17).absUrl(((java.lang.String)v18));
    Object v20 = ((org.jsoup.helper.W3CDom)v15).fromJsoup(((org.jsoup.nodes.Document)v17));
    Object v21 = ((org.w3c.dom.Node)v20).getParentNode();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v14),((org.w3c.dom.Document)v20));
    Object v22 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).cssSelector();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v8 = "option";
    Object v9 = ((org.w3c.dom.Document)v7).createComment(((java.lang.String)v8));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
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
    Object v11 = "b";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v11));
    Object v13 = ((org.jsoup.helper.W3CDom)v7).fromJsoup(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.helper.W3CDom)v6).asString(((org.w3c.dom.Document)v13));
    Object v15 = "b";
    Object v16 = org.jsoup.Jsoup.parse(((java.lang.String)v15));
    Object v17 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v16));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v17));
    Object v18 = null;
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
    Object v4 = ((org.jsoup.nodes.Element)v3).cssSelector();
    Object v5 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v6 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).html();
    Object v10 = new org.jsoup.helper.W3CDom();
    Object v11 = "b";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v11));
    Object v13 = ((org.jsoup.helper.W3CDom)v10).fromJsoup(((org.jsoup.nodes.Document)v12));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v8),((org.w3c.dom.Document)v13));
    Object v14 = null;
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
    Object v6 = ((org.jsoup.nodes.Element)v5).cssSelector();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v8 = ((org.w3c.dom.Node)v7).getOwnerDocument();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).shallowClone();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v10));
    Object v12 = ((org.jsoup.helper.W3CDom)v4).asString(((org.w3c.dom.Document)v11));
    Object v13 = "b";
    Object v14 = org.jsoup.Jsoup.parse(((java.lang.String)v13));
    Object v15 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v14));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = new org.jsoup.helper.W3CDom();
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).cssSelector();
    Object v5 = ((org.jsoup.helper.W3CDom)v1).fromJsoup(((org.jsoup.nodes.Document)v3));
    Object v6 = ((org.jsoup.helper.W3CDom)v0).asString(((org.w3c.dom.Document)v5));
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = new org.jsoup.helper.W3CDom();
    Object v10 = new org.jsoup.helper.W3CDom();
    Object v11 = "b";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v11));
    Object v13 = ((org.jsoup.helper.W3CDom)v10).fromJsoup(((org.jsoup.nodes.Document)v12));
    Object v14 = ((org.jsoup.helper.W3CDom)v9).asString(((org.w3c.dom.Document)v13));
    Object v15 = "b";
    Object v16 = org.jsoup.Jsoup.parse(((java.lang.String)v15));
    Object v17 = ((org.jsoup.helper.W3CDom)v9).fromJsoup(((org.jsoup.nodes.Document)v16));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v8),((org.w3c.dom.Document)v17));
    Object v18 = null;
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
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v3).asString(((org.w3c.dom.Document)v10));
    Object v12 = "b";
    Object v13 = org.jsoup.Jsoup.parse(((java.lang.String)v12));
    Object v14 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v13));
    Object v15 = new org.jsoup.helper.W3CDom();
    Object v16 = "b";
    Object v17 = org.jsoup.Jsoup.parse(((java.lang.String)v16));
    Object v18 = ((org.jsoup.helper.W3CDom)v15).fromJsoup(((org.jsoup.nodes.Document)v17));
    Object v19 = "b";
    Object v20 = org.jsoup.Jsoup.parse(((java.lang.String)v19));
    Object v21 = ((org.jsoup.helper.W3CDom)v15).fromJsoup(((org.jsoup.nodes.Document)v20));
    Object v22 = ((org.w3c.dom.Node)v14).compareDocumentPosition(((org.w3c.dom.Node)v21));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v14));
    Object v23 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
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
  public void test92() throws Throwable {
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
  public void test93() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = 0;
    Object v4 = ((org.jsoup.nodes.Element)v2).getElementsByIndexLessThan((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).cssSelector();
    Object v9 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v7));
    Object v10 = ((org.w3c.dom.Document)v9).getXmlEncoding();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = new org.jsoup.helper.W3CDom();
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).cssSelector();
    Object v8 = ((org.jsoup.helper.W3CDom)v4).fromJsoup(((org.jsoup.nodes.Document)v6));
    Object v9 = ((org.jsoup.helper.W3CDom)v3).asString(((org.w3c.dom.Document)v8));
    Object v10 = "b";
    Object v11 = org.jsoup.Jsoup.parse(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).siblingNodes();
    Object v13 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v11));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = "able";
    Object v4 = ((org.jsoup.nodes.Element)v2).hasClass(((java.lang.String)v3));
    Object v5 = new org.jsoup.helper.W3CDom();
    Object v6 = new org.jsoup.helper.W3CDom();
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v10 = "b";
    Object v11 = org.jsoup.Jsoup.parse(((java.lang.String)v10));
    Object v12 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v11));
    Object v13 = ((org.jsoup.helper.W3CDom)v5).asString(((org.w3c.dom.Document)v12));
    Object v14 = "b";
    Object v15 = org.jsoup.Jsoup.parse(((java.lang.String)v14));
    Object v16 = ((org.jsoup.helper.W3CDom)v5).fromJsoup(((org.jsoup.nodes.Document)v15));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
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
    Object v9 = "capt";
    Object v10 = ((org.jsoup.nodes.Node)v8).absUrl(((java.lang.String)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    Object v12 = ((org.w3c.dom.Document)v11).getImplementation();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
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
    Object v9 = "capt";
    Object v10 = ((org.jsoup.nodes.Node)v8).absUrl(((java.lang.String)v9));
    Object v11 = ((org.jsoup.helper.W3CDom)v6).fromJsoup(((org.jsoup.nodes.Document)v8));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.jsoup.helper.W3CDom();
    Object v1 = "b";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v1));
    Object v3 = new org.jsoup.helper.W3CDom();
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).cssSelector();
    Object v7 = ((org.jsoup.helper.W3CDom)v3).fromJsoup(((org.jsoup.nodes.Document)v5));
    Object v8 = ((org.w3c.dom.Node)v7).hasAttributes();
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v2),((org.w3c.dom.Document)v7));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
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
    Object v6 = "base";
    Object v7 = new org.jsoup.select.Evaluator.ContainsText(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v5).is(((org.jsoup.select.Evaluator)v7));
    Object v9 = new org.jsoup.helper.W3CDom();
    Object v10 = new org.jsoup.helper.W3CDom();
    Object v11 = "b";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).cssSelector();
    Object v14 = ((org.jsoup.helper.W3CDom)v10).fromJsoup(((org.jsoup.nodes.Document)v12));
    Object v15 = ((org.jsoup.helper.W3CDom)v9).asString(((org.w3c.dom.Document)v14));
    Object v16 = "b";
    Object v17 = org.jsoup.Jsoup.parse(((java.lang.String)v16));
    Object v18 = ((org.jsoup.nodes.Node)v17).siblingNodes();
    Object v19 = ((org.jsoup.helper.W3CDom)v9).fromJsoup(((org.jsoup.nodes.Document)v17));
    ((org.jsoup.helper.W3CDom)v0).convert(((org.jsoup.nodes.Document)v5),((org.w3c.dom.Document)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException expected) { }
  }
}
