package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    Object v6 = "bod";
    Object v7 = ((org.jsoup.nodes.Node)v4).wrap(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "thead";
    Object v1 = "u";
    Object v2 = "Rho";
    Object v3 = "td";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new java.lang.StringBuilder();
    Object v6 = 1;
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.DocumentType)v4).outerHtmlHead(((java.lang.StringBuilder)v5),(((java.lang.Integer)v6).intValue()),((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "thead";
    Object v1 = "u";
    Object v2 = "Rho";
    Object v3 = "td";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tabl";
    Object v6 = "m/";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.DocumentType)v4).nodeName();
    org.junit.Assert.assertEquals((Object)("#doctype"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "iOg";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(233035107), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ol";
    Object v6 = ((org.jsoup.nodes.Node)v4).wrap(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "Qfr";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = "u";
    Object v2 = "Rho";
    Object v3 = "td";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = -31;
    Object v6 = ((org.jsoup.nodes.Node)v4).childNode((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "(tr";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "erarr";
    ((org.jsoup.nodes.Node)v4).setBaseUri(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = "u";
    Object v2 = "Rho";
    Object v3 = "td";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "thead";
    Object v1 = "u";
    Object v2 = "Rho";
    Object v3 = "td";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new java.lang.StringBuilder();
    Object v6 = 1;
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.DocumentType)v4).outerHtmlTail(((java.lang.StringBuilder)v5),(((java.lang.Integer)v6).intValue()),((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = "u";
    Object v2 = "Rho";
    Object v3 = "td";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "tmble";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "center";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nodeName();
    Object v6 = ((org.jsoup.nodes.Node)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(233035107), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).outerHtml();
    Object v6 = new org.jsoup.nodes.Document.OutputSettings();
    Object v7 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "su";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = new java.lang.StringBuilder();
    Object v6 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).hashCode();
    Object v6 = ((org.jsoup.nodes.Node)v4).nextSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).hashCode();
    Object v6 = ((org.jsoup.nodes.Node)v4).toString();
    org.junit.Assert.assertEquals((Object)("<htm]></htm]>"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "thead";
    Object v1 = "u";
    Object v2 = "Rho";
    Object v3 = "td";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    ((org.jsoup.nodes.Node)v4).remove();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "hQead";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "thead";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "thead";
    Object v1 = "u";
    Object v2 = "Rho";
    Object v3 = "td";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new java.lang.StringBuilder();
    Object v6 = 0;
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.DocumentType)v4).outerHtmlHead(((java.lang.StringBuilder)v5),(((java.lang.Integer)v6).intValue()),((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).toString();
    org.junit.Assert.assertEquals((Object)("<htm]></htm]>"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "G";
    ((org.jsoup.nodes.Node)v4).setBaseUri(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = "ht*l";
    Object v8 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "table";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    Object v7 = "tfoot";
    Object v8 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "Auml";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "strng";
    Object v6 = ((org.jsoup.nodes.Node)v4).before(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "thead";
    Object v1 = "u";
    Object v2 = "Rho";
    Object v3 = "td";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).parent();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = "u";
    Object v2 = "Rho";
    Object v3 = "td";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "Kcy";
    Object v6 = ((org.jsoup.nodes.Node)v4).wrap(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h ";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    Object v6 = "htm]";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = "Proporution";
    Object v9 = new org.jsoup.nodes.Attributes();
    Object v10 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v7),((java.lang.String)v8),((org.jsoup.nodes.Attributes)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).nodeName();
    Object v12 = ((org.jsoup.nodes.Node)v10).hashCode();
    Object v13 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = new org.jsoup.nodes.Document.OutputSettings();
    Object v6 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "thead";
    Object v1 = "u";
    Object v2 = "Rho";
    Object v3 = "td";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodes();
    Object v6 = "X";
    Object v7 = ((org.jsoup.nodes.Node)v4).wrap(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodes();
    Object v6 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "DoubleUpDownArrow";
    Object v6 = ((org.jsoup.nodes.Node)v4).wrap(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "thead";
    Object v1 = "u";
    Object v2 = "Rho";
    Object v3 = "td";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "htm]";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "Proporution";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = new org.jsoup.nodes.Document.OutputSettings();
    Object v11 = ((org.jsoup.nodes.Node)v9).equals(((java.lang.Object)v10));
    Object v12 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "bo";
    Object v6 = ((org.jsoup.nodes.Node)v4).wrap(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "urtri";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "li";
    Object v6 = "scedl";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "boxbox";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new java.lang.StringBuilder();
    Object v6 = "plaintext";
    Object v7 = ((java.lang.StringBuilder)v5).indexOf(((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.DocumentType)v4).outerHtmlHead(((java.lang.StringBuilder)v5),(((java.lang.Integer)v8).intValue()),((org.jsoup.nodes.Document.OutputSettings)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "LessTilde";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "bsime";
    Object v6 = "pro-ress";
    Object v7 = "PLAINTEXT";
    Object v8 = "";
    Object v9 = new org.jsoup.nodes.DocumentType(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "tZd";
    Object v11 = ((org.jsoup.nodes.Node)v9).absUrl(((java.lang.String)v10));
    ((org.jsoup.nodes.Node)v4).replaceWith(((org.jsoup.nodes.Node)v9));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "htm]";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "Proporution";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = "li";
    Object v11 = "scedl";
    Object v12 = ((org.jsoup.nodes.Node)v9).attr(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "boxbox";
    Object v14 = ((org.jsoup.nodes.Node)v9).removeAttr(((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Node)v14).childNodes();
    ((org.jsoup.nodes.Node)v4).replaceWith(((org.jsoup.nodes.Node)v14));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).attributes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = "menu";
    Object v7 = "script";
    Object v8 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "li";
    Object v6 = "scedl";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "boxbox";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "li";
    Object v6 = "scedl";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "boxbox";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).ownerDocument();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "gsim";
    Object v6 = ((org.jsoup.nodes.Node)v4).after(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = "menu";
    Object v7 = "script";
    Object v8 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new java.lang.StringBuilder();
    Object v10 = ((org.jsoup.nodes.Node)v8).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ">";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    Object v6 = ((org.jsoup.nodes.Node)v4).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = "htm\"";
    Object v7 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "se~ction";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "li";
    Object v6 = "scedl";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "boxbox";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new java.lang.StringBuilder();
    Object v6 = 1;
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.DocumentType)v4).outerHtmlHead(((java.lang.StringBuilder)v5),(((java.lang.Integer)v6).intValue()),((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "li";
    Object v6 = "scedl";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "boxbox";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = "KJYcy";
    Object v11 = ((org.jsoup.nodes.Node)v9).absUrl(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).outerHtml();
    Object v6 = ((org.jsoup.nodes.Node)v4).siblingNodes();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "li";
    Object v6 = "scedl";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "boxbox";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = "htm]";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "Proporution";
    Object v13 = new org.jsoup.nodes.Attributes();
    Object v14 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12),((org.jsoup.nodes.Attributes)v13));
    Object v15 = "li";
    Object v16 = "scedl";
    Object v17 = ((org.jsoup.nodes.Node)v14).attr(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "boxbox";
    Object v19 = ((org.jsoup.nodes.Node)v14).removeAttr(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Node)v9).after(((org.jsoup.nodes.Node)v19));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "Lcedil";
    Object v6 = ((org.jsoup.nodes.Node)v4).wrap(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "htm]";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "Proporution";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = "center";
    Object v11 = ((org.jsoup.nodes.Node)v9).hasAttr(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "Gntegral";
    Object v6 = ((org.jsoup.nodes.Node)v4).after(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "li";
    Object v6 = "scedl";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "boxbox";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).clone();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "gammad";
    Object v6 = ((org.jsoup.nodes.Node)v4).after(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new java.lang.StringBuilder();
    Object v6 = 0;
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.DocumentType)v4).outerHtmlHead(((java.lang.StringBuilder)v5),(((java.lang.Integer)v6).intValue()),((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    Object v6 = ((org.jsoup.nodes.Node)v4).childNodes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "li";
    Object v6 = "scedl";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "boxbox";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = "co`";
    Object v11 = ((org.jsoup.nodes.Node)v9).attr(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    Object v6 = "embed";
    Object v7 = ((org.jsoup.nodes.Node)v4).wrap(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = "menu";
    Object v7 = "script";
    Object v8 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).parent();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = "menu";
    Object v7 = "script";
    Object v8 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).hashCode();
    Object v10 = new java.lang.StringBuilder();
    Object v11 = "htm]";
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v11));
    Object v13 = "Proporution";
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v12),((java.lang.String)v13),((org.jsoup.nodes.Attributes)v14));
    Object v16 = "li";
    Object v17 = "scedl";
    Object v18 = ((org.jsoup.nodes.Node)v15).attr(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = "boxbox";
    Object v20 = ((org.jsoup.nodes.Node)v15).removeAttr(((java.lang.String)v19));
    Object v21 = "co`";
    Object v22 = ((org.jsoup.nodes.Node)v20).attr(((java.lang.String)v21));
    Object v23 = new java.lang.StringBuffer(((java.lang.CharSequence)v22));
    Object v24 = ((java.lang.StringBuilder)v10).append(((java.lang.StringBuffer)v23));
    Object v25 = 1;
    Object v26 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.DocumentType)v8).outerHtmlHead(((java.lang.StringBuilder)v10),(((java.lang.Integer)v25).intValue()),((org.jsoup.nodes.Document.OutputSettings)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "section";
    Object v6 = "base";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "section";
    Object v6 = "base";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "head";
    Object v9 = ((org.jsoup.nodes.Node)v7).hasAttr(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "section";
    Object v6 = "base";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "subgnE";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "Proporution";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "tn";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "section";
    Object v6 = "base";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "ordm";
    Object v9 = ((org.jsoup.nodes.Node)v7).hasAttr(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "section";
    Object v6 = "base";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "xrarr";
    Object v9 = "body";
    Object v10 = ((org.jsoup.nodes.Node)v7).attr(((java.lang.String)v8),((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "section";
    Object v6 = "base";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "xrarr";
    Object v9 = "body";
    Object v10 = ((org.jsoup.nodes.Node)v7).attr(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "section";
    Object v6 = "base";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "section";
    Object v6 = "base";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "subgnE";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    Object v10 = "Uarrocir";
    Object v11 = ((org.jsoup.nodes.Node)v9).absUrl(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "section";
    Object v6 = "base";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "mahilto";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "section";
    Object v6 = "base";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "xrarr";
    Object v9 = "body";
    Object v10 = ((org.jsoup.nodes.Node)v7).attr(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "u";
    Object v12 = ((org.jsoup.nodes.Node)v10).absUrl(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(""), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "section";
    Object v6 = "base";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).nextSibling();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = "menu";
    Object v7 = "script";
    Object v8 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "basefont";
    Object v10 = ((org.jsoup.nodes.Node)v8).attr(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v8).siblingNodes();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "section";
    Object v6 = "base";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "subgnE";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).nextSibling();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "section";
    Object v6 = "base";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "xrarr";
    Object v9 = "body";
    Object v10 = ((org.jsoup.nodes.Node)v7).attr(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).nextSibling();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "section";
    Object v6 = "base";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "mahilto";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).nextSibling();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "section";
    Object v6 = "base";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "subgnE";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    Object v10 = "tDt";
    Object v11 = ((org.jsoup.nodes.Node)v9).absUrl(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "section";
    Object v6 = "base";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "xrarr";
    Object v9 = "body";
    Object v10 = ((org.jsoup.nodes.Node)v7).attr(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = "bsime";
    Object v12 = "pro-ress";
    Object v13 = "PLAINTEXT";
    Object v14 = "";
    Object v15 = new org.jsoup.nodes.DocumentType(((java.lang.String)v11),((java.lang.String)v12),((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "section";
    Object v17 = "base";
    Object v18 = ((org.jsoup.nodes.Node)v15).attr(((java.lang.String)v16),((java.lang.String)v17));
    Object v19 = ((org.jsoup.nodes.Node)v10).equals(((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "section";
    Object v6 = "base";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "subgnE";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    Object v10 = "captcion";
    Object v11 = ((org.jsoup.nodes.Node)v9).absUrl(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "section";
    Object v6 = "base";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "bsime";
    Object v9 = "pro-ress";
    Object v10 = "PLAINTEXT";
    Object v11 = "";
    Object v12 = new org.jsoup.nodes.DocumentType(((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = "section";
    Object v14 = "base";
    Object v15 = ((org.jsoup.nodes.Node)v12).attr(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = "subgnE";
    Object v17 = ((org.jsoup.nodes.Node)v15).removeAttr(((java.lang.String)v16));
    Object v18 = ((org.jsoup.nodes.Node)v7).equals(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "bsime";
    Object v1 = "pro-ress";
    Object v2 = "PLAINTEXT";
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.DocumentType(((java.lang.String)v0),((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "section";
    Object v6 = "base";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "frac78";
    Object v9 = ((org.jsoup.nodes.Node)v7).absUrl(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(""), v9);
  }
}
