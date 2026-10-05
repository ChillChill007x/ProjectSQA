package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "b";
    Object v4 = ((org.jsoup.nodes.Node)v2).removeAttr(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v2).siblingNodes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).siblingNodes();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 0;
    Object v4 = new java.io.StringWriter((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.jsoup.nodes.Node)v2).html(((java.lang.Appendable)v4));
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Node)v2).before(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).childNodesCopy();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "table";
    Object v4 = ((org.jsoup.nodes.Node)v2).removeAttr(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v2).previousSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = " ";
    Object v4 = ((org.jsoup.nodes.Node)v2).wrap(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "caption";
    Object v4 = ((org.jsoup.nodes.Node)v2).attr(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "2";
    Object v4 = ((org.jsoup.nodes.Node)v2).hasAttr(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "Tem";
    Object v4 = "TagN";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).siblingNodes();
    Object v9 = ((org.jsoup.nodes.Node)v2).hasSameValue(((java.lang.Object)v8));
    Object v10 = ((org.jsoup.nodes.Node)v2).siblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "BogusDoctype";
    Object v4 = ((org.jsoup.nodes.Node)v2).removeAttr(((java.lang.String)v3));
    Object v5 = "br";
    Object v6 = ((org.jsoup.nodes.Node)v2).hasAttr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "captio";
    Object v1 = " ";
    Object v2 = false;
    Object v3 = new org.jsoup.nodes.XmlDeclaration(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jsoup.nodes.XmlDeclaration)v3).name();
    org.junit.Assert.assertEquals((Object)("captio"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "Tem";
    Object v5 = "TagN";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).siblingNodes();
    Object v8 = ((org.jsoup.nodes.Node)v3).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "Tem";
    Object v5 = "TagN";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "2";
    Object v8 = ((org.jsoup.nodes.Node)v6).hasAttr(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v3).hasSameValue(((java.lang.Object)v8));
    Object v10 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "base";
    Object v5 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v4));
    Object v6 = "captio";
    Object v7 = " ";
    Object v8 = false;
    Object v9 = new org.jsoup.nodes.XmlDeclaration(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.jsoup.nodes.XmlDeclaration)v9).name();
    Object v11 = ((org.jsoup.nodes.Node)v3).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = "Tem";
    Object v6 = "TagN";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = ((org.jsoup.nodes.Node)v4).hasSameValue(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "Tem";
    Object v5 = "TagN";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "b";
    Object v8 = ((org.jsoup.nodes.Node)v6).removeAttr(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v6).siblingNodes();
    Object v10 = ((org.jsoup.nodes.Node)v3).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "inputf";
    Object v5 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).parent();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = "Tem";
    Object v6 = "TagN";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    ((org.jsoup.nodes.Node)v4).replaceWith(((org.jsoup.nodes.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = "";
    ((org.jsoup.nodes.Node)v4).setBaseUri(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = ((org.jsoup.nodes.Node)v4).parentNode();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "htm";
    Object v5 = ((org.jsoup.nodes.Node)v3).wrap(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "header";
    Object v5 = ((org.jsoup.nodes.Node)v3).hasAttr(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = "selec";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "td";
    Object v5 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "Tem";
    Object v5 = "TagN";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).siblingNodes();
    Object v8 = ((org.jsoup.nodes.Node)v3).hasSameValue(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = "se#ect";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).siblingNodes();
    Object v5 = 2;
    Object v6 = ((org.jsoup.nodes.Node)v3).childNode((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = "html";
    Object v6 = ((org.jsoup.nodes.Node)v4).wrap(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "captio";
    Object v1 = " ";
    Object v2 = false;
    Object v3 = new org.jsoup.nodes.XmlDeclaration(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    Object v5 = ((org.jsoup.nodes.XmlDeclaration)v3).nodeName();
    org.junit.Assert.assertEquals((Object)("#declaration"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = "";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).attributes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = "se#ect";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Node)v7).nodeName();
    Object v9 = ((org.jsoup.nodes.Node)v7).previousSibling();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).nextSibling();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "captio";
    Object v1 = " ";
    Object v2 = false;
    Object v3 = new org.jsoup.nodes.XmlDeclaration(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "caption";
    Object v5 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "captio";
    Object v1 = " ";
    Object v2 = false;
    Object v3 = new org.jsoup.nodes.XmlDeclaration(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodeSize();
    Object v5 = 0;
    Object v6 = new java.io.StringWriter((((java.lang.Integer)v5).intValue()));
    Object v7 = -13;
    Object v8 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.XmlDeclaration)v3).outerHtmlHead(((java.lang.Appendable)v6),(((java.lang.Integer)v7).intValue()),((org.jsoup.nodes.Document.OutputSettings)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "t6foot";
    Object v5 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "captio";
    Object v1 = " ";
    Object v2 = false;
    Object v3 = new org.jsoup.nodes.XmlDeclaration(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jsoup.nodes.Node)v3).nextSibling();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = "se#ect";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodesCopy();
    Object v9 = ((org.jsoup.nodes.Node)v7).siblingNodes();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "captio";
    Object v1 = " ";
    Object v2 = false;
    Object v3 = new org.jsoup.nodes.XmlDeclaration(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jsoup.nodes.XmlDeclaration)v3).nodeName();
    org.junit.Assert.assertEquals((Object)("#declaration"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = "Tem";
    Object v7 = "TagN";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "b";
    Object v10 = ((org.jsoup.nodes.Node)v8).removeAttr(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v8).siblingNodes();
    Object v12 = ((org.jsoup.nodes.Node)v4).hasSameValue(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "captio";
    Object v5 = " ";
    Object v6 = false;
    Object v7 = new org.jsoup.nodes.XmlDeclaration(((java.lang.String)v4),((java.lang.String)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodesCopy();
    Object v9 = ((org.jsoup.nodes.XmlDeclaration)v7).nodeName();
    Object v10 = ((org.jsoup.nodes.Node)v3).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).parentNode();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "style";
    Object v5 = ((org.jsoup.nodes.Node)v3).before(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "textare";
    Object v5 = ((org.jsoup.nodes.Node)v3).attr(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "captio";
    Object v1 = " ";
    Object v2 = false;
    Object v3 = new org.jsoup.nodes.XmlDeclaration(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jsoup.nodes.Node)v3).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = 0;
    Object v5 = new java.io.StringWriter((((java.lang.Integer)v4).intValue()));
    Object v6 = "captio";
    Object v7 = " ";
    Object v8 = false;
    Object v9 = new org.jsoup.nodes.XmlDeclaration(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.jsoup.nodes.XmlDeclaration)v9).nodeName();
    Object v11 = ((java.lang.Appendable)v5).append(((java.lang.CharSequence)v10));
    Object v12 = ((org.jsoup.nodes.Node)v3).html(((java.lang.Appendable)v5));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "captio";
    Object v1 = " ";
    Object v2 = false;
    Object v3 = new org.jsoup.nodes.XmlDeclaration(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jsoup.nodes.XmlDeclaration)v3).toString();
    org.junit.Assert.assertEquals((Object)("<?captio?>"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "captio";
    Object v1 = " ";
    Object v2 = false;
    Object v3 = new org.jsoup.nodes.XmlDeclaration(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = "Tem";
    Object v5 = "TagN";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = 0;
    Object v9 = new java.io.StringWriter((((java.lang.Integer)v8).intValue()));
    Object v10 = "captio";
    Object v11 = " ";
    Object v12 = false;
    Object v13 = new org.jsoup.nodes.XmlDeclaration(((java.lang.String)v10),((java.lang.String)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.jsoup.nodes.XmlDeclaration)v13).nodeName();
    Object v15 = ((java.lang.Appendable)v9).append(((java.lang.CharSequence)v14));
    Object v16 = ((org.jsoup.nodes.Node)v7).html(((java.lang.Appendable)v9));
    Object v17 = -34;
    Object v18 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.XmlDeclaration)v3).outerHtmlHead(((java.lang.Appendable)v16),(((java.lang.Integer)v17).intValue()),((org.jsoup.nodes.Document.OutputSettings)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = "Tem";
    Object v6 = "TagN";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = "Tem";
    Object v10 = "TagN";
    Object v11 = org.jsoup.Jsoup.parse(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = "2";
    Object v13 = ((org.jsoup.nodes.Node)v11).hasAttr(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v8).hasSameValue(((java.lang.Object)v13));
    Object v15 = ((org.jsoup.nodes.Node)v8).childNodesCopy();
    Object v16 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Node)v4).hasSameValue(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = "html";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = 0;
    Object v5 = new java.io.StringWriter((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jsoup.nodes.Node)v3).html(((java.lang.Appendable)v5));
    Object v7 = ((org.jsoup.nodes.Node)v3).nextSibling();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Node)v5).absUrl(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).baseUri();
    org.junit.Assert.assertEquals((Object)("TagN"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = "col";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "captio";
    Object v1 = " ";
    Object v2 = false;
    Object v3 = new org.jsoup.nodes.XmlDeclaration(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jsoup.nodes.XmlDeclaration)v3).getWholeDeclaration();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v4));
    Object v6 = "thead";
    ((org.jsoup.nodes.Node)v5).setBaseUri(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "tfoot";
    Object v5 = ((org.jsoup.nodes.Node)v3).attr(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v4));
    Object v6 = "co\\l";
    Object v7 = ((org.jsoup.nodes.Node)v5).hasAttr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "Queue did not match expected sequence";
    Object v5 = ((org.jsoup.nodes.Node)v3).attr(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "Tem";
    Object v5 = "TagN";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = "r";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v3).after(((org.jsoup.nodes.Node)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "Tem";
    Object v5 = "TagN";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = "r";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).baseUri();
    Object v11 = ((org.jsoup.nodes.Node)v3).hasSameValue(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v4));
    Object v6 = "tbod\"";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ">";
    Object v9 = ((org.jsoup.nodes.Node)v5).attr(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = "reversed";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "captio";
    Object v1 = " ";
    Object v2 = false;
    Object v3 = new org.jsoup.nodes.XmlDeclaration(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 0;
    Object v5 = new java.io.StringWriter((((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    Object v8 = ((org.jsoup.nodes.Document.OutputSettings)v7).clone();
    ((org.jsoup.nodes.XmlDeclaration)v3).outerHtmlHead(((java.lang.Appendable)v5),(((java.lang.Integer)v6).intValue()),((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "htYml";
    Object v5 = ((org.jsoup.nodes.Node)v3).attr(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v4));
    Object v6 = "form";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = "html";
    Object v9 = ((org.jsoup.nodes.Node)v5).wrap(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "em";
    Object v5 = ((org.jsoup.nodes.Node)v3).hasAttr(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    ((org.jsoup.nodes.Node)v3).remove();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v4));
    Object v6 = "html";
    Object v7 = ((org.jsoup.nodes.Node)v5).wrap(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = "Tem";
    Object v6 = "TagN";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = "textare";
    Object v10 = ((org.jsoup.nodes.Node)v8).attr(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).previousSibling();
    Object v7 = "obje";
    Object v8 = ((org.jsoup.nodes.Node)v5).hasAttr(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "bodty";
    Object v5 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "tfXot";
    Object v1 = "caption";
    Object v2 = false;
    Object v3 = new org.jsoup.nodes.XmlDeclaration(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v4));
    Object v6 = "Insert position out of boun:ds.";
    Object v7 = ((org.jsoup.nodes.Node)v5).after(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodesCopy();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v4));
    Object v6 = "captio";
    Object v7 = " ";
    Object v8 = false;
    Object v9 = new org.jsoup.nodes.XmlDeclaration(((java.lang.String)v6),((java.lang.String)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.jsoup.nodes.XmlDeclaration)v9).nodeName();
    Object v11 = ((org.jsoup.nodes.Node)v5).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "body";
    Object v5 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v4));
    Object v6 = "Tem";
    Object v7 = "TagN";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).ownerDocument();
    Object v10 = "r";
    Object v11 = ((org.jsoup.nodes.Node)v9).removeAttr(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v3).after(((org.jsoup.nodes.Node)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).toString();
    Object v7 = ((org.jsoup.nodes.Node)v5).siblingNodes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = -14;
    Object v7 = ((org.jsoup.nodes.Node)v5).childNode((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).outerHtml();
    org.junit.Assert.assertEquals((Object)("<html>\n <head></head>\n <body>\n  Tem\n </body>\n</html>"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).nextSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).clone();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).previousSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).clone();
    Object v7 = "img";
    Object v8 = ((org.jsoup.nodes.Node)v6).absUrl(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v6).clone();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "</";
    Object v1 = "col";
    Object v2 = true;
    Object v3 = new org.jsoup.nodes.XmlDeclaration(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "</";
    Object v1 = "col";
    Object v2 = true;
    Object v3 = new org.jsoup.nodes.XmlDeclaration(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).attributes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "Tem";
    Object v1 = "TagN";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodesCopy();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "</";
    Object v1 = "col";
    Object v2 = true;
    Object v3 = new org.jsoup.nodes.XmlDeclaration(((java.lang.String)v0),((java.lang.String)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = "tabl";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }
}
