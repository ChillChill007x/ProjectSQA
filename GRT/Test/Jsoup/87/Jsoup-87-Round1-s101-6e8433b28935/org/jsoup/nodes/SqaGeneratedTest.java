package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ".*\\s.*";
    Object v3 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "m";
    Object v3 = java.util.regex.Pattern.compile(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v1).getElementsMatchingOwnText(((java.util.regex.Pattern)v3));
    Object v5 = ((org.jsoup.nodes.Element)v1).ensureChildNodes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "head";
    Object v5 = ((org.jsoup.nodes.Node)v3).wrap(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v3).nextSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = org.jsoup.nodes.Element.preserveWhitespace(((org.jsoup.nodes.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.io.StringWriter();
    Object v5 = 0;
    Object v6 = new org.jsoup.nodes.Document.OutputSettings();
    Object v7 = java.nio.charset.Charset.defaultCharset();
    Object v8 = ((org.jsoup.nodes.Document.OutputSettings)v6).charset(((java.nio.charset.Charset)v7));
    ((org.jsoup.nodes.Element)v3).outerHtmlTail(((java.lang.Appendable)v4),(((java.lang.Integer)v5).intValue()),((org.jsoup.nodes.Document.OutputSettings)v6));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).unwrap();
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).unwrap();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "cAption";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementById(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).dataset();
    Object v5 = ((org.jsoup.nodes.Element)v3).dataset();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "Itd";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "scrit";
    Object v7 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).attributes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).html();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "form";
    Object v5 = ((org.jsoup.nodes.Element)v3).append(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = -13;
    Object v5 = new org.jsoup.nodes.Node[]{null,null};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "hr";
    Object v5 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v4));
    Object v6 = "colgroup";
    Object v7 = ((org.jsoup.nodes.Node)v3).hasAttr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "start";
    Object v5 = org.jsoup.nodes.Document.createShell(((java.lang.String)v4));
    Object v6 = "tr";
    Object v7 = ((org.jsoup.nodes.Element)v5).appendElement(((java.lang.String)v6));
    Object v8 = "hr";
    Object v9 = ((org.jsoup.nodes.Node)v7).removeAttr(((java.lang.String)v8));
    Object v10 = "colgroup";
    Object v11 = ((org.jsoup.nodes.Node)v7).hasAttr(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v3).hasSameValue(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).lastElementSibling();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).data();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{null};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).hasAttributes();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "form";
    Object v5 = ((org.jsoup.nodes.Element)v3).append(((java.lang.String)v4));
    Object v6 = "tf";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependText(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodesCopy();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).previousElementSiblings();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingNodes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "Itd";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "scrit";
    Object v7 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).clearAttributes();
    Object v9 = ((org.jsoup.nodes.Node)v7).previousSibling();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "start";
    Object v5 = org.jsoup.nodes.Document.createShell(((java.lang.String)v4));
    Object v6 = "tr";
    Object v7 = ((org.jsoup.nodes.Element)v5).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v3).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "1";
    Object v5 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "Itd";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "scrit";
    Object v7 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).clearAttributes();
    Object v9 = ((org.jsoup.nodes.Node)v7).previousSibling();
    Object v10 = "start";
    Object v11 = org.jsoup.nodes.Document.createShell(((java.lang.String)v10));
    Object v12 = "tr";
    Object v13 = ((org.jsoup.nodes.Element)v11).appendElement(((java.lang.String)v12));
    Object v14 = "caption";
    ((org.jsoup.nodes.Node)v13).setBaseUri(((java.lang.String)v14));
    Object v15 = null;
    Object v16 = ((org.jsoup.nodes.Element)v9).doClone(((org.jsoup.nodes.Node)v13));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).nodeName();
    Object v6 = ((org.jsoup.nodes.Node)v4).nextSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "Itd";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "scrit";
    Object v7 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).clearAttributes();
    Object v9 = ((org.jsoup.nodes.Node)v7).previousSibling();
    Object v10 = "li";
    Object v11 = ((org.jsoup.nodes.Element)v9).val(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).shallowClone();
    Object v5 = "start";
    Object v6 = org.jsoup.nodes.Document.createShell(((java.lang.String)v5));
    Object v7 = "tr";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendElement(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).lastElementSibling();
    Object v10 = "abs:src";
    Object v11 = ((org.jsoup.nodes.Node)v9).removeAttr(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).toString();
    Object v5 = org.jsoup.nodes.Element.preserveWhitespace(((org.jsoup.nodes.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "form";
    Object v5 = ((org.jsoup.nodes.Element)v3).append(((java.lang.String)v4));
    Object v6 = "start";
    Object v7 = org.jsoup.nodes.Document.createShell(((java.lang.String)v6));
    Object v8 = "tr";
    Object v9 = ((org.jsoup.nodes.Element)v7).appendElement(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v5).after(((org.jsoup.nodes.Node)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).shallowClone();
    Object v5 = "start";
    Object v6 = org.jsoup.nodes.Document.createShell(((java.lang.String)v5));
    Object v7 = "tr";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendElement(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).lastElementSibling();
    Object v10 = "abs:src";
    Object v11 = ((org.jsoup.nodes.Node)v9).removeAttr(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    Object v13 = ((org.jsoup.nodes.Element)v12).siblingElements();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = new java.util.HashSet();
    Object v6 = ((org.jsoup.nodes.Element)v4).classNames(((java.util.Set)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).shallowClone();
    Object v5 = "start";
    Object v6 = org.jsoup.nodes.Document.createShell(((java.lang.String)v5));
    Object v7 = "tr";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendElement(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).lastElementSibling();
    Object v10 = "abs:src";
    Object v11 = ((org.jsoup.nodes.Node)v9).removeAttr(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    Object v13 = ((org.jsoup.nodes.Node)v12).hasParent();
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).shallowClone();
    Object v5 = "start";
    Object v6 = org.jsoup.nodes.Document.createShell(((java.lang.String)v5));
    Object v7 = "tr";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendElement(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).lastElementSibling();
    Object v10 = "abs:src";
    Object v11 = ((org.jsoup.nodes.Node)v9).removeAttr(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    Object v13 = ((org.jsoup.nodes.Node)v12).clearAttributes();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "table";
    Object v5 = ((org.jsoup.nodes.Element)v3).tagName(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v3).nextElementSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).shallowClone();
    Object v5 = "start";
    Object v6 = org.jsoup.nodes.Document.createShell(((java.lang.String)v5));
    Object v7 = "tr";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendElement(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).lastElementSibling();
    Object v10 = "abs:src";
    Object v11 = ((org.jsoup.nodes.Node)v9).removeAttr(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    Object v13 = ((org.jsoup.nodes.Node)v12).clearAttributes();
    Object v14 = ((org.jsoup.nodes.Element)v13).val();
    org.junit.Assert.assertEquals((Object)(""), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "Itd";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "scrit";
    Object v7 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).clearAttributes();
    Object v9 = ((org.jsoup.nodes.Node)v7).previousSibling();
    Object v10 = 1;
    Object v11 = new java.util.HashSet();
    Object v12 = ((org.jsoup.nodes.Element)v9).insertChildren((((java.lang.Integer)v10).intValue()),((java.util.Collection)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "h3";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsByClass(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).shallowClone();
    Object v5 = "start";
    Object v6 = org.jsoup.nodes.Document.createShell(((java.lang.String)v5));
    Object v7 = "tr";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendElement(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).lastElementSibling();
    Object v10 = "abs:src";
    Object v11 = ((org.jsoup.nodes.Node)v9).removeAttr(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    Object v13 = ((org.jsoup.nodes.Node)v12).clearAttributes();
    Object v14 = "UTF-8";
    Object v15 = ((org.jsoup.nodes.Element)v13).getElementById(((java.lang.String)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "form";
    Object v5 = ((org.jsoup.nodes.Element)v3).append(((java.lang.String)v4));
    Object v6 = "tf";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependText(((java.lang.String)v6));
    Object v8 = "im";
    Object v9 = "9";
    Object v10 = ((org.jsoup.nodes.Element)v7).getElementsByAttributeValueMatching(((java.lang.String)v8),((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).shallowClone();
    Object v5 = "start";
    Object v6 = org.jsoup.nodes.Document.createShell(((java.lang.String)v5));
    Object v7 = "tr";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendElement(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).lastElementSibling();
    Object v10 = "abs:src";
    Object v11 = ((org.jsoup.nodes.Node)v9).removeAttr(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    Object v13 = ((org.jsoup.nodes.Node)v12).attributes();
    Object v14 = "start";
    Object v15 = org.jsoup.nodes.Document.createShell(((java.lang.String)v14));
    Object v16 = "tr";
    Object v17 = ((org.jsoup.nodes.Element)v15).appendElement(((java.lang.String)v16));
    Object v18 = ((org.jsoup.nodes.Node)v17).toString();
    Object v19 = org.jsoup.nodes.Element.preserveWhitespace(((org.jsoup.nodes.Node)v17));
    Object v20 = ((org.jsoup.nodes.Node)v12).equals(((java.lang.Object)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "Itd";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "scrit";
    Object v7 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).clearAttributes();
    Object v9 = ((org.jsoup.nodes.Node)v7).previousSibling();
    Object v10 = 1;
    Object v11 = new java.util.HashSet();
    Object v12 = ((org.jsoup.nodes.Element)v9).insertChildren((((java.lang.Integer)v10).intValue()),((java.util.Collection)v11));
    Object v13 = ((org.jsoup.nodes.Node)v12).hasParent();
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).cssSelector();
    org.junit.Assert.assertEquals((Object)("tr"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Element)v4).hasText();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = new java.util.HashSet();
    Object v6 = ((org.jsoup.nodes.Element)v4).classNames(((java.util.Set)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    Object v6 = "header";
    Object v7 = ((org.jsoup.nodes.Element)v5).toggleClass(((java.lang.String)v6));
    Object v8 = new java.io.StringWriter();
    Object v9 = 1;
    Object v10 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v5).outerHtmlTail(((java.lang.Appendable)v8),(((java.lang.Integer)v9).intValue()),((org.jsoup.nodes.Document.OutputSettings)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    Object v6 = 0;
    Object v7 = ((org.jsoup.nodes.Node)v5).childNode((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).siblingNodes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "start";
    Object v5 = org.jsoup.nodes.Document.createShell(((java.lang.String)v4));
    Object v6 = "tr";
    Object v7 = ((org.jsoup.nodes.Element)v5).appendElement(((java.lang.String)v6));
    Object v8 = new java.util.HashSet();
    Object v9 = ((org.jsoup.nodes.Element)v7).classNames(((java.util.Set)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).childNodesCopy();
    Object v11 = ((org.jsoup.nodes.Element)v3).after(((org.jsoup.nodes.Node)v9));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).val();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    Object v6 = "UBLIC";
    Object v7 = ((org.jsoup.nodes.Element)v5).appendElement(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v5).attributes();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    Object v6 = "ti";
    Object v7 = ((org.jsoup.nodes.Element)v5).is(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v5).nextElementSibling();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).shallowClone();
    Object v5 = "start";
    Object v6 = org.jsoup.nodes.Document.createShell(((java.lang.String)v5));
    Object v7 = "tr";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendElement(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).lastElementSibling();
    Object v10 = "abs:src";
    Object v11 = ((org.jsoup.nodes.Node)v9).removeAttr(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    Object v13 = new java.util.HashSet();
    Object v14 = ((org.jsoup.nodes.Element)v12).classNames(((java.util.Set)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodesCopy();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).previousElementSibling();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    Object v6 = "codIe";
    Object v7 = ((org.jsoup.nodes.Element)v5).removeClass(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    Object v6 = 1;
    Object v7 = "start";
    Object v8 = org.jsoup.nodes.Document.createShell(((java.lang.String)v7));
    Object v9 = "tr";
    Object v10 = ((org.jsoup.nodes.Element)v8).appendElement(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).previousSibling();
    Object v12 = ((org.jsoup.nodes.Node)v11).childNodesCopy();
    Object v13 = ((org.jsoup.nodes.Element)v5).insertChildren((((java.lang.Integer)v6).intValue()),((java.util.Collection)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).previousElementSibling();
    Object v7 = "tr";
    Object v8 = ((org.jsoup.nodes.Element)v6).getElementsByTag(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).hasText();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "form";
    Object v5 = ((org.jsoup.nodes.Element)v3).append(((java.lang.String)v4));
    Object v6 = "tf";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependText(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).tagName();
    org.junit.Assert.assertEquals((Object)("tr"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = new java.util.HashSet();
    Object v6 = ((org.jsoup.nodes.Element)v4).classNames(((java.util.Set)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).hasAttributes();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = "start";
    Object v6 = org.jsoup.nodes.Document.createShell(((java.lang.String)v5));
    Object v7 = "tr";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendElement(((java.lang.String)v7));
    Object v9 = new java.util.HashSet();
    Object v10 = ((org.jsoup.nodes.Element)v8).classNames(((java.util.Set)v9));
    Object v11 = ((org.jsoup.nodes.Element)v4).appendChild(((org.jsoup.nodes.Node)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).html();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).shallowClone();
    Object v5 = "start";
    Object v6 = org.jsoup.nodes.Document.createShell(((java.lang.String)v5));
    Object v7 = "tr";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendElement(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).lastElementSibling();
    Object v10 = "abs:src";
    Object v11 = ((org.jsoup.nodes.Node)v9).removeAttr(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    Object v13 = new java.util.HashSet();
    Object v14 = ((org.jsoup.nodes.Element)v12).classNames(((java.util.Set)v13));
    Object v15 = "start";
    Object v16 = org.jsoup.nodes.Document.createShell(((java.lang.String)v15));
    Object v17 = "tr";
    Object v18 = ((org.jsoup.nodes.Element)v16).appendElement(((java.lang.String)v17));
    Object v19 = new java.util.HashSet();
    Object v20 = ((org.jsoup.nodes.Element)v18).classNames(((java.util.Set)v19));
    Object v21 = ((org.jsoup.nodes.Element)v14).appendTo(((org.jsoup.nodes.Element)v20));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "Itd";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "scrit";
    Object v7 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).clearAttributes();
    Object v9 = ((org.jsoup.nodes.Node)v7).previousSibling();
    Object v10 = 1;
    Object v11 = new java.util.HashSet();
    Object v12 = ((org.jsoup.nodes.Element)v9).insertChildren((((java.lang.Integer)v10).intValue()),((java.util.Collection)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).lastElementSibling();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).empty();
    Object v5 = ((org.jsoup.nodes.Element)v3).data();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "Itd";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "scrit";
    Object v7 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).clearAttributes();
    Object v9 = ((org.jsoup.nodes.Node)v7).previousSibling();
    Object v10 = ((org.jsoup.nodes.Element)v9).firstElementSibling();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "form";
    Object v5 = ((org.jsoup.nodes.Element)v3).append(((java.lang.String)v4));
    Object v6 = "tf";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependText(((java.lang.String)v6));
    Object v8 = "html";
    Object v9 = ((org.jsoup.nodes.Node)v7).hasAttr(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).shallowClone();
    Object v5 = "start";
    Object v6 = org.jsoup.nodes.Document.createShell(((java.lang.String)v5));
    Object v7 = "tr";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendElement(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).lastElementSibling();
    Object v10 = "abs:src";
    Object v11 = ((org.jsoup.nodes.Node)v9).removeAttr(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    Object v13 = "UTF-8";
    Object v14 = ((org.jsoup.nodes.Element)v12).hasClass(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).previousElementSibling();
    Object v7 = -61;
    Object v8 = new org.jsoup.nodes.Node[]{};
    Object v9 = ((org.jsoup.nodes.Element)v6).insertChildren((((java.lang.Integer)v7).intValue()),((org.jsoup.nodes.Node[])v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).dataNodes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "Itd";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "scrit";
    Object v7 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).clearAttributes();
    Object v9 = ((org.jsoup.nodes.Node)v7).previousSibling();
    Object v10 = 1;
    Object v11 = new java.util.HashSet();
    Object v12 = ((org.jsoup.nodes.Element)v9).insertChildren((((java.lang.Integer)v10).intValue()),((java.util.Collection)v11));
    Object v13 = "met7a";
    Object v14 = ((org.jsoup.nodes.Element)v12).appendElement(((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "style";
    Object v5 = "html";
    Object v6 = ((org.jsoup.nodes.Element)v3).getElementsByAttributeValueContaining(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v3).attributes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "Itd";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "scrit";
    Object v7 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).clearAttributes();
    Object v9 = ((org.jsoup.nodes.Node)v7).previousSibling();
    Object v10 = 1;
    Object v11 = new java.util.HashSet();
    Object v12 = ((org.jsoup.nodes.Element)v9).insertChildren((((java.lang.Integer)v10).intValue()),((java.util.Collection)v11));
    Object v13 = "met7a";
    Object v14 = ((org.jsoup.nodes.Element)v12).appendElement(((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Element)v14).html();
    org.junit.Assert.assertEquals((Object)(""), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "Itd";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "scrit";
    Object v7 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).clearAttributes();
    Object v9 = ((org.jsoup.nodes.Node)v7).previousSibling();
    Object v10 = 1;
    Object v11 = new java.util.HashSet();
    Object v12 = ((org.jsoup.nodes.Element)v9).insertChildren((((java.lang.Integer)v10).intValue()),((java.util.Collection)v11));
    Object v13 = ((org.jsoup.nodes.Node)v12).previousSibling();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    Object v6 = "he_ght";
    Object v7 = ((org.jsoup.nodes.Element)v5).hasClass(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    Object v6 = "BogusCommet";
    Object v7 = ((org.jsoup.nodes.Node)v5).absUrl(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "start";
    Object v5 = org.jsoup.nodes.Document.createShell(((java.lang.String)v4));
    Object v6 = "tr";
    Object v7 = ((org.jsoup.nodes.Element)v5).appendElement(((java.lang.String)v6));
    Object v8 = new java.util.HashSet();
    Object v9 = ((org.jsoup.nodes.Element)v7).classNames(((java.util.Set)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).childNodesCopy();
    Object v11 = ((org.jsoup.nodes.Element)v3).after(((org.jsoup.nodes.Node)v9));
    Object v12 = ((org.jsoup.nodes.Node)v11).clone();
    Object v13 = "tbo|y";
    Object v14 = ((org.jsoup.nodes.Node)v11).attr(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(""), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v7 = ((org.jsoup.nodes.Element)v6).empty();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "Itd";
    Object v5 = ((org.jsoup.nodes.Element)v3).prependText(((java.lang.String)v4));
    Object v6 = "scrit";
    Object v7 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).clearAttributes();
    Object v9 = ((org.jsoup.nodes.Node)v7).previousSibling();
    Object v10 = ((org.jsoup.nodes.Element)v9).firstElementSibling();
    Object v11 = "table";
    Object v12 = "code";
    Object v13 = ((org.jsoup.nodes.Element)v10).getElementsByAttributeValueStarting(((java.lang.String)v11),((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).shallowClone();
    Object v5 = "start";
    Object v6 = org.jsoup.nodes.Document.createShell(((java.lang.String)v5));
    Object v7 = "tr";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendElement(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).lastElementSibling();
    Object v10 = "abs:src";
    Object v11 = ((org.jsoup.nodes.Node)v9).removeAttr(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    Object v13 = ((org.jsoup.nodes.Node)v12).clearAttributes();
    Object v14 = new java.io.StringWriter();
    Object v15 = Character.valueOf((char)0);
    Object v16 = ((java.lang.Appendable)v14).append((((java.lang.Character)v15).charValue()));
    Object v17 = 0;
    Object v18 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v13).outerHtmlHead(((java.lang.Appendable)v14),(((java.lang.Integer)v17).intValue()),((org.jsoup.nodes.Document.OutputSettings)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = "form";
    Object v5 = ((org.jsoup.nodes.Element)v3).append(((java.lang.String)v4));
    Object v6 = "tf";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependText(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).cssSelector();
    org.junit.Assert.assertEquals((Object)("tr"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).shallowClone();
    Object v5 = "start";
    Object v6 = org.jsoup.nodes.Document.createShell(((java.lang.String)v5));
    Object v7 = "tr";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendElement(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).lastElementSibling();
    Object v10 = "abs:src";
    Object v11 = ((org.jsoup.nodes.Node)v9).removeAttr(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    Object v13 = new java.util.HashSet();
    Object v14 = "start";
    Object v15 = org.jsoup.nodes.Document.createShell(((java.lang.String)v14));
    Object v16 = "tr";
    Object v17 = ((org.jsoup.nodes.Element)v15).appendElement(((java.lang.String)v16));
    Object v18 = new java.util.HashSet();
    Object v19 = ((org.jsoup.nodes.Element)v17).classNames(((java.util.Set)v18));
    Object v20 = ((java.util.Set)v13).equals(((java.lang.Object)v19));
    Object v21 = ((org.jsoup.nodes.Element)v12).classNames(((java.util.Set)v13));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v7 = ":rev%s";
    Object v8 = ((org.jsoup.nodes.Element)v6).val(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).data();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).previousElementSibling();
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v7 = new java.io.StringWriter();
    Object v8 = ((org.jsoup.nodes.Element)v6).html(((java.lang.Appendable)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = new java.util.HashSet();
    Object v6 = ((org.jsoup.nodes.Element)v4).classNames(((java.util.Set)v5));
    Object v7 = "t";
    Object v8 = ((org.jsoup.nodes.Node)v6).removeAttr(((java.lang.String)v7));
    Object v9 = new java.io.StringWriter();
    Object v10 = "start";
    Object v11 = org.jsoup.nodes.Document.createShell(((java.lang.String)v10));
    Object v12 = "tr";
    Object v13 = ((org.jsoup.nodes.Element)v11).appendElement(((java.lang.String)v12));
    Object v14 = new java.util.HashSet();
    Object v15 = ((org.jsoup.nodes.Element)v13).classNames(((java.util.Set)v14));
    Object v16 = "BogusCommet";
    Object v17 = ((org.jsoup.nodes.Node)v15).absUrl(((java.lang.String)v16));
    Object v18 = ((java.lang.Appendable)v9).append(((java.lang.CharSequence)v17));
    Object v19 = ((org.jsoup.nodes.Element)v6).html(((java.lang.Appendable)v9));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v7 = ((org.jsoup.nodes.Element)v6).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).shallowClone();
    Object v5 = "start";
    Object v6 = org.jsoup.nodes.Document.createShell(((java.lang.String)v5));
    Object v7 = "tr";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendElement(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).lastElementSibling();
    Object v10 = "abs:src";
    Object v11 = ((org.jsoup.nodes.Node)v9).removeAttr(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    Object v13 = ((org.jsoup.nodes.Node)v12).clearAttributes();
    Object v14 = "h4";
    Object v15 = ((org.jsoup.nodes.Element)v13).getElementsContainingOwnText(((java.lang.String)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = "tr";
    Object v3 = ((org.jsoup.nodes.Element)v1).appendElement(((java.lang.String)v2));
    Object v4 = new java.util.HashSet();
    Object v5 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v7 = "start";
    Object v8 = org.jsoup.nodes.Document.createShell(((java.lang.String)v7));
    Object v9 = "tr";
    Object v10 = ((org.jsoup.nodes.Element)v8).appendElement(((java.lang.String)v9));
    Object v11 = "start";
    Object v12 = org.jsoup.nodes.Document.createShell(((java.lang.String)v11));
    Object v13 = "tr";
    Object v14 = ((org.jsoup.nodes.Element)v12).appendElement(((java.lang.String)v13));
    Object v15 = new java.util.HashSet();
    Object v16 = ((org.jsoup.nodes.Element)v14).classNames(((java.util.Set)v15));
    Object v17 = ((org.jsoup.nodes.Node)v16).childNodesCopy();
    Object v18 = ((org.jsoup.nodes.Element)v10).after(((org.jsoup.nodes.Node)v16));
    ((org.jsoup.nodes.Node)v6).replaceWith(((org.jsoup.nodes.Node)v18));
    Object v19 = null;
    Object v20 = ((org.jsoup.nodes.Node)v6).previousSibling();
    org.junit.Assert.assertNull(v20);
  }
}
