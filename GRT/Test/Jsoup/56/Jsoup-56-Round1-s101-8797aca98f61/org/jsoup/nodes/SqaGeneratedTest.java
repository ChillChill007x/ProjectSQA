package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "br";
    Object v1 = "base";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "br";
    Object v1 = "base";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "titl2";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "br";
    Object v1 = "base";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "tfoot";
    Object v6 = ((org.jsoup.nodes.Node)v4).wrap(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "br";
    Object v1 = "base";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodesCopy();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "br";
    Object v1 = "base";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "col";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "br";
    Object v1 = "base";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "t";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "t)r";
    Object v1 = "9";
    Object v2 = "html";
    Object v3 = "tbody";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "br";
    Object v1 = "base";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "table";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).nextSibling();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "S";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "scrdpt";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodes();
    Object v6 = "table";
    Object v7 = ((org.jsoup.nodes.Node)v4).after(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodesCopy();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "br";
    Object v1 = "base";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingNodes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingNodes();
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = 49;
    Object v8 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.DocumentType)v4).outerHtmlHead(((java.lang.Appendable)v6),(((java.lang.Integer)v7).intValue()),((org.jsoup.nodes.Document.OutputSettings)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "br";
    Object v1 = "base";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = java.io.Writer.nullWriter();
    Object v6 = ((org.jsoup.nodes.Node)v4).html(((java.lang.Appendable)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).siblingNodes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "p=";
    Object v6 = ((org.jsoup.nodes.Node)v4).wrap(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodesCopy();
    Object v6 = new org.jsoup.nodes.Document.OutputSettings();
    Object v7 = ((org.jsoup.nodes.Node)v4).hasSameValue(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "br";
    Object v1 = "base";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Node)v4).hasSameValue(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "hftml";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "br";
    Object v1 = "base";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).previousSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "br";
    Object v1 = "base";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = ((org.jsoup.nodes.Node)v5).outerHtml();
    org.junit.Assert.assertEquals((Object)("<html>\n <head></head>\n <body>\n  br\n </body>\n</html>"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).previousSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = java.io.Writer.nullWriter();
    Object v6 = "br";
    Object v7 = "base";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).toString();
    Object v10 = ((org.jsoup.nodes.Node)v8).ownerDocument();
    Object v11 = "titl2";
    Object v12 = ((org.jsoup.nodes.Node)v10).absUrl(((java.lang.String)v11));
    Object v13 = ((java.lang.Appendable)v5).append(((java.lang.CharSequence)v12));
    Object v14 = 50;
    Object v15 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.DocumentType)v4).outerHtmlHead(((java.lang.Appendable)v5),(((java.lang.Integer)v14).intValue()),((org.jsoup.nodes.Document.OutputSettings)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "]";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).parent();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tfoHt";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "table";
    Object v6 = "col";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.jsoup.nodes.Document.OutputSettings();
    Object v9 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "bod";
    Object v1 = "b";
    Object v2 = "ScriptDataDou";
    Object v3 = "c";
    Object v4 = "b";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "bod";
    Object v1 = "b";
    Object v2 = "ScriptDataDou";
    Object v3 = "c";
    Object v4 = "b";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "bod";
    Object v1 = "b";
    Object v2 = "ScriptDataDou";
    Object v3 = "c";
    Object v4 = "b";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).siblingNodes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "bod";
    Object v1 = "b";
    Object v2 = "ScriptDataDou";
    Object v3 = "c";
    Object v4 = "b";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "bod";
    Object v7 = "b";
    Object v8 = "ScriptDataDou";
    Object v9 = "c";
    Object v10 = "b";
    Object v11 = new org.jsoup.nodes.DocumentType(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).siblingNodes();
    Object v13 = ((org.jsoup.nodes.Node)v5).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodesCopy();
    Object v6 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodeSize();
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = Character.valueOf((char)1);
    Object v8 = ((java.lang.Appendable)v6).append((((java.lang.Character)v7).charValue()));
    Object v9 = -1;
    Object v10 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.DocumentType)v4).outerHtmlHead(((java.lang.Appendable)v6),(((java.lang.Integer)v9).intValue()),((org.jsoup.nodes.Document.OutputSettings)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "html";
    Object v1 = "(ame";
    Object v2 = "p";
    Object v3 = "title";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = "(ame";
    Object v2 = "p";
    Object v3 = "title";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "head";
    Object v6 = "pre";
    Object v7 = "cap~ion";
    Object v8 = "dl";
    Object v9 = new org.jsoup.nodes.DocumentType(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).previousSibling();
    ((org.jsoup.nodes.Node)v4).replaceWith(((org.jsoup.nodes.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "html";
    Object v1 = "(ame";
    Object v2 = "p";
    Object v3 = "title";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "br";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    Object v7 = "small";
    ((org.jsoup.nodes.Node)v4).setBaseUri(((java.lang.String)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "h01";
    Object v1 = "noframes";
    Object v2 = "capton";
    Object v3 = "br";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "hreG";
    Object v1 = "a";
    Object v2 = "html";
    Object v3 = "1";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "hreG";
    Object v1 = "a";
    Object v2 = "html";
    Object v3 = "1";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodeSize();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "bod";
    Object v1 = "b";
    Object v2 = "ScriptDataDou";
    Object v3 = "c";
    Object v4 = "b";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "tfHoot";
    Object v7 = ((org.jsoup.nodes.Node)v5).hasAttr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "h01";
    Object v1 = "noframes";
    Object v2 = "capton";
    Object v3 = "br";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).toString();
    Object v6 = "t*";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "html";
    Object v1 = "(ame";
    Object v2 = "p";
    Object v3 = "title";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "hreG";
    Object v1 = "a";
    Object v2 = "html";
    Object v3 = "1";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = java.io.Writer.nullWriter();
    Object v6 = 0;
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.DocumentType)v4).outerHtmlHead(((java.lang.Appendable)v5),(((java.lang.Integer)v6).intValue()),((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "html";
    Object v1 = "(ame";
    Object v2 = "p";
    Object v3 = "title";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "h01";
    Object v6 = "noframes";
    Object v7 = "capton";
    Object v8 = "br";
    Object v9 = new org.jsoup.nodes.DocumentType(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).before(((org.jsoup.nodes.Node)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "html";
    Object v1 = "(ame";
    Object v2 = "p";
    Object v3 = "title";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "h";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "bod";
    Object v1 = "b";
    Object v2 = "ScriptDataDou";
    Object v3 = "c";
    Object v4 = "b";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).outerHtml();
    org.junit.Assert.assertEquals((Object)("<!DOCTYPE bod b \"ScriptDataDou\" \"c\">"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "hreG";
    Object v1 = "a";
    Object v2 = "html";
    Object v3 = "1";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "hreG";
    Object v1 = "a";
    Object v2 = "html";
    Object v3 = "1";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ">";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "hreG";
    Object v1 = "a";
    Object v2 = "html";
    Object v3 = "1";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = java.io.Writer.nullWriter();
    Object v6 = ((org.jsoup.nodes.Node)v4).html(((java.lang.Appendable)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).childNodesCopy();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "bod";
    Object v1 = "b";
    Object v2 = "ScriptDataDou";
    Object v3 = "c";
    Object v4 = "b";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "html";
    Object v7 = "html";
    Object v8 = ((org.jsoup.nodes.Node)v5).attr(((java.lang.String)v6),((java.lang.String)v7));
    ((org.jsoup.nodes.Node)v5).remove();
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "hreG";
    Object v1 = "a";
    Object v2 = "html";
    Object v3 = "1";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tgh";
    Object v6 = "bgound";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "p";
    Object v9 = ((org.jsoup.nodes.Node)v4).after(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "bod";
    Object v1 = "b";
    Object v2 = "ScriptDataDou";
    Object v3 = "c";
    Object v4 = "b";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "c";
    Object v7 = ((org.jsoup.nodes.Node)v5).attr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "br";
    Object v1 = "base";
    Object v2 = org.jsoup.Jsoup.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = "thead";
    Object v7 = ((org.jsoup.nodes.Node)v5).attr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "hreG";
    Object v1 = "a";
    Object v2 = "html";
    Object v3 = "1";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "9";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "hreG";
    Object v1 = "a";
    Object v2 = "html";
    Object v3 = "1";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "bod";
    Object v6 = "b";
    Object v7 = "ScriptDataDou";
    Object v8 = "c";
    Object v9 = "b";
    Object v10 = new org.jsoup.nodes.DocumentType(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "tfHoot";
    Object v12 = ((org.jsoup.nodes.Node)v10).hasAttr(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v4).hasSameValue(((java.lang.Object)v12));
    Object v14 = "htwml";
    ((org.jsoup.nodes.Node)v4).setBaseUri(((java.lang.String)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "html";
    Object v1 = "(ame";
    Object v2 = "p";
    Object v3 = "title";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "bod";
    Object v1 = "b";
    Object v2 = "ScriptDataDou";
    Object v3 = "c";
    Object v4 = "b";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "bod";
    Object v7 = "b";
    Object v8 = "ScriptDataDou";
    Object v9 = "c";
    Object v10 = "b";
    Object v11 = new org.jsoup.nodes.DocumentType(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v5).after(((org.jsoup.nodes.Node)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "colgroup";
    Object v1 = "htYml";
    Object v2 = "script";
    Object v3 = "thead";
    Object v4 = "";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "td";
    Object v1 = "ead";
    Object v2 = "track";
    Object v3 = "]]&";
    Object v4 = "html";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "td";
    Object v1 = "ead";
    Object v2 = "track";
    Object v3 = "]]&";
    Object v4 = "html";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).previousSibling();
    Object v7 = "td";
    Object v8 = "ead";
    Object v9 = "track";
    Object v10 = "]]&";
    Object v11 = "html";
    Object v12 = new org.jsoup.nodes.DocumentType(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v5).before(((org.jsoup.nodes.Node)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "td";
    Object v1 = "ead";
    Object v2 = "track";
    Object v3 = "]]&";
    Object v4 = "html";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).toString();
    org.junit.Assert.assertEquals((Object)("<!DOCTYPE td ead \"track\" \"]]&\">"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "bod";
    Object v6 = "b";
    Object v7 = "ScriptDataDou";
    Object v8 = "c";
    Object v9 = "b";
    Object v10 = new org.jsoup.nodes.DocumentType(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).siblingNodes();
    Object v12 = ((org.jsoup.nodes.Node)v4).hasSameValue(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "td";
    Object v1 = "ead";
    Object v2 = "track";
    Object v3 = "]]&";
    Object v4 = "html";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Node)v5).wrap(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "hreG";
    Object v1 = "a";
    Object v2 = "html";
    Object v3 = "1";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "td";
    Object v1 = "ead";
    Object v2 = "track";
    Object v3 = "]]&";
    Object v4 = "html";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "td";
    Object v1 = "ead";
    Object v2 = "track";
    Object v3 = "]]&";
    Object v4 = "html";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).nodeName();
    Object v7 = ((org.jsoup.nodes.Node)v5).clone();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "hreG";
    Object v1 = "a";
    Object v2 = "html";
    Object v3 = "1";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).previousSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "html";
    Object v1 = "(ame";
    Object v2 = "p";
    Object v3 = "title";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodesCopy();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "head";
    Object v1 = "pre";
    Object v2 = "cap~ion";
    Object v3 = "dl";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodesCopy();
    ((org.jsoup.nodes.Node)v4).remove();
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "body";
    Object v1 = "me";
    Object v2 = "th";
    Object v3 = "caption";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "td";
    Object v1 = "ead";
    Object v2 = "track";
    Object v3 = "]]&";
    Object v4 = "html";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).nodeName();
    Object v7 = ((org.jsoup.nodes.Node)v5).clone();
    Object v8 = "bod";
    Object v9 = "b";
    Object v10 = "ScriptDataDou";
    Object v11 = "c";
    Object v12 = "b";
    Object v13 = new org.jsoup.nodes.DocumentType(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = "c";
    Object v15 = ((org.jsoup.nodes.Node)v13).attr(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Node)v7).hasSameValue(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "colgroup";
    Object v1 = "htYml";
    Object v2 = "script";
    Object v3 = "thead";
    Object v4 = "";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = ((org.jsoup.nodes.Node)v5).html(((java.lang.Appendable)v6));
    Object v8 = java.io.Writer.nullWriter();
    Object v9 = ((org.jsoup.nodes.Node)v5).html(((java.lang.Appendable)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "colgroup";
    Object v1 = "htYml";
    Object v2 = "script";
    Object v3 = "thead";
    Object v4 = "";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "lnk";
    Object v7 = ((org.jsoup.nodes.Node)v5).hasAttr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "colgroup";
    Object v1 = "htYml";
    Object v2 = "script";
    Object v3 = "thead";
    Object v4 = "";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).clone();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "colgroup";
    Object v1 = "htYml";
    Object v2 = "script";
    Object v3 = "thead";
    Object v4 = "";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "br";
    Object v7 = ((org.jsoup.nodes.Node)v5).absUrl(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "body";
    Object v1 = "me";
    Object v2 = "th";
    Object v3 = "caption";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).previousSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "hreG";
    Object v1 = "a";
    Object v2 = "html";
    Object v3 = "1";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).toString();
    org.junit.Assert.assertEquals((Object)("<!DOCTYPE hreG PUBLIC \"a\" \"html\">"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "td";
    Object v1 = "ead";
    Object v2 = "track";
    Object v3 = "]]&";
    Object v4 = "html";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = java.io.Writer.nullWriter();
    Object v7 = 0;
    Object v8 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.DocumentType)v5).outerHtmlHead(((java.lang.Appendable)v6),(((java.lang.Integer)v7).intValue()),((org.jsoup.nodes.Document.OutputSettings)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "body";
    Object v1 = "me";
    Object v2 = "th";
    Object v3 = "caption";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "capt";
    Object v6 = ((org.jsoup.nodes.Node)v4).wrap(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "td";
    Object v1 = "ead";
    Object v2 = "track";
    Object v3 = "]]&";
    Object v4 = "html";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).nodeName();
    Object v7 = ((org.jsoup.nodes.Node)v5).clone();
    Object v8 = "td";
    Object v9 = "ead";
    Object v10 = "track";
    Object v11 = "]]&";
    Object v12 = "html";
    Object v13 = new org.jsoup.nodes.DocumentType(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v7).hasSameValue(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "td";
    Object v1 = "ead";
    Object v2 = "track";
    Object v3 = "]]&";
    Object v4 = "html";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).nodeName();
    Object v7 = ((org.jsoup.nodes.Node)v5).clone();
    Object v8 = "tfooH";
    Object v9 = "";
    Object v10 = ((org.jsoup.nodes.Node)v7).attr(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v7).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "td";
    Object v1 = "ead";
    Object v2 = "track";
    Object v3 = "]]&";
    Object v4 = "html";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).attributes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "colgroup";
    Object v1 = "htYml";
    Object v2 = "script";
    Object v3 = "thead";
    Object v4 = "";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).clone();
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "td";
    Object v1 = "ead";
    Object v2 = "track";
    Object v3 = "]]&";
    Object v4 = "html";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = "htYml";
    Object v8 = "script";
    Object v9 = "thead";
    Object v10 = "";
    Object v11 = new org.jsoup.nodes.DocumentType(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v5).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "body";
    Object v1 = "me";
    Object v2 = "th";
    Object v3 = "caption";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "bod";
    Object v1 = "b";
    Object v2 = "ScriptDataDou";
    Object v3 = "c";
    Object v4 = "b";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Node)v5).absUrl(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "td";
    Object v1 = "ead";
    Object v2 = "track";
    Object v3 = "]]&";
    Object v4 = "html";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ">";
    Object v9 = ((org.jsoup.nodes.Node)v7).before(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "tr";
    Object v1 = "bod";
    Object v2 = "noframes";
    Object v3 = "command";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "tr";
    Object v1 = "bod";
    Object v2 = "noframes";
    Object v3 = "command";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).previousSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "body";
    Object v1 = ";n";
    Object v2 = "form";
    Object v3 = "sction";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "tr";
    Object v1 = "bod";
    Object v2 = "noframes";
    Object v3 = "command";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.DocumentType)v4).nodeName();
    org.junit.Assert.assertEquals((Object)("#doctype"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "td";
    Object v1 = "ead";
    Object v2 = "track";
    Object v3 = "]]&";
    Object v4 = "html";
    Object v5 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "bodZy";
    Object v7 = ((org.jsoup.nodes.Node)v5).absUrl(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "publicId";
    Object v1 = "]p";
    Object v2 = "ltml";
    Object v3 = "noframs";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }
}
