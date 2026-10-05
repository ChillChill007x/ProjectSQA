package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "";
    Object v3 = ((org.jsoup.nodes.Node)v1).attr(((java.lang.String)v2));
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).attributes();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).hasText();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).attributes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = org.jsoup.nodes.Element.preserveWhitespace(((org.jsoup.nodes.Node)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).siblingNodes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).hasParent();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "body";
    Object v5 = ((org.jsoup.nodes.Element)v3).select(((java.lang.String)v4));
    Object v6 = "scripDt";
    Object v7 = ((org.jsoup.nodes.Element)v3).hasClass(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).siblingNodes();
    Object v5 = "";
    Object v6 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).val();
    org.junit.Assert.assertEquals((Object)("D"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).clone();
    Object v5 = ((org.jsoup.nodes.Node)v3).siblingNodes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "[\"']";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementById(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v3).hasAttributes();
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = java.io.Writer.nullWriter();
    Object v8 = 0;
    Object v9 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v6).outerHtmlTail(((java.lang.Appendable)v7),(((java.lang.Integer)v8).intValue()),((org.jsoup.nodes.Document.OutputSettings)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    ((org.jsoup.nodes.Node)v3).remove();
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "tbo";
    Object v5 = "body";
    Object v6 = ((org.jsoup.nodes.Element)v3).getElementsByAttributeValueStarting(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    Object v8 = new org.jsoup.nodes.Document.OutputSettings();
    Object v9 = "";
    Object v10 = new org.jsoup.nodes.Document(((java.lang.String)v9));
    Object v11 = "D";
    Object v12 = ((org.jsoup.nodes.Element)v10).val(((java.lang.String)v11));
    Object v13 = org.jsoup.nodes.Element.preserveWhitespace(((org.jsoup.nodes.Node)v12));
    Object v14 = new org.jsoup.nodes.Document.OutputSettings();
    Object v15 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).hasParent();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).html();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "body";
    Object v11 = ((org.jsoup.nodes.Element)v9).val(((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsContainingOwnText(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = "D";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "body";
    Object v11 = ((org.jsoup.nodes.Element)v9).val(((java.lang.String)v10));
    Object v12 = "";
    Object v13 = new org.jsoup.nodes.Document(((java.lang.String)v12));
    Object v14 = "D";
    Object v15 = ((org.jsoup.nodes.Element)v13).val(((java.lang.String)v14));
    Object v16 = "[\"']";
    Object v17 = ((org.jsoup.nodes.Element)v15).getElementById(((java.lang.String)v16));
    Object v18 = ((org.jsoup.nodes.Element)v15).hasAttributes();
    Object v19 = ((org.jsoup.nodes.Node)v11).hasSameValue(((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).ownerDocument();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "tbo";
    Object v5 = "body";
    Object v6 = ((org.jsoup.nodes.Element)v3).getElementsByAttributeValueStarting(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.jsoup.nodes.Document.OutputSettings();
    Object v8 = new org.jsoup.nodes.Document.OutputSettings();
    Object v9 = "";
    Object v10 = new org.jsoup.nodes.Document(((java.lang.String)v9));
    Object v11 = "D";
    Object v12 = ((org.jsoup.nodes.Element)v10).val(((java.lang.String)v11));
    Object v13 = org.jsoup.nodes.Element.preserveWhitespace(((org.jsoup.nodes.Node)v12));
    Object v14 = new org.jsoup.nodes.Document.OutputSettings();
    Object v15 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v8),((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = ((org.jsoup.nodes.Element)v3).classNames(((java.util.Set)v15));
    Object v17 = "";
    Object v18 = new org.jsoup.nodes.Document(((java.lang.String)v17));
    Object v19 = "D";
    Object v20 = ((org.jsoup.nodes.Element)v18).val(((java.lang.String)v19));
    Object v21 = 0;
    Object v22 = new org.jsoup.nodes.Node[]{};
    Object v23 = ((org.jsoup.nodes.Element)v20).insertChildren((((java.lang.Integer)v21).intValue()),((org.jsoup.nodes.Node[])v22));
    Object v24 = ":root";
    Object v25 = "basefont";
    Object v26 = ((org.jsoup.nodes.Element)v23).attr(((java.lang.String)v24),((java.lang.String)v25));
    Object v27 = ((org.jsoup.nodes.Element)v16).appendTo(((org.jsoup.nodes.Element)v26));
    Object v28 = ((org.jsoup.nodes.Element)v16).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).previousElementSibling();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "body";
    Object v11 = ((org.jsoup.nodes.Element)v9).val(((java.lang.String)v10));
    Object v12 = "UTF&-8";
    Object v13 = ((org.jsoup.nodes.Element)v11).hasClass(((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new org.jsoup.nodes.Document(((java.lang.String)v4));
    Object v6 = "D";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = 0;
    Object v9 = new org.jsoup.nodes.Node[]{};
    Object v10 = ((org.jsoup.nodes.Element)v7).insertChildren((((java.lang.Integer)v8).intValue()),((org.jsoup.nodes.Node[])v9));
    Object v11 = ":root";
    Object v12 = "basefont";
    Object v13 = ((org.jsoup.nodes.Element)v10).attr(((java.lang.String)v11),((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsContainingOwnText(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = "D";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).hasText();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).childNodes();
    Object v11 = ((org.jsoup.nodes.Element)v9).nextElementSibling();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsContainingOwnText(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = "D";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "t\"d";
    Object v12 = ((org.jsoup.nodes.Node)v10).removeAttr(((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).hasText();
    Object v11 = ((org.jsoup.nodes.Element)v9).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "y";
    Object v11 = ((org.jsoup.nodes.Element)v9).getElementById(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v9).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).empty();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsContainingOwnText(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = "D";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).ensureChildNodes();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).previousSibling();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodes();
    Object v5 = ((org.jsoup.nodes.Node)v3).root();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).clearAttributes();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsContainingOwnText(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = "D";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "t\"d";
    Object v12 = ((org.jsoup.nodes.Node)v10).removeAttr(((java.lang.String)v11));
    Object v13 = "";
    Object v14 = new org.jsoup.nodes.Document(((java.lang.String)v13));
    Object v15 = "D";
    Object v16 = ((org.jsoup.nodes.Element)v14).val(((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Element)v12).doClone(((org.jsoup.nodes.Node)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).empty();
    Object v5 = ((org.jsoup.nodes.Node)v4).previousSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).empty();
    Object v5 = ((org.jsoup.nodes.Element)v4).text();
    Object v6 = ((org.jsoup.nodes.Element)v4).data();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).ownerDocument();
    Object v11 = "head7";
    Object v12 = ((org.jsoup.nodes.Element)v10).wrap(((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsContainingOwnText(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = "D";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "t\"d";
    Object v12 = ((org.jsoup.nodes.Node)v10).removeAttr(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v12).siblingNodes();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).text();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsContainingOwnText(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = "D";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).childNodesCopy();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).ownerDocument();
    Object v11 = java.io.Writer.nullWriter();
    Object v12 = "";
    Object v13 = new org.jsoup.nodes.Document(((java.lang.String)v12));
    Object v14 = "";
    Object v15 = ((org.jsoup.nodes.Node)v13).attr(((java.lang.String)v14));
    Object v16 = ((java.lang.Appendable)v11).append(((java.lang.CharSequence)v15));
    Object v17 = ((org.jsoup.nodes.Element)v10).html(((java.lang.Appendable)v11));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).empty();
    Object v5 = ((org.jsoup.nodes.Element)v4).html();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = "v";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsContainingOwnText(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = "D";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = org.jsoup.nodes.Element.preserveWhitespace(((org.jsoup.nodes.Node)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsContainingOwnText(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = "D";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "t\"d";
    Object v12 = ((org.jsoup.nodes.Node)v10).removeAttr(((java.lang.String)v11));
    Object v13 = "";
    Object v14 = new org.jsoup.nodes.Document(((java.lang.String)v13));
    Object v15 = "D";
    Object v16 = ((org.jsoup.nodes.Element)v14).val(((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Element)v12).doClone(((org.jsoup.nodes.Node)v16));
    Object v18 = ((org.jsoup.nodes.Element)v17).nodeName();
    org.junit.Assert.assertEquals((Object)("#document"), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).previousSibling();
    Object v6 = ((org.jsoup.nodes.Element)v4).children();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "keyen";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsByTag(((java.lang.String)v4));
    Object v6 = "bgsound";
    Object v7 = false;
    Object v8 = ((org.jsoup.nodes.Element)v3).attr(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).cssSelector();
    org.junit.Assert.assertEquals((Object)("#root"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).clearAttributes();
    Object v11 = ((org.jsoup.nodes.Element)v10).cssSelector();
    org.junit.Assert.assertEquals((Object)("#root"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Element)v4).hasText();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "col";
    Object v5 = ((org.jsoup.nodes.Node)v3).attr(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsContainingOwnText(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = "D";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "t\"d";
    Object v12 = ((org.jsoup.nodes.Node)v10).removeAttr(((java.lang.String)v11));
    Object v13 = 16;
    Object v14 = new org.jsoup.nodes.Document.OutputSettings();
    Object v15 = new org.jsoup.nodes.Document.OutputSettings();
    Object v16 = "";
    Object v17 = new org.jsoup.nodes.Document(((java.lang.String)v16));
    Object v18 = "D";
    Object v19 = ((org.jsoup.nodes.Element)v17).val(((java.lang.String)v18));
    Object v20 = org.jsoup.nodes.Element.preserveWhitespace(((org.jsoup.nodes.Node)v19));
    Object v21 = new org.jsoup.nodes.Document.OutputSettings();
    Object v22 = java.util.Set.of(((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v20),((java.lang.Object)v21));
    Object v23 = ((org.jsoup.nodes.Element)v12).insertChildren((((java.lang.Integer)v13).intValue()),((java.util.Collection)v22));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = "tfoo";
    Object v6 = ((org.jsoup.nodes.Element)v4).getElementById(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodes();
    Object v5 = ((org.jsoup.nodes.Node)v3).root();
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v7).attributes();
    Object v9 = ((org.jsoup.nodes.Node)v5).hasSameValue(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).nextSibling();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).ownerDocument();
    Object v11 = "";
    Object v12 = new org.jsoup.nodes.Document(((java.lang.String)v11));
    Object v13 = "D";
    Object v14 = ((org.jsoup.nodes.Element)v12).val(((java.lang.String)v13));
    Object v15 = 0;
    Object v16 = new org.jsoup.nodes.Node[]{};
    Object v17 = ((org.jsoup.nodes.Element)v14).insertChildren((((java.lang.Integer)v15).intValue()),((org.jsoup.nodes.Node[])v16));
    Object v18 = ":root";
    Object v19 = "basefont";
    Object v20 = ((org.jsoup.nodes.Element)v17).attr(((java.lang.String)v18),((java.lang.String)v19));
    Object v21 = "body";
    Object v22 = ((org.jsoup.nodes.Element)v20).val(((java.lang.String)v21));
    Object v23 = ((org.jsoup.nodes.Node)v10).hasSameValue(((java.lang.Object)v22));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Element)v3).siblingElements();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).dataNodes();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).root();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsContainingOwnText(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = "D";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "t\"d";
    Object v12 = ((org.jsoup.nodes.Node)v10).removeAttr(((java.lang.String)v11));
    Object v13 = "";
    Object v14 = new org.jsoup.nodes.Document(((java.lang.String)v13));
    Object v15 = "D";
    Object v16 = ((org.jsoup.nodes.Element)v14).val(((java.lang.String)v15));
    Object v17 = ((org.jsoup.nodes.Element)v12).doClone(((org.jsoup.nodes.Node)v16));
    Object v18 = -22;
    Object v19 = 0;
    Object v20 = new org.jsoup.select.Evaluator.IsNthLastOfType((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = ((org.jsoup.nodes.Element)v17).is(((org.jsoup.select.Evaluator)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Element)v4).nextElementSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = "h";
    Object v6 = ((org.jsoup.nodes.Element)v4).getElementsMatchingText(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodes();
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = "D";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = new org.jsoup.nodes.Node[]{};
    Object v12 = ((org.jsoup.nodes.Element)v9).insertChildren((((java.lang.Integer)v10).intValue()),((org.jsoup.nodes.Node[])v11));
    Object v13 = ":root";
    Object v14 = "basefont";
    Object v15 = ((org.jsoup.nodes.Element)v12).attr(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Node)v15).ownerDocument();
    Object v17 = java.io.Writer.nullWriter();
    Object v18 = "";
    Object v19 = new org.jsoup.nodes.Document(((java.lang.String)v18));
    Object v20 = "";
    Object v21 = ((org.jsoup.nodes.Node)v19).attr(((java.lang.String)v20));
    Object v22 = ((java.lang.Appendable)v17).append(((java.lang.CharSequence)v21));
    Object v23 = ((org.jsoup.nodes.Element)v16).html(((java.lang.Appendable)v17));
    Object v24 = 0;
    Object v25 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v4).outerHtmlTail(((java.lang.Appendable)v23),(((java.lang.Integer)v24).intValue()),((org.jsoup.nodes.Document.OutputSettings)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "ScriptDataDoubleEscapedDash";
    Object v5 = ((org.jsoup.nodes.Element)v3).appendText(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "embed";
    Object v11 = ((org.jsoup.nodes.Element)v9).appendText(((java.lang.String)v10));
    Object v12 = "opion";
    Object v13 = ((org.jsoup.nodes.Element)v9).getElementById(((java.lang.String)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v9).siblingElements();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).ownerDocument();
    Object v11 = ((org.jsoup.nodes.Element)v10).hasAttributes();
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "ScriptDataDoubleEscapedDash";
    Object v5 = ((org.jsoup.nodes.Element)v3).appendText(((java.lang.String)v4));
    Object v6 = "th!";
    Object v7 = ((org.jsoup.nodes.Node)v5).absUrl(((java.lang.String)v6));
    org.junit.Assert.assertEquals((Object)(""), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodes();
    Object v5 = ((org.jsoup.nodes.Node)v3).root();
    Object v6 = "html";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependText(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).ownerDocument();
    Object v11 = 0;
    Object v12 = new org.jsoup.nodes.Node[]{null,null};
    Object v13 = ((org.jsoup.nodes.Element)v10).insertChildren((((java.lang.Integer)v11).intValue()),((org.jsoup.nodes.Node[])v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = "q";
    ((org.jsoup.nodes.Element)v9).doSetBaseUri(((java.lang.String)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).outerHtml();
    Object v6 = "taOble";
    Object v7 = ((org.jsoup.nodes.Element)v4).html(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "keyen";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsByTag(((java.lang.String)v4));
    Object v6 = "bgsound";
    Object v7 = false;
    Object v8 = ((org.jsoup.nodes.Element)v3).attr(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.jsoup.nodes.Node)v8).previousSibling();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "title";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsContainingOwnText(((java.lang.String)v4));
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = "D";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Element)v3).doClone(((org.jsoup.nodes.Node)v9));
    Object v11 = "?html";
    Object v12 = ((org.jsoup.nodes.Element)v10).is(((java.lang.String)v11));
      org.junit.Assert.fail("Expected org.jsoup.select.Selector$SelectorParseException");
    } catch (org.jsoup.select.Selector.SelectorParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = 45;
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = "D";
    Object v9 = ((org.jsoup.nodes.Element)v7).val(((java.lang.String)v8));
    Object v10 = 0;
    Object v11 = new org.jsoup.nodes.Node[]{};
    Object v12 = ((org.jsoup.nodes.Element)v9).insertChildren((((java.lang.Integer)v10).intValue()),((org.jsoup.nodes.Node[])v11));
    Object v13 = ":root";
    Object v14 = "basefont";
    Object v15 = ((org.jsoup.nodes.Element)v12).attr(((java.lang.String)v13),((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Element)v15).siblingElements();
    Object v17 = ((org.jsoup.nodes.Element)v4).insertChildren((((java.lang.Integer)v5).intValue()),((java.util.Collection)v16));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "ScriptDataDoubleEscapedDash";
    Object v5 = ((org.jsoup.nodes.Element)v3).appendText(((java.lang.String)v4));
    Object v6 = " ";
    Object v7 = ((org.jsoup.nodes.Element)v5).prepend(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = "v";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = java.io.Writer.nullWriter();
    Object v8 = ((org.jsoup.nodes.Element)v6).html(((java.lang.Appendable)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).previousSibling();
    Object v8 = ((org.jsoup.nodes.Node)v6).previousSibling();
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = ((org.jsoup.nodes.Node)v3).ownerDocument();
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "ScriptDataDoubleEscapedDash";
    Object v5 = ((org.jsoup.nodes.Element)v3).appendText(((java.lang.String)v4));
    Object v6 = "em";
    Object v7 = ((org.jsoup.nodes.Element)v5).prependElement(((java.lang.String)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = new org.jsoup.nodes.Document(((java.lang.String)v4));
    Object v6 = "D";
    Object v7 = ((org.jsoup.nodes.Element)v5).val(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = ((org.jsoup.nodes.Node)v3).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).clearAttributes();
    Object v11 = "";
    Object v12 = ((org.jsoup.nodes.Element)v10).after(((java.lang.String)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = "li";
    Object v7 = "7";
    Object v8 = ((org.jsoup.nodes.Element)v5).getElementsByAttributeValueStarting(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = java.io.Writer.nullWriter();
    Object v10 = 1;
    Object v11 = new org.jsoup.nodes.Document.OutputSettings();
    ((org.jsoup.nodes.Element)v5).outerHtmlTail(((java.lang.Appendable)v9),(((java.lang.Integer)v10).intValue()),((org.jsoup.nodes.Document.OutputSettings)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "ScriptDataDoubleEscapedDash";
    Object v5 = ((org.jsoup.nodes.Element)v3).appendText(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).childNodesCopy();
    Object v7 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).clearAttributes();
    Object v7 = ((org.jsoup.nodes.Element)v6).isBlock();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = 0;
    Object v5 = new org.jsoup.nodes.Node[]{};
    Object v6 = ((org.jsoup.nodes.Element)v3).insertChildren((((java.lang.Integer)v4).intValue()),((org.jsoup.nodes.Node[])v5));
    Object v7 = ":root";
    Object v8 = "basefont";
    Object v9 = ((org.jsoup.nodes.Element)v6).attr(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.Node)v9).root();
    Object v11 = "";
    Object v12 = new org.jsoup.nodes.Document(((java.lang.String)v11));
    Object v13 = "D";
    Object v14 = ((org.jsoup.nodes.Element)v12).val(((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Element)v10).doClone(((org.jsoup.nodes.Node)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = "D";
    Object v3 = ((org.jsoup.nodes.Element)v1).val(((java.lang.String)v2));
    Object v4 = "keyen";
    Object v5 = ((org.jsoup.nodes.Element)v3).getElementsByTag(((java.lang.String)v4));
    Object v6 = "bgsound";
    Object v7 = false;
    Object v8 = ((org.jsoup.nodes.Element)v3).attr(((java.lang.String)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.jsoup.nodes.Node)v8).childNodesCopy();
    org.junit.Assert.assertNotNull(v9);
  }
}
