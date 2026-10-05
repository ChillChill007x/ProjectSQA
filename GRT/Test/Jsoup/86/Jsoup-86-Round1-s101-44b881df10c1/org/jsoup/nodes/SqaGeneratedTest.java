package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).previousSibling();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).nextSibling();
    Object v3 = "start";
    Object v4 = org.jsoup.nodes.Document.createShell(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).baseUri();
    Object v4 = ((org.jsoup.nodes.Node)v2).previousSibling();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "start";
    Object v4 = org.jsoup.nodes.Document.createShell(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    Object v6 = "start";
    Object v7 = org.jsoup.nodes.Document.createShell(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v7));
    Object v9 = ((org.jsoup.nodes.Node)v2).hasSameValue(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).previousSibling();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Node)v3).wrap(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    Object v4 = ((org.jsoup.nodes.Node)v2).hasParent();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "capt";
    Object v1 = "tbody";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Comment)v2).toString();
    org.junit.Assert.assertEquals((Object)("\n<!--capt-->"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).previousSibling();
    Object v4 = ((org.jsoup.nodes.Node)v2).clearAttributes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).shallowClone();
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Node)v2).after(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "html";
    Object v4 = ((org.jsoup.nodes.Node)v2).wrap(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "capt";
    Object v1 = "tbody";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Comment)v2).isXmlDeclaration();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).outerHtml();
    Object v5 = ((org.jsoup.nodes.Node)v3).previousSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "capt";
    Object v1 = "tbody";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Comment)v2).asXmlDeclaration();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).nextSibling();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Comment)v2).asXmlDeclaration();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).clearAttributes();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).previousSibling();
    Object v4 = ((org.jsoup.nodes.Node)v2).clearAttributes();
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodesCopy();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v4 = ((org.jsoup.nodes.Node)v2).html(((java.lang.Appendable)v3));
    Object v5 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v6 = 19;
    Object v7 = "start";
    Object v8 = org.jsoup.nodes.Document.createShell(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).ownerDocument();
    Object v10 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v9));
    ((org.jsoup.nodes.Comment)v2).outerHtmlHead(((java.lang.Appendable)v5),(((java.lang.Integer)v6).intValue()),((org.jsoup.nodes.Document.OutputSettings)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).nextSibling();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v3).parentNode();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v4 = Character.valueOf((char)1);
    Object v5 = ((java.lang.Appendable)v3).append((((java.lang.Character)v4).charValue()));
    Object v6 = 1;
    Object v7 = "start";
    Object v8 = org.jsoup.nodes.Document.createShell(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).ownerDocument();
    Object v10 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v9));
    ((org.jsoup.nodes.Comment)v2).outerHtmlHead(((java.lang.Appendable)v3),(((java.lang.Integer)v6).intValue()),((org.jsoup.nodes.Document.OutputSettings)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).shallowClone();
    Object v4 = ((org.jsoup.nodes.Node)v2).outerHtml();
    org.junit.Assert.assertEquals((Object)("\n<!--plaintext-->"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Comment)v2).getData();
    org.junit.Assert.assertEquals((Object)("plaintext"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).previousSibling();
    Object v4 = ((org.jsoup.nodes.Node)v2).siblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v5 = 0;
    Object v6 = "start";
    Object v7 = org.jsoup.nodes.Document.createShell(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v8));
    ((org.jsoup.nodes.Comment)v3).outerHtmlHead(((java.lang.Appendable)v4),(((java.lang.Integer)v5).intValue()),((org.jsoup.nodes.Document.OutputSettings)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).clearAttributes();
    Object v4 = ((org.jsoup.nodes.Node)v3).shallowClone();
    Object v5 = "plaintext";
    Object v6 = "nth-child";
    Object v7 = new org.jsoup.nodes.Comment(((java.lang.String)v5),((java.lang.String)v6));
    ((org.jsoup.nodes.Node)v3).replaceWith(((org.jsoup.nodes.Node)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).childNodesCopy();
    Object v4 = ((org.jsoup.nodes.Node)v2).siblingNodes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = "bZ";
    Object v6 = ((org.jsoup.nodes.Node)v4).wrap(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Comment)v2).asXmlDeclaration();
    Object v4 = ((org.jsoup.nodes.Node)v3).shallowClone();
    Object v5 = "N";
    Object v6 = ((org.jsoup.nodes.Node)v3).wrap(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = "start";
    Object v6 = org.jsoup.nodes.Document.createShell(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Node)v4).after(((org.jsoup.nodes.Node)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "capt";
    Object v1 = "tbody";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Comment)v2).asXmlDeclaration();
    Object v4 = ((org.jsoup.nodes.Node)v3).siblingNodes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = 0;
    Object v4 = ((org.jsoup.nodes.Node)v2).childNode((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.jsoup.nodes.Node)v2).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v6 = ((org.jsoup.nodes.Node)v4).html(((java.lang.Appendable)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).hasParent();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = "plaintext";
    Object v7 = "nth-child";
    Object v8 = new org.jsoup.nodes.Comment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).root();
    Object v10 = ((org.jsoup.nodes.Node)v9).clone();
    Object v11 = ((org.jsoup.nodes.Node)v5).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodes();
    Object v5 = ((org.jsoup.nodes.Comment)v3).toString();
    org.junit.Assert.assertEquals((Object)("\n<!--plaintext-->"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "start";
    Object v4 = org.jsoup.nodes.Document.createShell(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "start";
    Object v7 = org.jsoup.nodes.Document.createShell(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).nextSibling();
    Object v9 = "start";
    Object v10 = org.jsoup.nodes.Document.createShell(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v7).equals(((java.lang.Object)v10));
    Object v12 = ((org.jsoup.nodes.Node)v5).hasSameValue(((java.lang.Object)v11));
    Object v13 = ((org.jsoup.nodes.Node)v2).hasSameValue(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = "tfoot";
    Object v5 = ((org.jsoup.nodes.Node)v3).before(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Comment)v5).isXmlDeclaration();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).parent();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Node)v3).after(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodeSize();
    Object v6 = ((org.jsoup.nodes.Node)v4).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = "plaintext";
    Object v7 = "nth-child";
    Object v8 = new org.jsoup.nodes.Comment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).root();
    Object v10 = ((org.jsoup.nodes.Node)v9).childNodesCopy();
    Object v11 = ((org.jsoup.nodes.Node)v5).hasSameValue(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v5 = -15;
    Object v6 = "start";
    Object v7 = org.jsoup.nodes.Document.createShell(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v8));
    ((org.jsoup.nodes.Comment)v3).outerHtmlHead(((java.lang.Appendable)v4),(((java.lang.Integer)v5).intValue()),((org.jsoup.nodes.Document.OutputSettings)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Comment)v2).asXmlDeclaration();
    Object v4 = "plaintext";
    Object v5 = "nth-child";
    Object v6 = new org.jsoup.nodes.Comment(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).root();
    Object v8 = ((org.jsoup.nodes.Node)v3).hasSameValue(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).clearAttributes();
    Object v4 = "Queue did notmatch expected sequence";
    Object v5 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v3).hasParent();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).parent();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).outerHtml();
    Object v6 = "";
    Object v7 = ((org.jsoup.nodes.Node)v4).wrap(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "caption";
    Object v4 = ((org.jsoup.nodes.Node)v2).before(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).previousSibling();
    Object v7 = ((org.jsoup.nodes.Node)v5).shallowClone();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Comment)v2).asXmlDeclaration();
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).previousSibling();
    Object v7 = ((org.jsoup.nodes.Node)v5).shallowClone();
    Object v8 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v9 = 0;
    Object v10 = "start";
    Object v11 = org.jsoup.nodes.Document.createShell(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).ownerDocument();
    Object v13 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v12));
    ((org.jsoup.nodes.Comment)v7).outerHtmlHead(((java.lang.Appendable)v8),(((java.lang.Integer)v9).intValue()),((org.jsoup.nodes.Document.OutputSettings)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).nextSibling();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).outerHtml();
    org.junit.Assert.assertEquals((Object)("\n<!--plaintext-->"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).clearAttributes();
    Object v4 = "plaintext";
    Object v5 = "nth-child";
    Object v6 = new org.jsoup.nodes.Comment(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).root();
    Object v8 = ((org.jsoup.nodes.Node)v7).clone();
    Object v9 = ((org.jsoup.nodes.Node)v8).root();
    Object v10 = ((org.jsoup.nodes.Comment)v9).isXmlDeclaration();
    Object v11 = ((org.jsoup.nodes.Node)v2).hasSameValue(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "plaintext";
    Object v4 = "nth-child";
    Object v5 = new org.jsoup.nodes.Comment(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).root();
    ((org.jsoup.nodes.Node)v2).replaceWith(((org.jsoup.nodes.Node)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).siblingNodes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).previousSibling();
    Object v7 = ((org.jsoup.nodes.Node)v5).shallowClone();
    Object v8 = ((org.jsoup.nodes.LeafNode)v7).attributes();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v6 = 1;
    Object v7 = "start";
    Object v8 = org.jsoup.nodes.Document.createShell(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).ownerDocument();
    Object v10 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v9));
    ((org.jsoup.nodes.Comment)v4).outerHtmlHead(((java.lang.Appendable)v5),(((java.lang.Integer)v6).intValue()),((org.jsoup.nodes.Document.OutputSettings)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).previousSibling();
    Object v7 = ((org.jsoup.nodes.Node)v5).shallowClone();
    Object v8 = "br";
    Object v9 = ((org.jsoup.nodes.Node)v7).wrap(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).previousSibling();
    Object v7 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).previousSibling();
    Object v7 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v8 = ((org.jsoup.nodes.Node)v7).clearAttributes();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).childNodesCopy();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "start";
    Object v1 = org.jsoup.nodes.Document.createShell(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).previousSibling();
    Object v7 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v8 = ((org.jsoup.nodes.Node)v7).clearAttributes();
    Object v9 = ((org.jsoup.nodes.Node)v8).nodeName();
    Object v10 = ((org.jsoup.nodes.Node)v8).clearAttributes();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).previousSibling();
    Object v7 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v8 = ((org.jsoup.nodes.Node)v7).clearAttributes();
    Object v9 = "plaintext";
    Object v10 = "nth-child";
    Object v11 = new org.jsoup.nodes.Comment(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).root();
    Object v13 = ((org.jsoup.nodes.Node)v12).siblingNodes();
    Object v14 = ((org.jsoup.nodes.Node)v8).hasSameValue(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Comment)v4).getData();
    org.junit.Assert.assertEquals((Object)("plaintext"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).nextSibling();
    Object v7 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).previousSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).previousSibling();
    Object v7 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v8 = ((org.jsoup.nodes.Node)v7).root();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = ((org.jsoup.nodes.Comment)v5).asXmlDeclaration();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).previousSibling();
    Object v7 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v8 = ((org.jsoup.nodes.Node)v7).clearAttributes();
    Object v9 = ((org.jsoup.nodes.Node)v8).ownerDocument();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).nextSibling();
    Object v7 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v8 = ((org.jsoup.nodes.Node)v7).attributes();
    Object v9 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v10 = ((org.jsoup.nodes.Node)v7).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).previousSibling();
    Object v7 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v8 = ((org.jsoup.nodes.Node)v7).root();
    Object v9 = ((org.jsoup.nodes.Node)v8).previousSibling();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).previousSibling();
    Object v7 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v8 = ((org.jsoup.nodes.Node)v7).clearAttributes();
    Object v9 = ((org.jsoup.nodes.Node)v8).nodeName();
    Object v10 = ((org.jsoup.nodes.Node)v8).clearAttributes();
    Object v11 = ((org.jsoup.nodes.Node)v10).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "bodl";
    Object v1 = "</";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = ((org.jsoup.nodes.Node)v5).outerHtml();
    org.junit.Assert.assertEquals((Object)("\n<!--plaintext-->"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).previousSibling();
    Object v7 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v8 = ((org.jsoup.nodes.Node)v7).root();
    Object v9 = ((org.jsoup.nodes.Node)v8).nextSibling();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Comment)v4).isXmlDeclaration();
    Object v6 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v7 = 1;
    Object v8 = "start";
    Object v9 = org.jsoup.nodes.Document.createShell(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).ownerDocument();
    Object v11 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v10));
    Object v12 = ((org.jsoup.nodes.Document.OutputSettings)v11).clone();
    ((org.jsoup.nodes.Comment)v4).outerHtmlHead(((java.lang.Appendable)v6),(((java.lang.Integer)v7).intValue()),((org.jsoup.nodes.Document.OutputSettings)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).nextSibling();
    Object v7 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v8 = org.jsoup.internal.StringUtil.borrowBuilder();
    Object v9 = 1;
    Object v10 = "start";
    Object v11 = org.jsoup.nodes.Document.createShell(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v11).ownerDocument();
    Object v13 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v12));
    ((org.jsoup.nodes.Comment)v7).outerHtmlHead(((java.lang.Appendable)v8),(((java.lang.Integer)v9).intValue()),((org.jsoup.nodes.Document.OutputSettings)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "bodl";
    Object v1 = "</";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "htmT";
    Object v4 = ((org.jsoup.nodes.Node)v2).attr(((java.lang.String)v3));
    Object v5 = "start";
    Object v6 = org.jsoup.nodes.Document.createShell(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = org.jsoup.nodes.NodeUtils.outputSettings(((org.jsoup.nodes.Node)v7));
    Object v9 = ((org.jsoup.nodes.Node)v2).hasSameValue(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Comment)v2).asXmlDeclaration();
    Object v4 = "bodl";
    Object v5 = "</";
    Object v6 = new org.jsoup.nodes.Comment(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v3).after(((org.jsoup.nodes.Node)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "bodl";
    Object v1 = "</";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).nextSibling();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "plaintext";
    Object v1 = "nth-child";
    Object v2 = new org.jsoup.nodes.Comment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v4).root();
    Object v6 = ((org.jsoup.nodes.Node)v5).nextSibling();
    org.junit.Assert.assertNull(v6);
  }
}
