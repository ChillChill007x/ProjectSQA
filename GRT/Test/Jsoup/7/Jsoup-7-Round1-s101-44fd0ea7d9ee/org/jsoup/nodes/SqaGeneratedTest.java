package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "longleftarrow";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "sigmaf";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).parents();
    Object v5 = "img";
    Object v6 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "longleftarrow";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "sigmaf";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).nextElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "longleftarrow";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "sigmaf";
    Object v3 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2));
    Object v4 = "}i";
    Object v5 = ((org.jsoup.nodes.Element)v3).html(((java.lang.String)v4));
    Object v6 = "upsh";
    Object v7 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Document)v1).title();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "          ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    Object v3 = ((org.jsoup.nodes.Element)v1).classNames();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(753707963), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "co";
    Object v3 = "Integral";
    Object v4 = ((org.jsoup.nodes.Element)v1).getElementsByAttributeValueMatching(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ">";
    Object v6 = ((org.jsoup.nodes.Element)v1).addClass(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "[";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "rc";
    Object v5 = ((org.jsoup.nodes.Element)v1).wrap(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ":matchesOwn(";
    Object v3 = ((org.jsoup.nodes.Element)v1).getElementsContainingText(((java.lang.String)v2));
    Object v4 = 26;
    Object v5 = ((org.jsoup.nodes.Element)v1).getElementsByIndexEquals((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).val();
    Object v3 = ((org.jsoup.nodes.Element)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(753707963), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "triangXe";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "co";
    Object v3 = "Integral";
    Object v4 = ((org.jsoup.nodes.Element)v1).getElementsByAttributeValueMatching(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ">";
    Object v6 = ((org.jsoup.nodes.Element)v1).addClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).siblingElements();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).children();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Document)v2).title();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).hashCode();
    Object v3 = "<!--";
    Object v4 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "h3Z";
    Object v3 = ((org.jsoup.nodes.Node)v1).absUrl(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "co";
    Object v3 = "Integral";
    Object v4 = ((org.jsoup.nodes.Element)v1).getElementsByAttributeValueMatching(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ">";
    Object v6 = ((org.jsoup.nodes.Element)v1).addClass(((java.lang.String)v5));
    Object v7 = "http";
    Object v8 = ((org.jsoup.nodes.Node)v6).hasAttr(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v6).val();
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).dataset();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "yuc8y";
    Object v3 = "'4";
    Object v4 = ((org.jsoup.nodes.Element)v1).getElementsByAttributeValueStarting(((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).id();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "upharpoonleft";
    Object v4 = org.jsoup.nodes.Document.createShell(((java.lang.String)v3));
    Object v5 = "co";
    Object v6 = "Integral";
    Object v7 = ((org.jsoup.nodes.Element)v4).getElementsByAttributeValueMatching(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ">";
    Object v9 = ((org.jsoup.nodes.Element)v4).addClass(((java.lang.String)v8));
    ((org.jsoup.nodes.Node)v2).replaceWith(((org.jsoup.nodes.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).className();
    Object v3 = ((org.jsoup.nodes.Element)v1).tag();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Element)v2).text();
    Object v4 = ((org.jsoup.nodes.Element)v2).className();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "          ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "upharpoonleft";
    Object v5 = org.jsoup.nodes.Document.createShell(((java.lang.String)v4));
    Object v6 = "co";
    Object v7 = "Integral";
    Object v8 = ((org.jsoup.nodes.Element)v5).getElementsByAttributeValueMatching(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ">";
    Object v10 = ((org.jsoup.nodes.Element)v5).addClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v3).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "smal";
    Object v3 = ((org.jsoup.nodes.Element)v1).getElementsByClass(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).previousElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Barv";
    Object v3 = "OL";
    Object v4 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tFade";
    Object v6 = ((org.jsoup.nodes.Node)v1).removeAttr(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).tag();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "sgbquo";
    Object v4 = ((org.jsoup.nodes.Element)v2).appendElement(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v2).classNames();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Eogon";
    ((org.jsoup.nodes.Document)v1).title(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).hasText();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "xodot";
    Object v3 = ((org.jsoup.nodes.Element)v1).wrap(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).val();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "longleftarrow";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "sigmaf";
    Object v5 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "omix";
    Object v3 = 1;
    Object v4 = java.util.regex.Pattern.compile(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.jsoup.nodes.Element)v1).getElementsMatchingText(((java.util.regex.Pattern)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).data();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).toString();
    org.junit.Assert.assertEquals((Object)("<html>\n <head></head>\n <body></body>\n</html>"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Barv";
    Object v3 = "OL";
    Object v4 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tFade";
    Object v6 = ((org.jsoup.nodes.Node)v1).removeAttr(((java.lang.String)v5));
    Object v7 = "iota";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Barv";
    Object v3 = "OL";
    Object v4 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tFade";
    Object v6 = ((org.jsoup.nodes.Node)v1).removeAttr(((java.lang.String)v5));
    Object v7 = "iota";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "i";
    Object v10 = ((org.jsoup.nodes.Element)v8).toggleClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v8).classNames();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "summary";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "9>";
    ((org.jsoup.nodes.Document)v1).title(((java.lang.String)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).classNames();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Barv";
    Object v3 = "OL";
    Object v4 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tFade";
    Object v6 = ((org.jsoup.nodes.Node)v1).removeAttr(((java.lang.String)v5));
    Object v7 = "oint";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendElement(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Document)v2).normalise();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Element)v2).hasText();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "co";
    Object v3 = "Integral";
    Object v4 = ((org.jsoup.nodes.Element)v1).getElementsByAttributeValueMatching(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ">";
    Object v6 = ((org.jsoup.nodes.Element)v1).addClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Barv";
    Object v3 = "OL";
    Object v4 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tFade";
    Object v6 = ((org.jsoup.nodes.Node)v1).removeAttr(((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementsByIndexEquals((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).className();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "boxdr";
    Object v4 = ((org.jsoup.nodes.Node)v2).absUrl(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Barv";
    Object v3 = "OL";
    Object v4 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tFade";
    Object v6 = ((org.jsoup.nodes.Node)v1).removeAttr(((java.lang.String)v5));
    Object v7 = "oint";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendElement(((java.lang.String)v7));
    Object v9 = "nrtrie";
    Object v10 = ((org.jsoup.nodes.Node)v8).attr(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(""), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).html();
    org.junit.Assert.assertEquals((Object)("<html>\n <head></head>\n <body></body>\n</html>"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = 33;
    Object v3 = ((org.jsoup.nodes.Element)v1).getElementsByIndexLessThan((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ">";
    Object v3 = ((org.jsoup.nodes.Element)v1).addClass(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Document)v1).outerHtml();
    org.junit.Assert.assertEquals((Object)("<html>\n <head></head>\n <body></body>\n</html>"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).nextSibling();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Barv";
    Object v3 = "OL";
    Object v4 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tFade";
    Object v6 = ((org.jsoup.nodes.Node)v1).removeAttr(((java.lang.String)v5));
    Object v7 = "Ncedil";
    Object v8 = ((org.jsoup.nodes.Element)v6).append(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "#h";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "upharpoonleft";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).appendChild(((org.jsoup.nodes.Node)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "co";
    Object v3 = "Integral";
    Object v4 = ((org.jsoup.nodes.Element)v1).getElementsByAttributeValueMatching(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ">";
    Object v6 = ((org.jsoup.nodes.Element)v1).addClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).baseUri();
    org.junit.Assert.assertEquals((Object)("upharpoonleft"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = ((org.jsoup.nodes.Element)v1).child((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Document)v2).outputSettings();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Barv";
    Object v3 = "OL";
    Object v4 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tFade";
    Object v6 = ((org.jsoup.nodes.Node)v1).removeAttr(((java.lang.String)v5));
    Object v7 = "GreaterSantEqual";
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementById(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "#h";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).data();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "#h";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).isBlock();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "#h";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = "gzip";
    Object v6 = ((org.jsoup.nodes.Element)v4).getElementsMatchingText(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "r|ct";
    Object v3 = ((org.jsoup.nodes.Element)v1).getElementsMatchingOwnText(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "          ";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "integers";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsByTag(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v3).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "co";
    Object v3 = "Integral";
    Object v4 = ((org.jsoup.nodes.Element)v1).getElementsByAttributeValueMatching(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ">";
    Object v6 = ((org.jsoup.nodes.Element)v1).addClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).toString();
    Object v8 = "";
    Object v9 = ((org.jsoup.nodes.Node)v6).removeAttr(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Barv";
    Object v3 = "OL";
    Object v4 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tFade";
    Object v6 = ((org.jsoup.nodes.Node)v1).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).nextElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "vKarphi";
    Object v3 = ((org.jsoup.nodes.Element)v1).wrap(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Barv";
    Object v3 = "OL";
    Object v4 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tFade";
    Object v6 = ((org.jsoup.nodes.Node)v1).removeAttr(((java.lang.String)v5));
    Object v7 = "mL";
    Object v8 = ((org.jsoup.nodes.Element)v6).prependText(((java.lang.String)v7));
    Object v9 = "pound";
    Object v10 = ((org.jsoup.nodes.Element)v6).getElementsMatchingText(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = 0;
    Object v3 = ((org.jsoup.nodes.Element)v1).child((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.jsoup.nodes.Element)v3).previousElementSibling();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Barv";
    Object v3 = "OL";
    Object v4 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tFade";
    Object v6 = ((org.jsoup.nodes.Node)v1).removeAttr(((java.lang.String)v5));
    Object v7 = "iota";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "Could not parse attribute query '%s': unexpected token at '%s'";
    Object v10 = "crarr";
    Object v11 = ((org.jsoup.nodes.Element)v8).attr(((java.lang.String)v9),((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Barv";
    Object v3 = "OL";
    Object v4 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tFade";
    Object v6 = ((org.jsoup.nodes.Node)v1).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).parent();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Barv";
    Object v3 = "OL";
    Object v4 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tFade";
    Object v6 = ((org.jsoup.nodes.Node)v1).removeAttr(((java.lang.String)v5));
    Object v7 = "oint";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendElement(((java.lang.String)v7));
    ((org.jsoup.nodes.Node)v8).remove();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Barv";
    Object v3 = "OL";
    Object v4 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tFade";
    Object v6 = ((org.jsoup.nodes.Node)v1).removeAttr(((java.lang.String)v5));
    Object v7 = "oint";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendElement(((java.lang.String)v7));
    Object v9 = "VIDEO";
    Object v10 = ((org.jsoup.nodes.Element)v8).html(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Barv";
    Object v3 = "OL";
    Object v4 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tFade";
    Object v6 = ((org.jsoup.nodes.Node)v1).removeAttr(((java.lang.String)v5));
    Object v7 = "iota";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "Could not parse attribute query '%s': unexpected token at '%s'";
    Object v10 = "crarr";
    Object v11 = ((org.jsoup.nodes.Element)v8).attr(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).toString();
    org.junit.Assert.assertEquals((Object)("<html>\n <head></head>\n <body></body>\n</html>iota"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Barv";
    Object v3 = "OL";
    Object v4 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tFade";
    Object v6 = ((org.jsoup.nodes.Node)v1).removeAttr(((java.lang.String)v5));
    Object v7 = "iota";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).children();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Barv";
    Object v3 = "OL";
    Object v4 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tFade";
    Object v6 = ((org.jsoup.nodes.Node)v1).removeAttr(((java.lang.String)v5));
    Object v7 = "oint";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendElement(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "upharpoonleft";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).equals(((java.lang.Object)v3));
    Object v5 = "Eopf";
    Object v6 = "D";
    Object v7 = ((org.jsoup.nodes.Element)v1).getElementsByAttributeValue(((java.lang.String)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Barv";
    Object v3 = "OL";
    Object v4 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tFade";
    Object v6 = ((org.jsoup.nodes.Node)v1).removeAttr(((java.lang.String)v5));
    Object v7 = "iota";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "ldquo";
    Object v10 = "hardc";
    Object v11 = ((org.jsoup.nodes.Element)v8).attr(((java.lang.String)v9),((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Barv";
    Object v3 = "OL";
    Object v4 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tFade";
    Object v6 = ((org.jsoup.nodes.Node)v1).removeAttr(((java.lang.String)v5));
    Object v7 = "iota";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).hasText();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "#h";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).id();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "co";
    Object v3 = "Integral";
    Object v4 = ((org.jsoup.nodes.Element)v1).getElementsByAttributeValueMatching(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ">";
    Object v6 = ((org.jsoup.nodes.Element)v1).addClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "upharpoonleft";
    Object v4 = org.jsoup.nodes.Document.createShell(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "#h";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).isBlock();
    Object v9 = ((org.jsoup.nodes.Element)v2).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Barv";
    Object v3 = "OL";
    Object v4 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tFade";
    Object v6 = ((org.jsoup.nodes.Node)v1).removeAttr(((java.lang.String)v5));
    Object v7 = "oint";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendElement(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).lastElementSibling();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "upharpoonleft";
    Object v3 = org.jsoup.nodes.Document.createShell(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).appendChild(((org.jsoup.nodes.Node)v3));
    Object v5 = ">";
    Object v6 = "LeftUpTeeVector";
    Object v7 = ((org.jsoup.nodes.Element)v4).getElementsByAttributeValueNot(((java.lang.String)v5),((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "andand";
    Object v3 = ((org.jsoup.nodes.Element)v1).getElementsByAttributeStarting(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "SoLpf";
    ((org.jsoup.nodes.Document)v1).title(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "COL";
    Object v3 = ((org.jsoup.nodes.Node)v1).absUrl(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "longleftarrow";
    Object v3 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v2));
    Object v4 = "sigmaf";
    Object v5 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v1).prependChild(((org.jsoup.nodes.Node)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).data();
    Object v8 = ((org.jsoup.nodes.Element)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(753707963), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "co";
    Object v3 = "Integral";
    Object v4 = ((org.jsoup.nodes.Element)v1).getElementsByAttributeValueMatching(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ">";
    Object v6 = ((org.jsoup.nodes.Element)v1).addClass(((java.lang.String)v5));
    Object v7 = "gs";
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementById(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "RightFloor";
    Object v3 = ((org.jsoup.nodes.Element)v1).getElementsContainingText(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "angmsd[ad";
    Object v3 = ((org.jsoup.nodes.Element)v1).prependElement(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "Barv";
    Object v3 = "OL";
    Object v4 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = "tFade";
    Object v6 = ((org.jsoup.nodes.Node)v1).removeAttr(((java.lang.String)v5));
    Object v7 = "iota";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).hashCode();
    org.junit.Assert.assertEquals((Object)(-557087454), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "upharpoonleft";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "MediumSpacb";
    Object v3 = "ac";
    Object v4 = ((org.jsoup.nodes.Element)v1).getElementsByAttributeValueEnding(((java.lang.String)v2),((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }
}
