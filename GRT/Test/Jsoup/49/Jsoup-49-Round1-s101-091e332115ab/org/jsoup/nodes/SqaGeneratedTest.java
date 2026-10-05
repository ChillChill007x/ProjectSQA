package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "hb";
    Object v4 = ((org.jsoup.nodes.Node)v2).removeAttr(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((org.jsoup.nodes.Node)v2).removeAttr(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 20;
    ((org.jsoup.nodes.Node)v2).setSiblingIndex((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "tr";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).siblingNodes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "hea=d";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    ((org.jsoup.nodes.Node)v4).setParentNode(((org.jsoup.nodes.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = "hea=d";
    Object v11 = ((org.jsoup.nodes.Node)v9).attr(((java.lang.String)v10));
    Object v12 = new java.lang.StringBuilder(((java.lang.CharSequence)v11));
    Object v13 = 4;
    Object v14 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v4).outerHtmlHead(((java.lang.StringBuilder)v12),(((java.lang.Integer)v13).intValue()),((org.jsoup.nodes.Document.OutputSettings)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodeSize();
    org.junit.Assert.assertEquals((Object)(1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = "hea=d";
    Object v11 = ((org.jsoup.nodes.Node)v9).attr(((java.lang.String)v10));
    Object v12 = new java.lang.StringBuilder(((java.lang.CharSequence)v11));
    Object v13 = 1;
    Object v14 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v4).outerHtmlTail(((java.lang.StringBuilder)v12),(((java.lang.Integer)v13).intValue()),((org.jsoup.nodes.Document.OutputSettings)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "t/r";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = "hea=d";
    Object v11 = ((org.jsoup.nodes.Node)v9).attr(((java.lang.String)v10));
    Object v12 = new java.lang.StringBuilder(((java.lang.CharSequence)v11));
    Object v13 = -5;
    Object v14 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v4).outerHtmlTail(((java.lang.StringBuilder)v12),(((java.lang.Integer)v13).intValue()),((org.jsoup.nodes.Document.OutputSettings)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).outerHtml();
    Object v6 = ((org.jsoup.nodes.Node)v4).nodeName();
    org.junit.Assert.assertEquals((Object)("#document"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    Object v6 = "tr";
    Object v7 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "blockquote";
    Object v6 = "title";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "html";
    Object v9 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = new org.jsoup.nodes.Node[]{null,null};
    ((org.jsoup.nodes.Node)v4).addChildren(((org.jsoup.nodes.Node[])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = new org.jsoup.nodes.Node[]{null,null,null};
    ((org.jsoup.nodes.Node)v4).addChildren(((org.jsoup.nodes.Node[])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = "hea=d";
    Object v11 = ((org.jsoup.nodes.Node)v9).attr(((java.lang.String)v10));
    Object v12 = new java.lang.StringBuilder(((java.lang.CharSequence)v11));
    Object v13 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "inputf";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "fTont";
    Object v12 = "RawtextEndTagO";
    Object v13 = org.jsoup.Jsoup.parse(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v13).toString();
    Object v15 = ((org.jsoup.nodes.Node)v13).ownerDocument();
    Object v16 = "hea=d";
    Object v17 = ((org.jsoup.nodes.Node)v15).attr(((java.lang.String)v16));
    Object v18 = new java.lang.StringBuilder(((java.lang.CharSequence)v17));
    Object v19 = 0;
    Object v20 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v10).outerHtmlHead(((java.lang.StringBuilder)v18),(((java.lang.Integer)v19).intValue()),((org.jsoup.nodes.Document.OutputSettings)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    ((org.jsoup.nodes.Node)v4).reparentChild(((org.jsoup.nodes.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = null;
    Object v6 = ((org.jsoup.nodes.Node)v4).traverse(((org.jsoup.select.NodeVisitor)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "captiomn";
    ((org.jsoup.nodes.Node)v4).setBaseUri(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = "fTont";
    Object v8 = "RawtextEndTagO";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).toString();
    Object v11 = ((org.jsoup.nodes.Node)v9).ownerDocument();
    Object v12 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingNodes();
    Object v6 = "coOl";
    Object v7 = ((org.jsoup.nodes.Node)v4).after(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).nextSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).childNodes();
    Object v12 = ((org.jsoup.nodes.Node)v10).childNodesCopy();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = new org.jsoup.nodes.Node[]{null};
    ((org.jsoup.nodes.Node)v5).addChildren(((org.jsoup.nodes.Node[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "fTont";
    Object v7 = "RawtextEndTagO";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).toString();
    Object v10 = ((org.jsoup.nodes.Node)v8).ownerDocument();
    Object v11 = "fTont";
    Object v12 = "RawtextEndTagO";
    Object v13 = org.jsoup.Jsoup.parse(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v13).toString();
    Object v15 = ((org.jsoup.nodes.Node)v13).ownerDocument();
    ((org.jsoup.nodes.Node)v5).replaceChild(((org.jsoup.nodes.Node)v10),((org.jsoup.nodes.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "Scontains(%s";
    Object v4 = ((org.jsoup.nodes.Node)v2).wrap(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = 29;
    Object v12 = new org.jsoup.nodes.Node[]{null,null,null};
    ((org.jsoup.nodes.Node)v10).addChildren((((java.lang.Integer)v11).intValue()),((org.jsoup.nodes.Node[])v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "src";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = new org.jsoup.nodes.Document.OutputSettings();
    Object v7 = ((org.jsoup.nodes.Node)v5).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fieldset";
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v4).siblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).siblingNodes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = -36;
    Object v12 = new org.jsoup.nodes.Node[]{null,null};
    ((org.jsoup.nodes.Node)v10).addChildren((((java.lang.Integer)v11).intValue()),((org.jsoup.nodes.Node[])v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = 1;
    Object v7 = new org.jsoup.nodes.Node[]{null,null,null};
    ((org.jsoup.nodes.Node)v5).addChildren((((java.lang.Integer)v6).intValue()),((org.jsoup.nodes.Node[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "captiomn";
    ((org.jsoup.nodes.Node)v4).setBaseUri(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = "fTont";
    Object v8 = "RawtextEndTagO";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).toString();
    Object v11 = ((org.jsoup.nodes.Node)v9).ownerDocument();
    Object v12 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v11));
    ((org.jsoup.nodes.Node)v12).ensureChildNodes();
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).previousSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "1";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = ((org.jsoup.nodes.Node)v4).childNode((((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).getOutputSettings();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodes();
    Object v6 = "fTont";
    Object v7 = "RawtextEndTagO";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).toString();
    Object v10 = ((org.jsoup.nodes.Node)v8).ownerDocument();
    Object v11 = ((org.jsoup.nodes.Node)v10).clone();
    Object v12 = "tfoot";
    Object v13 = ((org.jsoup.nodes.Node)v11).hasAttr(((java.lang.String)v12));
    Object v14 = "fTont";
    Object v15 = "RawtextEndTagO";
    Object v16 = org.jsoup.Jsoup.parse(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Node)v16).toString();
    Object v18 = ((org.jsoup.nodes.Node)v16).ownerDocument();
    Object v19 = ((org.jsoup.nodes.Node)v18).ownerDocument();
    ((org.jsoup.nodes.Node)v4).replaceChild(((org.jsoup.nodes.Node)v11),((org.jsoup.nodes.Node)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "th";
    Object v12 = ((org.jsoup.nodes.Node)v10).absUrl(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v10).clone();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "empty";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).toString();
    org.junit.Assert.assertEquals((Object)("<html>\n <head></head>\n <body>\n  fTont\n </body>\n</html>"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "htm";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).nodeName();
    org.junit.Assert.assertEquals((Object)("#document"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "Bcaption";
    Object v7 = ((org.jsoup.nodes.Node)v5).attr(((java.lang.String)v6));
    Object v8 = "fTont";
    Object v9 = "RawtextEndTagO";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).toString();
    Object v12 = ((org.jsoup.nodes.Node)v10).ownerDocument();
    Object v13 = ((org.jsoup.nodes.Node)v12).nodeName();
    Object v14 = ((org.jsoup.nodes.Node)v5).after(((org.jsoup.nodes.Node)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).childNodes();
    Object v12 = ((org.jsoup.nodes.Node)v10).previousSibling();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "span";
    Object v7 = ((org.jsoup.nodes.Node)v5).wrap(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = "fTont";
    Object v7 = "RawtextEndTagO";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).toString();
    Object v10 = ((org.jsoup.nodes.Node)v8).ownerDocument();
    Object v11 = "fTont";
    Object v12 = "RawtextEndTagO";
    Object v13 = org.jsoup.Jsoup.parse(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v13).toString();
    Object v15 = ((org.jsoup.nodes.Node)v13).ownerDocument();
    Object v16 = ((org.jsoup.nodes.Node)v10).doClone(((org.jsoup.nodes.Node)v15));
    ((org.jsoup.nodes.Node)v5).removeChild(((org.jsoup.nodes.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "fTont";
    Object v12 = "RawtextEndTagO";
    Object v13 = org.jsoup.Jsoup.parse(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v13).toString();
    Object v15 = ((org.jsoup.nodes.Node)v13).ownerDocument();
    Object v16 = ((org.jsoup.nodes.Node)v10).before(((org.jsoup.nodes.Node)v15));
    Object v17 = "br";
    ((org.jsoup.nodes.Node)v10).setBaseUri(((java.lang.String)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    ((org.jsoup.nodes.Node)v4).removeChild(((org.jsoup.nodes.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "fTont";
    Object v12 = "RawtextEndTagO";
    Object v13 = org.jsoup.Jsoup.parse(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v13).toString();
    Object v15 = ((org.jsoup.nodes.Node)v13).ownerDocument();
    Object v16 = ((org.jsoup.nodes.Node)v15).ownerDocument();
    Object v17 = "</";
    Object v18 = "tfoo";
    Object v19 = ((org.jsoup.nodes.Node)v16).attr(((java.lang.String)v17),((java.lang.String)v18));
    ((org.jsoup.nodes.Node)v10).removeChild(((org.jsoup.nodes.Node)v16));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = "hea=d";
    Object v11 = ((org.jsoup.nodes.Node)v9).attr(((java.lang.String)v10));
    Object v12 = new java.lang.StringBuilder(((java.lang.CharSequence)v11));
    ((org.jsoup.nodes.Node)v4).outerHtml(((java.lang.StringBuilder)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).ownerDocument();
    ((org.jsoup.nodes.Node)v10).ensureChildNodes();
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "th";
    Object v12 = ((org.jsoup.nodes.Node)v10).absUrl(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v10).clone();
    Object v14 = ((org.jsoup.nodes.Node)v13).getOutputSettings();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = new org.jsoup.nodes.Node[]{null};
    ((org.jsoup.nodes.Node)v5).addChildren(((org.jsoup.nodes.Node[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).nodeName();
    org.junit.Assert.assertEquals((Object)("#document"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = "fTont";
    Object v11 = "RawtextEndTagO";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v12).toString();
    Object v14 = ((org.jsoup.nodes.Node)v12).ownerDocument();
    Object v15 = ((org.jsoup.nodes.Node)v9).doClone(((org.jsoup.nodes.Node)v14));
    Object v16 = "th";
    Object v17 = ((org.jsoup.nodes.Node)v15).absUrl(((java.lang.String)v16));
    Object v18 = ((org.jsoup.nodes.Node)v15).clone();
    ((org.jsoup.nodes.Node)v4).setParentNode(((org.jsoup.nodes.Node)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodesCopy();
    Object v6 = "fTont";
    Object v7 = "RawtextEndTagO";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).toString();
    Object v10 = ((org.jsoup.nodes.Node)v8).ownerDocument();
    Object v11 = "hea=d";
    Object v12 = ((org.jsoup.nodes.Node)v10).attr(((java.lang.String)v11));
    Object v13 = new java.lang.StringBuilder(((java.lang.CharSequence)v12));
    Object v14 = "caption";
    Object v15 = ((java.lang.StringBuilder)v13).append(((java.lang.String)v14));
    Object v16 = 0;
    Object v17 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v4).outerHtmlHead(((java.lang.StringBuilder)v13),(((java.lang.Integer)v16).intValue()),((org.jsoup.nodes.Document.OutputSettings)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v9).ownerDocument();
    Object v11 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v9).ownerDocument();
    Object v11 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v10));
    Object v12 = "fTont";
    Object v13 = "RawtextEndTagO";
    Object v14 = org.jsoup.Jsoup.parse(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Node)v14).toString();
    Object v16 = ((org.jsoup.nodes.Node)v14).ownerDocument();
    Object v17 = "fTont";
    Object v18 = "RawtextEndTagO";
    Object v19 = org.jsoup.Jsoup.parse(((java.lang.String)v17),((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Node)v19).toString();
    Object v21 = ((org.jsoup.nodes.Node)v19).ownerDocument();
    Object v22 = ((org.jsoup.nodes.Node)v21).ownerDocument();
    Object v23 = ((org.jsoup.nodes.Node)v16).doClone(((org.jsoup.nodes.Node)v22));
    Object v24 = "";
    Object v25 = ((org.jsoup.nodes.Node)v23).before(((java.lang.String)v24));
    ((org.jsoup.nodes.Node)v11).reparentChild(((org.jsoup.nodes.Node)v23));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "th";
    Object v12 = ((org.jsoup.nodes.Node)v10).absUrl(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v10).clone();
    Object v14 = ((org.jsoup.nodes.Node)v13).childNodesCopy();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "thead";
    ((org.jsoup.nodes.Node)v5).setBaseUri(((java.lang.String)v6));
    Object v7 = null;
    Object v8 = ((org.jsoup.nodes.Node)v5).childNodesCopy();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = "empty";
    Object v11 = ((org.jsoup.nodes.Node)v9).absUrl(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).hashCode();
    org.junit.Assert.assertEquals((Object)(681839539), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = "thea";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).nodeName();
    org.junit.Assert.assertEquals((Object)("#document"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = "fTont";
    Object v7 = "RawtextEndTagO";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).toString();
    Object v10 = ((org.jsoup.nodes.Node)v8).ownerDocument();
    Object v11 = "fTont";
    Object v12 = "RawtextEndTagO";
    Object v13 = org.jsoup.Jsoup.parse(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v13).toString();
    Object v15 = ((org.jsoup.nodes.Node)v13).ownerDocument();
    Object v16 = ((org.jsoup.nodes.Node)v15).ownerDocument();
    Object v17 = ((org.jsoup.nodes.Node)v10).doClone(((org.jsoup.nodes.Node)v16));
    ((org.jsoup.nodes.Node)v5).removeChild(((org.jsoup.nodes.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "th";
    Object v12 = ((org.jsoup.nodes.Node)v10).absUrl(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v10).clone();
    Object v14 = "tale";
    Object v15 = ((org.jsoup.nodes.Node)v13).attr(((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(""), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = "hea=d";
    Object v11 = ((org.jsoup.nodes.Node)v9).attr(((java.lang.String)v10));
    Object v12 = new java.lang.StringBuilder(((java.lang.CharSequence)v11));
    Object v13 = 54;
    Object v14 = ((java.lang.StringBuilder)v12).append((((java.lang.Integer)v13).intValue()));
    Object v15 = 16;
    Object v16 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v4).outerHtmlTail(((java.lang.StringBuilder)v12),(((java.lang.Integer)v15).intValue()),((org.jsoup.nodes.Document.OutputSettings)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = 1;
    Object v6 = new org.jsoup.nodes.Node[]{};
    ((org.jsoup.nodes.Node)v4).addChildren((((java.lang.Integer)v5).intValue()),((org.jsoup.nodes.Node[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "tchead";
    Object v12 = "html";
    Object v13 = ((org.jsoup.nodes.Node)v10).attr(((java.lang.String)v11),((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v9).ownerDocument();
    Object v11 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v10));
    Object v12 = "cption";
    Object v13 = ((org.jsoup.nodes.Node)v11).removeAttr(((java.lang.String)v12));
    Object v14 = "thea";
    Object v15 = ((org.jsoup.nodes.Node)v11).hasAttr(((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v9).ownerDocument();
    Object v11 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).clone();
    Object v13 = ((org.jsoup.nodes.Node)v11).nodeName();
    org.junit.Assert.assertEquals((Object)("#document"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = "fTont";
    Object v11 = "RawtextEndTagO";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v12).toString();
    Object v14 = ((org.jsoup.nodes.Node)v12).ownerDocument();
    Object v15 = ((org.jsoup.nodes.Node)v9).doClone(((org.jsoup.nodes.Node)v14));
    ((org.jsoup.nodes.Node)v4).setParentNode(((org.jsoup.nodes.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodesAsArray();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "fTont";
    Object v7 = "RawtextEndTagO";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).toString();
    Object v10 = ((org.jsoup.nodes.Node)v8).ownerDocument();
    Object v11 = "hea=d";
    Object v12 = ((org.jsoup.nodes.Node)v10).attr(((java.lang.String)v11));
    Object v13 = new java.lang.StringBuilder(((java.lang.CharSequence)v12));
    Object v14 = 0;
    Object v15 = 0;
    Object v16 = ((java.lang.StringBuilder)v13).delete((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = -37;
    Object v18 = new org.jsoup.nodes.Document.OutputSettings();
    Object v19 = org.jsoup.nodes.Entities.EscapeMode.extended;
    Object v20 = ((org.jsoup.nodes.Document.OutputSettings)v18).escapeMode(((org.jsoup.nodes.Entities.EscapeMode)v19));
    ((org.jsoup.nodes.Node)v5).outerHtmlTail(((java.lang.StringBuilder)v13),(((java.lang.Integer)v17).intValue()),((org.jsoup.nodes.Document.OutputSettings)v18));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v9).ownerDocument();
    Object v11 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v10));
    Object v12 = "tLody";
    Object v13 = ((org.jsoup.nodes.Node)v11).removeAttr(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v11).hashCode();
    org.junit.Assert.assertEquals((Object)(681839539), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = "hea=d";
    Object v11 = ((org.jsoup.nodes.Node)v9).attr(((java.lang.String)v10));
    Object v12 = new java.lang.StringBuilder(((java.lang.CharSequence)v11));
    Object v13 = new org.jsoup.nodes.Document.OutputSettings();
    Object v14 = ((java.lang.StringBuilder)v12).append(((java.lang.Object)v13));
    Object v15 = 0;
    Object v16 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v4).outerHtmlHead(((java.lang.StringBuilder)v12),(((java.lang.Integer)v15).intValue()),((org.jsoup.nodes.Document.OutputSettings)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingNodes();
    Object v6 = "frameset";
    Object v7 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "spanQ";
    Object v12 = ((org.jsoup.nodes.Node)v10).wrap(((java.lang.String)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = "html";
    Object v7 = ((org.jsoup.nodes.Node)v5).hasAttr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "tchead";
    Object v12 = "html";
    Object v13 = ((org.jsoup.nodes.Node)v10).attr(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "W";
    Object v15 = ((org.jsoup.nodes.Node)v13).hasAttr(((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v9).ownerDocument();
    Object v11 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).outerHtml();
    org.junit.Assert.assertEquals((Object)("<html>\n <head></head>\n <body>\n  fTont\n </body>\n</html>"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "fTont";
    Object v7 = "RawtextEndTagO";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).toString();
    Object v10 = ((org.jsoup.nodes.Node)v8).ownerDocument();
    Object v11 = "fTont";
    Object v12 = "RawtextEndTagO";
    Object v13 = org.jsoup.Jsoup.parse(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v13).toString();
    Object v15 = ((org.jsoup.nodes.Node)v13).ownerDocument();
    Object v16 = ((org.jsoup.nodes.Node)v10).doClone(((org.jsoup.nodes.Node)v15));
    Object v17 = "th";
    Object v18 = ((org.jsoup.nodes.Node)v16).absUrl(((java.lang.String)v17));
    Object v19 = ((org.jsoup.nodes.Node)v16).clone();
    ((org.jsoup.nodes.Node)v5).setParentNode(((org.jsoup.nodes.Node)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v9).ownerDocument();
    Object v11 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v10));
    Object v12 = "ht{ml";
    Object v13 = ((org.jsoup.nodes.Node)v11).wrap(((java.lang.String)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = ((org.jsoup.nodes.Node)v5).hashCode();
    Object v7 = ((org.jsoup.nodes.Node)v5).previousSibling();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "fram=set";
    Object v12 = ((org.jsoup.nodes.Node)v10).absUrl(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(""), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).getOutputSettings();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "tchead";
    Object v12 = "html";
    Object v13 = ((org.jsoup.nodes.Node)v10).attr(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v13).baseUri();
    org.junit.Assert.assertEquals((Object)("RawtextEndTagO"), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "html";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = "http";
    Object v7 = ((org.jsoup.nodes.Node)v5).wrap(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "fTont";
    Object v6 = "RawtextEndTagO";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).toString();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).nodeName();
    Object v12 = "fTont";
    Object v13 = "RawtextEndTagO";
    Object v14 = org.jsoup.Jsoup.parse(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Node)v14).toString();
    Object v16 = ((org.jsoup.nodes.Node)v14).ownerDocument();
    Object v17 = ((org.jsoup.nodes.Node)v10).doClone(((org.jsoup.nodes.Node)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = "li";
    Object v7 = ((org.jsoup.nodes.Node)v5).hasAttr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "fTont";
    Object v1 = "RawtextEndTagO";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).getOutputSettings();
    org.junit.Assert.assertNotNull(v3);
  }
}
