package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "</";
    Object v4 = ((org.jsoup.nodes.Element)v2).hasClass(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v2).val();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "!";
    Object v4 = ((org.jsoup.nodes.Element)v2).getElementById(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = " ";
    Object v4 = ((org.jsoup.nodes.Node)v2).absUrl(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "!";
    Object v4 = ">";
    Object v5 = ((org.jsoup.nodes.Element)v2).getElementsByAttributeValueStarting(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "";
    ((org.jsoup.nodes.Document)v2).title(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).siblingIndex();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).nodeName();
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Node)v2).absUrl(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).classNames();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "https";
    Object v4 = ((org.jsoup.nodes.Element)v2).append(((java.lang.String)v3));
    Object v5 = "body";
    Object v6 = ((org.jsoup.nodes.Element)v2).wrap(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(753707963), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "htm^l";
    Object v4 = "H3";
    Object v5 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).hashCode();
    Object v7 = ((org.jsoup.nodes.Element)v2).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).outerHtml();
    Object v4 = "body";
    Object v5 = ((org.jsoup.nodes.Node)v2).attr(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 19;
    Object v4 = ((org.jsoup.nodes.Element)v2).getElementsByIndexEquals((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "htm^l";
    Object v6 = "H3";
    Object v7 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "htm^l";
    Object v9 = "H3";
    Object v10 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).hashCode();
    Object v12 = ((org.jsoup.nodes.Element)v7).equals(((java.lang.Object)v11));
    Object v13 = ((org.jsoup.nodes.Element)v4).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).className();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).html();
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Element)v4).getElementsByAttribute(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = " ";
    Object v6 = ((org.jsoup.nodes.Element)v4).wrap(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).classNames();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "'";
    Object v6 = ((org.jsoup.nodes.Element)v4).select(((java.lang.String)v5));
      org.junit.Assert.fail("Expected org.jsoup.select.Selector$SelectorParseException");
    } catch (org.jsoup.select.Selector.SelectorParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).previousElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).hashCode();
    Object v6 = ((org.jsoup.nodes.Element)v4).children();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "Cannot";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Document)v4).normalise();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Document)v4).normalise();
    Object v6 = 0;
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementsByIndexEquals((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.jsoup.nodes.Element)v5).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(753707963), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = "http";
    Object v9 = ((org.jsoup.nodes.Element)v7).appendElement(((java.lang.String)v8));
    Object v10 = "]";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Document)v4).normalise();
    Object v6 = ((org.jsoup.nodes.Element)v5).id();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).id();
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Document)v4).normalise();
    Object v6 = ((org.jsoup.nodes.Node)v5).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).getAllElements();
    Object v9 = ((org.jsoup.nodes.Element)v7).classNames();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Document)v4).normalise();
    Object v6 = ((org.jsoup.nodes.Node)v5).outerHtml();
    Object v7 = ((org.jsoup.nodes.Node)v5).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = "http";
    Object v9 = ((org.jsoup.nodes.Element)v7).appendElement(((java.lang.String)v8));
    Object v10 = "]";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).html();
    Object v13 = "6";
    Object v14 = ((org.jsoup.nodes.Element)v11).append(((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Document)v4).normalise();
    Object v6 = 1;
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementsByIndexLessThan((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = "DL";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).children();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = "DL";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).val();
    org.junit.Assert.assertEquals((Object)(""), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(837838337), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).firstElementSibling();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).firstElementSibling();
    Object v8 = ((org.jsoup.nodes.Element)v7).parent();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "EM";
    Object v6 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = "http";
    Object v9 = ((org.jsoup.nodes.Element)v7).appendElement(((java.lang.String)v8));
    Object v10 = "]";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = "`";
    Object v13 = ((org.jsoup.nodes.Element)v11).getElementById(((java.lang.String)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = "DL";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).children();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = "DL";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).hasText();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "O";
    Object v6 = ((org.jsoup.nodes.Element)v4).getElementsByAttribute(((java.lang.String)v5));
    Object v7 = "htm^l";
    Object v8 = "H3";
    Object v9 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "t ";
    Object v11 = ((org.jsoup.nodes.Element)v9).prepend(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Document)v11).normalise();
    Object v13 = ((org.jsoup.nodes.Node)v12).nodeName();
    Object v14 = ((org.jsoup.nodes.Element)v4).prependChild(((org.jsoup.nodes.Node)v12));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "EM";
    Object v6 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Document)v6).normalise();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "\nImports: (%d)";
    Object v6 = ((org.jsoup.nodes.Element)v4).append(((java.lang.String)v5));
    Object v7 = "=";
    Object v8 = "Unknown combOinator: ";
    Object v9 = ((org.jsoup.nodes.Element)v4).getElementsByAttributeValueContaining(((java.lang.String)v7),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).hashCode();
    Object v8 = ((org.jsoup.nodes.Node)v6).baseUri();
    org.junit.Assert.assertEquals((Object)("H3"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).firstElementSibling();
    Object v8 = ((org.jsoup.nodes.Element)v7).parent();
    Object v9 = "xUP";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).data();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = "comment";
    Object v9 = ((org.jsoup.nodes.Element)v7).wrap(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v7).data();
    org.junit.Assert.assertEquals((Object)(""), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).hasText();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = " ";
    Object v9 = ((org.jsoup.nodes.Element)v7).appendText(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v7).previousElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = "DL";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    Object v10 = "\"";
    Object v11 = ((org.jsoup.nodes.Element)v9).getElementById(((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).firstElementSibling();
    Object v8 = ((org.jsoup.nodes.Element)v7).parent();
    Object v9 = "I";
    Object v10 = ((org.jsoup.nodes.Element)v8).toggleClass(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    Object v7 = "}";
    Object v8 = "d";
    Object v9 = ((org.jsoup.nodes.Element)v6).getElementsByAttributeValueEnding(((java.lang.String)v7),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    ((org.jsoup.nodes.Node)v6).remove();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).firstElementSibling();
    Object v8 = ((org.jsoup.nodes.Element)v7).parent();
    Object v9 = "I";
    Object v10 = ((org.jsoup.nodes.Element)v8).toggleClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Document)v10).head();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).toString();
    Object v8 = ((org.jsoup.nodes.Node)v6).previousSibling();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).firstElementSibling();
    Object v8 = ((org.jsoup.nodes.Element)v7).parent();
    Object v9 = "xUP";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).nextSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "EM";
    Object v6 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).children();
    Object v8 = ((org.jsoup.nodes.Element)v6).className();
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Document)v4).normalise();
    Object v6 = "comment";
    Object v7 = ((org.jsoup.nodes.Node)v5).absUrl(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Document)v5).title();
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = "http";
    Object v9 = ((org.jsoup.nodes.Element)v7).appendElement(((java.lang.String)v8));
    Object v10 = "]";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).html();
    Object v13 = "6";
    Object v14 = ((org.jsoup.nodes.Element)v11).append(((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Element)v14).nextElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = "DL";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    Object v10 = "title";
    Object v11 = ((org.jsoup.nodes.Element)v9).prependText(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).firstElementSibling();
    Object v8 = ((org.jsoup.nodes.Element)v7).parent();
    Object v9 = "I";
    Object v10 = ((org.jsoup.nodes.Element)v8).toggleClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).nextElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).firstElementSibling();
    Object v8 = ((org.jsoup.nodes.Element)v7).parent();
    Object v9 = "xUP";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "H4";
    Object v12 = ((org.jsoup.nodes.Node)v10).removeAttr(((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).firstElementSibling();
    Object v8 = ((org.jsoup.nodes.Element)v7).parent();
    Object v9 = "I";
    Object v10 = ((org.jsoup.nodes.Element)v8).toggleClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Document)v10).head();
    Object v12 = ((org.jsoup.nodes.Element)v11).children();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).firstElementSibling();
    Object v8 = ((org.jsoup.nodes.Element)v7).parent();
    Object v9 = "xUP";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "H4";
    Object v12 = ((org.jsoup.nodes.Node)v10).removeAttr(((java.lang.String)v11));
    Object v13 = "hef";
    Object v14 = ((org.jsoup.nodes.Element)v12).val(((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = "DL";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    Object v10 = "title";
    Object v11 = ((org.jsoup.nodes.Element)v9).prependText(((java.lang.String)v10));
    Object v12 = "G";
    Object v13 = ((org.jsoup.nodes.Element)v11).wrap(((java.lang.String)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).firstElementSibling();
    Object v8 = ((org.jsoup.nodes.Element)v7).parent();
    Object v9 = ((org.jsoup.nodes.Element)v8).data();
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "EM";
    Object v6 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).data();
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).val();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).firstElementSibling();
    Object v8 = ((org.jsoup.nodes.Node)v7).siblingNodes();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "EM";
    Object v6 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v5));
    Object v7 = "-_";
    Object v8 = ((org.jsoup.nodes.Element)v6).append(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Document)v7).title();
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).firstElementSibling();
    Object v8 = "img";
    Object v9 = ((org.jsoup.nodes.Node)v7).attr(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "EM";
    Object v6 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v5));
    Object v7 = "-_";
    Object v8 = ((org.jsoup.nodes.Element)v6).append(((java.lang.String)v7));
    Object v9 = "href";
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByClass(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = "http";
    Object v9 = ((org.jsoup.nodes.Element)v7).appendElement(((java.lang.String)v8));
    Object v10 = "]";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).nextSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).nextSibling();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Document)v4).normalise();
    Object v6 = ((org.jsoup.nodes.Document)v5).nodeName();
    org.junit.Assert.assertEquals((Object)("#document"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).firstElementSibling();
    Object v8 = ((org.jsoup.nodes.Element)v7).hasText();
    Object v9 = ((org.jsoup.nodes.Element)v7).firstElementSibling();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = "http";
    Object v9 = ((org.jsoup.nodes.Element)v7).appendElement(((java.lang.String)v8));
    Object v10 = "]";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).hasText();
    Object v13 = ((org.jsoup.nodes.Element)v11).nextElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).firstElementSibling();
    Object v8 = ((org.jsoup.nodes.Element)v7).parent();
    Object v9 = "xUP";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "H4";
    Object v12 = ((org.jsoup.nodes.Node)v10).removeAttr(((java.lang.String)v11));
    Object v13 = "hef";
    Object v14 = ((org.jsoup.nodes.Element)v12).val(((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Document)v14).head();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = "DL";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    Object v10 = "title";
    Object v11 = ((org.jsoup.nodes.Element)v9).prependText(((java.lang.String)v10));
    Object v12 = "VA}";
    Object v13 = ">";
    Object v14 = ((org.jsoup.nodes.Element)v11).getElementsByAttributeValueStarting(((java.lang.String)v12),((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = " ";
    Object v9 = ((org.jsoup.nodes.Document)v7).createElement(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = "DL";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    Object v10 = "title";
    Object v11 = ((org.jsoup.nodes.Element)v9).prependText(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).id();
    org.junit.Assert.assertEquals((Object)(""), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Document)v4).normalise();
    Object v6 = ((org.jsoup.nodes.Element)v5).tag();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = "DL";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).id();
    org.junit.Assert.assertEquals((Object)(""), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = "http";
    Object v9 = ((org.jsoup.nodes.Element)v7).appendElement(((java.lang.String)v8));
    Object v10 = "]";
    Object v11 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Document)v11).normalise();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = "DL";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    Object v10 = "title";
    Object v11 = ((org.jsoup.nodes.Element)v9).prependText(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).data();
    org.junit.Assert.assertEquals((Object)(""), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).id();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).firstElementSibling();
    Object v8 = ((org.jsoup.nodes.Element)v7).parent();
    Object v9 = ">";
    Object v10 = "d";
    Object v11 = ((org.jsoup.nodes.Element)v8).getElementsByAttributeValue(((java.lang.String)v9),((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Document)v4).normalise();
    Object v6 = ((org.jsoup.nodes.Document)v5).body();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = "textarea";
    Object v6 = ((org.jsoup.nodes.Element)v4).prependElement(((java.lang.String)v5));
    Object v7 = "HEA";
    Object v8 = ((org.jsoup.nodes.Element)v6).prependText(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "htm^l";
    Object v1 = "H3";
    Object v2 = org.jsoup.Jsoup.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "t ";
    Object v4 = ((org.jsoup.nodes.Element)v2).prepend(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).elementSiblingIndex();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v4).prepend(((java.lang.String)v6));
    Object v8 = "ewidth";
    ((org.jsoup.nodes.Document)v7).title(((java.lang.String)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }
}
