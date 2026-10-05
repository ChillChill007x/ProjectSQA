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
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).getElementsMatchingText(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).previousElementSibling();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).previousSibling();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).empty();
    Object v3 = ((org.jsoup.nodes.Element)v1).previousElementSibling();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(147726542), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "b";
    Object v3 = org.jsoup.Jsoup.parse(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).hashCode();
    Object v5 = ((org.jsoup.nodes.Node)v1).equals(((java.lang.Object)v4));
    Object v6 = ((org.jsoup.nodes.Node)v1).childNodeSize();
    org.junit.Assert.assertEquals((Object)(1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "p";
    Object v3 = ((org.jsoup.nodes.Element)v1).tagName(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).dataNodes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tbody";
    ((org.jsoup.nodes.Node)v1).setBaseUri(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = ((org.jsoup.nodes.Node)v1).siblingNodes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).className();
    Object v3 = ((org.jsoup.nodes.Element)v1).val();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).className();
    Object v9 = ((org.jsoup.nodes.Element)v7).val();
    Object v10 = java.util.Set.of(((java.lang.Object)v9));
    Object v11 = ((org.jsoup.nodes.Element)v5).classNames(((java.util.Set)v10));
    Object v12 = ((org.jsoup.nodes.Element)v5).children();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).toString();
    org.junit.Assert.assertEquals((Object)("<html>\n <head></head>\n <body>\n  b\n </body>\n</html>"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = 6;
    Object v7 = "b";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).className();
    Object v10 = ((org.jsoup.nodes.Element)v8).val();
    Object v11 = java.util.Set.of(((java.lang.Object)v10));
    Object v12 = ((org.jsoup.nodes.Element)v5).insertChildren((((java.lang.Integer)v6).intValue()),((java.util.Collection)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    ((org.jsoup.nodes.Node)v5).remove();
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "colgoup";
    ((org.jsoup.nodes.Node)v5).setBaseUri(((java.lang.String)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).parent();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).siblingNodes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "noframes";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).cssSelector();
    org.junit.Assert.assertEquals((Object)("#root.tr"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodesCopy();
    Object v7 = ((org.jsoup.nodes.Node)v5).childNodesCopy();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).hasText();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).html();
    org.junit.Assert.assertEquals((Object)("<html>\n <head></head>\n <body>\n  b\n </body>\n</html>"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = -50;
    Object v7 = ((org.jsoup.nodes.Element)v5).child((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "b";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).hashCode();
    Object v9 = ((org.jsoup.nodes.Element)v5).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = new java.lang.StringBuilder();
    Object v5 = ((java.lang.StringBuilder)v4).toString();
    Object v6 = -24;
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v3).outerHtmlHead(((java.lang.StringBuilder)v4),(((java.lang.Integer)v6).intValue()),((org.jsoup.nodes.Document.OutputSettings)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).nextSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = new java.lang.StringBuilder();
    Object v8 = ((org.jsoup.nodes.Node)v6).equals(((java.lang.Object)v7));
    Object v9 = "";
    Object v10 = ((org.jsoup.nodes.Node)v6).attr(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(""), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "?r";
    Object v5 = "html";
    Object v6 = ((org.jsoup.nodes.Element)v3).getElementsByAttributeValueNot(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = "";
    Object v8 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).siblingElements();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "noframes";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).nextElementSibling();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "tabNe";
    Object v7 = ((org.jsoup.nodes.Node)v5).hasAttr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Node)v6).childNodesCopy();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Element)v6).previousElementSibling();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "script";
    Object v7 = 1;
    Object v8 = java.util.regex.Pattern.compile(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.jsoup.nodes.Element)v5).getElementsMatchingOwnText(((java.util.regex.Pattern)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).data();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "h";
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementById(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v5).textNodes();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = "html";
    Object v8 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v6).isBlock();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "tab";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = -53;
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = "tr";
    Object v11 = ((org.jsoup.nodes.Element)v9).toggleClass(((java.lang.String)v10));
    Object v12 = "r";
    Object v13 = ((org.jsoup.nodes.Element)v11).val(((java.lang.String)v12));
    Object v14 = "b";
    Object v15 = org.jsoup.Jsoup.parse(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Element)v15).className();
    Object v17 = ((org.jsoup.nodes.Element)v15).val();
    Object v18 = java.util.Set.of(((java.lang.Object)v17));
    Object v19 = ((org.jsoup.nodes.Element)v13).classNames(((java.util.Set)v18));
    Object v20 = ((org.jsoup.nodes.Element)v13).children();
    Object v21 = ((org.jsoup.nodes.Element)v6).insertChildren((((java.lang.Integer)v7).intValue()),((java.util.Collection)v20));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "tab";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).id();
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "tab";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).children();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Node)v6).siblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "ta";
    Object v7 = ((org.jsoup.nodes.Element)v5).toggleClass(((java.lang.String)v6));
    Object v8 = "b";
    Object v9 = ((org.jsoup.nodes.Element)v5).getElementById(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "tab";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = "dh";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementsContainingOwnText(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "noframes";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).cssSelector();
    org.junit.Assert.assertEquals((Object)("#root.tr"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = "hstml";
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementsByClass(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v6).hasText();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = "src";
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementById(((java.lang.String)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).hasText();
    Object v7 = ((org.jsoup.nodes.Element)v5).dataNodes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Element)v6).empty();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "tab";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodesCopy();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = "select";
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementsByClass(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "a";
    Object v7 = ((org.jsoup.nodes.Element)v5).toggleClass(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "noframes";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).nextSibling();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "tab";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).data();
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = "dd";
    Object v8 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = "dd";
    Object v8 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v7));
    Object v9 = org.jsoup.nodes.Element.preserveWhitespace(((org.jsoup.nodes.Node)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "link";
    Object v7 = ((org.jsoup.nodes.Element)v5).getElementsByAttributeStarting(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Element)v6).empty();
    Object v8 = "col";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementsMatchingText(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Element)v5).before(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "a";
    Object v7 = ((org.jsoup.nodes.Element)v5).toggleClass(((java.lang.String)v6));
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = "tr";
    Object v11 = ((org.jsoup.nodes.Element)v9).toggleClass(((java.lang.String)v10));
    Object v12 = "r";
    Object v13 = ((org.jsoup.nodes.Element)v11).val(((java.lang.String)v12));
    Object v14 = "a";
    Object v15 = ((org.jsoup.nodes.Element)v13).toggleClass(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Element)v7).appendChild(((org.jsoup.nodes.Node)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = new java.lang.StringBuilder();
    Object v8 = 0;
    Object v9 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v6).outerHtmlTail(((java.lang.StringBuilder)v7),(((java.lang.Integer)v8).intValue()),((org.jsoup.nodes.Document.OutputSettings)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "tab";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).tagName();
    org.junit.Assert.assertEquals((Object)("#root"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = "dd";
    Object v8 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).nodeName();
    Object v10 = ((org.jsoup.nodes.Node)v8).previousSibling();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Element)v6).empty();
    Object v8 = ((org.jsoup.nodes.Element)v7).nextElementSibling();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "tab";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Element)v6).empty();
    Object v8 = ((org.jsoup.nodes.Element)v7).classNames();
    Object v9 = ((org.jsoup.nodes.Element)v7).hasText();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "tab";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ":contaipns(";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementsMatchingText(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Element)v6).textNodes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).nodeName();
    org.junit.Assert.assertEquals((Object)("#document"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = "html";
    Object v8 = ((org.jsoup.nodes.Node)v6).attr(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Element)v6).empty();
    Object v8 = ((org.jsoup.nodes.Element)v7).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "noframes";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).html();
    org.junit.Assert.assertEquals((Object)("<html>\n <head></head>\n <body>\n  b\n </body>\n</html>"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Element)v6).empty();
    Object v8 = 25;
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = "tr";
    Object v12 = ((org.jsoup.nodes.Element)v10).toggleClass(((java.lang.String)v11));
    Object v13 = "r";
    Object v14 = ((org.jsoup.nodes.Element)v12).val(((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Node)v14).ownerDocument();
    Object v16 = ((org.jsoup.nodes.Node)v15).childNodesCopy();
    Object v17 = ((org.jsoup.nodes.Element)v7).insertChildren((((java.lang.Integer)v8).intValue()),((java.util.Collection)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "a";
    Object v7 = ((org.jsoup.nodes.Element)v5).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).id();
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "tab";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Element)v6).empty();
    Object v8 = ((org.jsoup.nodes.Element)v7).dataNodes();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "tab";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = "tr";
    Object v11 = ((org.jsoup.nodes.Element)v9).toggleClass(((java.lang.String)v10));
    Object v12 = "r";
    Object v13 = ((org.jsoup.nodes.Element)v11).val(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v13).ownerDocument();
    Object v15 = "dd";
    Object v16 = ((org.jsoup.nodes.Element)v14).val(((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Element)v7).after(((org.jsoup.nodes.Node)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "tab";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "a";
    Object v7 = ((org.jsoup.nodes.Element)v5).toggleClass(((java.lang.String)v6));
    Object v8 = new java.lang.StringBuilder();
    Object v9 = -8;
    Object v10 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v7).outerHtmlTail(((java.lang.StringBuilder)v8),(((java.lang.Integer)v9).intValue()),((org.jsoup.nodes.Document.OutputSettings)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "a";
    Object v7 = ((org.jsoup.nodes.Element)v5).toggleClass(((java.lang.String)v6));
    Object v8 = "b";
    Object v9 = org.jsoup.Jsoup.parse(((java.lang.String)v8));
    Object v10 = "tr";
    Object v11 = ((org.jsoup.nodes.Element)v9).toggleClass(((java.lang.String)v10));
    Object v12 = "r";
    Object v13 = ((org.jsoup.nodes.Element)v11).val(((java.lang.String)v12));
    Object v14 = "tab";
    Object v15 = ((org.jsoup.nodes.Element)v13).val(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Node)v15).ownerDocument();
    Object v17 = ((org.jsoup.nodes.Element)v7).prependChild(((org.jsoup.nodes.Node)v16));
    Object v18 = ((org.jsoup.nodes.Element)v7).ownText();
    org.junit.Assert.assertEquals((Object)(""), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "tab";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = ((org.jsoup.nodes.Node)v8).siblingNodes();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = "dd";
    Object v8 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v7));
    Object v9 = "colgrkoup";
    Object v10 = ((org.jsoup.nodes.Element)v8).hasClass(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "tab";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = "b";
    Object v10 = org.jsoup.Jsoup.parse(((java.lang.String)v9));
    Object v11 = "tr";
    Object v12 = ((org.jsoup.nodes.Element)v10).toggleClass(((java.lang.String)v11));
    Object v13 = "r";
    Object v14 = ((org.jsoup.nodes.Element)v12).val(((java.lang.String)v13));
    Object v15 = "noframes";
    Object v16 = ((org.jsoup.nodes.Node)v14).removeAttr(((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Element)v8).before(((org.jsoup.nodes.Node)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "tab";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = new java.lang.StringBuilder();
    Object v9 = 0;
    Object v10 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v7).outerHtmlHead(((java.lang.StringBuilder)v8),(((java.lang.Integer)v9).intValue()),((org.jsoup.nodes.Document.OutputSettings)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Element)v6).empty();
    Object v8 = org.jsoup.nodes.Element.preserveWhitespace(((org.jsoup.nodes.Node)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = "a";
    Object v7 = ((org.jsoup.nodes.Element)v5).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Node)v6).outerHtml();
    org.junit.Assert.assertEquals((Object)("<html>\n <head></head>\n <body>\n  b\n </body>\n</html>"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = "dd";
    Object v8 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v7));
    Object v9 = "g";
    Object v10 = ((org.jsoup.nodes.Element)v8).html(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "b";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).toggleClass(((java.lang.String)v2));
    Object v4 = "r";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = "htm";
    Object v8 = ((org.jsoup.nodes.Element)v6).select(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }
}
