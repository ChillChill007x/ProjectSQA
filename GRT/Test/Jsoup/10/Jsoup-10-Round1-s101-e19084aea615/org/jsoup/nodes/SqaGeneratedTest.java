package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = new org.jsoup.nodes.Node[]{null,null,null};
    ((org.jsoup.nodes.Node)v4).addChildren(((org.jsoup.nodes.Node[])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nodeName();
    org.junit.Assert.assertEquals((Object)("xodot"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(366280814), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    ((org.jsoup.nodes.Node)v4).removeChild(((org.jsoup.nodes.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nodeName();
    Object v6 = "loparc";
    Object v7 = new java.lang.StringBuilder(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    ((org.jsoup.nodes.Node)v4).remove();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).outerHtml();
    Object v6 = "xodot";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = "lowst";
    Object v9 = new org.jsoup.nodes.Attributes();
    Object v10 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v7),((java.lang.String)v8),((org.jsoup.nodes.Attributes)v9));
    Object v11 = "xodot";
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v11));
    Object v13 = "lowst";
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v12),((java.lang.String)v13),((org.jsoup.nodes.Attributes)v14));
    Object v16 = ((org.jsoup.nodes.Node)v15).clone();
    ((org.jsoup.nodes.Node)v4).replaceChild(((org.jsoup.nodes.Node)v10),((org.jsoup.nodes.Node)v15));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).nextSibling();
    ((org.jsoup.nodes.Node)v4).removeChild(((org.jsoup.nodes.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).outerHtml();
    org.junit.Assert.assertEquals((Object)("<xodot></xodot>"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = "xodot";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "lowst";
    Object v13 = new org.jsoup.nodes.Attributes();
    Object v14 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12),((org.jsoup.nodes.Attributes)v13));
    ((org.jsoup.nodes.Node)v4).replaceChild(((org.jsoup.nodes.Node)v9),((org.jsoup.nodes.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = new org.jsoup.nodes.Node[]{null,null};
    ((org.jsoup.nodes.Node)v4).addChildren(((org.jsoup.nodes.Node[])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "/>";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).toString();
    Object v6 = "loparc";
    Object v7 = new java.lang.StringBuilder(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "!";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).siblingIndex();
    Object v12 = "Sacute";
    Object v13 = ((org.jsoup.nodes.Node)v10).attr(((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(""), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).outerHtml();
    org.junit.Assert.assertEquals((Object)("\n<xodot></xodot>"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).siblingIndex();
    Object v12 = "loparc";
    Object v13 = new java.lang.StringBuilder(((java.lang.String)v12));
    ((org.jsoup.nodes.Node)v10).outerHtml(((java.lang.StringBuilder)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodesAsArray();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = 0;
    Object v12 = ((org.jsoup.nodes.Node)v10).childNode((((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).hashCode();
    org.junit.Assert.assertEquals((Object)(174824796), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).childNodes();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).nextSibling();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "xodot";
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v11));
    Object v13 = "lowst";
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v12),((java.lang.String)v13),((org.jsoup.nodes.Attributes)v14));
    Object v16 = "xodot";
    Object v17 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v16));
    Object v18 = "lowst";
    Object v19 = new org.jsoup.nodes.Attributes();
    Object v20 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v17),((java.lang.String)v18),((org.jsoup.nodes.Attributes)v19));
    Object v21 = ((org.jsoup.nodes.Node)v15).doClone(((org.jsoup.nodes.Node)v20));
    Object v22 = ((org.jsoup.nodes.Node)v10).doClone(((org.jsoup.nodes.Node)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "xodot";
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v11));
    Object v13 = "lowst";
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v12),((java.lang.String)v13),((org.jsoup.nodes.Attributes)v14));
    Object v16 = "xodot";
    Object v17 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v16));
    Object v18 = "lowst";
    Object v19 = new org.jsoup.nodes.Attributes();
    Object v20 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v17),((java.lang.String)v18),((org.jsoup.nodes.Attributes)v19));
    Object v21 = ((org.jsoup.nodes.Node)v15).doClone(((org.jsoup.nodes.Node)v20));
    Object v22 = "xodot";
    Object v23 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v22));
    Object v24 = "lowst";
    Object v25 = new org.jsoup.nodes.Attributes();
    Object v26 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v23),((java.lang.String)v24),((org.jsoup.nodes.Attributes)v25));
    Object v27 = "xodot";
    Object v28 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v27));
    Object v29 = "lowst";
    Object v30 = new org.jsoup.nodes.Attributes();
    Object v31 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v28),((java.lang.String)v29),((org.jsoup.nodes.Attributes)v30));
    Object v32 = ((org.jsoup.nodes.Node)v26).doClone(((org.jsoup.nodes.Node)v31));
    Object v33 = ((org.jsoup.nodes.Node)v21).doClone(((org.jsoup.nodes.Node)v32));
    ((org.jsoup.nodes.Node)v10).setParentNode(((org.jsoup.nodes.Node)v33));
    Object v34 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "xodot";
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v11));
    Object v13 = "lowst";
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v12),((java.lang.String)v13),((org.jsoup.nodes.Attributes)v14));
    Object v16 = "xodot";
    Object v17 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v16));
    Object v18 = "lowst";
    Object v19 = new org.jsoup.nodes.Attributes();
    Object v20 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v17),((java.lang.String)v18),((org.jsoup.nodes.Attributes)v19));
    Object v21 = ((org.jsoup.nodes.Node)v15).doClone(((org.jsoup.nodes.Node)v20));
    Object v22 = ((org.jsoup.nodes.Node)v10).doClone(((org.jsoup.nodes.Node)v21));
    Object v23 = ((org.jsoup.nodes.Node)v22).previousSibling();
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).clone();
    Object v12 = ((org.jsoup.nodes.Node)v10).hashCode();
    org.junit.Assert.assertEquals((Object)(174824796), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).outerHtml();
    Object v12 = 2;
    Object v13 = new org.jsoup.nodes.Node[]{};
    ((org.jsoup.nodes.Node)v10).addChildren((((java.lang.Integer)v12).intValue()),((org.jsoup.nodes.Node[])v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "xodot";
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v11));
    Object v13 = "lowst";
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v12),((java.lang.String)v13),((org.jsoup.nodes.Attributes)v14));
    Object v16 = "xodot";
    Object v17 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v16));
    Object v18 = "lowst";
    Object v19 = new org.jsoup.nodes.Attributes();
    Object v20 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v17),((java.lang.String)v18),((org.jsoup.nodes.Attributes)v19));
    Object v21 = ((org.jsoup.nodes.Node)v15).doClone(((org.jsoup.nodes.Node)v20));
    Object v22 = ((org.jsoup.nodes.Node)v10).doClone(((org.jsoup.nodes.Node)v21));
    Object v23 = ((org.jsoup.nodes.Node)v22).siblingNodes();
    Object v24 = ((org.jsoup.nodes.Node)v22).previousSibling();
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).parent();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "xodot";
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v11));
    Object v13 = "lowst";
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v12),((java.lang.String)v13),((org.jsoup.nodes.Attributes)v14));
    Object v16 = "xodot";
    Object v17 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v16));
    Object v18 = "lowst";
    Object v19 = new org.jsoup.nodes.Attributes();
    Object v20 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v17),((java.lang.String)v18),((org.jsoup.nodes.Attributes)v19));
    Object v21 = ((org.jsoup.nodes.Node)v15).doClone(((org.jsoup.nodes.Node)v20));
    ((org.jsoup.nodes.Node)v10).setParentNode(((org.jsoup.nodes.Node)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "xodot";
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v11));
    Object v13 = "lowst";
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v12),((java.lang.String)v13),((org.jsoup.nodes.Attributes)v14));
    Object v16 = "xodot";
    Object v17 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v16));
    Object v18 = "lowst";
    Object v19 = new org.jsoup.nodes.Attributes();
    Object v20 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v17),((java.lang.String)v18),((org.jsoup.nodes.Attributes)v19));
    Object v21 = ((org.jsoup.nodes.Node)v15).doClone(((org.jsoup.nodes.Node)v20));
    Object v22 = ((org.jsoup.nodes.Node)v10).doClone(((org.jsoup.nodes.Node)v21));
    Object v23 = 28;
    Object v24 = new org.jsoup.nodes.Node[]{};
    ((org.jsoup.nodes.Node)v22).addChildren((((java.lang.Integer)v23).intValue()),((org.jsoup.nodes.Node[])v24));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "loparc";
    Object v12 = new java.lang.StringBuilder(((java.lang.String)v11));
    ((org.jsoup.nodes.Node)v10).outerHtml(((java.lang.StringBuilder)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = new org.jsoup.nodes.Node[]{null};
    ((org.jsoup.nodes.Node)v10).addChildren(((org.jsoup.nodes.Node[])v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "xodot";
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v11));
    Object v13 = "lowst";
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v12),((java.lang.String)v13),((org.jsoup.nodes.Attributes)v14));
    Object v16 = "xodot";
    Object v17 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v16));
    Object v18 = "lowst";
    Object v19 = new org.jsoup.nodes.Attributes();
    Object v20 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v17),((java.lang.String)v18),((org.jsoup.nodes.Attributes)v19));
    Object v21 = ((org.jsoup.nodes.Node)v15).doClone(((org.jsoup.nodes.Node)v20));
    Object v22 = ((org.jsoup.nodes.Node)v10).doClone(((org.jsoup.nodes.Node)v21));
    Object v23 = ((org.jsoup.nodes.Node)v22).nodeName();
    org.junit.Assert.assertEquals((Object)("xodot"), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "xodot";
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v11));
    Object v13 = "lowst";
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v12),((java.lang.String)v13),((org.jsoup.nodes.Attributes)v14));
    Object v16 = "xodot";
    Object v17 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v16));
    Object v18 = "lowst";
    Object v19 = new org.jsoup.nodes.Attributes();
    Object v20 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v17),((java.lang.String)v18),((org.jsoup.nodes.Attributes)v19));
    Object v21 = ((org.jsoup.nodes.Node)v15).doClone(((org.jsoup.nodes.Node)v20));
    Object v22 = ((org.jsoup.nodes.Node)v10).doClone(((org.jsoup.nodes.Node)v21));
    Object v23 = ((org.jsoup.nodes.Node)v22).nextSibling();
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).nodeName();
    org.junit.Assert.assertEquals((Object)("xodot"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = "";
    Object v13 = ((org.jsoup.nodes.Node)v11).attr(((java.lang.String)v12));
    Object v14 = 1;
    ((org.jsoup.nodes.Node)v11).setSiblingIndex((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).nodeName();
    Object v12 = "xodot";
    Object v13 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v12));
    Object v14 = "lowst";
    Object v15 = new org.jsoup.nodes.Attributes();
    Object v16 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v13),((java.lang.String)v14),((org.jsoup.nodes.Attributes)v15));
    Object v17 = "xodot";
    Object v18 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v17));
    Object v19 = "lowst";
    Object v20 = new org.jsoup.nodes.Attributes();
    Object v21 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v18),((java.lang.String)v19),((org.jsoup.nodes.Attributes)v20));
    Object v22 = ((org.jsoup.nodes.Node)v16).doClone(((org.jsoup.nodes.Node)v21));
    ((org.jsoup.nodes.Node)v10).setParentNode(((org.jsoup.nodes.Node)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = ((org.jsoup.nodes.Node)v11).hashCode();
    Object v13 = ((org.jsoup.nodes.Node)v11).clone();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = "xodot";
    Object v13 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v12));
    Object v14 = "lowst";
    Object v15 = new org.jsoup.nodes.Attributes();
    Object v16 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v13),((java.lang.String)v14),((org.jsoup.nodes.Attributes)v15));
    Object v17 = "xodot";
    Object v18 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v17));
    Object v19 = "lowst";
    Object v20 = new org.jsoup.nodes.Attributes();
    Object v21 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v18),((java.lang.String)v19),((org.jsoup.nodes.Attributes)v20));
    Object v22 = ((org.jsoup.nodes.Node)v16).doClone(((org.jsoup.nodes.Node)v21));
    Object v23 = ((org.jsoup.nodes.Node)v22).parent();
    ((org.jsoup.nodes.Node)v11).removeChild(((org.jsoup.nodes.Node)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = ((org.jsoup.nodes.Node)v11).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = ((org.jsoup.nodes.Node)v11).hashCode();
    Object v13 = ((org.jsoup.nodes.Node)v11).clone();
    Object v14 = ((org.jsoup.nodes.Node)v13).toString();
    Object v15 = ((org.jsoup.nodes.Node)v13).toString();
    org.junit.Assert.assertEquals((Object)("<xodot></xodot>"), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = "n6earr";
    Object v13 = ((org.jsoup.nodes.Node)v11).absUrl(((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(""), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = ((org.jsoup.nodes.Node)v11).hashCode();
    Object v13 = ((org.jsoup.nodes.Node)v11).clone();
    Object v14 = ((org.jsoup.nodes.Node)v13).nodeName();
    org.junit.Assert.assertEquals((Object)("xodot"), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = ((org.jsoup.nodes.Node)v11).nodeName();
    org.junit.Assert.assertEquals((Object)("xodot"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = "";
    Object v13 = ((org.jsoup.nodes.Node)v11).attr(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v11).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).ownerDocument();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = ((org.jsoup.nodes.Node)v11).hashCode();
    Object v13 = ((org.jsoup.nodes.Node)v11).clone();
    Object v14 = ">";
    Object v15 = ((org.jsoup.nodes.Node)v13).removeAttr(((java.lang.String)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = ((org.jsoup.nodes.Node)v11).hashCode();
    Object v13 = ((org.jsoup.nodes.Node)v11).clone();
    Object v14 = "minus";
    Object v15 = ((org.jsoup.nodes.Node)v13).absUrl(((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(""), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = ((org.jsoup.nodes.Node)v11).clone();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = "xodot";
    Object v13 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v12));
    Object v14 = "lowst";
    Object v15 = new org.jsoup.nodes.Attributes();
    Object v16 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v13),((java.lang.String)v14),((org.jsoup.nodes.Attributes)v15));
    Object v17 = "xodot";
    Object v18 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v17));
    Object v19 = "lowst";
    Object v20 = new org.jsoup.nodes.Attributes();
    Object v21 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v18),((java.lang.String)v19),((org.jsoup.nodes.Attributes)v20));
    Object v22 = ((org.jsoup.nodes.Node)v16).doClone(((org.jsoup.nodes.Node)v21));
    Object v23 = ((org.jsoup.nodes.Node)v22).parent();
    Object v24 = ((org.jsoup.nodes.Node)v23).clone();
    Object v25 = ((org.jsoup.nodes.Node)v11).doClone(((org.jsoup.nodes.Node)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = "ufr";
    Object v13 = ((org.jsoup.nodes.Node)v11).absUrl(((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(""), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = 0;
    ((org.jsoup.nodes.Node)v11).setSiblingIndex((((java.lang.Integer)v12).intValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).ownerDocument();
    Object v12 = ((org.jsoup.nodes.Node)v10).nodeName();
    org.junit.Assert.assertEquals((Object)("xodot"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = ((org.jsoup.nodes.Node)v11).childNodes();
    Object v13 = "impNd";
    Object v14 = ((org.jsoup.nodes.Node)v11).attr(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(""), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = "xodot";
    Object v13 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v12));
    Object v14 = "lowst";
    Object v15 = new org.jsoup.nodes.Attributes();
    Object v16 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v13),((java.lang.String)v14),((org.jsoup.nodes.Attributes)v15));
    Object v17 = "xodot";
    Object v18 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v17));
    Object v19 = "lowst";
    Object v20 = new org.jsoup.nodes.Attributes();
    Object v21 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v18),((java.lang.String)v19),((org.jsoup.nodes.Attributes)v20));
    Object v22 = ((org.jsoup.nodes.Node)v16).doClone(((org.jsoup.nodes.Node)v21));
    Object v23 = ((org.jsoup.nodes.Node)v22).nodeName();
    Object v24 = ((org.jsoup.nodes.Node)v11).equals(((java.lang.Object)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = "U";
    Object v13 = "ItildeB";
    Object v14 = ((org.jsoup.nodes.Node)v11).attr(((java.lang.String)v12),((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = "U";
    Object v13 = "ItildeB";
    Object v14 = ((org.jsoup.nodes.Node)v11).attr(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "xodot";
    Object v16 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v15));
    Object v17 = "lowst";
    Object v18 = new org.jsoup.nodes.Attributes();
    Object v19 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v16),((java.lang.String)v17),((org.jsoup.nodes.Attributes)v18));
    Object v20 = "xodot";
    Object v21 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v20));
    Object v22 = "lowst";
    Object v23 = new org.jsoup.nodes.Attributes();
    Object v24 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v21),((java.lang.String)v22),((org.jsoup.nodes.Attributes)v23));
    Object v25 = ((org.jsoup.nodes.Node)v19).doClone(((org.jsoup.nodes.Node)v24));
    ((org.jsoup.nodes.Node)v14).setParentNode(((org.jsoup.nodes.Node)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = ((org.jsoup.nodes.Node)v11).hashCode();
    Object v13 = ((org.jsoup.nodes.Node)v11).clone();
    Object v14 = new org.jsoup.nodes.Node[]{null,null,null};
    ((org.jsoup.nodes.Node)v13).addChildren(((org.jsoup.nodes.Node[])v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = "U";
    Object v13 = "ItildeB";
    Object v14 = ((org.jsoup.nodes.Node)v11).attr(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "es";
    Object v16 = ((org.jsoup.nodes.Node)v14).absUrl(((java.lang.String)v15));
    org.junit.Assert.assertEquals((Object)(""), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = ((org.jsoup.nodes.Node)v11).attributes();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = "xodot";
    Object v13 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v12));
    Object v14 = "lowst";
    Object v15 = new org.jsoup.nodes.Attributes();
    Object v16 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v13),((java.lang.String)v14),((org.jsoup.nodes.Attributes)v15));
    Object v17 = "xodot";
    Object v18 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v17));
    Object v19 = "lowst";
    Object v20 = new org.jsoup.nodes.Attributes();
    Object v21 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v18),((java.lang.String)v19),((org.jsoup.nodes.Attributes)v20));
    Object v22 = ((org.jsoup.nodes.Node)v16).doClone(((org.jsoup.nodes.Node)v21));
    Object v23 = ((org.jsoup.nodes.Node)v22).parent();
    Object v24 = ((org.jsoup.nodes.Node)v23).clone();
    Object v25 = ((org.jsoup.nodes.Node)v11).doClone(((org.jsoup.nodes.Node)v24));
    Object v26 = -8;
    Object v27 = new org.jsoup.nodes.Node[]{};
    ((org.jsoup.nodes.Node)v25).addChildren((((java.lang.Integer)v26).intValue()),((org.jsoup.nodes.Node[])v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = ((org.jsoup.nodes.Node)v11).hashCode();
    Object v13 = ((org.jsoup.nodes.Node)v11).clone();
    Object v14 = "RightUpVectorBa";
    Object v15 = ((org.jsoup.nodes.Node)v13).attr(((java.lang.String)v14));
    org.junit.Assert.assertEquals((Object)(""), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = ((org.jsoup.nodes.Node)v11).hashCode();
    org.junit.Assert.assertEquals((Object)(366280814), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = 1;
    Object v13 = new org.jsoup.nodes.Node[]{null};
    ((org.jsoup.nodes.Node)v11).addChildren((((java.lang.Integer)v12).intValue()),((org.jsoup.nodes.Node[])v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "xodot";
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v11));
    Object v13 = "lowst";
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v12),((java.lang.String)v13),((org.jsoup.nodes.Attributes)v14));
    Object v16 = "xodot";
    Object v17 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v16));
    Object v18 = "lowst";
    Object v19 = new org.jsoup.nodes.Attributes();
    Object v20 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v17),((java.lang.String)v18),((org.jsoup.nodes.Attributes)v19));
    Object v21 = ((org.jsoup.nodes.Node)v15).doClone(((org.jsoup.nodes.Node)v20));
    Object v22 = ((org.jsoup.nodes.Node)v10).doClone(((org.jsoup.nodes.Node)v21));
    Object v23 = "xodot";
    Object v24 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v23));
    Object v25 = "lowst";
    Object v26 = new org.jsoup.nodes.Attributes();
    Object v27 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v24),((java.lang.String)v25),((org.jsoup.nodes.Attributes)v26));
    Object v28 = "xodot";
    Object v29 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v28));
    Object v30 = "lowst";
    Object v31 = new org.jsoup.nodes.Attributes();
    Object v32 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v29),((java.lang.String)v30),((org.jsoup.nodes.Attributes)v31));
    Object v33 = ((org.jsoup.nodes.Node)v27).doClone(((org.jsoup.nodes.Node)v32));
    Object v34 = ((org.jsoup.nodes.Node)v33).parent();
    ((org.jsoup.nodes.Node)v22).replaceWith(((org.jsoup.nodes.Node)v34));
    Object v35 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = "xodot";
    Object v13 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v12));
    Object v14 = "lowst";
    Object v15 = new org.jsoup.nodes.Attributes();
    Object v16 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v13),((java.lang.String)v14),((org.jsoup.nodes.Attributes)v15));
    Object v17 = "xodot";
    Object v18 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v17));
    Object v19 = "lowst";
    Object v20 = new org.jsoup.nodes.Attributes();
    Object v21 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v18),((java.lang.String)v19),((org.jsoup.nodes.Attributes)v20));
    Object v22 = ((org.jsoup.nodes.Node)v16).doClone(((org.jsoup.nodes.Node)v21));
    Object v23 = ((org.jsoup.nodes.Node)v22).parent();
    Object v24 = ((org.jsoup.nodes.Node)v23).clone();
    Object v25 = ((org.jsoup.nodes.Node)v11).doClone(((org.jsoup.nodes.Node)v24));
    Object v26 = ((org.jsoup.nodes.Node)v25).ownerDocument();
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "xodot";
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v11));
    Object v13 = "lowst";
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v12),((java.lang.String)v13),((org.jsoup.nodes.Attributes)v14));
    Object v16 = "xodot";
    Object v17 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v16));
    Object v18 = "lowst";
    Object v19 = new org.jsoup.nodes.Attributes();
    Object v20 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v17),((java.lang.String)v18),((org.jsoup.nodes.Attributes)v19));
    Object v21 = ((org.jsoup.nodes.Node)v15).doClone(((org.jsoup.nodes.Node)v20));
    Object v22 = ((org.jsoup.nodes.Node)v21).parent();
    Object v23 = "ruluhar";
    Object v24 = ((org.jsoup.nodes.Node)v22).removeAttr(((java.lang.String)v23));
    ((org.jsoup.nodes.Node)v10).removeChild(((org.jsoup.nodes.Node)v22));
    Object v25 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = ((org.jsoup.nodes.Node)v11).clone();
    Object v13 = ((org.jsoup.nodes.Node)v12).nextSibling();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "xodot";
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v11));
    Object v13 = "lowst";
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v12),((java.lang.String)v13),((org.jsoup.nodes.Attributes)v14));
    Object v16 = "xodot";
    Object v17 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v16));
    Object v18 = "lowst";
    Object v19 = new org.jsoup.nodes.Attributes();
    Object v20 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v17),((java.lang.String)v18),((org.jsoup.nodes.Attributes)v19));
    Object v21 = ((org.jsoup.nodes.Node)v15).doClone(((org.jsoup.nodes.Node)v20));
    Object v22 = ((org.jsoup.nodes.Node)v10).doClone(((org.jsoup.nodes.Node)v21));
    Object v23 = ((org.jsoup.nodes.Node)v22).ownerDocument();
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = "nsub";
    Object v13 = ((org.jsoup.nodes.Node)v11).attr(((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(""), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = new org.jsoup.nodes.Attributes();
    Object v13 = ((org.jsoup.nodes.Node)v11).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).attributes();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = ((org.jsoup.nodes.Node)v11).nextSibling();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = "U";
    Object v13 = "ItildeB";
    Object v14 = ((org.jsoup.nodes.Node)v11).attr(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Node)v14).nextSibling();
    Object v16 = "BFN";
    Object v17 = ((org.jsoup.nodes.Node)v14).attr(((java.lang.String)v16));
    org.junit.Assert.assertEquals((Object)(""), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = ((org.jsoup.nodes.Node)v11).clone();
    Object v13 = ((org.jsoup.nodes.Node)v12).ownerDocument();
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    ((org.jsoup.nodes.Node)v10).remove();
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = 14;
    Object v13 = new org.jsoup.nodes.Node[]{};
    ((org.jsoup.nodes.Node)v11).addChildren((((java.lang.Integer)v12).intValue()),((org.jsoup.nodes.Node[])v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "drcorA";
    Object v12 = ((org.jsoup.nodes.Node)v10).removeAttr(((java.lang.String)v11));
    Object v13 = -14;
    Object v14 = new org.jsoup.nodes.Node[]{null,null};
    ((org.jsoup.nodes.Node)v10).addChildren((((java.lang.Integer)v13).intValue()),((org.jsoup.nodes.Node[])v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = "xodot";
    Object v13 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v12));
    Object v14 = "lowst";
    Object v15 = new org.jsoup.nodes.Attributes();
    Object v16 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v13),((java.lang.String)v14),((org.jsoup.nodes.Attributes)v15));
    Object v17 = "xodot";
    Object v18 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v17));
    Object v19 = "lowst";
    Object v20 = new org.jsoup.nodes.Attributes();
    Object v21 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v18),((java.lang.String)v19),((org.jsoup.nodes.Attributes)v20));
    Object v22 = ((org.jsoup.nodes.Node)v16).doClone(((org.jsoup.nodes.Node)v21));
    Object v23 = ((org.jsoup.nodes.Node)v22).parent();
    Object v24 = ((org.jsoup.nodes.Node)v23).clone();
    Object v25 = ((org.jsoup.nodes.Node)v11).doClone(((org.jsoup.nodes.Node)v24));
    Object v26 = "dl";
    Object v27 = ((org.jsoup.nodes.Node)v25).hasAttr(((java.lang.String)v26));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = ((org.jsoup.nodes.Node)v11).clone();
    Object v13 = ((org.jsoup.nodes.Node)v12).childNodesAsArray();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = "Element";
    Object v13 = "there4";
    Object v14 = ((org.jsoup.nodes.Node)v11).attr(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Node)v11).attributes();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = "U";
    Object v13 = "ItildeB";
    Object v14 = ((org.jsoup.nodes.Node)v11).attr(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new org.jsoup.nodes.Node[]{null};
    ((org.jsoup.nodes.Node)v14).addChildren(((org.jsoup.nodes.Node[])v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = "nsqsube";
    Object v13 = ((org.jsoup.nodes.Node)v11).attr(((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(""), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = ((org.jsoup.nodes.Node)v11).hashCode();
    Object v13 = ((org.jsoup.nodes.Node)v11).clone();
    Object v14 = ">";
    Object v15 = ((org.jsoup.nodes.Node)v13).removeAttr(((java.lang.String)v14));
    Object v16 = "xodot";
    Object v17 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v16));
    Object v18 = "lowst";
    Object v19 = new org.jsoup.nodes.Attributes();
    Object v20 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v17),((java.lang.String)v18),((org.jsoup.nodes.Attributes)v19));
    Object v21 = "xodot";
    Object v22 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v21));
    Object v23 = "lowst";
    Object v24 = new org.jsoup.nodes.Attributes();
    Object v25 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v22),((java.lang.String)v23),((org.jsoup.nodes.Attributes)v24));
    Object v26 = ((org.jsoup.nodes.Node)v20).doClone(((org.jsoup.nodes.Node)v25));
    Object v27 = ((org.jsoup.nodes.Node)v26).parent();
    ((org.jsoup.nodes.Node)v15).setParentNode(((org.jsoup.nodes.Node)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = "title";
    Object v13 = ((org.jsoup.nodes.Node)v11).removeAttr(((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = ((org.jsoup.nodes.Node)v11).clone();
    Object v13 = "loparc";
    Object v14 = new java.lang.StringBuilder(((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Node)v12).equals(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = ((org.jsoup.nodes.Node)v11).toString();
    org.junit.Assert.assertEquals((Object)("<xodot></xodot>"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = "xodot";
    Object v13 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v12));
    Object v14 = "lowst";
    Object v15 = new org.jsoup.nodes.Attributes();
    Object v16 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v13),((java.lang.String)v14),((org.jsoup.nodes.Attributes)v15));
    Object v17 = "xodot";
    Object v18 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v17));
    Object v19 = "lowst";
    Object v20 = new org.jsoup.nodes.Attributes();
    Object v21 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v18),((java.lang.String)v19),((org.jsoup.nodes.Attributes)v20));
    Object v22 = ((org.jsoup.nodes.Node)v16).doClone(((org.jsoup.nodes.Node)v21));
    Object v23 = ((org.jsoup.nodes.Node)v22).parent();
    Object v24 = "U";
    Object v25 = "ItildeB";
    Object v26 = ((org.jsoup.nodes.Node)v23).attr(((java.lang.String)v24),((java.lang.String)v25));
    ((org.jsoup.nodes.Node)v11).setParentNode(((org.jsoup.nodes.Node)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = "U";
    Object v13 = "ItildeB";
    Object v14 = ((org.jsoup.nodes.Node)v11).attr(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "xodot";
    Object v16 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v15));
    Object v17 = "lowst";
    Object v18 = new org.jsoup.nodes.Attributes();
    Object v19 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v16),((java.lang.String)v17),((org.jsoup.nodes.Attributes)v18));
    Object v20 = "xodot";
    Object v21 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v20));
    Object v22 = "lowst";
    Object v23 = new org.jsoup.nodes.Attributes();
    Object v24 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v21),((java.lang.String)v22),((org.jsoup.nodes.Attributes)v23));
    Object v25 = ((org.jsoup.nodes.Node)v19).doClone(((org.jsoup.nodes.Node)v24));
    Object v26 = ((org.jsoup.nodes.Node)v25).parent();
    Object v27 = ((org.jsoup.nodes.Node)v14).doClone(((org.jsoup.nodes.Node)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = new org.jsoup.nodes.Node[]{};
    ((org.jsoup.nodes.Node)v11).addChildren(((org.jsoup.nodes.Node[])v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = "U";
    Object v13 = "ItildeB";
    Object v14 = ((org.jsoup.nodes.Node)v11).attr(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "gzip";
    Object v16 = ((org.jsoup.nodes.Node)v14).attr(((java.lang.String)v15));
    Object v17 = new org.jsoup.nodes.Attributes();
    Object v18 = ((org.jsoup.nodes.Node)v14).equals(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "xodot";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lowst";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xodot";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lowst";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v4).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).parent();
    Object v12 = "xodot";
    Object v13 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v12));
    Object v14 = "lowst";
    Object v15 = new org.jsoup.nodes.Attributes();
    Object v16 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v13),((java.lang.String)v14),((org.jsoup.nodes.Attributes)v15));
    Object v17 = "xodot";
    Object v18 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v17));
    Object v19 = "lowst";
    Object v20 = new org.jsoup.nodes.Attributes();
    Object v21 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v18),((java.lang.String)v19),((org.jsoup.nodes.Attributes)v20));
    Object v22 = ((org.jsoup.nodes.Node)v16).doClone(((org.jsoup.nodes.Node)v21));
    ((org.jsoup.nodes.Node)v11).replaceWith(((org.jsoup.nodes.Node)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
