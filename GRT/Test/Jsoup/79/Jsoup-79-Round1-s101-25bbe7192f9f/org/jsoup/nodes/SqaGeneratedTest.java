package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "src";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).previousSibling();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "src";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).nextSibling();
    Object v3 = ((org.jsoup.nodes.Node)v1).hasParent();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "src";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).childNodesCopy();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "src";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "src";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).nextSibling();
    Object v5 = ((org.jsoup.nodes.Node)v3).hasParent();
    Object v6 = ((org.jsoup.nodes.Node)v1).hasSameValue(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).siblingNodes();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).nodeName();
    org.junit.Assert.assertEquals((Object)("#text"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = ((org.jsoup.nodes.Node)v8).childNodes();
    Object v10 = ((org.jsoup.nodes.Node)v8).ownerDocument();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = "col(group";
    Object v10 = "caation";
    Object v11 = ((org.jsoup.nodes.LeafNode)v8).attr(((java.lang.String)v9),((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = "col(group";
    Object v10 = "caation";
    Object v11 = ((org.jsoup.nodes.LeafNode)v8).attr(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.LeafNode)v11).baseUri();
    org.junit.Assert.assertEquals((Object)(""), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = "h";
    Object v5 = ((org.jsoup.nodes.LeafNode)v3).attr(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).parentNode();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = "option";
    ((org.jsoup.nodes.Node)v3).setBaseUri(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = ((org.jsoup.nodes.LeafNode)v3).baseUri();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = "o)tion";
    Object v10 = ((org.jsoup.nodes.Node)v8).wrap(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = "trk";
    Object v5 = ((org.jsoup.nodes.Node)v3).wrap(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = ((org.jsoup.nodes.Node)v8).clearAttributes();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = "col(group";
    Object v10 = "caation";
    Object v11 = ((org.jsoup.nodes.LeafNode)v8).attr(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).root();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = ((org.jsoup.nodes.Node)v8).ownerDocument();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).nextSibling();
    Object v5 = "pubSysKey";
    Object v6 = ((org.jsoup.nodes.LeafNode)v3).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).siblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = "col(group";
    Object v10 = "caation";
    Object v11 = ((org.jsoup.nodes.LeafNode)v8).attr(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).nodeName();
    org.junit.Assert.assertEquals((Object)("#text"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = "th";
    Object v5 = ((org.jsoup.nodes.LeafNode)v3).attr(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.LeafNode)v3).baseUri();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).nextSibling();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).nextSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = "hrf";
    Object v10 = ((org.jsoup.nodes.LeafNode)v8).attr(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(""), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = "col(group";
    Object v10 = "caation";
    Object v11 = ((org.jsoup.nodes.LeafNode)v8).attr(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).hasParent();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = "col(group";
    Object v10 = "caation";
    Object v11 = ((org.jsoup.nodes.LeafNode)v8).attr(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).nextSibling();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = ((org.jsoup.nodes.Node)v8).clone();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).clone();
    Object v7 = ((org.jsoup.nodes.Node)v5).outerHtml();
    org.junit.Assert.assertEquals((Object)("h)1"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = "col(group";
    Object v10 = "caation";
    Object v11 = ((org.jsoup.nodes.LeafNode)v8).attr(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.LeafNode)v11).ensureChildNodes();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).siblingNodes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = "col(group";
    Object v10 = "caation";
    Object v11 = ((org.jsoup.nodes.LeafNode)v8).attr(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).previousSibling();
    Object v13 = ((org.jsoup.nodes.LeafNode)v11).childNodeSize();
    org.junit.Assert.assertEquals((Object)(0), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = ((org.jsoup.nodes.Node)v4).outerHtml();
    Object v6 = "t6r";
    Object v7 = ((org.jsoup.nodes.LeafNode)v4).attr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = ((org.jsoup.nodes.Node)v8).clone();
    Object v10 = ((org.jsoup.nodes.Node)v9).hasParent();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = ((org.jsoup.nodes.Node)v8).clone();
    Object v10 = ((org.jsoup.nodes.Node)v9).previousSibling();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = "col(group";
    Object v10 = "caation";
    Object v11 = ((org.jsoup.nodes.LeafNode)v8).attr(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).childNodesCopy();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = "h)1";
    Object v10 = "titl9";
    Object v11 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "";
    Object v13 = "tr";
    Object v14 = ((org.jsoup.nodes.LeafNode)v11).attr(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "scXipt";
    Object v16 = ((org.jsoup.nodes.Node)v14).removeAttr(((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Node)v14).root();
    Object v18 = "col(group";
    Object v19 = "caation";
    Object v20 = ((org.jsoup.nodes.LeafNode)v17).attr(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = ((org.jsoup.nodes.LeafNode)v20).ensureChildNodes();
    Object v22 = ((org.jsoup.nodes.Node)v8).hasSameValue(((java.lang.Object)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = "src";
    Object v10 = org.jsoup.nodes.Document.createShell(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).childNodesCopy();
    Object v12 = ((org.jsoup.nodes.Node)v8).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = ((org.jsoup.nodes.Node)v8).clone();
    Object v10 = ((org.jsoup.nodes.Node)v9).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = "col(group";
    Object v10 = "caation";
    Object v11 = ((org.jsoup.nodes.LeafNode)v8).attr(((java.lang.String)v9),((java.lang.String)v10));
    ((org.jsoup.nodes.Node)v11).remove();
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = ((org.jsoup.nodes.Node)v8).clone();
    Object v10 = ((org.jsoup.nodes.Node)v9).siblingNodes();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = ((org.jsoup.nodes.Node)v8).clone();
    Object v10 = "";
    ((org.jsoup.nodes.LeafNode)v9).doSetBaseUri(((java.lang.String)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = ((org.jsoup.nodes.LeafNode)v8).hasAttributes();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = "dd";
    Object v10 = ((org.jsoup.nodes.Node)v8).absUrl(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v8).siblingNodes();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = ((org.jsoup.nodes.Node)v8).nodeName();
    org.junit.Assert.assertEquals((Object)("#text"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = ((org.jsoup.nodes.Node)v8).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "h)1";
    Object v7 = "titl9";
    Object v8 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "";
    Object v10 = "tr";
    Object v11 = ((org.jsoup.nodes.LeafNode)v8).attr(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "scXipt";
    Object v13 = ((org.jsoup.nodes.Node)v11).removeAttr(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v11).root();
    Object v15 = ((org.jsoup.nodes.Node)v14).clone();
    Object v16 = ((org.jsoup.nodes.Node)v5).hasSameValue(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = ((org.jsoup.nodes.Node)v3).nodeName();
    org.junit.Assert.assertEquals((Object)("#text"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = "basef";
    Object v6 = ((org.jsoup.nodes.LeafNode)v4).removeAttr(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "iframe";
    Object v4 = "td";
    Object v5 = ((org.jsoup.nodes.Node)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = ((org.jsoup.nodes.Node)v4).attributes();
    Object v6 = ((org.jsoup.nodes.Node)v4).hasParent();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = "col(group";
    Object v10 = "caation";
    Object v11 = ((org.jsoup.nodes.LeafNode)v8).attr(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "h)1";
    Object v13 = "titl9";
    Object v14 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "";
    Object v16 = "tr";
    Object v17 = ((org.jsoup.nodes.LeafNode)v14).attr(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "scXipt";
    Object v19 = ((org.jsoup.nodes.Node)v17).removeAttr(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Node)v17).root();
    Object v21 = ((org.jsoup.nodes.LeafNode)v20).hasAttributes();
    Object v22 = ((org.jsoup.nodes.Node)v11).equals(((java.lang.Object)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = "col(group";
    Object v10 = "caation";
    Object v11 = ((org.jsoup.nodes.LeafNode)v8).attr(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "h)1";
    Object v13 = "titl9";
    Object v14 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Node)v14).clone();
    Object v16 = ((org.jsoup.nodes.Node)v15).clearAttributes();
    Object v17 = ((org.jsoup.nodes.Node)v11).after(((org.jsoup.nodes.Node)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = ((org.jsoup.nodes.Node)v8).clone();
    Object v10 = ((org.jsoup.nodes.LeafNode)v9).attributes();
    Object v11 = ((org.jsoup.nodes.LeafNode)v9).hasAttributes();
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = "col(group";
    Object v10 = "caation";
    Object v11 = ((org.jsoup.nodes.LeafNode)v8).attr(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = " m";
    Object v13 = ((org.jsoup.nodes.Node)v11).removeAttr(((java.lang.String)v12));
    Object v14 = "h)1";
    Object v15 = "titl9";
    Object v16 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Node)v16).clone();
    Object v18 = ((org.jsoup.nodes.Node)v17).clearAttributes();
    Object v19 = ((org.jsoup.nodes.Node)v11).equals(((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = "option";
    Object v6 = ((org.jsoup.nodes.LeafNode)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = ((org.jsoup.nodes.Node)v8).clone();
    Object v10 = "h";
    Object v11 = ((org.jsoup.nodes.LeafNode)v9).hasAttr(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).parent();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Node)v5).after(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = "name";
    Object v6 = ((org.jsoup.nodes.LeafNode)v4).removeAttr(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = "name";
    Object v6 = ((org.jsoup.nodes.LeafNode)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "~";
    ((org.jsoup.nodes.Node)v6).setBaseUri(((java.lang.String)v7));
    Object v8 = null;
    Object v9 = "h)1";
    Object v10 = "titl9";
    Object v11 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).clone();
    Object v13 = ((org.jsoup.nodes.Node)v12).nodeName();
    Object v14 = ((org.jsoup.nodes.Node)v6).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = ((org.jsoup.nodes.Node)v8).clone();
    Object v10 = ((org.jsoup.nodes.Node)v9).parent();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = "name";
    Object v6 = ((org.jsoup.nodes.LeafNode)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.LeafNode)v6).baseUri();
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = "h)1";
    Object v5 = "titl9";
    Object v6 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "";
    Object v8 = "tr";
    Object v9 = ((org.jsoup.nodes.LeafNode)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "scXipt";
    Object v11 = ((org.jsoup.nodes.Node)v9).removeAttr(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v9).root();
    Object v13 = ((org.jsoup.nodes.Node)v12).clone();
    Object v14 = ((org.jsoup.nodes.Node)v3).hasSameValue(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = ((org.jsoup.nodes.Node)v8).outerHtml();
    org.junit.Assert.assertEquals((Object)("h)1"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).previousSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = "name";
    Object v6 = ((org.jsoup.nodes.LeafNode)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).childNodesCopy();
    Object v8 = ((org.jsoup.nodes.Node)v6).childNodesCopy();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = "h)1";
    Object v5 = "titl9";
    Object v6 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).clearAttributes();
    Object v9 = "name";
    Object v10 = ((org.jsoup.nodes.LeafNode)v8).removeAttr(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).childNodesCopy();
    Object v12 = ((org.jsoup.nodes.Node)v10).childNodesCopy();
    Object v13 = ((org.jsoup.nodes.Node)v3).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = "name";
    Object v6 = ((org.jsoup.nodes.LeafNode)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).siblingNodes();
    Object v8 = ((org.jsoup.nodes.LeafNode)v6).baseUri();
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).nodeName();
    Object v5 = ((org.jsoup.nodes.Node)v3).nodeName();
    org.junit.Assert.assertEquals((Object)("#text"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = "name";
    Object v6 = ((org.jsoup.nodes.LeafNode)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.LeafNode)v3).attributes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = "col(group";
    Object v10 = "caation";
    Object v11 = ((org.jsoup.nodes.LeafNode)v8).attr(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).clearAttributes();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = "name";
    Object v6 = ((org.jsoup.nodes.LeafNode)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.LeafNode)v6).ensureChildNodes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "";
    Object v7 = "thad";
    Object v8 = ((org.jsoup.nodes.LeafNode)v5).attr(((java.lang.String)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = "td";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).clearAttributes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = "s";
    Object v6 = ((org.jsoup.nodes.Node)v4).wrap(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = ((org.jsoup.nodes.Node)v5).siblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = ((org.jsoup.nodes.Node)v8).clone();
    Object v10 = ((org.jsoup.nodes.LeafNode)v9).attributes();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodesCopy();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = "toot";
    Object v6 = ((org.jsoup.nodes.Node)v4).before(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = "tr";
    Object v5 = ((org.jsoup.nodes.LeafNode)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "scXipt";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).root();
    Object v9 = "col(group";
    Object v10 = "caation";
    Object v11 = ((org.jsoup.nodes.LeafNode)v8).attr(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).nodeName();
    Object v13 = ((org.jsoup.nodes.Node)v11).nodeName();
    org.junit.Assert.assertEquals((Object)("#text"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = "basef";
    Object v6 = ((org.jsoup.nodes.LeafNode)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "optio";
    Object v8 = ((org.jsoup.nodes.Node)v6).attr(((java.lang.String)v7));
    Object v9 = "h3";
    Object v10 = ((org.jsoup.nodes.Node)v6).before(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = "optioY";
    ((org.jsoup.nodes.LeafNode)v3).doSetBaseUri(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = "name";
    Object v6 = ((org.jsoup.nodes.LeafNode)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "capt(ion";
    Object v8 = "able";
    Object v9 = ((org.jsoup.nodes.LeafNode)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = ((org.jsoup.nodes.Node)v4).nodeName();
    org.junit.Assert.assertEquals((Object)("#text"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).siblingNodes();
    Object v5 = ((org.jsoup.nodes.LeafNode)v3).coreValue();
    org.junit.Assert.assertEquals((Object)("h)1"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = "name";
    Object v6 = ((org.jsoup.nodes.LeafNode)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    ((org.jsoup.nodes.Node)v6).remove();
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "h)1";
    Object v1 = "titl9";
    Object v2 = org.jsoup.nodes.TextNode.createFromEncoded(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = "name";
    Object v6 = ((org.jsoup.nodes.LeafNode)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).hasParent();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }
}
