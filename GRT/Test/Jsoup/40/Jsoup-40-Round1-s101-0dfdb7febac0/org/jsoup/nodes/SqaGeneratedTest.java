package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).nodeName();
    Object v4 = ((org.jsoup.nodes.Node)v2).previousSibling();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "htKml";
    Object v4 = ((org.jsoup.nodes.Node)v2).wrap(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).siblingNodes();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(1285500634), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).previousSibling();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "Index must be numeric";
    Object v4 = ((org.jsoup.nodes.Node)v2).attr(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    org.junit.Assert.assertEquals((Object)("<html>\n <head></head>\n <body>\n  sT\n </body>\n</html>"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(1285500634), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).siblingNodes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v3).siblingNodes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = "S";
    Object v3 = "htmi";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = new java.lang.StringBuilder(((java.lang.String)v5));
    Object v7 = 42;
    Object v8 = new org.jsoup.nodes.Document.OutputSettings();
    Object v9 = org.jsoup.nodes.Document.OutputSettings.Syntax.html;
    Object v10 = ((org.jsoup.nodes.Document.OutputSettings)v8).syntax(((org.jsoup.nodes.Document.OutputSettings.Syntax)v9));
    ((org.jsoup.nodes.DocumentType)v4).outerHtmlTail(((java.lang.StringBuilder)v6),(((java.lang.Integer)v7).intValue()),((org.jsoup.nodes.Document.OutputSettings)v8));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "sT";
    Object v4 = "";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).clone();
    ((org.jsoup.nodes.Node)v2).replaceWith(((org.jsoup.nodes.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).nodeName();
    Object v5 = "noframe ";
    Object v6 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = "S";
    Object v3 = "htmi";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = new java.lang.StringBuilder(((java.lang.String)v5));
    Object v7 = "html";
    Object v8 = 5;
    Object v9 = ((java.lang.StringBuilder)v6).lastIndexOf(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 33;
    Object v11 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.DocumentType)v4).outerHtmlHead(((java.lang.StringBuilder)v6),(((java.lang.Integer)v10).intValue()),((org.jsoup.nodes.Document.OutputSettings)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Node)v3).childNode((((java.lang.Integer)v4).intValue()));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = "S";
    Object v3 = "htmi";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.DocumentType)v4).nodeName();
    org.junit.Assert.assertEquals((Object)("#doctype"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = "S";
    Object v3 = "htmi";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tbod<y";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = new java.lang.StringBuilder(((java.lang.String)v7));
    Object v9 = -20;
    Object v10 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.DocumentType)v4).outerHtmlHead(((java.lang.StringBuilder)v8),(((java.lang.Integer)v9).intValue()),((org.jsoup.nodes.Document.OutputSettings)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).nextSibling();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(1285500634), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = "S";
    Object v3 = "htmi";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = new java.lang.StringBuilder(((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.DocumentType)v4).outerHtmlHead(((java.lang.StringBuilder)v6),(((java.lang.Integer)v7).intValue()),((org.jsoup.nodes.Document.OutputSettings)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).toString();
    org.junit.Assert.assertEquals((Object)("<html>\n <head></head>\n <body>\n  sT\n </body>\n</html>"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = "head";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = "colgro=up";
    Object v9 = ((org.jsoup.nodes.Node)v5).attr(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = "S";
    Object v3 = "htmi";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).parent();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = "S";
    Object v3 = "htmi";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = new java.lang.StringBuilder(((java.lang.String)v5));
    Object v7 = 4;
    Object v8 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.DocumentType)v4).outerHtmlTail(((java.lang.StringBuilder)v6),(((java.lang.Integer)v7).intValue()),((org.jsoup.nodes.Document.OutputSettings)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).nextSibling();
    Object v7 = "";
    Object v8 = ((org.jsoup.nodes.Node)v5).wrap(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = "tabe";
    Object v7 = ((org.jsoup.nodes.Node)v5).hasAttr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = "caption";
    Object v7 = ((org.jsoup.nodes.Node)v5).hasAttr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).previousSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = "S";
    Object v3 = "htmi";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "BeforeDoZctypeName";
    Object v6 = "</";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "col";
    Object v9 = ((org.jsoup.nodes.Node)v4).wrap(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = "S";
    Object v3 = "htmi";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = "basiefont";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = "html";
    Object v7 = "table";
    Object v8 = ((org.jsoup.nodes.Node)v5).attr(((java.lang.String)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "sT";
    Object v4 = "";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).hashCode();
    Object v7 = ((org.jsoup.nodes.Node)v2).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).siblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).previousSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = "\"";
    ((org.jsoup.nodes.Node)v4).setBaseUri(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = "body";
    Object v5 = ((org.jsoup.nodes.Node)v3).wrap(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = "S";
    Object v3 = "htmi";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "headb";
    Object v6 = "td";
    Object v7 = "S";
    Object v8 = "htmi";
    Object v9 = new org.jsoup.nodes.DocumentType(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.DocumentType)v9).nodeName();
    Object v11 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).attributes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = "sT";
    Object v5 = "";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).clone();
    Object v9 = ((org.jsoup.nodes.Node)v3).after(((org.jsoup.nodes.Node)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = "S";
    Object v3 = "htmi";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nodeName();
    Object v6 = "htmG";
    Object v7 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = new org.jsoup.nodes.Document.OutputSettings();
    Object v5 = ((org.jsoup.nodes.Node)v3).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).toString();
    Object v7 = ((org.jsoup.nodes.Node)v5).previousSibling();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = "S";
    Object v3 = "htmi";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = new java.lang.StringBuilder(((java.lang.String)v5));
    Object v7 = -19;
    Object v8 = new org.jsoup.nodes.Document.OutputSettings();
    Object v9 = org.jsoup.nodes.Document.OutputSettings.Syntax.html;
    Object v10 = ((org.jsoup.nodes.Document.OutputSettings)v8).syntax(((org.jsoup.nodes.Document.OutputSettings.Syntax)v9));
    ((org.jsoup.nodes.DocumentType)v4).outerHtmlHead(((java.lang.StringBuilder)v6),(((java.lang.Integer)v7).intValue()),((org.jsoup.nodes.Document.OutputSettings)v8));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = "S";
    Object v3 = "htmi";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).parent();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = "html";
    Object v7 = "table";
    Object v8 = ((org.jsoup.nodes.Node)v5).attr(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).childNodesCopy();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = "html";
    Object v7 = "table";
    Object v8 = ((org.jsoup.nodes.Node)v5).attr(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "sT";
    Object v10 = "";
    Object v11 = org.jsoup.Jsoup.parse(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).clone();
    Object v13 = ((org.jsoup.nodes.Node)v8).after(((org.jsoup.nodes.Node)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).parentNode();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = "html";
    Object v7 = "table";
    Object v8 = ((org.jsoup.nodes.Node)v5).attr(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).outerHtml();
    org.junit.Assert.assertEquals((Object)("<html>\n <head></head>\n <body>\n  sT\n </body>\n</html>"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = "S";
    Object v3 = "htmi";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = new java.lang.StringBuilder(((java.lang.String)v5));
    Object v7 = ".";
    Object v8 = -94;
    Object v9 = ((java.lang.StringBuilder)v6).indexOf(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = -13;
    Object v11 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.DocumentType)v4).outerHtmlHead(((java.lang.StringBuilder)v6),(((java.lang.Integer)v10).intValue()),((org.jsoup.nodes.Document.OutputSettings)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = "html";
    Object v7 = "table";
    Object v8 = ((org.jsoup.nodes.Node)v5).attr(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = ((org.jsoup.nodes.Node)v8).childNode((((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = "tr";
    Object v7 = ((org.jsoup.nodes.Node)v5).absUrl(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).clone();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    Object v8 = "sT";
    Object v9 = "";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).clone();
    Object v12 = ((org.jsoup.nodes.Node)v11).siblingNodes();
    Object v13 = ((org.jsoup.nodes.Node)v7).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).baseUri();
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = "html";
    Object v7 = ((org.jsoup.nodes.Node)v5).wrap(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    Object v8 = "html";
    Object v9 = ((org.jsoup.nodes.Node)v7).absUrl(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = "Dtml";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingNodes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).previousSibling();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodesCopy();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(1285500634), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = "S";
    Object v3 = "htmi";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = new java.lang.StringBuilder(((java.lang.String)v5));
    Object v7 = -17;
    Object v8 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.DocumentType)v4).outerHtmlHead(((java.lang.StringBuilder)v6),(((java.lang.Integer)v7).intValue()),((org.jsoup.nodes.Document.OutputSettings)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = "table~";
    Object v8 = ((org.jsoup.nodes.Node)v6).hasAttr(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = "htYml";
    Object v5 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = "cite";
    Object v8 = ((org.jsoup.nodes.Node)v6).removeAttr(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v6).siblingNodes();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = "S";
    Object v3 = "htmi";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingNodes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = "x";
    Object v7 = ((org.jsoup.nodes.Node)v5).before(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).outerHtml();
    Object v5 = "d";
    Object v6 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).clone();
    Object v9 = "sT";
    Object v10 = "";
    Object v11 = org.jsoup.Jsoup.parse(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).clone();
    ((org.jsoup.nodes.Node)v8).replaceWith(((org.jsoup.nodes.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).childNodeSize();
    org.junit.Assert.assertEquals((Object)(1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = "Location";
    Object v8 = ((org.jsoup.nodes.Node)v6).absUrl(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Node)v7).parent();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).clone();
    ((org.jsoup.nodes.Node)v8).remove();
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = "d";
    Object v9 = ((org.jsoup.nodes.Node)v7).before(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = "S";
    Object v3 = "htmi";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = new java.lang.StringBuilder(((java.lang.String)v5));
    Object v7 = -21;
    Object v8 = new org.jsoup.nodes.Document.OutputSettings();
    Object v9 = false;
    Object v10 = ((org.jsoup.nodes.Document.OutputSettings)v8).outline((((java.lang.Boolean)v9).booleanValue()));
    ((org.jsoup.nodes.DocumentType)v4).outerHtmlHead(((java.lang.StringBuilder)v6),(((java.lang.Integer)v7).intValue()),((org.jsoup.nodes.Document.OutputSettings)v8));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Node)v7).previousSibling();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = "S";
    Object v3 = "htmi";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "";
    Object v7 = new java.lang.StringBuilder(((java.lang.String)v6));
    Object v8 = -16;
    Object v9 = new org.jsoup.nodes.Document.OutputSettings();
    Object v10 = false;
    Object v11 = ((org.jsoup.nodes.Document.OutputSettings)v9).outline((((java.lang.Boolean)v10).booleanValue()));
    ((org.jsoup.nodes.DocumentType)v4).outerHtmlHead(((java.lang.StringBuilder)v7),(((java.lang.Integer)v8).intValue()),((org.jsoup.nodes.Document.OutputSettings)v9));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = "table";
    Object v9 = ((org.jsoup.nodes.Node)v7).absUrl(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v7).previousSibling();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodesCopy();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).parentNode();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).nextSibling();
    Object v7 = "tfoo]t";
    Object v8 = ((org.jsoup.nodes.Node)v5).hasAttr(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v6 = "scrip";
    Object v7 = ((org.jsoup.nodes.Node)v5).absUrl(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = "headb";
    Object v1 = "td";
    Object v2 = "S";
    Object v3 = "htmi";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "th";
    Object v6 = ((org.jsoup.nodes.Node)v4).wrap(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = "frameset";
    Object v8 = ((org.jsoup.nodes.Node)v6).attr(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v6).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    ((org.jsoup.nodes.Node)v7).remove();
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "sT";
    Object v1 = "";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "code";
    Object v6 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = ((org.jsoup.nodes.Node)v8).childNodesCopy();
    org.junit.Assert.assertNotNull(v9);
  }
}
