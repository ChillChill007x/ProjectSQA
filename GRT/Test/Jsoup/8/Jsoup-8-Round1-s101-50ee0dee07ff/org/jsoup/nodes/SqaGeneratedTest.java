package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
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
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nodeName();
    org.junit.Assert.assertEquals((Object)("xopf"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(1568616723), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xopf";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lz";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    ((org.jsoup.nodes.Node)v4).removeChild(((org.jsoup.nodes.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "LongRightArrow";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(1568616723), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = new org.jsoup.nodes.Attributes();
    Object v6 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xopf";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lz";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = "xopf";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "lz";
    Object v13 = new org.jsoup.nodes.Attributes();
    Object v14 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12),((org.jsoup.nodes.Attributes)v13));
    ((org.jsoup.nodes.Node)v4).replaceChild(((org.jsoup.nodes.Node)v9),((org.jsoup.nodes.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "vDash";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodes();
    Object v6 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "isids";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = " ";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    Object v7 = "pusb";
    Object v8 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodes();
    Object v6 = 1;
    Object v7 = new org.jsoup.nodes.Node[]{null,null};
    ((org.jsoup.nodes.Node)v4).addChildren((((java.lang.Integer)v6).intValue()),((org.jsoup.nodes.Node[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = 24;
    Object v6 = new org.jsoup.nodes.Node[]{null};
    ((org.jsoup.nodes.Node)v4).addChildren((((java.lang.Integer)v5).intValue()),((org.jsoup.nodes.Node[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "n5infin";
    Object v6 = "Scaron";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(1834692021), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xopf";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lz";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    ((org.jsoup.nodes.Node)v4).setParentNode(((org.jsoup.nodes.Node)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "";
    ((org.jsoup.nodes.Node)v4).setBaseUri(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = 0;
    Object v8 = ((org.jsoup.nodes.Node)v4).childNode((((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "]";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    Object v7 = "supm";
    Object v8 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = 33;
    Object v6 = new org.jsoup.nodes.Node[]{};
    ((org.jsoup.nodes.Node)v4).addChildren((((java.lang.Integer)v5).intValue()),((org.jsoup.nodes.Node[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = -1;
    Object v6 = new org.jsoup.nodes.Node[]{null,null,null};
    ((org.jsoup.nodes.Node)v4).addChildren((((java.lang.Integer)v5).intValue()),((org.jsoup.nodes.Node[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = new org.jsoup.nodes.Node[]{null};
    ((org.jsoup.nodes.Node)v4).addChildren(((org.jsoup.nodes.Node[])v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "lcoplus";
    Object v6 = new java.lang.StringBuilder(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    ((org.jsoup.nodes.Node)v4).remove();
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = new org.jsoup.nodes.Node[]{};
    ((org.jsoup.nodes.Node)v4).addChildren(((org.jsoup.nodes.Node[])v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "permil";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).toString();
    org.junit.Assert.assertEquals((Object)("<xopf></xopf>"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = 1;
    Object v6 = new org.jsoup.nodes.Node[]{};
    ((org.jsoup.nodes.Node)v4).addChildren((((java.lang.Integer)v5).intValue()),((org.jsoup.nodes.Node[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xopf";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lz";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).hashCode();
    ((org.jsoup.nodes.Node)v4).replaceWith(((org.jsoup.nodes.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xopf";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lz";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = "xopf";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "lz";
    Object v13 = new org.jsoup.nodes.Attributes();
    Object v14 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12),((org.jsoup.nodes.Attributes)v13));
    Object v15 = "IO4cy";
    Object v16 = ((org.jsoup.nodes.Node)v14).hasAttr(((java.lang.String)v15));
    ((org.jsoup.nodes.Node)v4).replaceChild(((org.jsoup.nodes.Node)v9),((org.jsoup.nodes.Node)v14));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "~H";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    Object v7 = "xopf";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "lz";
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v8),((java.lang.String)v9),((org.jsoup.nodes.Attributes)v10));
    ((org.jsoup.nodes.Node)v4).replaceWith(((org.jsoup.nodes.Node)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingNodes();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nodeName();
    Object v6 = "xopf";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = "lz";
    Object v9 = new org.jsoup.nodes.Attributes();
    Object v10 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v7),((java.lang.String)v8),((org.jsoup.nodes.Attributes)v9));
    Object v11 = "xopf";
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v11));
    Object v13 = "lz";
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v12),((java.lang.String)v13),((org.jsoup.nodes.Attributes)v14));
    Object v16 = "diams";
    Object v17 = "Aring";
    Object v18 = ((org.jsoup.nodes.Node)v15).attr(((java.lang.String)v16),((java.lang.String)v17));
    ((org.jsoup.nodes.Node)v4).replaceChild(((org.jsoup.nodes.Node)v10),((org.jsoup.nodes.Node)v15));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "uharl";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).parent();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = 0;
    Object v6 = new org.jsoup.nodes.Node[]{null,null,null};
    ((org.jsoup.nodes.Node)v4).addChildren((((java.lang.Integer)v5).intValue()),((org.jsoup.nodes.Node[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "Cookie name must not be empty";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = new org.jsoup.nodes.Node[]{null,null};
    ((org.jsoup.nodes.Node)v4).addChildren((((java.lang.Integer)v7).intValue()),((org.jsoup.nodes.Node[])v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    Object v7 = new org.jsoup.nodes.Node[]{};
    ((org.jsoup.nodes.Node)v4).addChildren(((org.jsoup.nodes.Node[])v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "lcoplus";
    Object v6 = new java.lang.StringBuilder(((java.lang.String)v5));
    Object v7 = 0;
    Object v8 = true;
    Object v9 = ((java.lang.StringBuilder)v6).insert((((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
    ((org.jsoup.nodes.Node)v4).outerHtml(((java.lang.StringBuilder)v6));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).baseUri();
    org.junit.Assert.assertEquals((Object)("lz"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nodeName();
    Object v6 = ((org.jsoup.nodes.Node)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(1568616723), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xopf";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lz";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = "isids";
    Object v11 = ((org.jsoup.nodes.Node)v9).attr(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).outerHtml();
    Object v6 = 0;
    Object v7 = new org.jsoup.nodes.Node[]{null,null};
    ((org.jsoup.nodes.Node)v4).addChildren((((java.lang.Integer)v6).intValue()),((org.jsoup.nodes.Node[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = 2;
    ((org.jsoup.nodes.Node)v4).setSiblingIndex((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).attributes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "UTF-8";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "htrtp";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = 0;
    Object v6 = ((org.jsoup.nodes.Node)v4).childNode((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = 1;
    Object v6 = new org.jsoup.nodes.Node[]{null};
    ((org.jsoup.nodes.Node)v4).addChildren((((java.lang.Integer)v5).intValue()),((org.jsoup.nodes.Node[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nodeName();
    Object v6 = "llubs";
    Object v7 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "subseteqq";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "rob6rk";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nsub";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "comma";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    Object v7 = "xopf";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "lz";
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v8),((java.lang.String)v9),((org.jsoup.nodes.Attributes)v10));
    Object v12 = " ";
    Object v13 = ((org.jsoup.nodes.Node)v11).hasAttr(((java.lang.String)v12));
    Object v14 = "pusb";
    Object v15 = ((org.jsoup.nodes.Node)v11).attr(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "qopf:";
    Object v6 = "ni";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "xopf";
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8));
    Object v10 = "lz";
    Object v11 = new org.jsoup.nodes.Attributes();
    Object v12 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v9),((java.lang.String)v10),((org.jsoup.nodes.Attributes)v11));
    ((org.jsoup.nodes.Node)v4).setParentNode(((org.jsoup.nodes.Node)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xopf";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lz";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).nextSibling();
    ((org.jsoup.nodes.Node)v4).removeChild(((org.jsoup.nodes.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).toString();
    Object v6 = ((org.jsoup.nodes.Node)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(1568616723), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xopf";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lz";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = "rob6rk";
    Object v11 = ((org.jsoup.nodes.Node)v9).attr(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "exponentiale";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "lcoplus";
    Object v6 = new java.lang.StringBuilder(((java.lang.String)v5));
    ((org.jsoup.nodes.Node)v4).outerHtml(((java.lang.StringBuilder)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).outerHtml();
    org.junit.Assert.assertEquals((Object)("<xopf></xopf>"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v4).nodeName();
    org.junit.Assert.assertEquals((Object)("xopf"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "xopf";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "lz";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).siblingIndex();
    ((org.jsoup.nodes.Node)v4).removeChild(((org.jsoup.nodes.Node)v9));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "Jttps";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "xopf";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "lz";
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v8),((java.lang.String)v9),((org.jsoup.nodes.Attributes)v10));
    ((org.jsoup.nodes.Node)v4).setParentNode(((org.jsoup.nodes.Node)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "Could not parse attribute query '%s': unexpected token at '%s'";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).outerHtml();
    Object v6 = "xopf";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = "lz";
    Object v9 = new org.jsoup.nodes.Attributes();
    Object v10 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v7),((java.lang.String)v8),((org.jsoup.nodes.Attributes)v9));
    Object v11 = "rob6rk";
    Object v12 = ((org.jsoup.nodes.Node)v10).attr(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ddagger";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    Object v6 = "xopf";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = "lz";
    Object v9 = new org.jsoup.nodes.Attributes();
    Object v10 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v7),((java.lang.String)v8),((org.jsoup.nodes.Attributes)v9));
    ((org.jsoup.nodes.Node)v4).removeChild(((org.jsoup.nodes.Node)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = 1;
    Object v6 = ((org.jsoup.nodes.Node)v4).childNode((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingIndex();
    Object v6 = "abs:";
    Object v7 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingIndex();
    Object v6 = "abs:";
    Object v7 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).nodeName();
    org.junit.Assert.assertEquals((Object)("xopf"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingIndex();
    Object v6 = "abs:";
    Object v7 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v6));
    Object v8 = "lcoplus";
    Object v9 = new java.lang.StringBuilder(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v7).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingIndex();
    Object v6 = "abs:";
    Object v7 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).attributes();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingIndex();
    Object v6 = "abs:";
    Object v7 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v6));
    Object v8 = "xopf";
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8));
    Object v10 = "lz";
    Object v11 = new org.jsoup.nodes.Attributes();
    Object v12 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v9),((java.lang.String)v10),((org.jsoup.nodes.Attributes)v11));
    Object v13 = ((org.jsoup.nodes.Node)v12).siblingIndex();
    Object v14 = "abs:";
    Object v15 = ((org.jsoup.nodes.Node)v12).removeAttr(((java.lang.String)v14));
    ((org.jsoup.nodes.Node)v7).setParentNode(((org.jsoup.nodes.Node)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingIndex();
    Object v6 = "abs:";
    Object v7 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).hashCode();
    Object v9 = new org.jsoup.nodes.Node[]{};
    ((org.jsoup.nodes.Node)v7).addChildren(((org.jsoup.nodes.Node[])v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingIndex();
    Object v6 = "abs:";
    Object v7 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v6));
    Object v8 = "lsauo";
    ((org.jsoup.nodes.Node)v7).setBaseUri(((java.lang.String)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingIndex();
    Object v6 = "abs:";
    Object v7 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v6));
    Object v8 = "uAr";
    Object v9 = ((org.jsoup.nodes.Node)v7).attr(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "COLGROUP";
    Object v6 = ((org.jsoup.nodes.Node)v4).absUrl(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = -21;
    Object v6 = new org.jsoup.nodes.Node[]{};
    ((org.jsoup.nodes.Node)v4).addChildren((((java.lang.Integer)v5).intValue()),((org.jsoup.nodes.Node[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingIndex();
    Object v6 = "abs:";
    Object v7 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v6));
    Object v8 = "xopf";
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8));
    Object v10 = "lz";
    Object v11 = new org.jsoup.nodes.Attributes();
    Object v12 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v9),((java.lang.String)v10),((org.jsoup.nodes.Attributes)v11));
    Object v13 = ((org.jsoup.nodes.Node)v12).siblingIndex();
    Object v14 = "abs:";
    Object v15 = ((org.jsoup.nodes.Node)v12).removeAttr(((java.lang.String)v14));
    ((org.jsoup.nodes.Node)v7).removeChild(((org.jsoup.nodes.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingIndex();
    Object v6 = "abs:";
    Object v7 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v6));
    Object v8 = new org.jsoup.nodes.Node[]{};
    ((org.jsoup.nodes.Node)v7).addChildren(((org.jsoup.nodes.Node[])v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingIndex();
    Object v6 = "abs:";
    Object v7 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v6));
    Object v8 = "sqsup";
    Object v9 = ((org.jsoup.nodes.Node)v7).hasAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v7).nextSibling();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).outerHtml();
    Object v6 = ((org.jsoup.nodes.Node)v4).childNodes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingIndex();
    Object v6 = "abs:";
    Object v7 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v6));
    Object v8 = "Map";
    Object v9 = ((org.jsoup.nodes.Node)v7).attr(((java.lang.String)v8));
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingIndex();
    Object v6 = "abs:";
    Object v7 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = new org.jsoup.nodes.Node[]{};
    ((org.jsoup.nodes.Node)v7).addChildren((((java.lang.Integer)v8).intValue()),((org.jsoup.nodes.Node[])v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingIndex();
    Object v6 = "abs:";
    Object v7 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v6));
    Object v8 = "xopf";
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8));
    Object v10 = "lz";
    Object v11 = new org.jsoup.nodes.Attributes();
    Object v12 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v9),((java.lang.String)v10),((org.jsoup.nodes.Attributes)v11));
    Object v13 = ((org.jsoup.nodes.Node)v12).siblingIndex();
    Object v14 = "abs:";
    Object v15 = ((org.jsoup.nodes.Node)v12).removeAttr(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Node)v15).siblingIndex();
    ((org.jsoup.nodes.Node)v7).setParentNode(((org.jsoup.nodes.Node)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingIndex();
    Object v6 = "abs:";
    Object v7 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "dcaron";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "dcaron";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "rel";
    Object v8 = ((org.jsoup.nodes.Node)v6).absUrl(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "dcaron";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "xopf";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "lz";
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v8),((java.lang.String)v9),((org.jsoup.nodes.Attributes)v10));
    Object v12 = "dcaron";
    Object v13 = ((org.jsoup.nodes.Node)v11).removeAttr(((java.lang.String)v12));
    Object v14 = "squarf";
    Object v15 = ((org.jsoup.nodes.Node)v13).hasAttr(((java.lang.String)v14));
    ((org.jsoup.nodes.Node)v6).removeChild(((org.jsoup.nodes.Node)v13));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "dcaron";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = 1;
    ((org.jsoup.nodes.Node)v6).setSiblingIndex((((java.lang.Integer)v7).intValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "dcaron";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "xopf";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "lz";
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v8),((java.lang.String)v9),((org.jsoup.nodes.Attributes)v10));
    Object v12 = "UTF-8";
    Object v13 = ((org.jsoup.nodes.Node)v11).absUrl(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v6).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "dcaron";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "xopf";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "lz";
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v8),((java.lang.String)v9),((org.jsoup.nodes.Attributes)v10));
    Object v12 = "Could not parse attribute query '%s': unexpected token at '%s'";
    Object v13 = ((org.jsoup.nodes.Node)v11).attr(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v6).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "dcaron";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).nextSibling();
    Object v8 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "dcaron";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "xopf";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "lz";
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v8),((java.lang.String)v9),((org.jsoup.nodes.Attributes)v10));
    Object v12 = "dcaron";
    Object v13 = ((org.jsoup.nodes.Node)v11).removeAttr(((java.lang.String)v12));
    ((org.jsoup.nodes.Node)v6).removeChild(((org.jsoup.nodes.Node)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "dcaron";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "xopf";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "lz";
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v8),((java.lang.String)v9),((org.jsoup.nodes.Attributes)v10));
    Object v12 = "dcaron";
    Object v13 = ((org.jsoup.nodes.Node)v11).removeAttr(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v13).hashCode();
    ((org.jsoup.nodes.Node)v6).setParentNode(((org.jsoup.nodes.Node)v13));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = "xopf";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "lz";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "dcaron";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = new org.jsoup.nodes.Node[]{null};
    ((org.jsoup.nodes.Node)v6).addChildren(((org.jsoup.nodes.Node[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }
}
