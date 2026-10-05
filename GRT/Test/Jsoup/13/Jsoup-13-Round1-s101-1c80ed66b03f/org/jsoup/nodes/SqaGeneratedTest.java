package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).parent();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "tfoot";
    ((org.jsoup.nodes.Node)v4).setBaseUri(((java.lang.String)v5));
    Object v6 = null;
    Object v7 = "htm]";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "RightTrianglueBar";
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v8),((java.lang.String)v9),((org.jsoup.nodes.Attributes)v10));
    Object v12 = "frac94";
    Object v13 = "backsimeq";
    Object v14 = ((org.jsoup.nodes.Node)v11).attr(((java.lang.String)v12),((java.lang.String)v13));
    ((org.jsoup.nodes.Node)v4).setParentNode(((org.jsoup.nodes.Node)v11));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "t~ody";
    Object v6 = "td";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = 1;
    Object v9 = new java.lang.StringBuilder((((java.lang.Integer)v8).intValue()));
    Object v10 = 1;
    Object v11 = new java.lang.StringBuilder((((java.lang.Integer)v10).intValue()));
    Object v12 = new java.lang.StringBuffer(((java.lang.CharSequence)v11));
    Object v13 = ((java.lang.StringBuilder)v9).append(((java.lang.StringBuffer)v12));
    Object v14 = -19;
    Object v15 = new org.jsoup.nodes.Document.OutputSettings();
    Object v16 = ((org.jsoup.nodes.Document.OutputSettings)v15).clone();
    ((org.jsoup.nodes.Node)v4).outerHtmlTail(((java.lang.StringBuilder)v9),(((java.lang.Integer)v14).intValue()),((org.jsoup.nodes.Document.OutputSettings)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = -38;
    Object v6 = new org.jsoup.nodes.Node[]{null,null};
    ((org.jsoup.nodes.Node)v4).addChildren((((java.lang.Integer)v5).intValue()),((org.jsoup.nodes.Node[])v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "htm]";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "RightTrianglueBar";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    ((org.jsoup.nodes.Node)v4).removeChild(((org.jsoup.nodes.Node)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "htm]";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "RightTrianglueBar";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = "htm]";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "RightTrianglueBar";
    Object v13 = new org.jsoup.nodes.Attributes();
    Object v14 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12),((org.jsoup.nodes.Attributes)v13));
    ((org.jsoup.nodes.Node)v4).replaceChild(((org.jsoup.nodes.Node)v9),((org.jsoup.nodes.Node)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).hashCode();
    Object v6 = "htm]";
    Object v7 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v6));
    Object v8 = "RightTrianglueBar";
    Object v9 = new org.jsoup.nodes.Attributes();
    Object v10 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v7),((java.lang.String)v8),((org.jsoup.nodes.Attributes)v9));
    Object v11 = "htm]";
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v11));
    Object v13 = "RightTrianglueBar";
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v12),((java.lang.String)v13),((org.jsoup.nodes.Attributes)v14));
    ((org.jsoup.nodes.Node)v4).replaceChild(((org.jsoup.nodes.Node)v10),((org.jsoup.nodes.Node)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodes();
    Object v6 = 0;
    Object v7 = new org.jsoup.nodes.Node[]{};
    ((org.jsoup.nodes.Node)v4).addChildren((((java.lang.Integer)v6).intValue()),((org.jsoup.nodes.Node[])v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = 1;
    Object v6 = new java.lang.StringBuilder((((java.lang.Integer)v5).intValue()));
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    Object v8 = ((java.lang.StringBuilder)v6).append(((java.lang.Object)v7));
    Object v9 = 0;
    Object v10 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v4).outerHtmlHead(((java.lang.StringBuilder)v6),(((java.lang.Integer)v9).intValue()),((org.jsoup.nodes.Document.OutputSettings)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nodeName();
    org.junit.Assert.assertEquals((Object)("htm]"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = 1;
    Object v6 = new java.lang.StringBuilder((((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v4).outerHtmlTail(((java.lang.StringBuilder)v6),(((java.lang.Integer)v7).intValue()),((org.jsoup.nodes.Document.OutputSettings)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "colgroup";
    Object v6 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nzme";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = new org.jsoup.nodes.Attributes();
    Object v8 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = 1;
    Object v6 = new java.lang.StringBuilder((((java.lang.Integer)v5).intValue()));
    Object v7 = 4;
    Object v8 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v4).outerHtmlTail(((java.lang.StringBuilder)v6),(((java.lang.Integer)v7).intValue()),((org.jsoup.nodes.Document.OutputSettings)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = "htm]";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "RightTrianglueBar";
    Object v13 = new org.jsoup.nodes.Attributes();
    Object v14 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12),((org.jsoup.nodes.Attributes)v13));
    Object v15 = "h1";
    Object v16 = "u";
    Object v17 = ((org.jsoup.nodes.Node)v14).attr(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "command";
    Object v19 = ((org.jsoup.nodes.Node)v14).removeAttr(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Node)v9).doClone(((org.jsoup.nodes.Node)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = "htm]";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "RightTrianglueBar";
    Object v13 = new org.jsoup.nodes.Attributes();
    Object v14 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12),((org.jsoup.nodes.Attributes)v13));
    Object v15 = "h1";
    Object v16 = "u";
    Object v17 = ((org.jsoup.nodes.Node)v14).attr(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "command";
    Object v19 = ((org.jsoup.nodes.Node)v14).removeAttr(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Node)v19).nextSibling();
    ((org.jsoup.nodes.Node)v9).setParentNode(((org.jsoup.nodes.Node)v19));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = "htm]";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "RightTrianglueBar";
    Object v13 = new org.jsoup.nodes.Attributes();
    Object v14 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12),((org.jsoup.nodes.Attributes)v13));
    Object v15 = "h1";
    Object v16 = "u";
    Object v17 = ((org.jsoup.nodes.Node)v14).attr(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "command";
    Object v19 = ((org.jsoup.nodes.Node)v14).removeAttr(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Node)v9).doClone(((org.jsoup.nodes.Node)v19));
    Object v21 = "kygen";
    Object v22 = ((org.jsoup.nodes.Node)v20).absUrl(((java.lang.String)v21));
    org.junit.Assert.assertEquals((Object)(""), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).outerHtml();
    Object v11 = ((org.jsoup.nodes.Node)v9).ownerDocument();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).hashCode();
    org.junit.Assert.assertEquals((Object)(236082686), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = "smte";
    Object v11 = ((org.jsoup.nodes.Node)v9).attr(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = "htm]";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "RightTrianglueBar";
    Object v13 = new org.jsoup.nodes.Attributes();
    Object v14 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12),((org.jsoup.nodes.Attributes)v13));
    Object v15 = "h1";
    Object v16 = "u";
    Object v17 = ((org.jsoup.nodes.Node)v14).attr(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "command";
    Object v19 = ((org.jsoup.nodes.Node)v14).removeAttr(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Node)v9).doClone(((org.jsoup.nodes.Node)v19));
    Object v21 = ((org.jsoup.nodes.Node)v20).siblingNodes();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = "htm]";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "RightTrianglueBar";
    Object v13 = new org.jsoup.nodes.Attributes();
    Object v14 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12),((org.jsoup.nodes.Attributes)v13));
    Object v15 = "h1";
    Object v16 = "u";
    Object v17 = ((org.jsoup.nodes.Node)v14).attr(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "command";
    Object v19 = ((org.jsoup.nodes.Node)v14).removeAttr(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Node)v9).doClone(((org.jsoup.nodes.Node)v19));
    Object v21 = ((org.jsoup.nodes.Node)v20).hashCode();
    org.junit.Assert.assertEquals((Object)(-521722756), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = 1;
    Object v11 = new java.lang.StringBuilder((((java.lang.Integer)v10).intValue()));
    Object v12 = new java.lang.StringBuffer(((java.lang.CharSequence)v11));
    Object v13 = ((org.jsoup.nodes.Node)v9).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = 1;
    Object v11 = new java.lang.StringBuilder((((java.lang.Integer)v10).intValue()));
    ((org.jsoup.nodes.Node)v9).outerHtml(((java.lang.StringBuilder)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = "htm]";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "RightTrianglueBar";
    Object v13 = new org.jsoup.nodes.Attributes();
    Object v14 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12),((org.jsoup.nodes.Attributes)v13));
    Object v15 = "h1";
    Object v16 = "u";
    Object v17 = ((org.jsoup.nodes.Node)v14).attr(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "command";
    Object v19 = ((org.jsoup.nodes.Node)v14).removeAttr(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Node)v9).doClone(((org.jsoup.nodes.Node)v19));
    Object v21 = "optgroupZ";
    Object v22 = ((org.jsoup.nodes.Node)v20).wrap(((java.lang.String)v21));
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = "htm]";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "RightTrianglueBar";
    Object v13 = new org.jsoup.nodes.Attributes();
    Object v14 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12),((org.jsoup.nodes.Attributes)v13));
    Object v15 = "h1";
    Object v16 = "u";
    Object v17 = ((org.jsoup.nodes.Node)v14).attr(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "command";
    Object v19 = ((org.jsoup.nodes.Node)v14).removeAttr(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Node)v9).doClone(((org.jsoup.nodes.Node)v19));
    ((org.jsoup.nodes.Node)v20).remove();
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).toString();
    Object v11 = "html";
    Object v12 = ((org.jsoup.nodes.Node)v9).wrap(((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = "htm]";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "RightTrianglueBar";
    Object v13 = new org.jsoup.nodes.Attributes();
    Object v14 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12),((org.jsoup.nodes.Attributes)v13));
    Object v15 = "h1";
    Object v16 = "u";
    Object v17 = ((org.jsoup.nodes.Node)v14).attr(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "command";
    Object v19 = ((org.jsoup.nodes.Node)v14).removeAttr(((java.lang.String)v18));
    ((org.jsoup.nodes.Node)v9).removeChild(((org.jsoup.nodes.Node)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).ownerDocument();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = "hea";
    Object v11 = ((org.jsoup.nodes.Node)v9).hasAttr(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = new org.jsoup.nodes.Node[]{null};
    ((org.jsoup.nodes.Node)v9).addChildren(((org.jsoup.nodes.Node[])v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = "htm]";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "RightTrianglueBar";
    Object v13 = new org.jsoup.nodes.Attributes();
    Object v14 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12),((org.jsoup.nodes.Attributes)v13));
    Object v15 = "h1";
    Object v16 = "u";
    Object v17 = ((org.jsoup.nodes.Node)v14).attr(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "command";
    Object v19 = ((org.jsoup.nodes.Node)v14).removeAttr(((java.lang.String)v18));
    Object v20 = "htm]";
    Object v21 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v20));
    Object v22 = "RightTrianglueBar";
    Object v23 = new org.jsoup.nodes.Attributes();
    Object v24 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v21),((java.lang.String)v22),((org.jsoup.nodes.Attributes)v23));
    Object v25 = "h1";
    Object v26 = "u";
    Object v27 = ((org.jsoup.nodes.Node)v24).attr(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = "command";
    Object v29 = ((org.jsoup.nodes.Node)v24).removeAttr(((java.lang.String)v28));
    Object v30 = ((org.jsoup.nodes.Node)v19).doClone(((org.jsoup.nodes.Node)v29));
    Object v31 = ((org.jsoup.nodes.Node)v9).doClone(((org.jsoup.nodes.Node)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "tf\"ot";
    Object v8 = "EOF";
    Object v9 = ((org.jsoup.nodes.Node)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "amp";
    Object v11 = ((org.jsoup.nodes.Node)v6).absUrl(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = "htm]";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "RightTrianglueBar";
    Object v13 = new org.jsoup.nodes.Attributes();
    Object v14 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12),((org.jsoup.nodes.Attributes)v13));
    Object v15 = "h1";
    Object v16 = "u";
    Object v17 = ((org.jsoup.nodes.Node)v14).attr(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "command";
    Object v19 = ((org.jsoup.nodes.Node)v14).removeAttr(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Node)v9).doClone(((org.jsoup.nodes.Node)v19));
    Object v21 = new org.jsoup.nodes.Attributes();
    Object v22 = ((org.jsoup.nodes.Node)v20).equals(((java.lang.Object)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(233035107), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    Object v6 = 1;
    Object v7 = new java.lang.StringBuilder((((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v4).outerHtmlTail(((java.lang.StringBuilder)v7),(((java.lang.Integer)v8).intValue()),((org.jsoup.nodes.Document.OutputSettings)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = "htm]";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "RightTrianglueBar";
    Object v13 = new org.jsoup.nodes.Attributes();
    Object v14 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12),((org.jsoup.nodes.Attributes)v13));
    Object v15 = "ncp";
    Object v16 = ((org.jsoup.nodes.Node)v14).removeAttr(((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Node)v9).before(((org.jsoup.nodes.Node)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "DprnE";
    Object v8 = ((org.jsoup.nodes.Node)v6).attr(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "xhArr";
    Object v8 = ((org.jsoup.nodes.Node)v6).hasAttr(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).nextSibling();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "htm]";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "RightTrianglueBar";
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v8),((java.lang.String)v9),((org.jsoup.nodes.Attributes)v10));
    Object v12 = "h1";
    Object v13 = "u";
    Object v14 = ((org.jsoup.nodes.Node)v11).attr(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "command";
    Object v16 = ((org.jsoup.nodes.Node)v11).removeAttr(((java.lang.String)v15));
    ((org.jsoup.nodes.Node)v6).setParentNode(((org.jsoup.nodes.Node)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "?tml";
    Object v8 = "THORN";
    Object v9 = ((org.jsoup.nodes.Node)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v6).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).clone();
    Object v11 = ((org.jsoup.nodes.Node)v9).nodeName();
    org.junit.Assert.assertEquals((Object)("htm]"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = new java.lang.StringBuilder((((java.lang.Integer)v7).intValue()));
    Object v9 = 2;
    Object v10 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v6).outerHtmlHead(((java.lang.StringBuilder)v8),(((java.lang.Integer)v9).intValue()),((org.jsoup.nodes.Document.OutputSettings)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = new java.lang.StringBuilder((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v6).outerHtmlHead(((java.lang.StringBuilder)v8),(((java.lang.Integer)v9).intValue()),((org.jsoup.nodes.Document.OutputSettings)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "publi";
    Object v8 = ((org.jsoup.nodes.Node)v6).wrap(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = new org.jsoup.nodes.Node[]{null,null,null};
    ((org.jsoup.nodes.Node)v6).addChildren(((org.jsoup.nodes.Node[])v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = "<!-";
    ((org.jsoup.nodes.Node)v9).setBaseUri(((java.lang.String)v10));
    Object v11 = null;
    Object v12 = 45;
    Object v13 = ((org.jsoup.nodes.Node)v9).childNode((((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "footer";
    Object v8 = ((org.jsoup.nodes.Node)v6).before(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "htl";
    Object v8 = ((org.jsoup.nodes.Node)v6).after(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    Object v8 = ((org.jsoup.nodes.Node)v6).nextSibling();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = new org.jsoup.nodes.Node[]{null,null};
    ((org.jsoup.nodes.Node)v9).addChildren(((org.jsoup.nodes.Node[])v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    Object v8 = "htm]";
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8));
    Object v10 = "RightTrianglueBar";
    Object v11 = new org.jsoup.nodes.Attributes();
    Object v12 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v9),((java.lang.String)v10),((org.jsoup.nodes.Attributes)v11));
    Object v13 = "ncp";
    Object v14 = ((org.jsoup.nodes.Node)v12).removeAttr(((java.lang.String)v13));
    Object v15 = "htm]";
    Object v16 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v15));
    Object v17 = "RightTrianglueBar";
    Object v18 = new org.jsoup.nodes.Attributes();
    Object v19 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v16),((java.lang.String)v17),((org.jsoup.nodes.Attributes)v18));
    Object v20 = "ncp";
    Object v21 = ((org.jsoup.nodes.Node)v19).removeAttr(((java.lang.String)v20));
    ((org.jsoup.nodes.Node)v6).replaceChild(((org.jsoup.nodes.Node)v14),((org.jsoup.nodes.Node)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = "htm]";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "RightTrianglueBar";
    Object v13 = new org.jsoup.nodes.Attributes();
    Object v14 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12),((org.jsoup.nodes.Attributes)v13));
    Object v15 = "h1";
    Object v16 = "u";
    Object v17 = ((org.jsoup.nodes.Node)v14).attr(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "command";
    Object v19 = ((org.jsoup.nodes.Node)v14).removeAttr(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Node)v9).doClone(((org.jsoup.nodes.Node)v19));
    Object v21 = "htm]";
    Object v22 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v21));
    Object v23 = "RightTrianglueBar";
    Object v24 = new org.jsoup.nodes.Attributes();
    Object v25 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v22),((java.lang.String)v23),((org.jsoup.nodes.Attributes)v24));
    Object v26 = "ncp";
    Object v27 = ((org.jsoup.nodes.Node)v25).removeAttr(((java.lang.String)v26));
    Object v28 = "htm]";
    Object v29 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v28));
    Object v30 = "RightTrianglueBar";
    Object v31 = new org.jsoup.nodes.Attributes();
    Object v32 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v29),((java.lang.String)v30),((org.jsoup.nodes.Attributes)v31));
    Object v33 = "ncp";
    Object v34 = ((org.jsoup.nodes.Node)v32).removeAttr(((java.lang.String)v33));
    ((org.jsoup.nodes.Node)v20).replaceChild(((org.jsoup.nodes.Node)v27),((org.jsoup.nodes.Node)v34));
    Object v35 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "htm]";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "RightTrianglueBar";
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v8),((java.lang.String)v9),((org.jsoup.nodes.Attributes)v10));
    Object v12 = "ncp";
    Object v13 = ((org.jsoup.nodes.Node)v11).removeAttr(((java.lang.String)v12));
    ((org.jsoup.nodes.Node)v6).setParentNode(((org.jsoup.nodes.Node)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = 50;
    Object v8 = new org.jsoup.nodes.Node[]{null,null};
    ((org.jsoup.nodes.Node)v6).addChildren((((java.lang.Integer)v7).intValue()),((org.jsoup.nodes.Node[])v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "di";
    Object v8 = ((org.jsoup.nodes.Node)v6).wrap(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).previousSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).clone();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).clone();
    Object v9 = "quirks";
    Object v10 = ((org.jsoup.nodes.Node)v8).wrap(((java.lang.String)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).nextSibling();
    Object v9 = new org.jsoup.nodes.Attributes();
    Object v10 = ((org.jsoup.nodes.Node)v7).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).toString();
    org.junit.Assert.assertEquals((Object)("<htm]></htm]>"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).clone();
    Object v9 = "htm]";
    Object v10 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v9));
    Object v11 = "RightTrianglueBar";
    Object v12 = new org.jsoup.nodes.Attributes();
    Object v13 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v10),((java.lang.String)v11),((org.jsoup.nodes.Attributes)v12));
    Object v14 = "ncp";
    Object v15 = ((org.jsoup.nodes.Node)v13).removeAttr(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Node)v8).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).clone();
    Object v9 = "htm]";
    Object v10 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v9));
    Object v11 = "RightTrianglueBar";
    Object v12 = new org.jsoup.nodes.Attributes();
    Object v13 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v10),((java.lang.String)v11),((org.jsoup.nodes.Attributes)v12));
    Object v14 = "h1";
    Object v15 = "u";
    Object v16 = ((org.jsoup.nodes.Node)v13).attr(((java.lang.String)v14),((java.lang.String)v15));
    Object v17 = "command";
    Object v18 = ((org.jsoup.nodes.Node)v13).removeAttr(((java.lang.String)v17));
    Object v19 = "htm]";
    Object v20 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v19));
    Object v21 = "RightTrianglueBar";
    Object v22 = new org.jsoup.nodes.Attributes();
    Object v23 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v20),((java.lang.String)v21),((org.jsoup.nodes.Attributes)v22));
    Object v24 = "h1";
    Object v25 = "u";
    Object v26 = ((org.jsoup.nodes.Node)v23).attr(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = "command";
    Object v28 = ((org.jsoup.nodes.Node)v23).removeAttr(((java.lang.String)v27));
    Object v29 = ((org.jsoup.nodes.Node)v18).doClone(((org.jsoup.nodes.Node)v28));
    ((org.jsoup.nodes.Node)v8).setParentNode(((org.jsoup.nodes.Node)v29));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = "option";
    Object v11 = ((org.jsoup.nodes.Node)v9).hasAttr(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).nodeName();
    Object v11 = 1;
    Object v12 = new java.lang.StringBuilder((((java.lang.Integer)v11).intValue()));
    Object v13 = -24;
    Object v14 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v9).outerHtmlHead(((java.lang.StringBuilder)v12),(((java.lang.Integer)v13).intValue()),((org.jsoup.nodes.Document.OutputSettings)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "htm]";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "RightTrianglueBar";
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v8),((java.lang.String)v9),((org.jsoup.nodes.Attributes)v10));
    Object v12 = "ncp";
    Object v13 = ((org.jsoup.nodes.Node)v11).removeAttr(((java.lang.String)v12));
    Object v14 = "htm]";
    Object v15 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v14));
    Object v16 = "RightTrianglueBar";
    Object v17 = new org.jsoup.nodes.Attributes();
    Object v18 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v15),((java.lang.String)v16),((org.jsoup.nodes.Attributes)v17));
    Object v19 = "ncp";
    Object v20 = ((org.jsoup.nodes.Node)v18).removeAttr(((java.lang.String)v19));
    Object v21 = ((org.jsoup.nodes.Node)v20).clone();
    ((org.jsoup.nodes.Node)v6).replaceChild(((org.jsoup.nodes.Node)v13),((org.jsoup.nodes.Node)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    Object v8 = ((org.jsoup.nodes.Node)v6).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).attributes();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).nextSibling();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).clone();
    Object v9 = ((org.jsoup.nodes.Node)v8).nextSibling();
    Object v10 = "taXle";
    Object v11 = ((org.jsoup.nodes.Node)v8).attr(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    Object v8 = "ti";
    Object v9 = "listing";
    Object v10 = ((org.jsoup.nodes.Node)v7).attr(((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(1582824393), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = "htm]";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "RightTrianglueBar";
    Object v13 = new org.jsoup.nodes.Attributes();
    Object v14 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12),((org.jsoup.nodes.Attributes)v13));
    Object v15 = "h1";
    Object v16 = "u";
    Object v17 = ((org.jsoup.nodes.Node)v14).attr(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "command";
    Object v19 = ((org.jsoup.nodes.Node)v14).removeAttr(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Node)v9).doClone(((org.jsoup.nodes.Node)v19));
    Object v21 = ((org.jsoup.nodes.Node)v20).ownerDocument();
    Object v22 = new org.jsoup.nodes.Node[]{null,null};
    ((org.jsoup.nodes.Node)v20).addChildren(((org.jsoup.nodes.Node[])v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "iframe";
    Object v8 = ((org.jsoup.nodes.Node)v6).hasAttr(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).clone();
    Object v9 = 1;
    Object v10 = new java.lang.StringBuilder((((java.lang.Integer)v9).intValue()));
    Object v11 = 1;
    Object v12 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v8).outerHtmlTail(((java.lang.StringBuilder)v10),(((java.lang.Integer)v11).intValue()),((org.jsoup.nodes.Document.OutputSettings)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "NegativeVeryThinSpJce";
    ((org.jsoup.nodes.Node)v6).setBaseUri(((java.lang.String)v7));
    Object v8 = null;
    Object v9 = 1;
    Object v10 = new java.lang.StringBuilder((((java.lang.Integer)v9).intValue()));
    Object v11 = -36;
    Object v12 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v6).outerHtmlTail(((java.lang.StringBuilder)v10),(((java.lang.Integer)v11).intValue()),((org.jsoup.nodes.Document.OutputSettings)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).childNodes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = new java.lang.StringBuilder((((java.lang.Integer)v7).intValue()));
    Object v9 = "htm";
    Object v10 = ((java.lang.StringBuilder)v8).lastIndexOf(((java.lang.String)v9));
    Object v11 = 11;
    Object v12 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Node)v6).outerHtmlHead(((java.lang.StringBuilder)v8),(((java.lang.Integer)v11).intValue()),((org.jsoup.nodes.Document.OutputSettings)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).clone();
    Object v9 = ((org.jsoup.nodes.Node)v8).outerHtml();
    Object v10 = "gt*cir";
    ((org.jsoup.nodes.Node)v8).setBaseUri(((java.lang.String)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = "htm]";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "RightTrianglueBar";
    Object v13 = new org.jsoup.nodes.Attributes();
    Object v14 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12),((org.jsoup.nodes.Attributes)v13));
    Object v15 = "h1";
    Object v16 = "u";
    Object v17 = ((org.jsoup.nodes.Node)v14).attr(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "command";
    Object v19 = ((org.jsoup.nodes.Node)v14).removeAttr(((java.lang.String)v18));
    Object v20 = "htm]";
    Object v21 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v20));
    Object v22 = "RightTrianglueBar";
    Object v23 = new org.jsoup.nodes.Attributes();
    Object v24 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v21),((java.lang.String)v22),((org.jsoup.nodes.Attributes)v23));
    Object v25 = "h1";
    Object v26 = "u";
    Object v27 = ((org.jsoup.nodes.Node)v24).attr(((java.lang.String)v25),((java.lang.String)v26));
    Object v28 = "command";
    Object v29 = ((org.jsoup.nodes.Node)v24).removeAttr(((java.lang.String)v28));
    Object v30 = ((org.jsoup.nodes.Node)v19).doClone(((org.jsoup.nodes.Node)v29));
    Object v31 = ((org.jsoup.nodes.Node)v9).doClone(((org.jsoup.nodes.Node)v30));
    Object v32 = ((org.jsoup.nodes.Node)v31).ownerDocument();
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = "htm]";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "RightTrianglueBar";
    Object v13 = new org.jsoup.nodes.Attributes();
    Object v14 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12),((org.jsoup.nodes.Attributes)v13));
    Object v15 = "h1";
    Object v16 = "u";
    Object v17 = ((org.jsoup.nodes.Node)v14).attr(((java.lang.String)v15),((java.lang.String)v16));
    Object v18 = "command";
    Object v19 = ((org.jsoup.nodes.Node)v14).removeAttr(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Node)v9).doClone(((org.jsoup.nodes.Node)v19));
    Object v21 = ((org.jsoup.nodes.Node)v20).nodeName();
    org.junit.Assert.assertEquals((Object)("htm]"), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "qu";
    Object v8 = ((org.jsoup.nodes.Node)v6).wrap(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).nextSibling();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).outerHtml();
    org.junit.Assert.assertEquals((Object)("<htm]></htm]>"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "htm]";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "RightTrianglueBar";
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v8),((java.lang.String)v9),((org.jsoup.nodes.Attributes)v10));
    Object v12 = "h1";
    Object v13 = "u";
    Object v14 = ((org.jsoup.nodes.Node)v11).attr(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "command";
    Object v16 = ((org.jsoup.nodes.Node)v11).removeAttr(((java.lang.String)v15));
    ((org.jsoup.nodes.Node)v6).replaceWith(((org.jsoup.nodes.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = "htm]";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "RightTrianglueBar";
    Object v13 = new org.jsoup.nodes.Attributes();
    Object v14 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v11),((java.lang.String)v12),((org.jsoup.nodes.Attributes)v13));
    Object v15 = "ncp";
    Object v16 = ((org.jsoup.nodes.Node)v14).removeAttr(((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Node)v16).clone();
    ((org.jsoup.nodes.Node)v9).setParentNode(((org.jsoup.nodes.Node)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "htm]";
    Object v8 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v7));
    Object v9 = "RightTrianglueBar";
    Object v10 = new org.jsoup.nodes.Attributes();
    Object v11 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v8),((java.lang.String)v9),((org.jsoup.nodes.Attributes)v10));
    Object v12 = "h1";
    Object v13 = "u";
    Object v14 = ((org.jsoup.nodes.Node)v11).attr(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "command";
    Object v16 = ((org.jsoup.nodes.Node)v11).removeAttr(((java.lang.String)v15));
    ((org.jsoup.nodes.Node)v6).removeChild(((org.jsoup.nodes.Node)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    Object v8 = ((org.jsoup.nodes.Node)v7).clone();
    Object v9 = "hea%";
    ((org.jsoup.nodes.Node)v8).setBaseUri(((java.lang.String)v9));
    Object v10 = null;
    Object v11 = "htm]";
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v11));
    Object v13 = "RightTrianglueBar";
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v12),((java.lang.String)v13),((org.jsoup.nodes.Attributes)v14));
    Object v16 = "ncp";
    Object v17 = ((org.jsoup.nodes.Node)v15).removeAttr(((java.lang.String)v16));
    Object v18 = ((org.jsoup.nodes.Node)v17).childNodes();
    Object v19 = ((org.jsoup.nodes.Node)v8).equals(((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = "htm]";
    Object v9 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v8));
    Object v10 = "RightTrianglueBar";
    Object v11 = new org.jsoup.nodes.Attributes();
    Object v12 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v9),((java.lang.String)v10),((org.jsoup.nodes.Attributes)v11));
    Object v13 = "ncp";
    Object v14 = ((org.jsoup.nodes.Node)v12).removeAttr(((java.lang.String)v13));
    Object v15 = ":matches";
    Object v16 = ((org.jsoup.nodes.Node)v14).absUrl(((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Node)v6).doClone(((org.jsoup.nodes.Node)v14));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = 1;
    Object v8 = new java.lang.StringBuilder((((java.lang.Integer)v7).intValue()));
    Object v9 = 1;
    Object v10 = new java.lang.StringBuilder((((java.lang.Integer)v9).intValue()));
    Object v11 = new java.lang.StringBuffer(((java.lang.CharSequence)v10));
    Object v12 = ((java.lang.StringBuilder)v8).append(((java.lang.StringBuffer)v11));
    Object v13 = -12;
    Object v14 = new org.jsoup.nodes.Document.OutputSettings();
    Object v15 = ((org.jsoup.nodes.Document.OutputSettings)v14).clone();
    ((org.jsoup.nodes.Node)v6).outerHtmlHead(((java.lang.StringBuilder)v8),(((java.lang.Integer)v13).intValue()),((org.jsoup.nodes.Document.OutputSettings)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = "fr7ameset";
    Object v8 = ((org.jsoup.nodes.Node)v6).absUrl(((java.lang.String)v7));
    org.junit.Assert.assertEquals((Object)(""), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "h1";
    Object v6 = "u";
    Object v7 = ((org.jsoup.nodes.Node)v4).attr(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = "command";
    Object v9 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).outerHtml();
    Object v11 = -4;
    Object v12 = new org.jsoup.nodes.Node[]{};
    ((org.jsoup.nodes.Node)v9).addChildren((((java.lang.Integer)v11).intValue()),((org.jsoup.nodes.Node[])v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "htm]";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "RightTrianglueBar";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = "ncp";
    Object v11 = ((org.jsoup.nodes.Node)v9).removeAttr(((java.lang.String)v10));
    Object v12 = "iframe";
    Object v13 = ((org.jsoup.nodes.Node)v11).hasAttr(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "htm]";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "RightTrianglueBar";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.Element(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "ncp";
    Object v6 = ((org.jsoup.nodes.Node)v4).removeAttr(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clone();
    Object v8 = 1;
    Object v9 = new java.lang.StringBuilder((((java.lang.Integer)v8).intValue()));
    Object v10 = 51;
    Object v11 = new org.jsoup.nodes.Document.OutputSettings();
    Object v12 = 14;
    Object v13 = ((org.jsoup.nodes.Document.OutputSettings)v11).indentAmount((((java.lang.Integer)v12).intValue()));
    ((org.jsoup.nodes.Node)v7).outerHtmlTail(((java.lang.StringBuilder)v9),(((java.lang.Integer)v10).intValue()),((org.jsoup.nodes.Document.OutputSettings)v11));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }
}
