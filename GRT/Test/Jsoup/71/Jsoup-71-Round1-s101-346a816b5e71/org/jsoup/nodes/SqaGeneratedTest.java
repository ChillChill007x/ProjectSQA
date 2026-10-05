package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).childNodesCopy();
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).nextElementSibling();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "butt(on";
    Object v3 = ((org.jsoup.nodes.Element)v1).getElementById(((java.lang.String)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = org.jsoup.helper.StringUtil.stringBuilder();
    Object v3 = ((org.jsoup.nodes.Element)v1).html(((java.lang.Appendable)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "tb";
    Object v3 = ((org.jsoup.nodes.Element)v1).getElementById(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).previousElementSibling();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).shallowClone();
    Object v3 = "html";
    Object v4 = ((org.jsoup.nodes.Node)v1).absUrl(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = 27;
    Object v3 = new org.jsoup.nodes.Node[]{null,null};
    Object v4 = ((org.jsoup.nodes.Element)v1).insertChildren((((java.lang.Integer)v2).intValue()),((org.jsoup.nodes.Node[])v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).hasParent();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).html();
    org.junit.Assert.assertEquals((Object)("<html>\n <head></head>\n <body></body>\n</html>"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = "tOble";
    Object v3 = new org.jsoup.nodes.TextNode(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v1).hasSameValue(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).data();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).outerHtml();
    Object v3 = "tOble";
    Object v4 = new org.jsoup.nodes.TextNode(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "xml";
    Object v5 = ((org.jsoup.nodes.Element)v3).is(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).nextSibling();
    Object v7 = 1;
    Object v8 = 22.084427F;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v7).intValue()),(((java.lang.Float)v8).floatValue()));
    Object v10 = java.util.Set.copyOf(((java.util.Collection)v9));
    Object v11 = ((org.jsoup.nodes.Element)v5).classNames(((java.util.Set)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).nextSibling();
    Object v7 = 1;
    Object v8 = 22.084427F;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v7).intValue()),(((java.lang.Float)v8).floatValue()));
    Object v10 = java.util.Set.copyOf(((java.util.Collection)v9));
    Object v11 = ((org.jsoup.nodes.Element)v5).classNames(((java.util.Set)v10));
    Object v12 = "head";
    Object v13 = ((org.jsoup.nodes.Element)v11).prepend(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Element)v11).nextElementSibling();
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = ":";
    ((org.jsoup.nodes.Node)v1).setBaseUri(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).textNodes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).parents();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).nextSibling();
    Object v7 = 1;
    Object v8 = 22.084427F;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v7).intValue()),(((java.lang.Float)v8).floatValue()));
    Object v10 = java.util.Set.copyOf(((java.util.Collection)v9));
    Object v11 = ((org.jsoup.nodes.Element)v5).classNames(((java.util.Set)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).dataNodes();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 22.084427F;
    Object v8 = new java.util.HashSet((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = 1;
    Object v10 = 22.084427F;
    Object v11 = new java.util.HashSet((((java.lang.Integer)v9).intValue()),(((java.lang.Float)v10).floatValue()));
    Object v12 = ((java.util.Set)v8).addAll(((java.util.Collection)v11));
    Object v13 = ((org.jsoup.nodes.Element)v5).classNames(((java.util.Set)v8));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsContainingOwnText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v3).dataset();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "PLAINTEXT";
    Object v5 = ((org.jsoup.nodes.Element)v3).hasClass(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).previousSibling();
    Object v3 = ((org.jsoup.nodes.Node)v1).nextSibling();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).previousElementSibling();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 22.084427F;
    Object v8 = new java.util.HashSet((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = ((org.jsoup.nodes.Element)v5).classNames(((java.util.Set)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v7 = "htNl";
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementById(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v6).siblingElements();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).siblingElements();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "nofram";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsByAttribute(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).nextSibling();
    Object v7 = 1;
    Object v8 = 22.084427F;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v7).intValue()),(((java.lang.Float)v8).floatValue()));
    Object v10 = java.util.Set.copyOf(((java.util.Collection)v9));
    Object v11 = ((org.jsoup.nodes.Element)v5).classNames(((java.util.Set)v10));
    Object v12 = org.jsoup.helper.StringUtil.stringBuilder();
    Object v13 = ((org.jsoup.nodes.Element)v11).html(((java.lang.Appendable)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).nextSibling();
    Object v7 = 1;
    Object v8 = 22.084427F;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v7).intValue()),(((java.lang.Float)v8).floatValue()));
    Object v10 = java.util.Set.copyOf(((java.util.Collection)v9));
    Object v11 = ((org.jsoup.nodes.Element)v5).classNames(((java.util.Set)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = 1;
    Object v3 = 22.084427F;
    Object v4 = new java.util.HashSet((((java.lang.Integer)v2).intValue()),(((java.lang.Float)v3).floatValue()));
    Object v5 = java.util.Set.copyOf(((java.util.Collection)v4));
    Object v6 = ((org.jsoup.nodes.Node)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v7 = ((org.jsoup.nodes.Element)v6).hasText();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).siblingNodes();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).className();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "no";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsMatchingText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v3).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).previousSibling();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).clone();
    Object v3 = ((org.jsoup.nodes.Node)v1).nextSibling();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = "th";
    Object v3 = ((org.jsoup.nodes.Node)v1).hasAttr(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v7 = "option+";
    Object v8 = ((org.jsoup.nodes.Element)v6).hasClass(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).className();
    Object v5 = org.jsoup.helper.StringUtil.stringBuilder();
    Object v6 = ((org.jsoup.nodes.Element)v3).html(((java.lang.Appendable)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = 1;
    Object v3 = 22.084427F;
    Object v4 = new java.util.HashSet((((java.lang.Integer)v2).intValue()),(((java.lang.Float)v3).floatValue()));
    Object v5 = java.util.Set.copyOf(((java.util.Collection)v4));
    Object v6 = ((org.jsoup.nodes.Node)v1).hasSameValue(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).val();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "x";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementById(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    Object v5 = 1;
    Object v6 = 22.084427F;
    Object v7 = new java.util.HashSet((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).clearAttributes();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).append(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v7 = ((org.jsoup.nodes.Element)v6).textNodes();
    Object v8 = "data-";
    Object v9 = ((org.jsoup.nodes.Element)v6).selectFirst(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).siblingElements();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 22.084427F;
    Object v8 = new java.util.HashSet((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = 1;
    Object v10 = 22.084427F;
    Object v11 = new java.util.HashSet((((java.lang.Integer)v9).intValue()),(((java.lang.Float)v10).floatValue()));
    Object v12 = ((java.util.Set)v8).addAll(((java.util.Collection)v11));
    Object v13 = ((org.jsoup.nodes.Element)v5).classNames(((java.util.Set)v8));
    Object v14 = "</";
    Object v15 = ((org.jsoup.nodes.Element)v13).prepend(((java.lang.String)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v7 = "thea:d";
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementsMatchingOwnText(((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = 22.084427F;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = ((org.jsoup.nodes.Element)v6).insertChildren((((java.lang.Integer)v9).intValue()),((java.util.Collection)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).tag();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v7 = "thea:d";
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementsMatchingOwnText(((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = 22.084427F;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = ((org.jsoup.nodes.Element)v6).insertChildren((((java.lang.Integer)v9).intValue()),((java.util.Collection)v12));
    Object v14 = "tfoo";
    Object v15 = ((org.jsoup.nodes.Element)v13).text(((java.lang.String)v14));
    Object v16 = "basep";
    Object v17 = ((org.jsoup.nodes.Element)v13).html(((java.lang.String)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).append(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).outerHtml();
    Object v7 = "Accept-Encoding";
    Object v8 = "code";
    Object v9 = ((org.jsoup.nodes.Element)v5).getElementsByAttributeValueEnding(((java.lang.String)v7),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).append(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodes();
    Object v7 = ((org.jsoup.nodes.Element)v5).parents();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).nextSibling();
    Object v7 = 1;
    Object v8 = 22.084427F;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v7).intValue()),(((java.lang.Float)v8).floatValue()));
    Object v10 = java.util.Set.copyOf(((java.util.Collection)v9));
    Object v11 = ((org.jsoup.nodes.Element)v5).classNames(((java.util.Set)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = java.util.regex.Pattern.compile(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = org.jsoup.Jsoup.parse(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).className();
    Object v11 = ((java.util.regex.Pattern)v5).split(((java.lang.CharSequence)v10));
    Object v12 = ((org.jsoup.nodes.Element)v3).getElementsMatchingText(((java.util.regex.Pattern)v5));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).nextSibling();
    Object v7 = 1;
    Object v8 = 22.084427F;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v7).intValue()),(((java.lang.Float)v8).floatValue()));
    Object v10 = java.util.Set.copyOf(((java.util.Collection)v9));
    Object v11 = ((org.jsoup.nodes.Element)v5).classNames(((java.util.Set)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).dataset();
    Object v13 = ((org.jsoup.nodes.Element)v11).html();
    org.junit.Assert.assertEquals((Object)("<html>\n <head></head>\n <body></body>\n</html>"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v7 = "thea:d";
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementsMatchingOwnText(((java.lang.String)v7));
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = 22.084427F;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = ((org.jsoup.nodes.Element)v6).insertChildren((((java.lang.Integer)v9).intValue()),((java.util.Collection)v12));
    Object v14 = "tfoo";
    Object v15 = ((org.jsoup.nodes.Element)v13).text(((java.lang.String)v14));
    Object v16 = "basep";
    Object v17 = ((org.jsoup.nodes.Element)v13).html(((java.lang.String)v16));
    Object v18 = 10;
    Object v19 = new org.jsoup.nodes.Node[]{null};
    Object v20 = ((org.jsoup.nodes.Element)v17).insertChildren((((java.lang.Integer)v18).intValue()),((org.jsoup.nodes.Node[])v19));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).append(((java.lang.String)v4));
    Object v6 = 0;
    Object v7 = "";
    Object v8 = org.jsoup.Jsoup.parse(((java.lang.String)v7));
    Object v9 = "";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "";
    Object v12 = ((org.jsoup.nodes.Element)v10).toggleClass(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).parents();
    Object v14 = ((org.jsoup.nodes.Element)v5).insertChildren((((java.lang.Integer)v6).intValue()),((java.util.Collection)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementsContainingText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v6).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = ((org.jsoup.nodes.Element)v4).attributes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    Object v5 = 1;
    Object v6 = 22.084427F;
    Object v7 = new java.util.HashSet((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).root();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    Object v5 = 1;
    Object v6 = 22.084427F;
    Object v7 = new java.util.HashSet((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v7));
    Object v9 = "hption";
    Object v10 = ((org.jsoup.nodes.Node)v8).absUrl(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(""), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).append(((java.lang.String)v4));
    Object v6 = "ht[ml";
    Object v7 = ((org.jsoup.nodes.Node)v5).hasAttr(((java.lang.String)v6));
    Object v8 = "tml";
    Object v9 = ((org.jsoup.nodes.Element)v5).before(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    Object v5 = 1;
    Object v6 = 22.084427F;
    Object v7 = new java.util.HashSet((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).root();
    Object v10 = "";
    Object v11 = "version";
    Object v12 = ((org.jsoup.nodes.Element)v9).getElementsByAttributeValueMatching(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v9).nextElementSibling();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = ((org.jsoup.nodes.Element)v4).nextElementSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).baseUri();
    Object v3 = ((org.jsoup.nodes.Node)v1).siblingNodes();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Node)v1).hasAttr(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v1).parentNode();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    Object v5 = 1;
    Object v6 = 22.084427F;
    Object v7 = new java.util.HashSet((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).toString();
    org.junit.Assert.assertEquals((Object)("<html>\n <head></head>\n <body></body>\n</html>"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    Object v5 = 1;
    Object v6 = 22.084427F;
    Object v7 = new java.util.HashSet((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).siblingNodes();
    Object v10 = "link";
    Object v11 = ((org.jsoup.nodes.Element)v8).html(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).addClass(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = org.jsoup.Jsoup.parse(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = "";
    Object v9 = ((org.jsoup.nodes.Element)v7).toggleClass(((java.lang.String)v8));
    Object v10 = 1;
    Object v11 = 22.084427F;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v10).intValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = 1;
    Object v14 = 22.084427F;
    Object v15 = new java.util.HashSet((((java.lang.Integer)v13).intValue()),(((java.lang.Float)v14).floatValue()));
    Object v16 = ((java.util.Set)v12).addAll(((java.util.Collection)v15));
    Object v17 = ((org.jsoup.nodes.Element)v9).classNames(((java.util.Set)v12));
    Object v18 = ((org.jsoup.nodes.Element)v3).prependChild(((org.jsoup.nodes.Node)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).classNames();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).root();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = "b";
    Object v3 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).siblingNodes();
    Object v3 = ((org.jsoup.nodes.Node)v1).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).nextSibling();
    Object v5 = ((org.jsoup.nodes.Element)v3).tagName();
    org.junit.Assert.assertEquals((Object)("#root"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).dataNodes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "th";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = ((org.jsoup.nodes.Element)v4).attributes();
    Object v6 = ((org.jsoup.nodes.Element)v4).tagName();
    org.junit.Assert.assertEquals((Object)("#root"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = 1;
    Object v7 = 22.084427F;
    Object v8 = new java.util.HashSet((((java.lang.Integer)v6).intValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = 1;
    Object v10 = 22.084427F;
    Object v11 = new java.util.HashSet((((java.lang.Integer)v9).intValue()),(((java.lang.Float)v10).floatValue()));
    Object v12 = ((java.util.Set)v8).addAll(((java.util.Collection)v11));
    Object v13 = ((org.jsoup.nodes.Element)v5).classNames(((java.util.Set)v8));
    Object v14 = ((org.jsoup.nodes.Element)v13).cssSelector();
    Object v15 = ((org.jsoup.nodes.Element)v13).textNodes();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).clearAttributes();
    Object v3 = "";
    Object v4 = java.util.regex.Pattern.compile(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v2).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).root();
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = "htm";
    Object v5 = ((org.jsoup.nodes.Node)v2).attr(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = ((org.jsoup.nodes.Element)v4).cssSelector();
    org.junit.Assert.assertEquals((Object)("#root"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    Object v5 = 1;
    Object v6 = 22.084427F;
    Object v7 = new java.util.HashSet((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).hasText();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    Object v5 = 1;
    Object v6 = 22.084427F;
    Object v7 = new java.util.HashSet((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).siblingNodes();
    Object v10 = "link";
    Object v11 = ((org.jsoup.nodes.Element)v8).html(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v11).childNodeSize();
    org.junit.Assert.assertEquals((Object)(1), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = ((org.jsoup.nodes.Node)v4).hasParent();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "head";
    Object v5 = "textarea}";
    Object v6 = ((org.jsoup.nodes.Element)v3).getElementsByAttributeValueNot(((java.lang.String)v4),((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "b";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementById(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "";
    Object v1 = org.jsoup.Jsoup.parse(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v7 = "colgroup";
    Object v8 = ((org.jsoup.nodes.Element)v6).hasClass(((java.lang.String)v7));
    Object v9 = "name";
    Object v10 = ((org.jsoup.nodes.Element)v6).toggleClass(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "tOble";
    Object v1 = new org.jsoup.nodes.TextNode(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).clearAttributes();
    Object v3 = ((org.jsoup.nodes.Node)v2).previousSibling();
    org.junit.Assert.assertNull(v3);
  }
}
