package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.FormElement)v4).submit();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).html();
    Object v6 = ((org.jsoup.nodes.FormElement)v4).formData();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).siblingNodes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.FormElement)v4).formData();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodesCopy();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(-484391025), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = ((org.jsoup.nodes.Element)v4).val();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).ownerDocument();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = "tr";
    Object v8 = ((org.jsoup.nodes.Node)v6).hasAttr(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v6).nextSibling();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).dataNodes();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = -32;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexEquals((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).textNodes();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).id();
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "gsound";
    Object v10 = ((org.jsoup.nodes.Element)v8).toggleClass(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ">";
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementById(((java.lang.String)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.FormElement)v8).formData();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).elementSiblingIndex();
    Object v10 = ((org.jsoup.nodes.Element)v8).data();
    org.junit.Assert.assertEquals((Object)(""), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "gsound";
    Object v10 = ((org.jsoup.nodes.Element)v8).toggleClass(((java.lang.String)v9));
    Object v11 = "Content-E";
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v11));
    Object v13 = "button";
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v12),((java.lang.String)v13),((org.jsoup.nodes.Attributes)v14));
    Object v16 = "nohrem";
    Object v17 = ((org.jsoup.nodes.Element)v15).toggleClass(((java.lang.String)v16));
    Object v18 = " ";
    Object v19 = ((org.jsoup.nodes.Element)v17).appendText(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Element)v10).appendChild(((org.jsoup.nodes.Node)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "b";
    Object v10 = "eve";
    Object v11 = ((org.jsoup.nodes.Element)v8).getElementsByAttributeValueContaining(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Element)v8).data();
    org.junit.Assert.assertEquals((Object)(""), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).dataNodes();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "head";
    Object v12 = ((org.jsoup.nodes.Element)v10).val(((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "head";
    Object v12 = ((org.jsoup.nodes.Element)v10).val(((java.lang.String)v11));
    Object v13 = "Content-E";
    Object v14 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v13));
    Object v15 = "button";
    Object v16 = new org.jsoup.nodes.Attributes();
    Object v17 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v14),((java.lang.String)v15),((org.jsoup.nodes.Attributes)v16));
    Object v18 = "nohrem";
    Object v19 = ((org.jsoup.nodes.Element)v17).toggleClass(((java.lang.String)v18));
    Object v20 = " ";
    Object v21 = ((org.jsoup.nodes.Element)v19).appendText(((java.lang.String)v20));
    Object v22 = "gsound";
    Object v23 = ((org.jsoup.nodes.Element)v21).toggleClass(((java.lang.String)v22));
    ((org.jsoup.nodes.Node)v12).replaceWith(((org.jsoup.nodes.Node)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "strike";
    Object v10 = ((org.jsoup.nodes.Element)v8).html(((java.lang.String)v9));
    Object v11 = "bgsound";
    Object v12 = ((org.jsoup.nodes.Element)v8).hasClass(((java.lang.String)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).previousSibling();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "h`ml";
    Object v12 = ((org.jsoup.nodes.Element)v10).getElementsMatchingText(((java.lang.String)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).hashCode();
    Object v10 = "";
    Object v11 = ((org.jsoup.nodes.Node)v8).hasAttr(((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "head";
    Object v12 = ((org.jsoup.nodes.Element)v10).val(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).isBlock();
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).hashCode();
    org.junit.Assert.assertEquals((Object)(84375467), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = 65553;
    Object v10 = "Content-E";
    Object v11 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v10));
    Object v12 = "button";
    Object v13 = new org.jsoup.nodes.Attributes();
    Object v14 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v11),((java.lang.String)v12),((org.jsoup.nodes.Attributes)v13));
    Object v15 = ((org.jsoup.nodes.Node)v14).childNodes();
    Object v16 = ((org.jsoup.nodes.Element)v8).insertChildren((((java.lang.Integer)v9).intValue()),((java.util.Collection)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.FormElement)v8).submit();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "gsound";
    Object v10 = ((org.jsoup.nodes.Element)v8).toggleClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = new java.util.HashSet();
    Object v12 = ((org.jsoup.nodes.Element)v10).classNames(((java.util.Set)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "head";
    Object v12 = ((org.jsoup.nodes.Element)v10).val(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).siblingElements();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "head";
    Object v12 = ((org.jsoup.nodes.Element)v10).val(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "head";
    Object v12 = ((org.jsoup.nodes.Element)v10).val(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).cssSelector();
    org.junit.Assert.assertEquals((Object)("content-e.nohrem"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "head";
    Object v12 = ((org.jsoup.nodes.Element)v10).val(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v12).childNodesCopy();
    Object v14 = ((org.jsoup.nodes.Element)v12).textNodes();
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "gsound";
    Object v10 = ((org.jsoup.nodes.Element)v8).toggleClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).previousSibling();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).hashCode();
    Object v10 = "html";
    Object v11 = ((org.jsoup.nodes.Element)v8).getElementById(((java.lang.String)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "head";
    Object v12 = ((org.jsoup.nodes.Element)v10).val(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).id();
    org.junit.Assert.assertEquals((Object)(""), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "thHead";
    Object v10 = ((org.jsoup.nodes.Element)v8).select(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "d]t";
    Object v12 = java.util.regex.Pattern.compile(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v10).getElementsMatchingText(((java.util.regex.Pattern)v12));
    Object v14 = ((org.jsoup.nodes.Element)v10).hasText();
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = -13;
    Object v12 = "Content-E";
    Object v13 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v12));
    Object v14 = "button";
    Object v15 = new org.jsoup.nodes.Attributes();
    Object v16 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v13),((java.lang.String)v14),((org.jsoup.nodes.Attributes)v15));
    Object v17 = ((org.jsoup.nodes.Node)v16).siblingNodes();
    Object v18 = ((org.jsoup.nodes.Element)v10).insertChildren((((java.lang.Integer)v11).intValue()),((java.util.Collection)v17));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "head";
    Object v12 = ((org.jsoup.nodes.Element)v10).val(((java.lang.String)v11));
    Object v13 = "co\\l";
    Object v14 = ((org.jsoup.nodes.Element)v12).getElementsByTag(((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Element)v12).nextElementSibling();
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).cssSelector();
    org.junit.Assert.assertEquals((Object)("content-e.nohrem"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = new java.util.HashSet();
    Object v12 = ((org.jsoup.nodes.Element)v10).classNames(((java.util.Set)v11));
    Object v13 = "thead";
    Object v14 = ((org.jsoup.nodes.Node)v12).absUrl(((java.lang.String)v13));
    org.junit.Assert.assertEquals((Object)(""), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).children();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).nextSibling();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).data();
    org.junit.Assert.assertEquals((Object)(""), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "Yh5";
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByAttributeStarting(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).hasText();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "gsound";
    Object v10 = ((org.jsoup.nodes.Element)v8).toggleClass(((java.lang.String)v9));
    Object v11 = "Content-E";
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v11));
    Object v13 = "button";
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v12),((java.lang.String)v13),((org.jsoup.nodes.Attributes)v14));
    Object v16 = "nohrem";
    Object v17 = ((org.jsoup.nodes.Element)v15).toggleClass(((java.lang.String)v16));
    Object v18 = " ";
    Object v19 = ((org.jsoup.nodes.Element)v17).appendText(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Element)v10).appendChild(((org.jsoup.nodes.Node)v19));
    Object v21 = "Content-E";
    Object v22 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v21));
    Object v23 = "button";
    Object v24 = new org.jsoup.nodes.Attributes();
    Object v25 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v22),((java.lang.String)v23),((org.jsoup.nodes.Attributes)v24));
    Object v26 = "nohrem";
    Object v27 = ((org.jsoup.nodes.Element)v25).toggleClass(((java.lang.String)v26));
    Object v28 = " ";
    Object v29 = ((org.jsoup.nodes.Element)v27).appendText(((java.lang.String)v28));
    Object v30 = "html";
    Object v31 = ((org.jsoup.nodes.Element)v29).val(((java.lang.String)v30));
    Object v32 = "h`ml";
    Object v33 = ((org.jsoup.nodes.Element)v31).getElementsMatchingText(((java.lang.String)v32));
    Object v34 = ((org.jsoup.nodes.Node)v20).equals(((java.lang.Object)v33));
    Object v35 = ". Mimetyp\"e=";
    Object v36 = ((org.jsoup.nodes.Node)v20).attr(((java.lang.String)v35));
    org.junit.Assert.assertEquals((Object)(""), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "gsound";
    Object v10 = ((org.jsoup.nodes.Element)v8).toggleClass(((java.lang.String)v9));
    Object v11 = "Content-E";
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v11));
    Object v13 = "button";
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v12),((java.lang.String)v13),((org.jsoup.nodes.Attributes)v14));
    Object v16 = "nohrem";
    Object v17 = ((org.jsoup.nodes.Element)v15).toggleClass(((java.lang.String)v16));
    Object v18 = " ";
    Object v19 = ((org.jsoup.nodes.Element)v17).appendText(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Element)v10).appendChild(((org.jsoup.nodes.Node)v19));
    Object v21 = ((org.jsoup.nodes.Element)v20).val();
    org.junit.Assert.assertEquals((Object)(""), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).siblingElements();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = 0;
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsByIndexGreaterThan((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).html();
    org.junit.Assert.assertEquals((Object)(""), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "h6";
    Object v12 = ((org.jsoup.nodes.Node)v10).removeAttr(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Node)v10).outerHtml();
    org.junit.Assert.assertEquals((Object)("<content-e class=\"nohrem\" value=\"html\"> \n</content-e>"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).nextElementSibling();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "tdL";
    Object v12 = "L";
    Object v13 = ((org.jsoup.nodes.Element)v10).getElementsByAttributeValueMatching(((java.lang.String)v11),((java.lang.String)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = new java.util.HashSet();
    Object v12 = ((org.jsoup.nodes.Element)v10).classNames(((java.util.Set)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).ownText();
    org.junit.Assert.assertEquals((Object)(""), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "gsound";
    Object v10 = ((org.jsoup.nodes.Element)v8).toggleClass(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).outerHtml();
    Object v12 = "titlJe";
    Object v13 = ((org.jsoup.nodes.Node)v10).attr(((java.lang.String)v12));
    org.junit.Assert.assertEquals((Object)(""), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "colgroup";
    Object v10 = ((org.jsoup.nodes.Element)v8).prepend(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "gsound";
    Object v10 = ((org.jsoup.nodes.Element)v8).toggleClass(((java.lang.String)v9));
    Object v11 = "Content-E";
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v11));
    Object v13 = "button";
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v12),((java.lang.String)v13),((org.jsoup.nodes.Attributes)v14));
    Object v16 = "nohrem";
    Object v17 = ((org.jsoup.nodes.Element)v15).toggleClass(((java.lang.String)v16));
    Object v18 = " ";
    Object v19 = ((org.jsoup.nodes.Element)v17).appendText(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Element)v10).appendChild(((org.jsoup.nodes.Node)v19));
    Object v21 = ((org.jsoup.nodes.Node)v20).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "head";
    Object v12 = ((org.jsoup.nodes.Element)v10).val(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v12).html();
    org.junit.Assert.assertEquals((Object)(""), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "colgroup";
    Object v10 = ((org.jsoup.nodes.Element)v8).prepend(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).nextSibling();
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "t`";
    Object v10 = "";
    Object v11 = ((org.jsoup.nodes.Element)v8).getElementsByAttributeValueContaining(((java.lang.String)v9),((java.lang.String)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).children();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).childNodeSize();
    Object v12 = "captiona";
    Object v13 = "br";
    Object v14 = ((org.jsoup.nodes.Element)v10).getElementsByAttributeValue(((java.lang.String)v12),((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = 30;
    Object v10 = ((org.jsoup.nodes.Node)v8).childNode((((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).previousElementSibling();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "head";
    Object v12 = ((org.jsoup.nodes.Element)v10).val(((java.lang.String)v11));
    Object v13 = "oQ";
    Object v14 = "d]t";
    Object v15 = java.util.regex.Pattern.compile(((java.lang.String)v14));
    Object v16 = ((org.jsoup.nodes.Element)v12).getElementsByAttributeValueMatching(((java.lang.String)v13),((java.util.regex.Pattern)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).children();
    Object v10 = ((org.jsoup.nodes.Element)v8).previousElementSibling();
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "gsound";
    Object v10 = ((org.jsoup.nodes.Element)v8).toggleClass(((java.lang.String)v9));
    Object v11 = "Content-E";
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v11));
    Object v13 = "button";
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v12),((java.lang.String)v13),((org.jsoup.nodes.Attributes)v14));
    Object v16 = "nohrem";
    Object v17 = ((org.jsoup.nodes.Element)v15).toggleClass(((java.lang.String)v16));
    Object v18 = " ";
    Object v19 = ((org.jsoup.nodes.Element)v17).appendText(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Element)v10).appendChild(((org.jsoup.nodes.Node)v19));
    Object v21 = ((org.jsoup.nodes.Element)v20).previousElementSibling();
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = "<";
    Object v8 = ((org.jsoup.nodes.Node)v6).removeAttr(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v6).nextSibling();
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "Content-E";
    Object v10 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v9));
    Object v11 = "button";
    Object v12 = new org.jsoup.nodes.Attributes();
    Object v13 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v10),((java.lang.String)v11),((org.jsoup.nodes.Attributes)v12));
    Object v14 = "nohrem";
    Object v15 = ((org.jsoup.nodes.Element)v13).toggleClass(((java.lang.String)v14));
    Object v16 = " ";
    Object v17 = ((org.jsoup.nodes.Element)v15).appendText(((java.lang.String)v16));
    Object v18 = "gsound";
    Object v19 = ((org.jsoup.nodes.Element)v17).toggleClass(((java.lang.String)v18));
    Object v20 = "Content-E";
    Object v21 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v20));
    Object v22 = "button";
    Object v23 = new org.jsoup.nodes.Attributes();
    Object v24 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v21),((java.lang.String)v22),((org.jsoup.nodes.Attributes)v23));
    Object v25 = "nohrem";
    Object v26 = ((org.jsoup.nodes.Element)v24).toggleClass(((java.lang.String)v25));
    Object v27 = " ";
    Object v28 = ((org.jsoup.nodes.Element)v26).appendText(((java.lang.String)v27));
    Object v29 = ((org.jsoup.nodes.Element)v19).appendChild(((org.jsoup.nodes.Node)v28));
    Object v30 = ((org.jsoup.nodes.Node)v29).siblingNodes();
    Object v31 = ((org.jsoup.nodes.FormElement)v8).addElement(((org.jsoup.nodes.Element)v29));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "colgroup";
    Object v10 = ((org.jsoup.nodes.Element)v8).prepend(((java.lang.String)v9));
    Object v11 = 1;
    Object v12 = ((org.jsoup.nodes.Element)v10).getElementsByIndexGreaterThan((((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "br";
    Object v10 = ((org.jsoup.nodes.Element)v8).getElementsMatchingText(((java.lang.String)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "u";
    Object v10 = ((org.jsoup.nodes.Node)v8).hasAttr(((java.lang.String)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "Content-E";
    Object v6 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v5));
    Object v7 = "button";
    Object v8 = new org.jsoup.nodes.Attributes();
    Object v9 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v6),((java.lang.String)v7),((org.jsoup.nodes.Attributes)v8));
    Object v10 = "nohrem";
    Object v11 = ((org.jsoup.nodes.Element)v9).toggleClass(((java.lang.String)v10));
    Object v12 = " ";
    Object v13 = ((org.jsoup.nodes.Element)v11).appendText(((java.lang.String)v12));
    Object v14 = ((org.jsoup.nodes.Element)v4).appendChild(((org.jsoup.nodes.Node)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "colgroup";
    Object v10 = ((org.jsoup.nodes.Element)v8).prepend(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).dataNodes();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "colgroup";
    Object v10 = ((org.jsoup.nodes.Element)v8).prepend(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.FormElement)v10).elements();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Element)v8).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).classNames();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "colgroup";
    Object v10 = ((org.jsoup.nodes.Element)v8).prepend(((java.lang.String)v9));
    Object v11 = "?";
    Object v12 = ((org.jsoup.nodes.Element)v10).getElementsContainingOwnText(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.Element)v10).hashCode();
    org.junit.Assert.assertEquals((Object)(840890893), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "head";
    Object v12 = ((org.jsoup.nodes.Element)v10).val(((java.lang.String)v11));
    Object v13 = ((org.jsoup.nodes.FormElement)v12).formData();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).empty();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "head";
    Object v12 = ((org.jsoup.nodes.Element)v10).val(((java.lang.String)v11));
    Object v13 = "herd";
    Object v14 = ((org.jsoup.nodes.Element)v12).text(((java.lang.String)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Element)v10).empty();
    Object v12 = ((org.jsoup.nodes.Element)v11).previousElementSibling();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "head";
    Object v12 = ((org.jsoup.nodes.Element)v10).val(((java.lang.String)v11));
    Object v13 = "herd";
    Object v14 = ((org.jsoup.nodes.Element)v12).text(((java.lang.String)v13));
    Object v15 = ((org.jsoup.nodes.Node)v14).childNodesCopy();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "gsound";
    Object v10 = ((org.jsoup.nodes.Element)v8).toggleClass(((java.lang.String)v9));
    Object v11 = "Content-E";
    Object v12 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v11));
    Object v13 = "button";
    Object v14 = new org.jsoup.nodes.Attributes();
    Object v15 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v12),((java.lang.String)v13),((org.jsoup.nodes.Attributes)v14));
    Object v16 = "nohrem";
    Object v17 = ((org.jsoup.nodes.Element)v15).toggleClass(((java.lang.String)v16));
    Object v18 = " ";
    Object v19 = ((org.jsoup.nodes.Element)v17).appendText(((java.lang.String)v18));
    Object v20 = ((org.jsoup.nodes.Element)v10).appendChild(((org.jsoup.nodes.Node)v19));
    Object v21 = "</";
    Object v22 = ((org.jsoup.nodes.Element)v20).hasClass(((java.lang.String)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "Content-E";
    Object v1 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0));
    Object v2 = "button";
    Object v3 = new org.jsoup.nodes.Attributes();
    Object v4 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v1),((java.lang.String)v2),((org.jsoup.nodes.Attributes)v3));
    Object v5 = "nohrem";
    Object v6 = ((org.jsoup.nodes.Element)v4).toggleClass(((java.lang.String)v5));
    Object v7 = " ";
    Object v8 = ((org.jsoup.nodes.Element)v6).appendText(((java.lang.String)v7));
    Object v9 = "html";
    Object v10 = ((org.jsoup.nodes.Element)v8).val(((java.lang.String)v9));
    Object v11 = "head";
    Object v12 = ((org.jsoup.nodes.Element)v10).val(((java.lang.String)v11));
    Object v13 = "<!";
    Object v14 = ((org.jsoup.nodes.Element)v12).getElementsContainingOwnText(((java.lang.String)v13));
    Object v15 = "select";
    Object v16 = "tml";
    Object v17 = ((org.jsoup.nodes.Element)v12).getElementsByAttributeValueNot(((java.lang.String)v15),((java.lang.String)v16));
    org.junit.Assert.assertNotNull(v17);
  }
}
