package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "tfoot";
    Object v4 = "";
    Object v5 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v3),((java.lang.String)v4));
    ((org.jsoup.nodes.Node)v2).removeChild(((org.jsoup.nodes.Node)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "$h";
    Object v4 = ((org.jsoup.nodes.Node)v2).hasAttr(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "colWroup";
    Object v5 = "hgroup";
    Object v6 = "Ascr";
    Object v7 = new java.net.URI(((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v2).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).nodeName();
    org.junit.Assert.assertEquals((Object)("#document"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "tfoot";
    Object v4 = "";
    Object v5 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "tfoot";
    Object v7 = "";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    ((org.jsoup.nodes.Node)v2).replaceChild(((org.jsoup.nodes.Node)v5),((org.jsoup.nodes.Node)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = new java.lang.StringBuilder((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v2).outerHtmlTail(((java.lang.StringBuilder)v4),(((java.lang.Integer)v5).intValue()),((org.jsoup.nodes.Document.OutputSettings)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).siblingNodes();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).nextSibling();
    Object v4 = new org.jsoup.nodes.Node[]{null,null,null};
    ((org.jsoup.nodes.Node)v2).addChildren(((org.jsoup.nodes.Node[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).previousSibling();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 1;
    Object v4 = new java.lang.StringBuilder((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v2).outerHtmlHead(((java.lang.StringBuilder)v4),(((java.lang.Integer)v5).intValue()),((org.jsoup.nodes.Document.OutputSettings)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 5;
    Object v4 = new org.jsoup.nodes.Node[]{null};
    ((org.jsoup.nodes.Node)v2).addChildren((((java.lang.Integer)v3).intValue()),((org.jsoup.nodes.Node[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "div";
    Object v4 = ((org.jsoup.nodes.Node)v2).absUrl(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "tbody";
    Object v4 = ((org.jsoup.nodes.Node)v2).hasAttr(((java.lang.String)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).clone();
    Object v4 = ((org.jsoup.nodes.Node)v2).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = 0;
    Object v4 = new org.jsoup.nodes.Node[]{null};
    ((org.jsoup.nodes.Node)v2).addChildren((((java.lang.Integer)v3).intValue()),((org.jsoup.nodes.Node[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).toString();
    org.junit.Assert.assertEquals((Object)("<html>\n <head></head>\n <body>\n  tfoot\n </body>\n</html>"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = "4html";
    Object v4 = "head";
    Object v5 = ((org.jsoup.nodes.Node)v2).attr(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = "num";
    Object v7 = ((org.jsoup.nodes.Node)v2).hasAttr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(-1536090790), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).previousSibling();
    Object v4 = new org.jsoup.nodes.Node[]{null,null,null};
    ((org.jsoup.nodes.Node)v2).addChildren(((org.jsoup.nodes.Node[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "html";
    Object v6 = "]";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "tfoot";
    Object v9 = "";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).hashCode();
    Object v12 = ((org.jsoup.nodes.Node)v10).ownerDocument();
    ((org.jsoup.nodes.Node)v4).setParentNode(((org.jsoup.nodes.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "tfoot";
    Object v6 = "";
    Object v7 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).hashCode();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    ((org.jsoup.nodes.Node)v4).setParentNode(((org.jsoup.nodes.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).toString();
    Object v6 = 1;
    Object v7 = new java.lang.StringBuilder((((java.lang.Integer)v6).intValue()));
    Object v8 = 28;
    Object v9 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v4).outerHtmlHead(((java.lang.StringBuilder)v7),(((java.lang.Integer)v8).intValue()),((org.jsoup.nodes.Document.OutputSettings)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodes();
    Object v6 = "reals";
    Object v7 = ((org.jsoup.nodes.Node)v4).wrap(((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).nodeName();
    org.junit.Assert.assertEquals((Object)("#document"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = new org.jsoup.nodes.Node[]{null};
    ((org.jsoup.nodes.Node)v4).addChildren(((org.jsoup.nodes.Node[])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "tfoot";
    Object v6 = "";
    Object v7 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).hashCode();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    ((org.jsoup.nodes.Node)v4).removeChild(((org.jsoup.nodes.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "naZv";
    Object v6 = ((org.jsoup.nodes.Node)v4).wrap(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "tfoot";
    Object v6 = "";
    Object v7 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "tfoot";
    Object v9 = "";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).hashCode();
    Object v12 = ((org.jsoup.nodes.Node)v10).ownerDocument();
    ((org.jsoup.nodes.Node)v4).replaceChild(((org.jsoup.nodes.Node)v7),((org.jsoup.nodes.Node)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "K";
    ((org.jsoup.nodes.Node)v4).setBaseUri(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(-1536090790), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "bZdo";
    ((org.jsoup.nodes.Node)v4).setBaseUri(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).hashCode();
    Object v6 = "tfoot";
    Object v7 = "";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).hashCode();
    Object v10 = ((org.jsoup.nodes.Node)v8).ownerDocument();
    Object v11 = ((org.jsoup.nodes.Node)v10).ownerDocument();
    Object v12 = "pplet";
    Object v13 = ((org.jsoup.nodes.Node)v11).removeAttr(((java.lang.String)v12));
    ((org.jsoup.nodes.Node)v4).removeChild(((org.jsoup.nodes.Node)v11));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "TagOpen";
    Object v6 = ((org.jsoup.nodes.Node)v4).before(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "t6able";
    Object v7 = "BogusDoctypK";
    Object v8 = ((org.jsoup.nodes.Node)v5).attr(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = "ht";
    Object v10 = ((org.jsoup.nodes.Node)v5).wrap(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "ocir";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    Object v6 = "tfoot";
    Object v7 = "";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).hashCode();
    Object v10 = ((org.jsoup.nodes.Node)v8).ownerDocument();
    ((org.jsoup.nodes.Node)v4).removeChild(((org.jsoup.nodes.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = new org.jsoup.nodes.Node[]{null,null};
    ((org.jsoup.nodes.Node)v4).addChildren(((org.jsoup.nodes.Node[])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).siblingNodes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = 11;
    Object v7 = new org.jsoup.nodes.Node[]{null};
    ((org.jsoup.nodes.Node)v5).addChildren((((java.lang.Integer)v6).intValue()),((org.jsoup.nodes.Node[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "tfoot";
    Object v7 = "";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).hashCode();
    Object v10 = ((org.jsoup.nodes.Node)v8).ownerDocument();
    Object v11 = ((org.jsoup.nodes.Node)v10).ownerDocument();
    Object v12 = ((org.jsoup.nodes.Node)v5).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = 1;
    Object v6 = new java.lang.StringBuilder((((java.lang.Integer)v5).intValue()));
    Object v7 = Character.valueOf((char)1);
    Object v8 = ((java.lang.StringBuilder)v6).append((((java.lang.Character)v7).charValue()));
    Object v9 = 0;
    Object v10 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v4).outerHtmlHead(((java.lang.StringBuilder)v6),(((java.lang.Integer)v9).intValue()),((org.jsoup.nodes.Document.OutputSettings)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "hemad";
    Object v7 = ((org.jsoup.nodes.Node)v5).attr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "tbody";
    ((org.jsoup.nodes.Node)v4).setBaseUri(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = ((org.jsoup.nodes.Node)v4).nextSibling();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "h6";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "html";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "tfoot";
    Object v6 = "";
    Object v7 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).hashCode();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v9).ownerDocument();
    Object v11 = ((org.jsoup.nodes.Node)v10).previousSibling();
    Object v12 = ((org.jsoup.nodes.Node)v4).after(((org.jsoup.nodes.Node)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodes();
    Object v7 = ((org.jsoup.nodes.Node)v5).nodeName();
    org.junit.Assert.assertEquals((Object)("#document"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(-1536090790), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).nextSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).nodeName();
    org.junit.Assert.assertEquals((Object)("#document"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).baseUri();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = new org.jsoup.nodes.Node[]{null,null,null};
    ((org.jsoup.nodes.Node)v4).addChildren(((org.jsoup.nodes.Node[])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "tfoot";
    Object v6 = "";
    Object v7 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).hashCode();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = new org.jsoup.nodes.Document.OutputSettings();
    Object v7 = ((org.jsoup.nodes.Node)v5).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "tfoot";
    Object v6 = "";
    Object v7 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).hashCode();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v9).ownerDocument();
    ((org.jsoup.nodes.Node)v4).setParentNode(((org.jsoup.nodes.Node)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).previousSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "thead";
    Object v7 = ((org.jsoup.nodes.Node)v5).removeAttr(((java.lang.String)v6));
    Object v8 = "tfoot";
    Object v9 = "";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).hashCode();
    Object v12 = ((org.jsoup.nodes.Node)v10).ownerDocument();
    Object v13 = ((org.jsoup.nodes.Node)v12).ownerDocument();
    ((org.jsoup.nodes.Node)v5).setParentNode(((org.jsoup.nodes.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = 1;
    Object v6 = new java.lang.StringBuilder((((java.lang.Integer)v5).intValue()));
    Object v7 = 0;
    Object v8 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v4).outerHtmlTail(((java.lang.StringBuilder)v6),(((java.lang.Integer)v7).intValue()),((org.jsoup.nodes.Document.OutputSettings)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "font";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).childNodesAsArray();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).previousSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodes();
    Object v6 = "colWroup";
    Object v7 = "hgroup";
    Object v8 = "Ascr";
    Object v9 = new java.net.URI(((java.lang.String)v6),((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "aring";
    Object v7 = ((org.jsoup.nodes.Node)v5).absUrl(((java.lang.String)v6));
    Object v8 = "title";
    Object v9 = ((org.jsoup.nodes.Node)v5).after(((java.lang.String)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "dtd";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = new java.lang.StringBuilder((((java.lang.Integer)v7).intValue()));
    Object v9 = 3;
    Object v10 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v4).outerHtmlTail(((java.lang.StringBuilder)v8),(((java.lang.Integer)v9).intValue()),((org.jsoup.nodes.Document.OutputSettings)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = new org.jsoup.nodes.Node[]{null,null,null};
    ((org.jsoup.nodes.Node)v5).addChildren(((org.jsoup.nodes.Node[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "--";
    ((org.jsoup.nodes.Node)v4).setBaseUri(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "";
    ((org.jsoup.nodes.Node)v4).setBaseUri(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = 2;
    Object v8 = new org.jsoup.nodes.Node[]{null,null};
    ((org.jsoup.nodes.Node)v4).addChildren((((java.lang.Integer)v7).intValue()),((org.jsoup.nodes.Node[])v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "tfoot";
    Object v6 = "";
    Object v7 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).hashCode();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "tfoot";
    Object v12 = "";
    Object v13 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v13).hashCode();
    Object v15 = ((org.jsoup.nodes.Node)v13).ownerDocument();
    Object v16 = "p";
    Object v17 = ((org.jsoup.nodes.Node)v15).removeAttr(((java.lang.String)v16));
    ((org.jsoup.nodes.Node)v10).replaceWith(((org.jsoup.nodes.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "tfoot";
    Object v6 = "";
    Object v7 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).hashCode();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = "tfoot";
    Object v11 = "";
    Object v12 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v10),((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v12).hashCode();
    Object v14 = ((org.jsoup.nodes.Node)v12).ownerDocument();
    Object v15 = "tn";
    ((org.jsoup.nodes.Node)v14).setBaseUri(((java.lang.String)v15));
    Object v16 = null;
    ((org.jsoup.nodes.Node)v4).replaceChild(((org.jsoup.nodes.Node)v9),((org.jsoup.nodes.Node)v14));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).nodeName();
    Object v7 = ((org.jsoup.nodes.Node)v5).outerHtml();
    org.junit.Assert.assertEquals((Object)("<html>\n <head></head>\n <body>\n  tfoot\n </body>\n</html>"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "tfoot";
    Object v7 = "";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).hashCode();
    Object v10 = ((org.jsoup.nodes.Node)v8).ownerDocument();
    Object v11 = ((org.jsoup.nodes.Node)v10).outerHtml();
    Object v12 = "tfoot";
    Object v13 = "";
    Object v14 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Node)v14).hashCode();
    Object v16 = ((org.jsoup.nodes.Node)v14).ownerDocument();
    Object v17 = ((org.jsoup.nodes.Node)v16).ownerDocument();
    ((org.jsoup.nodes.Node)v5).replaceChild(((org.jsoup.nodes.Node)v10),((org.jsoup.nodes.Node)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "tfoot";
    Object v6 = "";
    Object v7 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).hashCode();
    Object v9 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "body";
    Object v12 = ((org.jsoup.nodes.Node)v10).wrap(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v10).siblingNodes();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "rarrpl";
    Object v7 = ((org.jsoup.nodes.Node)v5).absUrl(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "bodB";
    Object v6 = ((org.jsoup.nodes.Node)v4).wrap(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = 1;
    Object v6 = new org.jsoup.nodes.Node[]{};
    ((org.jsoup.nodes.Node)v4).addChildren((((java.lang.Integer)v5).intValue()),((org.jsoup.nodes.Node[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "tcbody";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "t";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "t";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Node)v7).previousSibling();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).siblingNodes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "htm";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = 1;
    Object v7 = new java.lang.StringBuilder((((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v5).outerHtmlHead(((java.lang.StringBuilder)v7),(((java.lang.Integer)v8).intValue()),((org.jsoup.nodes.Document.OutputSettings)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "tfoot";
    Object v7 = "";
    Object v8 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).hashCode();
    Object v10 = ((org.jsoup.nodes.Node)v8).ownerDocument();
    Object v11 = ((org.jsoup.nodes.Node)v10).clone();
    ((org.jsoup.nodes.Node)v5).removeChild(((org.jsoup.nodes.Node)v10));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "r";
    Object v7 = ((org.jsoup.nodes.Node)v5).absUrl(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v5).nextSibling();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "t";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v8 = "th";
    Object v9 = ((org.jsoup.nodes.Node)v7).hasAttr(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).hashCode();
    Object v6 = ((org.jsoup.nodes.Node)v4).nextSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "icI";
    Object v7 = "basue";
    Object v8 = ((org.jsoup.nodes.Node)v5).attr(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v5).nodeName();
    org.junit.Assert.assertEquals((Object)("#document"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "thea";
    Object v8 = ((org.jsoup.nodes.Node)v6).removeAttr(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).attributes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "t";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v8 = "tfoot";
    Object v9 = "";
    Object v10 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).hashCode();
    Object v12 = ((org.jsoup.nodes.Node)v10).ownerDocument();
    Object v13 = ((org.jsoup.nodes.Node)v12).ownerDocument();
    Object v14 = ((org.jsoup.nodes.Node)v13).toString();
    Object v15 = ((org.jsoup.nodes.Node)v7).doClone(((org.jsoup.nodes.Node)v13));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "t";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v8 = 15;
    Object v9 = new org.jsoup.nodes.Node[]{};
    ((org.jsoup.nodes.Node)v7).addChildren((((java.lang.Integer)v8).intValue()),((org.jsoup.nodes.Node[])v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = "html";
    Object v7 = ((org.jsoup.nodes.Node)v5).hasAttr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "t";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "t";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v8 = 1;
    Object v9 = new java.lang.StringBuilder((((java.lang.Integer)v8).intValue()));
    Object v10 = -21;
    Object v11 = new org.jsoup.nodes.Document.OutputSettings();
    Object v12 = ((org.jsoup.nodes.Document.OutputSettings)v11).clone();
    ((org.jsoup.nodes.Node)v7).outerHtmlTail(((java.lang.StringBuilder)v9),(((java.lang.Integer)v10).intValue()),((org.jsoup.nodes.Document.OutputSettings)v11));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "tfoot";
    Object v1 = "";
    Object v2 = org.jsoup.parser.Parser.parseBodyFragment(((java.lang.String)v0),((java.lang.String)v1));
    Object v3 = ((org.jsoup.nodes.Node)v2).hashCode();
    Object v4 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v5 = "t";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Node)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(-1536090790), v8);
  }
}
