package org.jsoup.nodes;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).childNodesCopy();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).siblingNodes();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Element)v2).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Element)v2).val();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).outerHtml();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).childNodes();
    Object v4 = ((org.jsoup.nodes.Node)v2).nextSibling();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "b dy";
    Object v4 = ((org.jsoup.nodes.Element)v2).getElementById(((java.lang.String)v3));
    Object v5 = 15;
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).siblingNodes();
    Object v9 = ((org.jsoup.nodes.Element)v2).insertChildren((((java.lang.Integer)v5).intValue()),((java.util.Collection)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Element)v2).textNodes();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = 0;
    Object v4 = ((org.jsoup.nodes.Node)v2).childNode((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "T";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v3).lastElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Element)v3).val();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "tfoo";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = "html";
    Object v6 = new org.jsoup.nodes.Attributes();
    Object v7 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v4),((java.lang.String)v5),((org.jsoup.nodes.Attributes)v6));
    Object v8 = ((org.jsoup.nodes.FormElement)v7).submit();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "tfoo";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = "html";
    Object v6 = new org.jsoup.nodes.Attributes();
    Object v7 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v4),((java.lang.String)v5),((org.jsoup.nodes.Attributes)v6));
    Object v8 = ((org.jsoup.nodes.FormElement)v7).formData();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Element)v3).textNodes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Element)v3).hasText();
    Object v5 = ((org.jsoup.nodes.Element)v3).textNodes();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = "A";
    Object v5 = ((org.jsoup.nodes.Node)v3).attr(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = "tfoo";
    Object v1 = true;
    Object v2 = true;
    Object v3 = new org.jsoup.parser.ParseSettings((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v4 = org.jsoup.parser.Tag.valueOf(((java.lang.String)v0),((org.jsoup.parser.ParseSettings)v3));
    Object v5 = "html";
    Object v6 = new org.jsoup.nodes.Attributes();
    Object v7 = new org.jsoup.nodes.FormElement(((org.jsoup.parser.Tag)v4),((java.lang.String)v5),((org.jsoup.nodes.Attributes)v6));
    Object v8 = "strong";
    Object v9 = ((org.jsoup.nodes.Element)v7).getElementsContainingOwnText(((java.lang.String)v8));
    Object v10 = ((org.jsoup.nodes.FormElement)v7).submit();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = "boy";
    Object v6 = ((org.jsoup.nodes.Element)v4).hasClass(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = ((org.jsoup.nodes.Element)v4).data();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).previousSibling();
    Object v5 = "$";
    Object v6 = ((org.jsoup.nodes.Element)v3).getElementsMatchingOwnText(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).siblingNodes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = ((org.jsoup.nodes.Node)v4).outerHtml();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "";
    Object v5 = new org.jsoup.nodes.Document(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Node)v6).root();
    Object v8 = ((org.jsoup.nodes.Element)v3).appendTo(((org.jsoup.nodes.Element)v7));
    Object v9 = ((org.jsoup.nodes.Element)v3).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Element)v3).siblingElements();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = ((org.jsoup.nodes.Element)v4).hasText();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Element)v3).baseUri();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.Document(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodesCopy();
    Object v6 = new java.util.HashSet(((java.util.Collection)v5));
    Object v7 = "";
    Object v8 = new org.jsoup.nodes.Document(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).siblingNodes();
    Object v10 = ((java.util.Set)v6).removeAll(((java.util.Collection)v9));
    Object v11 = ((org.jsoup.nodes.Element)v2).classNames(((java.util.Set)v6));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = ((org.jsoup.nodes.Node)v4).nextSibling();
    Object v6 = ((org.jsoup.nodes.Node)v4).outerHtml();
    org.junit.Assert.assertEquals((Object)(""), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = ((org.jsoup.nodes.Element)v4).html();
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = "htm1";
    Object v6 = "";
    Object v7 = java.util.regex.Pattern.compile(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Element)v4).getElementsByAttributeValueMatching(((java.lang.String)v5),((java.util.regex.Pattern)v7));
    Object v9 = ((org.jsoup.nodes.Element)v4).childNodeSize();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = "hS";
    Object v5 = ((org.jsoup.nodes.Element)v3).val(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Element)v2).children();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).hasParent();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Element)v3).cssSelector();
    org.junit.Assert.assertEquals((Object)("#root"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Element)v3).elementSiblingIndex();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "UTF-8";
    Object v4 = ((org.jsoup.nodes.Element)v2).wrap(((java.lang.String)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = ((org.jsoup.nodes.Element)v4).parent();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = "";
    Object v6 = new org.jsoup.nodes.Document(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Node)v7).ownerDocument();
    Object v9 = ((org.jsoup.nodes.Element)v8).baseUri();
    Object v10 = ((org.jsoup.nodes.Node)v4).hasSameValue(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).before(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Element)v1).val();
    org.junit.Assert.assertEquals((Object)(""), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Element)v2).getAllElements();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = ((org.jsoup.nodes.Element)v4).nextElementSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = ":first-child";
    Object v6 = ((org.jsoup.nodes.Element)v4).appendText(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).childNodesCopy();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).previousSibling();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = 23;
    Object v6 = new org.jsoup.nodes.Node[]{null,null,null};
    Object v7 = ((org.jsoup.nodes.Element)v4).insertChildren((((java.lang.Integer)v5).intValue()),((org.jsoup.nodes.Node[])v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = "";
    Object v6 = new org.jsoup.nodes.Document(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Element)v7).children();
    Object v9 = ((org.jsoup.nodes.Node)v4).hasSameValue(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Element)v3).hasText();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "li";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).childNodesCopy();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = "-";
    Object v6 = ((org.jsoup.nodes.Element)v4).getElementById(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "li";
    Object v4 = ((org.jsoup.nodes.Element)v2).val(((java.lang.String)v3));
    Object v5 = "";
    Object v6 = java.util.regex.Pattern.compile(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v4).hasSameValue(((java.lang.Object)v6));
    Object v8 = 44;
    Object v9 = "";
    Object v10 = new org.jsoup.nodes.Document(((java.lang.String)v9));
    Object v11 = ((org.jsoup.nodes.Node)v10).ownerDocument();
    Object v12 = ((org.jsoup.nodes.Element)v11).children();
    Object v13 = ((org.jsoup.nodes.Element)v4).insertChildren((((java.lang.Integer)v8).intValue()),((java.util.Collection)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = "n";
    Object v5 = ((org.jsoup.nodes.Element)v3).toggleClass(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Element)v2).cssSelector();
    org.junit.Assert.assertEquals((Object)("#root"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.Document(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodesCopy();
    Object v6 = new java.util.HashSet(((java.util.Collection)v5));
    Object v7 = "";
    Object v8 = new org.jsoup.nodes.Document(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).siblingNodes();
    Object v10 = ((java.util.Set)v6).removeAll(((java.util.Collection)v9));
    Object v11 = ((org.jsoup.nodes.Element)v2).classNames(((java.util.Set)v6));
    Object v12 = ((org.jsoup.nodes.Node)v11).nextSibling();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = "tbody";
    Object v6 = ((org.jsoup.nodes.Node)v4).hasAttr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = "p";
    Object v6 = ((org.jsoup.nodes.Element)v4).tagName(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "able";
    Object v4 = ((org.jsoup.nodes.Node)v2).attr(((java.lang.String)v3));
    Object v5 = "codIe";
    Object v6 = ((org.jsoup.nodes.Node)v2).hasAttr(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = ((org.jsoup.nodes.Node)v4).outerHtml();
    Object v6 = ((org.jsoup.nodes.Node)v4).nextSibling();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "tfoot";
    Object v4 = ((org.jsoup.nodes.Element)v2).appendText(((java.lang.String)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Element)v2).html();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Element)v3).dataNodes();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = 0;
    Object v6 = "";
    Object v7 = new org.jsoup.nodes.Document(((java.lang.String)v6));
    Object v8 = ((org.jsoup.nodes.Node)v7).childNodesCopy();
    Object v9 = new java.util.HashSet(((java.util.Collection)v8));
    Object v10 = ((org.jsoup.nodes.Element)v4).insertChildren((((java.lang.Integer)v5).intValue()),((java.util.Collection)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Element)v2).previousElementSibling();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Node)v3).removeAttr(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v5).dataNodes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "inpult";
    Object v5 = ((org.jsoup.nodes.Node)v3).hasAttr(((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Node)v3).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = "";
    Object v6 = java.util.regex.Pattern.compile(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).getElementsMatchingOwnText(((java.util.regex.Pattern)v6));
    Object v8 = "di";
    Object v9 = ((org.jsoup.nodes.Element)v4).getElementById(((java.lang.String)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "htm";
    Object v5 = ((org.jsoup.nodes.Node)v3).absUrl(((java.lang.String)v4));
    org.junit.Assert.assertEquals((Object)(""), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = "htrl";
    Object v6 = ((org.jsoup.nodes.Element)v4).tagName(((java.lang.String)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.Document(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodesCopy();
    Object v6 = new java.util.HashSet(((java.util.Collection)v5));
    Object v7 = "";
    Object v8 = new org.jsoup.nodes.Document(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).siblingNodes();
    Object v10 = ((java.util.Set)v6).removeAll(((java.util.Collection)v9));
    Object v11 = ((org.jsoup.nodes.Element)v2).classNames(((java.util.Set)v6));
    Object v12 = ((org.jsoup.nodes.Element)v11).previousElementSibling();
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = "htrl";
    Object v6 = ((org.jsoup.nodes.Element)v4).tagName(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = new org.jsoup.nodes.Document(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).ownerDocument();
    Object v10 = ((org.jsoup.nodes.Node)v9).root();
    Object v11 = ((org.jsoup.nodes.Node)v10).root();
    Object v12 = ((org.jsoup.nodes.Node)v6).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "html";
    Object v5 = ((org.jsoup.nodes.Element)v3).text(((java.lang.String)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = "";
    Object v5 = ((org.jsoup.nodes.Element)v3).prepend(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.Document(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).ownerDocument();
    Object v7 = ((org.jsoup.nodes.Element)v6).textNodes();
    Object v8 = ((org.jsoup.nodes.Node)v2).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "form";
    Object v4 = ((org.jsoup.nodes.Element)v2).append(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Element)v2).childNodeSize();
    org.junit.Assert.assertEquals((Object)(1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = ((org.jsoup.nodes.Element)v4).previousElementSibling();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = "htrl";
    Object v6 = ((org.jsoup.nodes.Element)v4).tagName(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v6).firstElementSibling();
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = "noframes";
    Object v6 = ((org.jsoup.nodes.Element)v4).hasClass(((java.lang.String)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = "r";
    Object v6 = ((org.jsoup.nodes.Element)v4).getElementById(((java.lang.String)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Element)v2).data();
    org.junit.Assert.assertEquals((Object)(""), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Element)v3).html();
    org.junit.Assert.assertEquals((Object)(""), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "br";
    Object v4 = "u";
    Object v5 = ((org.jsoup.nodes.Element)v2).getElementsByAttributeValueEnding(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jsoup.nodes.Element)v2).hasText();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "tfoot";
    Object v4 = ((org.jsoup.nodes.Element)v2).appendText(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "tfoot";
    Object v4 = ((org.jsoup.nodes.Element)v2).appendText(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).ownerDocument();
    Object v6 = ((org.jsoup.nodes.Node)v5).unwrap();
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "";
    Object v4 = new org.jsoup.nodes.Document(((java.lang.String)v3));
    Object v5 = ((org.jsoup.nodes.Node)v4).childNodesCopy();
    Object v6 = new java.util.HashSet(((java.util.Collection)v5));
    Object v7 = "";
    Object v8 = new org.jsoup.nodes.Document(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).siblingNodes();
    Object v10 = ((java.util.Set)v6).removeAll(((java.util.Collection)v9));
    Object v11 = ((org.jsoup.nodes.Element)v2).classNames(((java.util.Set)v6));
    Object v12 = "title";
    Object v13 = "ead";
    Object v14 = ((org.jsoup.nodes.Element)v11).getElementsByAttributeValueContaining(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = "trQ";
    Object v16 = ((org.jsoup.nodes.Element)v11).toggleClass(((java.lang.String)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = ((org.jsoup.nodes.Element)v4).siblingElements();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = "c";
    Object v5 = ((org.jsoup.nodes.Element)v3).appendElement(((java.lang.String)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = "tfoot";
    Object v4 = ((org.jsoup.nodes.Element)v2).appendText(((java.lang.String)v3));
    Object v5 = "l\\ink";
    Object v6 = ((org.jsoup.nodes.Element)v4).select(((java.lang.String)v5));
      org.junit.Assert.fail("Expected org.jsoup.select.Selector$SelectorParseException");
    } catch (org.jsoup.select.Selector.SelectorParseException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = ((org.jsoup.nodes.Node)v4).clone();
    Object v6 = ((org.jsoup.nodes.Node)v4).siblingNodes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).ownerDocument();
    Object v4 = ((org.jsoup.nodes.Node)v3).clearAttributes();
    Object v5 = "tbody";
    Object v6 = ((org.jsoup.nodes.Element)v4).removeClass(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Element)v4).nodeName();
    org.junit.Assert.assertEquals((Object)("#document"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = "";
    Object v6 = new org.jsoup.nodes.Document(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).ownerDocument();
    Object v8 = ((org.jsoup.nodes.Node)v7).root();
    Object v9 = ((org.jsoup.nodes.Node)v8).root();
    Object v10 = "boy";
    Object v11 = ((org.jsoup.nodes.Element)v9).hasClass(((java.lang.String)v10));
    Object v12 = ((org.jsoup.nodes.Node)v4).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = "htrl";
    Object v6 = ((org.jsoup.nodes.Element)v4).tagName(((java.lang.String)v5));
    Object v7 = ((org.jsoup.nodes.Node)v6).clearAttributes();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "";
    Object v1 = new org.jsoup.nodes.Document(((java.lang.String)v0));
    Object v2 = ((org.jsoup.nodes.Node)v1).ownerDocument();
    Object v3 = ((org.jsoup.nodes.Node)v2).root();
    Object v4 = ((org.jsoup.nodes.Node)v3).root();
    Object v5 = "htrl";
    Object v6 = ((org.jsoup.nodes.Element)v4).tagName(((java.lang.String)v5));
    Object v7 = "";
    Object v8 = new org.jsoup.nodes.Document(((java.lang.String)v7));
    Object v9 = ((org.jsoup.nodes.Node)v8).childNodesCopy();
    Object v10 = new java.util.HashSet(((java.util.Collection)v9));
    Object v11 = ((org.jsoup.nodes.Element)v6).classNames(((java.util.Set)v10));
    org.junit.Assert.assertNotNull(v11);
  }
}
