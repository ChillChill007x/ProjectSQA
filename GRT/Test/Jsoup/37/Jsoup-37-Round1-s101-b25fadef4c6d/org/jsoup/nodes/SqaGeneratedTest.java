package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).val();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).getAllElements();
    Object v3 = ((org.jsoup.nodes.Element)v1).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).nextSibling();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "addrss";
    Object v3 = ((org.jsoup.nodes.Node)v1).absUrl(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(1285500634), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).tagName();
    org.junit.Assert.assertEquals((Object)("#root"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).tag();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).classNames();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).toString();
    Object v3 = org.jsoup.nodes.Element.preserveWhitespace(((org.jsoup.nodes.Node)v1));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).previousElementSibling();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).textNodes();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "textarea";
    Object v3 = ((org.jsoup.nodes.Element)v1).append(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).textNodes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "oA";
    Object v3 = ((org.jsoup.nodes.Element)v1).getElementById(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tbo+y";
    ((org.jsoup.nodes.Node)v1).setBaseUri(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = ((org.jsoup.nodes.Element)v1).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).className();
    Object v3 = ((org.jsoup.nodes.Element)v1).previousElementSibling();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    ((org.jsoup.nodes.Node)v1).remove();
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "framest";
    Object v5 = ((org.jsoup.nodes.Node)v3).hasAttr(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).data();
    Object v5 = ((org.jsoup.nodes.Element)v3).children();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).siblingElements();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).nextSibling();
    Object v5 = ((org.jsoup.nodes.Node)v3).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).textNodes();
    Object v8 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((java.util.Collection)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "<";
    Object v5 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "\\>";
    Object v5 = ((org.jsoup.nodes.Node)v3).attr(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = " ";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v7));
    Object v9 = "gzip";
    Object v10 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = "b";
    Object v6 = org.jsoup.Jsoup.parse(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).textNodes();
    Object v8 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((java.util.Collection)v7));
    Object v9 = " ";
    Object v10 = "noDframes";
    Object v11 = ((org.jsoup.nodes.Element)v8).getElementsByAttributeValueEnding(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v8).nextElementSibling();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = " ";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v7));
    Object v9 = "gzip";
    Object v10 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).hasText();
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "centr";
    Object v5 = ((org.jsoup.nodes.Element)v3).hasClass(((java.lang.String)v4));
    Object v6 = "navN";
    Object v7 = ((org.jsoup.nodes.Element)v3).hasClass(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "b";
    Object v5 = ((org.jsoup.nodes.Element)v3).html(((java.lang.String)v4));
    Object v6 = "nBoscript";
    Object v7 = ((org.jsoup.nodes.Element)v3).getElementsByAttributeStarting(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = " ";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v7));
    Object v9 = "gzip";
    Object v10 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).ownerDocument();
    Object v12 = org.jsoup.nodes.Element.preserveWhitespace(((org.jsoup.nodes.Node)v10));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = " ";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v7));
    Object v9 = "gzip";
    Object v10 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).html();
    org.junit.Assert.assertEquals((Object)("<html>\n <head></head>\n <body>\n  b\n </body>\n</html>"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "br";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsByClass(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).nextSibling();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "t";
    Object v5 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Node)v3).hasAttr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "t~h";
    Object v5 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "\"r";
    Object v5 = ((org.jsoup.nodes.Node)v3).attr(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).ownText();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = " ";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v7));
    Object v9 = "gzip";
    Object v10 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v9));
    Object v11 = "html";
    Object v12 = ((org.jsoup.nodes.Element)v10).hasClass(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v10).children();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = " ";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v7));
    Object v9 = "gzip";
    Object v10 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v9));
    Object v11 = "b";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v11));
    Object v13 = " ";
    Object v14 = ((org.jsoup.nodes.Element)v12).val(((java.lang.String)v13));
    Object v15 = "b";
    Object v16 = org.jsoup.Jsoup.parse(((java.lang.String)v15));
    Object v17 = " ";
    Object v18 = ((org.jsoup.nodes.Element)v16).val(((java.lang.String)v17));
    Object v19 = ((org.jsoup.nodes.Element)v14).prependChild(((org.jsoup.nodes.Node)v18));
    Object v20 = "gzip";
    Object v21 = ((org.jsoup.nodes.Element)v14).toggleClass(((java.lang.String)v20));
    Object v22 = ((org.jsoup.nodes.Node)v21).childNodes();
    Object v23 = ((org.jsoup.nodes.Element)v10).appendChild(((org.jsoup.nodes.Node)v21));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "br";
    Object v5 = ((org.jsoup.nodes.Element)v3).hasClass(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = " ";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v7));
    Object v9 = "gzip";
    Object v10 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v9));
    Object v11 = "html";
    Object v12 = new java.lang.StringBuilder(((java.lang.String)v11));
    Object v13 = 1;
    Object v14 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v10).outerHtmlHead(((java.lang.StringBuilder)v12),(((java.lang.Integer)v13).intValue()),((org.jsoup.nodes.Document.OutputSettings)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).id();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "BeQforeHead";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "BeQforeHead";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "EOF";
    Object v7 = ((org.jsoup.nodes.Element)v5).appendText(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "BeQforeHead";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).toString();
    org.junit.Assert.assertEquals((Object)("<html>\n <head></head>\n <body>\n  b\n </body>\n</html>"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "BeQforeHead";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "EOF";
    Object v7 = ((org.jsoup.nodes.Element)v5).appendText(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodesCopy();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = " ";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v7));
    Object v9 = "gzip";
    Object v10 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v9));
    Object v11 = "b";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).elementSiblingIndex();
    Object v14 = ((org.jsoup.nodes.Element)v10).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "BeQforeHead";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "EOF";
    Object v7 = ((org.jsoup.nodes.Element)v5).appendText(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).siblingNodes();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jsoup.nodes.Element)v5).classNames();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "MarkupDeclarationOpen";
    Object v5 = ((org.jsoup.nodes.Node)v3).attr(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "BeQforeHead";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "select";
    Object v7 = ((org.jsoup.nodes.Node)v5).attr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "ol";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v3).classNames();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jsoup.nodes.Element)v5).data();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementsMatchingText(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "BeQforeHead";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "caption";
    Object v7 = ((org.jsoup.nodes.Element)v5).select(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "BeQforeHead";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "a";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependText(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jsoup.nodes.Element)v5).nextElementSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = "h4";
    Object v7 = ((org.jsoup.nodes.Element)v5).wrap(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "BeQforeHead";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "EOF";
    Object v7 = ((org.jsoup.nodes.Element)v5).appendText(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).val();
    org.junit.Assert.assertEquals((Object)("BeQforeHead"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = " ";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v7));
    Object v9 = "gzip";
    Object v10 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v9));
    Object v11 = "frameset";
    Object v12 = ((org.jsoup.nodes.Node)v10).attr(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v10).ownerDocument();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = "tbod";
    Object v7 = ((org.jsoup.nodes.Element)v5).appendElement(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = " ";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v7));
    Object v9 = "gzip";
    Object v10 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v9));
    Object v11 = "frameset";
    Object v12 = ((org.jsoup.nodes.Node)v10).attr(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v10).ownerDocument();
    Object v14 = "td";
    Object v15 = ((org.jsoup.nodes.Element)v13).after(((java.lang.String)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "BeQforeHead";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "a";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependText(((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = " ";
    Object v12 = ((org.jsoup.nodes.Element)v10).val(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v12).childNodesCopy();
    Object v14 = ((org.jsoup.nodes.Element)v7).insertChildren((((java.lang.Integer)v8).intValue()),((java.util.Collection)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jsoup.nodes.Node)v5).previousSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = "tbod";
    Object v7 = ((org.jsoup.nodes.Element)v5).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = " ";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v7));
    Object v9 = "gzip";
    Object v10 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v9));
    Object v11 = "b";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v11));
    Object v13 = " ";
    Object v14 = ((org.jsoup.nodes.Element)v12).val(((java.lang.String)v13));
    Object v15 = "b";
    Object v16 = org.jsoup.Jsoup.parse(((java.lang.String)v15));
    Object v17 = " ";
    Object v18 = ((org.jsoup.nodes.Element)v16).val(((java.lang.String)v17));
    Object v19 = ((org.jsoup.nodes.Element)v14).prependChild(((org.jsoup.nodes.Node)v18));
    Object v20 = "gzip";
    Object v21 = ((org.jsoup.nodes.Element)v14).toggleClass(((java.lang.String)v20));
    Object v22 = ((org.jsoup.nodes.Node)v21).childNodes();
    Object v23 = ((org.jsoup.nodes.Element)v10).appendChild(((org.jsoup.nodes.Node)v21));
    Object v24 = ((org.jsoup.nodes.Element)v23).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = " ";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v7));
    Object v9 = "gzip";
    Object v10 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).outerHtml();
    org.junit.Assert.assertEquals((Object)("<#root value=\" \">\n <html>\n  <head></head>\n  <body>\n   b\n  </body>\n </html>\n</#root>\n<html>\n <head></head>\n <body>\n  b\n </body>\n</html>"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "BeQforeHead";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "EOF";
    Object v7 = ((org.jsoup.nodes.Element)v5).appendText(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).dataNodes();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = " ";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v7));
    Object v9 = "gzip";
    Object v10 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v9));
    Object v11 = "frameset";
    Object v12 = ((org.jsoup.nodes.Node)v10).attr(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v10).ownerDocument();
    Object v14 = "*";
    Object v15 = ((org.jsoup.nodes.Element)v13).removeClass(((java.lang.String)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).id();
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = "tbod";
    Object v7 = ((org.jsoup.nodes.Element)v5).appendElement(((java.lang.String)v6));
    Object v8 = "Data value must not be null";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v7).hasText();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "BeQforeHead";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "EOF";
    Object v7 = ((org.jsoup.nodes.Element)v5).appendText(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodeSize();
    org.junit.Assert.assertEquals((Object)(2), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = " ";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v7));
    Object v9 = "gzip";
    Object v10 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v9));
    Object v11 = "frameset";
    Object v12 = ((org.jsoup.nodes.Node)v10).attr(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v10).ownerDocument();
    Object v14 = "title";
    Object v15 = ((org.jsoup.nodes.Element)v13).html(((java.lang.String)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = "^\\+";
    Object v9 = ((org.jsoup.nodes.Node)v7).absUrl(((java.lang.String)v8));
    Object v10 = "script";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = "tbod";
    Object v7 = ((org.jsoup.nodes.Element)v5).appendElement(((java.lang.String)v6));
    Object v8 = org.jsoup.nodes.Element.preserveWhitespace(((org.jsoup.nodes.Node)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = "tbod";
    Object v7 = ((org.jsoup.nodes.Element)v5).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).siblingNodes();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = "tbod";
    Object v7 = ((org.jsoup.nodes.Element)v5).appendElement(((java.lang.String)v6));
    Object v8 = "html";
    Object v9 = new java.lang.StringBuilder(((java.lang.String)v8));
    Object v10 = -5;
    Object v11 = new org.jsoup.nodes.Document.OutputSettings();
    Object v12 = ((org.jsoup.nodes.Document.OutputSettings)v11).clone();
    ((org.jsoup.nodes.Element)v7).outerHtmlHead(((java.lang.StringBuilder)v9),(((java.lang.Integer)v10).intValue()),((org.jsoup.nodes.Document.OutputSettings)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "BeQforeHead";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "EOF";
    Object v7 = ((org.jsoup.nodes.Element)v5).appendText(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).isBlock();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = " ";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v7));
    Object v9 = "gzip";
    Object v10 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v9));
    Object v11 = "b";
    Object v12 = org.jsoup.Jsoup.parse(((java.lang.String)v11));
    Object v13 = " ";
    Object v14 = ((org.jsoup.nodes.Element)v12).val(((java.lang.String)v13));
    Object v15 = 0;
    Object v16 = ((org.jsoup.nodes.Element)v14).child((((java.lang.Integer)v15).intValue()));
    Object v17 = "colgroup";
    Object v18 = ((org.jsoup.nodes.Element)v16).val(((java.lang.String)v17));
    Object v19 = ((org.jsoup.nodes.Element)v10).appendChild(((org.jsoup.nodes.Node)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = "^\\+";
    Object v9 = ((org.jsoup.nodes.Node)v7).absUrl(((java.lang.String)v8));
    Object v10 = "script";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = "h";
    Object v13 = "td";
    Object v14 = ((org.jsoup.nodes.Element)v11).getElementsByAttributeValueStarting(((java.lang.String)v12),((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = " ";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v7));
    Object v9 = "gzip";
    Object v10 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v9));
    Object v11 = "frameset";
    Object v12 = ((org.jsoup.nodes.Node)v10).attr(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v10).ownerDocument();
    Object v14 = 2;
    Object v15 = "b";
    Object v16 = org.jsoup.Jsoup.parse(((java.lang.String)v15));
    Object v17 = " ";
    Object v18 = ((org.jsoup.nodes.Element)v16).val(((java.lang.String)v17));
    Object v19 = ((org.jsoup.nodes.Element)v18).data();
    Object v20 = ((org.jsoup.nodes.Element)v18).children();
    Object v21 = ((org.jsoup.nodes.Element)v13).insertChildren((((java.lang.Integer)v14).intValue()),((java.util.Collection)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = "tbod";
    Object v7 = ((org.jsoup.nodes.Element)v5).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).firstElementSibling();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).dataNodes();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).textNodes();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = "tbod";
    Object v7 = ((org.jsoup.nodes.Element)v5).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = "html";
    Object v10 = new java.lang.StringBuilder(((java.lang.String)v9));
    Object v11 = -21;
    Object v12 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v8).outerHtmlTail(((java.lang.StringBuilder)v10),(((java.lang.Integer)v11).intValue()),((org.jsoup.nodes.Document.OutputSettings)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = " ";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v7));
    Object v9 = "gzip";
    Object v10 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v9));
    Object v11 = 0;
    Object v12 = ((org.jsoup.nodes.Element)v10).child((((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = -47;
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementsByIndexEquals((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = "scrip";
    Object v7 = ((org.jsoup.nodes.Node)v5).before(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).childNodeSize();
    org.junit.Assert.assertEquals((Object)(2), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
    Object v6 = "tbod";
    Object v7 = ((org.jsoup.nodes.Element)v5).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = ((org.jsoup.nodes.Element)v8).dataNodes();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = " ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "b";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = " ";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v7));
    Object v9 = "gzip";
    Object v10 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v9));
    Object v11 = "frameset";
    Object v12 = ((org.jsoup.nodes.Node)v10).attr(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v10).ownerDocument();
    Object v14 = "htm";
    Object v15 = ((org.jsoup.nodes.Element)v13).prependElement(((java.lang.String)v14));
    org.junit.Assert.assertNotNull(v15);
  }
}
