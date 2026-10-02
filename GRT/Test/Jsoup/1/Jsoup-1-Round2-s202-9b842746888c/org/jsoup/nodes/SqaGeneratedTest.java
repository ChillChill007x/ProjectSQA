package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "wiodth";
    Object v3 = ((org.jsoup.nodes.Element)v1).wrap(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).nextElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "/>";
    Object v3 = ((org.jsoup.nodes.Element)v1).getElementById(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).id();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).className();
    org.junit.Assert.assertEquals((Object)(" >"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "blockqluote";
    Object v3 = ">";
    Object v4 = ((org.jsoup.nodes.Element)v1).getElementsByAttributeValueEnding(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(753707963), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "";
    ((org.jsoup.nodes.Document)v1).title(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "ht";
    ((org.jsoup.nodes.Document)v1).title(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).hasText();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "colgr";
    Object v3 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "</";
    Object v3 = ((org.jsoup.nodes.Element)v1).getElementById(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).id();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).previousElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).data();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = "c";
    Object v4 = ((org.jsoup.nodes.Element)v1).getElementsByAttributeValueEnding(((java.lang.String)v2),((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = "href";
    Object v9 = "span";
    Object v10 = ((org.jsoup.nodes.Element)v7).getElementsByAttributeValueEnding(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v7).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = "e";
    Object v9 = " ";
    Object v10 = ((org.jsoup.nodes.Element)v7).getElementsByAttributeValueContaining(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Document)v7).head();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = "e";
    Object v9 = " ";
    Object v10 = ((org.jsoup.nodes.Element)v7).getElementsByAttributeValueContaining(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Document)v7).head();
    Object v12 = "";
    Object v13 = ((org.jsoup.nodes.Node)v11).attr(((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(""), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = "e";
    Object v9 = " ";
    Object v10 = ((org.jsoup.nodes.Element)v7).getElementsByAttributeValueContaining(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Document)v7).head();
    Object v12 = ((org.jsoup.nodes.Element)v11).firstElementSibling();
    Object v13 = "Coul not parse query ";
    Object v14 = ((org.jsoup.nodes.Element)v11).wrap(((java.lang.String)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = "object";
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementById(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = "title";
    Object v8 = ((org.jsoup.nodes.Element)v6).toggleClass(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).children();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = "title";
    Object v8 = ((org.jsoup.nodes.Element)v6).toggleClass(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).val();
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = "?";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = "title";
    Object v8 = ((org.jsoup.nodes.Element)v6).toggleClass(((java.lang.String)v7));
    Object v9 = 0;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexEquals((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.jsoup.nodes.Element)v8).html();
    org.junit.Assert.assertEquals((Object)("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>BODY"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = "title";
    Object v8 = ((org.jsoup.nodes.Element)v6).toggleClass(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).classNames();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Element)v7).data();
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = "title";
    Object v8 = ((org.jsoup.nodes.Element)v6).toggleClass(((java.lang.String)v7));
    Object v9 = "body";
    Object v10 = org.jsoup.nodes.Document.createShell(((java.lang.String)v9));
    Object v11 = "blockqluote";
    Object v12 = ">";
    Object v13 = ((org.jsoup.nodes.Element)v10).getElementsByAttributeValueEnding(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Element)v10).hashCode();
    Object v15 = ((org.jsoup.nodes.Element)v8).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = "title";
    Object v8 = ((org.jsoup.nodes.Element)v6).toggleClass(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = 2;
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementsByIndexEquals((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = " ";
    Object v11 = ((org.jsoup.nodes.Document)v9).text(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = ((org.jsoup.nodes.Document)v7).title();
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = "?";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = "tite";
    Object v11 = ((org.jsoup.nodes.Document)v9).createElement(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).nextElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = " ";
    Object v11 = ((org.jsoup.nodes.Document)v9).text(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = " ";
    Object v11 = ((org.jsoup.nodes.Document)v9).text(((java.lang.String)v10));
    Object v12 = "";
    Object v13 = ((org.jsoup.nodes.Element)v11).append(((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = " ";
    Object v11 = ((org.jsoup.nodes.Document)v9).text(((java.lang.String)v10));
    Object v12 = "";
    Object v13 = ((org.jsoup.nodes.Element)v11).append(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Element)v13).classNames();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "tile";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = "?";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = "tite";
    Object v11 = ((org.jsoup.nodes.Document)v9).createElement(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = "?";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = "height";
    Object v11 = "maito";
    Object v12 = ((org.jsoup.nodes.Element)v9).getElementsByAttributeValueContaining(((java.lang.String)v10),((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = "<";
    Object v8 = ((org.jsoup.nodes.Node)v6).absUrl(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = " ";
    Object v11 = ((org.jsoup.nodes.Document)v9).text(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).previousElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = " ";
    Object v11 = ((org.jsoup.nodes.Document)v9).text(((java.lang.String)v10));
    Object v12 = "";
    Object v13 = ((org.jsoup.nodes.Element)v11).append(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Document)v13).body();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).id();
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Document)v9).normalise();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Document)v9).normalise();
    Object v11 = 0;
    Object v12 = ((org.jsoup.nodes.Element)v10).getElementsByIndexLessThan((((java.lang.Integer)v11).intValue()));
    Object v13 = "s";
    Object v14 = ((org.jsoup.nodes.Element)v10).appendElement(((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).hashCode();
    org.junit.Assert.assertEquals((Object)(-1030650892), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).hashCode();
    Object v11 = ((org.jsoup.nodes.Element)v9).classNames();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = "?";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = "tite";
    Object v11 = ((org.jsoup.nodes.Document)v9).createElement(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).previousElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = "title";
    Object v8 = ((org.jsoup.nodes.Element)v6).toggleClass(((java.lang.String)v7));
    Object v9 = "body";
    Object v10 = org.jsoup.nodes.Document.createShell(((java.lang.String)v9));
    Object v11 = "body";
    Object v12 = org.jsoup.nodes.Document.createShell(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v10).prependChild(((org.jsoup.nodes.Node)v12));
    Object v14 = "BODY";
    Object v15 = ((org.jsoup.nodes.Element)v10).append(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Element)v8).prependChild(((org.jsoup.nodes.Node)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Document)v9).normalise();
    Object v11 = ((org.jsoup.nodes.Element)v10).hashCode();
    Object v12 = ((org.jsoup.nodes.Element)v10).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Document)v9).normalise();
    Object v11 = 0;
    Object v12 = ((org.jsoup.nodes.Element)v10).getElementsByIndexLessThan((((java.lang.Integer)v11).intValue()));
    Object v13 = "s";
    Object v14 = ((org.jsoup.nodes.Element)v10).appendElement(((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Element)v14).nextElementSibling();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "BODY";
    Object v3 = ((org.jsoup.nodes.Node)v1).hasAttr(((java.lang.String)v2));
    Object v4 = ">";
    Object v5 = "b]ody";
    Object v6 = ((org.jsoup.nodes.Element)v1).getElementsByAttributeValueStarting(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).nextElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = "title";
    Object v8 = ((org.jsoup.nodes.Element)v6).prependText(((java.lang.String)v7));
    Object v9 = "body";
    Object v10 = org.jsoup.nodes.Document.createShell(((java.lang.String)v9));
    Object v11 = "body";
    Object v12 = org.jsoup.nodes.Document.createShell(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v10).prependChild(((org.jsoup.nodes.Node)v12));
    Object v14 = "BODY";
    Object v15 = ((org.jsoup.nodes.Element)v10).append(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Document)v15).normalise();
    Object v17 = "?";
    Object v18 = ((org.jsoup.nodes.Element)v16).val(((java.lang.String)v17));
    Object v19 = "tite";
    Object v20 = ((org.jsoup.nodes.Document)v18).createElement(((java.lang.String)v19));
    Object v21 = ((org.jsoup.nodes.Element)v6).prependChild(((org.jsoup.nodes.Node)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = " ";
    Object v11 = ((org.jsoup.nodes.Document)v9).text(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Document)v11).outerHtml();
    org.junit.Assert.assertEquals((Object)("<#root>\n<html>\n <head>\n </head>\n <body> \n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>BODY"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = "title";
    Object v8 = ((org.jsoup.nodes.Element)v6).toggleClass(((java.lang.String)v7));
    Object v9 = "body";
    Object v10 = org.jsoup.nodes.Document.createShell(((java.lang.String)v9));
    Object v11 = "colgr";
    Object v12 = ((org.jsoup.nodes.Node)v10).attr(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v8).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = "title";
    Object v8 = ((org.jsoup.nodes.Element)v6).toggleClass(((java.lang.String)v7));
    Object v9 = "TR";
    Object v10 = ((org.jsoup.nodes.Element)v8).addClass(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = "title";
    Object v8 = ((org.jsoup.nodes.Element)v6).toggleClass(((java.lang.String)v7));
    Object v9 = "TR";
    Object v10 = ((org.jsoup.nodes.Element)v8).addClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).toString();
    org.junit.Assert.assertEquals((Object)("<#root>\n<html>\n <head>\n </head>\n <body>\n </body>\n</html>\n</#root>\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>BODY"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = " ";
    Object v11 = ((org.jsoup.nodes.Document)v9).text(((java.lang.String)v10));
    Object v12 = "";
    Object v13 = ((org.jsoup.nodes.Element)v11).append(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Document)v13).body();
    Object v15 = "SAP";
    Object v16 = ((org.jsoup.nodes.Element)v14).append(((java.lang.String)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = " ";
    Object v11 = ((org.jsoup.nodes.Document)v9).text(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).children();
    Object v13 = ((org.jsoup.nodes.Document)v11).normalise();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = " ";
    Object v11 = ((org.jsoup.nodes.Document)v9).text(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).children();
    Object v13 = ((org.jsoup.nodes.Document)v11).normalise();
    Object v14 = "body";
    Object v15 = org.jsoup.nodes.Document.createShell(((java.lang.String)v14));
    Object v16 = "body";
    Object v17 = org.jsoup.nodes.Document.createShell(((java.lang.String)v16));
    Object v18 = ((org.jsoup.nodes.Element)v15).prependChild(((org.jsoup.nodes.Node)v17));
    Object v19 = "BODY";
    Object v20 = ((org.jsoup.nodes.Element)v15).append(((java.lang.String)v19));
    Object v21 = ((org.jsoup.nodes.Document)v20).normalise();
    Object v22 = "?";
    Object v23 = ((org.jsoup.nodes.Element)v21).val(((java.lang.String)v22));
    Object v24 = ((org.jsoup.nodes.Element)v13).appendChild(((org.jsoup.nodes.Node)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = "title";
    Object v8 = ((org.jsoup.nodes.Element)v6).prependText(((java.lang.String)v7));
    Object v9 = "body";
    Object v10 = org.jsoup.nodes.Document.createShell(((java.lang.String)v9));
    Object v11 = "body";
    Object v12 = org.jsoup.nodes.Document.createShell(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v10).prependChild(((org.jsoup.nodes.Node)v12));
    Object v14 = "BODY";
    Object v15 = ((org.jsoup.nodes.Element)v10).append(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Document)v15).normalise();
    Object v17 = "?";
    Object v18 = ((org.jsoup.nodes.Element)v16).val(((java.lang.String)v17));
    Object v19 = "tite";
    Object v20 = ((org.jsoup.nodes.Document)v18).createElement(((java.lang.String)v19));
    Object v21 = ((org.jsoup.nodes.Element)v6).prependChild(((org.jsoup.nodes.Node)v20));
    Object v22 = ((org.jsoup.nodes.Element)v21).classNames();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = " ";
    Object v11 = ((org.jsoup.nodes.Document)v9).text(((java.lang.String)v10));
    Object v12 = "cite";
    Object v13 = ((org.jsoup.nodes.Element)v11).wrap(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Element)v11).className();
    org.junit.Assert.assertEquals((Object)(""), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = "title";
    Object v8 = ((org.jsoup.nodes.Element)v6).toggleClass(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).childNodes();
    Object v10 = ((org.jsoup.nodes.Node)v8).nextSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = "title";
    Object v8 = ((org.jsoup.nodes.Element)v6).toggleClass(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = ((org.jsoup.nodes.Node)v8).attr(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(""), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = "title";
    Object v8 = ((org.jsoup.nodes.Element)v6).prependText(((java.lang.String)v7));
    Object v9 = "body";
    Object v10 = org.jsoup.nodes.Document.createShell(((java.lang.String)v9));
    Object v11 = "body";
    Object v12 = org.jsoup.nodes.Document.createShell(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v10).prependChild(((org.jsoup.nodes.Node)v12));
    Object v14 = "BODY";
    Object v15 = ((org.jsoup.nodes.Element)v10).append(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Document)v15).normalise();
    Object v17 = "?";
    Object v18 = ((org.jsoup.nodes.Element)v16).val(((java.lang.String)v17));
    Object v19 = "tite";
    Object v20 = ((org.jsoup.nodes.Document)v18).createElement(((java.lang.String)v19));
    Object v21 = ((org.jsoup.nodes.Element)v6).prependChild(((org.jsoup.nodes.Node)v20));
    Object v22 = "";
    Object v23 = ((org.jsoup.nodes.Element)v21).getElementById(((java.lang.String)v22));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = " ";
    Object v11 = ((org.jsoup.nodes.Document)v9).text(((java.lang.String)v10));
    Object v12 = "";
    Object v13 = ((org.jsoup.nodes.Element)v11).append(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Document)v13).body();
    Object v15 = ((org.jsoup.nodes.Element)v14).firstElementSibling();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = " ";
    Object v11 = ((org.jsoup.nodes.Document)v9).text(((java.lang.String)v10));
    Object v12 = "";
    Object v13 = ((org.jsoup.nodes.Element)v11).append(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Document)v13).body();
    Object v15 = ((org.jsoup.nodes.Element)v14).firstElementSibling();
    Object v16 = "MAP";
    Object v17 = ((org.jsoup.nodes.Element)v15).prepend(((java.lang.String)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).html();
    Object v8 = ">";
    Object v9 = ((org.jsoup.nodes.Element)v6).toggleClass(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).nextSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = "title";
    Object v8 = ((org.jsoup.nodes.Element)v6).toggleClass(((java.lang.String)v7));
    Object v9 = "TR";
    Object v10 = ((org.jsoup.nodes.Element)v8).addClass(((java.lang.String)v9));
    Object v11 = "suy";
    Object v12 = ((org.jsoup.nodes.Element)v10).prepend(((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Document)v9).normalise();
    Object v11 = "colgroup";
    Object v12 = ((org.jsoup.nodes.Element)v10).val(((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = " ";
    Object v11 = ((org.jsoup.nodes.Document)v9).text(((java.lang.String)v10));
    Object v12 = "";
    Object v13 = ((org.jsoup.nodes.Element)v11).append(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Document)v13).body();
    Object v15 = ((org.jsoup.nodes.Element)v14).classNames();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = "title";
    Object v8 = ((org.jsoup.nodes.Element)v6).toggleClass(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = ((org.jsoup.nodes.Element)v8).toggleClass(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = "title";
    Object v8 = ((org.jsoup.nodes.Element)v6).toggleClass(((java.lang.String)v7));
    Object v9 = "TR";
    Object v10 = ((org.jsoup.nodes.Element)v8).addClass(((java.lang.String)v9));
    Object v11 = "suy";
    Object v12 = ((org.jsoup.nodes.Element)v10).prepend(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = "title";
    Object v8 = ((org.jsoup.nodes.Element)v6).toggleClass(((java.lang.String)v7));
    Object v9 = "TR";
    Object v10 = ((org.jsoup.nodes.Element)v8).addClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = "?";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = "tite";
    Object v11 = ((org.jsoup.nodes.Document)v9).createElement(((java.lang.String)v10));
    Object v12 = "abs:hrf";
    Object v13 = "FORM";
    Object v14 = ((org.jsoup.nodes.Element)v11).getElementsByAttributeValue(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "=";
    Object v16 = ((org.jsoup.nodes.Element)v11).append(((java.lang.String)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = "body";
    Object v8 = org.jsoup.nodes.Document.createShell(((java.lang.String)v7));
    Object v9 = "colgr";
    Object v10 = ((org.jsoup.nodes.Node)v8).attr(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v6).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = " ";
    Object v11 = ((org.jsoup.nodes.Document)v9).text(((java.lang.String)v10));
    Object v12 = "";
    Object v13 = ((org.jsoup.nodes.Element)v11).append(((java.lang.String)v12));
    Object v14 = "<![CDAT>[";
    Object v15 = ((org.jsoup.nodes.Node)v13).absUrl(((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(""), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).val();
    org.junit.Assert.assertEquals((Object)("height"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "OP";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = " ";
    Object v11 = ((org.jsoup.nodes.Document)v9).text(((java.lang.String)v10));
    Object v12 = "im";
    Object v13 = " ";
    Object v14 = ((org.jsoup.nodes.Element)v11).attr(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Element)v11).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "OP";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = "BOD";
    Object v4 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "OP";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "href";
    Object v3 = ((org.jsoup.nodes.Element)v1).prepend(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).children();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "OP";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).empty();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "OP";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "ht&tp";
    Object v3 = ((org.jsoup.nodes.Element)v1).prependText(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).classNames();
    Object v8 = "height";
    Object v9 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v8));
    Object v10 = " ";
    Object v11 = ((org.jsoup.nodes.Document)v9).text(((java.lang.String)v10));
    Object v12 = "";
    Object v13 = ((org.jsoup.nodes.Element)v11).append(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Document)v13).body();
    Object v15 = ((org.jsoup.nodes.Element)v14).children();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "body";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v3));
    Object v5 = "BODY";
    Object v6 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    Object v8 = "?";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).hasText();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "OP";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).nextSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "OP";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "ht&tp";
    Object v3 = ((org.jsoup.nodes.Element)v1).prependText(((java.lang.String)v2));
    Object v4 = 5;
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsByIndexEquals((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "OP";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).empty();
    Object v3 = "OP";
    Object v4 = org.jsoup.nodes.Document.createShell(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).empty();
    Object v6 = ((org.jsoup.nodes.Element)v2).appendChild(((org.jsoup.nodes.Node)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "OP";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "body";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = "body";
    Object v5 = org.jsoup.nodes.Document.createShell(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v5));
    Object v7 = "BODY";
    Object v8 = ((org.jsoup.nodes.Element)v3).append(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).classNames();
    Object v10 = "height";
    Object v11 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v10));
    Object v12 = " ";
    Object v13 = ((org.jsoup.nodes.Document)v11).text(((java.lang.String)v12));
    Object v14 = "cite";
    Object v15 = ((org.jsoup.nodes.Element)v13).wrap(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Element)v13).className();
    Object v17 = ((org.jsoup.nodes.Element)v1).equals(((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }
}
