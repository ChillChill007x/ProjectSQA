package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = " ";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).html();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).text();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "tType";
    Object v5 = ((org.jsoup.nodes.Node)v3).attr(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v3).nextSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).hasText();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "CODE";
    Object v5 = ((org.jsoup.nodes.Element)v3).append(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).className();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Node)v3).hasAttr(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v3).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).previousElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = -1;
    Object v5 = ((org.jsoup.nodes.Element)v3).child((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = -18;
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsByIndexGreaterThan((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).wrap(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).nextElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(-1185554506), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).id();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = 70;
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsByIndexGreaterThan((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jsoup.nodes.Element)v3).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "PRL";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = "httpsb";
    Object v7 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).hashCode();
    Object v9 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v7));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "PRL";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = "httpsb";
    Object v7 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).hashCode();
    Object v9 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v7));
    Object v10 = ((org.jsoup.nodes.Element)v9).previousElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "PRL";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = "httpsb";
    Object v7 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v7));
    Object v9 = ((org.jsoup.nodes.Element)v3).id();
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "a";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "title";
    Object v1 = "alt";
    Object v2 = org.jsoup.parser.Parser.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Document)v2).normalise();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "T";
    Object v5 = ((org.jsoup.nodes.Element)v3).append(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "a";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).nextElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "PRL";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = "httpsb";
    Object v7 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).hashCode();
    Object v9 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v7));
    Object v10 = ((org.jsoup.nodes.Node)v9).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "H\\";
    Object v5 = ((org.jsoup.nodes.Node)v3).attr(((java.lang.String)v4));
    Object v6 = "title";
    Object v7 = ((org.jsoup.nodes.Node)v3).attr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "abs:";
    ((org.jsoup.nodes.Node)v3).setBaseUri(((java.lang.String)v4));
    Object v5 = null;
    Object v6 = "h ";
    Object v7 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "a";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "`";
    Object v7 = ((org.jsoup.nodes.Element)v5).append(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v5).data();
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "title";
    Object v1 = "alt";
    Object v2 = org.jsoup.parser.Parser.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = ((org.jsoup.nodes.Element)v2).append(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).hasText();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).val();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "title";
    Object v1 = "alt";
    Object v2 = org.jsoup.parser.Parser.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).classNames();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).html(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "title";
    Object v1 = "alt";
    Object v2 = org.jsoup.parser.Parser.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).nextSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "a";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).attributes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "head";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "title";
    Object v1 = "alt";
    Object v2 = org.jsoup.parser.Parser.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = ((org.jsoup.nodes.Element)v2).append(((java.lang.String)v3));
    Object v5 = "< --";
    Object v6 = ((org.jsoup.nodes.Element)v4).getElementById(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "head";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).classNames();
    Object v7 = "PRL";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "httpsb";
    Object v10 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v8),((java.lang.String)v9));
    Object v11 = "head";
    Object v12 = ((org.jsoup.nodes.Element)v10).toggleClass(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v5).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "PRL";
    Object v5 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v4));
    Object v6 = "httpsb";
    Object v7 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v5),((java.lang.String)v6));
    Object v8 = "a";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).attributes();
    Object v11 = ((org.jsoup.nodes.Element)v3).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).children();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "a";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "</";
    Object v7 = ((org.jsoup.nodes.Node)v5).hasAttr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "title";
    Object v1 = "alt";
    Object v2 = org.jsoup.parser.Parser.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "dd";
    Object v4 = ((org.jsoup.nodes.Document)v2).createElement(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "a";
    Object v7 = ((org.jsoup.nodes.Element)v5).wrap(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ">";
    Object v7 = ((org.jsoup.nodes.Element)v5).prepend(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "a";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "O";
    Object v7 = ((org.jsoup.nodes.Node)v5).hasAttr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).siblingNodes();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "title";
    Object v1 = "alt";
    Object v2 = org.jsoup.parser.Parser.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Document)v2).normalise();
    Object v4 = "FRAME";
    ((org.jsoup.nodes.Document)v3).title(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "T";
    Object v5 = ((org.jsoup.nodes.Element)v3).append(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).hasText();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "http";
    Object v5 = ((org.jsoup.nodes.Element)v3).html(((java.lang.String)v4));
    Object v6 = "BODY";
    Object v7 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "title";
    Object v1 = "alt";
    Object v2 = org.jsoup.parser.Parser.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Document)v2).normalise();
    Object v4 = "UTFO-8";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "title";
    Object v1 = "alt";
    Object v2 = org.jsoup.parser.Parser.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Document)v2).normalise();
    Object v4 = ((org.jsoup.nodes.Document)v3).head();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "->";
    Object v5 = ((org.jsoup.nodes.Element)v3).append(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(-1185554506), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodes();
    Object v7 = "i";
    Object v8 = ((org.jsoup.nodes.Node)v5).attr(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).siblingElements();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).getAllElements();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "title";
    Object v1 = "alt";
    Object v2 = org.jsoup.parser.Parser.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Document)v2).normalise();
    Object v4 = "";
    ((org.jsoup.nodes.Document)v3).title(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "title";
    Object v1 = "alt";
    Object v2 = org.jsoup.parser.Parser.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "";
    Object v4 = ((org.jsoup.nodes.Element)v2).append(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Document)v4).title();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "html";
    Object v5 = ((org.jsoup.nodes.Node)v3).attr(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ">";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "http";
    Object v7 = "cite";
    Object v8 = ((org.jsoup.nodes.Element)v5).getElementsByAttributeValueStarting(((java.lang.String)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "thead";
    Object v5 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).empty();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "title";
    Object v1 = "alt";
    Object v2 = org.jsoup.parser.Parser.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Document)v2).title();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = " Z";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ">";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = " Z";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "val`e";
    Object v3 = ((org.jsoup.nodes.Element)v1).prepend(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = " Z";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = -45;
    Object v3 = ((org.jsoup.nodes.Element)v1).child((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "DD";
    Object v7 = ((org.jsoup.nodes.Node)v5).hasAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v5).empty();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = " Z";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "val`e";
    Object v3 = ((org.jsoup.nodes.Element)v1).prepend(((java.lang.String)v2));
    Object v4 = "TABE";
    Object v5 = ((org.jsoup.nodes.Element)v3).removeClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Document)v3).outerHtml();
    org.junit.Assert.assertEquals((Object)("val`e\n<html>\n<head>\n</head>\n<body>\n</body>\n</html>"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = 24;
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsByIndexGreaterThan((((java.lang.Integer)v4).intValue()));
    Object v6 = ":";
    Object v7 = "DL";
    Object v8 = ((org.jsoup.nodes.Element)v3).getElementsByAttributeValue(((java.lang.String)v6),((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).baseUri();
    org.junit.Assert.assertEquals((Object)("httpsb"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = " Z";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).classNames();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = " Z";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "val`e";
    Object v3 = ((org.jsoup.nodes.Element)v1).prepend(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).val();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).nodeName();
    Object v5 = ((org.jsoup.nodes.Node)v3).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = " Z";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Document)v1).outerHtml();
    org.junit.Assert.assertEquals((Object)("<html>\n<head>\n</head>\n<body>\n</body>\n</html>"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ">";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "\nMedia (%d)";
    Object v7 = ((org.jsoup.nodes.Element)v5).hasClass(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "title";
    Object v1 = "alt";
    Object v2 = org.jsoup.parser.Parser.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "dd";
    Object v4 = ((org.jsoup.nodes.Document)v2).createElement(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).empty();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = " Z";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "val`e";
    Object v3 = ((org.jsoup.nodes.Element)v1).prepend(((java.lang.String)v2));
    Object v4 = "j=";
    Object v5 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(753707963), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "title";
    Object v1 = "alt";
    Object v2 = org.jsoup.parser.Parser.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Document)v2).normalise();
    Object v4 = ((org.jsoup.nodes.Element)v3).nextElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).html(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).id();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = " Z";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).hasText();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).empty();
    Object v7 = "[src]";
    Object v8 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v7));
    Object v9 = "axVis";
    Object v10 = ((org.jsoup.nodes.Element)v6).getElementsByClass(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).classNames();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = " Z";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = 1;
    Object v3 = ((org.jsoup.nodes.Element)v1).getElementsByIndexLessThan((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v5).hasText();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = " Z";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "title";
    Object v3 = ((org.jsoup.nodes.Element)v1).hasClass(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "title";
    Object v1 = "alt";
    Object v2 = org.jsoup.parser.Parser.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "dd";
    Object v4 = ((org.jsoup.nodes.Document)v2).createElement(((java.lang.String)v3));
    Object v5 = "*=";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = " Z";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).children();
    Object v7 = "titleZ";
    Object v8 = ((org.jsoup.nodes.Element)v5).getElementById(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "head";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "title";
    Object v1 = "alt";
    Object v2 = org.jsoup.parser.Parser.parse(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Element)v2).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "head";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ">";
    ((org.jsoup.nodes.Document)v1).title(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "DD";
    Object v7 = ((org.jsoup.nodes.Node)v5).hasAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v5).empty();
    Object v9 = "title";
    Object v10 = ((org.jsoup.nodes.Element)v8).appendText(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v8).children();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "head";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = " Z";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "width;";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Document)v1).normalise();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "&lt;";
    Object v5 = ((org.jsoup.nodes.Element)v3).appendText(((java.lang.String)v4));
    Object v6 = ">";
    Object v7 = ((org.jsoup.nodes.Element)v3).getElementById(((java.lang.String)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "PRL";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "httpsb";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "width";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "DD";
    Object v7 = ((org.jsoup.nodes.Node)v5).hasAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v5).empty();
    Object v9 = ((org.jsoup.nodes.Element)v8).classNames();
    org.junit.Assert.assertNotNull(v9);
  }
}
